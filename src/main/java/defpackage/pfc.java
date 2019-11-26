package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;

/* renamed from: pfc */
public final class pfc extends pgb {
    public boolean a;
    public boolean b;
    public final AlarmManager c = ((AlarmManager) i().getSystemService("alarm"));
    private Integer d;

    protected pfc(pgd pgd) {
        super(pgd);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        try {
            c();
            if (pev.c() > 0) {
                ActivityInfo receiverInfo = i().getPackageManager().getReceiverInfo(new ComponentName(i(), "com.google.android.gms.analytics.AnalyticsReceiver"), 2);
                if (receiverInfo != null && receiverInfo.enabled) {
                    a("Receiver registered for local dispatch.");
                    this.a = true;
                }
            }
        } catch (NameNotFoundException unused) {
        }
    }

    public final PendingIntent b() {
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(i(), "com.google.android.gms.analytics.AnalyticsReceiver"));
        return PendingIntent.getBroadcast(i(), 0, intent, 0);
    }

    public final void c() {
        this.b = false;
        this.c.cancel(b());
        if (VERSION.SDK_INT >= 24) {
            JobScheduler jobScheduler = (JobScheduler) i().getSystemService("jobscheduler");
            a("Cancelling job. JobID", Integer.valueOf(d()));
            jobScheduler.cancel(d());
        }
    }

    public final int d() {
        if (this.d == null) {
            String valueOf = String.valueOf(i().getPackageName());
            String str = "analytics";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            this.d = Integer.valueOf(valueOf.hashCode());
        }
        return this.d.intValue();
    }
}
