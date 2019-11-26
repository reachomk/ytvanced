package defpackage;

/* renamed from: aaud */
public final class aaud extends aamz {
    public aaud(aamd aamd, afpt afpt, String str, String str2) {
        athj athj = (athj) athk.e.createBuilder();
        athj.copyOnWrite();
        athk athk = (athk) athj.instance;
        if (str != null) {
            athk.a |= 2;
            athk.c = str;
            athj.copyOnWrite();
            athk athk2 = (athk) athj.instance;
            if (str2 != null) {
                athk2.a |= 4;
                athk2.d = str2;
                super(aamd, afpt, "connections/email_invite", athj);
                return;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(((athk) ((athj) c()).instance).c);
    }
}
