import java.time.LocalDate

class Photo (type: String, id: Int, ownerId: Int, date: LocalDate, title: String, val length: Int, val width: Int, val description: String):
    Attachment ("Photo", id = id, ownerId = ownerId, date = date, title = title) {
}