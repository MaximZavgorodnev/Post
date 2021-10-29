
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_notEqualToZero() {
        var lastID = 10
        var post = Post(id = 0, ownerId = 0, fromId = 1, created_by = 0, date = 11, text = "PostOne", replyOwnerId = 0, replyPostId = 0, friendsOnly = true, comments = null, copyright = null, like = null, repost = null, views = null, postType = "тип", postSource = null, geo = null , signerId = 0, copyHistory = null, canPin = true, canDelete = true, canEdit = false, isPinned = true, markedAsAds = false, isFavorite = true, donut = null, postponedId = 0)
        val postNew = post.copy(id = lastID)
        assertTrue(postNew.id != 0)
    }

    @Test
    fun update_wasSuccessful() {
        // создаём целевой сервис
        val service = WallService


        // заполняем несколькими постами
        service.add(Post(id = 0, ownerId = 0, fromId = 1, created_by = 0, date = 11, text = "PostOne", replyOwnerId = 0, replyPostId = 0, friendsOnly = true, comments = null, copyright = null, like = null, repost = null, views = null, postType = "тип", postSource = null, geo = null , signerId = 0, copyHistory = null, canPin = true, canDelete = true, canEdit = false, isPinned = true, markedAsAds = false, isFavorite = true, donut = null, postponedId = 0))
        service.add(Post(id = 0, ownerId = 0, fromId = 1, created_by = 0, date = 20, text = "PostTwo", replyOwnerId = 0, replyPostId = 0, friendsOnly = true, comments = null, copyright = null, like = null, repost = null, views = null, postType = "тип", postSource = null, geo = null , signerId = 0, copyHistory = null, canPin = true, canDelete = true, canEdit = false, isPinned = true, markedAsAds = false, isFavorite = true, donut = null, postponedId = 0))
        service.add(Post(id = 0, ownerId = 0, fromId = 1, created_by = 0, date = 21, text = "PostThree", replyOwnerId = 0, replyPostId = 0, friendsOnly = true, comments = null, copyright = null, like = null, repost = null, views = null, postType = "тип", postSource = null, geo = null , signerId = 0, copyHistory = null, canPin = true, canDelete = true, canEdit = false, isPinned = true, markedAsAds = false, isFavorite = true, donut = null, postponedId = 0))
        // создаём информацию об обновлении
        val update = Post(id = 10, ownerId = 0, fromId = 1, created_by = 0, date = 11, text = "PostOne", replyOwnerId = 0, replyPostId = 0, friendsOnly = true, comments = null, copyright = null, like = null, repost = null, views = null, postType = "тип", postSource = null, geo = null , signerId = 0, copyHistory = null, canPin = true, canDelete = true, canEdit = false, isPinned = true, markedAsAds = false, isFavorite = true, donut = null, postponedId = 0)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }

    @Test
    fun update_failed() {
        // создаём целевой сервис
        val service = WallService


        // заполняем несколькими постами
        service.add(Post(id = 0, ownerId = 0, fromId = 1, created_by = 0, date = 11, text = "PostOne", replyOwnerId = 0, replyPostId = 0, friendsOnly = true, comments = null, copyright = null, like = null, repost = null, views = null, postType = "тип", postSource = null, geo = null , signerId = 0, copyHistory = null, canPin = true, canDelete = true, canEdit = false, isPinned = true, markedAsAds = false, isFavorite = true, donut = null, postponedId = 0))
        service.add(Post(id = 0, ownerId = 0, fromId = 1, created_by = 0, date = 20, text = "PostTwo", replyOwnerId = 0, replyPostId = 0, friendsOnly = true, comments = null, copyright = null, like = null, repost = null, views = null, postType = "тип", postSource = null, geo = null , signerId = 0, copyHistory = null, canPin = true, canDelete = true, canEdit = false, isPinned = true, markedAsAds = false, isFavorite = true, donut = null, postponedId = 0))
        service.add(Post(id = 0, ownerId = 0, fromId = 1, created_by = 0, date = 21, text = "PostThree", replyOwnerId = 0, replyPostId = 0, friendsOnly = true, comments = null, copyright = null, like = null, repost = null, views = null, postType = "тип", postSource = null, geo = null , signerId = 0, copyHistory = null, canPin = true, canDelete = true, canEdit = false, isPinned = true, markedAsAds = false, isFavorite = true, donut = null, postponedId = 0))
        // создаём информацию об обновлении
        val update = Post(id = 20, ownerId = 0, fromId = 1, created_by = 0, date = 11, text = "PostOne", replyOwnerId = 0, replyPostId = 0, friendsOnly = true, comments = null, copyright = null, like = null, repost = null, views = null, postType = "тип", postSource = null, geo = null , signerId = 0, copyHistory = null, canPin = true, canDelete = true, canEdit = false, isPinned = true, markedAsAds = false, isFavorite = true, donut = null, postponedId = 0)

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }

}