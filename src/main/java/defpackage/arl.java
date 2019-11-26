package defpackage;

import android.support.v7.widget.SearchView.SearchAutoComplete;
import android.view.inputmethod.InputMethodManager;

/* renamed from: arl */
public final class arl implements Runnable {
    private final /* synthetic */ SearchAutoComplete a;

    public arl(SearchAutoComplete searchAutoComplete) {
        this.a = searchAutoComplete;
    }

    public final void run() {
        SearchAutoComplete searchAutoComplete = this.a;
        if (searchAutoComplete.b) {
            ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
            searchAutoComplete.b = false;
        }
    }
}
