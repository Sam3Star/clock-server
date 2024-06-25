package kr.hs.dgsw.clock_server.domain.task.presentation.dto;

import kr.hs.dgsw.clock_server.global.common.enums.ColorEnum;
import kr.hs.dgsw.clock_server.global.common.enums.ImportanceEnum;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Getter
@RequiredArgsConstructor
public class TaskRequestDto {
    private String name;
    private ImportanceEnum importanceEnum;
    private ColorEnum colorEnum;
    private LocalDate date;
}
