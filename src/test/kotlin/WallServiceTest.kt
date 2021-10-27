import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add_notEqualToZero() {
        var lastID = 10
        Post(id = 0, ownerId = 0, fromId = 1, created_by = 0, date = 11, text = "PostOne", replyOwnerId = 0, replyPostId = 0, friendsOnly = true, comments = null, copyright = null, like = null, repost = null, views = null, postType = "тип", signerId = 0, canPin = true, canDelete = true, canEdit = false, isPinned = true, markedAsAds = false, isFavorite = true, donut = null, postponedId = 0)
        val postNew = post.copy(id = lastID)
        posts += postNew
        lastID++
        return posts.last()
    }

    @Test
    fun update() {
    }
}