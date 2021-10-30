import java.time.LocalDate

class Photo(
    val id: Int, //Идентификатор аудиозаписи
    val ownerId: Int, //Идентификатор владельца аудиозаписи
    val date: LocalDate, //Дата комапазиции
    val title: String, //Название композиции
    val length: Int, //Длина
    val width: Int, //Высота
    val description: String, //Описание фото
) : Attachment {
    override val type: String
        get() = "Photo"
    override val objects: Photo
        get() = Photo(id = id, ownerId = ownerId, date = date, title = title, length = length, width = width, description = description)
}