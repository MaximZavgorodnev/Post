import java.time.LocalDate

class Link (type: String, id: Int, ownerId: Int, date: LocalDate, title: String, val url: String, val description: String):
    Attachment ("Link", id = id, ownerId = ownerId, date = date, title = title) {
}