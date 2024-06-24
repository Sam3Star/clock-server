package kr.hs.dgsw.clock_server.domain.routine.service;

import kr.hs.dgsw.clock_server.domain.routine.entity.RoutineEntity;
import kr.hs.dgsw.clock_server.domain.routine.mapper.RoutineMapper;
import kr.hs.dgsw.clock_server.domain.routine.presentation.dto.req.RoutineGenerateReq;
import kr.hs.dgsw.clock_server.domain.routine.repository.RoutineRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class RoutineServiceImpl implements RoutineService{
    private final RoutineRepository routineRepository;
    private final RoutineMapper routineMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void generate(RoutineGenerateReq req){
        routineRepository.save(RoutineEntity.builder()
                .name(req.getName())
                .importanceEnum(req.getImportanceEnum())
                .colorEnum(req.getColorEnum())
                .build());
    }
}