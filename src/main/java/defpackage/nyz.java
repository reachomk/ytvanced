package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: nyz */
public final class nyz extends nyn implements nyx {
    public final Handler b;
    public final nzn c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public oag h;
    public oad i;
    public int j;
    public int k;
    public long l;
    private final ouu m;
    private final ous n;
    private final Handler o;
    private final CopyOnWriteArrayList p;
    private final oaw q;
    private final ArrayDeque r;
    private boolean s;

    public nyz(oal[] oalArr, ous ous, oaa oaa, oux oux, oye oye, Looper looper) {
        String toHexString = Integer.toHexString(System.identityHashCode(this));
        String str = ozp.e;
        String.valueOf(toHexString).length();
        String.valueOf(str).length();
        int length = oalArr.length;
        oxz.b(length > 0);
        oxz.a((Object) oalArr);
        this.n = (ous) oxz.a((Object) ous);
        this.d = false;
        this.p = new CopyOnWriteArrayList();
        this.m = new ouu(new oan[length], new oum[length], null);
        this.q = new oaw();
        this.h = oag.a;
        this.b = new nzf(this, looper);
        this.i = oad.a(0, this.m);
        this.r = new ArrayDeque();
        this.c = new nzn(oalArr, ous, this.m, oaa, oux, this.d, this.b, oye);
        this.o = new Handler(this.c.b());
    }

    public final int g() {
        return 0;
    }

    public final boolean h() {
        return false;
    }

    public final Looper d() {
        return this.c.b();
    }

    public final void a(oah oah) {
        this.p.addIfAbsent(new nyq(oah));
    }

    public final int e() {
        return this.i.f;
    }

    public final void a(ool ool) {
        b(ool);
    }

    public final void b(ool ool) {
        oad a = a(true, true, 2);
        this.f = true;
        this.e++;
        this.c.a.a((Object) ool).sendToTarget();
        a(a, false, 4, 1, false);
    }

    public final void a(boolean z) {
        a(z, false);
    }

    public final void a(boolean z, boolean z2) {
        int i = false;
        if (z && !z2) {
            i = true;
        }
        if (this.s != i) {
            this.s = i;
            this.c.a.a(1, i).sendToTarget();
        }
        if (this.d != z) {
            this.d = z;
            a(new nzc(z, this.i.f));
        }
    }

    public final boolean f() {
        return this.d;
    }

    public final void a(int i, long j) {
        oau oau = this.i.a;
        if (i < 0 || (!oau.c() && i >= oau.a())) {
            throw new nzx();
        }
        this.g = true;
        this.e++;
        if (s()) {
            oyp.a("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            this.b.obtainMessage(0, 1, -1, this.i).sendToTarget();
            return;
        }
        this.j = i;
        if (oau.c()) {
            this.l = j == -9223372036854775807L ? 0 : j;
            this.k = 0;
        } else {
            long j2;
            if (j == -9223372036854775807L) {
                j2 = oau.a(i, this.a).h;
            } else {
                j2 = nyr.b(j);
            }
            long j3 = j2;
            Pair a = oau.a(this.a, this.q, i, j3);
            this.l = nyr.a(j3);
            this.k = oau.a(a.first);
        }
        this.c.a.a(3, new nzu(oau, i, nyr.b(j))).sendToTarget();
        a(nzb.a);
    }

    public final void a(oag oag) {
        this.c.a.a(4, (Object) oag).sendToTarget();
    }

    public final oag i() {
        return this.h;
    }

    public final void j() {
        oad a = a(false, false, 1);
        this.e++;
        this.c.a.a(6, 0).sendToTarget();
        a(a, false, 4, 1, false);
    }

    public final oak a(oam oam) {
        return new oak(this.c, oam, this.i.a, k(), this.o);
    }

    public final int k() {
        if (t()) {
            return this.j;
        }
        oad oad = this.i;
        return oad.a.a(oad.c.a, this.q).b;
    }

    public final long l() {
        if (t()) {
            return this.l;
        }
        if (this.i.c.a()) {
            return nyr.a(this.i.m);
        }
        oad oad = this.i;
        return a(oad.c, oad.m);
    }

    public final long m() {
        oad oad;
        long a;
        if (s()) {
            oad = this.i;
            if (oad.j.equals(oad.c)) {
                a = nyr.a(this.i.k);
            } else if (s()) {
                oad = this.i;
                ook ook = oad.c;
                oad.a.a(ook.a, this.q);
                a = nyr.a(this.q.b(ook.b, ook.c));
            } else {
                oau r = r();
                a = !r.c() ? r.a(k(), this.a).b() : -9223372036854775807L;
            }
            return a;
        }
        if (t()) {
            a = this.l;
        } else {
            oad = this.i;
            if (oad.j.d != oad.c.d) {
                a = oad.a.a(k(), this.a).b();
            } else {
                a = oad.k;
                if (this.i.j.a()) {
                    oad = this.i;
                    oaw a2 = oad.a.a(oad.j.a, this.q);
                    long a3 = a2.a(this.i.j.b);
                    a = a3 == Long.MIN_VALUE ? a2.c : a3;
                }
                a = a(this.i.j, a);
            }
        }
        return a;
    }

    public final long n() {
        return Math.max(0, nyr.a(this.i.l));
    }

    private final boolean s() {
        return !t() && this.i.c.a();
    }

    public final int o() {
        return s() ? this.i.c.b : -1;
    }

    public final int p() {
        return s() ? this.i.c.c : -1;
    }

    public final long q() {
        if (!s()) {
            return l();
        }
        oad oad = this.i;
        oad.a.a(oad.c.a, this.q);
        return this.q.a() + nyr.a(this.i.e);
    }

    public final oau r() {
        return this.i.a;
    }

    public final oad a(boolean z, boolean z2, int i) {
        ook a;
        oau oau;
        opz opz;
        Object obj = 1;
        long j = 0;
        if (z) {
            this.j = 0;
            this.k = 0;
            this.l = 0;
        } else {
            int i2;
            this.j = k();
            if (t()) {
                i2 = this.k;
            } else {
                oad oad = this.i;
                i2 = oad.a.a(oad.c.a);
            }
            this.k = i2;
            this.l = l();
            if (!z2) {
                obj = null;
            }
        }
        if (obj != null) {
            a = this.i.a(false, this.a);
        } else {
            a = this.i.c;
        }
        ook ook = a;
        if (obj == null) {
            j = this.i.m;
        }
        long j2 = j;
        long j3 = obj == null ? this.i.e : -9223372036854775807L;
        if (z2) {
            oau = oau.a;
        } else {
            oau = this.i.a;
        }
        oau oau2 = oau;
        Object obj2 = !z2 ? this.i.b : null;
        if (z2) {
            opz = opz.a;
        } else {
            opz = this.i.h;
        }
        return new oad(oau2, obj2, ook, j2, j3, i, false, opz, !z2 ? this.i.i : this.m, ook, j2, 0, j2);
    }

    public final void a(oad oad, boolean z, int i, int i2, boolean z2) {
        oad oad2 = this.i;
        oad oad3 = oad;
        this.i = oad3;
        a(new nzi(oad3, oad2, this.p, this.n, z, i, i2, z2, this.d));
    }

    public final void a(nyp nyp) {
        a(new nzg(new CopyOnWriteArrayList(this.p), nyp));
    }

    private final void a(Runnable runnable) {
        boolean isEmpty = this.r.isEmpty();
        this.r.addLast(runnable);
        if ((isEmpty ^ 1) == 0) {
            while (!this.r.isEmpty()) {
                ((Runnable) this.r.peekFirst()).run();
                this.r.removeFirst();
            }
        }
    }

    private final long a(ook ook, long j) {
        j = nyr.a(j);
        this.i.a.a(ook.a, this.q);
        return j + this.q.a();
    }

    private final boolean t() {
        return this.i.a.c() || this.e > 0;
    }

    public static void a(CopyOnWriteArrayList copyOnWriteArrayList, nyp nyp) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            nyp.a(((nyq) it.next()).a);
        }
    }
}
