gradleBaseDir=`dirname $0`
targetDir=$1
cp -r $gradleBaseDir/gradle $targetDir
cp -r $gradleBaseDir/src $targetDir
cp $gradleBaseDir/build.gradle.kts $gradleBaseDir/gradlew $gradleBaseDir/gradlew.bat $gradleBaseDir/settings.gradle $targetDir
