organization := "xyz.ariwaranosai"

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra in Global := {
  <url>https://github.com/ariwaranosai/scala-js-hashes.git</url>
    <licenses>
      <license>
        <name>MIT</name>
        <url>https://opensource.org/licenses/MIT</url>
      </license>
    </licenses>
    <scm>
      <url>https://github.com/ariwaranosai/scala-js-hashes.git</url>
      <connection>scm:git:git@github.com:ariwaranosai/scala-js-hashes.git</connection>
    </scm>
    <developers>
      <developer>
        <id>ariwaranosai</id>
        <name>ariwaranosai</name>
        <url>http://ariwaranosai.xyz</url>
      </developer>
    </developers>
}