package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.concurrent.TimeUnit;

/* renamed from: gxs */
final /* synthetic */ class gxs implements OnClickListener {
    private final gxt a;
    private final boolean b;

    gxs(gxt gxt, boolean z) {
        this.a = gxt;
        this.b = z;
    }

    public final void onClick(View view) {
        gxt gxt = this.a;
        boolean z = this.b;
        adqe c = gxt.af.c();
        if (c != null && c.d() != 0 && !gxt.af.g()) {
            int i = gxt.at;
            int i2 = i - 1;
            if (i != 0) {
                acwc acwc;
                aizy aizy;
                if (i2 == 1 || i2 == 2) {
                    String str = gxt.am;
                    if (str == null || !str.equals(gxt.ag.k())) {
                        if (!(gxt.ag.k() != null && gxt.ag.k().equals(gxt.am) && gxt.ag.c())) {
                            aizy = gxt.ag;
                            aiqs a = aiqq.a();
                            a.a = airn.a(gxt.am, null, 0, (float) TimeUnit.MILLISECONDS.toSeconds(gxt.an));
                            aizy.a(a.b());
                        }
                    } else if (gxt.ag.c()) {
                        long j = gxt.an;
                        if (j > 0) {
                            gxt.ag.a(j);
                        }
                    } else {
                        gxt.ag.a();
                    }
                    if (z) {
                        acwc = acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_VIDEO_BUTTON_EMPTY_QUEUE;
                    } else {
                        acwc = acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_VIDEO_BUTTON;
                    }
                } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                    aizy = gxt.ag;
                    aiqs a2 = aiqq.a();
                    a2.a = airn.a(gxt.am, gxt.ak, gxt.al, 0.0f);
                    aizy.a(a2.b());
                    if (gxt.at == 5) {
                        if (z) {
                            acwc = acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_MIX_BUTTON_EMPTY_QUEUE;
                        } else {
                            acwc = acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_MIX_BUTTON;
                        }
                    } else if (z) {
                        acwc = acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_PLAYLIST_BUTTON_EMPTY_QUEUE;
                    } else {
                        acwc = acwc.MDX_REMOTE_WATCH_DIALOG_PLAY_PLAYLIST_BUTTON;
                    }
                } else {
                    acwc = null;
                }
                if (acwc != null) {
                    gxt.as.a(3, new acvs(acwc), null);
                }
                gxt.f();
                hfk hfk = gxt.ai;
                if (hfk != null) {
                    hfk.a(true);
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
