package defpackage;

import android.view.View;
import com.google.protos.youtube.api.innertube.ReelItemRendererOuterClass$ReelItemRenderer;

/* renamed from: khz */
final /* synthetic */ class khz implements Runnable {
    private final khw a;
    private final ReelItemRendererOuterClass$ReelItemRenderer b;

    khz(khw khw, ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer) {
        this.a = khw;
        this.b = reelItemRendererOuterClass$ReelItemRenderer;
    }

    public final void run() {
        khw khw = this.a;
        ReelItemRendererOuterClass$ReelItemRenderer reelItemRendererOuterClass$ReelItemRenderer = this.b;
        View view = khw.e;
        if (view != null && abe.H(view)) {
            khw.a(reelItemRendererOuterClass$ReelItemRenderer);
        }
    }
}
