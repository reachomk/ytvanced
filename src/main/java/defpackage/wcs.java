package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: wcs */
final class wcs implements wks {
    private final /* synthetic */ ajrq a;
    private final /* synthetic */ wcq b;

    wcs(wcq wcq, ajrq ajrq) {
        this.b = wcq;
        this.a = ajrq;
    }

    public final void a(String str, List list, String str2, String str3, String str4, String str5, String str6) {
        wcu wcu = this.b.d;
        wcu.d = str;
        wcu.e = list;
        wcu.f = str2;
        wcu.g = str3;
        wcu.h = str4;
        wcu.i = str5;
        wcu.j = str6;
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.b.d);
        aaas aaas = this.b.b;
        aphg aphg = this.a.b.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        apxu apxu = aphg.l;
        if (apxu == null) {
            apxu = apxu.d;
        }
        aaas.a(apxu, hashMap);
    }
}
