package kr.hs.dgsw.clock_server.domain.routine.entity;

import jakarta.persistence.*;
import kr.hs.dgsw.clock_server.global.common.entity.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_routine")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class RoutineEntity extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "routine_id", nullable = false)
    private Long routineId;

//    private
}
