package kr.hs.dgsw.clock_server.domain.task.repository;

import kr.hs.dgsw.clock_server.domain.task.entity.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity,Long> {

}
