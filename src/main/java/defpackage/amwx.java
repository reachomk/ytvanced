package defpackage;

import java.util.Collection;
import java.util.Map.Entry;

/* renamed from: amwx */
final class amwx extends amts {
    private final /* synthetic */ Entry a;
    private final /* synthetic */ amwy b;

    amwx(amwy amwy, Entry entry) {
        this.b = amwy;
        this.a = entry;
    }

    /* Access modifiers changed, original: protected|final */
    public final Entry a() {
        return this.a;
    }

    public final /* synthetic */ Object getValue() {
        return amwt.b((Collection) this.a.getValue(), this.b.a.b);
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ Object d() {
        return this.a;
    }
}
