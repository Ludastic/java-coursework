package course.reqmodels;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ReqComment {
    private String header;
    private String eventName;
    private String text;
    private String name;
}

