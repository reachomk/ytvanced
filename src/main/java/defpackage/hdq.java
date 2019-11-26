package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hdq */
public final class hdq extends hdy {
    private View b;
    private View c;
    private View d;
    private TextView e;

    public hdq(Context context, xci xci, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, aigw aigw, vvz vvz, ajam ajam, adqf adqf, zyw zyw) {
        super(context, xci, bcaa, bcaa2, bcaa3, aigw, vvz, ajam, adqf, zyw);
    }

    public final void a(ViewGroup viewGroup) {
        amqw.a((Object) viewGroup);
        this.d = (View) amqw.a(viewGroup.findViewById(R.id.content_thumbnail_view));
        this.e = (TextView) amqw.a((TextView) viewGroup.findViewById(R.id.ad_badge));
        this.c = (View) amqw.a(viewGroup.findViewById(R.id.ad_badge_and_assurance_title));
        this.b = (View) amqw.a(viewGroup.findViewById(R.id.ad_badge_and_subtitle));
        super.a(viewGroup);
    }

    public final void a() {
        super.a();
        this.e = null;
        this.c = null;
        this.b = null;
        this.d = null;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        xpr.a(this.e, z);
    }

    /* Access modifiers changed, original: final */
    public final void b(boolean z) {
        xpr.a(this.b, z ^ 1);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z, boolean z2) {
        View view = this.b;
        boolean z3 = false;
        if (!(z || z2)) {
            z3 = true;
        }
        xpr.a(view, z3);
        xpr.a(this.c, z);
    }

    /* Access modifiers changed, original: final */
    public final void c(boolean z) {
        xpr.a(this.d, z ^ 1);
    }
}
