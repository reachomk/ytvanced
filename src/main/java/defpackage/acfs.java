package defpackage;

/* renamed from: acfs */
final class acfs implements afsw {
    private final /* synthetic */ acfh a;
    private final /* synthetic */ acfo b;

    acfs(acfo acfo, acfh acfh) {
        this.b = acfo;
        this.a = acfh;
    }

    public final void a(bqn bqn) {
        String valueOf = String.valueOf(acfo.a(bqn));
        String str = "Error creating broadcast: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        xtl.c(valueOf);
        acef.a().a(4, 1, bqn);
        a(1, null, null);
    }

    private final void a(int i, String str, aqhy aqhy) {
        this.b.b.post(new acfu(this.a, i, str, aqhy));
    }
}
