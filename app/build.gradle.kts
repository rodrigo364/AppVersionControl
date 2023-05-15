@Suppress("DSL_SCOPE_VIOLATION") // Remove when fixed https://youtrack.jetbrains.com/issue/KTIJ-19369
plugins {
    id("kotlin-kapt")
    alias(libs.plugins.android.application)
    alias(libs.plugins.android.kotlin)
    alias(libs.plugins.hilt)
    alias(libs.plugins.kotlin.serialization)
//    alias(libs.plugins.kotlin.jvm)
    id("kotlin-parcelize")
    id("kotlinx-serialization")
}


android {
    namespace = "br.com.appversioncontrol"
    compileSdk = 33

    defaultConfig {
        applicationId = "br.com.appversioncontrol"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0.0"  // X.Y.Z; X = Major, Y = minor, Z = Patch level

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility =  JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion =  "1.4.2"
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
        }
    }
}

dependencies {

    implementation(libs.bundles.androidx)
    implementation(libs.hilt)
    kapt(libs.hilt.compiler)
    kapt(libs.hilt.compiler.androidx)
    implementation(libs.bundles.compose)
    implementation(libs.bundles.retrofit)
    implementation(libs.bundles.helpers)
    implementation(project(":core:common"))

    testImplementation (libs.bundles.testImplementation)

    androidTestImplementation (libs.bundles.androidTestImplementation)

    debugImplementation (libs.bundles.debugImplementation)
}

// Allow references to generated code
kapt {
    correctErrorTypes = true
}