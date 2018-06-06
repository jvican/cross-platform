import sbtcrossproject.{crossProject, CrossType}
lazy val cross =
  crossProject(JSPlatform, JVMPlatform, NativePlatform)
    .settings(
      // %%% now include Scala Native. It applies to all selected platforms
      scalaVersion := "2.11.12",
      libraryDependencies += "com.lihaoyi" %%% "utest" % "0.6.0" % Test,
      testFrameworks += new TestFramework("utest.runner.Framework")
    )

lazy val crossJS = cross.js
lazy val crossJVM = cross.jvm
lazy val crossNative = cross.native
