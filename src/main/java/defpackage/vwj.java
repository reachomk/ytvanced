package defpackage;

import android.os.CountDownTimer;

/* renamed from: vwj */
final class vwj extends CountDownTimer {
    private final /* synthetic */ vwh a;

    public vwj(vwh vwh, long j) {
        this.a = vwh;
        super(j, 1000);
        vwh.h = j;
    }

    public final void onTick(long j) {
        vwh vwh = this.a;
        vwh.h = j;
        vwh.b(j);
    }

    public final void onFinish() {
        vwh vwh = this.a;
        vwh.h = 0;
        vwh.b(0);
    }
}
