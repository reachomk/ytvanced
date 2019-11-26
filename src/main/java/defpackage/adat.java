package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: adat */
public final class adat implements adag {
    public bcaa a;
    public bcaa b;
    public xgq c;
    public xgq d;
    public bcaa e;

    public final adbf a(adya adya) {
        HashMap hashMap = new HashMap();
        adim adim = adya.c;
        if (adim != null) {
            hashMap.put("X-YouTube-LoungeId-Token", adim.a);
        }
        String str = ((aebh) this.a.get()).a;
        bcaa bcaa = this.b;
        HashMap hashMap2 = new HashMap((Map) this.e.get());
        if (adya.a()) {
            hashMap2.put("method", adya.a.F);
            if (adya.b()) {
                hashMap2.put("params", adyn.a(adya.b).toString());
            }
        }
        if (adya.d) {
            hashMap2.put("ui", "");
        }
        adix adix = adya.e;
        if (adix != null) {
            hashMap2.put("pairing_type", adix.e);
        }
        return new adal(str, bcaa, hashMap2, hashMap, this.c, this.d);
    }
}
