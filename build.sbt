name := """redact-pdf"""
organization := "com.gu"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
  "org.apache.pdfbox" % "pdfbox" % "2.0.8"
)

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.gu.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.gu.binders._"
