package defpackage;

import java.util.Collection;
import java.util.Map;

/* renamed from: sqn */
public final class sqn implements swf {
    private final Collection a;

    public sqn(Map map) {
        this.a = map.values();
    }

    public final bblt a(azsr azsr, swg swg) {
        if (swg == null) {
            swg = skh.g().a();
        }
        for (swd swd : this.a) {
            anxr access$000 = anxl.checkIsLite(swd.a());
            azsr.a(access$000);
            if (azsr.h.a(access$000.d)) {
                anxr access$0002 = anxl.checkIsLite(swd.a());
                azsr.a(access$0002);
                Object b = azsr.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                return swd.a(b, swg);
            }
        }
        String valueOf = String.valueOf(azsr);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 22);
        stringBuilder.append("Unrecognized command: ");
        stringBuilder.append(valueOf);
        return bblt.a(new IllegalStateException(stringBuilder.toString()));
    }

    public final bblt a(byte[] bArr, swg swg) {
        try {
            return a((azsr) anxl.parseFrom(azsr.a, bArr, anxa.c()), swg);
        } catch (anyg e) {
            return bblt.a(e);
        }
    }
}
