package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.youtube.app.vr.LaunchYouTubeVrActivity;
import com.google.vr.ndk.base.DaydreamApi;

/* renamed from: lca */
public final class lca {
    public final BroadcastReceiver a = new lbz(this);
    public final Context b;
    public boolean c;
    private final Intent d;
    private DaydreamApi e;

    public lca(Context context) {
        this.b = (Context) amqw.a((Object) context);
        this.d = new Intent(context, LaunchYouTubeVrActivity.class);
    }

    public final boolean a() {
        return DaydreamApi.isDaydreamReadyPlatform(this.b);
    }

    public final void b() {
        if (this.c && a()) {
            if (ahxt.a(this.b, 2)) {
                if (this.e == null) {
                    this.e = DaydreamApi.create(this.b);
                }
                if (this.e != null) {
                    this.e.registerDaydreamIntent(PendingIntent.getActivity(this.b, 0, this.d, 134217728));
                }
                return;
            }
            c();
        }
    }

    public final void c() {
        DaydreamApi daydreamApi = this.e;
        if (daydreamApi != null) {
            daydreamApi.unregisterDaydreamIntent();
            this.e.close();
            this.e = null;
        }
    }
}
