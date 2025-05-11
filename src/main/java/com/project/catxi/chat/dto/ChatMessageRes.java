package com.project.catxi.chat.dto;

import java.time.LocalDateTime;

public record ChatMessageRes(
	Long   messageId,
	Long   roomId,
	Long   senderId,
	String senderName,
	String content,
	LocalDateTime sentAt
) { }
