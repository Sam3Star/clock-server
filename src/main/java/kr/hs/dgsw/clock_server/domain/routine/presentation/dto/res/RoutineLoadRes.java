package kr.hs.dgsw.clock_server.domain.routine.presentation.dto.res;

import kr.hs.dgsw.clock_server.global.common.enums.ColorEnum;
import kr.hs.dgsw.clock_server.global.common.enums.ImportanceEnum;

import java.time.LocalDate;

public record RoutineLoadRes(
        Long id,
        String name,
        ImportanceEnum importanceEnum,
        ColorEnum colorEnum
//        LocalDate startAt,
//        LocalDate endAt
) {
    public static RoutineLoadRes of(Long id,
                                    String name,
                                    ImportanceEnum importanceEnum,
                                    ColorEnum colorEnum){
        return new RoutineLoadRes(id, name, importanceEnum, colorEnum);
    }
}
