package defpackage;

import java.util.concurrent.TimeoutException;

/* renamed from: ankr */
final class ankr extends TimeoutException {
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* synthetic */ ankr(String str) {
        super(str);
    }
}
