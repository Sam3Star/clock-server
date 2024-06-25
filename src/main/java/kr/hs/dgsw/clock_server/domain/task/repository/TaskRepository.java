package kr.hs.dgsw.clock_server.domain.task.repository;

import kr.hs.dgsw.clock_server.domain.task.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {
    List<TaskEntity> findTaskEntitiesByDate(LocalDate date);
}
