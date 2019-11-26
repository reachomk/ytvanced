package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: arb */
public final class arb implements OnItemClickListener {
    private final /* synthetic */ SearchView a;

    public arb(SearchView searchView) {
        this.a = searchView;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.onItemClicked(i, 0, null);
    }
}
