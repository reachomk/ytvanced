package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jsu */
final class jsu implements OnClickListener {
    private final /* synthetic */ jst a;

    public final void onClick(View view) {
        jst jst = this.a;
        aqha aqha = jst.d;
        if (aqha != null && (aqha.a & 128) != 0) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", jst.d);
            hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{jst.c});
            aaas aaas = jst.a;
            apxu apxu = jst.d.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }

    /* synthetic */ jsu(jst jst) {
        this.a = jst;
    }
}
