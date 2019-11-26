package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zuy */
final class zuy implements OnClickListener {
    private final /* synthetic */ arxl a;
    private final /* synthetic */ zva b;
    private final /* synthetic */ zwj c;

    zuy(arxl arxl, zva zva, zwj zwj) {
        this.a = arxl;
        this.b = zva;
        this.c = zwj;
    }

    public final void onClick(View view) {
        if ((this.a.a & 2) != 0) {
            Map hashMap = new HashMap(2);
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a);
            hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{this.b.j});
            aaas aaas = this.c.k;
            apxu apxu = this.a.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }
}
