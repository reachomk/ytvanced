package defpackage;

/* renamed from: bbmt */
public final class bbmt {
    private static final bbmn a;

    public static bbmn a() {
        bbmn bbmn = a;
        if (bbmn != null) {
            return bbmn;
        }
        throw new NullPointerException("scheduler == null");
    }

    static {
        bbmw bbmw = new bbmw();
        try {
            bbmn bbmn = bbmv.a;
            if (bbmn != null) {
                a = bbmn;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            RuntimeException a = bbyw.a(th);
        }
    }
}
