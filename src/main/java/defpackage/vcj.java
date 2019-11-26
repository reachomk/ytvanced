package defpackage;

import android.content.Context;

/* renamed from: vcj */
public final class vcj implements baqa {
    private final bcaa a;
    private final bcaa b;

    private vcj(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static vcj a(bcaa bcaa, bcaa bcaa2) {
        return new vcj(bcaa, bcaa2);
    }

    public static amro a(tax tax, Context context) {
        return (amro) baqd.a(new vby(tax, context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return vcj.a((tax) this.a.get(), (Context) this.b.get());
    }
}
