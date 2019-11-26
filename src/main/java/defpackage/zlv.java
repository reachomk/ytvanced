package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.libraries.youtube.edit.ui.RoundedCornersEditText;

/* renamed from: zlv */
public final /* synthetic */ class zlv implements zkv {
    private final zlw a;
    private final Activity b;
    private final badj c;
    private final bacy d;
    private final Bitmap e;
    private final RoundedCornersEditText f;
    private final zma g;

    public zlv(zlw zlw, Activity activity, badj badj, bacy bacy, Bitmap bitmap, RoundedCornersEditText roundedCornersEditText, zma zma) {
        this.a = zlw;
        this.b = activity;
        this.c = badj;
        this.d = bacy;
        this.e = bitmap;
        this.f = roundedCornersEditText;
        this.g = zma;
    }

    public final void a(zme zme) {
        zlw zlw = this.a;
        Activity activity = this.b;
        badj badj = this.c;
        bacy bacy = this.d;
        Bitmap bitmap = this.e;
        RoundedCornersEditText roundedCornersEditText = this.f;
        zma zma = this.g;
        if (!activity.isFinishing() && !activity.isDestroyed()) {
            baat baat = (baat) baao.c.createBuilder();
            baat.a(zme.b);
            badj.copyOnWrite();
            badg badg = (badg) badj.instance;
            badg.f = (baao) ((anxl) baat.build());
            badg.a |= 128;
            bacw bacw = (bacw) ((anxo) bacy.b().toBuilder());
            bacw.a(badj);
            bacy.a(bacw);
            bacy.a(zme.c);
            bacy.b(zme.d);
            zlw.b.a((bacz) ((anxl) bacy.build()));
            bitmap.recycle();
            roundedCornersEditText.setDrawingCacheEnabled(false);
            zma.a();
        }
    }
}
