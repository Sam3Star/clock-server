package kr.hs.dgsw.clock_server.domain.task.service;

import kr.hs.dgsw.clock_server.domain.routine.entity.RoutineEntity;
import kr.hs.dgsw.clock_server.domain.task.entity.TaskEntity;
import kr.hs.dgsw.clock_server.domain.task.mapper.TaskMapper;
import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskDto;
import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskRequestDto;
import kr.hs.dgsw.clock_server.domain.task.repository.TaskRepository;
import kr.hs.dgsw.clock_server.global.common.enums.State;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.ArrayList;

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
    @Transactional(readOnly = true)
    public ArrayList<TaskDto> taskUpload(LocalDate date) {
        ArrayList<TaskDto> taskDtoLst = new ArrayList<>();
        for(TaskEntity taskEntity : taskRepository.findTaskEntitiesByDate(date)){
            taskDtoLst.add(taskMapper.DomainMapper(taskEntity));
        }
        return taskDtoLst;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void editState(Long id) {
        TaskEntity taskEntity = taskRepository.findById(id)
                .orElseThrow(IllegalArgumentException::new);

        if (taskEntity.getStatus().equals(State.active)){
            taskEntity.setStatus(State.finish);
        }else {
            taskEntity.setStatus(State.active);
        }
    }

    @Override
    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}
