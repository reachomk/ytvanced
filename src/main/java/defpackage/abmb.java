package defpackage;

import java.util.List;

/* renamed from: abmb */
public final class abmb extends aaml {
    public String a = "";
    public List b = null;

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(((atpw) ((anxl) n().build())).c);
    }

    private final atpv n() {
        atpv atpv = (atpv) atpw.e.createBuilder();
        String str = this.a;
        atpv.copyOnWrite();
        atpw atpw = (atpw) atpv.instance;
        if (str != null) {
            atpw.a |= 2;
            atpw.c = str;
            if (this.b != null) {
                azow azow = (azow) azot.b.createBuilder();
                List list = this.b;
                azow.copyOnWrite();
                azot azot = (azot) azow.instance;
                if (!azot.a.a()) {
                    azot.a = anxl.mutableCopy(azot.a);
                }
                anvf.addAll(list, azot.a);
                atpv.copyOnWrite();
                atpw = (atpw) atpv.instance;
                atpw.d = (azot) ((anxl) azow.build());
                atpw.a |= 4;
            }
            return atpv;
        }
        throw new NullPointerException();
    }

    public final /* synthetic */ anzd c() {
        return n();
    }

    public /* synthetic */ abmb(aamd aamd, afpt afpt) {
        super("ypc/cancel_recurrence", aamd, afpt);
    }
}
