
/* Sunflow Open Source Rendering System v0.07.3 Scene File */
/* Generated from blender v2.68 (sub 0) File: 'final.blend' */
/* http://sunflow.sourceforge.net/ */


 image {
         resolution 1024  768
         aa 0  1
         samples 8
         filter mitchell
         jitter False
         } 

 trace-depths {
         diff 1
         refl 2
         refr 2
         } 

 background {
         color {
                 "sRGB nonlinear" +0.0509  +0.0509  +0.0509
                 } 
         } 

 bucket 64 hilbert

 gi     {
         type path
         samples 4
         } 

 shader {
         name "Material.001"
         type diffuse
         diff  {
                 "sRGB nonlinear" +0.8000  +0.8000  +0.8000
                 } 
         } 

 shader {
         name "Material.003"
         type diffuse
         diff  {
                 "sRGB nonlinear" +0.8000  +0.8000  +0.8000
                 } 
         } 

 shader {
         name "Material.002"
         type diffuse
         diff  {
                 "sRGB nonlinear" +0.8000  +0.8000  +0.8000
                 } 
         } 

 shader {
         name "Material.005"
         type diffuse
         diff  {
                 "sRGB nonlinear" +0.8000  +0.8000  +0.8000
                 } 
         } 

 shader {
         name "Material.004"
         type diffuse
         diff  {
                 "sRGB nonlinear" +0.8000  +0.8000  +0.8000
                 } 
         } 

 shader {
         name "Material"
         type phong
         diff   {
                 "sRGB nonlinear" +0.8000  +0.8000  +0.8000
                 } 
         spec   {
                 "sRGB nonlinear" +0.8000  +0.8000  +0.8000
                 } 50
         samples 8
         } 

 light  {
         type   point
         color    {
                 "sRGB nonlinear" +1.0000  +1.0000  +1.0000
                 } 
         power +360.0000
         p     -0.5453 -3.4452 +5.9333
         } 

 light  {
         type   point
         color    {
                 "sRGB nonlinear" +1.0000  +1.0000  +1.0000
                 } 
         power +600.0000
         p     +2.3130 +9.0983 +4.2095
         } 

 light  {
         type   spherical
         color   {
                 "sRGB nonlinear" +1.0000  +1.0000  +1.0000
                 } 
         radiance +200.0000
         center   -11.8651 +1.2747 +8.1985
         radius   +1.0000
         samples  8
         } 

 camera {
         type pinhole
         eye    +9.6103 -4.0788 +10.2135
         target +8.8364 -3.5196 +9.9164
         up     +0.5220 +0.8290 +0.2004
         fov    49.13434
         aspect 1.33333
         } 

include   "_include.Scene.000\Cube.geo.sc"
include   "_include.Scene.000\Plane.geo.sc"
