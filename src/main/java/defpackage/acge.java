package defpackage;

/* renamed from: acge */
final class acge implements afsw {
    private final /* synthetic */ acfm a;
    private final /* synthetic */ acfo b;

    acge(acfo acfo, acfm acfm) {
        this.b = acfo;
        this.a = acfm;
    }

    public final void a(bqn bqn) {
        String valueOf = String.valueOf(acfo.a(bqn));
        String str = "Error stopping broadcast: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        xtl.c(valueOf);
        acef.a().a(9, 1, bqn);
        a(1, null, null);
    }

    private final void a(int i, String str, aqhy aqhy) {
        this.b.b.post(new acgg(this.a, i, str));
    }
}
