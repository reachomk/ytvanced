package defpackage;

import android.support.v7.widget.SearchView;

/* renamed from: aqu */
public final class aqu implements Runnable {
    private final /* synthetic */ SearchView a;

    public aqu(SearchView searchView) {
        this.a = searchView;
    }

    public final void run() {
        this.a.updateFocusedState();
    }
}
