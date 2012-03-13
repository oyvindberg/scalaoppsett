scalaVersion := "2.9.1"

name := "scalaoppsett"


//	Dette viser hvordan man legger til dependencies i sbt. De tre feltene tilsvarer 
//	 mavens organizationId, artifactId og version.
//
//	Scala-dependencies blir bygget mot en spesifikk version av Scala siden språket ikke
//	er binærkompatibelt mellom releaser, og dependenciene blir tildelt artifactnavn som
//	scalaj-collection_2.9.1. Det ekstra prosenttegnet i den første dependencien sørger
//	for at riktig versjon blir valgt.
libraryDependencies ++= Seq(
//  "org.scalaj" 	%% "scalaj-collection" 	% "1.2",
//  "org.bouncycastle" 	%  "bcprov-jdk16" 	% "1.45"
)
