package defpackage;

import androidx.mediarouter.app.MediaRouteButton;

/* renamed from: iay */
final class iay implements adoh {
    private final /* synthetic */ iaz a;

    iay(iaz iaz) {
        this.a = iaz;
    }

    private final boolean c(adoi adoi) {
        if (adoi instanceof hcs) {
            if (((MediaRouteButton) this.a.c.get()).equals((MediaRouteButton) ((hcs) adoi).a.get())) {
                return true;
            }
        }
        return false;
    }

    public final void a(adoi adoi) {
        if (c(adoi)) {
            iaz iaz = this.a;
            iaz.d = true;
            iaz.a();
        }
    }

    public final void b(adoi adoi) {
        if (c(adoi)) {
            iaz iaz = this.a;
            iaz.d = false;
            iaz.a();
        }
    }
}
