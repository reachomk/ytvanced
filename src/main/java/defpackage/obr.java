package defpackage;

import android.os.Handler;

/* renamed from: obr */
public final class obr {
    public final obs a;
    private final Handler b;

    public obr(Handler handler, obs obs) {
        this.b = obs != null ? (Handler) oxz.a((Object) handler) : null;
        this.a = obs;
    }

    public final void a(odk odk) {
        if (this.a != null) {
            this.b.post(new obu(this, odk));
        }
    }

    public final void a(String str, long j, long j2) {
        if (this.a != null) {
            this.b.post(new obt(this, str, j, j2));
        }
    }

    public final void a(nzw nzw) {
        if (this.a != null) {
            this.b.post(new obw(this, nzw));
        }
    }

    public final void a(int i, long j, long j2) {
        if (this.a != null) {
            this.b.post(new obv(this, i, j, j2));
        }
    }

    public final void b(odk odk) {
        odk.a();
        if (this.a != null) {
            this.b.post(new oby(this, odk));
        }
    }

    public final void a(int i) {
        if (this.a != null) {
            this.b.post(new obx(this, i));
        }
    }
}
