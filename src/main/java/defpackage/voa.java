package defpackage;

import android.content.Context;

/* renamed from: voa */
public final class voa implements baqa {
    private final bcaa a;
    private final bcaa b;

    private voa(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static voa a(bcaa bcaa, bcaa bcaa2) {
        return new voa(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new vny((Context) this.a.get(), (tax) this.b.get());
    }
}
