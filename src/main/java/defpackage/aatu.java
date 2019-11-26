package defpackage;

import java.util.List;

/* renamed from: aatu */
public final class aatu extends aaml {
    public String a;
    public List b;

    public aatu(aamd aamd, afpt afpt) {
        super("share/get_old_share_panel", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(this.a);
    }

    public final /* synthetic */ anzd c() {
        ased ased = (ased) asea.e.createBuilder();
        String str = this.a;
        ased.copyOnWrite();
        asea asea = (asea) ased.instance;
        if (str != null) {
            asea.a |= 2;
            asea.c = str;
            List list = this.b;
            if (list != null) {
                ased.copyOnWrite();
                asea = (asea) ased.instance;
                if (!asea.d.a()) {
                    asea.d = anxl.mutableCopy(asea.d);
                }
                anvf.addAll(list, asea.d);
            }
            return ased;
        }
        throw new NullPointerException();
    }
}
