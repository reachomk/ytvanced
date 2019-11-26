package defpackage;

import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;

/* renamed from: aqz */
public final class aqz implements OnKeyListener {
    private final /* synthetic */ SearchView a;

    public aqz(SearchView searchView) {
        this.a = searchView;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        SearchView searchView = this.a;
        if (searchView.mSearchable != null) {
            if (searchView.mSearchSrcTextView.isPopupShowing() && this.a.mSearchSrcTextView.getListSelection() != -1) {
                return this.a.onSuggestionsKey(view, i, keyEvent);
            }
            if (TextUtils.getTrimmedLength(this.a.mSearchSrcTextView.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                view.cancelLongPress();
                SearchView searchView2 = this.a;
                searchView2.launchQuerySearch(0, null, searchView2.mSearchSrcTextView.getText().toString());
                return true;
            }
        }
        return false;
    }
}
