package com.fredporciuncula.inject.greeter

import me.tatarka.inject.annotations.Assisted
import me.tatarka.inject.annotations.Inject

@Inject
class CommonGreeter(
  @Assisted private val greeting: String,
  private val greeter: Greeter,
  private val platform: Platform,
  private val version: Version,
) {
  fun greet() {
    greeter.greet("$greeting from $platform! [${version.value}]")
  }
}
