package com.study.repository

import com.study.domain.Tag
import org.springframework.data.jpa.repository.JpaRepository

interface TagRepository: JpaRepository<Tag, Long> {
    fun findByPostId(postId: Long): List<Tag>
}