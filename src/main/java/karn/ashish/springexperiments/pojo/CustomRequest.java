package karn.ashish.springexperiments.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@XmlRootElement
@NoArgsConstructor
public class CustomRequest {
    private String name;
    private String id;
    private Date dob;
}
