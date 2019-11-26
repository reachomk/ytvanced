package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

/* renamed from: kzj */
final class kzj implements OnItemClickListener {
    private final /* synthetic */ kzg a;

    kzj(kzg kzg) {
        this.a = kzg;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object obj = this.a.b.get(i);
        if (obj instanceof aphg) {
            this.a.d();
            aphg aphg = (aphg) obj;
            if ((aphg.a & 4096) != 0) {
                aaas aaas = (aaas) this.a.c.b.get();
                apxu apxu = aphg.m;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
    }
}
