package defpackage;

import android.util.SparseArray;

/* renamed from: afle */
public final class afle implements baqa {
    private final bcaa a;

    private afle(bcaa bcaa) {
        this.a = bcaa;
    }

    public static afle a(bcaa bcaa) {
        return new afle(bcaa);
    }

    public static SparseArray a(afmg afmg) {
        return (SparseArray) baqd.a(afmg.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return afle.a((afmg) this.a.get());
    }
}
