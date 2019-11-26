package defpackage;

import android.view.View;
import android.view.ViewTreeObserver.OnScrollChangedListener;

/* renamed from: almg */
final class almg implements OnScrollChangedListener {
    private final /* synthetic */ View a;
    private final /* synthetic */ almh b;

    almg(almh almh, View view) {
        this.b = almh;
        this.a = view;
    }

    public final void onScrollChanged() {
        this.a.getViewTreeObserver().removeOnScrollChangedListener(this);
        this.b.a.dismiss();
    }
}
