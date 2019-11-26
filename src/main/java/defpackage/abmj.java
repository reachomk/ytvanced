package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: abmj */
public final class abmj {
    public static asic a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            anwf a = anwf.a(bArr);
            for (int a2 = a.a(); a2 != 0; a2 = a.a()) {
                if (aobj.b(a2) == 1) {
                    return (asic) a.a(asic.k, anxa.c());
                }
                a.b(a2);
            }
            return null;
        } catch (IOException e) {
            throw new anyg(e.getMessage());
        }
    }

    public static bpz a(byte[] bArr, asic asic) {
        return abmj.a(bArr, Collections.emptyMap(), asic);
    }

    public static bpz a(byte[] bArr, Map map, asic asic) {
        if (bArr == null || asic == null || asic.e == 0) {
            return null;
        }
        long currentTimeMillis = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis((long) asic.e);
        bpz bpz = new bpz();
        bpz.a = bArr;
        bpz.f = currentTimeMillis;
        bpz.e = currentTimeMillis;
        bpz.c = 0;
        if (map == null) {
            map = Collections.emptyMap();
        }
        bpz.g = map;
        return bpz;
    }

    public static int a() {
        return ((int) Runtime.getRuntime().totalMemory()) / 16;
    }
}
