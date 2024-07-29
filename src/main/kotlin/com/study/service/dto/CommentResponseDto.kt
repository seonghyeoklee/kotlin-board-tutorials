package com.study.service.dto

import com.study.domain.Comment

data class CommentResponseDto(
    val id: Long,
    val content: String,
    val createdBy: String,
    val createdAt: String,
)

fun Comment.toResponseDto() = CommentResponseDto(
    id = id,
    content = content,
    createdBy = createdBy,
    createdAt = createdAt.toString()
)
