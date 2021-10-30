import java.time.LocalDate

class Video(
    val id: Int, //Идентификатор аудиозаписи
    val ownerId: Int, //Идентификатор владельца аудиозаписи
    val date: LocalDate, //Дата комапазиции
    val title: String, //Название композиции
    val videoTime: Int, //Длительность видеозаписи в секундах
    val description: String, //Описание видео
) : Attachment {
    override val type: String
        get() = "Video"
    override val objects: Video
        get() = Video(id = id, ownerId = ownerId, date = date, title = title, videoTime = videoTime, description = description)
}