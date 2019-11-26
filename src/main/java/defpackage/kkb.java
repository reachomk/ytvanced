package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kkb */
final class kkb implements OnClickListener {
    private final /* synthetic */ kjy a;

    kkb(kjy kjy) {
        this.a = kjy;
    }

    public final void onClick(View view) {
        kjy kjy = this.a;
        axmk axmk = kjy.n;
        if (axmk != null) {
            apxu apxu;
            appu appu = axmk.e;
            if (appu == null) {
                appu = appu.c;
            }
            appw appw = appu.b;
            if (appw == null) {
                appw = appw.f;
            }
            if ((appw.a & 2) == 0) {
                apxu = null;
            } else {
                appu appu2 = kjy.n.e;
                if (appu2 == null) {
                    appu2 = appu.c;
                }
                appw appw2 = appu2.b;
                if (appw2 == null) {
                    appw2 = appw.f;
                }
                apxu = appw2.c;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            if (apxu == null) {
                kjy = this.a;
                axmk = kjy.n;
                if ((axmk.a & 8) != 0) {
                    aaas aaas = kjy.b;
                    apxu apxu2 = axmk.f;
                    if (apxu2 == null) {
                        apxu2 = apxu.d;
                    }
                    aaas.a(apxu2, null);
                    return;
                }
            }
            this.a.b.a(apxu, null);
        }
    }
}
