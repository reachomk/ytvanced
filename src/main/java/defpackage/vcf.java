package defpackage;

import java.util.concurrent.Executor;

/* renamed from: vcf */
public final class vcf implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;

    private vcf(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
    }

    public static vcf a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        return new vcf(bcaa, bcaa2, bcaa3);
    }

    public static vem a(Executor executor, abka abka, vuv vuv) {
        return (vem) baqd.a(new vem(executor, abka, vuv), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return vcf.a((Executor) this.a.get(), (abka) this.b.get(), (vuv) this.c.get());
    }
}
