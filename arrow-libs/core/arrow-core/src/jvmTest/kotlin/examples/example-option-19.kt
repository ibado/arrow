// This file was automatically generated from Option.kt by Knit tool. Do not edit.
package arrow.core.examples.exampleOption19

import arrow.core.Some
import arrow.core.none

fun main() {
  Some(12).tapNone { println("flower") } // Result: Some(12)
  none<Int>().tapNone { println("flower") }  // Result: prints "flower" and returns: None
}
