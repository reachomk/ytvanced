package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: ugg */
final /* synthetic */ class ugg implements OnItemClickListener {
    private final uge a;

    ugg(uge uge) {
        this.a = uge;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ufz ufz = (ufz) adapterView.getItemAtPosition(i);
        ugf ugf = this.a.a;
        if (ugf != null) {
            ugf.a(ufz);
        }
    }
}
