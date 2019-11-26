package defpackage;

import java.util.Map;

/* renamed from: uzr */
public final class uzr implements aaap {
    private final aaol a;

    public uzr(aaol aaol) {
        this.a = (aaol) amqw.a((Object) aaol);
    }

    public final void a(apxu apxu, Map map) {
        aaol aaol = this.a;
        aaml aaoo = new aaoo(aaol.c, aaol.d.c());
        aaop aaop = (aaop) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.endpoint.tag", aaop.class);
        atfx atfx = (atfx) xsb.a(map, (Object) "KEY_CODE_DELIVERY_METHOD", atfx.class);
        if (atfx == null) {
            atfx = atfx.CODE_DELIVERY_METHOD_UNKNOWN;
        }
        aaoo.b = (String) xsb.a(map, (Object) "KEY_PHONE_NUMBER", String.class);
        aaoo.c = (String) xsb.a(map, (Object) "KEY_COUNTRY_CODE", String.class);
        aaoo.a = atfx;
        this.a.a.a(aaoo, new aaom(aaop));
    }
}
