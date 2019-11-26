package defpackage;

/* renamed from: abdt */
public final class abdt extends aaml {
    public abdt(aamd aamd, afpt afpt) {
        super("notification/get_notifications", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        aszn aszn = (aszn) aszo.e.createBuilder();
        aszn.copyOnWrite();
        aszo aszo = (aszo) aszn.instance;
        aszo.a |= 4;
        aszo.c = true;
        aszn.copyOnWrite();
        aszo = (aszo) aszn.instance;
        aszo.a |= 32;
        aszo.d = 0;
        return aszn;
    }
}
