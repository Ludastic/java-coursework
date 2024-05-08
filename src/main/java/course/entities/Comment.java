package course.entities;

import course.reqmodels.ReqComment;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "comments")
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "header")
    private String header;
    @Column(name = "event-name")
    private String eventName;
    @Column(name = "text", length = 1000)
    private String text;
    @Column(name = "name")
    private String name;


    public Comment(ReqComment reqComment) {
        this.header = reqComment.getHeader();
        this.eventName = reqComment.getEventName();
        this.text = reqComment.getText();
        this.name = reqComment.getName();
    }
}
