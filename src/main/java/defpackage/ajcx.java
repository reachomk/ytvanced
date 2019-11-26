package defpackage;

import android.os.Handler;
import java.security.SecureRandom;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: ajcx */
public final class ajcx {
    public final aayd a;
    public final String b;
    public final ajdd c;
    public final atdh d;
    public final byte[] e;
    public final String f;
    public volatile long g;
    public int h;
    private final xsc i;
    private final Executor j;
    private final Handler k;
    private final SecureRandom l;
    private final Runnable m = new ajda(this);
    private final AtomicInteger n = new AtomicInteger();
    private volatile boolean o;

    public final synchronized void a() {
        if (this.g == 0) {
            this.g = this.i.b() + 2000;
        }
    }

    public final synchronized void a(ahkm ahkm) {
        if (ahkm.g && !this.o && this.g != 0 && this.g <= this.i.b()) {
            this.o = true;
            this.j.execute(this.m);
        }
    }

    public final synchronized ajcy b() {
        return new ajcy(this.d, this.e, this.f, this.g, this.h);
    }

    public final void c() {
        this.n.set(0);
        this.o = false;
        this.g = this.i.b() + this.d.c;
    }

    public final void a(ahjc ahjc) {
        this.n.set(0);
        this.o = false;
        this.g = 0;
        this.k.post(new ajcw(this, ahjc));
    }

    /* synthetic */ ajcx(xsc xsc, Executor executor, Handler handler, SecureRandom secureRandom, aayd aayd, String str, ajdd ajdd, atdh atdh, byte[] bArr, String str2) {
        this.i = xsc;
        this.j = executor;
        this.k = handler;
        this.l = secureRandom;
        this.a = aayd;
        this.b = str;
        this.c = ajdd;
        this.d = atdh;
        this.e = bArr;
        this.f = str2;
    }

    public final void a(Exception exception, int i) {
        int incrementAndGet = this.n.incrementAndGet();
        atdh atdh = this.d;
        if (((long) incrementAndGet) <= atdh.d) {
            this.o = false;
            this.g = (((long) (this.n.get() * 2000)) + this.i.b()) + ((long) (this.l.nextInt(999) - 499));
        } else if (atdh.f) {
            c();
        } else {
            a(new ahjc(i, (Throwable) exception));
        }
    }
}
