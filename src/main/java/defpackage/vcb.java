package defpackage;

import android.content.Context;

/* renamed from: vcb */
public final class vcb implements baqa {
    private final bcaa a;

    private vcb(bcaa bcaa) {
        this.a = bcaa;
    }

    public static vcb a(bcaa bcaa) {
        return new vcb(bcaa);
    }

    public static tpr a(Context context) {
        return (tpr) baqd.a(new tpr(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return vcb.a((Context) this.a.get());
    }
}
