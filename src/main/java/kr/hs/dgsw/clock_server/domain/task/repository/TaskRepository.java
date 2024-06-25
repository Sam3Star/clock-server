package kr.hs.dgsw.clock_server.domain.task.repository;

import kr.hs.dgsw.clock_server.domain.task.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
    List<TaskEntity> findTaskEntitiesByDate(LocalDate date);
    Optional<TaskEntity> findTaskEntityById(long id);
}
