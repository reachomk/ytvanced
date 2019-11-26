package defpackage;

/* renamed from: aate */
public final class aate extends aamz {
    public aate(aamd aamd, afpt afpt, String str, Boolean bool) {
        asgm asgm = (asgm) asgn.e.createBuilder();
        str = (String) amqw.a((Object) str);
        asgm.copyOnWrite();
        asgn asgn = (asgn) asgm.instance;
        if (str != null) {
            int i = 2;
            asgn.a |= 2;
            asgn.c = str;
            if (bool.booleanValue()) {
                i = 3;
            }
            asgm.copyOnWrite();
            asgn asgn2 = (asgn) asgm.instance;
            asgn2.a |= 8;
            asgn2.d = i - 1;
            super(aamd, afpt, "connections/edit", asgm);
            g();
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }
}
