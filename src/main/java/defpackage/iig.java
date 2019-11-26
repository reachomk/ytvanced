package defpackage;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: iig */
final class iig implements OnGlobalLayoutListener {
    private final /* synthetic */ aolm a;
    private final /* synthetic */ ihy b;

    iig(ihy ihy, aolm aolm) {
        this.b = ihy;
        this.a = aolm;
    }

    public final void onGlobalLayout() {
        this.b.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.b.a(this.a);
    }
}
