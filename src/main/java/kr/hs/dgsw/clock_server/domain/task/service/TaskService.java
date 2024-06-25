package kr.hs.dgsw.clock_server.domain.task.service;

import kr.hs.dgsw.clock_server.domain.task.entity.TaskEntity;
import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskDto;
import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskRequestDto;

import java.time.LocalDate;
import java.util.ArrayList;

public interface TaskService {
    void editState(Long id);
    void delete(Long id);
    void register(TaskRequestDto taskRequestDto);
    void edit(Long id, TaskRequestDto taskRequestDto);
    ArrayList<TaskDto> taskUpload(LocalDate date);
}
