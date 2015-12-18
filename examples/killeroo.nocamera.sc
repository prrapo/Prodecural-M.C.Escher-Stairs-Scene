image {
  resolution 320 240
  aa 1 1
  samples 4
  filter gaussian
}

trace-depths {
  diff 1
  refl 4
  refr 4
}


light {
  type meshlight 
  name arealight1
  emit { "sRGB nonlinear" 1.0 1.0 1.0 }
  radiance 7.5
  samples 4
  points 4
	-25 50 -25
	 25 50 -25
     25 50  25
	-25 50  25
  triangles 2
  0 1 2
  0 2 3
}

shader {
  name ground.shader
  type diffuse
  texture "grid.png"
}

shader {
  name cone1.shader
  type diffuse
  diff 0.8 0 0.2
}

shader {
  name cone2.shader
  type diffuse
  diff 0.1 0.8 0.1
}

shader {
  name glass.shader
  type glass
  eta 1.6
  color 1 1 1 
}

shader {
  name plastic.shader
  type phong
  diff 0.6 0.2 0.1
  spec 0.1 0.1 0.1 30
  samples 4
}

object {
  shader plastic.shader
  transform {
	rotatey -90
	scaleu 4
	translate 7 0 20
  }
  type file-mesh
  name killeroo
  filename killeroo.obj
  smooth_normals true
}

object {
  shader glass.shader
  type sphere
  name ball
  c -2 6 0
  r 6
}

object {
  shader cone1.shader
  transform {
	rotatez 25
    rotatex -90
	scaleu 0.05
	translate 5 0 -12
  }
  type teapot
  name teapot1.obj
  subdivs 8
  smooth true
}

object {
  shader cone2.shader
  transform {
	rotatez -25
    rotatex -90
	scaleu 0.06
	translate -16 0 12
  }
  type teapot
  name teapot2.obj
  subdivs 8
  smooth true
}

object {
  shader ground.shader
  type generic-mesh
  points 4
	-500 0 -500
	 500 0 -500
	 500 0  500
	-500 0  500
  triangles 2
	0 2 1
	0 3 2
  normals vertex
	0 1 0
	0 1 0
	0 1 0
	0 1 0
  uvs vertex
	0 0
	-20 0
	-20 20
	0 20
}

