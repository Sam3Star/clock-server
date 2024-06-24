package kr.hs.dgsw.clock_server.domain.routine.presentation.dto;

import kr.hs.dgsw.clock_server.global.common.enums.ColorEnum;
import kr.hs.dgsw.clock_server.global.common.enums.ImportanceEnum;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoutineDto {
    private Long routineId;
    private String name;
    private ImportanceEnum importanceEnum;
    private ColorEnum colorEnum;
}
