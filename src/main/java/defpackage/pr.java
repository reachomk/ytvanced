package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.os.IBinder;

/* renamed from: pr */
final class pr extends JobServiceEngine implements pn {
    public final Object a = new Object();
    public JobParameters b;
    private final pl c;

    pr(pl plVar) {
        super(plVar);
        this.c = plVar;
    }

    public final IBinder a() {
        return getBinder();
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.b = jobParameters;
        this.c.a(false);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        pl plVar = this.c;
        pk pkVar = plVar.b;
        if (pkVar != null) {
            pkVar.cancel(plVar.c);
        }
        synchronized (this.a) {
            this.b = null;
        }
        return true;
    }

    /* JADX WARNING: Missing block: B:9:0x000f, code skipped:
            if (r1 == null) goto L_0x0024;
     */
    /* JADX WARNING: Missing block: B:10:0x0011, code skipped:
            r1.getIntent().setExtrasClassLoader(r3.c.getClassLoader());
     */
    /* JADX WARNING: Missing block: B:11:0x0023, code skipped:
            return new defpackage.pq(r3, r1);
     */
    /* JADX WARNING: Missing block: B:12:0x0024, code skipped:
            return null;
     */
    public final defpackage.po b() {
        /*
        r3 = this;
        r0 = r3.a;
        monitor-enter(r0);
        r1 = r3.b;	 Catch:{ all -> 0x0025 }
        r2 = 0;
        if (r1 != 0) goto L_0x000a;
    L_0x0008:
        monitor-exit(r0);	 Catch:{ all -> 0x0025 }
        return r2;
    L_0x000a:
        r1 = r1.dequeueWork();	 Catch:{ all -> 0x0025 }
        monitor-exit(r0);	 Catch:{ all -> 0x0025 }
        if (r1 == 0) goto L_0x0024;
    L_0x0011:
        r0 = r1.getIntent();
        r2 = r3.c;
        r2 = r2.getClassLoader();
        r0.setExtrasClassLoader(r2);
        r0 = new pq;
        r0.<init>(r3, r1);
        return r0;
    L_0x0024:
        return r2;
    L_0x0025:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0025 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.b():po");
    }
}
