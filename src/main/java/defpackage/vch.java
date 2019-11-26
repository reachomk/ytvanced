package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: vch */
public final class vch implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private vch(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static vch a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new vch(bcaa, bcaa2, bcaa3);
    }

    public static Set a() {
        return (Set) baqd.a(new HashSet(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        this.a.get();
        this.b.get();
        return vch.a();
    }
}
