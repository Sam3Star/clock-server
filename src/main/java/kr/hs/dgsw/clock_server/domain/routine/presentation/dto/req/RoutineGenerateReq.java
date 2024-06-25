package kr.hs.dgsw.clock_server.domain.routine.presentation.dto.req;

import jakarta.validation.constraints.NotNull;
import kr.hs.dgsw.clock_server.global.common.enums.ColorEnum;
import kr.hs.dgsw.clock_server.global.common.enums.ImportanceEnum;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Getter
@RequiredArgsConstructor
public class RoutineGenerateReq{
        String name;
        ImportanceEnum importanceEnum;
        ColorEnum colorEnum;
//        LocalDate startAt;
//        LocalDate endAt;
}
