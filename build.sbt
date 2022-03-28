//
// Basic project information.
//

name := "atmos"

version := "2.3"

resolvers += Resolver.sonatypeRepo("public")

description := "minimalist retry-on-failure behavior for scala"

homepage := Some(url("http://github.com/alexyavo/atmos"))

startYear := Some(2013)

organization := "io.github.alexyavo"

organizationName := "alexyavo.github.io"

scalacOptions ++= Seq (
  "-deprecation",
  "-encoding", "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:experimental.macros",
  "-unchecked",
  "-Xlint",
)

organizationHomepage := Some(url("https://github.com/alexyavo/"))

scalaVersion := "2.13.8"

crossScalaVersions := Seq("2.13.8")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.24" % "provided",
  "org.slf4j" % "slf4j-api" % "1.7.5" % "provided",
  "org.scalatest" %% "scalatest" % "3.2.11" % "test",
  "org.scalamock" %% "scalamock" % "5.2.0" % "test"
)

// ------------------------

publishTo := sonatypePublishToBundle.value
sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
sonatypeCredentialHost := "s01.oss.sonatype.org"

// Your profile name of the sonatype account. The default is the same with the organization value
publishMavenStyle := true

publishArtifact in Test := false

sonatypeProfileName := "io.github.alexyavo"

pomIncludeRepository := { _ => false }

pgpPassphrase := Some(sys.env.getOrElse("GPG_PASSWORD", default = "").toArray)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/alexyavo/atmos"),
    "scm:git@github.alexyavo/atmos.git"
  )
)

import xerial.sbt.Sonatype._

sonatypeProjectHosting := Some(GitHubHosting(user="alexyavo", repository="atmos", email="alxndr.yav@gmail.com"))

licenses := Seq("APL2" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"))

developers := List(
  Developer(id = "alexyavo", name = "Alex Y", url = url("https://github.com/alexyavo"), email="alxndr.yav@gmail.com")
)

publishTo := sonatypePublishToBundle.value
