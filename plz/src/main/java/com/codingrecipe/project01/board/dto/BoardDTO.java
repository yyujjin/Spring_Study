package com.codingrecipe.project01.board.dto;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
	private Long id;
	private String boardWriter;
	private String boardPass;
	private String boardTitle;
	private String boardContents;
	private int boardHits;
//	sql에 있는걸 넣는다
	private Timestamp boardCreatedTime;
	
}
