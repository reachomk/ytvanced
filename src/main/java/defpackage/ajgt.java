package defpackage;

import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: ajgt */
public final class ajgt extends afmf implements ajgv {
    private final wyi f;
    private final afsk g;
    private final afsk h = a(a(new ajgx(this.e), new afno()));

    public ajgt(Executor executor, xgq xgq, xwk xwk, File file, xsc xsc, wyi wyi) {
        super(executor, xgq, xwk, file.getAbsolutePath(), xsc);
        this.f = wyi;
        ajgx ajgx = new ajgx(this.e);
        this.g = a(this.f, a(a(ajgx, ajgx)), 7200000);
    }

    public final void a(ajgu ajgu, wxg wxg) {
        amqw.a((Object) ajgu);
        xvd.a(ajgu.a.d);
        this.g.a(ajgu, wxg);
    }

    public final void b(ajgu ajgu, wxg wxg) {
        amqw.a((Object) ajgu);
        xvd.a(ajgu.a.d);
        this.h.a(ajgu, wxg);
    }
}
