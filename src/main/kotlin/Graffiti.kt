import java.time.LocalDate

class Graffiti (
    val id: Int, //Идентификатор аудиозаписи
    val ownerId: Int, //Идентификатор владельца аудиозаписи
    val date: LocalDate, //Дата комапазиции
    val title: String, //Название композиции
    val length: Int, //Длина
    val width: Int, //Высота
    val artist: String, //Имя артиста
) : Attachment {
    override val type: String
        get() = "Graffiti"
    override val objects: Graffiti
        get() = Graffiti(id = id, ownerId = ownerId, date = date, title = title, length = length, width = width, artist = artist)
}





