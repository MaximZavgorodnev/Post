import java.lang.reflect.Array
import java.util.*

class Comment(
     val id: Int, //Идентификатор комментария
     val fromId: Int, //Идентификатор автора комментария
     val date: Int, // Дата создания комментария в формате Unixtime
     val text: String, //Текст комментария
     val donut: Objects?, // Информация о VK Donut
     val relYToUser: Int, //Идентификатор пользователя или сообщества, в ответ которому оставлен текущий комментарий (если применимо)
     val replyToComment: Int, //Идентификатор комментария, в ответ на который оставлен текущий (если применимо)
     val attachments: Objects?,
     val parentsStack: kotlin.Array<Any>, //Массив идентификаторов родительских комментариев
     val thread: Objects? //Информация о вложенной ветке комментариев
) {

}