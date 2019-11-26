package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: pt */
final class pt extends ps {
    private final JobInfo b;
    private final JobScheduler c;

    pt(Context context, ComponentName componentName, int i) {
        super(componentName);
        a(i);
        this.b = new Builder(i, this.a).setOverrideDeadline(0).build();
        this.c = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }

    /* Access modifiers changed, original: final */
    public final void a(Intent intent) {
        this.c.enqueue(this.b, new JobWorkItem(intent));
    }
}
