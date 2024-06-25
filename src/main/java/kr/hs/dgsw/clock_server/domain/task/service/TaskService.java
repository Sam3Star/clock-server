package kr.hs.dgsw.clock_server.domain.task.service;

import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskDto;
import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskRequestDto;

public interface TaskService {

    void register(TaskRequestDto taskRequestDto);

    TaskDto get(Long id);

    void modify(TaskDto taskDto);

    void remove(Long id);
}
