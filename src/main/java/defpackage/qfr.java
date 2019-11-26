package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.gcm.Task;

/* renamed from: qfr */
final class qfr implements qfq {
    private final Context a;
    private final PendingIntent b;

    qfr(Context context) {
        this.a = context;
        this.b = PendingIntent.getBroadcast(context, 0, new Intent().setPackage("com.google.example.invalidpackage"), 0);
    }

    public final boolean a(Task task) {
        Intent a = a("SCHEDULE_TASK");
        Bundle bundle = new Bundle();
        task.a(bundle);
        a.putExtras(bundle);
        this.a.sendBroadcast(a);
        return true;
    }

    public final boolean a(ComponentName componentName, String str) {
        Intent a = a("CANCEL_TASK");
        a.putExtra("component", componentName);
        a.putExtra("tag", str);
        this.a.sendBroadcast(a);
        return true;
    }

    private final Intent a(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("app", this.b);
        intent.putExtra("source", 4);
        intent.putExtra("source_version", psl.a);
        intent.putExtra("scheduler_action", str);
        return intent;
    }
}
