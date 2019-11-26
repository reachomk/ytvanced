package defpackage;

import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.google.android.libraries.youtube.edit.filters.ui.ChooseFilterView;
import com.google.android.youtube.R;

/* renamed from: gbi */
public final class gbi {
    public final boolean a;
    public final acvx b;
    public final atst c = null;
    public final ChooseFilterView d;
    public final ChooseFilterView e;
    public final View f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final ImageView j;
    public final zmm k;
    public final View l;
    public final int m;
    public final int n;
    public final gbo o;
    public final gbo p;
    public final gbo q;
    public final gbp r;
    public boolean s;
    public boolean t;
    public boolean u;

    gbi(ChooseFilterView chooseFilterView, ChooseFilterView chooseFilterView2, zmm zmm, View view, View view2, View view3, ImageView imageView, ImageView imageView2, View view4, acvx acvx) {
        this.d = chooseFilterView;
        this.e = chooseFilterView2;
        this.k = (zmm) amqw.a((Object) zmm);
        this.f = (View) amqw.a((Object) view);
        this.h = (View) amqw.a((Object) view2);
        this.i = imageView;
        this.j = imageView2;
        this.l = view4;
        this.g = view3;
        this.b = (acvx) amqw.a((Object) acvx);
        if (chooseFilterView != null) {
            chooseFilterView.a(new gbl(this));
            chooseFilterView.a(view4);
        }
        if (chooseFilterView2 != null) {
            chooseFilterView2.a(new gbk(this));
            chooseFilterView2.a(view4);
        }
        boolean z = true;
        if (chooseFilterView == null && chooseFilterView2 == null) {
            z = false;
        }
        this.a = z;
        if (z) {
            this.m = (int) view2.getResources().getDimension(R.dimen.reel_circular_progress_camera_record_button_outer_white_ring_height);
            this.n = (int) view2.getResources().getDimension(R.dimen.reel_camera_choose_filter_view_button_padding);
        } else {
            this.m = 0;
            this.n = 0;
        }
        this.q = new gbo(this, view3);
        this.o = new gbo(this, view);
        this.p = new gbo(this, view2);
        this.r = new gbp(this, imageView2);
        zmm.a(new gbn(this));
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.t || this.u;
    }

    /* Access modifiers changed, original: final */
    public final void a(ayza ayza) {
        int ordinal = ayza.ordinal();
        if (ordinal == 1) {
            gbi.a(this.d, true);
            gbi.a(this.e, false);
        } else if (ordinal == 2) {
            gbi.a(this.e, true);
            gbi.a(this.d, false);
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        this.s = z;
        gbi.a(this.d, false);
        gbi.a(this.e, false);
        this.t = false;
        this.u = false;
    }

    private static void a(ChooseFilterView chooseFilterView, boolean z) {
        if (chooseFilterView != null && chooseFilterView.f != z) {
            chooseFilterView.a();
        }
    }

    public final void b() {
        gbm gbm = new gbm(this);
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            gbm.run();
        } else {
            this.f.post(gbm);
        }
    }
}
