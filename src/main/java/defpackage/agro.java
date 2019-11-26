package defpackage;

import android.app.Notification;
import android.text.TextUtils;

/* renamed from: agro */
public abstract class agro implements agrq {
    private final xsc a;
    private final bcaa b;
    private final agrn c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private long l = 0;

    public agro(xsc xsc, bcaa bcaa, agrn agrn, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = (xsc) amqw.a((Object) xsc);
        this.b = (bcaa) amqw.a((Object) bcaa);
        this.c = (agrn) amqw.a((Object) agrn);
        this.d = z;
        this.e = z2;
        this.h = z3;
        this.f = true;
        this.g = z4;
        this.i = true;
        this.j = true;
        this.k = true;
    }

    private final synchronized void e() {
    }

    public abstract boolean a();

    public abstract boolean a(agqh agqh);

    public abstract boolean a(agqu agqu);

    public abstract boolean a(agqy agqy);

    public abstract boolean a(agqy agqy, boolean z);

    public boolean a(agqz agqz, avqk avqk) {
        throw null;
    }

    public abstract boolean b(agqh agqh);

    public abstract boolean b(agqy agqy);

    public abstract boolean c(agqh agqh);

    public abstract boolean c(agqy agqy);

    public abstract boolean d(agqh agqh);

    public abstract boolean d(agqy agqy);

    public final synchronized void c() {
        this.c.a();
    }

    public final boolean a(agqz agqz, boolean z) {
        long a = this.a.a();
        if (this.c.a && a - this.l < 250) {
            return false;
        }
        this.l = a;
        int a2 = agxj.a(agqz.f);
        if (a2 != 1) {
            if (a2 == 2) {
                if (this.h) {
                    agqy a3 = ((agwc) this.b.get()).b().k().a(agxj.b(agqz.f));
                    if (a3 != null) {
                        return d(a3);
                    }
                }
                return false;
            } else if (a2 != 4 && (a2 == 5 || !(a2 == 6 || a2 == 7))) {
                return false;
            }
        }
        String c = agxj.c(agqz.f);
        String d = agxj.d(agqz.f);
        if (!TextUtils.isEmpty(c)) {
            Object obj = (agxj.p(agqz.f) && this.i) ? 1 : null;
            if (!this.f && obj == null) {
                return false;
            }
            agqh f = ((agwc) this.b.get()).b().n().f(c);
            if (f == null) {
                return false;
            }
            if (obj != null) {
                c(f);
            } else {
                a(f);
            }
            return true;
        } else if (!this.g || TextUtils.isEmpty(d)) {
            agqy a4 = ((agwc) this.b.get()).b().k().a(agxj.b(agqz.f));
            if (a4 != null) {
                boolean o = agxj.o(agqz.f);
                if (!z && this.e) {
                    return a(a4, o);
                }
                if (this.d) {
                    return a(a4);
                }
            }
            return false;
        } else if (((agwc) this.b.get()).b().o().f(d) != null) {
            return a();
        } else {
            return false;
        }
    }

    public final boolean a(agqz agqz) {
        int a = agxj.a(agqz.f);
        if (a != 1 && a != 4 && (a == 5 || (a != 6 && a != 7))) {
            return false;
        }
        String c = agxj.c(agqz.f);
        String d = agxj.d(agqz.f);
        if (!TextUtils.isEmpty(c)) {
            Object obj = (agxj.p(agqz.f) && this.i) ? 1 : null;
            if (!this.f && obj == null) {
                return false;
            }
            agqh f = ((agwc) this.b.get()).b().n().f(c);
            if (f == null || !f.e()) {
                return false;
            }
            if (obj != null) {
                d(f);
            } else {
                b(f);
            }
            return true;
        } else if (!this.g || TextUtils.isEmpty(d)) {
            if (this.d) {
                agqy a2 = ((agwc) this.b.get()).b().k().a(agxj.b(agqz.f));
                if (a2 != null && a2.n()) {
                    return b(a2);
                }
            }
            return false;
        } else {
            agqu f2 = ((agwc) this.b.get()).b().o().f(d);
            if (f2 == null || !f2.e()) {
                return false;
            }
            return a(f2);
        }
    }

    public final boolean b(agqz agqz) {
        int a = agxj.a(agqz.f);
        if (a != 1 && a != 4 && a != 6 && a != 7) {
            return false;
        }
        String c = agxj.c(agqz.f);
        String d = agxj.d(agqz.f);
        if (!TextUtils.isEmpty(c)) {
            if (this.f) {
                agqh f = ((agwc) this.b.get()).b().n().f(c);
                if (f != null && f.e()) {
                    return b(f);
                }
            }
            return false;
        } else if (!this.g || TextUtils.isEmpty(d)) {
            if (this.d) {
                agqy a2 = ((agwc) this.b.get()).b().k().a(agxj.b(agqz.f));
                if (a2 != null && a2.v()) {
                    return c(a2);
                }
            }
            return false;
        } else {
            agqu f2 = ((agwc) this.b.get()).b().o().f(d);
            if (f2 == null || !f2.e()) {
                return false;
            }
            return a(f2);
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void a(Notification notification) {
        if (this.k) {
            this.c.b("", 12, notification);
        }
    }

    /* JADX WARNING: Missing block: B:9:0x0013, code skipped:
            if (r0 != 7) goto L_0x0040;
     */
    public final void c(defpackage.agqz r4) {
        /*
        r3 = this;
        r0 = r4.f;
        r0 = defpackage.agxj.a(r0);
        r1 = 1;
        if (r0 == r1) goto L_0x001f;
    L_0x0009:
        r1 = 4;
        if (r0 == r1) goto L_0x001f;
    L_0x000c:
        r1 = 5;
        if (r0 == r1) goto L_0x0016;
    L_0x000f:
        r1 = 6;
        if (r0 == r1) goto L_0x001f;
    L_0x0012:
        r1 = 7;
        if (r0 == r1) goto L_0x001f;
    L_0x0015:
        goto L_0x0040;
    L_0x0016:
        r4 = r4.f;
        defpackage.agxj.b(r4);
        r3.e();
        return;
    L_0x001f:
        r0 = r4.f;
        r0 = defpackage.agxj.c(r0);
        r1 = r4.f;
        r1 = defpackage.agxj.d(r1);
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 != 0) goto L_0x0045;
    L_0x0031:
        r1 = r3.i;
        if (r1 == 0) goto L_0x0041;
    L_0x0035:
        r4 = r4.f;
        r4 = defpackage.agxj.p(r4);
        if (r4 == 0) goto L_0x0041;
    L_0x003d:
        r3.c(r0);
    L_0x0040:
        return;
    L_0x0041:
        r3.b(r0);
        return;
    L_0x0045:
        r0 = r3.g;
        if (r0 == 0) goto L_0x0053;
    L_0x0049:
        r0 = android.text.TextUtils.isEmpty(r1);
        if (r0 != 0) goto L_0x0053;
    L_0x004f:
        r3.e(r1);
        return;
    L_0x0053:
        r4 = r4.f;
        r4 = defpackage.agxj.b(r4);
        r3.a(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agro.c(agqz):void");
    }

    public final void d() {
        this.c.a("", 11);
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void a(String str, Notification notification) {
        if (this.d) {
            this.c.a(str, 7, notification);
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void b(String str, Notification notification) {
        if (this.d) {
            this.c.b(str, 7, notification);
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void c(String str, Notification notification) {
        if (this.e) {
            this.c.a(str, 14, notification);
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void d(String str, Notification notification) {
        if (this.h) {
            this.c.a(str, 15, notification);
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void e(String str, Notification notification) {
        if (this.f) {
            this.c.a(str, 8, notification);
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void f(String str, Notification notification) {
        if (this.f) {
            this.c.b(str, 8, notification);
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void g(String str, Notification notification) {
        if (this.i) {
            this.c.a(str, 10, notification);
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void h(String str, Notification notification) {
        if (this.i) {
            this.c.b(str, 10, notification);
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void i(String str, Notification notification) {
        if (this.g) {
            this.c.b(str, 9, notification);
        }
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void b(Notification notification) {
        if (this.j) {
            this.c.b("", 11, notification);
        }
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void a(String str) {
        if (this.d) {
            this.c.a(str, 7);
        }
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void b(String str) {
        if (this.f) {
            this.c.a(str, 8);
        }
    }

    /* Access modifiers changed, original: protected|declared_synchronized */
    public synchronized void c(String str) {
        if (this.i) {
            this.c.a(str, 10);
        }
    }

    private final synchronized void e(String str) {
        if (this.g) {
            this.c.a(str, 9);
        }
    }
}
