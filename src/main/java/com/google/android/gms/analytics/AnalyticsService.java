package com.google.android.gms.analytics;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import defpackage.pfr;
import defpackage.pfw;

public final class AnalyticsService extends Service implements pfw {
    private pfr a;

    private final pfr a() {
        if (this.a == null) {
            this.a = new pfr(this);
        }
        return this.a;
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

    public final IBinder onBind(Intent intent) {
        a();
        return null;
    }

    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    public final void a(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }
}
