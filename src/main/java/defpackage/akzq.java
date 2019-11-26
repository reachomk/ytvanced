package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: akzq */
final class akzq implements cye {
    private final akpd a;
    private final int b;

    akzq(akpd akpd, int i) {
        this.a = akpd;
        this.b = i;
    }

    public final View a(ViewGroup viewGroup) {
        akot d = this.a.d(viewGroup, this.b);
        View K_ = d.K_();
        K_.setTag(R.id.litho_presenter_tag, d);
        return K_;
    }
}
