package defpackage;

import android.content.ContentResolver;

/* renamed from: xtj */
public final class xtj implements baqa {
    private final bcaa a;
    private final bcaa b;

    private xtj(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static xtj a(bcaa bcaa, bcaa bcaa2) {
        return new xtj(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new xti((ContentResolver) this.a.get(), (String) this.b.get());
    }
}
