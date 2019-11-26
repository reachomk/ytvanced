package defpackage;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: jak */
public final class jak implements Comparator {
    private final /* synthetic */ Collator a;

    public jak(Collator collator) {
        this.a = collator;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return this.a.compare((CharSequence) obj, (CharSequence) obj2);
    }
}
