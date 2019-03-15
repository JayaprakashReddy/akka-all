name := "akka-all"

version := "1.0"

scalaVersion := "2.11.8"
lazy val sparkVersion = "2.3.0"
lazy val hadoopVersion = "2.7.0"
lazy val jacksonV = "2.6.7"
lazy val akkaV = "2.5.21"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaV,
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "org.apache.hadoop" % "hadoop-common" % hadoopVersion,
  "com.databricks" %% "spark-csv" % "1.5.0",
  "com.amazonaws" % "aws-java-sdk-s3" % "1.11.34",
  "com.typesafe" % "config" % "1.3.1",
  "com.typesafe.play" % "play-json_2.11" % "2.5.9",
  "com.typesafe.play" % "play_2.11" % "2.5.9",
  "com.univocity" % "univocity-parsers" % "1.0.0",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)

dependencyOverrides ++= Set("com.fasterxml.jackson.core" % "jackson-core" % "2.6.4",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.6.4",
  "com.fasterxml.jackson.core" % "jackson-annotations" % "2.6.4",
  "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.6.4")

fork in Test := true
test in assembly := {}

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

