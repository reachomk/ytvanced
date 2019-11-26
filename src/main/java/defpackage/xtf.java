package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: xtf */
public final class xtf implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    private xtf(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
    }

    public static xtf a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        return new xtf(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7);
    }

    public final /* synthetic */ Object get() {
        return new xtb(((Boolean) this.a.get()).booleanValue(), this.b, (Context) this.c.get(), (Executor) this.d.get(), (tem) this.e.get(), (tnl) this.f.get(), (xax) this.g.get());
    }
}
