package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: zux */
final class zux implements OnClickListener {
    private final /* synthetic */ arxl a;
    private final /* synthetic */ zwj b;
    private final /* synthetic */ zva c;

    zux(arxl arxl, zwj zwj, zva zva) {
        this.a = arxl;
        this.b = zwj;
        this.c = zva;
    }

    public final void onClick(View view) {
        if ((this.a.a & 128) != 0 && this.b.g) {
            Map hashMap = new HashMap(2);
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a);
            hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{this.c.j});
            aaas aaas = this.b.k;
            apxu apxu = this.a.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }
}
