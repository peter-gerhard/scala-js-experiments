enablePlugins(ScalaJSPlugin)

name := "scala js experiments"
scalaVersion := "2.11.12" // or any other Scala version >= 2.10.2

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
mainClass := Some("jsonExample.Main")

libraryDependencies += "fr.hmil" %%% "roshttp" % "2.1.0"


val circeVersion = "0.9.3"

libraryDependencies += "io.circe" %% "circe-parser" % circeVersion

libraryDependencies ++= Seq(
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion
)
