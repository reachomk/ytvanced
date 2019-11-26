package defpackage;

import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: aqw */
public final class aqw implements TextWatcher {
    private final /* synthetic */ SearchView a;

    public aqw(SearchView searchView) {
        this.a = searchView;
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.a.onTextChanged(charSequence);
    }
}
