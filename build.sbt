ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "JVM_Scala"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.3.0-SNAP4" % Test
