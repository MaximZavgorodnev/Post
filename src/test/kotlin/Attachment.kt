import java.time.LocalDate

abstract class Attachment(
    val type: String,
    val id: Int,
    val ownerId: Int,
    val date: LocalDate,
    val title: String) {

}