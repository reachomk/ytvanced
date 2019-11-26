package defpackage;

/* renamed from: aatl */
public final class aatl extends aamz {
    public aatl(aamd aamd, afpt afpt, String str) {
        asoc asoc = (asoc) asod.d.createBuilder();
        asoc.copyOnWrite();
        asod asod = (asod) asoc.instance;
        if (str != null) {
            asod.a |= 2;
            asod.c = str;
            super(aamd, afpt, "connections/find_email_user", asoc);
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(((asod) ((asoc) c()).instance).c);
    }
}
