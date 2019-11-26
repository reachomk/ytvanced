package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.firebase.jobdispatcher.GooglePlayReceiver;

/* renamed from: dea */
public final class dea implements ddq {
    public final dfa a;
    private final Context b;
    private final PendingIntent c;
    private final dec d = new dec();

    public dea(Context context) {
        this.b = context;
        this.c = PendingIntent.getBroadcast(context, 0, new Intent(), 0);
        this.a = new ddn(context);
    }

    public final boolean b() {
        return true;
    }

    public final int a(del del) {
        int i;
        synchronized (GooglePlayReceiver.b) {
            aac aac = (aac) GooglePlayReceiver.b.get(del.a);
            if (aac == null) {
            } else if (((den) aac.get(del.b)) == null) {
            } else {
                deo deo = new deo();
                deo.a = del.b;
                deo.b = del.a;
                deo.c = del.c;
                ddp.a(deo.a(), false);
            }
        }
        Context context = this.b;
        Intent b = b("SCHEDULE_TASK");
        dec dec = this.d;
        Bundle extras = b.getExtras();
        extras.putString("tag", del.b);
        extras.putBoolean("update_current", del.h);
        int i2 = 1;
        extras.putBoolean("persisted", del.e == 2);
        extras.putString("service", GooglePlayReceiver.class.getName());
        dew dew = del.c;
        if (dew == dfe.a) {
            extras.putInt("trigger_type", 2);
            extras.putLong("window_start", 0);
            extras.putLong("window_end", 1);
        } else if (dew instanceof dey) {
            dey dey = (dey) dew;
            extras.putInt("trigger_type", 1);
            if (del.f) {
                extras.putLong("period", (long) dey.b);
                extras.putLong("period_flex", (long) (dey.b - dey.a));
            } else {
                extras.putLong("window_start", (long) dey.a);
                extras.putLong("window_end", (long) dey.b);
            }
        } else if (dew instanceof dez) {
            dez dez = (dez) dew;
            extras.putInt("trigger_type", 3);
            int size = dez.a.size();
            int[] iArr = new int[size];
            Uri[] uriArr = new Uri[size];
            for (i = 0; i < size; i++) {
                dfd dfd = (dfd) dez.a.get(i);
                iArr[i] = dfd.b;
                uriArr[i] = dfd.a;
            }
            extras.putIntArray("content_uri_flags_array", iArr);
            extras.putParcelableArray("content_uri_array", uriArr);
        } else {
            String valueOf = String.valueOf(dew.getClass());
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 17);
            stringBuilder.append("Unknown trigger: ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        i = ddm.a(del.g);
        extras.putBoolean("requiresCharging", (i & 4) == 4);
        extras.putBoolean("requiresIdle", (i & 8) == 8);
        int i3 = (i & 2) == 2 ? 0 : 2;
        if ((i & 1) != 0) {
            i3 = 1;
        }
        extras.putInt("requiredNetwork", i3);
        dfc dfc = del.d;
        Bundle bundle = new Bundle();
        if (dfc.b != 2) {
            i2 = 0;
        }
        bundle.putInt("retry_policy", i2);
        bundle.putInt("initial_backoff_seconds", dfc.c);
        bundle.putInt("maximum_backoff_seconds", dfc.d);
        extras.putBundle("retryStrategy", bundle);
        Bundle bundle2 = del.i;
        if (bundle2 == null) {
            bundle2 = new Bundle();
        }
        extras.putBundle("extras", dec.a.a(del, bundle2));
        b.putExtras(extras);
        context.sendBroadcast(b);
        return 0;
    }

    public final int a(String str) {
        Context context = this.b;
        Intent b = b("CANCEL_TASK");
        b.putExtra("tag", str);
        b.putExtra("component", new ComponentName(this.b, GooglePlayReceiver.class));
        context.sendBroadcast(b);
        return 0;
    }

    public final dfa a() {
        return this.a;
    }

    private final Intent b(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("scheduler_action", str);
        intent.putExtra("app", this.c);
        intent.putExtra("source", 8);
        intent.putExtra("source_version", 1);
        return intent;
    }
}
