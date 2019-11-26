package defpackage;

import java.io.IOException;

/* renamed from: adan */
final class adan implements aebm {
    private final /* synthetic */ aebm a;
    private final /* synthetic */ adal b;

    adan(adal adal, aebm aebm) {
        this.b = adal;
        this.a = aebm;
    }

    public final void a(xho xho) {
        if (xho.b() == 200) {
            adal adal = this.b;
            adal.b++;
        }
        this.a.a(xho);
    }

    public final void a(IOException iOException) {
        this.a.a(iOException);
    }
}
