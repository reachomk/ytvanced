package defpackage;

import android.widget.LinearLayout.LayoutParams;

/* renamed from: yfk */
final /* synthetic */ class yfk implements Runnable {
    private final yfh a;
    private final int b;

    yfk(yfh yfh, int i) {
        this.a = yfh;
        this.b = i;
    }

    public final void run() {
        yfh yfh = this.a;
        LayoutParams layoutParams = (LayoutParams) yfh.b.getLayoutParams();
        layoutParams.height = this.b;
        yfh.b.setLayoutParams(layoutParams);
        yfh.b.post(new yfj(yfh));
    }
}
