package defpackage;

/* renamed from: amyd */
public final class amyd extends Exception {
    amyd(Throwable th, amym amym, StackTraceElement[] stackTraceElementArr) {
        super(amym.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    public final Throwable fillInStackTrace() {
        return this;
    }
}
