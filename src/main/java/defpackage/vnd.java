package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: vnd */
public class vnd extends vmq {
    public final xsc d;
    public vnf e;
    private final Object f;
    private final Object g;
    private final afpu h;
    private final long i;

    protected static boolean a(long j, long j2, long j3) {
        return j2 >= j && j2 < j + j3;
    }

    public final void a() {
        xak.b();
        c();
    }

    public final void b() {
        synchronized (this.g) {
            synchronized (this.f) {
                a(null, null);
            }
        }
    }

    /* JADX WARNING: Missing block: B:9:0x0015, code skipped:
            r1 = r4.g;
     */
    /* JADX WARNING: Missing block: B:10:0x0017, code skipped:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:12:?, code skipped:
            r0 = r4.f;
     */
    /* JADX WARNING: Missing block: B:13:0x001a, code skipped:
            monitor-enter(r0);
     */
    /* JADX WARNING: Missing block: B:16:0x0021, code skipped:
            if (a(r4.e) == false) goto L_0x002a;
     */
    /* JADX WARNING: Missing block: B:17:0x0023, code skipped:
            r2 = r4.e.a;
     */
    /* JADX WARNING: Missing block: B:18:0x0027, code skipped:
            monitor-exit(r0);
     */
    /* JADX WARNING: Missing block: B:20:?, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:21:0x0029, code skipped:
            return r2;
     */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            monitor-exit(r0);
     */
    /* JADX WARNING: Missing block: B:25:?, code skipped:
            r0 = h();
            r2 = super.c();
            r3 = r4.f;
     */
    /* JADX WARNING: Missing block: B:26:0x0035, code skipped:
            monitor-enter(r3);
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            a(r2, r0);
     */
    /* JADX WARNING: Missing block: B:29:0x0039, code skipped:
            monitor-exit(r3);
     */
    /* JADX WARNING: Missing block: B:31:?, code skipped:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:32:0x003b, code skipped:
            return r2;
     */
    public final java.lang.String c() {
        /*
        r4 = this;
        defpackage.xak.b();
        r0 = r4.f;
        monitor-enter(r0);
        r1 = r4.g();	 Catch:{ all -> 0x0045 }
        r2 = r4.a(r1);	 Catch:{ all -> 0x0045 }
        if (r2 == 0) goto L_0x0014;
    L_0x0010:
        r1 = r1.a;	 Catch:{ all -> 0x0045 }
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        return r1;
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        r1 = r4.g;
        monitor-enter(r1);
        r0 = r4.f;	 Catch:{ all -> 0x0042 }
        monitor-enter(r0);	 Catch:{ all -> 0x0042 }
        r2 = r4.e;	 Catch:{ all -> 0x003f }
        r2 = r4.a(r2);	 Catch:{ all -> 0x003f }
        if (r2 == 0) goto L_0x002a;
    L_0x0023:
        r2 = r4.e;	 Catch:{ all -> 0x003f }
        r2 = r2.a;	 Catch:{ all -> 0x003f }
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        return r2;
    L_0x002a:
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        r0 = r4.h();	 Catch:{ all -> 0x0042 }
        r2 = super.c();	 Catch:{ all -> 0x0042 }
        r3 = r4.f;	 Catch:{ all -> 0x0042 }
        monitor-enter(r3);	 Catch:{ all -> 0x0042 }
        r4.a(r2, r0);	 Catch:{ all -> 0x003c }
        monitor-exit(r3);	 Catch:{ all -> 0x003c }
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        return r2;
    L_0x003c:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x003c }
        throw r0;	 Catch:{ all -> 0x0042 }
    L_0x003f:
        r2 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x003f }
        throw r2;	 Catch:{ all -> 0x0042 }
    L_0x0042:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0042 }
        throw r0;
    L_0x0045:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0045 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vnd.c():java.lang.String");
    }

    /* Access modifiers changed, original: protected */
    public vnf g() {
        return this.e;
    }

    /* Access modifiers changed, original: protected */
    public void a(String str, String str2) {
        long a = this.d.a();
        if (TextUtils.isEmpty(str) || a <= 0) {
            this.e = null;
        } else {
            this.e = new vnf(str, a, str2);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final String h() {
        return this.h.c().a();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(String str) {
        return TextUtils.equals(str, h());
    }

    private final boolean a(vnf vnf) {
        return a(vnf, this.i);
    }

    /* Access modifiers changed, original: protected */
    public boolean a(vnf vnf, long j) {
        if (!(vnf == null || TextUtils.isEmpty(vnf.a))) {
            String str = vnf.a;
            if (str != null && str.length() > 8) {
                if (vnd.a(vnf.b, this.d.a(), Math.min(this.i, j)) && b(vnf.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void a(Executor executor) {
        executor.execute(new vnc(this));
    }

    vnd(Context context, String str, aoqb aoqb, String str2, String str3, tar tar, xsc xsc, long j, afpu afpu, boolean z, boolean z2, int i) {
        long j2 = j;
        super(context, str, aoqb, str2, str3, tar, z, z2, i);
        this.d = (xsc) amqw.a((Object) xsc);
        amqw.b(j2 >= 0);
        this.i = j2;
        this.h = (afpu) amqw.a((Object) afpu);
        this.f = new Object();
        this.g = new Object();
    }
}
