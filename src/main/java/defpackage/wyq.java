package defpackage;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: wyq */
final class wyq extends LinkedHashMap {
    private final /* synthetic */ wyr a;

    wyq(wyr wyr, int i) {
        this.a = wyr;
        super(i, 0.75f, true);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean removeEldestEntry(Entry entry) {
        int size = this.a.b.size();
        wyr wyr = this.a;
        if (size > wyr.a) {
            wyr.b(entry.getKey());
        }
        return false;
    }
}
