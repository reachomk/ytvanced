package defpackage;

import java.util.concurrent.Executor;

/* renamed from: aakx */
public final class aakx implements baqa {
    private final bcaa a;
    private final bcaa b;

    private aakx(bcaa bcaa, bcaa bcaa2) {
        this.a = bcaa;
        this.b = bcaa2;
    }

    public static aakx a(bcaa bcaa, bcaa bcaa2) {
        return new aakx(bcaa, bcaa2);
    }

    public final /* synthetic */ Object get() {
        return new aakv((Executor) this.a.get(), (afpi) this.b.get());
    }
}
