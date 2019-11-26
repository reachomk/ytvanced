package defpackage;

/* renamed from: bcve */
public final class bcve extends RuntimeException {
    public static final long serialVersionUID = -6298857009889503852L;

    public bcve(String str, Throwable th) {
        super(str, th);
    }

    public bcve(Throwable th) {
        String message = th != null ? th.getMessage() : null;
        if (th == null) {
            th = new NullPointerException();
        }
        super(message, th);
    }
}
