package defpackage;

import android.os.Handler;

/* renamed from: adph */
final /* synthetic */ class adph implements bcvk {
    private final adpg a;

    adph(adpg adpg) {
        this.a = adpg;
    }

    public final void a(Object obj) {
        adpg adpg = this.a;
        ahjn ahjn = (ahjn) obj;
        boolean z = true;
        boolean z2 = ahjn.b == airc.FULLSCREEN;
        adpc adpc = adpg.a;
        if (ahjn.a != airc.REMOTE) {
            z = false;
        }
        adpc.m = z;
        adit s = adpg.a.k.s();
        if (ahjn.b == airc.MINIMIZED) {
            s.a(adiw.BROWSE);
        } else if (z2) {
            s.a(adiw.WATCH);
        } else if (ahjn.b == airc.DEFAULT) {
            if (ahjn.c < 0 || ahjn.d < 0) {
                s.a(adiw.BROWSE);
            } else {
                new Handler().postDelayed(new adpf(adpg), 100);
            }
        }
        s.a(z2);
        if (adpg.a.m) {
            s.h(0);
        }
        s.a(adpg.a.i.a());
        adpg.a.l.e_(s.a());
    }
}
