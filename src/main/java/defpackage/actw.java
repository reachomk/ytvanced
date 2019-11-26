package defpackage;

import java.util.concurrent.Executor;

/* renamed from: actw */
public final class actw implements baqa {
    private final bcaa a;

    private actw(bcaa bcaa) {
        this.a = bcaa;
    }

    public static actw a(bcaa bcaa) {
        return new actw(bcaa);
    }

    public static Executor a(Executor executor) {
        return (Executor) baqd.a(ankc.a(executor), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return actw.a((Executor) this.a.get());
    }
}
