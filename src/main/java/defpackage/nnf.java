package defpackage;

import android.os.SystemClock;

/* renamed from: nnf */
final class nnf implements nma {
    public boolean a;
    public long b;
    public long c;

    nnf() {
    }

    public final void a() {
        if (this.a) {
            this.b = nnf.b(this.c);
            this.a = false;
        }
    }

    public final void a(long j) {
        this.b = j;
        this.c = nnf.b(j);
    }

    public final long k() {
        return this.a ? nnf.b(this.c) : this.b;
    }

    public static long b(long j) {
        return (SystemClock.elapsedRealtime() * 1000) - j;
    }
}
