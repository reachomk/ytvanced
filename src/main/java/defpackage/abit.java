package defpackage;

import java.util.Map;

/* renamed from: abit */
public final class abit implements aaap {
    private final abiu a;

    public abit(abiu abiu) {
        this.a = abiu;
    }

    public final void a(apxu apxu, Map map) {
        String str = (String) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.services.social.query", String.class);
        afsw afsw = (afsw) xsb.a(map, (Object) "com.google.android.libraries.youtube.innertube.services.social.listener", afsw.class);
        if (str != null && afsw != null) {
            byte[] d = aabc.a(apxu).d();
            abiu abiu = this.a;
            anjv a = abiu.b.a(new abiz(abiu, str, d), abiu.a);
            aniv aniv = aniv.a;
            abis abis = new abis(afsw);
            afsw.getClass();
            xan.a(a, aniv, abis, new abiv(afsw));
        }
    }
}
