package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jsd */
final class jsd implements OnClickListener {
    private final /* synthetic */ jsb a;

    jsd(jsb jsb) {
        this.a = jsb;
    }

    public final void onClick(View view) {
        jsb jsb = this.a;
        aqeg aqeg = jsb.d;
        if (aqeg != null && (aqeg.a & 16) != 0 && !jsb.b.a(aqeg)) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a.d);
            hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{this.a.c});
            jsb jsb2 = this.a;
            aaas aaas = jsb2.a;
            apxu apxu = jsb2.d.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
        }
    }
}
