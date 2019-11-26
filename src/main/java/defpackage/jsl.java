package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jsl */
final class jsl implements OnClickListener {
    private final /* synthetic */ vod a;
    private final /* synthetic */ aaas b;
    private final /* synthetic */ jsi c;

    jsl(jsi jsi, vod vod, aaas aaas) {
        this.c = jsi;
        this.a = vod;
        this.b = aaas;
    }

    public final void onClick(View view) {
        if (!this.a.a(this.c.c)) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c.c);
            hashMap.put("shopping_drawer_ad_playing", Boolean.valueOf(this.c.b));
            avdj avdj = this.c.c;
            if (avdj != null && (avdj.a & 1) != 0) {
                hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{r0.a});
                aaas aaas = this.b;
                apxu apxu = this.c.c.c;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, hashMap);
            }
        }
    }
}
