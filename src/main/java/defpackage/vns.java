package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: vns */
final class vns implements acxz {
    vns() {
    }

    public final /* synthetic */ Map a(Object obj) {
        vpx vpx = (vpx) obj;
        HashMap hashMap = new HashMap();
        int i = vpx.a;
        int i2 = i - 1;
        if (i != 0) {
            String str = "pb_fr";
            if (i2 == 0) {
                hashMap.put(str, "ic");
            } else if (i2 == 1) {
                hashMap.put(str, "ns");
            } else if (i2 == 2) {
                hashMap.put(str, "ioe");
            } else if (i2 == 3) {
                hashMap.put(str, "ie");
            } else if (i2 == 4) {
                hashMap.put(str, "ise");
            }
            return hashMap;
        }
        throw null;
    }
}
