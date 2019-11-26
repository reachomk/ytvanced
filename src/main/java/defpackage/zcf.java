package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import com.google.android.libraries.youtube.conversation.ui.StickyPlayerContainer;

/* renamed from: zcf */
public final class zcf extends ValueAnimator {
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    public boolean c;
    public final /* synthetic */ StickyPlayerContainer d;

    public zcf(StickyPlayerContainer stickyPlayerContainer) {
        this.d = stickyPlayerContainer;
        setFloatValues(new float[]{0.0f, 1.0f});
        setDuration(200);
        addUpdateListener(new zce(this));
        addListener(new zch(this));
    }

    public final boolean isRunning() {
        return this.c;
    }

    public final void a(PointF pointF, PointF pointF2) {
        this.a.set(pointF);
        this.b.set(pointF2);
        start();
    }
}
