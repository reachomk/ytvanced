package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jdr */
final /* synthetic */ class jdr implements OnCheckedChangeListener {
    private final jds a;
    private final aaas b;

    jdr(jds jds, aaas aaas) {
        this.a = jds;
        this.b = aaas;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        jds jds = this.a;
        aaas aaas = this.b;
        if (jds.c != null) {
            apxu apxu;
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Boolean.valueOf(z));
            if (z) {
                apxu = jds.c.g;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = jds.c.h;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            aaas.a(apxu, hashMap);
        }
    }
}
