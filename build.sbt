import sbtcrossproject.{crossProject, CrossType}
lazy val cross =
  crossProject(JSPlatform, JVMPlatform)
    .settings(
      scalaVersion := "2.12.6"
    )

lazy val crossJS = cross.js
lazy val crossJVM = cross.jvm
