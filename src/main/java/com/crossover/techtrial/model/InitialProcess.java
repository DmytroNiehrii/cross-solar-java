package com.crossover.techtrial.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Initial process storage representation.
 *
 */
@Entity
@Table(name = "initial_process")
@Data
@NoArgsConstructor
public class InitialProcess implements Serializable {

    private static final long serialVersionUID = 4823383811404210867L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private InitialProcessStatus status;

    public InitialProcess(Long id, InitialProcessStatus status) {
        this.id = id;
        this.status = status;
    }
}
