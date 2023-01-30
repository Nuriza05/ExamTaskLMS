package peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

/**
 * @created : Lenovo Nuriza
 **/
@Entity

@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "task_name")
    private String taskName;
    private LocalDate deadline;
    private String task;

    public Task(String taskName, LocalDate deadline, String task) {
        this.taskName = taskName;
        this.deadline = deadline;
        this.task = task;
    }

}
