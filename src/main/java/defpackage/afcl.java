package defpackage;

import java.util.Collections;
import java.util.concurrent.Future;

/* renamed from: afcl */
final class afcl implements aekb {
    private final /* synthetic */ aajs a;
    private final /* synthetic */ affa b;
    private final /* synthetic */ String c;
    private final /* synthetic */ aajj d;
    private final /* synthetic */ afbo e;

    afcl(afbo afbo, aajs aajs, affa affa, String str, aajj aajj) {
        this.e = afbo;
        this.a = aajs;
        this.b = affa;
        this.c = str;
        this.d = aajj;
    }

    public final void a(aaiz aaiz) {
        this.e.a(this.a.a(Collections.emptyList(), Collections.emptyList(), aaiz), this.b, this.c, this.d);
        afbo afbo = this.e;
        if (afbo.A != null) {
            afbo.A = null;
        }
    }

    public final void a(Exception exception) {
        Future future = this.e.A;
        if (future != null) {
            future.cancel(true);
            this.e.A = null;
        }
        afbo afbo = this.e;
        afbo.a(new afif(5, "net.connect", afbo.o(), exception).f());
    }
}
