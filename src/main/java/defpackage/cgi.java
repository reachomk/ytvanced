package defpackage;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: cgi */
public final class cgi implements cfz, cgf, cgr, cid {
    public static final zy a = chx.a(150, new cgh());
    private RuntimeException A;
    private int B;
    private boolean b;
    private final cif c = cif.a();
    private cgd d;
    private cgc e;
    private Context f;
    private brb g;
    private Object h;
    private Class i;
    private cfy j;
    private int k;
    private int l;
    private bre m;
    private cgu n;
    private List o;
    private buv p;
    private chd q;
    private Executor r;
    private bvw s;
    private bvb t;
    private long u;
    private Drawable v;
    private Drawable w;
    private Drawable x;
    private int y;
    private int z;

    public final synchronized void a(Context context, brb brb, Object obj, Class cls, cfy cfy, int i, int i2, bre bre, cgu cgu, cgd cgd, List list, cgc cgc, buv buv, chd chd, Executor executor) {
        this.f = context;
        this.g = brb;
        this.h = obj;
        this.i = cls;
        this.j = cfy;
        this.k = i;
        this.l = i2;
        this.m = bre;
        this.n = cgu;
        this.d = cgd;
        this.o = list;
        this.e = cgc;
        this.p = buv;
        this.q = chd;
        this.r = executor;
        this.B = 1;
        if (this.A == null) {
            boolean z = brb.h;
        }
    }

    public final cif h_() {
        return this.c;
    }

    public final synchronized void h() {
        i();
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = -1;
        this.l = -1;
        this.n = null;
        this.o = null;
        this.d = null;
        this.e = null;
        this.q = null;
        this.t = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = -1;
        this.z = -1;
        this.A = null;
        a.a(this);
    }

    /* JADX WARNING: Missing block: B:26:0x0061, code skipped:
            if (r0 == 3) goto L_0x0063;
     */
    /* JADX WARNING: Missing block: B:31:0x0073, code skipped:
            return;
     */
    public final synchronized void a() {
        /*
        r5 = this;
        monitor-enter(r5);
        r5.i();	 Catch:{ all -> 0x0083 }
        r0 = r5.c;	 Catch:{ all -> 0x0083 }
        r0.b();	 Catch:{ all -> 0x0083 }
        r0 = defpackage.chs.a();	 Catch:{ all -> 0x0083 }
        r5.u = r0;	 Catch:{ all -> 0x0083 }
        r0 = r5.h;	 Catch:{ all -> 0x0083 }
        r1 = 5;
        r2 = 3;
        if (r0 != 0) goto L_0x003b;
    L_0x0015:
        r0 = r5.k;	 Catch:{ all -> 0x0083 }
        r3 = r5.l;	 Catch:{ all -> 0x0083 }
        r0 = defpackage.chv.a(r0, r3);	 Catch:{ all -> 0x0083 }
        if (r0 == 0) goto L_0x0027;
    L_0x001f:
        r0 = r5.k;	 Catch:{ all -> 0x0083 }
        r5.y = r0;	 Catch:{ all -> 0x0083 }
        r0 = r5.l;	 Catch:{ all -> 0x0083 }
        r5.z = r0;	 Catch:{ all -> 0x0083 }
    L_0x0027:
        r0 = r5.k();	 Catch:{ all -> 0x0083 }
        if (r0 != 0) goto L_0x002e;
    L_0x002d:
        goto L_0x002f;
    L_0x002e:
        r1 = 3;
    L_0x002f:
        r0 = new bvn;	 Catch:{ all -> 0x0083 }
        r2 = "Received null model";
        r0.<init>(r2);	 Catch:{ all -> 0x0083 }
        r5.a(r0, r1);	 Catch:{ all -> 0x0083 }
        monitor-exit(r5);
        return;
    L_0x003b:
        r0 = r5.B;	 Catch:{ all -> 0x0083 }
        r3 = 2;
        if (r0 == r3) goto L_0x007b;
    L_0x0040:
        r4 = 4;
        if (r0 == r4) goto L_0x0074;
    L_0x0043:
        r5.B = r2;	 Catch:{ all -> 0x0083 }
        r0 = r5.k;	 Catch:{ all -> 0x0083 }
        r1 = r5.l;	 Catch:{ all -> 0x0083 }
        r0 = defpackage.chv.a(r0, r1);	 Catch:{ all -> 0x0083 }
        if (r0 == 0) goto L_0x0057;
    L_0x004f:
        r0 = r5.k;	 Catch:{ all -> 0x0083 }
        r1 = r5.l;	 Catch:{ all -> 0x0083 }
        r5.a(r0, r1);	 Catch:{ all -> 0x0083 }
        goto L_0x005c;
    L_0x0057:
        r0 = r5.n;	 Catch:{ all -> 0x0083 }
        r0.a(r5);	 Catch:{ all -> 0x0083 }
    L_0x005c:
        r0 = r5.B;	 Catch:{ all -> 0x0083 }
        if (r0 != r3) goto L_0x0061;
    L_0x0060:
        goto L_0x0063;
    L_0x0061:
        if (r0 != r2) goto L_0x0072;
    L_0x0063:
        r0 = r5.m();	 Catch:{ all -> 0x0083 }
        if (r0 == 0) goto L_0x0072;
    L_0x0069:
        r0 = r5.n;	 Catch:{ all -> 0x0083 }
        r1 = r5.j();	 Catch:{ all -> 0x0083 }
        r0.b(r1);	 Catch:{ all -> 0x0083 }
    L_0x0072:
        monitor-exit(r5);
        return;
    L_0x0074:
        r0 = r5.s;	 Catch:{ all -> 0x0083 }
        r5.a(r0, r1);	 Catch:{ all -> 0x0083 }
        monitor-exit(r5);
        return;
    L_0x007b:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x0083 }
        r1 = "Cannot restart a running request";
        r0.<init>(r1);	 Catch:{ all -> 0x0083 }
        throw r0;	 Catch:{ all -> 0x0083 }
    L_0x0083:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgi.a():void");
    }

    private final void i() {
        if (this.b) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public final synchronized void b() {
        i();
        this.c.b();
        if (this.B != 6) {
            i();
            this.c.b();
            this.n.b((cgr) this);
            bvb bvb = this.t;
            if (bvb != null) {
                synchronized (bvb.c) {
                    bvb.a.c(bvb.b);
                }
                this.t = null;
            }
            bvw bvw = this.s;
            if (bvw != null) {
                a(bvw);
            }
            cgc cgc = this.e;
            if (cgc == null || cgc.d(this)) {
                this.n.a(j());
            }
            this.B = 6;
        }
    }

    private final void a(bvw bvw) {
        if (bvw instanceof bvl) {
            ((bvl) bvw).f();
            this.s = null;
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    public final synchronized boolean c() {
        boolean z;
        int i = this.B;
        z = i == 2 || i == 3;
        return z;
    }

    public final synchronized boolean d() {
        return this.B == 4;
    }

    public final synchronized boolean e() {
        return d();
    }

    public final synchronized boolean f() {
        return this.B == 6;
    }

    public final synchronized boolean g() {
        return this.B == 5;
    }

    private final Drawable j() {
        if (this.w == null) {
            cfy cfy = this.j;
            this.w = cfy.i;
            if (this.w == null) {
                int i = cfy.j;
                if (i > 0) {
                    this.w = a(i);
                }
            }
        }
        return this.w;
    }

    private final Drawable k() {
        if (this.x == null) {
            cfy cfy = this.j;
            this.x = cfy.q;
            if (this.x == null) {
                int i = cfy.r;
                if (i > 0) {
                    this.x = a(i);
                }
            }
        }
        return this.x;
    }

    private final Drawable a(int i) {
        Theme theme = this.j.v;
        if (theme == null) {
            theme = this.f.getTheme();
        }
        brb brb = this.g;
        return cdf.a(brb, brb, i, theme);
    }

    private final synchronized void l() {
        if (m()) {
            Drawable k = this.h == null ? k() : null;
            if (k == null) {
                if (this.v == null) {
                    cfy cfy = this.j;
                    this.v = cfy.g;
                    if (this.v == null) {
                        int i = cfy.h;
                        if (i > 0) {
                            this.v = a(i);
                        }
                    }
                }
                k = this.v;
            }
            if (k == null) {
                k = j();
            }
            this.n.c(k);
        }
    }

    /* JADX WARNING: Missing block: B:15:0x007c, code skipped:
            return;
     */
    public final synchronized void a(int r22, int r23) {
        /*
        r21 = this;
        r15 = r21;
        monitor-enter(r21);
        r0 = r15.c;	 Catch:{ all -> 0x0086 }
        r0.b();	 Catch:{ all -> 0x0086 }
        r0 = r15.B;	 Catch:{ all -> 0x0086 }
        r1 = 3;
        if (r0 != r1) goto L_0x0083;
    L_0x000d:
        r0 = 2;
        r15.B = r0;	 Catch:{ all -> 0x0086 }
        r1 = r15.j;	 Catch:{ all -> 0x0086 }
        r1 = r1.d;	 Catch:{ all -> 0x0086 }
        r2 = r22;
        r2 = defpackage.cgi.a(r2, r1);	 Catch:{ all -> 0x0086 }
        r15.y = r2;	 Catch:{ all -> 0x0086 }
        r2 = r23;
        r6 = defpackage.cgi.a(r2, r1);	 Catch:{ all -> 0x0086 }
        r15.z = r6;	 Catch:{ all -> 0x0086 }
        r1 = r15.p;	 Catch:{ all -> 0x0086 }
        r2 = r15.g;	 Catch:{ all -> 0x0086 }
        r3 = r15.h;	 Catch:{ all -> 0x0086 }
        r4 = r15.j;	 Catch:{ all -> 0x0086 }
        r5 = r4.n;	 Catch:{ all -> 0x0086 }
        r7 = r15.y;	 Catch:{ all -> 0x0086 }
        r8 = r4.u;	 Catch:{ all -> 0x0086 }
        r9 = r15.i;	 Catch:{ all -> 0x0086 }
        r10 = r15.m;	 Catch:{ all -> 0x0086 }
        r11 = r4.e;	 Catch:{ all -> 0x0086 }
        r12 = r4.t;	 Catch:{ all -> 0x0086 }
        r13 = r4.o;	 Catch:{ all -> 0x0086 }
        r14 = r4.y;	 Catch:{ all -> 0x0086 }
        r0 = r4.s;	 Catch:{ all -> 0x0086 }
        r16 = r0;
        r0 = r4.k;	 Catch:{ all -> 0x0086 }
        r17 = r0;
        r0 = r4.w;	 Catch:{ all -> 0x0086 }
        r18 = r0;
        r0 = r4.z;	 Catch:{ all -> 0x0086 }
        r4 = r4.x;	 Catch:{ all -> 0x0086 }
        r19 = r0;
        r0 = r15.r;	 Catch:{ all -> 0x0086 }
        r20 = r4;
        r4 = r5;
        r5 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r16;
        r15 = r17;
        r16 = r18;
        r17 = r19;
        r18 = r20;
        r19 = r21;
        r20 = r0;
        r0 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20);	 Catch:{ all -> 0x007f }
        r1 = r21;
        r1.t = r0;	 Catch:{ all -> 0x007d }
        r0 = r1.B;	 Catch:{ all -> 0x007d }
        r2 = 2;
        if (r0 == r2) goto L_0x007b;
    L_0x0078:
        r0 = 0;
        r1.t = r0;	 Catch:{ all -> 0x007d }
    L_0x007b:
        monitor-exit(r21);
        return;
    L_0x007d:
        r0 = move-exception;
        goto L_0x0088;
    L_0x007f:
        r0 = move-exception;
        r1 = r21;
        goto L_0x0088;
    L_0x0083:
        r1 = r15;
        monitor-exit(r21);
        return;
    L_0x0086:
        r0 = move-exception;
        r1 = r15;
    L_0x0088:
        monitor-exit(r21);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgi.a(int, int):void");
    }

    private static int a(int i, float f) {
        return i != aocf.UNSET_ENUM_VALUE ? Math.round(f * ((float) i)) : aocf.UNSET_ENUM_VALUE;
    }

    private final boolean m() {
        cgc cgc = this.e;
        return cgc == null || cgc.c(this);
    }

    private final boolean n() {
        cgc cgc = this.e;
        return cgc == null || !cgc.i();
    }

    public final synchronized void a(bvn bvn) {
        a(bvn, 5);
    }

    private final synchronized void a(bvn bvn, int i) {
        this.c.b();
        int i2 = this.g.i;
        if (i2 <= i) {
            String valueOf = String.valueOf(this.h);
            int i3 = this.y;
            int i4 = this.z;
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 52);
            stringBuilder.append("Load failed for ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with size [");
            stringBuilder.append(i3);
            stringBuilder.append("x");
            stringBuilder.append(i4);
            stringBuilder.append("]");
            Log.w("Glide", stringBuilder.toString(), bvn);
            if (i2 <= 4) {
                List a = bvn.a();
                i2 = a.size();
                i3 = 0;
                while (i3 < i2) {
                    i4 = i3 + 1;
                    a.get(i3);
                    i3 = i4;
                }
            }
        }
        this.t = null;
        this.B = 5;
        this.b = true;
        try {
            List<cgd> list = this.o;
            if (list != null) {
                for (cgd a2 : list) {
                    a2.a(bvn, this.h, this.n, n());
                }
            }
            cgd cgd = this.d;
            if (cgd != null) {
                cgd.a(bvn, this.h, this.n, n());
            }
            l();
            cgc cgc = this.e;
            if (cgc != null) {
                cgc.f(this);
            }
        } finally {
            this.b = false;
        }
    }

    public final synchronized boolean a(cfz cfz) {
        boolean z = false;
        if (!(cfz instanceof cgi)) {
            return false;
        }
        cgi cgi = (cgi) cfz;
        synchronized (cgi) {
            if (this.k == cgi.k && this.l == cgi.l && chv.b(this.h, cgi.h) && this.i.equals(cgi.i) && this.j.equals(cgi.j) && this.m == cgi.m) {
                if (a(cgi)) {
                    z = true;
                }
            }
        }
        return z;
    }

    private final synchronized boolean a(cgi cgi) {
        boolean z;
        synchronized (cgi) {
            List list = this.o;
            z = false;
            int size = list != null ? list.size() : 0;
            List list2 = cgi.o;
            if (size == (list2 != null ? list2.size() : 0)) {
                z = true;
            }
        }
        return z;
    }

    public final synchronized void a(bvw bvw, int i) {
        this.c.b();
        this.t = null;
        if (bvw == null) {
            String valueOf = String.valueOf(this.i);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 82);
            stringBuilder.append("Expected to receive a Resource<R> with an object of ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" inside, but instead got null.");
            a(new bvn(stringBuilder.toString()));
            return;
        }
        Object obj;
        Object b = bvw.b();
        if (b != null) {
            if (this.i.isAssignableFrom(b.getClass())) {
                cgc cgc = this.e;
                if (cgc == null || cgc.b(this)) {
                    a(bvw, b, i);
                    return;
                }
                a(bvw);
                this.B = 4;
                return;
            }
        }
        a(bvw);
        String valueOf2 = String.valueOf(this.i);
        if (b == null) {
            obj = "";
        } else {
            obj = b.getClass();
        }
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(b);
        String valueOf5 = String.valueOf(bvw);
        String str = b == null ? " To indicate failure return a null Resource object, rather than a Resource object containing null data." : "";
        int length = valueOf2.length();
        int length2 = valueOf3.length();
        StringBuilder stringBuilder2 = new StringBuilder(((((length + 71) + length2) + valueOf4.length()) + valueOf5.length()) + str.length());
        stringBuilder2.append("Expected to receive an object of ");
        stringBuilder2.append(valueOf2);
        stringBuilder2.append(" but instead got ");
        stringBuilder2.append(valueOf3);
        stringBuilder2.append("{");
        stringBuilder2.append(valueOf4);
        stringBuilder2.append("} inside Resource{");
        stringBuilder2.append(valueOf5);
        stringBuilder2.append("}.");
        stringBuilder2.append(str);
        a(new bvn(stringBuilder2.toString()));
    }

    private final synchronized void a(bvw bvw, Object obj, int i) {
        n();
        this.B = 4;
        this.s = bvw;
        if (this.g.i <= 3) {
            String simpleName = obj.getClass().getSimpleName();
            String a = bsf.a(i);
            String valueOf = String.valueOf(this.h);
            int i2 = this.y;
            int i3 = this.z;
            double a2 = chs.a(this.u);
            int length = simpleName.length();
            StringBuilder stringBuilder = new StringBuilder(((length + 95) + String.valueOf(a).length()) + valueOf.length());
            stringBuilder.append("Finished loading ");
            stringBuilder.append(simpleName);
            stringBuilder.append(" from ");
            stringBuilder.append(a);
            stringBuilder.append(" for ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" with size [");
            stringBuilder.append(i2);
            stringBuilder.append("x");
            stringBuilder.append(i3);
            stringBuilder.append("] in ");
            stringBuilder.append(a2);
            stringBuilder.append(" ms");
            stringBuilder.toString();
        }
        this.b = true;
        try {
            List<cgd> list = this.o;
            if (list != null) {
                for (cgd a3 : list) {
                    a3.a(obj, i);
                }
            }
            cgd cgd = this.d;
            if (cgd != null) {
                cgd.a(obj, i);
            }
            this.n.a(obj, this.q.a(i));
            cgc cgc = this.e;
            if (cgc != null) {
                cgc.e(this);
            }
        } finally {
            this.b = false;
        }
    }
}
