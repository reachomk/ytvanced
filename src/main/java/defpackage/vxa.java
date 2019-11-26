package defpackage;

import android.os.CountDownTimer;

/* renamed from: vxa */
final class vxa extends CountDownTimer {
    private final /* synthetic */ vwu a;

    public vxa(vwu vwu, int i) {
        this.a = vwu;
        super((long) i, 1000);
    }

    public final void onTick(long j) {
    }

    public final void onFinish() {
        vwu vwu = this.a;
        vwu.a.a(vwu.e.Z().f, vwu.f());
        vwu.f = null;
        vwu.d();
    }
}
