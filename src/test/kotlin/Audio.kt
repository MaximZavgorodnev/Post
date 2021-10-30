import java.time.LocalDate

class Audio (type: String, id: Int, ownerId: Int, date: LocalDate, title: String, val audioTime: Int, val artist: String):
    Attachment ("Audio", id = id, ownerId = ownerId, date = date, title = title) {

}