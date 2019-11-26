package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bbyd */
public final class bbyd extends bbmn {
    public static final bbyd a = new bbyd();

    public final bbmp a() {
        return new bbyi();
    }

    bbyd() {
    }

    public final bbnc a(Runnable runnable) {
        bbzf.a(runnable).run();
        return bboc.INSTANCE;
    }

    public final bbnc a(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            bbzf.a(runnable).run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            bbzf.a(e);
        }
        return bboc.INSTANCE;
    }
}
