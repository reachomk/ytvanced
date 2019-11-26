package defpackage;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;

/* renamed from: aftw */
public final class aftw {
    public static afty a(JobParameters jobParameters) {
        JobWorkItem dequeueWork = jobParameters.dequeueWork();
        return dequeueWork != null ? new afty(dequeueWork) : null;
    }

    public static void a(JobParameters jobParameters, afty afty) {
        jobParameters.completeWork(afty.a);
    }
}
