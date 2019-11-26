package defpackage;

import com.google.android.libraries.youtube.common.ui.swipelayout.SwipeLayout;

/* renamed from: xqz */
public final /* synthetic */ class xqz implements awl {
    private final SwipeLayout a;

    public xqz(SwipeLayout swipeLayout) {
        this.a = swipeLayout;
    }

    public final void a(float f) {
        SwipeLayout swipeLayout = this.a;
        if (swipeLayout.j()) {
            f = -f;
        }
        swipeLayout.a((int) f);
    }
}
