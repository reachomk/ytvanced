package defpackage;

import java.util.concurrent.Executor;

/* renamed from: xix */
public final class xix implements xgu {
    private final bcaa a;
    private final xiy b;

    public xix(bcaa bcaa, bcaa bcaa2, boolean z, bcaa bcaa3, xax xax) {
        xin xin = new xin();
        if (bcaa != null) {
            xin.a = bcaa;
            if (bcaa2 != null) {
                xin.b = bcaa2;
                this.b = (xiy) ((xiy) ((xiy) xin.a(z)).a(xax)).b(bcaa3);
                this.a = bcaa;
                return;
            }
            throw new NullPointerException("Null uriRewriter");
        }
        throw new NullPointerException("Null cronetEngineProvider");
    }

    public final void a(Executor executor) {
        bcaa bcaa = this.a;
        bcaa.getClass();
        executor.execute(new xja(bcaa));
    }
}
