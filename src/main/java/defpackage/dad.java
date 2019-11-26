package defpackage;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.facebook.litho.ComponentTree;
import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: dad */
public final class dad implements cyf, czb {
    public static final dbh E = new daf();
    private static final crd F = new crd();
    private static final Rect G = new Rect();
    private static final String H = dad.class.getSimpleName();
    private static crm I;
    public static Field a;
    public final ddi A;
    public int B;
    public final dcc C;
    public final Runnable D;
    private final czl J;
    private final dbh K;
    private final int L;
    private final AtomicBoolean M;
    private final boolean N;
    private final dbr O;
    private final boolean P;
    private final boolean Q;
    private final String R;
    private final boolean S;
    private final Deque T;
    private final AtomicBoolean U;
    private final AtomicBoolean V;
    private final Deque W;
    private final Runnable X;
    private final czx Y;
    private final OnPreDrawListener Z;
    private final Runnable aa;
    private final cyn ab;
    private final cng ac;
    private final boolean ad;
    private crd ae;
    private int af;
    private dch ag;
    private final boolean ah;
    private final cpe ai;
    private final cuo aj;
    private final boolean ak;
    private final boolean al;
    private boolean am;
    private int an;
    private boolean ao;
    private int ap;
    private day aq;
    private final ddf ar;
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public final dat d;
    public final czo e;
    public final apa f;
    public final cmg g;
    public final czt h;
    public final Handler i = new Handler(Looper.getMainLooper());
    public final float j;
    public final AtomicBoolean k;
    public final boolean l;
    public final List m;
    public final AtomicLong n;
    public final cug o;
    public final boolean p;
    public final boolean q;
    public boolean r;
    public int s;
    public int t;
    public RecyclerView u;
    public int v;
    public int w;
    public volatile dbo x;
    public coj y;
    public volatile boolean z;

    public final boolean b() {
        return this.q;
    }

    public final boolean c() {
        return false;
    }

    public final /* bridge */ /* synthetic */ void e() {
    }

    public final int f() {
        throw null;
    }

    public final int g() {
        throw null;
    }

    public final int h() {
        throw null;
    }

    public final /* bridge */ /* synthetic */ void j_() {
    }

    private final void o() {
        if (cro.a()) {
            a();
        } else {
            cuh.a.a(this.o);
        }
    }

    /* JADX WARNING: Missing block: B:54:?, code skipped:
            monitor-enter(r11);
     */
    /* JADX WARNING: Missing block: B:56:?, code skipped:
            r5 = r4.a.size();
            r6 = 0;
     */
    /* JADX WARNING: Missing block: B:57:0x00aa, code skipped:
            if (r6 < r5) goto L_0x00c0;
     */
    /* JADX WARNING: Missing block: B:58:0x00ac, code skipped:
            monitor-exit(r11);
     */
    /* JADX WARNING: Missing block: B:60:?, code skipped:
            r4.c.a();
            r11.W.addLast(r4.c);
            j();
     */
    /* JADX WARNING: Missing block: B:63:?, code skipped:
            r7 = (defpackage.daz) r4.a.get(r6);
            r8 = r7.c;
     */
    /* JADX WARNING: Missing block: B:64:0x00ca, code skipped:
            if (r8 == 0) goto L_0x0123;
     */
    /* JADX WARNING: Missing block: B:65:0x00cc, code skipped:
            if (r8 == 1) goto L_0x0119;
     */
    /* JADX WARNING: Missing block: B:67:0x00cf, code skipped:
            if (r8 == 2) goto L_0x010f;
     */
    /* JADX WARNING: Missing block: B:69:0x00d2, code skipped:
            if (r8 == 3) goto L_0x0107;
     */
    /* JADX WARNING: Missing block: B:71:0x00d5, code skipped:
            if (r8 == 4) goto L_0x00fd;
     */
    /* JADX WARNING: Missing block: B:73:0x00d8, code skipped:
            if (r8 != 5) goto L_0x00e4;
     */
    /* JADX WARNING: Missing block: B:74:0x00da, code skipped:
            r7 = (defpackage.dba) r7;
            a(r7.a, r7.b);
     */
    /* JADX WARNING: Missing block: B:75:0x00e4, code skipped:
            r2 = new java.lang.StringBuilder(37);
            r2.append("Unhandled operation type: ");
            r2.append(r8);
     */
    /* JADX WARNING: Missing block: B:76:0x00fc, code skipped:
            throw new java.lang.RuntimeException(r2.toString());
     */
    /* JADX WARNING: Missing block: B:77:0x00fd, code skipped:
            r7 = (defpackage.dbb) r7;
            b(r7.a, r7.b);
     */
    /* JADX WARNING: Missing block: B:78:0x0107, code skipped:
            d(((defpackage.dbc) r7).a);
     */
    /* JADX WARNING: Missing block: B:79:0x010f, code skipped:
            r7 = (defpackage.dbd) r7;
            b(r7.a, r7.b);
     */
    /* JADX WARNING: Missing block: B:80:0x0119, code skipped:
            r7 = (defpackage.dbe) r7;
            a(r7.a, r7.b);
     */
    /* JADX WARNING: Missing block: B:81:0x0123, code skipped:
            r7 = (defpackage.dax) r7;
     */
    /* JADX WARNING: Missing block: B:82:0x012b, code skipped:
            if (r7.b.k() != false) goto L_0x0153;
     */
    /* JADX WARNING: Missing block: B:83:0x012d, code skipped:
            r11.b.add(r7.a, r7.b);
            r7.b.a(true);
            r11.f.d(r7.a);
            r8 = r11.A;
            r7 = r7.a;
     */
    /* JADX WARNING: Missing block: B:84:0x0148, code skipped:
            if (r11.x == null) goto L_0x014f;
     */
    /* JADX WARNING: Missing block: B:85:0x014a, code skipped:
            r9 = r11.x.a;
     */
    /* JADX WARNING: Missing block: B:86:0x014f, code skipped:
            r9 = -1;
     */
    /* JADX WARNING: Missing block: B:87:0x0150, code skipped:
            r8.a(r7, r9);
     */
    /* JADX WARNING: Missing block: B:88:0x0153, code skipped:
            r6 = r6 + 1;
     */
    public final void a() {
        /*
        r11 = this;
        r0 = defpackage.cno.d();
        if (r0 == 0) goto L_0x0009;
    L_0x0006:
        defpackage.cno.a();
    L_0x0009:
        r1 = r11.U;	 Catch:{ all -> 0x0165 }
        r1 = r1.get();	 Catch:{ all -> 0x0165 }
        r2 = 0;
        if (r1 == 0) goto L_0x015d;
    L_0x0012:
        r1 = r11.k;	 Catch:{ all -> 0x0165 }
        r1 = r1.get();	 Catch:{ all -> 0x0165 }
        if (r1 == 0) goto L_0x015d;
    L_0x001a:
        r1 = r11.V;	 Catch:{ all -> 0x0165 }
        r1 = r1.get();	 Catch:{ all -> 0x0165 }
        if (r1 == 0) goto L_0x0024;
    L_0x0022:
        goto L_0x015d;
    L_0x0024:
        r1 = r11.u;	 Catch:{ all -> 0x0165 }
        r3 = 1;
        if (r1 == 0) goto L_0x004d;
    L_0x0029:
        r1 = r1.n();	 Catch:{ all -> 0x0165 }
        if (r1 == 0) goto L_0x004d;
    L_0x002f:
        r1 = r11.ap;	 Catch:{ all -> 0x0165 }
        r1 = r1 + r3;
        r11.ap = r1;	 Catch:{ all -> 0x0165 }
        r2 = 100;
        if (r1 > r2) goto L_0x0045;
    L_0x0038:
        r1 = defpackage.cuh.a;	 Catch:{ all -> 0x0165 }
        r2 = r11.o;	 Catch:{ all -> 0x0165 }
        r1.a(r2);	 Catch:{ all -> 0x0165 }
        if (r0 == 0) goto L_0x0044;
    L_0x0041:
        defpackage.cno.c();
    L_0x0044:
        return;
    L_0x0045:
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0165 }
        r2 = "Too many retries -- RecyclerView is stuck in layout.";
        r1.<init>(r2);	 Catch:{ all -> 0x0165 }
        throw r1;	 Catch:{ all -> 0x0165 }
    L_0x004d:
        r11.ap = r2;	 Catch:{ all -> 0x0165 }
        r1 = 0;
    L_0x0050:
        monitor-enter(r11);	 Catch:{ all -> 0x0165 }
        r4 = r11.T;	 Catch:{ all -> 0x015a }
        r4 = r4.isEmpty();	 Catch:{ all -> 0x015a }
        if (r4 == 0) goto L_0x0060;
    L_0x0059:
        r3 = r11.U;	 Catch:{ all -> 0x015a }
        r3.set(r2);	 Catch:{ all -> 0x015a }
        monitor-exit(r11);	 Catch:{ all -> 0x015a }
        goto L_0x008e;
    L_0x0060:
        r4 = r11.T;	 Catch:{ all -> 0x015a }
        r4 = r4.peekFirst();	 Catch:{ all -> 0x015a }
        r4 = (defpackage.day) r4;	 Catch:{ all -> 0x015a }
        r5 = r4.d;	 Catch:{ all -> 0x015a }
        if (r5 == 0) goto L_0x009c;
    L_0x006c:
        r5 = r4.a;	 Catch:{ all -> 0x015a }
        r5 = r5.size();	 Catch:{ all -> 0x015a }
        r6 = 0;
    L_0x0073:
        if (r6 < r5) goto L_0x0076;
    L_0x0075:
        goto L_0x009c;
    L_0x0076:
        r7 = r4.a;	 Catch:{ all -> 0x015a }
        r7 = r7.get(r6);	 Catch:{ all -> 0x015a }
        r7 = (defpackage.daz) r7;	 Catch:{ all -> 0x015a }
        r8 = r7 instanceof defpackage.dax;	 Catch:{ all -> 0x015a }
        if (r8 != 0) goto L_0x0083;
    L_0x0082:
        goto L_0x0099;
    L_0x0083:
        r7 = (defpackage.dax) r7;	 Catch:{ all -> 0x015a }
        r7 = r7.b;	 Catch:{ all -> 0x015a }
        r7 = r7.j();	 Catch:{ all -> 0x015a }
        if (r7 != 0) goto L_0x0099;
    L_0x008d:
        monitor-exit(r11);	 Catch:{ all -> 0x015a }
    L_0x008e:
        if (r1 == 0) goto L_0x0093;
    L_0x0090:
        r11.k();	 Catch:{ all -> 0x0165 }
    L_0x0093:
        if (r0 == 0) goto L_0x0098;
    L_0x0095:
        defpackage.cno.c();
    L_0x0098:
        return;
    L_0x0099:
        r6 = r6 + 1;
        goto L_0x0073;
    L_0x009c:
        r5 = r11.T;	 Catch:{ all -> 0x015a }
        r5.pollFirst();	 Catch:{ all -> 0x015a }
        monitor-exit(r11);	 Catch:{ all -> 0x015a }
        monitor-enter(r11);	 Catch:{ all -> 0x0165 }
        r5 = r4.a;	 Catch:{ all -> 0x0157 }
        r5 = r5.size();	 Catch:{ all -> 0x0157 }
        r6 = 0;
    L_0x00aa:
        if (r6 < r5) goto L_0x00c0;
    L_0x00ac:
        monitor-exit(r11);	 Catch:{ all -> 0x0157 }
        r5 = r4.c;	 Catch:{ all -> 0x0165 }
        r5.a();	 Catch:{ all -> 0x0165 }
        r5 = r11.W;	 Catch:{ all -> 0x0165 }
        r6 = r4.c;	 Catch:{ all -> 0x0165 }
        r5.addLast(r6);	 Catch:{ all -> 0x0165 }
        r11.j();	 Catch:{ all -> 0x0165 }
        r4 = r4.b;	 Catch:{ all -> 0x0165 }
        r1 = r1 | r4;
        goto L_0x0050;
    L_0x00c0:
        r7 = r4.a;	 Catch:{ all -> 0x0157 }
        r7 = r7.get(r6);	 Catch:{ all -> 0x0157 }
        r7 = (defpackage.daz) r7;	 Catch:{ all -> 0x0157 }
        r8 = r7.c;	 Catch:{ all -> 0x0157 }
        if (r8 == 0) goto L_0x0123;
    L_0x00cc:
        if (r8 == r3) goto L_0x0119;
    L_0x00ce:
        r9 = 2;
        if (r8 == r9) goto L_0x010f;
    L_0x00d1:
        r9 = 3;
        if (r8 == r9) goto L_0x0107;
    L_0x00d4:
        r9 = 4;
        if (r8 == r9) goto L_0x00fd;
    L_0x00d7:
        r9 = 5;
        if (r8 != r9) goto L_0x00e4;
    L_0x00da:
        r7 = (defpackage.dba) r7;	 Catch:{ all -> 0x0157 }
        r8 = r7.a;	 Catch:{ all -> 0x0157 }
        r7 = r7.b;	 Catch:{ all -> 0x0157 }
        r11.a(r8, r7);	 Catch:{ all -> 0x0157 }
        goto L_0x0153;
    L_0x00e4:
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0157 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0157 }
        r3 = 37;
        r2.<init>(r3);	 Catch:{ all -> 0x0157 }
        r3 = "Unhandled operation type: ";
        r2.append(r3);	 Catch:{ all -> 0x0157 }
        r2.append(r8);	 Catch:{ all -> 0x0157 }
        r2 = r2.toString();	 Catch:{ all -> 0x0157 }
        r1.<init>(r2);	 Catch:{ all -> 0x0157 }
        throw r1;	 Catch:{ all -> 0x0157 }
    L_0x00fd:
        r7 = (defpackage.dbb) r7;	 Catch:{ all -> 0x0157 }
        r8 = r7.a;	 Catch:{ all -> 0x0157 }
        r7 = r7.b;	 Catch:{ all -> 0x0157 }
        r11.b(r8, r7);	 Catch:{ all -> 0x0157 }
        goto L_0x0153;
    L_0x0107:
        r7 = (defpackage.dbc) r7;	 Catch:{ all -> 0x0157 }
        r7 = r7.a;	 Catch:{ all -> 0x0157 }
        r11.d(r7);	 Catch:{ all -> 0x0157 }
        goto L_0x0153;
    L_0x010f:
        r7 = (defpackage.dbd) r7;	 Catch:{ all -> 0x0157 }
        r8 = r7.a;	 Catch:{ all -> 0x0157 }
        r7 = r7.b;	 Catch:{ all -> 0x0157 }
        r11.b(r8, r7);	 Catch:{ all -> 0x0157 }
        goto L_0x0153;
    L_0x0119:
        r7 = (defpackage.dbe) r7;	 Catch:{ all -> 0x0157 }
        r8 = r7.a;	 Catch:{ all -> 0x0157 }
        r7 = r7.b;	 Catch:{ all -> 0x0157 }
        r11.a(r8, r7);	 Catch:{ all -> 0x0157 }
        goto L_0x0153;
    L_0x0123:
        r7 = (defpackage.dax) r7;	 Catch:{ all -> 0x0157 }
        r8 = r7.b;	 Catch:{ all -> 0x0157 }
        r8 = r8.k();	 Catch:{ all -> 0x0157 }
        if (r8 != 0) goto L_0x0153;
    L_0x012d:
        r8 = r11.b;	 Catch:{ all -> 0x0157 }
        r9 = r7.a;	 Catch:{ all -> 0x0157 }
        r10 = r7.b;	 Catch:{ all -> 0x0157 }
        r8.add(r9, r10);	 Catch:{ all -> 0x0157 }
        r8 = r7.b;	 Catch:{ all -> 0x0157 }
        r8.a(r3);	 Catch:{ all -> 0x0157 }
        r8 = r11.f;	 Catch:{ all -> 0x0157 }
        r9 = r7.a;	 Catch:{ all -> 0x0157 }
        r8.d(r9);	 Catch:{ all -> 0x0157 }
        r8 = r11.A;	 Catch:{ all -> 0x0157 }
        r7 = r7.a;	 Catch:{ all -> 0x0157 }
        r9 = r11.x;	 Catch:{ all -> 0x0157 }
        if (r9 == 0) goto L_0x014f;
    L_0x014a:
        r9 = r11.x;	 Catch:{ all -> 0x0157 }
        r9 = r9.a;	 Catch:{ all -> 0x0157 }
        goto L_0x0150;
    L_0x014f:
        r9 = -1;
    L_0x0150:
        r8.a(r7, r9);	 Catch:{ all -> 0x0157 }
    L_0x0153:
        r6 = r6 + 1;
        goto L_0x00aa;
    L_0x0157:
        r1 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x0157 }
        throw r1;	 Catch:{ all -> 0x0165 }
    L_0x015a:
        r1 = move-exception;
        monitor-exit(r11);	 Catch:{ all -> 0x015a }
        throw r1;	 Catch:{ all -> 0x0165 }
    L_0x015d:
        r11.ap = r2;	 Catch:{ all -> 0x0165 }
        if (r0 == 0) goto L_0x0164;
    L_0x0161:
        defpackage.cno.c();
    L_0x0164:
        return;
    L_0x0165:
        r1 = move-exception;
        if (r0 == 0) goto L_0x016b;
    L_0x0168:
        defpackage.cno.c();
    L_0x016b:
        goto L_0x016d;
    L_0x016c:
        throw r1;
    L_0x016d:
        goto L_0x016c;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dad.a():void");
    }

    public final void a(dax dax) {
        a((daz) dax);
        cyl cyl = dax.b;
        cyl.a(this.ac);
        if (this.k.get()) {
            d(cyl);
        }
    }

    public final void a(daz daz) {
        if (this.aq == null) {
            this.aq = new day(this.an);
        }
        this.aq.a.add(daz);
    }

    public final void i() {
        if (this.u != null) {
            this.i.removeCallbacks(this.X);
            this.u.removeCallbacks(this.X);
            abe.a(this.u, this.X);
            return;
        }
        this.i.removeCallbacks(this.X);
        this.i.post(this.X);
    }

    public final void a(int i, List list) {
        m();
        synchronized (this) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                dbz dbz = (dbz) list.get(i2);
                dad.a(dbz);
                cyl b = b(dbz);
                if (this.z) {
                    throw new RuntimeException("Trying to do a sync insert when using asynchronous mutations!");
                }
                this.b.add(i + i2, b);
                this.C.a(dbz);
            }
        }
        this.f.c(i, list.size());
        ddi ddi = this.A;
        list.size();
        ddi.a(ddi.a(i, this.x != null ? this.x.a : -1));
    }

    public final void a(int i, dbz dbz) {
        boolean f;
        synchronized (this) {
            cyl cyl = (cyl) this.b.get(i);
            f = cyl.e().f();
            dad.a(dbz);
            this.C.a(dbz);
            a(cyl, dbz);
        }
        if (f || dbz.f()) {
            this.f.c(i);
        }
        ddi ddi = this.A;
        ddi.a(ddi.b(i, 1));
    }

    public final void b(int i, List list) {
        synchronized (this) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = i + i2;
                cyl cyl = (cyl) this.b.get(i3);
                dbz dbz = (dbz) list.get(i2);
                dad.a(dbz);
                if (dbz.f() || cyl.e().f()) {
                    this.f.c(i3);
                }
                this.C.a(dbz);
                a(cyl, dbz);
            }
        }
        ddi ddi = this.A;
        ddi.a(ddi.b(i, list.size()));
    }

    public final void a(int i, int i2) {
        cyl cyl;
        boolean z;
        int i3 = this.x != null ? this.x.a : -1;
        synchronized (this) {
            Object obj;
            cyl = (cyl) this.b.remove(i);
            this.b.add(i2, cyl);
            z = true;
            if (i3 > 0) {
                float f = (float) i2;
                int i4 = this.v;
                float f2 = ((float) i3) * this.j;
                if (f >= ((float) i4) - f2) {
                    if (f <= ((float) (i4 + i3)) + f2) {
                        obj = 1;
                    }
                }
            }
            obj = null;
        }
        if (cyl.f() && obj == null) {
            cyl.b();
        }
        this.f.b(i, i2);
        ddi ddi = this.A;
        if (!(ddi.a() || i3 == -1)) {
            int i5 = ddi.a;
            Object obj2 = (i2 < i5 || i2 > (i5 + i3) - 1) ? null : 1;
            Object obj3 = (i < i5 || i > (i5 + i3) - 1) ? null : 1;
            if (obj2 == null && obj3 == null) {
                z = false;
            }
        }
        ddi.a(z);
    }

    public final void d(int i) {
        cyl cyl;
        e(1);
        synchronized (this) {
            cyl = (cyl) this.b.remove(i);
        }
        this.f.e(i);
        cyl.l();
        ddi ddi = this.A;
        ddi.a(ddi.b(i));
    }

    public final void b(int i, int i2) {
        e(i2);
        synchronized (this) {
            for (int i3 = 0; i3 < i2; i3++) {
                ((cyl) this.b.remove(i)).l();
            }
        }
        this.f.d(i, i2);
        ddi ddi = this.A;
        ddi.a(ddi.b(i));
    }

    public final void a(boolean z, cyi cyi) {
        cno.a();
        try {
            if (this.z) {
                throw new RuntimeException("Trying to do a sync notifyChangeSetComplete when using asynchronous mutations!");
            }
            cyi.a();
            this.W.addLast(cyi);
            j();
            if (z) {
                k();
            }
            cno.c();
        } catch (Throwable th) {
            cno.c();
        }
    }

    public final void j() {
        if (!this.W.isEmpty() && this.am) {
            RecyclerView recyclerView = this.u;
            if (recyclerView != null && recyclerView.q()) {
                recyclerView = this.u;
                if (recyclerView.q && recyclerView.getWindowVisibility() == 0) {
                    ViewParent viewParent = recyclerView;
                    while (viewParent instanceof View) {
                        View view = (View) viewParent;
                        if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                            break;
                        }
                        viewParent = view.getParent();
                    }
                    if (recyclerView.getGlobalVisibleRect(G)) {
                        if (this.W.size() > 20) {
                            this.W.clear();
                            cnh cnh = this.g.d;
                            if (cnh != null) {
                                StringBuilder stringBuilder = new StringBuilder();
                                if (this.u == null) {
                                    stringBuilder.append("mMountedView == null");
                                } else {
                                    stringBuilder.append("mMountedView: ");
                                    stringBuilder.append(this.u);
                                    stringBuilder.append(", hasPendingAdapterUpdates(): ");
                                    stringBuilder.append(this.u.q());
                                    stringBuilder.append(", isAttachedToWindow(): ");
                                    stringBuilder.append(this.u.q);
                                    stringBuilder.append(", getWindowVisibility(): ");
                                    stringBuilder.append(this.u.getWindowVisibility());
                                    stringBuilder.append(", vie visible hierarchy: ");
                                    RecyclerView recyclerView2 = this.u;
                                    ArrayList arrayList = new ArrayList();
                                    while (recyclerView2 instanceof View) {
                                        View view2 = recyclerView2;
                                        String simpleName = view2.getClass().getSimpleName();
                                        float alpha = view2.getAlpha();
                                        int visibility = view2.getVisibility();
                                        StringBuilder stringBuilder2 = new StringBuilder(simpleName.length() + 52);
                                        stringBuilder2.append("view=");
                                        stringBuilder2.append(simpleName);
                                        stringBuilder2.append(", alpha=");
                                        stringBuilder2.append(alpha);
                                        stringBuilder2.append(", visibility=");
                                        stringBuilder2.append(visibility);
                                        arrayList.add(stringBuilder2.toString());
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        recyclerView2 = view2.getParent();
                                    }
                                    stringBuilder.append(arrayList);
                                    stringBuilder.append(", getGlobalVisibleRect(): ");
                                    stringBuilder.append(this.u.getGlobalVisibleRect(G));
                                    stringBuilder.append(", isComputingLayout(): ");
                                    stringBuilder.append(this.u.n());
                                }
                                stringBuilder.append(", visible range: [");
                                stringBuilder.append(this.v);
                                stringBuilder.append(", ");
                                stringBuilder.append(this.w);
                                stringBuilder.append("]");
                                String valueOf = String.valueOf(stringBuilder);
                                StringBuilder stringBuilder3 = new StringBuilder(valueOf.length() + 56);
                                stringBuilder3.append("@OnDataRendered callbacks aren't triggered as expected: ");
                                stringBuilder3.append(valueOf);
                                cnh.a(2, stringBuilder3.toString());
                                return;
                            }
                        }
                    }
                }
            }
            boolean z = this.u != null;
            ArrayDeque arrayDeque = new ArrayDeque(this.W);
            this.W.clear();
            this.i.postAtFrontOfQueue(new dah(arrayDeque, z));
        }
    }

    public final synchronized void b(boolean z, cyi cyi) {
        if (this.aq == null) {
            this.aq = new day(this.an);
        }
        day day = this.aq;
        day.b = z;
        day.c = cyi;
        this.T.addLast(day);
        this.U.set(true);
        this.aq = null;
    }

    /* JADX WARNING: Missing block: B:24:?, code skipped:
            n();
     */
    /* JADX WARNING: Missing block: B:25:0x0043, code skipped:
            monitor-exit(r4);
     */
    /* JADX WARNING: Missing block: B:26:0x0044, code skipped:
            return;
     */
    public final synchronized void k() {
        /*
        r4 = this;
        monitor-enter(r4);
        monitor-enter(r4);	 Catch:{ all -> 0x0048 }
        r0 = r4.k;	 Catch:{ all -> 0x0045 }
        r0 = r0.get();	 Catch:{ all -> 0x0045 }
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        monitor-exit(r4);	 Catch:{ all -> 0x0045 }
        monitor-exit(r4);
        return;
    L_0x000d:
        r0 = r4.M;	 Catch:{ all -> 0x0045 }
        r0 = r0.get();	 Catch:{ all -> 0x0045 }
        if (r0 == 0) goto L_0x001b;
    L_0x0015:
        r4.i();	 Catch:{ all -> 0x0045 }
        monitor-exit(r4);	 Catch:{ all -> 0x0045 }
        monitor-exit(r4);
        return;
    L_0x001b:
        r0 = r4.x;	 Catch:{ all -> 0x0045 }
        if (r0 != 0) goto L_0x003f;
    L_0x001f:
        r0 = r4.b;	 Catch:{ all -> 0x0045 }
        r1 = r4.S;	 Catch:{ all -> 0x0045 }
        r0 = defpackage.dad.a(r0, r1);	 Catch:{ all -> 0x0045 }
        if (r0 < 0) goto L_0x003f;
    L_0x0029:
        r1 = new dbk;	 Catch:{ all -> 0x0045 }
        r2 = r4.b;	 Catch:{ all -> 0x0045 }
        r1.<init>(r0, r2);	 Catch:{ all -> 0x0045 }
        r0 = r4.ae;	 Catch:{ all -> 0x0045 }
        r2 = r0.a;	 Catch:{ all -> 0x0045 }
        r0 = r0.b;	 Catch:{ all -> 0x0045 }
        r3 = r4.e;	 Catch:{ all -> 0x0045 }
        r3 = r3.a();	 Catch:{ all -> 0x0045 }
        r4.a(r2, r0, r1, r3);	 Catch:{ all -> 0x0045 }
    L_0x003f:
        monitor-exit(r4);	 Catch:{ all -> 0x0045 }
        r4.n();	 Catch:{ all -> 0x0048 }
        monitor-exit(r4);
        return;
    L_0x0045:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0045 }
        throw r0;	 Catch:{ all -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        monitor-exit(r4);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dad.k():void");
    }

    public final void l() {
        if (cuj.d) {
            long id = Thread.currentThread().getId();
            long andSet = this.n.getAndSet(id);
            if (id != andSet && andSet != -1) {
                StringBuilder stringBuilder = new StringBuilder(94);
                stringBuilder.append("Multiple threads applying change sets at once! (");
                stringBuilder.append(andSet);
                stringBuilder.append(" and ");
                stringBuilder.append(id);
                stringBuilder.append(")");
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public final synchronized ComponentTree c(int i) {
        cyl cyl = (cyl) this.b.get(i);
        int b = b(cyl);
        int c = c(cyl);
        if (cyl.a(b, c)) {
            return cyl.g();
        }
        cyl.a(this.g, b, c, null);
        return cyl.g();
    }

    public static void a(dbz dbz) {
        if (dbz == null) {
            throw new RuntimeException("Received null RenderInfo to insert/update!");
        }
    }

    /* JADX WARNING: Missing block: B:37:0x007c, code skipped:
            r9.V.set(false);
     */
    /* JADX WARNING: Missing block: B:38:0x0083, code skipped:
            if (r9.z == false) goto L_0x0088;
     */
    /* JADX WARNING: Missing block: B:39:0x0085, code skipped:
            o();
     */
    /* JADX WARNING: Missing block: B:40:0x0088, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:50:0x00a9, code skipped:
            r9.V.set(false);
     */
    /* JADX WARNING: Missing block: B:51:0x00b0, code skipped:
            if (r9.z == false) goto L_0x00b5;
     */
    /* JADX WARNING: Missing block: B:52:0x00b2, code skipped:
            o();
     */
    /* JADX WARNING: Missing block: B:53:0x00b5, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:156:0x0262, code skipped:
            r9.V.set(false);
     */
    /* JADX WARNING: Missing block: B:157:0x0269, code skipped:
            if (r9.z == false) goto L_0x026e;
     */
    /* JADX WARNING: Missing block: B:158:0x026b, code skipped:
            o();
     */
    /* JADX WARNING: Missing block: B:159:0x026e, code skipped:
            return;
     */
    public final void a(defpackage.crd r10, int r11, int r12, defpackage.coj r13) {
        /*
        r9 = this;
        r0 = r9.e;
        r0 = r0.a();
        r1 = 1;
        if (r0 == 0) goto L_0x0032;
    L_0x0009:
        if (r0 != r1) goto L_0x002a;
    L_0x000b:
        r2 = android.view.View.MeasureSpec.getMode(r12);
        if (r2 == 0) goto L_0x0022;
    L_0x0011:
        if (r13 != 0) goto L_0x0041;
    L_0x0013:
        r2 = android.view.View.MeasureSpec.getMode(r11);
        if (r2 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0041;
    L_0x001a:
        r10 = new java.lang.IllegalStateException;
        r11 = "Can't use Unspecified width on a vertical scrolling Recycler if dynamic measurement is not allowed";
        r10.<init>(r11);
        throw r10;
    L_0x0022:
        r10 = new java.lang.IllegalStateException;
        r11 = "Height mode has to be EXACTLY OR AT MOST for a vertical scrolling RecyclerView";
        r10.<init>(r11);
        throw r10;
    L_0x002a:
        r10 = new java.lang.UnsupportedOperationException;
        r11 = "The orientation defined by LayoutInfo should be either OrientationHelper.HORIZONTAL or OrientationHelper.VERTICAL";
        r10.<init>(r11);
        throw r10;
    L_0x0032:
        r2 = android.view.View.MeasureSpec.getMode(r11);
        if (r2 == 0) goto L_0x0288;
    L_0x0038:
        if (r13 == 0) goto L_0x003b;
    L_0x003a:
        goto L_0x0041;
    L_0x003b:
        r2 = android.view.View.MeasureSpec.getMode(r12);
        if (r2 == 0) goto L_0x0280;
    L_0x0041:
        r2 = r9.V;
        r2.set(r1);
        r2 = 0;
        monitor-enter(r9);	 Catch:{ all -> 0x0272 }
        r3 = r9.s;	 Catch:{ all -> 0x026f }
        r4 = -1;
        r5 = 0;
        if (r3 == r4) goto L_0x00f2;
    L_0x004e:
        r3 = r9.M;	 Catch:{ all -> 0x026f }
        r3 = r3.get();	 Catch:{ all -> 0x026f }
        if (r3 == 0) goto L_0x0058;
    L_0x0056:
        goto L_0x00f2;
    L_0x0058:
        if (r0 == r1) goto L_0x0089;
    L_0x005a:
        r3 = r9.t;	 Catch:{ all -> 0x026f }
        r4 = r9.ae;	 Catch:{ all -> 0x026f }
        r4 = r4.b;	 Catch:{ all -> 0x026f }
        r3 = defpackage.cpz.a(r3, r12, r4);	 Catch:{ all -> 0x026f }
        if (r3 == 0) goto L_0x00b6;
    L_0x0066:
        r12 = r9.q;	 Catch:{ all -> 0x026f }
        if (r12 == 0) goto L_0x006f;
    L_0x006a:
        r11 = r9.ae;	 Catch:{ all -> 0x026f }
        r11 = r11.a;	 Catch:{ all -> 0x026f }
        goto L_0x0073;
    L_0x006f:
        r11 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x026f }
    L_0x0073:
        r10.a = r11;	 Catch:{ all -> 0x026f }
        r11 = r9.ae;	 Catch:{ all -> 0x026f }
        r11 = r11.b;	 Catch:{ all -> 0x026f }
        r10.b = r11;	 Catch:{ all -> 0x026f }
        monitor-exit(r9);	 Catch:{ all -> 0x026f }
        r10 = r9.V;
        r10.set(r2);
        r10 = r9.z;
        if (r10 == 0) goto L_0x0088;
    L_0x0085:
        r9.o();
    L_0x0088:
        return;
    L_0x0089:
        r3 = r9.s;	 Catch:{ all -> 0x026f }
        r4 = r9.ae;	 Catch:{ all -> 0x026f }
        r4 = r4.a;	 Catch:{ all -> 0x026f }
        r3 = defpackage.cpz.a(r3, r11, r4);	 Catch:{ all -> 0x026f }
        if (r3 == 0) goto L_0x00b6;
    L_0x0095:
        r11 = r9.ae;	 Catch:{ all -> 0x026f }
        r13 = r11.a;	 Catch:{ all -> 0x026f }
        r10.a = r13;	 Catch:{ all -> 0x026f }
        r13 = r9.q;	 Catch:{ all -> 0x026f }
        if (r13 == 0) goto L_0x00a2;
    L_0x009f:
        r11 = r11.b;	 Catch:{ all -> 0x026f }
        goto L_0x00a6;
    L_0x00a2:
        r11 = android.view.View.MeasureSpec.getSize(r12);	 Catch:{ all -> 0x026f }
    L_0x00a6:
        r10.b = r11;	 Catch:{ all -> 0x026f }
        monitor-exit(r9);	 Catch:{ all -> 0x026f }
        r10 = r9.V;
        r10.set(r2);
        r10 = r9.z;
        if (r10 == 0) goto L_0x00b5;
    L_0x00b2:
        r9.o();
    L_0x00b5:
        return;
    L_0x00b6:
        r3 = r9.k;	 Catch:{ all -> 0x026f }
        r3.set(r2);	 Catch:{ all -> 0x026f }
        r9.x = r5;	 Catch:{ all -> 0x026f }
        r3 = r9.b;	 Catch:{ all -> 0x026f }
        r3 = r3.size();	 Catch:{ all -> 0x026f }
        r4 = 0;
    L_0x00c4:
        if (r4 >= r3) goto L_0x00d4;
    L_0x00c6:
        r6 = r9.b;	 Catch:{ all -> 0x026f }
        r6 = r6.get(r4);	 Catch:{ all -> 0x026f }
        r6 = (defpackage.cyl) r6;	 Catch:{ all -> 0x026f }
        r6.c();	 Catch:{ all -> 0x026f }
        r4 = r4 + 1;
        goto L_0x00c4;
    L_0x00d4:
        r3 = android.os.Looper.myLooper();	 Catch:{ all -> 0x026f }
        r4 = android.os.Looper.getMainLooper();	 Catch:{ all -> 0x026f }
        if (r3 != r4) goto L_0x00e4;
    L_0x00de:
        r3 = r9.f;	 Catch:{ all -> 0x026f }
        r3.aa_();	 Catch:{ all -> 0x026f }
        goto L_0x00f2;
    L_0x00e4:
        r3 = r9.i;	 Catch:{ all -> 0x026f }
        r4 = r9.aa;	 Catch:{ all -> 0x026f }
        r3.removeCallbacks(r4);	 Catch:{ all -> 0x026f }
        r3 = r9.i;	 Catch:{ all -> 0x026f }
        r4 = r9.aa;	 Catch:{ all -> 0x026f }
        r3.post(r4);	 Catch:{ all -> 0x026f }
    L_0x00f2:
        r9.s = r11;	 Catch:{ all -> 0x026f }
        r9.t = r12;	 Catch:{ all -> 0x026f }
        r3 = r9.x;	 Catch:{ all -> 0x026f }
        if (r3 != 0) goto L_0x010c;
    L_0x00fa:
        r3 = r9.r();	 Catch:{ all -> 0x026f }
        if (r3 != 0) goto L_0x0101;
    L_0x0100:
        goto L_0x010c;
    L_0x0101:
        r4 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x026f }
        r6 = android.view.View.MeasureSpec.getSize(r12);	 Catch:{ all -> 0x026f }
        r9.a(r4, r6, r3, r0);	 Catch:{ all -> 0x026f }
    L_0x010c:
        r3 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r0 == r1) goto L_0x016b;
    L_0x0110:
        r11 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x026f }
        r0 = android.view.View.MeasureSpec.getMode(r12);	 Catch:{ all -> 0x026f }
        if (r0 != r3) goto L_0x011b;
    L_0x011a:
        goto L_0x014b;
    L_0x011b:
        if (r13 == 0) goto L_0x014b;
    L_0x011d:
        r12 = r9.x;	 Catch:{ all -> 0x026f }
        if (r12 == 0) goto L_0x0142;
    L_0x0121:
        r12 = r9.x;	 Catch:{ all -> 0x026f }
        r12 = r12.b;	 Catch:{ all -> 0x026f }
        r0 = r9.ad;	 Catch:{ all -> 0x026f }
        if (r0 != 0) goto L_0x012f;
    L_0x0129:
        r3 = r9.q;	 Catch:{ all -> 0x026f }
        if (r3 == 0) goto L_0x012e;
    L_0x012d:
        goto L_0x012f;
    L_0x012e:
        r13 = r5;
    L_0x012f:
        r9.y = r13;	 Catch:{ all -> 0x026f }
        r13 = r9.M;	 Catch:{ all -> 0x026f }
        if (r0 != 0) goto L_0x013c;
    L_0x0135:
        r0 = r9.q;	 Catch:{ all -> 0x026f }
        if (r0 == 0) goto L_0x013a;
    L_0x0139:
        goto L_0x013c;
    L_0x013a:
        r0 = 0;
        goto L_0x013d;
    L_0x013c:
        r0 = 1;
    L_0x013d:
        r13.set(r0);	 Catch:{ all -> 0x026f }
        goto L_0x01a6;
    L_0x0142:
        r12 = r9.M;	 Catch:{ all -> 0x026f }
        r12.set(r1);	 Catch:{ all -> 0x026f }
        r9.y = r13;	 Catch:{ all -> 0x026f }
        r12 = 0;
        goto L_0x01a6;
    L_0x014b:
        r12 = android.view.View.MeasureSpec.getSize(r12);	 Catch:{ all -> 0x026f }
        r0 = r9.ad;	 Catch:{ all -> 0x026f }
        if (r0 != 0) goto L_0x0159;
    L_0x0153:
        r3 = r9.q;	 Catch:{ all -> 0x026f }
        if (r3 == 0) goto L_0x0158;
    L_0x0157:
        goto L_0x0159;
    L_0x0158:
        r13 = r5;
    L_0x0159:
        r9.y = r13;	 Catch:{ all -> 0x026f }
        r13 = r9.M;	 Catch:{ all -> 0x026f }
        if (r0 != 0) goto L_0x0166;
    L_0x015f:
        r0 = r9.q;	 Catch:{ all -> 0x026f }
        if (r0 == 0) goto L_0x0164;
    L_0x0163:
        goto L_0x0166;
    L_0x0164:
        r0 = 0;
        goto L_0x0167;
    L_0x0166:
        r0 = 1;
    L_0x0167:
        r13.set(r0);	 Catch:{ all -> 0x026f }
        goto L_0x01a6;
    L_0x016b:
        r12 = android.view.View.MeasureSpec.getSize(r12);	 Catch:{ all -> 0x026f }
        r0 = android.view.View.MeasureSpec.getMode(r11);	 Catch:{ all -> 0x026f }
        if (r0 != r3) goto L_0x0176;
    L_0x0175:
        goto L_0x0196;
    L_0x0176:
        if (r13 == 0) goto L_0x0196;
    L_0x0178:
        r11 = r9.x;	 Catch:{ all -> 0x026f }
        if (r11 == 0) goto L_0x018d;
    L_0x017c:
        r11 = r9.x;	 Catch:{ all -> 0x026f }
        r11 = r11.b;	 Catch:{ all -> 0x026f }
        r0 = r9.q;	 Catch:{ all -> 0x026f }
        if (r0 != 0) goto L_0x0185;
    L_0x0184:
        r13 = r5;
    L_0x0185:
        r9.y = r13;	 Catch:{ all -> 0x026f }
        r13 = r9.M;	 Catch:{ all -> 0x026f }
        r13.set(r0);	 Catch:{ all -> 0x026f }
        goto L_0x01a6;
    L_0x018d:
        r11 = r9.M;	 Catch:{ all -> 0x026f }
        r11.set(r1);	 Catch:{ all -> 0x026f }
        r9.y = r13;	 Catch:{ all -> 0x026f }
        r11 = 0;
        goto L_0x01a6;
    L_0x0196:
        r11 = android.view.View.MeasureSpec.getSize(r11);	 Catch:{ all -> 0x026f }
        r0 = r9.q;	 Catch:{ all -> 0x026f }
        if (r0 != 0) goto L_0x019f;
    L_0x019e:
        r13 = r5;
    L_0x019f:
        r9.y = r13;	 Catch:{ all -> 0x026f }
        r13 = r9.M;	 Catch:{ all -> 0x026f }
        r13.set(r0);	 Catch:{ all -> 0x026f }
    L_0x01a6:
        r13 = r9.q;	 Catch:{ all -> 0x026f }
        if (r13 == 0) goto L_0x01bb;
    L_0x01aa:
        r13 = new crd;	 Catch:{ all -> 0x026f }
        r13.<init>();	 Catch:{ all -> 0x026f }
        r9.a(r11, r12, r13);	 Catch:{ all -> 0x026f }
        r11 = r13.a;	 Catch:{ all -> 0x026f }
        r10.a = r11;	 Catch:{ all -> 0x026f }
        r12 = r13.b;	 Catch:{ all -> 0x026f }
        r10.b = r12;	 Catch:{ all -> 0x026f }
        goto L_0x01bf;
    L_0x01bb:
        r10.a = r11;	 Catch:{ all -> 0x026f }
        r10.b = r12;	 Catch:{ all -> 0x026f }
    L_0x01bf:
        r10 = new crd;	 Catch:{ all -> 0x026f }
        r10.<init>(r11, r12);	 Catch:{ all -> 0x026f }
        r9.ae = r10;	 Catch:{ all -> 0x026f }
        r10 = r9.k;	 Catch:{ all -> 0x026f }
        r10.set(r1);	 Catch:{ all -> 0x026f }
        r10 = r9.P;	 Catch:{ all -> 0x026f }
        if (r10 == 0) goto L_0x0239;
    L_0x01cf:
        r10 = r9.ao;	 Catch:{ all -> 0x026f }
        if (r10 != 0) goto L_0x0239;
    L_0x01d3:
        r9.an = r1;	 Catch:{ all -> 0x026f }
        r10 = defpackage.cro.a();	 Catch:{ all -> 0x026f }
        if (r10 == 0) goto L_0x01df;
    L_0x01db:
        r9.a();	 Catch:{ all -> 0x026f }
        goto L_0x0237;
    L_0x01df:
        r10 = r9.b;	 Catch:{ all -> 0x026f }
        r10 = r10.isEmpty();	 Catch:{ all -> 0x026f }
        if (r10 != 0) goto L_0x01f1;
    L_0x01e7:
        r10 = r9.ae;	 Catch:{ all -> 0x026f }
        r11 = r10.a;	 Catch:{ all -> 0x026f }
        r10 = r10.b;	 Catch:{ all -> 0x026f }
        r9.a(r11, r10, r5);	 Catch:{ all -> 0x026f }
        goto L_0x0230;
    L_0x01f1:
        r10 = r9.T;	 Catch:{ all -> 0x026f }
        r10 = r10.isEmpty();	 Catch:{ all -> 0x026f }
        if (r10 != 0) goto L_0x0230;
    L_0x01f9:
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x026f }
        r4.<init>();	 Catch:{ all -> 0x026f }
        r10 = r9.T;	 Catch:{ all -> 0x026f }
        r10 = r10.getFirst();	 Catch:{ all -> 0x026f }
        r10 = (defpackage.day) r10;	 Catch:{ all -> 0x026f }
        r10 = r10.a;	 Catch:{ all -> 0x026f }
        r10 = r10.iterator();	 Catch:{ all -> 0x026f }
    L_0x020c:
        r11 = r10.hasNext();	 Catch:{ all -> 0x026f }
        if (r11 == 0) goto L_0x0224;
    L_0x0212:
        r11 = r10.next();	 Catch:{ all -> 0x026f }
        r11 = (defpackage.daz) r11;	 Catch:{ all -> 0x026f }
        r12 = r11 instanceof defpackage.dax;	 Catch:{ all -> 0x026f }
        if (r12 == 0) goto L_0x020c;
    L_0x021c:
        r11 = (defpackage.dax) r11;	 Catch:{ all -> 0x026f }
        r11 = r11.b;	 Catch:{ all -> 0x026f }
        r4.add(r11);	 Catch:{ all -> 0x026f }
        goto L_0x020c;
    L_0x0224:
        r10 = r9.ae;	 Catch:{ all -> 0x026f }
        r6 = r10.a;	 Catch:{ all -> 0x026f }
        r7 = r10.b;	 Catch:{ all -> 0x026f }
        r5 = 0;
        r8 = 0;
        r3 = r9;
        r3.a(r4, r5, r6, r7, r8);	 Catch:{ all -> 0x026f }
    L_0x0230:
        r10 = defpackage.cuh.a;	 Catch:{ all -> 0x026f }
        r11 = r9.o;	 Catch:{ all -> 0x026f }
        r10.a(r11);	 Catch:{ all -> 0x026f }
    L_0x0237:
        r9.ao = r1;	 Catch:{ all -> 0x026f }
    L_0x0239:
        r10 = r9.T;	 Catch:{ all -> 0x026f }
        r10 = r10.iterator();	 Catch:{ all -> 0x026f }
    L_0x023f:
        r11 = r10.hasNext();	 Catch:{ all -> 0x026f }
        if (r11 == 0) goto L_0x024f;
    L_0x0245:
        r11 = r10.next();	 Catch:{ all -> 0x026f }
        r11 = (defpackage.day) r11;	 Catch:{ all -> 0x026f }
        r9.a(r11);	 Catch:{ all -> 0x026f }
        goto L_0x023f;
    L_0x024f:
        r10 = r9.aq;	 Catch:{ all -> 0x026f }
        if (r10 == 0) goto L_0x0256;
    L_0x0253:
        r9.a(r10);	 Catch:{ all -> 0x026f }
    L_0x0256:
        r10 = r9.x;	 Catch:{ all -> 0x026f }
        if (r10 == 0) goto L_0x0261;
    L_0x025a:
        r10 = r9.v;	 Catch:{ all -> 0x026f }
        r11 = r9.w;	 Catch:{ all -> 0x026f }
        r9.d(r10, r11);	 Catch:{ all -> 0x026f }
    L_0x0261:
        monitor-exit(r9);	 Catch:{ all -> 0x026f }
        r10 = r9.V;
        r10.set(r2);
        r10 = r9.z;
        if (r10 == 0) goto L_0x026e;
    L_0x026b:
        r9.o();
    L_0x026e:
        return;
    L_0x026f:
        r10 = move-exception;
        monitor-exit(r9);	 Catch:{ all -> 0x026f }
        throw r10;	 Catch:{ all -> 0x0272 }
    L_0x0272:
        r10 = move-exception;
        r11 = r9.V;
        r11.set(r2);
        r11 = r9.z;
        if (r11 == 0) goto L_0x027f;
    L_0x027c:
        r9.o();
    L_0x027f:
        throw r10;
    L_0x0280:
        r10 = new java.lang.IllegalStateException;
        r11 = "Can't use Unspecified height on an horizontal scrolling Recycler if dynamic measurement is not allowed";
        r10.<init>(r11);
        throw r10;
    L_0x0288:
        r10 = new java.lang.IllegalStateException;
        r11 = "Width mode has to be EXACTLY OR AT MOST for an horizontal scrolling RecyclerView";
        r10.<init>(r11);
        goto L_0x0291;
    L_0x0290:
        throw r10;
    L_0x0291:
        goto L_0x0290;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dad.a(crd, int, int, coj):void");
    }

    private final void a(int i, int i2, crd crd) {
        cno.a();
        int d = !this.q ? this.e.d() : 0;
        a(this.b, d != -1 ? d : 0, i, i2, crd);
        if (this.x == null) {
            dbk r = r();
            if (r != null) {
                a(i, i2, r, this.e.a());
            }
        }
        cno.c();
    }

    private final int a(List list, int i, int i2, int i3, crd crd) {
        czn a = this.e.a(i2, i3);
        cno.a();
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i2, 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        crd crd2 = new crd();
        int i4 = 0;
        while (a.a() && i < list.size()) {
            cyl cyl = (cyl) list.get(i);
            if (cyl.e().f()) {
                break;
            }
            cyl.a(this.g, this.e.a(makeMeasureSpec), this.e.b(makeMeasureSpec2), crd2);
            a.a(crd2.a, crd2.b);
            i++;
            i4++;
        }
        if (crd != null) {
            i = a.b();
            if (this.e.a() == 1) {
                crd.a = i2;
                crd.b = Math.min(i, i3);
            } else {
                crd.a = Math.min(i, i2);
                crd.b = i3;
            }
        }
        cno.c();
        list.size();
        return i4;
    }

    private final void a(day day) {
        ArrayList arrayList = day.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            daz daz = (daz) arrayList.get(i);
            if (daz instanceof dax) {
                d(((dax) daz).b);
            }
        }
    }

    private final void d(cyl cyl) {
        int b = b(cyl);
        int c = c(cyl);
        if (!cyl.a(b, c)) {
            cyl.a(this.g, b, c);
        }
    }

    private static int a(List list, boolean z) {
        int size;
        if (z) {
            for (size = list.size() - 1; size >= 0; size--) {
                if (((cyl) list.get(size)).e().c()) {
                    return size;
                }
            }
        } else {
            size = list.size();
            for (int i = 0; i < size; i++) {
                if (((cyl) list.get(i)).e().c()) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final void m() {
        if (this.p && !this.b.isEmpty()) {
            throw new UnsupportedOperationException("Circular lists do not support insert operation");
        }
    }

    public final void e(int i) {
        if (this.p && !this.b.isEmpty() && this.b.size() != i) {
            throw new UnsupportedOperationException("Circular lists do not support insert operation");
        }
    }

    public final void a(dbi dbi) {
        cyl cyl = (cyl) dbi.next();
        if (p()) {
            List list = this.b;
            if (!(list == null || list.isEmpty() || cyl == null || this.x != null)) {
                int b = b(cyl);
                int c = c(cyl);
                if (!cyl.a(b, c)) {
                    if (this.N) {
                        cyl.a(this.g, b, c, new dak(this, dbi, cyl));
                        return;
                    }
                    cyl.a(this.g, b, c);
                }
            }
        }
    }

    private final boolean p() {
        return this.Q || this.N;
    }

    private final void a(int i, int i2, dbk dbk, int i3) {
        int a;
        if (p()) {
            dbi dbi = new dbi(dbk.b, dbk.a, this.b.size() - 1, this.S);
            if (p()) {
                List list = this.b;
                if (!(list == null || list.isEmpty())) {
                    cuo cuo = this.aj;
                    a = cuo != null ? cuo.a() : 1;
                    for (int i4 = 0; i4 < a; i4++) {
                        a(dbi);
                    }
                }
            }
        }
        cyl cyl = (cyl) dbk.b.get(dbk.a);
        int b = b(cyl);
        a = c(cyl);
        cno.a();
        try {
            int max;
            if (this.L <= 0 || !cro.a()) {
                crd crd = new crd();
                cyl.a(this.g, b, a, crd);
                max = Math.max(this.e.a(crd.a, crd.b, i, i2), 1);
                if (i3 != 0) {
                    i = crd.a;
                } else {
                    i = crd.b;
                }
            } else {
                max = this.L;
                if (i3 != 0) {
                    i /= max;
                } else {
                    i = i2 / max;
                }
            }
            this.x = new dbo();
            this.x.b = i;
            this.x.a = max;
        } finally {
            cno.c();
        }
    }

    /* JADX WARNING: Missing block: B:13:0x0034, code skipped:
            if (r0 == false) goto L_0x0036;
     */
    public final synchronized void c(int r7, int r8) {
        /*
        r6 = this;
        monitor-enter(r6);
        r0 = r6.s;	 Catch:{ all -> 0x0047 }
        r1 = -1;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        if (r0 != r1) goto L_0x0009;
    L_0x0008:
        goto L_0x0036;
    L_0x0009:
        r0 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2);	 Catch:{ all -> 0x0047 }
        r3 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2);	 Catch:{ all -> 0x0047 }
        r4 = r6.e;	 Catch:{ all -> 0x0047 }
        r4 = r4.a();	 Catch:{ all -> 0x0047 }
        r5 = r6.s;	 Catch:{ all -> 0x0047 }
        if (r5 == r1) goto L_0x0036;
    L_0x001b:
        if (r4 == 0) goto L_0x002a;
    L_0x001d:
        r1 = 1;
        if (r4 == r1) goto L_0x0021;
    L_0x0020:
        goto L_0x0036;
    L_0x0021:
        r1 = r6.ae;	 Catch:{ all -> 0x0047 }
        r1 = r1.a;	 Catch:{ all -> 0x0047 }
        r0 = defpackage.cpz.a(r5, r0, r1);	 Catch:{ all -> 0x0047 }
        goto L_0x0034;
    L_0x002a:
        r0 = r6.t;	 Catch:{ all -> 0x0047 }
        r1 = r6.ae;	 Catch:{ all -> 0x0047 }
        r1 = r1.b;	 Catch:{ all -> 0x0047 }
        r0 = defpackage.cpz.a(r0, r3, r1);	 Catch:{ all -> 0x0047 }
    L_0x0034:
        if (r0 != 0) goto L_0x0045;
    L_0x0036:
        r0 = F;	 Catch:{ all -> 0x0047 }
        r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r2);	 Catch:{ all -> 0x0047 }
        r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r2);	 Catch:{ all -> 0x0047 }
        r1 = r6.y;	 Catch:{ all -> 0x0047 }
        r6.a(r0, r7, r8, r1);	 Catch:{ all -> 0x0047 }
    L_0x0045:
        monitor-exit(r6);
        return;
    L_0x0047:
        r7 = move-exception;
        monitor-exit(r6);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dad.c(int, int):void");
    }

    /* renamed from: a */
    public final void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                a(recyclerView2);
            }
            this.u = recyclerView;
            this.am = true;
            apn b = this.e.b();
            b.a(this.al);
            recyclerView.a(b);
            recyclerView.a(this.f);
            recyclerView.a(this.A.d);
            if (recyclerView instanceof czc) {
                ((czc) recyclerView).a(this.Y);
            } else if (recyclerView.getViewTreeObserver() != null) {
                recyclerView.getViewTreeObserver().addOnPreDrawListener(this.Z);
            }
            this.e.c();
            this.A.a(this.ar);
            int i = this.v;
            if (i == -1 || i < 0 || this.p) {
                if (this.p) {
                    int i2 = 0;
                    i = 1073741823 - (!this.b.isEmpty() ? 1073741823 % this.b.size() : 0);
                    int i3 = this.v;
                    if (i3 != -1 && i3 >= 0) {
                        i2 = i3;
                    }
                    recyclerView.c(i + i2);
                }
            } else if (b instanceof ans) {
                ((ans) b).a_(i, this.af);
            } else {
                recyclerView.c(i);
            }
            recyclerView = this.u;
            if (this.p) {
                Log.w(H, "Sticky header is not supported for circular RecyclerViews");
            } else if (VERSION.SDK_INT < 14) {
                Log.w(H, "Sticky header is supported only on ICS (API14) and above");
            } else if (recyclerView != null) {
                dcb dcb = recyclerView.getParent() instanceof dcb ? (dcb) recyclerView.getParent() : null;
                if (dcb != null) {
                    if (this.ag == null) {
                        this.ag = new dch(this);
                    }
                    apv apv = this.ag;
                    if (apv.a == null) {
                        apv.a = dcb;
                        apv.a.b();
                        apv.b = dcb.m.n;
                        if (apv.b != null) {
                            apv.a.m.a(apv);
                            return;
                        }
                        throw new RuntimeException("LayoutManager of RecyclerView is not initialized yet.");
                    }
                    throw new RuntimeException("SectionsRecyclerView has already been initialized but never reset.");
                }
            }
        }
    }

    /* renamed from: b */
    public final void a(RecyclerView recyclerView) {
        apn b = this.e.b();
        View c = b.c(this.v);
        if (c != null) {
            boolean q = q();
            int width;
            if (this.e.a() == 0) {
                if (q) {
                    width = (recyclerView.getWidth() - b.z()) - apn.j(c);
                } else {
                    width = apn.h(c) - b.x();
                }
                this.af = width;
            } else {
                if (q) {
                    width = (recyclerView.getHeight() - b.A()) - apn.k(c);
                } else {
                    width = apn.i(c) - b.y();
                }
                this.af = width;
            }
        } else {
            this.af = 0;
        }
        recyclerView.b(this.A.d);
        if (recyclerView instanceof czc) {
            ((czc) recyclerView).a(null);
        } else if (recyclerView.getViewTreeObserver() != null) {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(this.Z);
        }
        j();
        recyclerView.a(null);
        recyclerView.a(null);
        ddi ddi = this.A;
        ddf ddf = this.ar;
        if (ddf != null) {
            List list = ddi.c;
            if (list != null) {
                list.remove(ddf);
            }
        }
        synchronized (this) {
            int size = this.b.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((cyl) this.b.get(size)).b();
            }
        }
        if (this.u == recyclerView) {
            this.u = null;
            apv apv = this.ag;
            if (apv != null) {
                dcb dcb = apv.a;
                if (dcb != null) {
                    dcb.m.b(apv);
                    apv.b = null;
                    apv.a = null;
                } else {
                    throw new IllegalStateException("SectionsRecyclerView has not been set yet.");
                }
            }
            this.e.c();
        }
    }

    public final int d() {
        return this.e.d();
    }

    public final int i_() {
        return this.e.i_();
    }

    public final boolean a(int i) {
        return ((cyl) this.b.get(i)).e().a();
    }

    public final boolean b(int i) {
        return i >= 0 && i < this.b.size();
    }

    public final void n() {
        if (this.u != null && (this.ah || this.A.a())) {
            this.u.removeCallbacks(this.D);
            abe.a(this.u, this.D);
        }
        d(this.v, this.w);
    }

    /* JADX WARNING: Missing block: B:15:0x0038, code skipped:
            r5.O.a(r2, r6, r7, new defpackage.daj(r5, r1, r0, r2));
     */
    /* JADX WARNING: Missing block: B:16:0x0042, code skipped:
            return;
     */
    private final void d(int r6, int r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.k;	 Catch:{ all -> 0x0045 }
        r0 = r0.get();	 Catch:{ all -> 0x0045 }
        if (r0 == 0) goto L_0x0043;
    L_0x0009:
        r0 = r5.x;	 Catch:{ all -> 0x0045 }
        if (r0 == 0) goto L_0x0043;
    L_0x000d:
        r0 = -1;
        r1 = 0;
        if (r6 != r0) goto L_0x0014;
    L_0x0011:
        r6 = 0;
        r7 = 0;
        goto L_0x0016;
    L_0x0014:
        if (r7 == r0) goto L_0x0011;
    L_0x0016:
        r0 = r5.x;	 Catch:{ all -> 0x0045 }
        r0 = r0.a;	 Catch:{ all -> 0x0045 }
        r2 = r7 - r6;
        r0 = java.lang.Math.max(r0, r2);	 Catch:{ all -> 0x0045 }
        r2 = r5.b;	 Catch:{ all -> 0x0045 }
        r2 = r2.size();	 Catch:{ all -> 0x0045 }
        r3 = r5.p;	 Catch:{ all -> 0x0045 }
        if (r3 != 0) goto L_0x0036;
    L_0x002a:
        r1 = (float) r0;	 Catch:{ all -> 0x0045 }
        r3 = r5.j;	 Catch:{ all -> 0x0045 }
        r1 = r1 * r3;
        r1 = (int) r1;	 Catch:{ all -> 0x0045 }
        r3 = r6 - r1;
        r0 = r0 + r6;
        r0 = r0 + r1;
        r1 = r3;
        goto L_0x0037;
    L_0x0036:
        r0 = r2;
    L_0x0037:
        monitor-exit(r5);	 Catch:{ all -> 0x0045 }
        r3 = r5.O;
        r4 = new daj;
        r4.<init>(r5, r1, r0, r2);
        r3.a(r2, r6, r7, r4);
        return;
    L_0x0043:
        monitor-exit(r5);	 Catch:{ all -> 0x0045 }
        return;
    L_0x0045:
        r6 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0045 }
        goto L_0x0049;
    L_0x0048:
        throw r6;
    L_0x0049:
        goto L_0x0048;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dad.d(int, int):void");
    }

    public static void a(cyl cyl) {
        if (cyl.f() && !cyl.e().a() && cyl.g() != null && cyl.g().getLithoView() == null) {
            cyl.b();
        }
    }

    private final boolean q() {
        apn b = this.e.b();
        return b instanceof ans ? ((ans) b).e : false;
    }

    public final int b(cyl cyl) {
        czo czo;
        int i;
        if (!this.k.get() || this.M.get()) {
            czo = this.e;
            i = this.s;
            cyl.e();
            return czo.a(i);
        }
        czo = this.e;
        i = MeasureSpec.makeMeasureSpec(this.ae.a, 1073741824);
        cyl.e();
        return czo.a(i);
    }

    public final int c(cyl cyl) {
        if (this.ad) {
            return 0;
        }
        czo czo;
        int i;
        if (!this.k.get() || this.M.get()) {
            czo = this.e;
            i = this.t;
            cyl.e();
            return czo.b(i);
        }
        czo = this.e;
        i = MeasureSpec.makeMeasureSpec(this.ae.b, 1073741824);
        cyl.e();
        return czo.b(i);
    }

    public final dax b(int i, dbz dbz) {
        cyl b = b(dbz);
        b.a(false);
        return new dax(i, b);
    }

    public final int f(int i) {
        return this.p ? i % this.b.size() : i;
    }

    public final cyl b(dbz dbz) {
        cpe a;
        czl czl = this.J;
        if (czl != null) {
            a = czl.a();
        } else {
            a = this.ai;
            if (a == null) {
                a = null;
            }
        }
        return this.K.a(dbz, a, this.ah, this.ak, this.ab, this.R);
    }

    private final void a(cyl cyl, dbz dbz) {
        cyl.e();
        cyl.a(dbz);
        czl czl = this.J;
        if (czl != null && czl.b()) {
            cyl.a(this.J.a());
        }
    }

    private final dbk r() {
        int a;
        if (!this.b.isEmpty()) {
            a = dad.a(this.b, this.S);
            if (this.v < this.b.size() && a >= 0) {
                return new dbk(a, this.b);
            }
        } else if (!this.c.isEmpty()) {
            a = dad.a(this.c, this.S);
            if (a >= 0) {
                return new dbk(a, this.c);
            }
        }
        return null;
    }

    private static synchronized crm s() {
        crm crm;
        synchronized (dad.class) {
            if (I == null) {
                I = new crm(cuj.o);
            }
            crm = I;
        }
        return crm;
    }

    /* synthetic */ dad(dbf dbf) {
        int i = 0;
        this.k = new AtomicBoolean(false);
        this.M = new AtomicBoolean(false);
        this.n = new AtomicLong(-1);
        this.T = new ArrayDeque();
        this.U = new AtomicBoolean(false);
        this.V = new AtomicBoolean(false);
        this.W = new ArrayDeque();
        this.X = new dag(this);
        this.Y = new dal(this);
        this.Z = new dao(this);
        this.aa = new dan(this);
        this.ac = new dap(this);
        this.o = new das(this);
        this.s = -1;
        this.t = -1;
        this.v = -1;
        this.w = -1;
        this.z = false;
        this.am = false;
        this.an = 0;
        this.ao = false;
        this.ap = 0;
        cyn cyn = null;
        this.aq = null;
        this.ar = new dar(this);
        this.D = new dau(this);
        this.g = dbf.f;
        this.K = dbf.e;
        this.d = dbf.v;
        this.f = new dbj(this);
        this.L = dbf.a;
        this.j = dbf.b;
        this.e = dbf.c;
        this.J = dbf.d;
        this.h = null;
        this.ah = dbf.n;
        if (this.J != null) {
            this.aj = null;
            this.ai = null;
        } else {
            cuo cuo = dbf.p;
            if (cuo != null) {
                this.aj = cuo;
                this.ai = new crm(this.aj);
            } else if (cuj.o != null) {
                this.aj = cuj.o;
                if (dbf.t) {
                    this.ai = dad.s();
                } else {
                    this.ai = new crm(this.aj);
                }
            } else {
                this.aj = null;
                this.ai = null;
            }
        }
        boolean z = dbf.j;
        this.C = new dcc(z, z ? dbf.k : 0);
        this.p = dbf.g;
        boolean z2 = this.e.a() == 0 ? dbf.h : false;
        this.ad = z2;
        if (z2) {
            cyn = new dai(this);
        }
        this.ab = cyn;
        this.q = dbf.i;
        this.r = false;
        apn b = this.e.b();
        if (b instanceof ans) {
            i = ((ans) b).g;
        }
        int q = q() ^ i;
        this.S = q;
        if (q != 0) {
            this.O = dbr.b;
        } else {
            this.O = dbr.a;
        }
        this.A = new ddi(this.v, this.w, dbf.c);
        this.R = dbf.l;
        this.l = dbf.m;
        this.m = dbf.o;
        this.Q = dbf.q;
        this.N = dbf.r;
        this.P = dbf.s;
        this.ak = dbf.u;
        this.al = dbf.w;
    }
}
