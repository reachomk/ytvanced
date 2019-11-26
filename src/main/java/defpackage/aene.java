package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: aene */
public final class aene implements ovx {
    public final ovx a;
    public final afjj b;
    public final owg c;
    public volatile ovx d;
    private final owc e;
    private final aenf f;
    private final int g;
    private final ExecutorCompletionService h;
    private ovx j;
    private Future k;
    private Future l;
    private final ArrayList m;

    public aene(ovx ovx, owc owc, aenf aenf, Executor executor, afjj afjj, int i) {
        this.a = (ovx) amqw.a((Object) ovx);
        this.e = (owc) amqw.a((Object) owc);
        this.f = (aenf) amqw.a((Object) aenf);
        this.h = new ExecutorCompletionService((Executor) amqw.a((Object) executor));
        this.b = (afjj) amqw.a((Object) afjj);
        if (i < 0) {
            i = 2000;
        }
        this.g = i;
        this.c = new owg();
        this.m = new ArrayList();
    }

    public final void a(String str, String str2) {
        this.c.a(str, str2);
    }

    public final void d() {
        this.c.a();
    }

    public final Map c() {
        return this.d != null ? this.d.c() : null;
    }

    public final Uri b() {
        return this.d != null ? this.d.b() : null;
    }

    public final void a(owt owt) {
        this.a.a(owt);
        ovx ovx = this.j;
        if (ovx != null) {
            ovx.a(owt);
        }
        this.m.add(owt);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007b */
    public final long a(defpackage.ovm r8) {
        /*
        r7 = this;
        r0 = "Execution interrupted.";
        r1 = r7.d;	 Catch:{ all -> 0x0104 }
        r2 = 1;
        if (r1 != 0) goto L_0x00fc;
    L_0x0007:
        r1 = r7.a;	 Catch:{ all -> 0x0104 }
        r1 = r7.a(r1, r8);	 Catch:{ all -> 0x0104 }
        r7.k = r1;	 Catch:{ all -> 0x0104 }
        r1 = r7.h;	 Catch:{ ExecutionException -> 0x00b1, InterruptedException -> 0x00ab }
        r3 = r7.g;	 Catch:{ ExecutionException -> 0x00b1, InterruptedException -> 0x00ab }
        r3 = (long) r3;	 Catch:{ ExecutionException -> 0x00b1, InterruptedException -> 0x00ab }
        r5 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ ExecutionException -> 0x00b1, InterruptedException -> 0x00ab }
        r1 = r1.poll(r3, r5);	 Catch:{ ExecutionException -> 0x00b1, InterruptedException -> 0x00ab }
        if (r1 == 0) goto L_0x002f;
    L_0x001c:
        r1 = r1.get();	 Catch:{ ExecutionException -> 0x00b1, InterruptedException -> 0x00ab }
        r1 = (java.lang.Long) r1;	 Catch:{ ExecutionException -> 0x00b1, InterruptedException -> 0x00ab }
        r0 = r1.longValue();	 Catch:{ ExecutionException -> 0x00b1, InterruptedException -> 0x00ab }
        r8 = r7.b;
        r8.a();
        r7.e();
        return r0;
    L_0x002f:
        r1 = r7.f;	 Catch:{ all -> 0x0104 }
        r1 = r1.a(r8);	 Catch:{ all -> 0x0104 }
        r3 = 0;
        if (r1 == 0) goto L_0x0060;
    L_0x0038:
        r4 = r7.e;	 Catch:{ all -> 0x0104 }
        r4 = r4.b();	 Catch:{ all -> 0x0104 }
        r7.j = r4;	 Catch:{ all -> 0x0104 }
        r4 = r7.m;	 Catch:{ all -> 0x0104 }
        r4 = r4.iterator();	 Catch:{ all -> 0x0104 }
    L_0x0046:
        r5 = r4.hasNext();	 Catch:{ all -> 0x0104 }
        if (r5 == 0) goto L_0x0058;
    L_0x004c:
        r5 = r4.next();	 Catch:{ all -> 0x0104 }
        r5 = (defpackage.owt) r5;	 Catch:{ all -> 0x0104 }
        r6 = r7.j;	 Catch:{ all -> 0x0104 }
        r6.a(r5);	 Catch:{ all -> 0x0104 }
        goto L_0x0046;
    L_0x0058:
        r4 = r7.j;	 Catch:{ all -> 0x0104 }
        r1 = r7.a(r4, r1);	 Catch:{ all -> 0x0104 }
        r7.l = r1;	 Catch:{ all -> 0x0104 }
    L_0x0060:
        r1 = r7.h;	 Catch:{ ExecutionException -> 0x0081, InterruptedException -> 0x007b }
        r1 = r1.take();	 Catch:{ ExecutionException -> 0x0081, InterruptedException -> 0x007b }
        if (r1 == 0) goto L_0x0091;
    L_0x0068:
        r1 = r1.get();	 Catch:{ ExecutionException -> 0x0081, InterruptedException -> 0x007b }
        r1 = (java.lang.Long) r1;	 Catch:{ ExecutionException -> 0x0081, InterruptedException -> 0x007b }
        r0 = r1.longValue();	 Catch:{ ExecutionException -> 0x0081, InterruptedException -> 0x007b }
        r8 = r7.b;
        r8.a();
        r7.e();
        return r0;
    L_0x007b:
        r1 = new owb;	 Catch:{ all -> 0x0104 }
        r1.<init>(r0, r8, r2);	 Catch:{ all -> 0x0104 }
        throw r1;	 Catch:{ all -> 0x0104 }
    L_0x0081:
        r1 = move-exception;
        r3 = r1.getCause();	 Catch:{ all -> 0x0104 }
        r3 = r3 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x0104 }
        if (r3 != 0) goto L_0x00a5;
    L_0x008a:
        r1 = r1.getCause();	 Catch:{ all -> 0x0104 }
        r1 = (defpackage.owb) r1;	 Catch:{ all -> 0x0104 }
        r3 = r1;
    L_0x0091:
        r1 = r7.k;	 Catch:{ all -> 0x0104 }
        r1 = r1.isDone();	 Catch:{ all -> 0x0104 }
        if (r1 == 0) goto L_0x0060;
    L_0x0099:
        r1 = r7.l;	 Catch:{ all -> 0x0104 }
        if (r1 == 0) goto L_0x00a4;
    L_0x009d:
        r1 = r1.isDone();	 Catch:{ all -> 0x0104 }
        if (r1 != 0) goto L_0x00a4;
    L_0x00a3:
        goto L_0x0060;
    L_0x00a4:
        throw r3;	 Catch:{ all -> 0x0104 }
    L_0x00a5:
        r1 = new owb;	 Catch:{ all -> 0x0104 }
        r1.<init>(r0, r8, r2);	 Catch:{ all -> 0x0104 }
        throw r1;	 Catch:{ all -> 0x0104 }
    L_0x00ab:
        r1 = new owb;	 Catch:{ all -> 0x0104 }
        r1.<init>(r0, r8, r2);	 Catch:{ all -> 0x0104 }
        throw r1;	 Catch:{ all -> 0x0104 }
    L_0x00b1:
        r1 = move-exception;
        r3 = r1.getCause();	 Catch:{ all -> 0x0104 }
        r3 = r3 instanceof java.lang.RuntimeException;	 Catch:{ all -> 0x0104 }
        if (r3 != 0) goto L_0x00f5;
    L_0x00ba:
        r3 = r1.getCause();	 Catch:{ all -> 0x0104 }
        r3 = r3 instanceof java.lang.Error;	 Catch:{ all -> 0x0104 }
        if (r3 != 0) goto L_0x00ee;
    L_0x00c2:
        r3 = r1.getCause();	 Catch:{ all -> 0x0104 }
        r3 = r3 instanceof defpackage.owb;	 Catch:{ all -> 0x0104 }
        if (r3 != 0) goto L_0x00e7;
    L_0x00ca:
        r3 = r1.getCause();	 Catch:{ all -> 0x0104 }
        r3 = r3 instanceof java.lang.InterruptedException;	 Catch:{ all -> 0x0104 }
        if (r3 == 0) goto L_0x00d8;
    L_0x00d2:
        r1 = new owb;	 Catch:{ all -> 0x0104 }
        r1.<init>(r0, r8, r2);	 Catch:{ all -> 0x0104 }
        throw r1;	 Catch:{ all -> 0x0104 }
    L_0x00d8:
        r0 = new owb;	 Catch:{ all -> 0x0104 }
        r3 = new java.io.IOException;	 Catch:{ all -> 0x0104 }
        r1 = r1.getCause();	 Catch:{ all -> 0x0104 }
        r3.<init>(r1);	 Catch:{ all -> 0x0104 }
        r0.<init>(r3, r8, r2);	 Catch:{ all -> 0x0104 }
        throw r0;	 Catch:{ all -> 0x0104 }
    L_0x00e7:
        r8 = r1.getCause();	 Catch:{ all -> 0x0104 }
        r8 = (defpackage.owb) r8;	 Catch:{ all -> 0x0104 }
        throw r8;	 Catch:{ all -> 0x0104 }
    L_0x00ee:
        r8 = r1.getCause();	 Catch:{ all -> 0x0104 }
        r8 = (java.lang.Error) r8;	 Catch:{ all -> 0x0104 }
        throw r8;	 Catch:{ all -> 0x0104 }
    L_0x00f5:
        r8 = r1.getCause();	 Catch:{ all -> 0x0104 }
        r8 = (java.lang.RuntimeException) r8;	 Catch:{ all -> 0x0104 }
        throw r8;	 Catch:{ all -> 0x0104 }
    L_0x00fc:
        r0 = new owb;	 Catch:{ all -> 0x0104 }
        r1 = "DataSource is already open.";
        r0.<init>(r1, r8, r2);	 Catch:{ all -> 0x0104 }
        throw r0;	 Catch:{ all -> 0x0104 }
    L_0x0104:
        r8 = move-exception;
        r0 = r7.b;
        r0.a();
        r7.e();
        goto L_0x010f;
    L_0x010e:
        throw r8;
    L_0x010f:
        goto L_0x010e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aene.a(ovm):long");
    }

    public final int a(byte[] bArr, int i, int i2) {
        if (this.d != null) {
            return this.d.a(bArr, i, i2);
        }
        throw new owb("DataSource is not open.", null, 2);
    }

    public final void a() {
        try {
            aene.a(this.k);
            aene.a(this.l);
            if (this.d != null) {
                ozp.a(this.d);
            }
            this.k = null;
            this.l = null;
            this.d = null;
        } catch (Throwable th) {
            if (this.d != null) {
                ozp.a(this.d);
            }
            this.k = null;
            this.l = null;
            this.d = null;
        }
    }

    private final void e() {
        Future future = this.k;
        if (future != null) {
            future.cancel(true);
            this.k = null;
        }
        future = this.l;
        if (future != null) {
            future.cancel(true);
            this.l = null;
        }
    }

    private static void a(Future future) {
        if (future != null) {
            try {
                future.get();
            } catch (ExecutionException unused) {
            } catch (InterruptedException unused2) {
                throw new owb("Execution interrupted.", null, 3);
            }
        }
    }

    private final Future a(ovx ovx, ovm ovm) {
        try {
            return this.h.submit(new aend(this, ovx, ovm));
        } catch (RejectedExecutionException unused) {
            throw new owb("Unable to submit task for execution", ovm, 1);
        }
    }

    public final synchronized void a(ovx ovx) {
        if (this.d == null) {
            this.d = ovx;
        }
        if (this.a == ovx) {
            this.b.a.a(new aeho());
        } else {
            this.b.a.a(new aehz());
        }
    }
}
