package kr.hs.dgsw.clock_server.domain.routine.repository;

import kr.hs.dgsw.clock_server.domain.routine.entity.RoutineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RoutineRepository extends JpaRepository<RoutineEntity, Long> {
    List<RoutineEntity> findByEndAtGreaterThanEqual(LocalDate endAt);
}
