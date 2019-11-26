package defpackage;

import android.os.Handler;
import android.view.Surface;

/* renamed from: pak */
public final class pak {
    public final pah a;
    private final Handler b;

    public pak(Handler handler, pah pah) {
        this.b = pah != null ? (Handler) oxz.a((Object) handler) : null;
        this.a = pah;
    }

    public final void a(odk odk) {
        if (this.a != null) {
            this.b.post(new paj(this, odk));
        }
    }

    public final void a(String str, long j, long j2) {
        if (this.a != null) {
            this.b.post(new pam(this, str, j, j2));
        }
    }

    public final void a(nzw nzw) {
        if (this.a != null) {
            this.b.post(new pal(this, nzw));
        }
    }

    public final void a(int i, long j) {
        if (this.a != null) {
            this.b.post(new pao(this, i, j));
        }
    }

    public final void a(int i, int i2, int i3, float f) {
        if (this.a != null) {
            this.b.post(new pan(this, i, i2, i3, f));
        }
    }

    public final void a(Surface surface) {
        if (this.a != null) {
            this.b.post(new paq(this, surface));
        }
    }

    public final void b(odk odk) {
        odk.a();
        if (this.a != null) {
            this.b.post(new pap(this, odk));
        }
    }
}
