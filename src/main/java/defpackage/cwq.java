package defpackage;

/* renamed from: cwq */
final class cwq extends crl {
    private final /* synthetic */ cwo b;

    cwq(cwo cwo, Throwable th) {
        this.b = cwo;
        super(th);
    }

    public final void a(Throwable th) {
        cwo cwo = this.b;
        try {
            cwo.a();
        } catch (IndexOutOfBoundsException e) {
            String valueOf = String.valueOf(cwo.a(cwo));
            String valueOf2 = String.valueOf(e.getMessage());
            throw new RuntimeException(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2), e);
        }
    }
}
