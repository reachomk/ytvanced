package defpackage;

import android.graphics.drawable.TransitionDrawable;

/* renamed from: gfi */
final /* synthetic */ class gfi implements Runnable {
    private final gfg a;
    private final boolean b;

    gfi(gfg gfg, boolean z) {
        this.a = gfg;
        this.b = z;
    }

    public final void run() {
        gfg gfg = this.a;
        boolean z = this.b;
        if (gge.a(gfg.i)) {
            if (z) {
                gfg.f.performHapticFeedback(1);
            }
            if (!(gfg.g.getAnimation() == null || !gfg.g.getAnimation().hasStarted() || gfg.g.getAnimation().hasEnded())) {
                gfg.g.getAnimation().reset();
            }
            float f = !z ? 1.0f : 1.1667f;
            gfg.g.animate().scaleX(f).scaleY(f).setDuration(75).start();
            TransitionDrawable transitionDrawable = (TransitionDrawable) gfg.g.getBackground();
            if (z) {
                transitionDrawable.startTransition(75);
                gfg.p.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_DELETE_STICKER_BUTTON), null);
                return;
            }
            transitionDrawable.reverseTransition(75);
        }
    }
}
