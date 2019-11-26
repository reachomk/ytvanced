package defpackage;

import android.os.Handler;

/* renamed from: aeyh */
final class aeyh extends oex {
    private aewi e = aewi.a;

    aeyh(Handler handler, pah pah, boolean z, int i, int i2, int i3) {
        super(5000, handler, pah, 10, z, i, i2, i3);
    }

    public final void a(int i, Object obj) {
        if (i == 10001) {
            aewi aewi = (aewi) obj;
            if (aewi == null) {
                aewi = aewi.a;
            }
            this.e = aewi;
            return;
        }
        super.a(i, obj);
    }

    public final void p() {
        super.p();
        this.e.b();
    }

    public final boolean u() {
        if (!super.u()) {
            return false;
        }
        this.e.a();
        return true;
    }
}
