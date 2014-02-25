package fr.univaix.iut.pokebattle.tuse;

/**
 * Created by nedjar on 25/02/14.
 */
public class TUSERuntimeException extends RuntimeException {
    public TUSERuntimeException() {
    }

    public TUSERuntimeException(String message) {
        super(message);
    }

    public TUSERuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TUSERuntimeException(Throwable cause) {
        super(cause);
    }

    public TUSERuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
