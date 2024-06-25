package kr.hs.dgsw.clock_server.domain.task.service;

import kr.hs.dgsw.clock_server.domain.task.entity.TaskEntity;
import kr.hs.dgsw.clock_server.domain.task.mapper.TaskMapper;
import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskDto;
import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskRequestDto;
import kr.hs.dgsw.clock_server.domain.task.repository.TaskRepository;
import kr.hs.dgsw.clock_server.global.common.enums.State;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService{
    private final TaskRepository taskRepository;
    private final TaskMapper taskMapper;

    @Override
    public void register(TaskRequestDto taskRequestDto) {
        taskRepository.save(
                TaskEntity.builder()
                        .status(State.active)
                        .importanceEnum(taskRequestDto.getImportanceEnum())
                        .date(taskRequestDto.getDate())
                        .name(taskRequestDto.getName())
                        .colorEnum(taskRequestDto.getColorEnum())
                        .build()
        );
    }

    @Override
    public TaskDto get(Long id) {
        return null;
    }

    @Override
    public void modify(TaskDto taskDto) {

    }

    @Override
    public void remove(Long id) {

    }
}
