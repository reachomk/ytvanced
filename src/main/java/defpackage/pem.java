package defpackage;

import java.util.HashMap;

/* renamed from: pem */
public final class pem extends pgt {
    public String a;
    public String b;
    public String c;
    public String d;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.a);
        hashMap.put("appVersion", this.b);
        hashMap.put("appId", this.c);
        hashMap.put("appInstallerId", this.d);
        return pgt.a(hashMap, 0);
    }
}
