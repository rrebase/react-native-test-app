// This file was generated by generate-manifest.mjs.
// DO NOT MODIFY. ALL CHANGES WILL BE OVERWRITTEN.

package com.microsoft.reacttestapp.manifest

import android.os.Bundle
import com.squareup.moshi.JsonClass

/* ktlint-disable trailing-comma */

@JsonClass(generateAdapter = true)
data class Component(
    val appKey: String,
    val displayName: String?,
    val initialProperties: Bundle?,
    val presentationStyle: String?,
    val slug: String?,
)

@JsonClass(generateAdapter = true)
data class Manifest(
    val name: String,
    val displayName: String,
    val version: String?,
    val bundleRoot: String?,
    val singleApp: String?,
    val components: List<Component>?,
)
