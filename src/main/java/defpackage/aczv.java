package defpackage;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.youtube.R;

/* renamed from: aczv */
public final class aczv implements aczx {
    public static final String a = xtl.b("MDX.backgroudPlaybackPresenter");
    public aczw b;
    public aczq c;
    public final aczs d;
    private final qk e;
    private final Context f;
    private final int g;
    private boolean h;
    private final BroadcastReceiver i = new aczu(this);

    public aczv(qk qkVar, Context context, int i, aczs aczs) {
        this.e = qkVar;
        this.f = context;
        this.g = i;
        this.d = aczs;
    }

    public final void a(aczw aczw) {
        this.b = (aczw) amqw.a((Object) aczw);
    }

    public final void a() {
        this.b = null;
        this.e.a(6);
        c();
    }

    public final void a(aczq aczq) {
        d();
        this.c = null;
        aczs aczs = this.d;
        aczs.b.a(aczs.c, null, null);
        aczs.b.b(aczs.d, null);
        aczs.b.b(aczs.e, null);
        acwp c = aczs.b.c();
        qg a = a(true, c);
        a.a(this.f.getString(R.string.mdx_background_playback_connecting, new Object[]{aczq.b()}));
        a.i = 1;
        a.a(new qf(0, this.f.getResources().getString(R.string.mdx_background_playback_cancel), PendingIntent.getBroadcast(this.f, 0, aczv.a("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL", c), 134217728)).a());
        this.e.a(6, a.e());
    }

    public final void b() {
        d();
        this.c = null;
        this.e.a(6, a(false, null).e());
    }

    public final void b(aczq aczq) {
        d();
        this.c = aczq;
        aczs aczs = this.d;
        aczs.b.a(aczs.c, null, null);
        aczs.b.b(aczs.f, null);
        aczs.b.b(aczs.g, null);
        acwp c = aczs.b.c();
        qg a = a(false, c);
        a.a(this.f.getResources().getString(R.string.mdx_background_playback_error_title, new Object[]{aczq.b()}));
        a.b(this.f.getResources().getString(R.string.mdx_background_playback_error_text));
        a.f = PendingIntent.getBroadcast(this.f, 0, aczv.a("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY", c), 134217728);
        a.a(new qf(0, this.f.getResources().getString(R.string.mdx_background_playback_error_help), PendingIntent.getBroadcast(this.f, 0, aczv.a("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP", c), 134217728)).a());
        this.e.a(6, a.e());
    }

    private static Intent a(String str, acwp acwp) {
        Intent intent = new Intent(str);
        if (acwp != null) {
            intent.putExtra("INTERACTION_SCREEN", acwp);
        }
        return intent;
    }

    private final void d() {
        if (!this.h) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.RETRY");
            intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.HELP");
            intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.CANCEL");
            intentFilter.addAction("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED");
            this.f.registerReceiver(this.i, intentFilter);
            this.h = true;
        }
    }

    public final void c() {
        if (this.h) {
            this.f.unregisterReceiver(this.i);
            this.h = false;
        }
    }

    private final qg a(boolean z, acwp acwp) {
        qg qgVar = new qg(this.f);
        qgVar.a(this.g);
        qgVar.t = ra.c(this.f, R.color.color_brand_primary);
        qgVar.a(0, 0, z);
        qgVar.a();
        qgVar.b(true);
        qgVar.i = 0;
        qgVar.a(PendingIntent.getBroadcast(this.f, 0, aczv.a("com.google.android.libraries.youtube.mdx.background.playbackpresenter.action.DISMISSED", acwp), 134217728));
        xlr.a(qgVar);
        return qgVar;
    }
}
