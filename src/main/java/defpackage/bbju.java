package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* renamed from: bbju */
public abstract class bbju {
    public abstract Iterator a();

    public final String toString() {
        return "TagContext";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bbju)) {
            return false;
        }
        bbju bbju = (bbju) obj;
        Iterator a = a();
        Iterator a2 = bbju.a();
        HashMap hashMap = new HashMap();
        while (a != null && a.hasNext()) {
            bbjr bbjr = (bbjr) a.next();
            if (hashMap.containsKey(bbjr)) {
                hashMap.put(bbjr, Integer.valueOf(((Integer) hashMap.get(bbjr)).intValue() + 1));
            } else {
                hashMap.put(bbjr, Integer.valueOf(1));
            }
        }
        while (a2 != null && a2.hasNext()) {
            bbjr bbjr2 = (bbjr) a2.next();
            if (!hashMap.containsKey(bbjr2)) {
                return false;
            }
            int intValue = ((Integer) hashMap.get(bbjr2)).intValue();
            if (intValue > 1) {
                hashMap.put(bbjr2, Integer.valueOf(intValue - 1));
            } else {
                hashMap.remove(bbjr2);
            }
        }
        return hashMap.isEmpty();
    }

    public final int hashCode() {
        Iterator a = a();
        int i = 0;
        if (a != null) {
            while (a.hasNext()) {
                bbjr bbjr = (bbjr) a.next();
                if (bbjr != null) {
                    i += bbjr.hashCode();
                }
            }
        }
        return i;
    }
}
