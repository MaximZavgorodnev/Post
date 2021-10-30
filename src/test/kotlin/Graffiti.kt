import java.time.LocalDate

class Graffiti (type: String, id: Int, ownerId: Int, date: LocalDate, title: String, val length: Int, val width: Int, val author: String):
    Attachment ("Graffiti", id = id, ownerId = ownerId, date = date, title = title) {
}