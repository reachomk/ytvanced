package defpackage;

import android.text.Html;
import android.view.View;
import com.google.android.libraries.youtube.mdx.smartremote.MicrophoneView;
import java.util.Random;

/* renamed from: adwu */
final /* synthetic */ class adwu implements Runnable {
    private final adwl a;
    private final boolean b;
    private final int c;

    adwu(adwl adwl, int i, boolean z) {
        this.a = adwl;
        this.c = i;
        this.b = z;
    }

    public final void run() {
        adwl adwl = this.a;
        int i = this.c;
        boolean z = this.b;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = 8;
            View view;
            if (i2 == 0) {
                adwl.h.setVisibility(0);
                adwl.i.setVisibility(0);
                adwl.j.setVisibility(8);
                adwl.k.setVisibility(8);
                adwl.l.setVisibility(8);
                adwl.m.setVisibility(8);
                adwl.n.setVisibility(8);
                adwl.o.setVisibility(8);
                adwl.p.setVisibility(8);
                adwl.q.setVisibility(8);
                return;
            } else if (i2 == 1) {
                adwl.h.setVisibility(8);
                adwl.i.setVisibility(8);
                adwl.j.setVisibility(0);
                adwl.k.setVisibility(0);
                adwl.l.setVisibility(8);
                adwl.m.setVisibility(8);
                adwl.n.setVisibility(!adwl.a() ? 8 : 0);
                adwl.n.setText(Html.fromHtml(adwl.r[new Random().nextInt(adwl.r.length)]));
                adwl.o.setVisibility(0);
                MicrophoneView microphoneView = adwl.o;
                microphoneView.c = 2;
                microphoneView.b();
                adwl.p.setVisibility(8);
                adwl.q.setVisibility(8);
                adwl.a(acwc.MDX_SMART_REMOTE_BUTTON_MIC);
                return;
            } else if (i2 == 2) {
                adwl.h.setVisibility(8);
                adwl.i.setVisibility(8);
                adwl.j.setVisibility(0);
                adwl.k.setVisibility(0);
                adwl.l.setVisibility(8);
                adwl.m.setVisibility(8);
                adwl.n.setVisibility(!adwl.a() ? 8 : 0);
                adwl.n.setText(Html.fromHtml(adwl.r[new Random().nextInt(adwl.r.length)]));
                adwl.o.setVisibility(0);
                adwl.o.c();
                adwl.p.setVisibility(8);
                view = adwl.q;
                if (!z) {
                    i3 = 0;
                }
                view.setVisibility(i3);
                adwl.a(acwc.MDX_SMART_REMOTE_BUTTON_MIC);
                return;
            } else if (i2 == 3) {
                adwl.h.setVisibility(8);
                adwl.i.setVisibility(8);
                adwl.j.setVisibility(0);
                adwl.k.setVisibility(0);
                adwl.l.setVisibility(0);
                adwl.m.setVisibility(8);
                adwl.n.setVisibility(8);
                adwl.o.setVisibility(0);
                adwl.o.c();
                adwl.p.setVisibility(0);
                view = adwl.q;
                if (!z) {
                    i3 = 0;
                }
                view.setVisibility(i3);
                adwl.a(acwc.MDX_SMART_REMOTE_BUTTON_LEFT_ARROW, acwc.MDX_SMART_REMOTE_BUTTON_RIGHT_ARROW, acwc.MDX_SMART_REMOTE_BUTTON_UP_ARROW, acwc.MDX_SMART_REMOTE_BUTTON_DOWN_ARROW, acwc.MDX_SMART_REMOTE_BUTTON_ENTER, acwc.MDX_SMART_REMOTE_BUTTON_BACK, acwc.MDX_SMART_REMOTE_BUTTON_MIC);
                return;
            } else {
                return;
            }
        }
        throw null;
    }
}
