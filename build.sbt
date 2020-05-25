name := "udemy-akka-essentials"

version := "0.1"

scalaVersion := "2.13.2"
ThisBuild / useCoursier := false
val akkaVersion = "2.5.13"
val scalaTestVersion = "3.1.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.6.5",
  "com.typesafe.akka" %% "akka-testkit" % "2.6.5",
  "org.mockito" %% "mockito-scala" % "1.14.2",
  "org.mockito" % "mockito-core" % "3.3.3" % "test",
)
// https://mvnrepository.com/artifact/org.mockito/mockito-scala

libraryDependencies += "org.scalatest" % "scalatest_2.13" % "3.1.2"
