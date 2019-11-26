package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* renamed from: xrc */
public final class xrc implements OnGlobalLayoutListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ xrd b;
    private final /* synthetic */ float c;
    private final /* synthetic */ SwipeLayout d;

    public xrc(SwipeLayout swipeLayout, View view, xrd xrd, float f) {
        this.d = swipeLayout;
        this.a = view;
        this.b = xrd;
        this.c = f;
    }

    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        if (this.a.getParent() != null) {
            this.d.a(((Integer) this.b.a()).intValue(), this.c);
        }
    }
}
