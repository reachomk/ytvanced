package defpackage;

import java.io.File;

/* renamed from: gbv */
final /* synthetic */ class gbv implements xsd {
    private final gbt a;

    gbv(gbt gbt) {
        this.a = gbt;
    }

    public final void a(Object obj) {
        File file = this.a.aj;
        if (file != null) {
            file.delete();
        }
    }
}
