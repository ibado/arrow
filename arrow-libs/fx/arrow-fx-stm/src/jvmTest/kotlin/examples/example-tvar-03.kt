// This file was automatically generated from TVar.kt by Knit tool. Do not edit.
package arrow.fx.stm.examples.exampleTvar03

import arrow.fx.stm.TVar
import arrow.fx.stm.atomically

suspend fun main() {
  //sampleStart
  val tvar = TVar.new(10)
  val result = atomically {
    tvar.write(20)
  }
  //sampleEnd
  println(result)
}
