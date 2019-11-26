package defpackage;

import android.graphics.Rect;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import java.util.concurrent.TimeUnit;

/* renamed from: fbp */
public final class fbp implements ejc {
    private static final long f = TimeUnit.DAYS.toSeconds(30);
    public final fpc a;
    public final eif b;
    public final Rect c;
    public final xol d;
    public BottomUiContainer e;
    private boolean g = false;
    private fbr h;
    private ejd i;
    private boolean j;

    public fbp(zyw zyw, fpb fpb, eif eif, xol xol, bctz bctz) {
        long j;
        this.b = eif;
        this.d = xol;
        bctz.a(new fbs(this));
        this.c = new Rect();
        apxn a = zyw.a();
        if (a != null) {
            auya auya = a.i;
            if (auya == null) {
                auya = auya.J;
            }
            if ((auya.a & 32768) != 0) {
                auya auya2 = a.i;
                if (auya2 == null) {
                    auya2 = auya.J;
                }
                awmg awmg = auya2.l;
                if (awmg == null) {
                    awmg = awmg.c;
                }
                j = (long) awmg.b;
                this.a = fpb.a(ebn.RATE_LIMIT_PROMO_LAST_ALLOWED, j, TimeUnit.SECONDS);
                eif.a(this);
            }
        }
        j = f;
        this.a = fpb.a(ebn.RATE_LIMIT_PROMO_LAST_ALLOWED, j, TimeUnit.SECONDS);
        eif.a(this);
    }

    public final void a(BottomUiContainer bottomUiContainer) {
        if (!this.g) {
            this.g = true;
            this.e = (BottomUiContainer) amqw.a((Object) bottomUiContainer);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(fbr fbr) {
        this.h = fbr;
        if (fbr.a()) {
            this.a.b();
        }
        this.j = true;
        b(true);
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.h = null;
        b(false);
    }

    public final void a(boolean z) {
        int b = b();
        if (b != 1) {
            if (b == 0) {
                return;
            }
        } else if (!z) {
            return;
        }
        this.e.b(3);
    }

    public final void b(fbr fbr) {
        if (this.b.c().a()) {
            this.e.a(fbr.b());
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        boolean a = ejd2.a();
        ejd ejd3 = ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED;
        ejd ejd4 = ejd.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED;
        boolean z = false;
        Object obj = (this.i == ejd2 || this.j) ? null : 1;
        if (a || !(ejd != ejd3 || ejd2 == ejd4 || obj == null)) {
            a(false);
        }
        this.j = false;
        fbr fbr = this.h;
        Object obj2 = (fbr == null || !fbr.b()) ? null : 1;
        BottomUiContainer bottomUiContainer = this.e;
        if (!(a && obj2 == null)) {
            z = true;
        }
        bottomUiContainer.a(z);
        if (obj2 != null) {
            b(true);
        }
        if (!ejd2.e()) {
            this.i = ejd2;
        }
    }

    public final int b() {
        fbr fbr = this.h;
        return fbr != null ? fbr.q() : 0;
    }

    private final void b(boolean z) {
        xol xol = this.d;
        if (xol != null) {
            xol.b(z);
        }
    }
}
