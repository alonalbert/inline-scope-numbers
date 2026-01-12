import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
  runBlocking {
    test(this)
  }

}
fun test(scope: CoroutineScope) {
  scope.launch {
    run {
      val a = 1
      println(a) // Breakpoint here and evaluate "a"
    }
  }
}
