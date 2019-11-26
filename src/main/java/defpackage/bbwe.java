package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: bbwe */
public final class bbwe extends bbmi {
    private final bbmn a;
    private final long b;
    private final TimeUnit c;

    public bbwe(long j, TimeUnit timeUnit, bbmn bbmn) {
        this.b = j;
        this.c = timeUnit;
        this.a = bbmn;
    }

    public final void a(bbmo bbmo) {
        bbnc bbwd = new bbwd(bbmo);
        bbmo.a(bbwd);
        bbnz.d(bbwd, this.a.a(bbwd, this.b, this.c));
    }
}
