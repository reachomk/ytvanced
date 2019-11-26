package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.apps.youtube.app.common.tutorial.ClingView;

/* renamed from: evu */
public final class evu implements OnGlobalLayoutListener {
    private final /* synthetic */ ClingView a;

    public evu(ClingView clingView) {
        this.a = clingView;
    }

    public final void onGlobalLayout() {
        this.a.postInvalidate();
    }
}
