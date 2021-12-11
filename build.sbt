ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.7"

lazy val root = (project in file("."))
  .settings(
    name := "OOPsAssignment_1"
  )

lazy val Queue = project.in(file("Queue"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.3.0-SNAP3" % "test"

    ))

