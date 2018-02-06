package ChainOfResponsibility.infrastructure;

/**
 * Created by navid on 2/5/18.
 * Add request structure.
 */

public class AddRequest {
    private Integer a;
    private Integer b;
    private MediaType desiredMediaType;

    public AddRequest(Integer a, Integer b, MediaType desiredMediaType) {
        this.a = a;
        this.b = b;
        this.desiredMediaType = desiredMediaType;
    }

    public MediaType getDesiredMediaType() {
        return desiredMediaType;
    }

    public void setDesiredMediaType(MediaType desiredMediaType) {
        this.desiredMediaType = desiredMediaType;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }
}
