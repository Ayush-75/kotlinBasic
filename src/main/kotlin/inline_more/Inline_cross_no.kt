package inline_more

import inline_more.Video.Cooking
import inline_more.Video.Programming
import inline_more.Video.Travel

sealed class Video(){
    data class Programming(val title: String,val duration: String): Video()
    data class Cooking(val title: String,val duration: String): Video()
    data class Travel(val title: String,val duration: String): Video()
}

inline fun applyTransformation(
    videos: List<Video>,
    noinline transformation:(Video) -> Video,
    crossinline onComplete:(List<Video>) -> Unit
){
    val v = videos.map { transformation(it) }
    onComplete.invoke(v)
}

fun main(args: Array<String>) {

    val videos = listOf(
        Programming("Kotlin Basic","10:30"),
        Cooking("Cooking with kotlin","15:00"),
        Programming("Kotlin for beginners","20:00"),
        Travel("Travel vlog : Kotlin Edition","30:00")
    )

    filter<Programming>(videos).forEach(::println)

    println("==================================================================")

    applyTransformation(
        videos, transformation = {
            when (it) {
                is Travel -> {
                    it.copy(title = it.title + " transformed")
                }
                is Cooking -> {
                    it.copy(title = it.title + " transformed")
                }
                is Programming -> {
                    it.copy(title = it.title + " transformed")
                }
            }
        },
        onComplete ={
            it.forEach { println(it.toString()) }
        }
    )
}

inline fun <reified T : Video> filter(videos: List<Video>): List<T> {
    return videos.filterIsInstance<T>()
}