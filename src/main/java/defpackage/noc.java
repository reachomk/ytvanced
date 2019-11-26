package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* renamed from: noc */
public class noc implements nnd, nne, nvx {
    private nom A;
    public final nra a;
    public final int b;
    public final noh c;
    private final nlx d;
    private final nok e;
    private final nnz f;
    private final LinkedList g;
    private final List h;
    private final int i;
    private final Handler j;
    private final int k;
    private int l;
    private long m;
    private long n;
    private long o;
    private long p;
    private boolean q;
    private nvy r;
    private boolean s;
    private IOException t;
    private int u;
    private int v;
    private long w;
    private long x;
    private npv y;
    private nmx z;

    public noc(nok nok, nlx nlx, int i) {
        this(nok, nlx, i, null, null, 0, 3);
    }

    public noc(nok nok, nlx nlx, int i, Handler handler, noh noh, int i2, int i3) {
        this.e = nok;
        this.d = nlx;
        this.i = i;
        this.j = handler;
        this.c = noh;
        this.b = i2;
        this.k = i3;
        this.f = new nnz();
        this.g = new LinkedList();
        this.h = Collections.unmodifiableList(this.g);
        this.a = new nra(nlx.a());
        this.l = 0;
        this.o = Long.MIN_VALUE;
    }

    public final nnd aP_() {
        nwf.b(this.l == 0);
        this.l = 1;
        return this;
    }

    public final boolean b() {
        int i = this.l;
        boolean z = i == 1 || i == 2;
        nwf.b(z);
        if (this.l == 2) {
            return true;
        }
        if (!this.e.b()) {
            return false;
        }
        if (this.e.c() > 0) {
            String valueOf = String.valueOf(this.e.a(0).b);
            String str = "Loader:";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            this.r = new nvy(valueOf);
        }
        this.l = 2;
        return true;
    }

    public final int c() {
        int i = this.l;
        boolean z = true;
        if (!(i == 2 || i == 3)) {
            z = false;
        }
        nwf.b(z);
        return this.e.c();
    }

    public final nmx a(int i) {
        int i2 = this.l;
        boolean z = true;
        if (!(i2 == 2 || i2 == 3)) {
            z = false;
        }
        nwf.b(z);
        return this.e.a(i);
    }

    public final void a(int i, long j) {
        boolean z = true;
        nwf.b(this.l == 2);
        int i2 = this.u;
        this.u = i2 + 1;
        if (i2 != 0) {
            z = false;
        }
        nwf.b(z);
        this.l = 3;
        this.e.b(i);
        this.d.a(this, this.i);
        this.A = null;
        this.z = null;
        this.y = null;
        this.m = j;
        this.n = j;
        this.q = false;
        b(j);
    }

    /* JADX WARNING: Failed to extract finally block: empty outs */
    /* JADX WARNING: Missing block: B:13:0x0032, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:15:0x0045, code skipped:
            return;
     */
    public final void c(int r4) {
        /*
        r3 = this;
        r4 = r3.l;
        r0 = 1;
        r1 = 0;
        r2 = 3;
        if (r4 != r2) goto L_0x0009;
    L_0x0007:
        r4 = 1;
        goto L_0x000a;
    L_0x0009:
        r4 = 0;
    L_0x000a:
        defpackage.nwf.b(r4);
        r4 = r3.u;
        r4 = r4 + -1;
        r3.u = r4;
        if (r4 != 0) goto L_0x0016;
    L_0x0015:
        goto L_0x0017;
    L_0x0016:
        r0 = 0;
    L_0x0017:
        defpackage.nwf.b(r0);
        r4 = 2;
        r3.l = r4;
        r4 = r3.e;	 Catch:{ all -> 0x0046 }
        r0 = r3.g;	 Catch:{ all -> 0x0046 }
        r4.a(r0);	 Catch:{ all -> 0x0046 }
        r4 = r3.d;
        r4.a(r3);
        r4 = r3.r;
        r0 = r4.b;
        if (r0 == 0) goto L_0x0033;
    L_0x002f:
        r4.a();
        return;
    L_0x0033:
        r4 = r3.a;
        r4.a();
        r4 = r3.g;
        r4.clear();
        r3.h();
        r4 = r3.d;
        r4.b();
        return;
    L_0x0046:
        r4 = move-exception;
        r0 = r3.d;
        r0.a(r3);
        r0 = r3.r;
        r1 = r0.b;
        if (r1 == 0) goto L_0x0056;
    L_0x0052:
        r0.a();
        goto L_0x0068;
    L_0x0056:
        r0 = r3.a;
        r0.a();
        r0 = r3.g;
        r0.clear();
        r3.h();
        r0 = r3.d;
        r0.b();
    L_0x0068:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.noc.c(int):void");
    }

    public final boolean b(int i, long j) {
        nwf.b(this.l == 3);
        this.m = j;
        this.e.a(j);
        j();
        return this.s || !this.a.c();
    }

    public final long b(int i) {
        if (!this.q) {
            return Long.MIN_VALUE;
        }
        this.q = false;
        return this.n;
    }

    public int a(int i, long j, nmz nmz, nnb nnb) {
        int i2 = 0;
        nwf.b(this.l == 3);
        this.m = j;
        if (this.q || n()) {
            return -2;
        }
        i = this.a.c() ^ 1;
        nnv nnv = (nnv) this.g.getFirst();
        while (i != 0 && this.g.size() > 1 && ((nnv) this.g.get(1)).c <= this.a.b()) {
            this.g.removeFirst();
            nnv = (nnv) this.g.getFirst();
        }
        nom nom = nnv.f;
        if (!nom.equals(this.A)) {
            int i3 = nnv.e;
            long j2 = nnv.j;
            Handler handler = this.j;
            if (!(handler == null || this.c == null)) {
                handler.post(new noi(this, nom, i3, j2));
            }
        }
        this.A = nom;
        if (i != 0 || nnv.a) {
            nmx a = nnv.a();
            Object b = nnv.b();
            if (a.equals(this.z) && nxf.a(this.y, b)) {
                this.z = a;
                this.y = b;
            } else {
                nmz.a = a;
                nmz.b = b;
                this.z = a;
                this.y = b;
                return -4;
            }
        }
        if (i == 0) {
            if (this.s) {
                return -1;
            }
            return -2;
        } else if (!this.a.a(nnb)) {
            return -2;
        } else {
            long j3 = nnb.e;
            long j4 = this.n;
            int i4 = nnb.d;
            if (j3 < j4) {
                i2 = 134217728;
            }
            nnb.d = i4 | i2;
            return -3;
        }
    }

    public void a(long j) {
        nwf.b(this.l == 3);
        long j2 = !n() ? this.m : this.o;
        this.m = j;
        this.n = j;
        if (j2 != j) {
            if (n() || !this.a.a(j)) {
                b(j);
            } else {
                int c = this.a.c() ^ 1;
                while (c != 0 && this.g.size() > 1 && ((nnv) this.g.get(1)).c <= this.a.b()) {
                    this.g.removeFirst();
                }
            }
            this.q = true;
        }
    }

    public final void d() {
        IOException iOException = this.t;
        if (iOException != null && this.v > this.k) {
            throw iOException;
        } else if (this.f.b == null) {
            this.e.a();
        }
    }

    public final long e() {
        nwf.b(this.l == 3);
        if (n()) {
            return this.o;
        }
        if (this.s) {
            return -3;
        }
        long j = this.a.d;
        if (j == Long.MIN_VALUE) {
            j = this.m;
        }
        return j;
    }

    public final void f() {
        nwf.b(this.l != 3);
        nvy nvy = this.r;
        if (nvy != null) {
            nvy.b();
            this.r = null;
        }
        this.l = 0;
    }

    public final void a(nvz nvz) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = elapsedRealtime - this.x;
        nny nny = this.f.b;
        this.e.a(nny);
        if (nny instanceof nnv) {
            nnv nnv = (nnv) nny;
            a(nny.c(), nnv.d, nnv.e, nnv.f, nnv.j, nnv.k, elapsedRealtime, j);
        } else {
            a(nny.c(), nny.d, nny.e, nny.f, -1, -1, elapsedRealtime, j);
        }
        h();
        j();
    }

    public final void g() {
        c(this.f.b.c());
        h();
        if (this.l == 3) {
            b(this.o);
            return;
        }
        this.a.a();
        this.g.clear();
        h();
        this.d.b();
    }

    public final void a(nvz nvz, IOException iOException) {
        this.t = iOException;
        this.v++;
        this.w = SystemClock.elapsedRealtime();
        Handler handler = this.j;
        if (!(handler == null || this.c == null)) {
            handler.post(new nog(this, iOException));
        }
        this.e.a(this.f.b, iOException);
        j();
    }

    private final void b(long j) {
        this.o = j;
        this.s = false;
        nvy nvy = this.r;
        if (nvy.b) {
            nvy.a();
            return;
        }
        this.a.a();
        this.g.clear();
        h();
        j();
    }

    private final void h() {
        this.f.b = null;
        i();
    }

    private final void i() {
        this.t = null;
        this.v = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    private final void j() {
        /*
        r16 = this;
        r7 = r16;
        r8 = android.os.SystemClock.elapsedRealtime();
        r0 = r16.k();
        r2 = r7.t;
        r10 = 0;
        r11 = 1;
        if (r2 != 0) goto L_0x0012;
    L_0x0010:
        r12 = 0;
        goto L_0x0013;
    L_0x0012:
        r12 = 1;
    L_0x0013:
        r3 = r7.r;
        r3 = r3.b;
        if (r3 == 0) goto L_0x001b;
    L_0x0019:
        r6 = 1;
        goto L_0x001f;
    L_0x001b:
        if (r2 == 0) goto L_0x001e;
    L_0x001d:
        goto L_0x0019;
    L_0x001e:
        r6 = 0;
    L_0x001f:
        r13 = -1;
        if (r6 != 0) goto L_0x0053;
    L_0x0023:
        r2 = r7.f;
        r2 = r2.b;
        if (r2 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x002e;
    L_0x002a:
        r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1));
        if (r2 != 0) goto L_0x0038;
    L_0x002e:
        r2 = r7.p;
        r2 = r8 - r2;
        r4 = 2000; // 0x7d0 float:2.803E-42 double:9.88E-321;
        r15 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r15 <= 0) goto L_0x0053;
    L_0x0038:
        r7.p = r8;
        r16.m();
        r2 = r7.f;
        r2 = r2.a;
        r2 = r7.d(r2);
        r3 = r7.f;
        r3 = r3.b;
        if (r3 != 0) goto L_0x004d;
    L_0x004b:
        r4 = r13;
        goto L_0x0054;
    L_0x004d:
        if (r2 == 0) goto L_0x0053;
    L_0x004f:
        r0 = r16.k();
    L_0x0053:
        r4 = r0;
    L_0x0054:
        r0 = r7.d;
        r2 = r7.m;
        r1 = r16;
        r0 = r0.a(r1, r2, r4, r6);
        if (r12 == 0) goto L_0x00e7;
    L_0x0060:
        r0 = r7.w;
        r8 = r8 - r0;
        r0 = r7.v;
        r0 = (long) r0;
        r0 = r0 + r13;
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r0 = r0 * r2;
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r0 = java.lang.Math.min(r0, r2);
        r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1));
        if (r2 >= 0) goto L_0x0076;
    L_0x0075:
        goto L_0x008e;
    L_0x0076:
        r0 = 0;
        r7.t = r0;
        r0 = r7.f;
        r0 = r0.b;
        r1 = r0 instanceof defpackage.nnv;
        if (r1 == 0) goto L_0x00c6;
    L_0x0081:
        r1 = r7.g;
        r1 = r1.getFirst();
        if (r0 != r1) goto L_0x008f;
    L_0x0089:
        r1 = r7.r;
        r1.a(r0, r7);
    L_0x008e:
        return;
    L_0x008f:
        r1 = r7.g;
        r1 = r1.removeLast();
        r1 = (defpackage.nnv) r1;
        if (r0 != r1) goto L_0x009a;
    L_0x0099:
        r10 = 1;
    L_0x009a:
        defpackage.nwf.b(r10);
        r16.m();
        r2 = r7.g;
        r2.add(r1);
        r1 = r7.f;
        r1 = r1.b;
        if (r1 != r0) goto L_0x00b1;
    L_0x00ab:
        r1 = r7.r;
        r1.a(r0, r7);
        return;
    L_0x00b1:
        r0 = r0.c();
        r7.c(r0);
        r0 = r7.f;
        r0 = r0.a;
        r7.d(r0);
        r16.i();
        r16.l();
        return;
    L_0x00c6:
        r16.m();
        r1 = r7.f;
        r1 = r1.a;
        r7.d(r1);
        r1 = r7.f;
        r1 = r1.b;
        if (r1 != r0) goto L_0x00dc;
    L_0x00d6:
        r1 = r7.r;
        r1.a(r0, r7);
        return;
    L_0x00dc:
        r0 = r0.c();
        r7.c(r0);
        r16.l();
        return;
    L_0x00e7:
        r1 = r7.r;
        r1 = r1.b;
        if (r1 != 0) goto L_0x00f2;
    L_0x00ed:
        if (r0 == 0) goto L_0x00f2;
    L_0x00ef:
        r16.l();
    L_0x00f2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.noc.j():void");
    }

    private final long k() {
        if (n()) {
            return this.o;
        }
        return !this.s ? ((nnv) this.g.getLast()).k : -1;
    }

    private final void l() {
        nny nny = this.f.b;
        if (nny != null) {
            this.x = SystemClock.elapsedRealtime();
            if (nny instanceof nnv) {
                nnv nnv = (nnv) nny;
                nra nra = this.a;
                nnv.b = nra;
                nnv.c = nra.a.c.a();
                this.g.add(nnv);
                if (n()) {
                    this.o = Long.MIN_VALUE;
                }
                a(nnv.g.e, nnv.d, nnv.e, nnv.f, nnv.j, nnv.k);
            } else {
                a(nny.g.e, nny.d, nny.e, nny.f, -1, -1);
            }
            this.r.a(nny, this);
        }
    }

    private final void m() {
        nnz nnz = this.f;
        nnz.c = false;
        nnz.a = this.h.size();
        nok nok = this.e;
        List list = this.h;
        long j = this.o;
        if (j == Long.MIN_VALUE) {
            j = this.m;
        }
        nok.a(list, j, this.f);
        this.s = this.f.c;
    }

    private final boolean d(int i) {
        int i2 = 0;
        if (this.g.size() <= i) {
            return false;
        }
        int i3;
        long j;
        this.g.getLast();
        nnv nnv = null;
        while (this.g.size() > i) {
            nnv = (nnv) this.g.removeLast();
            this.s = false;
        }
        nra nra = this.a;
        int i4 = nnv.c;
        nrl nrl = nra.a;
        nro nro = nrl.c;
        int a = nro.a() - i4;
        boolean z = a >= 0 && a <= nro.d;
        nwf.a(z);
        if (a != 0) {
            nro.d -= a;
            i3 = nro.g;
            int i5 = nro.a;
            i3 = ((i3 + i5) - a) % i5;
            nro.g = i3;
            j = nro.b[i3];
        } else if (nro.e == 0 && nro.d == 0) {
            j = 0;
        } else {
            a = nro.g;
            if (a == 0) {
                a = nro.a;
            }
            a--;
            j = ((long) nro.c[a]) + nro.b[a];
        }
        nrl.h = j;
        a = (int) (j - nrl.g);
        int i6 = nrl.b;
        i3 = a / i6;
        a %= i6;
        i6 = (nrl.d.size() - i3) - 1;
        if (a == 0) {
            i6++;
        }
        while (i2 < i6) {
            nrl.a.a((nvf) nrl.d.removeLast());
            i2++;
        }
        nrl.i = (nvf) nrl.d.peekLast();
        if (a == 0) {
            a = nrl.b;
        }
        nrl.j = a;
        nra.d = nra.a.a(nra.b) ? nra.b.e : Long.MIN_VALUE;
        Handler handler = this.j;
        if (!(handler == null || this.c == null)) {
            handler.post(new nof(this));
        }
        return true;
    }

    private final boolean n() {
        return this.o != Long.MIN_VALUE;
    }

    private final void a(long j, int i, int i2, nom nom, long j2, long j3) {
        Handler handler = this.j;
        if (handler != null && this.c != null) {
            handler.post(new nob(this));
        }
    }

    private final void a(long j, int i, int i2, nom nom, long j2, long j3, long j4, long j5) {
        Handler handler = this.j;
        if (handler != null && this.c != null) {
            handler.post(new noe(this));
        }
    }

    private final void c(long j) {
        Handler handler = this.j;
        if (handler != null && this.c != null) {
            handler.post(new nod(this));
        }
    }
}
