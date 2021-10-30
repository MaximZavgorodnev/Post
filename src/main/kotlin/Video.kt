import java.time.LocalDate

class Video (type: String, id: Int, ownerId: Int, date: LocalDate, title: String, val videoTime: Int, val description: String):
    Attachment ("Video", id = id, ownerId = ownerId, date = date, title = title) {
}