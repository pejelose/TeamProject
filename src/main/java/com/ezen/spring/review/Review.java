package com.ezen.spring.review;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Data
public class Review 
{
	private int reviewNum;
	private String reviewTitle;
	private String reviewContents;
	private java.sql.Date reviewDate;
	private int reviewParentNum;
	private int reviewLikeNum;
	private int reviewAttachNum;
	private String reviewAttachName;
	private int reviewAttachParentNum;
	private float reviewFileSize;
	private String reviewContentType;
	public String getReviewNum;
	private MultipartFile file;
	
	
	
}