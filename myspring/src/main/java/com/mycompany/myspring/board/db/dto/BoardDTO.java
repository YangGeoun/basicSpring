package com.mycompany.myspring.board.db.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter                // 모든 필드에 getter 생성
@Builder               // 객체 생성 시 초기화 코드를 간소화 및 가독성 향상
@AllArgsConstructor    // 모든 필드가 있는 생성장 자동 생성
public class BoardDTO {
    private String title;
    private String content;
}
