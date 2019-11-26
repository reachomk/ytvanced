package defpackage;

/* renamed from: abeo */
public final class abeo extends aamz {
    public abeo(aamd aamd, afpt afpt, String str) {
        xvd.a(str);
        ataf ataf = (ataf) atag.d.createBuilder();
        ataf.copyOnWrite();
        atag atag = (atag) ataf.instance;
        if (str != null) {
            atag.a |= 2;
            atag.c = str;
            super(aamd, afpt, "notification/remove_upcoming_event_reminder", ataf);
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }
}
