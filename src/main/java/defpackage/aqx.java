package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.View.OnLayoutChangeListener;

/* renamed from: aqx */
public final class aqx implements OnLayoutChangeListener {
    private final /* synthetic */ SearchView a;

    public aqx(SearchView searchView) {
        this.a = searchView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.adjustDropDownSizeAndPosition();
    }
}
