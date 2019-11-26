package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: aaio */
final class aaio extends xto {
    aaio(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(aahv.g());
        return Collections.unmodifiableSet(hashSet);
    }
}
