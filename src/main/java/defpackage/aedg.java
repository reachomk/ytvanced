package defpackage;

import java.io.File;

/* renamed from: aedg */
public final class aedg implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aedg(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aedg a(bcaa bcaa, bcaa bcaa2) {
        return new aedg(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return aecv.a((aefg) this.a.get(), (File) this.b.get());
    }
}
