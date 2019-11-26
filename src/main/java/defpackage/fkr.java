package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: fkr */
final class fkr extends BroadcastReceiver {
    private final /* synthetic */ fkv a;
    private final /* synthetic */ aizy b;
    private final /* synthetic */ Activity c;
    private final /* synthetic */ fkp d;

    fkr(fkp fkp, fkv fkv, aizy aizy, Activity activity) {
        this.d = fkp;
        this.a = fkv;
        this.b = aizy;
        this.c = activity;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        aiff aiff;
        if ("com.google.android.libraries.youtube.player.action.controller_notification_prev".equals(action)) {
            aiff = this.a.c;
            if (aiff != null) {
                aiff.a();
            }
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_pause".equals(action)) {
            this.b.b();
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_play".equals(action)) {
            this.b.a();
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_replay".equals(action)) {
            this.b.u();
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_retry".equals(action)) {
            this.b.d();
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_next".equals(action)) {
            voy voy = this.d.g;
            if (voy == null || voy.b != 1) {
                aiff = this.a.c;
                if (aiff != null) {
                    aiff.b();
                }
            } else {
                voy.a.a(-1, -1);
            }
        } else if ("com.google.android.youtube.action.background".equals(action)) {
            this.d.k = true;
            this.c.moveTaskToBack(false);
        }
    }
}
