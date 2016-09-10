lazy val root = project.in(file("."))
  .enablePlugins(ScalaJSPlugin)

name := "scala-js-hashes"

normalizedName := "scalajs-hashes"

organization := "xyz.ariwaranosai"

version := "1.0.0"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.6", "2.11.8")

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.0",
  "com.lihaoyi" %%% "utest" % "0.4.3" % "test"
)

jsDependencies += "org.webjars.bower" % "jshashes" % "1.0.5" / "1.0.5/hashes.min.js" % "test"

scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings")

testFrameworks += new TestFramework("utest.runner.Framework")

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2/")
}