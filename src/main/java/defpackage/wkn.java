package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: wkn */
final class wkn implements OnItemSelectedListener {
    private final /* synthetic */ wjv a;

    wkn(wjv wjv) {
        this.a = wjv;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        wjp wjp = this.a.ah;
        wjp.b = (aqyl) wjp.getItem(i);
    }
}
