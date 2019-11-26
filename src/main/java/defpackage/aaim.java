package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: aaim */
final class aaim extends xto {
    aaim(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll((Collection) aahv.aA.get());
        hashSet.add(Integer.valueOf(aahv.e));
        hashSet.add(Integer.valueOf(aahv.d));
        hashSet.add(Integer.valueOf(aahv.c));
        return Collections.unmodifiableSet(hashSet);
    }
}
