package kr.hs.dgsw.clock_server.domain.task.entity;

import jakarta.persistence.*;
import kr.hs.dgsw.clock_server.global.common.enums.ColorEnum;
import kr.hs.dgsw.clock_server.global.common.enums.ImportanceEnum;
import kr.hs.dgsw.clock_server.global.common.enums.State;
import lombok.*;

import java.time.LocalDate;
@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Table(name = "tbl_task")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "task_id", nullable = false)
    private long id;
    /*
    id
     */

    @Column(name =  "task_name", nullable = false)
    private String name;
    /*
    할일 이름
     */

    @Column(name = "importance", nullable = false)
    private ImportanceEnum importanceEnum;
    /*
    중요도
     */

    @Column(name = "color", nullable = false)
    private ColorEnum colorEnum;
    /*
    색
     */

    @Column(name = "date", nullable = false)
    private LocalDate date;
    /*
    설정시간
     */

    @Column(name = "status", nullable = false)
    private State status;
    /*
    일의 상태
     */
    public void changeTask(String name, ImportanceEnum importanceEnum, ColorEnum colorEnum, LocalDate date){
        this.name = name;
        this.importanceEnum = importanceEnum;
        this.colorEnum = colorEnum;
        this.date = date;
    }

    public void setStatus(State status){
        this.status = status;
    }
}
