package defpackage;

import android.content.Context;

/* renamed from: tfb */
public final class tfb implements baqa {
    private final bcaa a;

    private tfb(bcaa bcaa) {
        this.a = bcaa;
    }

    public static tfb a(bcaa bcaa) {
        return new tfb(bcaa);
    }

    public static teq a(Context context) {
        return (teq) baqd.a(new tfc(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return tfb.a((Context) this.a.get());
    }
}
