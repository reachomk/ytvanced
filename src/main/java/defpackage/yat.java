package defpackage;

import java.util.Map;

/* renamed from: yat */
public final class yat implements aaap {
    private final xci a;

    public yat(xci xci) {
        this.a = (xci) amqw.a((Object) xci);
    }

    public final void a(apxu apxu, Map map) {
        Object c = xsb.c(map, "com.google.android.libraries.youtube.innertube.endpoint.tag");
        if (c instanceof alhq) {
            alhq alhq = (alhq) c;
            Object obj = alhq.b;
            if (!alhq.a) {
                this.a.d(new ybg());
            }
            c = obj;
        }
        if (c != null) {
            this.a.d(zyp.a(c));
        }
    }
}
