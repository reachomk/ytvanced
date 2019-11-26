package defpackage;

import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: vzu */
public final class vzu extends vzs {
    public boolean a;
    private final akyy f;
    private final acvx g;
    private int h;
    private int i;

    public vzu(akyy akyy, acvx acvx) {
        super(vxg.a().a());
        this.f = (akyy) amqw.a((Object) akyy);
        this.g = (acvx) amqw.a((Object) acvx);
    }

    public final void a() {
        this.h = ((TextView) this.c).getResources().getDimensionPixelSize(R.dimen.ad_reengagement_default_bottom_margin);
        this.i = ((TextView) this.c).getResources().getDimensionPixelSize(R.dimen.ad_reengagement_cta_bottom_margin);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(Object obj, boolean z) {
        vxg vxg = (vxg) obj;
        if (vxg.d() && !((vxg) this.b).d()) {
            this.f.a(vxg.c(), this.g);
        }
        this.f.a(vxg.d());
        boolean f = ((vxg) this.b).f();
        boolean f2 = vxg.f();
        boolean e = ((vxg) this.b).e();
        boolean e2 = vxg.e();
        int i = 0;
        Object obj2 = (z && vxg.d() && !this.a) ? 1 : null;
        if (!(obj2 == null || (f == f2 && e == e2))) {
            f = vxg.f();
            f2 = vxg.g();
            boolean e3 = vxg.e();
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) ((TextView) this.c).getLayoutParams();
            if (f || (f2 && e3)) {
                marginLayoutParams.bottomMargin = this.i;
            } else {
                marginLayoutParams.bottomMargin = this.h;
            }
            ((TextView) this.c).setLayoutParams(marginLayoutParams);
        }
        TextView textView = (TextView) this.c;
        if (obj2 == null) {
            i = 8;
        }
        textView.setVisibility(i);
    }
}
