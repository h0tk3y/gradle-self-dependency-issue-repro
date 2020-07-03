plugins {
	id("java-library")
}

dependencies {
	testImplementation(project(":libtests"))
}

// create a copy of the configuration that resolves a transitive dependency on self:
val testCompileClasspath by configurations
val copy = testCompileClasspath.copyRecursive()
sourceSets["test"].compileClasspath = copy