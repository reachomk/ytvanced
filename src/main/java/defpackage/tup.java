package defpackage;

import android.os.Debug;

/* renamed from: tup */
final class tup {
    public final long a;
    private final long b;

    private tup(long j, long j2) {
        this.b = j;
        this.a = j2;
    }

    /* Access modifiers changed, original: final */
    public final long a() {
        return this.b / 1000;
    }

    static tup a(tup tup, tup tup2) {
        return new tup(tup.b - tup2.b, tup.a - tup2.a);
    }

    static tup b() {
        return new tup(System.nanoTime(), Debug.threadCpuTimeNanos());
    }
}
