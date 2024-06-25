package kr.hs.dgsw.clock_server.domain.routine.presentation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.hs.dgsw.clock_server.domain.routine.presentation.dto.req.RoutineGenerateReq;
import kr.hs.dgsw.clock_server.domain.routine.presentation.dto.res.RoutineGenerateRes;
import kr.hs.dgsw.clock_server.domain.routine.presentation.dto.res.RoutineLoadRes;
import kr.hs.dgsw.clock_server.domain.routine.service.RoutineService;
import kr.hs.dgsw.clock_server.global.reponse.Response;
import kr.hs.dgsw.clock_server.global.reponse.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "routine", description = "routine Api")
@RestController
@RequiredArgsConstructor
@RequestMapping("/routine")
public class RoutineController {
    private final RoutineService routineService;

    @PostMapping()
    @Operation(summary = "generate routine", description = "generate routine")
    public ResponseData<RoutineGenerateRes> generate(
            @RequestBody RoutineGenerateReq req
            ){
        return ResponseData.of(HttpStatus.CREATED, "생성성공", routineService.generate(req));
    }

    @PatchMapping("/{id}")
    @Operation(summary = "update routine", description = "update routine")
    public Response update(
            @PathVariable Long id,
            @RequestBody RoutineGenerateReq req
    ){
        routineService.update(req, id);
        return Response.of(HttpStatus.OK, "수정성공");
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "delete routine", description = "delete routine")
    public Response delete(
            @PathVariable Long id
    ){
        routineService.delete(id);
        return Response.of(HttpStatus.OK, "삭제성공");
    }

    @GetMapping()
    @Operation(summary = "load all", description = "load all")
    public ResponseData<List<RoutineLoadRes>> loadAll(){
        return ResponseData.of(HttpStatus.OK, "불러오기 성공", routineService.loadRoutine());
    }

    @PatchMapping("/set/{id}")
    @Operation(summary = "set state", description = "set state")
    public Response setState(
             @PathVariable Long id
    ){
        routineService.setState(id);
        return Response.of(HttpStatus.OK, "상태수정 성공");
    }
}
