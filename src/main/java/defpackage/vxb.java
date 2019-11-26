package defpackage;

import android.os.CountDownTimer;

/* renamed from: vxb */
final class vxb extends CountDownTimer {
    private final /* synthetic */ vwu a;

    public vxb(vwu vwu, int i) {
        this.a = vwu;
        super((long) i, 1000);
    }

    public final void onTick(long j) {
        this.a.a(j);
    }

    public final void onFinish() {
        this.a.a(0);
    }
}
