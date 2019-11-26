package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: qez */
public final class qez implements pyc, pyf {
    public final LinkedBlockingQueue a;
    private final qqw b;
    private final String c;
    private final String d;
    private final HandlerThread e = new HandlerThread("GassClient");

    public qez(Context context, String str, String str2) {
        this.c = str;
        this.d = str2;
        this.e.start();
        this.b = new qqw(context, this.e.getLooper(), this, this);
        this.a = new LinkedBlockingQueue();
        this.b.q();
    }

    private final qqz b() {
        try {
            return this.b.d();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final void a(int i) {
        try {
            this.a.put(qez.a());
        } catch (InterruptedException unused) {
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0044 */
    public final void a(android.os.Bundle r4) {
        /*
        r3 = this;
        r4 = r3.b();
        if (r4 == 0) goto L_0x0060;
    L_0x0006:
        r0 = new qqv;	 Catch:{ all -> 0x0044 }
        r1 = r3.c;	 Catch:{ all -> 0x0044 }
        r2 = r3.d;	 Catch:{ all -> 0x0044 }
        r0.<init>(r1, r2);	 Catch:{ all -> 0x0044 }
        r4 = r4.a(r0);	 Catch:{ all -> 0x0044 }
        r0 = r4.a;	 Catch:{ all -> 0x0044 }
        if (r0 != 0) goto L_0x0031;
    L_0x0017:
        r0 = r4.b;	 Catch:{ rir -> 0x002a }
        r1 = new qpa;	 Catch:{ rir -> 0x002a }
        r1.<init>();	 Catch:{ rir -> 0x002a }
        r0 = defpackage.riu.a(r1, r0);	 Catch:{ rir -> 0x002a }
        r0 = (defpackage.qpa) r0;	 Catch:{ rir -> 0x002a }
        r4.a = r0;	 Catch:{ rir -> 0x002a }
        r0 = 0;
        r4.b = r0;	 Catch:{ rir -> 0x002a }
        goto L_0x0031;
    L_0x002a:
        r4 = move-exception;
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0044 }
        r0.<init>(r4);	 Catch:{ all -> 0x0044 }
        throw r0;	 Catch:{ all -> 0x0044 }
    L_0x0031:
        r4.a();	 Catch:{ all -> 0x0044 }
        r4 = r4.a;	 Catch:{ all -> 0x0044 }
        r0 = r3.a;	 Catch:{ all -> 0x0044 }
        r0.put(r4);	 Catch:{ all -> 0x0044 }
        r3.c();
        r4 = r3.e;
        r4.quit();
        return;
    L_0x0044:
        r4 = r3.a;	 Catch:{ InterruptedException -> 0x0058, all -> 0x004e }
        r0 = defpackage.qez.a();	 Catch:{ InterruptedException -> 0x0058, all -> 0x004e }
        r4.put(r0);	 Catch:{ InterruptedException -> 0x0058, all -> 0x004e }
        goto L_0x0058;
    L_0x004e:
        r4 = move-exception;
        r3.c();
        r0 = r3.e;
        r0.quit();
        throw r4;
    L_0x0058:
        r3.c();
        r4 = r3.e;
        r4.quit();
    L_0x0060:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qez.a(android.os.Bundle):void");
    }

    public final void a(psa psa) {
        try {
            this.a.put(qez.a());
        } catch (InterruptedException unused) {
        }
    }

    private final void c() {
        qqw qqw = this.b;
        if (qqw == null) {
            return;
        }
        if (qqw.i() || this.b.j()) {
            this.b.e();
        }
    }

    public static qpa a() {
        qpa qpa = new qpa();
        qpa.k = Long.valueOf(32768);
        return qpa;
    }
}
