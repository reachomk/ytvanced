package defpackage;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: kje */
final /* synthetic */ class kje implements OnClickListener {
    private final kjf a;
    private final aphg b;
    private final akor c;
    private final awyk d;

    kje(kjf kjf, aphg aphg, akor akor, awyk awyk) {
        this.a = kjf;
        this.b = aphg;
        this.c = akor;
        this.d = awyk;
    }

    public final void onClick(View view) {
        kjf kjf = this.a;
        aphg aphg = this.b;
        akor akor = this.c;
        awyk awyk = this.d;
        xpr.a(view, false);
        if ((aphg.a & 262144) != 0) {
            akor.a.a(3, new acvs(aphg.r), null);
        }
        kjf.f.b(Integer.MAX_VALUE);
        view = ((ans) kjf.d.n).c(kjf.a(awyk) - 1);
        if (view != null) {
            kjf.d.a((int) view.getX(), 0);
        }
        anxl anxl = awyk.g;
        if (anxl == null) {
            anxl = axak.a;
        }
        kjf.i = anxl.hashCode();
    }
}
