package mx.vitol.back.application.model.out;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Response implements Serializable {
    private boolean resp;
}
