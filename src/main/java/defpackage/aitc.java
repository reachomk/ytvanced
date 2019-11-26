package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.List;

/* renamed from: aitc */
final class aitc extends BroadcastReceiver {
    private final /* synthetic */ ajko a;
    private final /* synthetic */ List b;

    aitc(ajko ajko, List list) {
        this.a = ajko;
        this.b = list;
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.libraries.youtube.player.action.controller_notification_prev".equals(action)) {
            this.a.d();
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_play".equals(action)) {
            this.a.b();
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_pause".equals(action)) {
            this.a.c();
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_next".equals(action)) {
            this.a.e();
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_close".equals(action)) {
            ajko ajko = this.a;
            ajko.b.a();
            if (ajko.c.i) {
                ajko.d.e_(ahgy.c);
            }
            ajla ajla = ajko.g;
            if (ajla != null) {
                ajla.a();
            } else {
                ((ajkl) ajko.a.get()).j();
            }
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_replay".equals(action)) {
            this.a.g();
        } else if ("com.google.android.libraries.youtube.player.action.controller_notification_retry".equals(action)) {
            this.a.f();
        } else {
            if (!"noop".equals(action)) {
                for (aisp aisp : this.b) {
                    if (aisp instanceof aiso) {
                        aiso aiso = (aiso) aisp;
                        if (aiso.b().equals(action)) {
                            aiso.c();
                        }
                    }
                }
            }
        }
    }
}
