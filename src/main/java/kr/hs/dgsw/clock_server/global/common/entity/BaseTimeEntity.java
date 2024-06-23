package kr.hs.dgsw.clock_server.global.common.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
@Setter
@Table(name="tbl_base_time")
public class BaseTimeEntity {
    @CreatedDate
    @Column(name = "created_time",nullable = false, updatable = false)
    protected LocalDate createdDate;

    @LastModifiedDate
    @Column(name="modified_time",nullable = false, updatable = false)
    protected LocalDate modifiedDate;
}
