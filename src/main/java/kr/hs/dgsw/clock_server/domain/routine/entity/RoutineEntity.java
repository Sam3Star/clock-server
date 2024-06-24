package kr.hs.dgsw.clock_server.domain.routine.entity;

import jakarta.persistence.*;
import kr.hs.dgsw.clock_server.global.common.entity.BaseTimeEntity;
import kr.hs.dgsw.clock_server.global.common.enums.ColorEnum;
import kr.hs.dgsw.clock_server.global.common.enums.ImportanceEnum;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.DynamicUpdate;

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

    @Column(name =  "routine_name", nullable = false)
    private String name;

    @Column(name = "importance", nullable = false)
    private ImportanceEnum importanceEnum;

    @Column(name = "color", nullable = false)
    private ColorEnum colorEnum;
}
