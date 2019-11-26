package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: aktb */
final class aktb implements OnItemSelectedListener {
    private final /* synthetic */ aksx a;
    private final /* synthetic */ aksy b;

    aktb(aksy aksy, aksx aksx) {
        this.b = aksy;
        this.a = aksx;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        aksz aksz = this.b.e;
        aksx aksx = this.a;
        if (aksx.a != i) {
            aksx.a = i;
            aksz.notifyDataSetChanged();
        }
    }
}
