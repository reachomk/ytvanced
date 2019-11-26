package defpackage;

import android.graphics.Bitmap;

/* renamed from: sbh */
final class sbh extends sdc {
    private final /* synthetic */ sap a;

    sbh(sap sap) {
        this.a = sap;
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
            vlVar.a("android.media.metadata.DISPLAY_ICON", bitmap);
            wqVar2.a(vlVar.a());
        }
        this.a.A = null;
    }
}
