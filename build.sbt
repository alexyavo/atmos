//
// Basic project information.
//

name := "atmos"

version := "2.3"

resolvers += Resolver.sonatypeRepo("public")

description := "minimalist retry-on-failure behavior for scala"

homepage := Some(url("http://github.com/alexyavo/atmos"))

startYear := Some(2013)

organization := "io.alexyavo"

organizationName := "alexyavo.io"

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
  "-Xfuture"
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

