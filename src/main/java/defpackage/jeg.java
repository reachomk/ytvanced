package defpackage;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jeg */
final /* synthetic */ class jeg implements OnCheckedChangeListener {
    private final jed a;
    private final aldg b;
    private final aaas c;
    private final jdq d;

    jeg(jed jed, aldg aldg, aaas aaas, jdq jdq) {
        this.a = jed;
        this.b = aldg;
        this.c = aaas;
        this.d = jdq;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        jed jed = this.a;
        aldg aldg = this.b;
        aaas aaas = this.c;
        jdq jdq = this.d;
        boolean a = aldg.a(jed.d);
        if (jed.d != null && z != a) {
            apxu apxu;
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", Boolean.valueOf(a));
            if (z) {
                apxu = jed.d.g;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            } else {
                apxu = jed.d.h;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
            aaas.a(apxu, hashMap);
            aldg.a(jed.d, z);
            for (jdp a2 : jdq.a) {
                a2.a(z);
            }
        }
    }
}
