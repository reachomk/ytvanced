package defpackage;

import android.view.View.OnScrollChangeListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;

/* renamed from: czh */
final class czh implements OnScrollChangedListener {
    private final /* synthetic */ OnScrollChangeListener a;
    private final /* synthetic */ czk b;
    private final /* synthetic */ czj c;

    czh(OnScrollChangeListener onScrollChangeListener, czk czk, czj czj) {
        this.a = onScrollChangeListener;
        this.b = czk;
        this.c = czj;
    }

    public final void onScrollChanged() {
        OnScrollChangeListener onScrollChangeListener = this.a;
        if (onScrollChangeListener != null) {
            czk czk = this.b;
            onScrollChangeListener.onScrollChange(czk, czk.getScrollX(), 0, this.c.a, 0);
        }
        this.c.a = this.b.getScrollX();
    }
}
