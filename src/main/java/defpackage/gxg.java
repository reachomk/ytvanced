package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: gxg */
final class gxg implements OnItemSelectedListener {
    private final /* synthetic */ gxf a;

    gxg(gxf gxf) {
        this.a = gxf;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        this.a.f();
    }
}
