package defpackage;

import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import com.google.android.libraries.youtube.notification.NotificationProcessingJobService;
import com.google.android.libraries.youtube.notification.NotificationProcessingService;

/* renamed from: ejl */
public final class ejl {
    public final afpu a;
    public final afwq b;
    public final SharedPreferences c;
    public final afqe d;
    public final akvp e;
    public final bcaa f;
    public final zzl g;
    private final afuh h;

    public ejl(afpu afpu, afwq afwq, SharedPreferences sharedPreferences, afqe afqe, afuh afuh, akvp akvp, bcaa bcaa, zzl zzl) {
        this.a = afpu;
        this.b = afwq;
        this.c = sharedPreferences;
        this.d = afqe;
        this.h = afuh;
        this.e = akvp;
        this.f = bcaa;
        this.g = zzl;
    }

    public final void a(anze anze) {
        afuh afuh = this.h;
        afxh.b(afuh.c, "STEP_ROUTING_FOR_O", afuh.d);
        String str = "renderer_class_name";
        String str2 = "com.google.android.libraries.youtube.notification.pref.notification_renderer";
        if (VERSION.SDK_INT >= 26) {
            byte[] toByteArray = anze.toByteArray();
            String name = anze.getClass().getName();
            amqw.b(VERSION.SDK_INT >= 26);
            JobScheduler jobScheduler = (JobScheduler) afuh.b.getSystemService("jobscheduler");
            try {
                Intent intent = new Intent();
                intent.putExtra(str2, toByteArray);
                intent.putExtra(str, name);
                jobScheduler.enqueue(new Builder(afuh.a, new ComponentName(afuh.b, NotificationProcessingJobService.class)).setRequiredNetworkType(1).build(), new JobWorkItem(intent));
                return;
            } catch (IllegalStateException unused) {
                afpf afpf = afpf.notification;
                String valueOf = String.valueOf(jobScheduler.getAllPendingJobs());
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 35);
                stringBuilder.append("Too many jobs have been scheduled: ");
                stringBuilder.append(valueOf);
                afpc.a(1, afpf, stringBuilder.toString());
                return;
            }
        }
        Object obj = afuh.b;
        amqw.a(obj);
        amqw.a((Object) anze);
        Intent intent2 = new Intent(obj, NotificationProcessingService.class);
        intent2.putExtra(str2, anze.toByteArray());
        intent2.putExtra(str, anze.getClass().getName());
        obj.startService(intent2);
    }
}
