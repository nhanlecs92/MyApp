package nhan.io.demo.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
