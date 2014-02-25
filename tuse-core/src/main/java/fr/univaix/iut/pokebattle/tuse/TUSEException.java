package fr.univaix.iut.pokebattle.tuse;

/**
 * Created by nedjar on 25/02/14.
 */
public class TUSEException extends Exception {
    public TUSEException() {
    }

    public TUSEException(String message) {
        super(message);
    }

    public TUSEException(String message, Throwable cause) {
        super(message, cause);
    }

    public TUSEException(Throwable cause) {
        super(cause);
    }

    public TUSEException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
