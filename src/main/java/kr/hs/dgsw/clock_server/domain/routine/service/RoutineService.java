package kr.hs.dgsw.clock_server.domain.routine.service;

import kr.hs.dgsw.clock_server.domain.routine.presentation.dto.req.RoutineGenerateReq;

public interface RoutineService {
    void generate(RoutineGenerateReq req);
    void update(RoutineGenerateReq req, Long id);
    void delete(Long id);
}
