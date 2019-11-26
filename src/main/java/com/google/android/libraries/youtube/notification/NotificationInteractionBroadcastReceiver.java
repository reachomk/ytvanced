package com.google.android.libraries.youtube.notification;

import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import defpackage.afpc;
import defpackage.afpf;
import defpackage.afud;
import defpackage.amqw;
import defpackage.xse;

public class NotificationInteractionBroadcastReceiver extends BroadcastReceiver {
    private static final int a = NotificationInteractionBroadcastReceiver.class.getName().hashCode();
    private boolean b;

    public final void onReceive(Context context, Intent intent) {
        if (!this.b) {
            ((afud) xse.a(context)).oO();
            this.b = true;
        }
        if (VERSION.SDK_INT < 26) {
            Bundle extras = intent.getExtras();
            amqw.a((Object) context);
            Intent intent2 = new Intent(context, NotificationInteractionService.class);
            if (extras != null) {
                intent2.putExtras(extras);
            }
            context.startService(intent2);
            return;
        }
        amqw.b(VERSION.SDK_INT >= 26);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        try {
            jobScheduler.enqueue(new Builder(a, new ComponentName(context, NotificationInteractionJobService.class)).setRequiredNetworkType(1).build(), new JobWorkItem(intent));
        } catch (IllegalStateException unused) {
            afpf afpf = afpf.notification;
            String valueOf = String.valueOf(jobScheduler.getAllPendingJobs());
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 35);
            stringBuilder.append("Too many jobs have been scheduled: ");
            stringBuilder.append(valueOf);
            afpc.a(1, afpf, stringBuilder.toString());
        }
    }
}
