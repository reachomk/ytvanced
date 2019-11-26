package defpackage;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: lqy */
final class lqy extends LinkedHashMap {
    private final /* synthetic */ zzl a;

    lqy(int i, zzl zzl) {
        this.a = zzl;
        super(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean removeEldestEntry(Entry entry) {
        return size() > foh.b(this.a);
    }
}
