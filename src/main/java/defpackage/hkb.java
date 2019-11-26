package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint;
import java.util.Map;

/* renamed from: hkb */
public final class hkb implements aaap {
    public final bapu a;
    public final xoi b;
    public final egp c;
    public final ahbx d;
    private final abks e;

    public hkb(abks abks, bapu bapu, xoi xoi, egp egp, ahbx ahbx) {
        this.e = abks;
        this.a = bapu;
        this.b = xoi;
        this.c = egp;
        this.d = ahbx;
    }

    public final void a(apxu apxu, Map map) {
        Object obj;
        anxr access$000 = anxl.checkIsLite(YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint.ypcGetOfflineUpsellEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            obj = access$000.b;
        } else {
            obj = access$000.a(b);
        }
        String str = ((YpcGetOfflineUpsellEndpoint$YPCGetOfflineUpsellEndpoint) obj).b;
        if (!TextUtils.isEmpty(str)) {
            this.c.h();
            this.c.c();
            abks abks = this.e;
            aaml abku = new abku(abks.c, abks.d.c());
            abku.a = aali.b(str);
            abku.a(apxu.b);
            abks abks2 = this.e;
            abks2.a.a(abku, new hka(this, apxu, map));
        }
    }
}
