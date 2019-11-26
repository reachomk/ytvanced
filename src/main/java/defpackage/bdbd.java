package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: bdbd */
public final class bdbd extends bcuf {
    private final ThreadFactory a;

    public bdbd(ThreadFactory threadFactory) {
        this.a = threadFactory;
    }

    public final bcue a() {
        return new bdbc(this.a);
    }
}
