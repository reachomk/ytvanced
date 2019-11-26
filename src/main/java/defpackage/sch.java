package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;

/* renamed from: sch */
final class sch extends sdc {
    private final /* synthetic */ Uri a;
    private final /* synthetic */ scf b;

    sch(scf scf, int i, int i2, Uri uri) {
        this.b = scf;
        this.a = uri;
        super(i, i2);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            this.b.af = new scp();
            scp scp = this.b.af;
            scp.a = bitmap;
            scp.b = this.a;
            if (!isCancelled()) {
                this.b.ac.a(bitmap);
            }
        }
        scf scf = this.b;
        if (this == scf.ad) {
            scf.ad = null;
        }
    }
}
