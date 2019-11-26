package defpackage;

import android.os.Handler;

/* renamed from: oak */
public final class oak {
    public final oam a;
    public final oau b;
    public int c;
    public Object d;
    public final Handler e;
    public final int f;
    public final long g = -9223372036854775807L;
    public final boolean h = true;
    private final oaj i;
    private boolean j;
    private boolean k;
    private boolean l;

    public oak(oaj oaj, oam oam, oau oau, int i, Handler handler) {
        this.i = oaj;
        this.a = oam;
        this.b = oau;
        this.e = handler;
        this.f = i;
    }

    public final synchronized boolean b() {
        return false;
    }

    public final oak a(int i) {
        oxz.b(this.j ^ 1);
        this.c = i;
        return this;
    }

    public final oak a(Object obj) {
        oxz.b(this.j ^ 1);
        this.d = obj;
        return this;
    }

    public final oak a() {
        oxz.b(this.j ^ 1);
        if (this.g == -9223372036854775807L) {
            oxz.a(this.h);
        }
        this.j = true;
        this.i.a(this);
        return this;
    }

    public final synchronized boolean c() {
        oxz.b(this.j);
        oxz.b(this.e.getLooper().getThread() != Thread.currentThread());
        while (!this.l) {
            wait();
        }
        return this.k;
    }

    public final synchronized void a(boolean z) {
        this.k = z | this.k;
        this.l = true;
        notifyAll();
    }
}
