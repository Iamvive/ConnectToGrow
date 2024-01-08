package kotlib

import java.util.concurrent.Flow
import kotlin.coroutines.coroutineContext

fun main() {
    val fakeLazy = FakeLazy()
    fakeLazy.invoke()
}

class FakeLazy {
    private val practise by lazy {
        println("Came here")
        Practise()
    }

    fun invoke() {
        practise.toString()
        practise.toString()
        practise.toString()
    }
}

class Practise {

}


//class FakeInit (
//        val stream: Flow
//) : CoroutineScope by CoroutineScope(coroutineContext) {
//    init {
//        launch {
//            stream.map{it}
//                    .collect {
//                        //Here do something with emitted values
//
//                    }
//        }
//    }
//}