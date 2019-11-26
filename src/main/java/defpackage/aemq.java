package defpackage;

import android.net.Uri;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: aemq */
public final class aemq implements nok {
    public static final Uri a = Uri.parse("http://dummy.googlevideo.com/videoplayback");
    public final String b;
    private final ExecutorService c;
    private nmx d;
    private boolean e;
    private int f;
    private long g;
    private String h;
    private aemp i;
    private boolean j = true;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private nok o;

    public aemq(String str, ExecutorService executorService) {
        this.b = xvd.a(str);
        this.c = (ExecutorService) amqw.a((Object) executorService);
        this.i = null;
        this.d = null;
    }

    public final int c() {
        return 1;
    }

    public final synchronized void a(int i, long j, String str, byte[] bArr) {
        if (this.j) {
            this.j = false;
            this.c.submit(new aems(this, i, str, bArr));
            this.f = i;
            this.g = j;
            this.h = str;
        }
    }

    public final synchronized nrq d() {
        aemp aemp = this.i;
        if (aemp == null) {
            return null;
        }
        return aemp.n;
    }

    public final synchronized void a(aemp aemp) {
        this.i = aemp;
        this.d = aemp.m;
    }

    public final synchronized void e() {
        this.j = false;
    }

    /* JADX WARNING: Missing block: B:22:0x0049, code skipped:
            if (java.lang.Long.parseLong(r0.d.getQueryParameter("lmt")) != r7.g) goto L_0x004c;
     */
    /* JADX WARNING: Missing block: B:23:0x004b, code skipped:
            return true;
     */
    /* JADX WARNING: Missing block: B:24:0x004c, code skipped:
            return false;
     */
    public final synchronized boolean a(defpackage.aajs r8) {
        /*
        r7 = this;
        monitor-enter(r7);
        r0 = r7.f;	 Catch:{ all -> 0x0053 }
        r1 = 1;
        if (r0 != 0) goto L_0x0011;
    L_0x0006:
        r2 = r7.g;	 Catch:{ all -> 0x0053 }
        r4 = 0;
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x000f;
    L_0x000e:
        goto L_0x0011;
    L_0x000f:
        monitor-exit(r7);
        return r1;
    L_0x0011:
        r8 = r8.l;	 Catch:{ all -> 0x0053 }
        r8 = r8.iterator();	 Catch:{ all -> 0x0053 }
    L_0x0017:
        r0 = r8.hasNext();	 Catch:{ all -> 0x0053 }
        r2 = 0;
        if (r0 == 0) goto L_0x0051;
    L_0x001e:
        r0 = r8.next();	 Catch:{ all -> 0x0053 }
        r0 = (defpackage.aahr) r0;	 Catch:{ all -> 0x0053 }
        r3 = r0.b();	 Catch:{ all -> 0x0053 }
        r4 = r7.f;	 Catch:{ all -> 0x0053 }
        if (r3 != r4) goto L_0x0017;
    L_0x002c:
        r8 = r0.t();	 Catch:{ all -> 0x0053 }
        r3 = r7.h;	 Catch:{ all -> 0x0053 }
        r8 = android.text.TextUtils.equals(r8, r3);	 Catch:{ all -> 0x0053 }
        if (r8 == 0) goto L_0x004f;
    L_0x0038:
        r8 = r0.d;	 Catch:{ all -> 0x0053 }
        r0 = "lmt";
        r8 = r8.getQueryParameter(r0);	 Catch:{ all -> 0x0053 }
        r3 = java.lang.Long.parseLong(r8);	 Catch:{ NumberFormatException -> 0x004d }
        r5 = r7.g;	 Catch:{ NumberFormatException -> 0x004d }
        r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        monitor-exit(r7);
        if (r8 != 0) goto L_0x004c;
    L_0x004b:
        return r1;
    L_0x004c:
        return r2;
    L_0x004d:
        monitor-exit(r7);
        return r2;
    L_0x004f:
        monitor-exit(r7);
        return r2;
    L_0x0051:
        monitor-exit(r7);
        return r2;
    L_0x0053:
        r8 = move-exception;
        monitor-exit(r7);
        goto L_0x0057;
    L_0x0056:
        throw r8;
    L_0x0057:
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aemq.a(aajs):boolean");
    }

    /* JADX WARNING: Missing block: B:18:0x0032, code skipped:
            return;
     */
    public final synchronized void a(defpackage.nok r3) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.o;	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x000a;
    L_0x0005:
        r0 = "innerChunkSource already set.";
        defpackage.aepe.a(r0);	 Catch:{ all -> 0x0033 }
    L_0x000a:
        r2.o = r3;	 Catch:{ all -> 0x0033 }
        r3 = r2.l;	 Catch:{ all -> 0x0033 }
        if (r3 == 0) goto L_0x0023;
    L_0x0010:
        r3 = r2.o;	 Catch:{ all -> 0x0033 }
        r3 = r3.b();	 Catch:{ all -> 0x0033 }
        if (r3 == 0) goto L_0x0019;
    L_0x0018:
        goto L_0x0023;
    L_0x0019:
        r3 = 2;
        r0 = defpackage.afpf.onesie;	 Catch:{ all -> 0x0033 }
        r1 = "chunkSource.prepare() returned false.";
        defpackage.afpc.a(r3, r0, r1);	 Catch:{ all -> 0x0033 }
        monitor-exit(r2);
        return;
    L_0x0023:
        r3 = r2.k;	 Catch:{ all -> 0x0033 }
        if (r3 == 0) goto L_0x0031;
    L_0x0027:
        r3 = r2.o;	 Catch:{ all -> 0x0033 }
        r0 = r2.n;	 Catch:{ all -> 0x0033 }
        r3.b(r0);	 Catch:{ all -> 0x0033 }
        r3 = 1;
        r2.m = r3;	 Catch:{ all -> 0x0033 }
    L_0x0031:
        monitor-exit(r2);
        return;
    L_0x0033:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aemq.a(nok):void");
    }

    public final synchronized void a() {
        nok nok = this.o;
        if (nok != null) {
            nok.a();
        }
    }

    public final synchronized boolean b() {
        nok nok = this.o;
        if (nok != null) {
            return nok.b();
        } else if (this.d == null) {
            return false;
        } else {
            this.l = true;
            return true;
        }
    }

    public final synchronized nmx a(int i) {
        if (this.l) {
            return this.d;
        }
        nok nok = this.o;
        if (nok != null) {
            return nok.a(i);
        }
        afpc.a(2, afpf.onesie, "OnesieDashChunkSource.getFormat() has nothing to return.");
        return null;
    }

    public final synchronized void b(int i) {
        this.k = true;
        this.n = i;
        nok nok = this.o;
        if (nok != null) {
            nok.b(i);
            this.m = true;
        }
    }

    public final synchronized void a(List list) {
        this.k = false;
        nok nok = this.o;
        if (nok != null) {
            nok.a(list);
            this.m = false;
        }
    }

    public final synchronized void a(long j) {
        nok nok = this.o;
        if (nok != null && this.m) {
            nok.a(j);
        }
    }

    /* JADX WARNING: Missing block: B:22:0x0027, code skipped:
            return;
     */
    public final synchronized void a(java.util.List r3, long r4, defpackage.nnz r6) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.o;	 Catch:{ all -> 0x0028 }
        if (r0 == 0) goto L_0x0015;
    L_0x0005:
        r1 = r2.m;	 Catch:{ all -> 0x0028 }
        if (r1 != 0) goto L_0x0010;
    L_0x0009:
        r3 = "getChunkOperation on disabled innerChunkSource.";
        defpackage.aepe.a(r3);	 Catch:{ all -> 0x0028 }
        monitor-exit(r2);
        return;
    L_0x0010:
        r0.a(r3, r4, r6);	 Catch:{ all -> 0x0028 }
        monitor-exit(r2);
        return;
    L_0x0015:
        r3 = r6.b;	 Catch:{ all -> 0x0028 }
        if (r3 != 0) goto L_0x0026;
    L_0x0019:
        r3 = r2.i;	 Catch:{ all -> 0x0028 }
        if (r3 == 0) goto L_0x0026;
    L_0x001d:
        r4 = r2.e;	 Catch:{ all -> 0x0028 }
        if (r4 != 0) goto L_0x0026;
    L_0x0021:
        r6.b = r3;	 Catch:{ all -> 0x0028 }
        r3 = 1;
        r2.e = r3;	 Catch:{ all -> 0x0028 }
    L_0x0026:
        monitor-exit(r2);
        return;
    L_0x0028:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aemq.a(java.util.List, long, nnz):void");
    }

    public final synchronized void a(nny nny) {
        nok nok = this.o;
        if (!(nok == null || !this.m || (nny instanceof aemp))) {
            nok.a(nny);
        }
    }

    public final synchronized void a(nny nny, Exception exception) {
        nok nok = this.o;
        if (nok != null && this.m) {
            nok.a(nny, exception);
        }
    }
}
