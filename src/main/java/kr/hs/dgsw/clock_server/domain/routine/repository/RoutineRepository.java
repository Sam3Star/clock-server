package kr.hs.dgsw.clock_server.domain.routine.repository;

import kr.hs.dgsw.clock_server.domain.routine.entity.RoutineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoutineRepository extends JpaRepository<RoutineEntity, Long> {
}
