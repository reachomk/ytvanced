package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: alda */
public class alda {
    private final axha a;
    private final alcs b;
    private final aldc c;
    private final aldg d;

    public alda(alcs alcs, axha axha, aldg aldg, aldc aldc) {
        this.a = axha;
        this.b = alcs;
        this.d = aldg;
        this.c = aldc;
    }

    public boolean a(Object obj, Object obj2) {
        alct alct = this.b.f;
        int a = alcs.a(this.a);
        int i = a - 1;
        if (a != 0) {
            alct.b(i);
            List a2 = alcs.a(this.a);
            i = 0;
            while (i < a2.size()) {
                if (((axgu) a2.get(i)).d.equals(obj2.toString())) {
                    break;
                }
                i++;
            }
            i = -1;
            axgu axgu = (axgu) a2.get(i);
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj2);
            aaas aaas = this.b.d;
            apxu apxu = axgu.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, hashMap);
            aldc aldc = this.c;
            if (aldc != null) {
                aldc.a(axgu.b);
            }
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i2 >= a2.size()) {
                    return true;
                }
                aldg aldg = this.d;
                axgu axgu2 = (axgu) a2.get(i2);
                if (i2 != i) {
                    z = false;
                }
                aldg.a(axgu2, z);
                i2++;
            }
        } else {
            throw null;
        }
    }
}
