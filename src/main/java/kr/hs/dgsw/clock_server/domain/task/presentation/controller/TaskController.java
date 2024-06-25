package kr.hs.dgsw.clock_server.domain.task.presentation.controller;

import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskDto;
import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskRequestDto;
import kr.hs.dgsw.clock_server.domain.task.service.TaskService;
import kr.hs.dgsw.clock_server.global.reponse.Response;
import kr.hs.dgsw.clock_server.global.reponse.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;

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

    @GetMapping("/{date}")
    public ResponseData<ArrayList<TaskDto>> upload(@PathVariable LocalDate date){
        return ResponseData.of(HttpStatus.OK,"task 업로딩 : ",taskService.taskUpload(date));
    }

    @PatchMapping("/{id}")
    public Response changeState(@PathVariable long id){
        taskService.editState(id);
        return Response.of(HttpStatus.OK,"state 수정 성공");
    }

    @DeleteMapping("del/{id}")
    public Response delete(@PathVariable long id){
        taskService.delete(id);
        return Response.of(HttpStatus.OK,"task 삭제 성공");
    }
}
