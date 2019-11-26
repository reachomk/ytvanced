package defpackage;

import android.widget.FrameLayout.LayoutParams;

/* renamed from: gks */
final /* synthetic */ class gks implements Runnable {
    private final gkp a;

    gks(gkp gkp) {
        this.a = gkp;
    }

    public final void run() {
        gkp gkp = this.a;
        int height = ((gkp.e.getHeight() - gkp.f.getHeight()) - gkp.c.getHeight()) / 2;
        LayoutParams layoutParams;
        if (gkp.b) {
            if (height <= gkp.a) {
                layoutParams = (LayoutParams) gkp.d.getLayoutParams();
                layoutParams.gravity = 80;
                layoutParams.bottomMargin = gkp.a;
                gkp.d.setLayoutParams(layoutParams);
                gkp.b = false;
            }
        } else if (height > gkp.a) {
            layoutParams = (LayoutParams) gkp.d.getLayoutParams();
            layoutParams.gravity = 16;
            layoutParams.bottomMargin = 0;
            gkp.d.setLayoutParams(layoutParams);
            gkp.b = true;
        }
    }
}
