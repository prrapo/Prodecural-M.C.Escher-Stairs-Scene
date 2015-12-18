image {
  resolution 1200 1200
  aa 1 2
  samples 4
  filter gaussian
}

camera {
  type pinhole
  eye 0.5 0.5 4
  target 0.5 0.5 0
  up 0 1 0
  fov 15
  aspect 1
}

/*camera {
  type pinhole
  eye 0.5 -4 1.0
  target 0.5 0.5 0
  up 0 0 1
  fov 2
  aspect 1
}*/

light {
  type directional
  source 0.5 0.5 10
  target 0.5 0.5 0
  radius 2
  emit { "sRGB nonlinear" 1 1 1 }
  intensity 5
}

shader {
  name diffuse_gray
  type diffuse
  diff 0.07 0.07 0.07
}

shader {
  name diffuse_green
  type diffuse
  diff 0.2 0.4 0.2
}

object {
	shader diffuse_green
	type plane
	p 0 0 0
	n 0 0 1
}

