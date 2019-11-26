package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: wcr */
public final class wcr implements wks {
    private final /* synthetic */ wcw a;
    private final /* synthetic */ ajrq b;
    private final /* synthetic */ wcq c;

    public wcr(wcq wcq, wcw wcw, ajrq ajrq) {
        this.c = wcq;
        this.a = wcw;
        this.b = ajrq;
    }

    public final void a(String str, List list, String str2, String str3, String str4, String str5, String str6) {
        this.a.a = str;
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.a);
        aaas aaas = this.c.b;
        aphg aphg = this.b.b.b;
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
