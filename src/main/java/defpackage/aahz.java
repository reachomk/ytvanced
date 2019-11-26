package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: aahz */
final class aahz extends xto {
    aahz(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aahv.Y));
        hashSet.add(Integer.valueOf(aahv.Z));
        hashSet.add(Integer.valueOf(aahv.aa));
        return Collections.unmodifiableSet(hashSet);
    }
}
