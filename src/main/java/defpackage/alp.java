package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: alp */
final class alp implements OnItemClickListener {
    private final /* synthetic */ alq a;

    alp(alq alq) {
        this.a = alq;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.a.d.setSelection(i);
        if (this.a.d.getOnItemClickListener() != null) {
            alq alq = this.a;
            alq.d.performItemClick(view, i, alq.b.getItemId(i));
        }
        this.a.d();
    }
}
