package peaksoft.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "lessons")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "video_link")
    private String videoLink;
    @ManyToOne(
            fetch = FetchType.LAZY,
            cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    } )
    private Course course;
    @OneToMany(fetch = FetchType.EAGER,
            cascade = {
            CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH
    })
    private List<Task> tasks;

    public Lesson(String firstName, String videoLink, Course courseId, List<Task> tasks) {
        this.firstName = firstName;
        this.videoLink = videoLink;
        this.course = courseId;
        this.tasks = tasks;
    }

    public Lesson(String firstName, String videoLink) {
        this.firstName = firstName;
        this.videoLink = videoLink;
    }
}
