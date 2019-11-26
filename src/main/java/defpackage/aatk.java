package defpackage;

/* renamed from: aatk */
public final class aatk extends aamz {
    public aatk(aamd aamd, afpt afpt, String str) {
        asgq asgq = (asgq) asgr.d.createBuilder();
        str = xvd.a(str);
        asgq.copyOnWrite();
        asgr asgr = (asgr) asgq.instance;
        if (str != null) {
            asgr.a |= 2;
            asgr.c = str;
            super(aamd, afpt, "connections/get_add_connection_dialog", asgq);
            g();
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }
}
