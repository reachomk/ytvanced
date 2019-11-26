package defpackage;

/* renamed from: aavo */
public final class aavo extends aamz {
    public aavo(aamd aamd, afpt afpt, int i) {
        asyj asyj = (asyj) asyk.d.createBuilder();
        asyj.copyOnWrite();
        asyk asyk = (asyk) asyj.instance;
        if (i != 0) {
            asyk.a |= 2;
            asyk.c = i - 1;
            super(aamd, afpt, "mobiledataplan/get_mobile_data_plan_api_config", asyj);
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }
}
