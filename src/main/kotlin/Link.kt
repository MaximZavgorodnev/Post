import java.time.LocalDate

class Link(
    val id: Int, //Идентификатор аудиозаписи
    val ownerId: Int, //Идентификатор владельца аудиозаписи
    val date: LocalDate, //Дата комапазиции
    val title: String, //Название композиции
    val url: String, //Ссылка
    val description: String, //Описание ссылки
    ) : Attachment {
    override val type: String
    get() = "Link"
    val link: Link = Link(id = id, ownerId = ownerId, date = date, title = title, url = url, description = description)
}






