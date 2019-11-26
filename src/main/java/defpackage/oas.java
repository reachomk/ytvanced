package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: oas */
public final class oas extends nyn implements nyx {
    private boolean A;
    public final oal[] b;
    public final nyz c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet f = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet g = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public final oux j;
    public final oay k;
    public final obm l;
    public nzw m;
    public nzw n;
    public Surface o;
    public boolean p;
    public odk q;
    public odk r;
    public int s;
    public final float t;
    public ool u;
    public List v;
    private final Handler w;
    private final oar x = new oar(this);
    private int y;
    private int z;

    public oas(Context context, oaq oaq, ous ous, oaa oaa, oux oux, Looper looper) {
        oux oux2 = oux;
        oye oye = oye.a;
        this.j = oux2;
        Looper looper2 = looper;
        this.w = new Handler(looper2);
        Handler handler = this.w;
        oar oar = this.x;
        ArrayList arrayList = new ArrayList();
        nyv nyv = (nyv) oaq;
        Handler handler2 = handler;
        oar oar2 = oar;
        arrayList.add(new ozz(nyv.a, nyv.b, null, false, handler2, oar2, 50));
        Context context2 = nyv.a;
        arrayList.add(new oct(context2, nyv.b, null, false, handler2, oar2, obk.a(context2), new obq[0]));
        arrayList.add(new ors(oar, handler.getLooper()));
        arrayList.add(new olr(oar, handler.getLooper()));
        arrayList.add(new par());
        this.b = (oal[]) arrayList.toArray(new oal[0]);
        this.t = 1.0f;
        this.s = 0;
        this.v = Collections.emptyList();
        this.c = new nyz(this.b, ous, oaa, oux, oye, looper2);
        this.k = oax.a(this.c, oye);
        a(this.k);
        a(this.x);
        this.h.add(this.k);
        this.d.add(this.k);
        this.i.add(this.k);
        this.e.add(this.k);
        this.g.add(this.k);
        oux2.a(this.w, this.k);
        this.l = new obm(context, this.x);
    }

    public final void a(Surface surface) {
        s();
        int i = 0;
        a(surface, false);
        if (surface != null) {
            i = -1;
        }
        a(i, i);
    }

    public final Looper d() {
        return this.c.d();
    }

    public final void a(oah oah) {
        s();
        this.c.a(oah);
    }

    public final int e() {
        s();
        return this.c.e();
    }

    public final void a(ool ool) {
        s();
        ool ool2 = this.u;
        if (ool2 != null) {
            ool2.a(this.k);
            this.k.d();
        }
        this.u = ool;
        ool.a(this.w, this.k);
        a(f(), f() ? this.l.b() : -1);
        this.c.b(ool);
    }

    public final void a(boolean z) {
        s();
        obm obm = this.l;
        int e = e();
        int i = 1;
        if (!z) {
            obm.c();
            i = -1;
        } else if (e != 1) {
            i = obm.b();
        }
        a(z, i);
    }

    public final boolean f() {
        s();
        return this.c.d;
    }

    public final int g() {
        s();
        return 0;
    }

    public final boolean h() {
        s();
        return false;
    }

    public final void a(int i, long j) {
        s();
        this.k.c();
        this.c.a(i, j);
    }

    public final void a(oag oag) {
        s();
        this.c.a(oag);
    }

    public final oag i() {
        s();
        return this.c.h;
    }

    public final void j() {
        s();
        this.c.j();
        ool ool = this.u;
        if (ool != null) {
            ool.a(this.k);
            this.k.d();
        }
        this.l.a();
        this.v = Collections.emptyList();
    }

    public final oak a(oam oam) {
        s();
        return this.c.a(oam);
    }

    public final oau r() {
        s();
        return this.c.r();
    }

    public final int k() {
        s();
        return this.c.k();
    }

    public final long l() {
        s();
        return this.c.l();
    }

    public final long m() {
        s();
        return this.c.m();
    }

    public final long n() {
        s();
        return this.c.n();
    }

    public final int o() {
        s();
        return this.c.o();
    }

    public final int p() {
        s();
        return this.c.p();
    }

    public final long q() {
        s();
        return this.c.q();
    }

    public final void a(Surface surface, boolean z) {
        ArrayList<oak> arrayList = new ArrayList();
        for (oam oam : this.b) {
            if (oam.a() == 2) {
                oak a = this.c.a(oam);
                a.a(1);
                a.a((Object) surface);
                a.a();
                arrayList.add(a);
            }
        }
        Surface surface2 = this.o;
        if (!(surface2 == null || surface2 == surface)) {
            try {
                for (oak c : arrayList) {
                    c.c();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.p) {
                this.o.release();
            }
        }
        this.o = surface;
        this.p = z;
    }

    public final void a(int i, int i2) {
        if (i != this.y || i2 != this.z) {
            this.y = i;
            this.z = i2;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((pai) it.next()).f();
            }
        }
    }

    public final void a(boolean z, int i) {
        nyz nyz = this.c;
        boolean z2 = true;
        z = z && i != -1;
        if (i == 1) {
            z2 = false;
        }
        nyz.a(z, z2);
    }

    public final void s() {
        if (Looper.myLooper() != this.c.b.getLooper()) {
            oyp.a("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/troubleshooting.html#what-do-player-is-accessed-on-the-wrong-thread-warnings-mean", !this.A ? new IllegalStateException() : null);
            this.A = true;
        }
    }
}
