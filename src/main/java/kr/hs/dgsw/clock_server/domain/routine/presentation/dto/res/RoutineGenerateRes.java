package kr.hs.dgsw.clock_server.domain.routine.presentation.dto.res;

public record RoutineGenerateRes(
        Long id
) {
    public static RoutineGenerateRes of(Long id){
        return new RoutineGenerateRes(id);
    }
}
