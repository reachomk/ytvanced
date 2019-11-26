package defpackage;

/* renamed from: aatf */
public final class aatf extends aamz {
    public aatf(aamd aamd, afpt afpt, String str) {
        asjo asjo = (asjo) asjp.d.createBuilder();
        asjo.copyOnWrite();
        asjp asjp = (asjp) asjo.instance;
        if (str != null) {
            asjp.a |= 2;
            asjp.c = str;
            super(aamd, afpt, "conversation/create_group", asjo);
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }
}
