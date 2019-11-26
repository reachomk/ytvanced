package defpackage;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Map;

/* renamed from: cfy */
public class cfy implements Cloneable {
    private int a;
    private boolean b;
    private boolean c;
    public float d = 1.0f;
    public bup e = bup.c;
    public bre f = bre.NORMAL;
    public Drawable g;
    public int h;
    public Drawable i;
    public int j;
    public boolean k = true;
    public int l = -1;
    public int m = -1;
    public bsm n = chf.b;
    public boolean o;
    public boolean p = true;
    public Drawable q;
    public int r;
    public bsq s = new bsq();
    public Map t = new chm();
    public Class u = Object.class;
    public Theme v;
    public boolean w;
    public boolean x;
    public boolean y = true;
    public boolean z;

    private static boolean a(int i, int i2) {
        return (i & i2) != 0;
    }

    public cfy c() {
        if (this.c) {
            return ((cfy) clone()).c();
        }
        this.z = true;
        this.a |= 1048576;
        return a();
    }

    public cfy a(bup bup) {
        if (this.c) {
            return ((cfy) clone()).a(bup);
        }
        this.e = (bup) chw.a((Object) bup);
        this.a |= 4;
        return a();
    }

    public cfy a(bre bre) {
        if (this.c) {
            return ((cfy) clone()).a(bre);
        }
        this.f = (bre) chw.a((Object) bre);
        this.a |= 8;
        return a();
    }

    public cfy a(int i) {
        if (this.c) {
            return ((cfy) clone()).a(i);
        }
        this.j = i;
        i = this.a | 128;
        this.a = i;
        this.i = null;
        this.a = i & -65;
        return a();
    }

    public cfy d() {
        if (this.c) {
            return ((cfy) clone()).d();
        }
        this.k = false;
        this.a |= 256;
        return a();
    }

    public cfy b(int i, int i2) {
        if (this.c) {
            return ((cfy) clone()).b(i, i2);
        }
        this.m = i;
        this.l = i2;
        this.a |= 512;
        return a();
    }

    public cfy a(bsm bsm) {
        if (this.c) {
            return ((cfy) clone()).a(bsm);
        }
        this.n = (bsm) chw.a((Object) bsm);
        this.a |= 1024;
        return a();
    }

    /* renamed from: b */
    public cfy clone() {
        try {
            cfy cfy = (cfy) super.clone();
            cfy.s = new bsq();
            cfy.s.a(this.s);
            cfy.t = new chm();
            cfy.t.putAll(this.t);
            cfy.b = false;
            cfy.c = false;
            return cfy;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public cfy a(bsl bsl, Object obj) {
        if (this.c) {
            return ((cfy) clone()).a(bsl, obj);
        }
        chw.a((Object) bsl);
        chw.a(obj);
        this.s.a(bsl, obj);
        return a();
    }

    public cfy a(Class cls) {
        if (this.c) {
            return ((cfy) clone()).a(cls);
        }
        this.u = (Class) chw.a((Object) cls);
        this.a |= 4096;
        return a();
    }

    public cfy a(cbw cbw) {
        return a(cbw.f, (cbw) chw.a((Object) cbw));
    }

    public cfy e() {
        return b(cbw.b, new cbo());
    }

    public cfy f() {
        return c(cbw.a, new cck());
    }

    public cfy g() {
        return c(cbw.c, new cbn());
    }

    public cfy h() {
        return a(cbw.c, new cbq());
    }

    private final cfy b(cbw cbw, bsr bsr) {
        if (this.c) {
            return ((cfy) clone()).b(cbw, bsr);
        }
        a(cbw);
        return a(bsr, false);
    }

    public final cfy a(cbw cbw, bsr bsr) {
        if (this.c) {
            return ((cfy) clone()).a(cbw, bsr);
        }
        a(cbw);
        return a(bsr);
    }

    private final cfy c(cbw cbw, bsr bsr) {
        cfy b = b(cbw, bsr);
        b.y = true;
        return b;
    }

    public cfy a(bsr bsr) {
        return a(bsr, true);
    }

    private final cfy a(bsr bsr, boolean z) {
        if (this.c) {
            return ((cfy) clone()).a(bsr, z);
        }
        cci cci = new cci(bsr, z);
        a(Bitmap.class, bsr, z);
        a(Drawable.class, cci, z);
        a(BitmapDrawable.class, cci, z);
        a(cdr.class, new cdv(bsr), z);
        return a();
    }

    private final cfy a(Class cls, bsr bsr, boolean z) {
        if (this.c) {
            return ((cfy) clone()).a(cls, bsr, z);
        }
        chw.a((Object) cls);
        chw.a((Object) bsr);
        this.t.put(cls, bsr);
        int i = this.a | 2048;
        this.a = i;
        this.p = true;
        i |= 65536;
        this.a = i;
        this.y = false;
        if (z) {
            this.a = i | 131072;
            this.o = true;
        }
        return a();
    }

    public cfy i() {
        if (this.c) {
            return ((cfy) clone()).i();
        }
        this.t.clear();
        int i = this.a & -2049;
        this.a = i;
        this.o = false;
        i &= -131073;
        this.a = i;
        this.p = false;
        this.a = i | 65536;
        this.y = true;
        return a();
    }

    public cfy b(cfy cfy) {
        if (this.c) {
            return ((cfy) clone()).b(cfy);
        }
        if (cfy.a(cfy.a, 2)) {
            this.d = cfy.d;
        }
        if (cfy.a(cfy.a, 262144)) {
            this.w = cfy.w;
        }
        if (cfy.a(cfy.a, 1048576)) {
            this.z = cfy.z;
        }
        if (cfy.a(cfy.a, 4)) {
            this.e = cfy.e;
        }
        if (cfy.a(cfy.a, 8)) {
            this.f = cfy.f;
        }
        if (cfy.a(cfy.a, 16)) {
            this.g = cfy.g;
            this.h = 0;
            this.a &= -33;
        }
        if (cfy.a(cfy.a, 32)) {
            this.h = cfy.h;
            this.g = null;
            this.a &= -17;
        }
        if (cfy.a(cfy.a, 64)) {
            this.i = cfy.i;
            this.j = 0;
            this.a &= -129;
        }
        if (cfy.a(cfy.a, 128)) {
            this.j = cfy.j;
            this.i = null;
            this.a &= -65;
        }
        if (cfy.a(cfy.a, 256)) {
            this.k = cfy.k;
        }
        if (cfy.a(cfy.a, 512)) {
            this.m = cfy.m;
            this.l = cfy.l;
        }
        if (cfy.a(cfy.a, 1024)) {
            this.n = cfy.n;
        }
        if (cfy.a(cfy.a, 4096)) {
            this.u = cfy.u;
        }
        if (cfy.a(cfy.a, 8192)) {
            this.q = cfy.q;
            this.r = 0;
            this.a &= -16385;
        }
        if (cfy.a(cfy.a, 16384)) {
            this.r = cfy.r;
            this.q = null;
            this.a &= -8193;
        }
        if (cfy.a(cfy.a, 32768)) {
            this.v = cfy.v;
        }
        if (cfy.a(cfy.a, 65536)) {
            this.p = cfy.p;
        }
        if (cfy.a(cfy.a, 131072)) {
            this.o = cfy.o;
        }
        if (cfy.a(cfy.a, 2048)) {
            this.t.putAll(cfy.t);
            this.y = cfy.y;
        }
        if (cfy.a(cfy.a, 524288)) {
            this.x = cfy.x;
        }
        if (!this.p) {
            this.t.clear();
            int i = this.a & -2049;
            this.a = i;
            this.o = false;
            this.a = i & -131073;
            this.y = true;
        }
        this.a |= cfy.a;
        this.s.a(cfy.s);
        return a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cfy) {
            cfy cfy = (cfy) obj;
            if (Float.compare(cfy.d, this.d) == 0 && this.h == cfy.h && chv.a(this.g, cfy.g) && this.j == cfy.j && chv.a(this.i, cfy.i) && this.r == cfy.r && chv.a(this.q, cfy.q) && this.k == cfy.k && this.l == cfy.l && this.m == cfy.m && this.o == cfy.o && this.p == cfy.p && this.w == cfy.w && this.x == cfy.x && this.e.equals(cfy.e) && this.f == cfy.f && this.s.equals(cfy.s) && this.t.equals(cfy.t) && this.u.equals(cfy.u) && chv.a(this.n, cfy.n) && chv.a(this.v, cfy.v)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return chv.a(this.v, chv.a(this.n, chv.a(this.u, chv.a(this.t, chv.a(this.s, chv.a(this.f, chv.a(this.e, chv.b(this.x, chv.b(this.w, chv.b(this.p, chv.b(this.o, chv.b(this.m, chv.b(this.l, chv.b(this.k, chv.a(this.q, chv.b(this.r, chv.a(this.i, chv.b(this.j, chv.a(this.g, chv.b(this.h, chv.a(this.d)))))))))))))))))))));
    }

    public cfy j() {
        this.b = true;
        return this;
    }

    public cfy k() {
        if (!this.b || this.c) {
            this.c = true;
            return j();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    private final cfy a() {
        if (!this.b) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final boolean l() {
        return chv.a(this.m, this.l);
    }

    public final boolean b(int i) {
        return cfy.a(this.a, i);
    }
}
