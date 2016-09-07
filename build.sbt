lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)

name := "scala-js-hashes"

normalizedName := "scalajs-hashes"

version := "0.0.1"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.6", "2.11.8")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0"
)

scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")

licenses += ("MIT", url("https://opensource.org/licenses/MIT"))

scmInfo := Some(ScmInfo(
  url("https://github.com/ariwaranosai/scala-js-hashes.git"),
  "scm:git:git@github.com:ariwaranosai/scala-js-hashes.git",
  Some("scm:git:git@github.com:ariwaranosai/scala-js-hashes.git")
))
