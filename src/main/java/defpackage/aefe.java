package defpackage;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: aefe */
final class aefe extends LinkedHashMap {
    private final /* synthetic */ int a = 5;

    aefe() {
        super(5, 0.75f, true);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean removeEldestEntry(Entry entry) {
        return size() > this.a;
    }
}
