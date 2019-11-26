package defpackage;

import android.content.Context;

/* renamed from: aguw */
public final class aguw extends aanf {
    private final String a;
    private final afpu b;
    private final aguv g;

    public aguw(Context context, aamf aamf, aamd aamd, afpu afpu, xhf xhf) {
        super(aamd, afpu, xhf);
        this.a = xvd.a(xsl.a(context));
        this.b = (afpu) amqw.a((Object) afpu);
        this.g = new aguv(this, aamf);
    }

    public final atci a(agva agva) {
        return (atci) this.g.b(agva);
    }

    public final agva a() {
        agva agva = new agva(this.c, this.b.c());
        agva.j = this.a;
        return agva;
    }
}
