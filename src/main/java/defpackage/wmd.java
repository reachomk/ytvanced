package defpackage;

import java.util.List;

/* renamed from: wmd */
public final /* synthetic */ class wmd implements xar {
    private final wmb a;

    public wmd(wmb wmb) {
        this.a = wmb;
    }

    public final void accept(Object obj) {
        wmb wmb = this.a;
        List<amea> list = (List) obj;
        if (wmb.i && wmb.c == null) {
            for (amea amea : list) {
                if (amea.g.equals(wmb.b)) {
                    wmb.c = amea.G;
                    if (!wmb.c.isEmpty()) {
                        wmb.a.a(wmb.c);
                        return;
                    }
                }
            }
        }
    }
}
