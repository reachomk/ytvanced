package defpackage;

/* renamed from: aatv */
public final class aatv extends aamz {
    public aatv(aamd aamd, afpt afpt, String str) {
        asre asre = (asre) asrb.e.createBuilder();
        asre.copyOnWrite();
        asrb asrb = (asrb) asre.instance;
        if (str != null) {
            asrb.a |= 2;
            asrb.c = str;
            asre.copyOnWrite();
            asrb asrb2 = (asrb) asre.instance;
            asrb2.a |= 4;
            asrb2.d = true;
            super(aamd, afpt, "conversation/get_invite_link", asre);
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(((asrb) ((asre) c()).instance).c);
    }
}
