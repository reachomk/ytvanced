package defpackage;

/* renamed from: acfx */
final class acfx implements afsw {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ acfg b;
    private final /* synthetic */ acfo c;

    acfx(acfo acfo, boolean z, acfg acfg) {
        this.c = acfo;
        this.a = z;
        this.b = acfg;
    }

    public final void a(bqn bqn) {
        String valueOf = String.valueOf(acfo.a(bqn));
        String str = "Error creating ingestion: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        xtl.c(valueOf);
        acef.a().a(5, 1, bqn);
        a();
    }

    private final void a() {
        this.c.b.post(new acfz(this.b));
    }
}
