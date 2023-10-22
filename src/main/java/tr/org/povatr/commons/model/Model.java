package tr.org.povatr.commons.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder(toBuilder = true)
public class Model {

    private String id;
    private Date createdDate;
    private String createdBy;
    private Date updatedDate;
    private String updatedBy;
}
