package com.google.android.libraries.youtube.mdx.background;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.acvs;
import defpackage.acvx;
import defpackage.acwc;
import defpackage.acwp;
import defpackage.aczo;
import defpackage.aczp;
import defpackage.aczq;
import defpackage.aczt;
import defpackage.adpw;
import defpackage.amqu;
import defpackage.aurr;
import defpackage.xse;
import defpackage.xtl;
import defpackage.xvd;

public class MdxBackgroundPlaybackBroadcastReceiver extends BroadcastReceiver {
    private static final String c = xtl.b("MDX.MdxBackgroundPlaybackBroadcastReceiver");
    public aczo a;
    public acvx b;

    public final void onReceive(Context context, Intent intent) {
        ((aczp) xse.a(context)).a(this);
        String stringExtra = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.route_id");
        String stringExtra2 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.device_name");
        String stringExtra3 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.playlist_id");
        String stringExtra4 = intent.getStringExtra("com.google.android.libraries.youtube.mdx.background.video_id");
        int intExtra = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.session_type", -1);
        if (amqu.a(stringExtra) || amqu.a(stringExtra2) || ((amqu.a(stringExtra3) && amqu.a(stringExtra4)) || intExtra == -1)) {
            xtl.b(c, "playback request not valid, ignoring");
            return;
        }
        intExtra = aurr.b(intExtra);
        int intExtra2 = intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.timeout", -1);
        aczt a = aczq.g().a(stringExtra).b(intExtra).b(stringExtra2).a(adpw.n().b(xvd.f(stringExtra3)).a(xvd.f(stringExtra4)).a(intent.getLongExtra("com.google.android.libraries.youtube.mdx.background.video_position_ms", 0)).a(intent.getIntExtra("com.google.android.libraries.youtube.mdx.background.playlist_index", 0)).e());
        if (intExtra2 >= 0) {
            a.a(intExtra2);
        }
        xtl.c(c, "starting background playback");
        this.a.a(a.a());
        acwp acwp = (acwp) intent.getParcelableExtra("com.google.android.libraries.youtube.mdx.background.ve_screen");
        acwc acwc = (acwc) intent.getSerializableExtra("com.google.android.libraries.youtube.mdx.background.ve_type");
        if (!(acwp == null || acwc == null)) {
            this.b.a(acwp);
            this.b.a(3, new acvs(acwc), null);
        }
    }

    public static Intent a(Class cls, Context context, aczq aczq, acwp acwp, acwc acwc) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("com.google.android.libraries.youtube.mdx.background.route_id", aczq.a());
        intent.putExtra("com.google.android.libraries.youtube.mdx.background.device_name", aczq.b());
        intent.putExtra("com.google.android.libraries.youtube.mdx.background.playlist_id", aczq.d().e());
        intent.putExtra("com.google.android.libraries.youtube.mdx.background.video_id", aczq.d().a());
        intent.putExtra("com.google.android.libraries.youtube.mdx.background.video_position_ms", aczq.d().c());
        intent.putExtra("com.google.android.libraries.youtube.mdx.background.playlist_index", aczq.d().f());
        int f = aczq.f();
        int i = f - 1;
        if (f != 0) {
            intent.putExtra("com.google.android.libraries.youtube.mdx.background.session_type", i);
            intent.putExtra("com.google.android.libraries.youtube.mdx.background.timeout", aczq.c());
            if (!(acwp == null || acwc == null)) {
                intent.putExtra("com.google.android.libraries.youtube.mdx.background.ve_screen", acwp);
                intent.putExtra("com.google.android.libraries.youtube.mdx.background.ve_type", acwc);
            }
            return intent;
        }
        throw null;
    }
}
