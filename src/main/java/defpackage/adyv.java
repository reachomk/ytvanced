package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: adyv */
public final class adyv implements adxy {
    private final adxy a;
    private final List b = new ArrayList();
    private volatile adym c = null;

    public adyv(adxy adxy) {
        this.a = adxy;
    }

    public final synchronized void a(adyu adyu) {
        if (this.c != null) {
            adyu.a_(this.c);
        } else {
            this.b.add(adyu);
        }
    }

    public final synchronized void a() {
        this.c = null;
        this.b.clear();
    }

    public final synchronized void a(adym adym) {
        if (this.b.isEmpty() || !adiv.MDX_SESSION_STATUS.equals(adym.a())) {
            this.a.a(adym);
            return;
        }
        this.c = adym;
        String.format("Found MdxSessionStatus: %s", new Object[]{adym});
        for (adyu a_ : this.b) {
            a_.a_(adym);
        }
    }

    static {
        xtl.b("MDX.transport");
    }
}
