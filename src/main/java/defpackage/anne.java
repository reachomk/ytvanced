package defpackage;

/* renamed from: anne */
final /* synthetic */ class anne implements ryh {
    private final annf a;

    anne(annf annf) {
        this.a = annf;
    }

    public final void a(Exception exception) {
        annf annf;
        annf annf2 = this.a;
        synchronized (annf2.c.b) {
            if (annf2.c.b.peek() == annf2) {
                annf2.c.b.remove();
                annc annc = annf2.c;
                annc.c = 0;
                annf = (annf) annc.b.peek();
            } else {
                annf = null;
            }
        }
        annf2.b.b(exception);
        if (annf != null) {
            annf.a();
        }
    }
}
