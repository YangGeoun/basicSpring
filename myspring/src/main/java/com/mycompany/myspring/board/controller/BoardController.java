package com.mycompany.myspring.board.controller;

import com.mycompany.myspring.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

    @GetMapping("/test")
    public Map<String, String> test() {
        return boardService.test();
    }

    @GetMapping("/pathVariable/{boardId}")
    public Map<String, Long> pathVariable(
            @PathVariable("boardId") long boardId) {
        return boardService.pathVariable(boardId);
    }

    @GetMapping("/requestParam")
    public Map<String, String> requestParam(
            @RequestParam("title") String title,
            @RequestParam("content") String content) {
        return boardService.requestParam(title, content);
    }

    @PostMapping("/requestBody")
    public Map<String, String> requestBody(
            @RequestBody Map<String, String> requestBody) {
        return boardService.requestBody(requestBody);
    }
}
