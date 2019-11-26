package defpackage;

/* renamed from: vob */
final class vob implements Runnable {
    private final /* synthetic */ vny a;

    vob(vny vny) {
        this.a = vny;
    }

    public final void run() {
        try {
            vny vny = this.a;
            vny.c = vny.b.a(vny.a).a();
        } catch (Exception e) {
            xtl.a("Failed to get advertising id", e);
        }
    }
}
