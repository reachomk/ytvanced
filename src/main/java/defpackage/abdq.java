package defpackage;

/* renamed from: abdq */
public final class abdq extends aamz {
    public abdq(aamd aamd, afpt afpt, String str) {
        xvd.a(str);
        aszh aszh = (aszh) aszi.d.createBuilder();
        aszh.copyOnWrite();
        aszi aszi = (aszi) aszh.instance;
        if (str != null) {
            aszi.a |= 2;
            aszi.c = str;
            super(aamd, afpt, "notification/add_upcoming_event_reminder", aszh);
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }
}
