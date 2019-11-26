package defpackage;

import android.os.SystemClock;
import com.google.android.apps.youtube.app.extensions.reel.watch.overlay.ReelPlayerProgressPresenter;

/* renamed from: gng */
final class gng implements ajan, xcp {
    public final /* synthetic */ gmp a;

    gng(gmp gmp) {
        this.a = gmp;
    }

    public final long e() {
        return 1;
    }

    public final void a(ahkm ahkm) {
        ReelPlayerProgressPresenter reelPlayerProgressPresenter = this.a.ac().d;
        reelPlayerProgressPresenter.i = ahkm.a;
        reelPlayerProgressPresenter.g = ahkm.d;
        if (ahkm.g) {
            reelPlayerProgressPresenter.h = SystemClock.elapsedRealtime();
        }
        reelPlayerProgressPresenter.a();
    }

    public final void a(ahkr ahkr) {
        gpa ac = this.a.ac();
        int i = ahkr.a;
        if (i == 2) {
            ac.c.c();
            ac.d.a(false);
            ac.g();
        } else if (i == 3) {
            ac.d.a(true);
            ac.g();
        } else if (i == 5 || i == 6) {
            ac.c.a();
        }
        int i2 = ahkr.a;
        if (i2 != 7) {
            if (i2 == 8) {
                this.a.ae.a(3);
                this.a.a(new gnf(this));
            }
            return;
        }
        this.a.a(true, true);
    }

    public final void a(ahjc ahjc) {
        if (ahjc.c()) {
            this.a.ac().f.b();
        }
    }

    public final bcuo[] a(ajam ajam) {
        return new bcuo[]{ajam.Q().b.f().a(emg.a(this.a.aC, 16777216, 1)).a(new gni(this), gnh.a), ajam.Q().d.f().a(emg.a(this.a.aC, 16777216, 1)).a(new gnk(this), gnj.a), ajam.Q().c.f().a(emg.a(this.a.aC, 16777216, 1)).a(new gnm(this), gnl.a)};
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahjc.class, ahkm.class, ahkr.class};
        } else if (i == 0) {
            a((ahjc) obj);
            return null;
        } else if (i == 1) {
            a((ahkm) obj);
            return null;
        } else if (i == 2) {
            a((ahkr) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
