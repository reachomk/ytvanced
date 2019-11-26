package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jdy */
final /* synthetic */ class jdy implements OnCheckedChangeListener {
    private final jdv a;
    private final aldg b;
    private final aaas c;
    private final jdo d;

    jdy(jdv jdv, aldg aldg, aaas aaas, jdo jdo) {
        this.a = jdv;
        this.b = aldg;
        this.c = aaas;
        this.d = jdo;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        jdv jdv = this.a;
        aldg aldg = this.b;
        aaas aaas = this.c;
        jdo jdo = this.d;
        axgk axgk = jdv.c;
        if (axgk != null && z != aldg.a(axgk)) {
            apxu apxu;
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Boolean.valueOf(z));
            if (z) {
                apxu = jdv.c.g;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = jdv.c.h;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            aaas.a(apxu, hashMap);
            aldg.a(jdv.c, z);
            for (jdn a : jdo.a) {
                a.a(z);
            }
        }
    }
}
