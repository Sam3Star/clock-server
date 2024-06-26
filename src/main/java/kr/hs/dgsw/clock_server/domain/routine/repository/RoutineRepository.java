package kr.hs.dgsw.clock_server.domain.routine.repository;

import kr.hs.dgsw.clock_server.domain.routine.entity.RoutineEntity;
import kr.hs.dgsw.clock_server.domain.task.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface RoutineRepository extends JpaRepository<RoutineEntity, Long> {
    @Query("SELECT r FROM RoutineEntity r WHERE r.modifiedDateTime = :today")
    List<RoutineEntity> findModifiedToday(@Param("today") LocalDateTime today);
}
