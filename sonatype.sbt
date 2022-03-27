//
// Publishing to Sonatype
//

credentials += Credentials("Sonatype Nexus Repository Manager",
  "s01.oss.sonatype.org",
  sys.env.getOrElse("SONATYPE_USER", default = ""),
  sys.env.getOrElse("SONATYPE_PASSWORD", default = ""))

// Your profile name of the sonatype account. The default is the same with the organization value
publishMavenStyle := true

publishArtifact in Test := false

sonatypeProfileName := "alexyavo"

pomIncludeRepository := { _ => false }

pgpPassphrase := Some(sys.env.getOrElse("GPG_PASSWORD", default = "").toArray)

scmInfo := Some(
	ScmInfo(
		url("https://github.com/alexyavo/atmos"),
		"scm:git@github.alexyavo/atmos.git"
	)
)

licenses := Seq("APL2" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"))

pomExtra := (
    <developers>
      <developer>
        <id>alexyavo</id>
        <name>Alex Y</name>
        <url>https://github.com/alexyavo</url>
      </developer>
    </developers>
  )

publishTo := sonatypePublishToBundle.value
