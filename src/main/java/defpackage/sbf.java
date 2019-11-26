package defpackage;

import android.graphics.Bitmap;

/* renamed from: sbf */
final class sbf extends sdc {
    private final /* synthetic */ sap a;

    sbf(sap sap, int i, int i2) {
        this.a = sap;
        super(i, i2);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        wq wqVar = this.a.D;
        if (wqVar != null) {
            vl vlVar;
            vj b = wqVar.b.b();
            if (b == null) {
                vlVar = new vl();
            } else {
                vlVar = new vl(b);
            }
            wq wqVar2 = this.a.D;
            vlVar.a("android.media.metadata.ART", bitmap);
            wqVar2.a(vlVar.a());
        }
        this.a.z = null;
    }
}
