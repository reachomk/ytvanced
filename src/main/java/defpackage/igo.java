package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

/* renamed from: igo */
final class igo implements OnClickListener {
    private final /* synthetic */ igj a;

    public final void onClick(View view) {
        igj igj = this.a;
        if (igj.d != null && igj.e != null) {
            axak axak;
            ArrayList arrayList = new ArrayList();
            aybu aybu = this.a.e;
            if ((aybu.a & 4) != 0) {
                axak = aybu.g;
                if (axak == null) {
                    axak = axak.a;
                }
            } else {
                axak = null;
            }
            aohe aohe = (aohe) ajzv.a(ajzv.a(axak), aohe.class);
            if (aohe != null) {
                arrayList.addAll(aohe.k);
                if ((aohe.a & 256) != 0) {
                    Object obj = aohe.j;
                    if (obj == null) {
                        obj = apxu.d;
                    }
                    arrayList.add(obj);
                }
            }
            this.a.d.a(arrayList);
        }
    }

    /* synthetic */ igo(igj igj) {
        this.a = igj;
    }
}
