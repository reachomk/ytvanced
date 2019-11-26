package defpackage;

import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.libraries.youtube.livechat.ui.view.VerticalShimmerLoadingFrameLayout;

/* renamed from: abwf */
final /* synthetic */ class abwf implements xoy {
    private final LoadingFrameLayout a;
    private final Runnable b;

    abwf(LoadingFrameLayout loadingFrameLayout, Runnable runnable) {
        this.a = loadingFrameLayout;
        this.b = runnable;
    }

    public final void bf_() {
        LoadingFrameLayout loadingFrameLayout = this.a;
        Runnable runnable = this.b;
        if (loadingFrameLayout instanceof VerticalShimmerLoadingFrameLayout) {
            loadingFrameLayout.b();
        }
        loadingFrameLayout.a();
        runnable.run();
    }
}
