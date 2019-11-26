package defpackage;

import java.io.InputStream;

/* renamed from: btk */
public final class btk implements bsx {
    private final ccl a;

    btk(InputStream inputStream, bwb bwb) {
        this.a = new ccl(inputStream, bwb);
        this.a.mark(5242880);
    }

    public final void b() {
        this.a.b();
    }

    public final /* synthetic */ Object a() {
        this.a.reset();
        return this.a;
    }
}
