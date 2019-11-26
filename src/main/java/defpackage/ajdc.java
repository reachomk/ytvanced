package defpackage;

import android.os.Handler;
import java.security.SecureRandom;
import java.util.concurrent.Executor;

/* renamed from: ajdc */
public final class ajdc implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    private ajdc(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
    }

    public static ajdc a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        return new ajdc(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7);
    }

    public final /* synthetic */ Object get() {
        return new ajcz((xsc) this.a.get(), (Executor) this.b.get(), (Handler) this.c.get(), (SecureRandom) this.d.get(), (aayd) this.e.get(), (String) this.f.get(), (ahhq) this.g.get());
    }
}
