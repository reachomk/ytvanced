package defpackage;

import java.util.Map;

/* renamed from: uzq */
public final class uzq implements aaap {
    private final aaor a;

    public uzq(aaor aaor) {
        this.a = (aaor) amqw.a((Object) aaor);
    }

    public final void a(apxu apxu, Map map) {
        aaor aaor = this.a;
        aaml aaou = new aaou(aaor.c, aaor.d.c());
        aaov aaov = (aaov) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", aaov.class);
        aaou.a = Long.valueOf(((Long) xsb.a(map, (Object) "KEY_IDV_REQUEST_ID", Long.class)).longValue());
        aaou.b = (String) xsb.a(map, (Object) "KEY_VERIFICATION_CODE", String.class);
        this.a.a.a(aaou, new aaos(aaov));
    }
}
