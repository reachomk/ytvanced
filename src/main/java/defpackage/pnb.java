package defpackage;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.media.MediaNotificationService;

/* renamed from: pnb */
public final class pnb extends BroadcastReceiver {
    private final /* synthetic */ MediaNotificationService a;

    public pnb(MediaNotificationService mediaNotificationService) {
        this.a = mediaNotificationService;
    }

    public final void onReceive(Context context, Intent intent) {
        PendingIntent activity;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("targetActivity");
        Intent intent2 = new Intent();
        intent2.setComponent(componentName);
        pkp pkp = this.a.d;
        pzr.b("Must be called from the main thread.");
        try {
            if (pkp.b.d()) {
                intent2.setFlags(603979776);
                activity = PendingIntent.getActivity(context, 1, intent2, 134217728);
                activity.send(context, 1, new Intent().setFlags(268435456));
            }
        } catch (RemoteException unused) {
            pkp.a.b("Unable to call %s on %s.", "hasActivityInRecents", pnu.class.getSimpleName());
        }
        qw a = qw.a(this.a);
        a.a(componentName);
        a.a(intent2);
        activity = a.a();
        try {
            activity.send(context, 1, new Intent().setFlags(268435456));
        } catch (CanceledException unused2) {
            MediaNotificationService.a.b("Sending PendingIntent failed", new Object[0]);
        }
    }
}
