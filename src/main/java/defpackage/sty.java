package defpackage;

import com.youtube.android.libraries.elements.templates.EkoProcessor;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: sty */
final class sty extends LinkedHashMap {
    private final /* synthetic */ int a;

    sty(int i, int i2) {
        this.a = i2;
        super(i, 0.75f, true);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean removeEldestEntry(Entry entry) {
        if (size() <= this.a) {
            return false;
        }
        ((EkoProcessor) entry.getValue()).finalize();
        return true;
    }
}
