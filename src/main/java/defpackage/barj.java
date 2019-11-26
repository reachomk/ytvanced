package defpackage;

import java.io.OutputStream;

/* renamed from: barj */
final class barj extends baqy {
    private final /* synthetic */ bark f;

    barj(bark bark, baqz baqz) {
        this.f = bark;
        super(baqz, null, null, 0);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(OutputStream outputStream) {
        bark bark = this.f;
        bark.a = outputStream;
        bark.c = 2;
        super.a(outputStream);
        bark bark2 = this.f;
        bark2.c = 3;
        bark2.a();
        this.f.c();
    }
}
