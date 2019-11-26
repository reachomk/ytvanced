package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: klp */
public final class klp implements esu {
    public final ajqw a;
    public final eso b;
    public final ViewGroup c;
    public CharSequence d;
    public CharSequence e;
    public CharSequence f;
    private final eus g;
    private final TextView h;
    private final TextView i;

    public klp(Context context, est est, eur eur, ViewGroup viewGroup) {
        ajqv a = ajqw.a();
        a.a = context;
        this.a = a.a();
        this.c = viewGroup;
        this.h = (TextView) viewGroup.findViewById(R.id.promo_text);
        this.i = (TextView) viewGroup.findViewById(R.id.promo_text_additional);
        this.g = eur.a(viewGroup.findViewById(R.id.subscription_notification_view));
        this.b = est.a((TextView) viewGroup.findViewById(R.id.subscribe_button), this.g);
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            bhf.a(this.c, null);
        }
        if (z != z2) {
            this.h.setVisibility(8);
            this.i.setVisibility(8);
        } else if (z2) {
            xpr.a(this.h, this.f);
            this.i.setVisibility(8);
        } else {
            xpr.a(this.h, this.d);
            xpr.a(this.i, this.e);
        }
    }

    public final void a(boolean z, boolean z2) {
        a(z, z2, true);
    }
}
