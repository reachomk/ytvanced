package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ldk */
final /* synthetic */ class ldk implements OnClickListener {
    private final ldj a;

    ldk(ldj ldj) {
        this.a = ldj;
    }

    public final void onClick(View view) {
        ldj ldj = this.a;
        aoou aoou = ldj.c;
        if ((aoou.a & 64) != 0 && !ldj.b.a(aoou)) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", ldj.c);
            aaas aaas = ldj.a;
            apxu apxu = ldj.c.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }
}
