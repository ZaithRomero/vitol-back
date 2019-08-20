package mx.vitol.back.application.exception;

public class VitolBackDataException extends RuntimeException {
public VitolBackDataException(){ }
public VitolBackDataException(String message)
{super(message);}
public VitolBackDataException(String message, Throwable cause)
{super(message, cause);}
public VitolBackDataException(Throwable cause)
{super(cause);}
public VitolBackDataException(String message, Throwable cause, boolean enableSupression, boolean writableStackTrace)
{super(message, cause,enableSupression,writableStackTrace);}
}