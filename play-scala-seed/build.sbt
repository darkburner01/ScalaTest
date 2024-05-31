name := """streaming-test"""
organization := "com.streaming"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.12"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test
libraryDependencies ++= Seq(
  "io.scodec" %% "scodec-bits" % "1.1.23",
  "com.typesafe.akka" %% "akka-stream" % "2.6.16",
  "com.github.kmpp" %% "sbt-ffmpeg" % "0.3.5"
)


// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.streaming.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.streaming.binders._"
