package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

/* renamed from: aoc */
final class aoc implements OnItemSelectedListener {
    private final /* synthetic */ aoa a;

    aoc(aoa aoa) {
        this.a = aoa;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (i != -1) {
            amt amt = this.a.e;
            if (amt != null) {
                amt.a = false;
            }
        }
    }
}
