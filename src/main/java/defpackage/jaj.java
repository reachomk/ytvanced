package defpackage;

import java.util.Comparator;

/* renamed from: jaj */
public final class jaj implements Comparator {
    private final /* synthetic */ Comparator a;
    private final /* synthetic */ zj b;

    public jaj(Comparator comparator, zj zjVar) {
        this.a = comparator;
        this.b = zjVar;
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return this.a.compare((CharSequence) this.b.get((CharSequence) obj), (CharSequence) this.b.get((CharSequence) obj2));
    }
}
