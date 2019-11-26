package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: bbxh */
final class bbxh implements Future {
    private final bbnc a;

    bbxh(bbnc bbnc) {
        this.a = bbnc;
    }

    public final Object get() {
        return null;
    }

    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }

    public final boolean isCancelled() {
        return false;
    }

    public final boolean isDone() {
        return false;
    }

    public final boolean cancel(boolean z) {
        this.a.bK_();
        return false;
    }
}
