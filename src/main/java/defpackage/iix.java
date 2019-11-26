package defpackage;

import android.widget.ImageView;

/* renamed from: iix */
final /* synthetic */ class iix implements xqf {
    private final iiv a;

    iix(iiv iiv) {
        this.a = iiv;
    }

    public final void a(int i, xqc xqc) {
        iiv iiv = this.a;
        if (i == 2) {
            arnu arnu = iiv.d;
            if (arnu != null) {
                iiv.a.a(new acvs(arnu.d.d()), null);
                ImageView imageView = iiv.b.a;
                if (imageView != null && imageView.getVisibility() == 0) {
                    iiv.a.a(new acvs(acwc.FULLSCREEN_ENGAGEMENT_EXPLICIT_CLOSE_BUTTON), null);
                }
            }
        }
        iiv.a(i, iiv.e);
    }
}
