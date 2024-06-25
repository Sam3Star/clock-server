package kr.hs.dgsw.clock_server.domain.routine.service;

import kr.hs.dgsw.clock_server.domain.routine.presentation.dto.req.RoutineGenerateReq;
import kr.hs.dgsw.clock_server.domain.routine.presentation.dto.res.RoutineGenerateRes;
import kr.hs.dgsw.clock_server.domain.routine.presentation.dto.res.RoutineLoadRes;
import kr.hs.dgsw.clock_server.global.common.enums.State;

import java.util.List;

public interface RoutineService {
    void createDailyRoutine();
    RoutineGenerateRes generate(RoutineGenerateReq req);
    void update(RoutineGenerateReq req, Long id);
    void delete(Long id);
    List<RoutineLoadRes> loadRoutine();
    void setState(Long id);
}
