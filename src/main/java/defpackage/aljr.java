package defpackage;

import android.widget.LinearLayout.LayoutParams;

/* renamed from: aljr */
final class aljr implements Runnable {
    private final /* synthetic */ aljp a;

    aljr(aljp aljp) {
        this.a = aljp;
    }

    public final void run() {
        aljp aljp = this.a;
        aljp.aa.setLayoutParams(new LayoutParams(-1, aljp.ad.a()));
    }
}
