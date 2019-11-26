package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: wvg */
final class wvg implements OnClickListener {
    private final /* synthetic */ wvh a;

    wvg(wvh wvh) {
        this.a = wvh;
    }

    public final void onClick(View view) {
        this.a.c();
        wvh wvh = this.a;
        azpi azpi;
        azpf azpf;
        if (view != wvh.c) {
            if (view == wvh.b) {
                azpi = wvh.o;
                if (azpi != null) {
                    azpf = (azpf) ((anxl) azpi.build());
                    wvh.a(wvi.d(azpf) - wvi.b(azpf));
                    wvh.d();
                }
            }
            return;
        }
        azpi = wvh.o;
        if (azpi != null) {
            azpf = (azpf) ((anxl) azpi.build());
            wvh.a(wvi.d(azpf) + wvi.b(azpf));
            wvh.d();
        }
    }
}
