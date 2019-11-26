package defpackage;

import java.util.Collections;
import java.util.Map;

/* renamed from: qua */
final /* synthetic */ class qua implements qug {
    private final qtx a;
    private final qtw b;

    qua(qtx qtx, qtw qtw) {
        this.a = qtx;
        this.b = qtw;
    }

    public final Object a() {
        Map a;
        qtx qtx = this.a;
        qtw qtw = this.b;
        if (qtx.b("gms:phenotype:phenotype_flag:debug_disable_caching")) {
            a = qtw.a();
        } else {
            a = qtw.f;
        }
        if (a == null) {
            synchronized (qtw.e) {
                a = qtw.f;
                if (a == null) {
                    a = qtw.a();
                    qtw.f = a;
                }
            }
        }
        if (a == null) {
            a = Collections.emptyMap();
        }
        return (String) a.get(qtx.b);
    }
}
