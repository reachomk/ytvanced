package defpackage;

/* renamed from: acgd */
final class acgd implements afsw {
    private final /* synthetic */ acfn a;
    private final /* synthetic */ acfo b;

    acgd(acfo acfo, acfn acfn) {
        this.b = acfo;
        this.a = acfn;
    }

    public final void a(bqn bqn) {
        String valueOf = String.valueOf(acfo.a(bqn));
        String str = "Error starting broadcast: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        xtl.c(valueOf);
        acef.a().a(8, 1, bqn);
        a();
    }

    private final void a() {
        a(1, true, 500);
    }

    private final void a(int i, boolean z, long j) {
        this.b.b.post(new acgf(this.a, i, z, j));
    }
}
