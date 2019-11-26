package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: plw */
public final class plw implements pjj {
    public final Object a;
    public final Handler b;
    public final pom c;
    public final pjg d;
    public ptd e;
    public final List f = new CopyOnWriteArrayList();
    public final List g = new CopyOnWriteArrayList();
    public final Map h;
    private final pmc i;

    public plw(pom pom, pjg pjg) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.a = new Object();
        this.b = new Handler(Looper.getMainLooper());
        this.i = new pmc(this);
        this.d = pjg;
        this.c = (pom) pzr.a((Object) pom);
        this.c.b = new png(this);
        this.c.a(this.i);
        plm plm = new plm(this);
    }

    public final void a(ptd ptd) {
        ptd ptd2 = this.e;
        if (ptd2 != ptd) {
            if (ptd2 != null) {
                this.c.e();
                try {
                    this.d.b(this.e, t());
                } catch (IOException unused) {
                }
                this.i.a = null;
                this.b.removeCallbacksAndMessages(null);
            }
            this.e = ptd;
            ptd = this.e;
            if (ptd != null) {
                this.i.a = ptd;
            }
        }
    }

    public final void a() {
        ptd ptd = this.e;
        if (ptd != null) {
            this.d.a(ptd, t(), (pjj) this);
        }
    }

    public final ptg b() {
        pzr.b("Must be called from the main thread.");
        if (r()) {
            return a(new pmn(this, this.e));
        }
        return plw.s();
    }

    public final ptg c() {
        pzr.b("Must be called from the main thread.");
        if (r()) {
            return a(new pmm(this, this.e));
        }
        return plw.s();
    }

    public final ptg d() {
        pzr.b("Must be called from the main thread.");
        if (r()) {
            return a(new pnj(this, this.e));
        }
        return plw.s();
    }

    public final long e() {
        long a;
        synchronized (this.a) {
            pzr.b("Must be called from the main thread.");
            a = this.c.a();
        }
        return a;
    }

    public final long f() {
        long b;
        synchronized (this.a) {
            pzr.b("Must be called from the main thread.");
            b = this.c.b();
        }
        return b;
    }

    public final pjz g() {
        pjz pjz;
        synchronized (this.a) {
            pzr.b("Must be called from the main thread.");
            pjz = this.c.a;
        }
        return pjz;
    }

    public final MediaInfo h() {
        MediaInfo c;
        synchronized (this.a) {
            pzr.b("Must be called from the main thread.");
            c = this.c.c();
        }
        return c;
    }

    public final int i() {
        int i;
        synchronized (this.a) {
            pzr.b("Must be called from the main thread.");
            pjz g = g();
            i = g != null ? g.e : 1;
        }
        return i;
    }

    public final boolean j() {
        pzr.b("Must be called from the main thread.");
        MediaInfo h = h();
        return h != null && h.b == 2;
    }

    public final boolean k() {
        pzr.b("Must be called from the main thread.");
        pjz g = g();
        return g != null && g.e == 2;
    }

    /* JADX WARNING: Missing block: B:15:0x002d, code skipped:
            if (r2 == 2) goto L_0x002f;
     */
    public final boolean l() {
        /*
        r3 = this;
        r0 = "Must be called from the main thread.";
        defpackage.pzr.b(r0);
        r0 = r3.g();
        r1 = 0;
        if (r0 != 0) goto L_0x000d;
    L_0x000c:
        goto L_0x0034;
    L_0x000d:
        r0 = r0.e;
        r2 = 3;
        if (r0 != r2) goto L_0x0013;
    L_0x0012:
        goto L_0x002f;
    L_0x0013:
        r0 = r3.j();
        if (r0 == 0) goto L_0x0034;
    L_0x0019:
        r0 = r3.a;
        monitor-enter(r0);
        r2 = "Must be called from the main thread.";
        defpackage.pzr.b(r2);	 Catch:{ all -> 0x0031 }
        r2 = r3.g();	 Catch:{ all -> 0x0031 }
        if (r2 == 0) goto L_0x002a;
    L_0x0027:
        r2 = r2.f;	 Catch:{ all -> 0x0031 }
        goto L_0x002b;
    L_0x002a:
        r2 = 0;
    L_0x002b:
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        r0 = 2;
        if (r2 != r0) goto L_0x0034;
    L_0x002f:
        r0 = 1;
        return r0;
    L_0x0031:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0031 }
        throw r1;
    L_0x0034:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plw.l():boolean");
    }

    public final boolean m() {
        pzr.b("Must be called from the main thread.");
        pjz g = g();
        return g != null && g.e == 4;
    }

    public final boolean n() {
        pzr.b("Must be called from the main thread.");
        pjz g = g();
        return (g == null || g.k == 0) ? false : true;
    }

    public final void o() {
        pzr.b("Must be called from the main thread.");
        int i = i();
        if (i == 4 || i == 2) {
            b();
        } else {
            c();
        }
    }

    public final boolean p() {
        pzr.b("Must be called from the main thread.");
        return m() || k() || l() || n();
    }

    public final boolean q() {
        pzr.b("Must be called from the main thread.");
        pjz g = g();
        return g != null && g.o;
    }

    private final String t() {
        pzr.b("Must be called from the main thread.");
        return this.c.j;
    }

    public final void a(CastDevice castDevice, String str, String str2) {
        this.c.a(str2);
    }

    public final boolean r() {
        return this.e != null;
    }

    public static ptg s() {
        pmf pmf = new pmf();
        pmf.a(pmf.b(new Status(17, null)));
        return pmf;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0006 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:4:?, code skipped:
            r3.a((defpackage.pma) r3.a(new com.google.android.gms.common.api.Status(2100)));
     */
    /* JADX WARNING: Missing block: B:5:0x0016, code skipped:
            return r3;
     */
    public final defpackage.pmb a(defpackage.pmb r3) {
        /*
        r2 = this;
        r0 = r2.e;	 Catch:{ IllegalStateException -> 0x0006 }
        r0.b(r3);	 Catch:{ IllegalStateException -> 0x0006 }
        return r3;
    L_0x0006:
        r0 = new com.google.android.gms.common.api.Status;	 Catch:{ all -> 0x0016 }
        r1 = 2100; // 0x834 float:2.943E-42 double:1.0375E-320;
        r0.<init>(r1);	 Catch:{ all -> 0x0016 }
        r0 = r3.a(r0);	 Catch:{ all -> 0x0016 }
        r0 = (defpackage.pma) r0;	 Catch:{ all -> 0x0016 }
        r3.a(r0);	 Catch:{ all -> 0x0016 }
    L_0x0016:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.plw.a(pmb):pmb");
    }
}
