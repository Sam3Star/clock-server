package kr.hs.dgsw.clock_server.domain.task.presentation.controller;

import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskRequestDto;
import kr.hs.dgsw.clock_server.domain.task.service.TaskService;
import kr.hs.dgsw.clock_server.global.reponse.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/task")
public class TaskController {
    private final TaskService taskService;

    @PostMapping("")
    public Response register(@RequestBody TaskRequestDto requestDto){
        taskService.register(requestDto);
        return Response.of(HttpStatus.CREATED,"task 생성 성공");
    }
}
