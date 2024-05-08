package course.reqmodels;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ReqForm {
    @JsonProperty("telNumb") private String telNumb;
    @JsonProperty("amountOfPeople") private Integer amountOfPeople;
    @JsonProperty("name") private String name;
    @JsonProperty("surName") private String surName;
    @JsonProperty("lastName") private String lastName;
    @JsonProperty("eventType") private String eventType;
}
