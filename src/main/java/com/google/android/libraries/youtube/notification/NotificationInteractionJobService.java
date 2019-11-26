package com.google.android.libraries.youtube.notification;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.aftw;
import defpackage.afue;
import defpackage.afuf;
import defpackage.afxn;
import defpackage.xfc;

public final class NotificationInteractionJobService extends JobService {
    public afxn a;
    public aftw b;
    private afue c;

    public final void onCreate() {
        super.onCreate();
        ((afuf) ((xfc) getApplication()).n()).a(this);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        this.c = new afue(this.a, jobParameters, this.b);
        this.c.execute(new Void[0]);
        return true;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        afue afue = this.c;
        if (afue == null || afue.isCancelled()) {
            return false;
        }
        this.c.cancel(true);
        return true;
    }
}
