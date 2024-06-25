package kr.hs.dgsw.clock_server.domain.task.mapper;

import kr.hs.dgsw.clock_server.domain.task.entity.TaskEntity;
import kr.hs.dgsw.clock_server.domain.task.presentation.dto.TaskDto;
import kr.hs.dgsw.clock_server.global.anotation.Mapper;
import lombok.RequiredArgsConstructor;

@Mapper
@RequiredArgsConstructor
public class TaskMapper {
        public TaskDto DomainMapper(TaskEntity taskEntity){
            return TaskDto.builder()
                    .id(taskEntity.getId())
                    .name(taskEntity.getName())
                    .colorEnum(taskEntity.getColorEnum())
                    .importanceEnum(taskEntity.getImportanceEnum())
                    .date(taskEntity.getDate())
                    .status(taskEntity.getStatus())
                    .build();
        }

        public TaskEntity EntityMapper(TaskDto taskDto){
            return TaskEntity.builder()
                    .id(taskDto.getId())
                    .name(taskDto.getName())
                    .colorEnum(taskDto.getColorEnum())
                    .importanceEnum(taskDto.getImportanceEnum())
                    .date(taskDto.getDate())
                    .status(taskDto.getStatus())
                    .build();
        }

    }

