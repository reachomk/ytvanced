package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: jeo */
final class jeo implements OnClickListener {
    private axgq a;
    private final /* synthetic */ jed b;

    jeo(jed jed, axgq axgq) {
        this.b = jed;
        this.a = axgq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Map hashMap;
        List a;
        aaas aaas;
        axgw axgw;
        apxu apxu;
        jdq jdq;
        int i2;
        jed jed = this.b;
        i = jed.k;
        String str = "com.google.android.libraries.youtube.innertube.endpoint.tag";
        if (i != jed.i) {
            this.a = jed.a(this.a, 0, i);
            hashMap = new HashMap();
            hashMap.put(str, Integer.valueOf(this.b.k));
            a = jed.a(this.a, 0);
            jed jed2 = this.b;
            aaas = jed2.b;
            axgw = (axgw) a.get(jed2.k);
            apxu = (axgw.a == 190692730 ? (axgs) axgw.b : axgs.e).d;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
            jed = this.b;
            jdq = jed.c;
            i2 = jed.k;
            for (jdp a2 : jdq.a) {
                a2.a(i2);
            }
            jed = this.b;
            jed.i = jed.k;
        }
        jed = this.b;
        i = jed.l;
        if (i != jed.j) {
            this.a = jed.a(this.a, 1, i);
            hashMap = new HashMap();
            hashMap.put(str, Integer.valueOf(this.b.l));
            a = jed.a(this.a, 1);
            jed jed3 = this.b;
            aaas = jed3.b;
            axgw = (axgw) a.get(jed3.l);
            apxu = (axgw.a == 190692730 ? (axgs) axgw.b : axgs.e).d;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
            jed = this.b;
            jdq = jed.c;
            i2 = jed.l;
            for (jdp b : jdq.a) {
                b.b(i2);
            }
            jed = this.b;
            jed.j = jed.l;
        }
        this.b.a(Boolean.valueOf(true));
    }
}
