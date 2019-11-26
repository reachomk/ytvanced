package defpackage;

import android.content.Context;
import android.os.Handler;

/* renamed from: ajlk */
public final class ajlk implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;
    private final bcaa e;
    private final bcaa f;
    private final bcaa g;

    private ajlk(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
        this.e = bcaa5;
        this.f = bcaa6;
        this.g = bcaa7;
    }

    public static ajlk a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7) {
        return new ajlk(bcaa, bcaa2, bcaa3, bcaa4, bcaa5, bcaa6, bcaa7);
    }

    public final /* synthetic */ Object get() {
        return new ajlg((Context) this.a.get(), (Handler) this.b.get(), this.c, (ajkp) this.d.get(), this.e, (Class) this.f.get(), (ajlh) this.g.get());
    }
}
