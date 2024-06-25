package kr.hs.dgsw.clock_server.domain.task.presentation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "task", description = "task Api")
public class TaskController {
    private final TaskService taskService;

    @PostMapping("")
    @Operation(summary = "generate task", description = "generate task")
    public Response register(@RequestBody TaskRequestDto requestDto){
        taskService.register(requestDto);
        return Response.of(HttpStatus.CREATED,"task 생성 성공");
    }

    @GetMapping("/{date}")
    @Operation(summary = "upload task", description = "upload task")
    public ResponseData<ArrayList<TaskDto>> upload(@PathVariable LocalDate date){
        return ResponseData.of(HttpStatus.OK,"task 업로딩 : ",taskService.taskUpload(date));
    }

    @PatchMapping("/{id}")
    @Operation(summary = "change state", description = "change state")
    public Response changeState(@PathVariable long id){
        taskService.editState(id);
        return Response.of(HttpStatus.OK,"state 수정 성공");
    }

    @PatchMapping("/edit/{id}")
    @Operation(summary = "change task", description = "change task")
    public Response changeTask(@PathVariable long id, @RequestBody TaskRequestDto taskRequestDto){
        taskService.edit(id,taskRequestDto);
        return Response.of(HttpStatus.OK,"task 수정 성공");
    }

    @DeleteMapping("/del/{id}")
    @Operation(summary = "delete task", description = "delete task")
    public Response delete(@PathVariable long id){
        taskService.delete(id);
        return Response.of(HttpStatus.OK,"task 삭제 성공");
    }
}
