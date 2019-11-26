package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.View.OnFocusChangeListener;

/* renamed from: aqy */
public final class aqy implements OnFocusChangeListener {
    private final /* synthetic */ SearchView a;

    public aqy(SearchView searchView) {
        this.a = searchView;
    }

    public final void onFocusChange(View view, boolean z) {
        SearchView searchView = this.a;
        OnFocusChangeListener onFocusChangeListener = searchView.mOnQueryTextFocusChangeListener;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(searchView, z);
        }
    }
}
