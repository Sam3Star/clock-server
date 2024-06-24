package kr.hs.dgsw.clock_server.domain.routine.presentation.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import kr.hs.dgsw.clock_server.domain.routine.presentation.dto.req.RoutineGenerateReq;
import kr.hs.dgsw.clock_server.domain.routine.service.RoutineService;
import kr.hs.dgsw.clock_server.global.reponse.Response;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "routine", description = "routine Api")
@RestController
@RequiredArgsConstructor
@RequestMapping("/routine")
public class RoutineController {
    private final RoutineService routineService;

    @PostMapping()
    @Operation(summary = "generate routine", description = "generate routine")
    public Response generate(
            @RequestBody RoutineGenerateReq req
            ){
        routineService.generate(req);
        return Response.of(HttpStatus.OK, "생성성공");
    }
}
