package defpackage;

import android.os.Handler;

/* renamed from: aizf */
public final class aizf implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    private aizf(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
    }

    public static aizf a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        return new aizf(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7);
    }

    public final /* synthetic */ Object get() {
        aiyx aiyx = (aiyx) this.a.get();
        ahhq ahhq = (ahhq) this.b.get();
        Handler handler = (Handler) this.c.get();
        this.d.get();
        return new aiyw(aiyx, ahhq, handler, (bctz) this.e.get(), (bctz) this.f.get(), (ajbp) this.g.get());
    }
}
