package klausurvorbereitung.iban;

public class FalscheIBANException extends RuntimeException {

    public FalscheIBANException() {}
    public FalscheIBANException(String message) {
        super(message);
    }

}
