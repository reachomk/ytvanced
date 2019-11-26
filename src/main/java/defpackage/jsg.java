package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jsg */
final class jsg implements OnClickListener {
    private final /* synthetic */ vod a;
    private final /* synthetic */ aaas b;
    private final /* synthetic */ jsh c;

    jsg(jsh jsh, vod vod, aaas aaas) {
        this.c = jsh;
        this.a = vod;
        this.b = aaas;
    }

    public final void onClick(View view) {
        aqhh aqhh = this.c.a;
        if (aqhh != null && (aqhh.a & 4) != 0 && !this.a.a(aqhh)) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.c.a);
            aaas aaas = this.b;
            apxu apxu = this.c.a.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }
}
