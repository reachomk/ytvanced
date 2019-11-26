package defpackage;

import java.text.Collator;
import java.util.Comparator;

/* renamed from: aldy */
final /* synthetic */ class aldy implements Comparator {
    private final Collator a;

    aldy(Collator collator) {
        this.a = collator;
    }

    public final int compare(Object obj, Object obj2) {
        return this.a.compare(((alpe) obj).b.toString(), ((alpe) obj2).b.toString());
    }
}
