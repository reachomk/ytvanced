package defpackage;

import java.util.List;

/* renamed from: aawe */
public final class aawe extends aaml {
    public List a;

    public aawe(aamd aamd, afpt afpt) {
        super("datasync/get", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        List list = this.a;
        boolean z = false;
        if (!(list == null || list.isEmpty())) {
            z = true;
        }
        amqw.a(z);
    }

    public final /* synthetic */ anzd c() {
        askz askz = (askz) askw.d.createBuilder();
        List list = this.a;
        if (list != null) {
            askz.copyOnWrite();
            askw askw = (askw) askz.instance;
            if (!askw.c.a()) {
                askw.c = anxl.mutableCopy(askw.c);
            }
            anvf.addAll(list, askw.c);
        }
        return askz;
    }
}
