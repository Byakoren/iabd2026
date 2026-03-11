package fr.esgi.log;

public class Request<T extends ILog> {

    private T body;

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public boolean isBodySuccess() {
        return body.isSuccess();
    }
}
