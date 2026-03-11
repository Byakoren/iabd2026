package fr.esgi.log;


import java.time.LocalDateTime;

public class Log<T extends Readable> implements ILog {

    private T source;
    private CRITICITY criticity;
    private LocalDateTime timestamp;
    private Integer status;

    public Log(CRITICITY criticity, LocalDateTime timestamp, Integer status, T source) {
        this.criticity = criticity;
        this.timestamp = timestamp;
        this.status = status;
        this.source = source;
    }

    public Log() {
    }

    public CRITICITY getCriticity() {
        return criticity;
    }

    public void setCriticity(CRITICITY criticity) {
        this.criticity = criticity;
    }

    public String getMessage() {
        return source.getBody();
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean isSuccess() {
        return false;
    }

    @Override
    public boolean isError() {
        return true;
    }
}
