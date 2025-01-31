package delegates.delegation_more

interface Downloader{
    fun download()
}

interface Uploader{
    fun upload()
}

class VideoDownloader(val fileName: String): Downloader{
    override fun download() {
        println("File Name : $fileName is downloaded")
    }
}

class VideoUploader(val fileName: String): Uploader{
    override fun upload() {
        println("File Name : $fileName is uploaded")
    }
}

class FileHandler(val downloader: Downloader,val uploader: Uploader): Downloader by downloader, Uploader by uploader{
//    override fun download() {
//        downloader.download()
//    }
//
//    override fun upload() {
//        uploader.upload()
//    }
}

fun main() {
    val downloader = VideoDownloader("Download")
    val uploader = VideoUploader("Upload")
    val fileHandler = FileHandler(downloader,uploader)
    fileHandler.download()
    fileHandler.upload()
}