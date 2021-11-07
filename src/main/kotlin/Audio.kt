import java.time.LocalDate

class Audio(
    val id: Int, //Идентификатор аудиозаписи
    val ownerId: Int, //Идентификатор владельца аудиозаписи
    val date: LocalDate, //Дата комапазиции
    val title: String, //Название композиции
    val audioTime: Int, //Длительность аудиозаписи в секундах
    val artist: String, //Имя артиста

) : Attachment {
    override val type: String
        get() = "Audio"
    val audio : Audio = Audio(id = id, ownerId = ownerId, date = date, title = title, audioTime = audioTime, artist = artist)
}
