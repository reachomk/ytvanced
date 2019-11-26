package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* renamed from: wkq */
final class wkq {
    public final ImageView a;
    public int b = 1;
    public int c;
    private final ImageView d;
    private final ProgressBar e;
    private final View f;
    private final int g;

    wkq(ImageView imageView, ImageView imageView2, ProgressBar progressBar, View view, int i) {
        this.a = (ImageView) amqw.a((Object) imageView);
        this.d = (ImageView) amqw.a((Object) imageView2);
        this.e = (ProgressBar) amqw.a((Object) progressBar);
        this.f = (View) amqw.a((Object) view);
        this.g = i;
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.e.getVisibility() == 0;
    }

    /* Access modifiers changed, original: final */
    public final boolean b() {
        return this.b != 1;
    }

    public final void a(int i) {
        this.b = i;
        if (i == 2 || i == 3) {
            this.a.setColorFilter(this.g);
        } else {
            this.a.setColorFilter(null);
        }
        boolean z = false;
        xpr.a(this.a, i != 1);
        View view = this.d;
        boolean z2 = i == 4 || i == 3;
        xpr.a(view, z2);
        xpr.a(this.e, i == 2);
        View view2 = this.f;
        if (i == 3) {
            z = true;
        }
        xpr.a(view2, z);
    }
}
