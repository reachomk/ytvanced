package defpackage;

import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: are */
public final class are implements OnItemSelectedListener {
    private final /* synthetic */ SearchView a;

    public are(SearchView searchView) {
        this.a = searchView;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.onItemSelected(i);
    }
}
