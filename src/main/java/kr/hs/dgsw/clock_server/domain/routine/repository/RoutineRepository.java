package kr.hs.dgsw.clock_server.domain.routine.repository;

import kr.hs.dgsw.clock_server.domain.routine.entity.RoutineEntity;
import kr.hs.dgsw.clock_server.global.common.enums.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface RoutineRepository extends JpaRepository<RoutineEntity, Long> {
//    @Query("select o from RoutineEntity o where :date between o.startAt and o.endAt")
//    List<RoutineEntity> findByDate(@Param("date") LocalDate date);
}
