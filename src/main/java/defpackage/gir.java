package defpackage;

import android.widget.FrameLayout.LayoutParams;

/* renamed from: gir */
final /* synthetic */ class gir implements Runnable {
    private final gim a;
    private final int b;

    gir(gim gim, int i) {
        this.a = gim;
        this.b = i;
    }

    public final void run() {
        gim gim = this.a;
        int i = this.b;
        if (gge.a(gim.c)) {
            gim.d.setAlpha(1.0f);
            gim.d.setVisibility(0);
            LayoutParams layoutParams = new LayoutParams(-1, -2);
            layoutParams.topMargin = i - gim.d.getMeasuredHeight();
            gim.d.setLayoutParams(layoutParams);
        }
    }
}
