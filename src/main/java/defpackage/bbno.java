package defpackage;

/* renamed from: bbno */
public final class bbno extends RuntimeException {
    public static final long serialVersionUID = -6298857009889503852L;

    public bbno(Throwable th) {
        String message = th != null ? th.getMessage() : null;
        if (th == null) {
            th = new NullPointerException();
        }
        super(message, th);
    }
}
