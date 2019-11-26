package defpackage;

import java.util.HashMap;

/* renamed from: baqx */
final class baqx extends HashMap {
    private final /* synthetic */ baqy a;

    baqx(baqy baqy) {
        this.a = baqy;
    }

    public final /* synthetic */ Object put(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        this.a.b.put(str != null ? str.toLowerCase() : str, str2);
        return (String) super.put(str, str2);
    }
}
