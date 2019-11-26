package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

/* renamed from: pq */
final class pq implements po {
    private final JobWorkItem a;
    private final /* synthetic */ pr b;

    pq(pr prVar, JobWorkItem jobWorkItem) {
        this.b = prVar;
        this.a = jobWorkItem;
    }

    public final Intent a() {
        return this.a.getIntent();
    }

    public final void b() {
        synchronized (this.b.a) {
            JobParameters jobParameters = this.b.b;
            if (jobParameters != null) {
                jobParameters.completeWork(this.a);
            }
        }
    }
}
