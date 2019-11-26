package defpackage;

import java.util.List;

/* renamed from: aawi */
public final class aawi extends aaml {
    public List a;

    public aawi(aamd aamd, afpt afpt) {
        super("dismissal/dismiss", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        aslv aslv = (aslv) asls.d.createBuilder();
        List list = this.a;
        aslv.copyOnWrite();
        asls asls = (asls) aslv.instance;
        if (!asls.c.a()) {
            asls.c = anxl.mutableCopy(asls.c);
        }
        anvf.addAll(list, asls.c);
        return aslv;
    }
}
