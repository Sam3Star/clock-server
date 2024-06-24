package kr.hs.dgsw.clock_server.domain.routine.mapper;

import kr.hs.dgsw.clock_server.domain.routine.entity.RoutineEntity;
import kr.hs.dgsw.clock_server.domain.routine.presentation.dto.RoutineDto;
import kr.hs.dgsw.clock_server.domain.routine.presentation.dto.req.RoutineGenerateReq;
import kr.hs.dgsw.clock_server.global.anotation.Mapper;
import lombok.RequiredArgsConstructor;

@Mapper
@RequiredArgsConstructor
public class RoutineMapper {
    public RoutineDto mapToDomain(RoutineEntity routineEntity){
        return RoutineDto.builder()
                .routineId(routineEntity.getRoutineId())
                .name(routineEntity.getName())
                .importanceEnum(routineEntity.getImportanceEnum())
                .colorEnum(routineEntity.getColorEnum())
                .build();
    }

    public RoutineEntity mapToEntity(RoutineDto routineDto){
        return RoutineEntity.builder()
                .routineId(routineDto.getRoutineId())
                .name(routineDto.getName())
                .importanceEnum(routineDto.getImportanceEnum())
                .colorEnum(routineDto.getColorEnum())
                .build();
    }

}
