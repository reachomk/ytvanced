package defpackage;

/* renamed from: uzh */
final class uzh implements afqd {
    private final /* synthetic */ uzf b;

    uzh(uzf uzf) {
        this.b = uzf;
    }

    public final void a() {
        uzf uzf = this.b;
        if (uzf.b) {
            uzf.b = false;
        }
    }

    public final void b() {
        this.b.b();
    }

    public final void a(Exception exception) {
        this.b.c();
        String localizedMessage = exception.getLocalizedMessage();
        if (localizedMessage != null) {
            this.b.a.a(localizedMessage);
        }
    }
}
