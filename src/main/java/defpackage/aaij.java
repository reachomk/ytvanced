package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: aaij */
final class aaij extends xto {
    aaij(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aahv.u));
        hashSet.add(Integer.valueOf(aahv.v));
        hashSet.add(Integer.valueOf(aahv.w));
        return Collections.unmodifiableSet(hashSet);
    }
}
