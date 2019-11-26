package defpackage;

import android.support.design.snackbar.BaseTransientBottomBar;

/* renamed from: iy */
public final class iy implements jn {
    private final /* synthetic */ BaseTransientBottomBar a;

    public iy(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public final void a() {
        BaseTransientBottomBar.a.sendMessage(BaseTransientBottomBar.a.obtainMessage(0, this.a));
    }

    public final void a(int i) {
        BaseTransientBottomBar.a.sendMessage(BaseTransientBottomBar.a.obtainMessage(1, i, 0, this.a));
    }
}
