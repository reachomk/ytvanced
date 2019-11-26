package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import com.google.android.apps.youtube.app.watch.nextgenwatch.flexy.FlexyBehavior;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/* renamed from: lip */
public final class lip extends lkn implements lif, lij, lik {
    private int A = 1;
    public final FlexyBehavior a;
    public float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    private final acum j;
    private final Rect k;
    private final Rect l;
    private final Rect m;
    private final Rect n;
    private final lin o;
    private final ValueAnimator p;
    private final TreeMap q;
    private final Set r;
    private final float s;
    private boolean t;
    private boolean u;
    private float v;
    private amwi w;
    private float x;
    private float y;
    private boolean z;

    public lip(Context context, acum acum, lin lin, lio lio) {
        this.j = acum;
        this.o = lin;
        this.s = lin.a;
        this.a = new FlexyBehavior(context, this, this);
        this.k = new Rect();
        this.l = new Rect();
        this.m = new Rect();
        this.n = new Rect();
        this.v = 1.777f;
        this.b = 1.777f;
        this.q = new TreeMap(lis.a);
        this.r = new HashSet();
        int i = 0;
        this.p = ValueAnimator.ofInt(new int[0]);
        this.p.setDuration(300).setFloatValues(new float[]{0.0f, 1.0f});
        this.p.addUpdateListener(new lir(this));
        x();
        lio.c = this;
        while (i < lio.a.size()) {
            a((lix) lio.a.valueAt(i));
            i++;
        }
        Iterator it = lio.b.iterator();
        while (it.hasNext()) {
            a((lim) it.next());
        }
        lio.a.clear();
        lio.b.clear();
    }

    public final void f() {
    }

    public final void g() {
    }

    public final float m() {
        return 1.0f;
    }

    public final float n() {
        return 1.0f;
    }

    public final float o() {
        return 0.0f;
    }

    public final float p() {
        return 0.0f;
    }

    public final float q() {
        return 0.0f;
    }

    public final float r() {
        return 1.0f;
    }

    public final FlexyBehavior a() {
        return this.a;
    }

    public final int b() {
        return this.l.height();
    }

    public final int c() {
        return ((Integer) this.w.b()).intValue();
    }

    public final int d() {
        return ((Integer) this.w.a()).intValue();
    }

    public final void b(int i) {
        if (c() >= i && d() <= i) {
            a(((float) this.e) / ((float) i), false, true);
        }
    }

    public final boolean e() {
        return fnz.a(this.x, this.y);
    }

    public final Rect h() {
        return this.k;
    }

    public final Rect i() {
        return this.l;
    }

    public final Rect j() {
        return this.m;
    }

    public final Rect k() {
        return i;
    }

    public final Rect l() {
        return this.n;
    }

    public final void b_(int i, int i2) {
        int i3 = this.e;
        Object obj = 1;
        Object obj2 = (i == i3 && i2 == this.d) ? 1 : null;
        if (!(i3 == this.g && this.d == this.f)) {
            obj = null;
        }
        if (obj2 == null || obj == null) {
            b(i, i2);
            if (this.c == 0) {
                this.c = Math.round(((float) i) / this.b);
            }
            this.g = i;
            this.f = i2;
            b(this.x, this.p.isRunning(), false);
        }
    }

    public final void a(lix lix) {
        amqw.a((Object) lix);
        this.q.put(Integer.valueOf(lix.a()), lix);
        this.u = true;
        lix.a();
        w();
        y();
    }

    public final lix a(int i) {
        lix lix = (lix) this.q.remove(Integer.valueOf(i));
        if (lix == null) {
            return null;
        }
        lix.a();
        w();
        y();
        return lix;
    }

    private final lix u() {
        Entry firstEntry = this.q.firstEntry();
        return firstEntry != null ? (lix) firstEntry.getValue() : null;
    }

    public final void a(int i, boolean z) {
        float f;
        if (i != 0) {
            f = this.y;
        } else {
            f = this.x;
        }
        a(f, true, z);
    }

    public final void a(lim lim) {
        this.r.add((lim) amqw.a((Object) lim));
    }

    public final void b(lim lim) {
        this.r.remove(amqw.a((Object) lim));
    }

    /* Access modifiers changed, original: final */
    public final void a(float f) {
        if (f != 0.0f && !fnz.a(f, this.v)) {
            this.t |= fnz.a(this.v, f) ^ 1;
            this.v = f;
            lix u = u();
            this.x = u != null ? ((Float) u.a(f).a()).floatValue() : f;
            if (u == null) {
                f = this.s;
            } else {
                f = ((Float) u.a(f).b()).floatValue();
            }
            b(f);
            f = this.x;
            if (f > this.y) {
                b(f);
            }
            b(this.e, this.d);
        }
    }

    private final boolean v() {
        return !this.q.isEmpty() && ((Integer) this.q.firstEntry().getKey()).intValue() == 1;
    }

    private final void w() {
        lix u = u();
        if (u != null) {
            this.x = ((Float) u.a(this.v).a()).floatValue();
            b(((Float) u.a(this.v).b()).floatValue());
        } else {
            x();
        }
        b(this.g, this.f);
    }

    private final void b(float f) {
        this.t |= fnz.a(f, this.y) ^ 1;
        this.y = f;
    }

    private final void x() {
        float f = this.v;
        this.x = f;
        b(Math.max(f, this.s));
    }

    private static int a(int i, float f) {
        return Math.round(((float) i) / f);
    }

    private final void b(int i, int i2) {
        float f = this.y;
        if (f == 0.0f) {
            f = this.v;
        }
        float f2 = this.x;
        if (f2 == 0.0f) {
            f2 = this.v;
        }
        if (f < f2) {
            afpc.a(2, afpf.main, String.format("Flexy invalid boundedMaxPlayerRatio=%s < boundedMinPlayerRatio=%s  maxPlayerRatio=%s minPlayerRatio=%s videoRatio=%s", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(this.y), Float.valueOf(this.x), Float.valueOf(this.v)}));
            f2 = Math.max(f2, f);
        }
        i2 = Math.max(Math.round(((float) i) / 1.777f), Math.min(Math.round(((float) i2) * this.o.b), i2 - this.o.c));
        int min = Math.min(i2, lip.a(i, f));
        int min2 = Math.min(i2, lip.a(i, f2));
        if (min > min2) {
            afpc.a(2, afpf.main, String.format("Flexy cannot have minBoundedPlayerHeight=%s > maxBoundedPlayerHeight=%s boundsWidth=%s maxPlayerHeight=%s boundedMaxPlayerRatio=%s boundedMinPlayerRatio=%s", new Object[]{Integer.valueOf(min), Integer.valueOf(min2), Integer.valueOf(i), Integer.valueOf(i2), Float.valueOf(f), Float.valueOf(f2)}));
            min2 = min;
        }
        amwi a = amwi.a(Integer.valueOf(min), Integer.valueOf(min2));
        amwi amwi = this.w;
        if (amwi == null || !amwi.equals(a)) {
            this.t = true;
            this.w = a;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(float f, boolean z, boolean z2) {
        if (!this.q.containsKey(Integer.valueOf(4))) {
            b(f, z, z2);
        }
    }

    private final void y() {
        this.t |= v();
        b(this.b, true, false);
    }

    private final void b(float f, boolean z, boolean z2) {
        if (!(this.g == 0 || this.f == 0)) {
            f = Math.min(Math.max(f, Math.max(this.v, this.x)), this.y);
            int a = lip.a(this.g, f);
            if (!this.w.a(Integer.valueOf(a))) {
                Integer num;
                if (((Integer) this.w.a()).intValue() > a) {
                    num = (Integer) this.w.a();
                } else {
                    num = (Integer) this.w.b();
                }
                a = num.intValue();
            }
            amwi amwi = this.w;
            if (e()) {
                b(2, z2);
            } else if (a == ((Integer) amwi.b()).intValue()) {
                b(5, z2);
            } else if (a == ((Integer) amwi.a()).intValue()) {
                b(3, z2);
            } else {
                b(4, z2);
            }
            boolean z3 = false;
            if (fnz.b(this.v, this.s) && fnz.a(f, this.s)) {
                z3 = true;
            }
            if (this.z != z3) {
                this.z = z3;
                for (lim a2 : this.r) {
                    a2.a(z3);
                }
            }
            this.p.cancel();
            if (z) {
                this.h = a;
                this.p.start();
            } else {
                a(a, this.g, this.f);
            }
        }
    }

    public final void a(int i, int i2, int i3) {
        if (i != this.l.height() || i2 != this.e || i3 != this.d || this.t || this.u) {
            this.t = false;
            this.u = false;
            this.c = i;
            this.d = i3;
            this.e = i2;
            this.b = ((float) i2) / ((float) i);
            this.l.set(0, 0, i2, i);
            this.m.set(0, i, i2, Math.max(!e() ? i3 - ((Integer) this.w.a()).intValue() : i3 - i, 0) + i);
            if (v()) {
                fpe.b(this.v, this.l, this.k);
            } else {
                this.k.set(0, 0, i2, lip.a(i2, this.v));
                this.k.offset(0, -((this.k.height() - this.l.height()) / 3));
            }
            t();
        }
    }

    public final void b(int i, boolean z) {
        if (i != this.A) {
            this.A = i;
            arki arki = (arki) arkj.d.createBuilder();
            int i2 = this.A;
            arki.copyOnWrite();
            arkj arkj = (arkj) arki.instance;
            if (i2 != 0) {
                arkj.a |= 1;
                arkj.b = i2 - 1;
                arki.copyOnWrite();
                arkj arkj2 = (arkj) arki.instance;
                arkj2.a |= 2;
                arkj2.c = z;
                arkj arkj3 = (arkj) ((anxl) arki.build());
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.copyOnWrite();
                asmw asmw = (asmw) asmz.instance;
                if (arkj3 != null) {
                    asmw.c = arkj3;
                    asmw.b = 100;
                    this.j.a((asmw) ((anxl) asmz.build()));
                    return;
                }
                throw new NullPointerException();
            }
            throw new NullPointerException();
        }
    }
}
