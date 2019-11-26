package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: fik */
public final class fik implements fjg {
    private final nt a;
    private final int b;
    private int c;
    private fiq d;
    private SparseArray e;
    private fjj f;
    private final Set g = new HashSet();
    private final Set h = new HashSet();
    private final Set i = new HashSet();
    private final Set j = new HashSet();
    private final Set k = new HashSet();
    private final aaal l;
    private final bapu m;

    public fik(Bundle bundle, nt ntVar, aaal aaal, bapu bapu) {
        this.a = (nt) amqw.a((Object) ntVar);
        this.b = R.id.pane_fragment_container;
        this.l = (aaal) amqw.a((Object) aaal);
        this.m = bapu;
        this.c = 0;
        if (bundle != null) {
            String str = "activePaneKey";
            if (bundle.containsKey(str)) {
                this.c = bundle.getInt(str);
            }
            this.e = bundle.getSparseParcelableArray("panes");
        }
        if (this.e == null) {
            this.e = new SparseArray();
        }
    }

    public final fiw a() {
        return r().c;
    }

    public final fja b() {
        nf a = this.a.a(this.b);
        if (a instanceof fja) {
            return (fja) a;
        }
        return null;
    }

    public final int c() {
        return this.c;
    }

    public final boolean a(fiw fiw) {
        return a(fjc.f().a(0).a(fiw).a(false).a(fik.s()).a());
    }

    public final boolean d() {
        return a(fjc.f().a(1).a(null).a(false).a(fik.s()).a());
    }

    public final boolean e() {
        return a(fjc.f().a(2).a(null).a(false).a(fik.s()).a());
    }

    public final void b(fiw fiw) {
        a(fjc.f().a(3).a(fiw).a(false).a(fik.s()).a());
    }

    public final boolean f() {
        return a(fjc.f().a(4).a(null).a(false).a(fik.s()).a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x015d  */
    /* JADX WARNING: Missing block: B:18:0x0038, code skipped:
            if (((defpackage.fjd) b()).f() == false) goto L_0x003a;
     */
    /* JADX WARNING: Missing block: B:20:0x003e, code skipped:
            if (d() == false) goto L_0x0023;
     */
    /* JADX WARNING: Missing block: B:26:0x005a, code skipped:
            if (((defpackage.fjd) b()).a(r2) != false) goto L_0x017b;
     */
    /* JADX WARNING: Missing block: B:28:0x0060, code skipped:
            if (b(r0) != false) goto L_0x017b;
     */
    private final boolean a(defpackage.fjc r14) {
        /*
        r13 = this;
        r0 = r13.f;
        if (r0 == 0) goto L_0x0009;
    L_0x0004:
        r0 = r0.a(r14);
        goto L_0x000a;
    L_0x0009:
        r0 = r14;
    L_0x000a:
        r13.a();
        r6 = r0.b();
        r7 = 1;
        r1 = 0;
        if (r6 == 0) goto L_0x0177;
    L_0x0015:
        r2 = 8194; // 0x2002 float:1.1482E-41 double:4.0484E-320;
        r3 = 0;
        if (r6 == r7) goto L_0x00fd;
    L_0x001a:
        r4 = 2;
        if (r6 == r4) goto L_0x0064;
    L_0x001d:
        r2 = 3;
        if (r6 == r2) goto L_0x0042;
    L_0x0020:
        r0 = 4;
        if (r6 == r0) goto L_0x0026;
    L_0x0023:
        r7 = 0;
        goto L_0x017b;
    L_0x0026:
        r0 = r13.b();
        r0 = r0 instanceof defpackage.fjd;
        if (r0 == 0) goto L_0x003a;
    L_0x002e:
        r0 = r13.b();
        r0 = (defpackage.fjd) r0;
        r0 = r0.f();
        if (r0 != 0) goto L_0x017b;
    L_0x003a:
        r0 = r13.d();
        if (r0 == 0) goto L_0x0023;
    L_0x0040:
        goto L_0x017b;
    L_0x0042:
        r2 = r0.a();
        if (r2 == 0) goto L_0x0023;
    L_0x0048:
        r3 = r13.b();
        r3 = r3 instanceof defpackage.fjd;
        if (r3 == 0) goto L_0x005c;
    L_0x0050:
        r3 = r13.b();
        r3 = (defpackage.fjd) r3;
        r2 = r3.a(r2);
        if (r2 != 0) goto L_0x017b;
    L_0x005c:
        r0 = r13.b(r0);
        if (r0 == 0) goto L_0x0023;
    L_0x0062:
        goto L_0x017b;
    L_0x0064:
        r4 = r0.a();
        r5 = r13.b();
        r8 = r5 instanceof defpackage.fjd;
        if (r8 == 0) goto L_0x0078;
    L_0x0070:
        r5 = (defpackage.fjd) r5;
        r5 = r5.e();
        if (r5 != 0) goto L_0x017b;
    L_0x0078:
        r5 = r13.g();
        if (r5 != 0) goto L_0x007f;
    L_0x007e:
        goto L_0x0082;
    L_0x007f:
        if (r4 != 0) goto L_0x0082;
    L_0x0081:
        goto L_0x0023;
    L_0x0082:
        r0 = r0.c();
        r8 = r13.o();
        r9 = r13.n();
        r8 = r8.d();
        if (r8 == 0) goto L_0x0099;
    L_0x0094:
        r0 = r3;
        r8 = r0;
        r10 = r8;
        r11 = r10;
        goto L_0x00c0;
    L_0x0099:
        r8 = r13.o();
        r10 = r8.a;
        r10 = r10.peekLast();
        r10 = (defpackage.fiu) r10;
    L_0x00a5:
        r11 = r8.d();
        if (r11 != 0) goto L_0x00b5;
    L_0x00ab:
        r11 = r8.b();
        r11 = r11.a;
        r13.d(r11);
        goto L_0x00a5;
    L_0x00b5:
        if (r0 == 0) goto L_0x00b8;
    L_0x00b7:
        goto L_0x0094;
    L_0x00b8:
        r0 = r10.a;
        r8 = r10.b;
        r11 = r10.c;
        r10 = r10.d;
    L_0x00c0:
        if (r0 != 0) goto L_0x00c6;
    L_0x00c2:
        r8 = r3;
        r10 = r8;
        r11 = r10;
        goto L_0x00cf;
    L_0x00c6:
        r12 = r13.l;
        r12 = defpackage.fiw.a(r0, r9, r12);
        if (r12 == 0) goto L_0x00c2;
    L_0x00ce:
        r9 = r0;
    L_0x00cf:
        if (r4 != 0) goto L_0x00d7;
    L_0x00d1:
        r2 = r8;
        r4 = r9;
        r3 = r11;
        r5 = 8194; // 0x2002 float:1.1482E-41 double:4.0484E-320;
        goto L_0x00e1;
    L_0x00d7:
        if (r5 != 0) goto L_0x00da;
    L_0x00d9:
        goto L_0x00db;
    L_0x00da:
        r2 = 0;
    L_0x00db:
        r13.c(r4);
        r5 = r2;
        r2 = r3;
        r10 = r2;
    L_0x00e1:
        if (r4 == 0) goto L_0x0023;
    L_0x00e3:
        r0 = r13.a();
        r13.d(r0);
        r0 = r13.a();
        r1 = r13.b();
        r13.a(r0, r1, r4);
        r0 = r13;
        r1 = r4;
        r4 = r10;
        r0.a(r1, r2, r3, r4, r5);
        goto L_0x017b;
    L_0x00fd:
        r4 = r0.a();
        r5 = r13.b();
        r8 = r5 instanceof defpackage.fjd;
        if (r8 == 0) goto L_0x0111;
    L_0x0109:
        r5 = (defpackage.fjd) r5;
        r5 = r5.d();
        if (r5 != 0) goto L_0x017b;
    L_0x0111:
        r5 = r13.g();
        if (r5 != 0) goto L_0x0118;
    L_0x0117:
        goto L_0x011c;
    L_0x0118:
        if (r4 != 0) goto L_0x011c;
    L_0x011a:
        goto L_0x0023;
    L_0x011c:
        r13.c(r0);
        r0 = r13.o();
        r8 = r13.n();
        r9 = r0.d();
        if (r9 != 0) goto L_0x013a;
    L_0x012d:
        r0 = r0.b();
        r9 = r0.a;
        r10 = r0.b;
        r11 = r0.c;
        r0 = r0.d;
        goto L_0x013e;
    L_0x013a:
        r0 = r3;
        r10 = r0;
        r11 = r10;
        r9 = r8;
    L_0x013e:
        if (r4 != 0) goto L_0x0147;
    L_0x0140:
        r5 = r0;
        r4 = r9;
        r2 = r10;
        r3 = r11;
    L_0x0144:
        r8 = 8194; // 0x2002 float:1.1482E-41 double:4.0484E-320;
        goto L_0x015b;
    L_0x0147:
        r0 = r13.l;
        r0 = defpackage.fiw.a(r9, r8, r0);
        if (r0 == 0) goto L_0x0152;
    L_0x014f:
        r13.c(r4);
    L_0x0152:
        if (r5 == 0) goto L_0x0158;
    L_0x0154:
        r2 = r3;
        r5 = r2;
        r8 = 0;
        goto L_0x015b;
    L_0x0158:
        r2 = r3;
        r5 = r2;
        goto L_0x0144;
    L_0x015b:
        if (r4 == 0) goto L_0x0023;
    L_0x015d:
        r0 = r13.a();
        r13.d(r0);
        r0 = r13.a();
        r1 = r13.b();
        r13.a(r0, r1, r4);
        r0 = r13;
        r1 = r4;
        r4 = r5;
        r5 = r8;
        r0.a(r1, r2, r3, r4, r5);
        goto L_0x017b;
    L_0x0177:
        r7 = r13.b(r0);
    L_0x017b:
        if (r7 == 0) goto L_0x0198;
    L_0x017d:
        r0 = new fjl;
        r0.<init>(r6);
        r1 = r13.g;
        r1 = r1.iterator();
    L_0x0188:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0198;
    L_0x018e:
        r2 = r1.next();
        r2 = (defpackage.fjm) r2;
        r2.a(r0);
        goto L_0x0188;
    L_0x0198:
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fik.a(fjc):boolean");
    }

    private final boolean b(fjc fjc) {
        fiw a = fjc.a();
        if (a == null) {
            return false;
        }
        Object obj;
        fis o = o();
        fiw a2 = a();
        fiw n = n();
        if (c(fjc) || a2 == null || a(a2, a)) {
            obj = null;
        } else {
            obj = 1;
        }
        Object obj2;
        if (obj == null) {
            obj2 = null;
            while (!o.d()) {
                if (o.a.size() == 1 && fiw.a(o.a().a, n, this.l)) {
                    obj2 = 1;
                }
                if (!a(o.a().a, a)) {
                    break;
                }
                d(o.b().a);
                if (obj2 != null) {
                    c(a);
                }
            }
        } else {
            p();
            obj2 = null;
        }
        if (obj == null && r5 == null && o.d() && (n == null || a(n, a))) {
            c(a);
        }
        a(a2, b(), a);
        a(a, null, null, null, obj == null ? 0 : 4097);
        return true;
    }

    public final void a(int i, int i2) {
        if (i >= 0) {
            int i3 = this.c;
            if (i != i3) {
                fiw a = a();
                if (a != null) {
                    p();
                }
                this.c = i;
                if (!o().d()) {
                    fiu b = o().b();
                    a(a, b(), b.a);
                    a(b.a, b.b, b.c, b.d, 0);
                } else if (n() != null) {
                    fiw n = n();
                    a(a, b(), n);
                    a(n, null, null, null, 0);
                }
                for (fjf a2 : this.j) {
                    a2.a(i3, i2);
                }
                return;
            }
            return;
        }
        throw new IndexOutOfBoundsException("argument cannot be negative");
    }

    public final boolean g() {
        fiw a = a();
        boolean z = false;
        if (o().d() && a != null && fiw.a(a, n(), this.l)) {
            if (!(b() instanceof fjd)) {
                z = true;
            } else if (((fjd) b()).g()) {
                return true;
            } else {
                return z;
            }
        }
        return z;
    }

    private final void c(fiw fiw) {
        r().d = fiw;
    }

    private final fiw n() {
        return r().d;
    }

    public final void h() {
        fiw a = a();
        if (a != null) {
            a(a, b(), a);
            a(a, null, null, null, 0);
        }
    }

    public final void i() {
        fiw a = a();
        nf b = b();
        if (b != null) {
            nl a2;
            String str;
            Object obj = null;
            if (fiw.a(fiw.a((fja) b), a, this.l)) {
                a2 = this.a.a(b);
                str = b.B;
                obj = b.ai();
            } else {
                a2 = null;
                str = a2;
            }
            a(a, a2, obj, str, 0);
        }
    }

    public final void j() {
        fja b = b();
        if (b != null) {
            b.ah();
        }
    }

    public final void k() {
        fiq r = r();
        this.e.clear();
        this.e.put(r.a, r);
        q();
    }

    public final void l() {
        this.e.clear();
        this.c = 0;
        q();
    }

    public final void a(ClassLoader classLoader) {
        for (int i = 0; i < this.e.size(); i++) {
            fiq fiq = (fiq) this.e.valueAt(i);
            Iterator it = fiq.b.a.iterator();
            while (it.hasNext()) {
                ((fiu) it.next()).a.a(classLoader);
            }
            fiw fiw = fiq.c;
            if (fiw != null) {
                fiw.a(classLoader);
            }
            fiw fiw2 = fiq.d;
            if (fiw2 != null) {
                fiw2.a(classLoader);
            }
        }
    }

    public final void a(Bundle bundle) {
        bundle.putInt("activePaneKey", this.c);
        bundle.putSparseParcelableArray("panes", this.e);
    }

    public final void a(fjj fjj) {
        this.f = fjj;
    }

    public final void a(fjm fjm) {
        if (fjm != null) {
            this.g.add(fjm);
        }
    }

    public final void a(fjh fjh) {
        this.h.add(fjh);
    }

    public final void a(fjk fjk) {
        if (fjk != null) {
            this.i.add(fjk);
        }
    }

    public final void a(fjf fjf) {
        if (fjf != null) {
            this.j.add(fjf);
        }
    }

    public final void a(fji fji) {
        this.k.add(fji);
    }

    public final void a(fja fja) {
        for (fjk a : this.i) {
            a.a(fja);
        }
    }

    public final void m() {
        fja b = b();
        if (b != null) {
            b.aj();
        }
    }

    private final fis o() {
        return r().b;
    }

    private final void p() {
        String str;
        Object ai;
        nf b = b();
        fiw a = a();
        nl nlVar = null;
        if (b != null && fiw.a(fiw.a((fja) b), a, this.l)) {
            nlVar = this.a.a(b);
            str = b.B;
            ai = b.ai();
        } else {
            ai = null;
            str = ai;
        }
        o().a(a, nlVar, ai, str);
    }

    @Deprecated
    private final boolean c(fjc fjc) {
        if (!fjc.c()) {
            return false;
        }
        o().c();
        c(fjc.a());
        return true;
    }

    private final void q() {
        for (fji a : this.k) {
            a.a();
        }
    }

    private final fiq r() {
        fiq fiq = this.d;
        if (fiq == null || fiq.a != this.c) {
            this.d = (fiq) this.e.get(this.c);
            if (this.d == null) {
                this.d = new fiq(this.c);
                this.e.put(this.c, this.d);
            }
        }
        return this.d;
    }

    private final void a(fiw fiw, nl nlVar, Object obj, String str, int i) {
        fja c = fiw.c();
        if (nlVar != null) {
            c.a(nlVar);
        }
        if (obj != null) {
            c.a(obj);
        }
        if (str == null) {
            str = "PaneFragment";
        }
        or b = this.a.a().b(this.b, c, str);
        if ("generic_x86".equals(Build.DEVICE)) {
            i = -1;
        }
        b.i = i;
        b.b();
        r().c = fiw;
    }

    private final boolean a(fiw fiw, fiw fiw2) {
        fjj fjj = this.f;
        return fjj != null && fjj.a(fiw, fiw2);
    }

    private final void a(fiw fiw, fja fja, fiw fiw2) {
        fiw a = fja != null ? fiw.a(fja) : null;
        if ((a == null || fiw != null) && !fiw.a(a, fiw, this.l)) {
            fja = null;
        }
        for (fjh a2 : this.h) {
            a2.a(fja, fiw2);
        }
    }

    private final void d(fiw fiw) {
        if (fiw != null) {
            Bundle bundle = fiw.b;
            abhv abhv = (abhv) this.m.get();
            if (bundle != null) {
                String str = "search_cache_key";
                if (bundle.containsKey(str) && abhv != null) {
                    abhv.c.execute(new abhx(abhv, fiw.a(str)));
                }
            }
        }
    }

    private static fje s() {
        return new fij();
    }
}
