package kr.hs.dgsw.clock_server.domain.routine.presentation.dto.res;

import kr.hs.dgsw.clock_server.global.common.enums.ColorEnum;
import kr.hs.dgsw.clock_server.global.common.enums.ImportanceEnum;
import kr.hs.dgsw.clock_server.global.common.enums.State;

public record RoutineLoadRes(
        Long id,
        String name,
        ImportanceEnum importanceEnum,
        ColorEnum colorEnum,
        State state
) {
    public static RoutineLoadRes of(Long id,
                                    String name,
                                    ImportanceEnum importanceEnum,
                                    ColorEnum colorEnum,
                                    State state){
        return new RoutineLoadRes(id, name, importanceEnum, colorEnum, state);
    }
}
