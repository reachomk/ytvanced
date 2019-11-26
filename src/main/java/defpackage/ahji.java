package defpackage;

import android.content.Context;

/* renamed from: ahji */
public final class ahji implements baqa {
    private final bcaa a;
    private final bcaa b;

    private ahji(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static ahji a(bcaa bcaa, bcaa bcaa2) {
        return new ahji(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new ahjg((Context) this.a.get(), (zzl) this.b.get());
    }
}
