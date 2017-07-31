addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "1.1")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.1")

addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.20")

addSbtPlugin("ch.epfl.lamp" % "sbt-dotty" % "0.1.3")

addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.5")

// for bencharts
libraryDependencies ++= Seq(
  "org.jfree" % "jfreechart" % "1.0.14",
  "com.typesafe.play" %% "play-json" % "2.4.10"
)
libraryDependencies ++= Seq(
    "org.jacoco" % "org.jacoco.core" % "0.5.7.201204190339" artifacts(Artifact("org.jacoco.core", "jar", "jar")),
    "org.jacoco" % "org.jacoco.report" % "0.5.7.201204190339" artifacts(Artifact("org.jacoco.report", "jar", "jar")))
 
