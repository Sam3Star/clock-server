package kr.hs.dgsw.clock_server.domain.task.presentation.dto;

import kr.hs.dgsw.clock_server.global.common.enums.ColorEnum;
import kr.hs.dgsw.clock_server.global.common.enums.ImportanceEnum;
import kr.hs.dgsw.clock_server.global.common.enums.State;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class TaskDto {
    private long id;
    private String name;
    private ImportanceEnum importanceEnum;
    private ColorEnum colorEnum;
    private LocalDate date;
    private State status;
}
