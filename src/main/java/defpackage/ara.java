package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: ara */
public final class ara implements OnClickListener {
    private final /* synthetic */ SearchView a;

    public ara(SearchView searchView) {
        this.a = searchView;
    }

    public final void onClick(View view) {
        SearchView searchView = this.a;
        if (view == searchView.mSearchButton) {
            searchView.onSearchClicked();
        } else if (view == searchView.mCloseButton) {
            searchView.onCloseClicked();
        } else if (view == searchView.mGoButton) {
            searchView.onSubmitQuery();
        } else if (view == searchView.mVoiceButton) {
            searchView.onVoiceClicked();
        } else if (view == searchView.mSearchSrcTextView) {
            searchView.forceSuggestionQuery();
        }
    }
}
