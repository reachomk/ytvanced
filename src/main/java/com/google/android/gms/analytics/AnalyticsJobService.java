package com.google.android.gms.analytics;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import defpackage.pfm;
import defpackage.pfr;
import defpackage.pfw;
import defpackage.pgd;

public final class AnalyticsJobService extends JobService implements pfw {
    private pfr a;

    private final pfr a() {
        if (this.a == null) {
            this.a = new pfr(this);
        }
        return this.a;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    public final void onCreate() {
        super.onCreate();
        a().a();
    }

    public final void onDestroy() {
        a().b();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return a().a(intent, i2);
    }

    public final boolean onStartJob(JobParameters jobParameters) {
        pfr a = a();
        pfm a2 = pgd.a(a.b).a();
        String string = jobParameters.getExtras().getString("action");
        a2.a("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            a.a(null, jobParameters);
        }
        return true;
    }

    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    public final void a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }
}
