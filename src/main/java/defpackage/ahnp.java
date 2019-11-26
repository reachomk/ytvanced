package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;

/* renamed from: ahnp */
final class ahnp extends GLSurfaceView {
    private final /* synthetic */ ahnl a;

    public ahnp(ahnl ahnl, Context context) {
        this.a = ahnl;
        super(context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void onDetachedFromWindow() {
        this.a.d();
        this.a.f = false;
        super.onDetachedFromWindow();
    }

    /* Access modifiers changed, original: protected|final */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.f = true;
    }
}
