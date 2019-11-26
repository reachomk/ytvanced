package defpackage;

/* renamed from: cmr */
final class cmr extends RuntimeException {
    cmr(cma cma, Throwable th) {
        super(cma.b());
        initCause(th);
        setStackTrace(new StackTraceElement[0]);
    }
}
