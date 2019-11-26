package defpackage;

import android.support.v7.widget.SearchView;

/* renamed from: aqv */
public final class aqv implements Runnable {
    private final /* synthetic */ SearchView a;

    public aqv(SearchView searchView) {
        this.a = searchView;
    }

    public final void run() {
        avh avh = this.a.mSuggestionsAdapter;
        if (avh instanceof arq) {
            avh.a(null);
        }
    }
}
