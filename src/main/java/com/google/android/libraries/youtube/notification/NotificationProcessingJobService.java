package com.google.android.libraries.youtube.notification;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.aftw;
import defpackage.afuk;
import defpackage.aful;
import defpackage.afum;
import defpackage.xfc;

public final class NotificationProcessingJobService extends JobService {
    public afuk a;
    public aftw b;
    private afum c;

    public final void onCreate() {
        super.onCreate();
        ((aful) ((xfc) getApplication()).n()).a(this);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = new afum(this.a, jobParameters, this.b);
        this.c.execute(new Void[0]);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        afum afum = this.c;
        if (afum == null || afum.isCancelled()) {
            return false;
        }
        this.c.cancel(true);
        return true;
    }
}
