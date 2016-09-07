lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)

name := "scala-js-hashes"

normalizedName := "scalajs-hashes"

organization := "xyz.ariwaranosai"

version := "0.0.2"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.6", "2.11.8")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0"
)

scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2/")
}