package com.mycompany.myspring.board.db.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity                // JPA 엔티티로 정의
@Table(name = "board") // 클래스, 테이블 간의 매핑
@Data                  // 모든 필드에 Getter, Setter, toString 등 생성
@Builder               // 객체 생성 시 초기화 코드를 간소화 및 가독성 향상
@NoArgsConstructor     // 기본 생성자 자동 생성
@AllArgsConstructor    // 모든 필드가 있는 생성장 자동 생성
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //기본 키 생성을 데이터베이스에 위임하는 전략(auto_increment)
    private Long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 1000)
    private String content;
}
