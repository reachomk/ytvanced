package defpackage;

/* renamed from: aati */
public final class aati extends aamz {
    public aati(aamd aamd, afpt afpt, String str) {
        asml asml = (asml) asmi.d.createBuilder();
        str = xvd.a(str);
        asml.copyOnWrite();
        asmi asmi = (asmi) asml.instance;
        if (str != null) {
            asmi.a |= 2;
            asmi.c = str;
            super(aamd, afpt, "connections/edit_non_gaia", asml);
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }
}
