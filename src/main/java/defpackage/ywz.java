package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import com.google.android.libraries.youtube.conversation.technodrome.view.ChatInlineFixedVideoView;

/* renamed from: ywz */
public final class ywz extends ValueAnimator {
    public final PointF a = new PointF();
    public final PointF b = new PointF();
    public final /* synthetic */ ChatInlineFixedVideoView c;

    public ywz(ChatInlineFixedVideoView chatInlineFixedVideoView) {
        this.c = chatInlineFixedVideoView;
        setFloatValues(new float[]{0.0f, 1.0f});
        setDuration(200);
        addUpdateListener(new yxb(this));
    }

    public final void a(PointF pointF, PointF pointF2) {
        this.a.set(pointF);
        this.b.set(pointF2);
        start();
    }
}
