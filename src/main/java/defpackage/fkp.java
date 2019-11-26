package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.app.PictureInPictureParams.Builder;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.Icon;
import android.util.Rational;
import com.google.android.youtube.R;

/* renamed from: fkp */
public final class fkp {
    public final Activity a;
    public final fkv b;
    public final IntentFilter c;
    public final BroadcastReceiver d;
    public final bdfu e = new bdfu();
    public ahkr f = null;
    public voy g = null;
    public Rational h = Rational.ZERO;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    private final aizy l;
    private final RemoteAction m;
    private final RemoteAction n;
    private final RemoteAction o;
    private final RemoteAction p;
    private final RemoteAction q;
    private final RemoteAction r;
    private final RemoteAction s;
    private final RemoteAction t;
    private RemoteAction u;

    public fkp(Activity activity, aizy aizy, fkv fkv) {
        this.a = activity;
        this.l = aizy;
        this.b = fkv;
        String str = "com.google.android.youtube.action.background";
        this.n = new RemoteAction(Icon.createWithResource(activity, R.drawable.quantum_ic_headset_white_24), activity.getString(R.string.playback_control_background_playback), activity.getString(R.string.playback_control_background_playback), fkp.a(activity, str));
        String str2 = "com.google.android.libraries.youtube.player.action.controller_notification_prev";
        this.m = new RemoteAction(Icon.createWithResource(activity, R.drawable.quantum_ic_skip_previous_white_24), activity.getString(R.string.playback_control_previous), activity.getString(R.string.accessibility_previous), fkp.a(activity, str2));
        String str3 = "com.google.android.libraries.youtube.player.action.controller_notification_pause";
        this.o = new RemoteAction(Icon.createWithResource(activity, R.drawable.quantum_ic_pause_white_24), activity.getString(R.string.playback_control_play_pause), activity.getString(R.string.accessibility_pause), fkp.a(activity, str3));
        String str4 = "com.google.android.libraries.youtube.player.action.controller_notification_play";
        this.p = new RemoteAction(Icon.createWithResource(activity, R.drawable.quantum_ic_play_arrow_white_24), activity.getString(R.string.playback_control_play_pause), activity.getString(R.string.accessibility_play), fkp.a(activity, str4));
        String str5 = "com.google.android.libraries.youtube.player.action.controller_notification_replay";
        this.q = new RemoteAction(Icon.createWithResource(activity, R.drawable.quantum_ic_replay_white_24), activity.getString(R.string.pip_playback_control_replay), activity.getString(R.string.pip_playback_control_replay), fkp.a(activity, str5));
        String str6 = "com.google.android.libraries.youtube.player.action.controller_notification_retry";
        this.r = new RemoteAction(Icon.createWithResource(activity, R.drawable.quantum_ic_replay_white_24), activity.getString(R.string.pip_playback_control_retry), activity.getString(R.string.pip_playback_control_retry), fkp.a(activity, str6));
        this.t = new RemoteAction(Icon.createWithResource(activity, R.drawable.quantum_ic_error_white_24), activity.getString(R.string.pip_is_not_available_for_this_video), activity.getString(R.string.pip_is_not_available_for_this_video), fkp.a(activity, str6));
        this.t.setEnabled(false);
        String str7 = "com.google.android.libraries.youtube.player.action.controller_notification_next";
        this.s = new RemoteAction(Icon.createWithResource(activity, R.drawable.quantum_ic_skip_next_white_24), activity.getString(R.string.playback_control_next), activity.getString(R.string.accessibility_next), fkp.a(activity, str7));
        this.u = this.m;
        this.c = new IntentFilter();
        this.c.addAction(str);
        this.c.addAction(str3);
        this.c.addAction(str4);
        this.c.addAction(str5);
        this.c.addAction(str6);
        this.c.addAction(str7);
        this.c.addAction(str2);
        this.d = new fkr(this, fkv, aizy, activity);
    }

    /* Access modifiers changed, original: final */
    public final void a(voy voy) {
        if (!amqq.a(this.g, voy)) {
            this.j = true;
            this.g = voy;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.a.isInPictureInPictureMode() && this.j) {
            this.a.setPictureInPictureParams(b().build());
        }
        this.j = false;
    }

    public final Builder b() {
        Object obj;
        Builder builder = new Builder();
        if (this.h.floatValue() >= 0.5f && this.h.floatValue() <= 2.35f) {
            builder.setAspectRatio(this.h);
        }
        RemoteAction remoteAction = this.u;
        ajmq q = this.l.q();
        if (fku.a(q)) {
            if (fku.b(q)) {
                remoteAction = this.n;
            } else {
                this.m.setEnabled(this.b.a);
                remoteAction = this.m;
            }
        }
        this.u = remoteAction;
        remoteAction = this.u;
        q = this.l.q();
        if (!fku.a(q) || fku.c(q)) {
            ahkr ahkr = this.f;
            if (ahkr != null) {
                int i = ahkr.a;
                if (i == 7) {
                    obj = this.q;
                } else if (i == 8) {
                    obj = this.r;
                } else if (ahkr.a() || this.f.c()) {
                    obj = this.o;
                } else if (this.f.b()) {
                    obj = this.p;
                }
            }
            obj = !this.l.r() ? this.p : this.o;
        } else {
            obj = this.t;
        }
        if (this.l.s()) {
            voy voy = this.g;
            boolean z = false;
            if (voy != null && voy.b == 1) {
                z = true;
            }
            this.s.setEnabled(z);
        } else {
            this.s.setEnabled(this.b.b);
        }
        builder.setActions(amul.a(remoteAction, obj, this.s));
        return builder;
    }

    private static PendingIntent a(Context context, String str) {
        return PendingIntent.getBroadcast(context, 0, new Intent(str).setPackage(context.getPackageName()), 134217728);
    }
}
