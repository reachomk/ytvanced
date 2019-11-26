package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bbth */
public final class bbth extends bbsp {
    private final long b = 1000;
    private final TimeUnit c;
    private final bbmn d;

    public bbth(bbmm bbmm, TimeUnit timeUnit, bbmn bbmn) {
        super(bbmm);
        this.c = timeUnit;
        this.d = bbmn;
    }

    public final void a(bbmo bbmo) {
        this.a.b(new bbtj(new bbzg(bbmo), this.b, this.c, this.d.a()));
    }
}
