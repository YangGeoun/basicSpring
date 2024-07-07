package com.mycompany.myspring.board.service;

import com.mycompany.myspring.board.db.entity.Board;
import com.mycompany.myspring.board.db.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public Map<String, String> test() {
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "World");
        Board board = Board.builder()
                .title("제목입니다")
                .content("내용입니다.")
                .build();
        boardRepository.save(board);
        return map;
    }

    public Map<String, Long> pathVariable(long boardId) {
        Map<String, Long> map = new HashMap<>();
        map.put("Hello", boardId);
        return map;
    }

    public Map<String, String> requestParam(String title, String content) {
        Map<String, String> map = new HashMap<>();
        map.put("title", title);
        map.put("content", content);
        return map;
    }

    public Map<String, String> requestBody(Map<String, String> requestBody) {
        Map<String, String> map = new HashMap<>();
        map.put("title", requestBody.get("title"));
        map.put("content", requestBody.get("content"));
        return map;
    }
}
