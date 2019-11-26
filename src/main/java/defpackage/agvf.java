package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agvf */
public final class agvf extends aaml {
    public final List a = new ArrayList();
    public final List b = new ArrayList();

    protected agvf(aamd aamd, afpt afpt) {
        super("offline", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = this.a.size() > 0 || this.b.size() > 0;
        amqw.b(z);
        amqw.b(true);
    }

    public final /* synthetic */ anzd c() {
        atat atat = (atat) atau.f.createBuilder();
        List list = this.a;
        atat.copyOnWrite();
        atau atau = (atau) atat.instance;
        if (!atau.c.a()) {
            atau.c = anxl.mutableCopy(atau.c);
        }
        anvf.addAll(list, atau.c);
        list = this.b;
        atat.copyOnWrite();
        atau = (atau) atat.instance;
        if (!atau.d.a()) {
            atau.d = anxl.mutableCopy(atau.d);
        }
        anvf.addAll(list, atau.d);
        atat.copyOnWrite();
        atau atau2 = (atau) atat.instance;
        atau2.a |= 2;
        atau2.e = false;
        return atat;
    }
}
