package defpackage;

import android.content.Context;

/* renamed from: aiuw */
public final class aiuw implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aiuw(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aiuw a(bcaa bcaa, bcaa bcaa2) {
        return new aiuw(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new aiuu((Context) this.a.get(), (aiqf) this.b.get());
    }
}
