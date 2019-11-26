package defpackage;

import java.util.Collections;
import java.util.Set;

/* renamed from: acym */
final class acym implements acyc {
    private final acxx a;
    private final Class b;
    private final Set c;
    private final /* synthetic */ acyi d;

    public final /* synthetic */ void a(Object obj) {
        xbb xbb = (xbb) obj;
        acxv a = this.a.a(this.d);
        if (a != null) {
            a.a(xbb, this.c, Collections.emptySet());
            this.d.a(a, this.b, true);
            if (a.a(xbb) && !a.e) {
                this.d.e.add(a);
            }
        }
    }

    /* synthetic */ acym(acyi acyi, acxx acxx, Class cls, Class cls2) {
        this.d = acyi;
        this.a = (acxx) amqw.a((Object) acxx);
        this.b = cls2;
        this.c = Collections.singleton(cls);
    }
}
