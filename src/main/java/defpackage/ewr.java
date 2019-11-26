package defpackage;

import android.os.Handler;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ewr */
public final class ewr implements afsw, exv {
    public final acum a;
    public final Handler b;
    public final ablj c;
    public ewv d;
    public final Set e = new HashSet();
    private final fcj f;
    private final albh g;
    private final ewx h;
    private final addo i;
    private final addr j = new ewu(this);
    private final ewy k = new ewy(this);
    private albg l;

    public ewr(acum acum, fcj fcj, Handler handler, albh albh, ewx ewx, addo addo, ablj ablj) {
        this.a = acum;
        this.f = fcj;
        this.b = handler;
        this.g = albh;
        this.h = ewx;
        this.i = addo;
        this.c = ablj;
    }

    public final void a() {
        xak.a();
        this.i.a(this.j, false);
    }

    public final void b() {
        xak.a();
        this.i.a(this.j);
    }

    public final void c() {
        albg albg = this.l;
        if (albg != null) {
            this.g.a(albg);
        }
    }

    public final void a(bqn bqn) {
        String.valueOf(bqn).length();
        a("offerDetailsError");
        aupy aupy = (aupy) aupv.d.createBuilder();
        aupy.a(10);
        ewv ewv = this.d;
        if (ewv != null) {
            aupy.a(ewv.c);
        }
        asmz asmz = (asmz) asmw.f.createBuilder();
        asmz.copyOnWrite();
        asmw asmw = (asmw) asmz.instance;
        asmw.c = (anxl) aupy.build();
        asmw.b = 146;
        this.a.a((asmw) ((anxl) asmz.build()));
        this.d = null;
    }

    public final void a(String str) {
        ewv ewv = this.d;
        if (ewv != null) {
            adjb adjb = ewv.a;
            if (adjb != null) {
                ewx ewx = this.h;
                ewx.b.b(new exa(((aebh) ewx.c.get()).c, str, (String) amqw.a(adjb.a)));
                return;
            }
        }
        str = String.valueOf(str);
        String str2 = "Failed to update progress for event: ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str2.concat(str);
        }
    }
}
