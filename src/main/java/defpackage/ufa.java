package defpackage;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: ufa */
final class ufa extends LinkedHashMap {
    private final /* synthetic */ ufb a;

    ufa(ufb ufb) {
        this.a = ufb;
        super(134, 0.75f, true);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean removeEldestEntry(Entry entry) {
        return size() > this.a.a;
    }
}
