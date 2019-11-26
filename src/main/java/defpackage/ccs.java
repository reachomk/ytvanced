package defpackage;

import android.graphics.Bitmap;
import java.io.IOException;

/* renamed from: ccs */
final class ccs implements ccd {
    private final ccl a;
    private final cho b;

    ccs(ccl ccl, cho cho) {
        this.a = ccl;
        this.b = cho;
    }

    public final void a() {
        this.a.a();
    }

    public final void a(bwd bwd, Bitmap bitmap) {
        IOException iOException = this.b.c;
        if (iOException != null) {
            if (bitmap != null) {
                bwd.a(bitmap);
            }
            throw iOException;
        }
    }
}
