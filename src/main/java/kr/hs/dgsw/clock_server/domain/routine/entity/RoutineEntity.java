package kr.hs.dgsw.clock_server.domain.routine.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import kr.hs.dgsw.clock_server.global.common.entity.BaseTimeEntity;
import kr.hs.dgsw.clock_server.global.common.enums.ColorEnum;
import kr.hs.dgsw.clock_server.global.common.enums.ImportanceEnum;
import kr.hs.dgsw.clock_server.global.common.enums.State;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDate;

@Entity
@Table(name = "tbl_routine")
@Getter
@DynamicUpdate
@SuperBuilder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoutineEntity extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "routine_id", nullable = false)
    private Long routineId;

    @NonNull
    @Column(name =  "routine_name", nullable = false)
    private String name;

    @NonNull
    @Column(name = "importance", nullable = false)
    private ImportanceEnum importanceEnum;

    @NonNull
    @Column(name = "color", nullable = false)
    private ColorEnum colorEnum;

    @NonNull
    @Column(name = "status")
    private State state;

    @NotNull
    private LocalDate startAt;

    @NotNull
    private LocalDate endAt;

    public void updateRoutine(String name, ImportanceEnum importanceEnum, ColorEnum colorEnum, LocalDate startAt, LocalDate endAt){
        this.name = name;
        this.importanceEnum = importanceEnum;
        this.colorEnum = colorEnum;
        this.startAt = startAt;
        this.endAt = endAt;
    }

    public void setState(State state){
        this.state = state;
    }
}
