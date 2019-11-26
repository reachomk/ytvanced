package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import com.google.android.libraries.youtube.ads.player.ui.BrandInteractionView;
import com.google.android.youtube.R;
import java.util.Map;

/* renamed from: vzx */
public final class vzx extends vzs implements OnClickListener {
    public wae a;
    public boolean f;
    public boolean g;
    private final Context h;
    private final aaas i;
    private final acvx j;
    private apfy k = null;
    private vzj l;
    private vzj m;
    private aphv n;
    private aphv o;

    public vzx(Context context, aaas aaas, acvx acvx) {
        super(vya.h().a());
        this.h = (Context) amqw.a((Object) context);
        this.i = (aaas) amqw.a((Object) aaas);
        this.j = (acvx) amqw.a((Object) acvx);
    }

    public static boolean a(boolean z, boolean z2) {
        return (z || z2) ? false : true;
    }

    public final void a() {
    }

    private final void a(apfy apfy) {
        this.j.b(new acvs(apfy.g));
        if (apfy.d.size() != 0) {
            Map a = amur.a("com.google.android.libraries.youtube.innertube.endpoint.tag", apfy);
            for (apxu a2 : apfy.d) {
                this.i.a(a2, a);
            }
        }
    }

    public final void onClick(View view) {
        apfy apfy = this.k;
        if ((apfy.a & 65536) != 0) {
            this.j.a(3, new acvs(apfy.g.d()), null);
        }
        BrandInteractionView brandInteractionView = (BrandInteractionView) this.c;
        Context context = this.h;
        ((vya) this.b).e();
        brandInteractionView.d.setBackgroundColor(ra.c(context, R.color.brand_interaction_selected_background_color));
        view.setAlpha(xpr.a(context.getResources(), (int) R.dimen.full_opacity));
        abr p = abe.p(brandInteractionView.d);
        p.a(0.0f);
        p.a((long) brandInteractionView.a);
        p.b(500);
        p.a(new vzf(brandInteractionView));
        brandInteractionView.e = p;
    }

    /* Access modifiers changed, original: final */
    public final ImageButton b() {
        return ((BrandInteractionView) this.c).b;
    }

    /* Access modifiers changed, original: final */
    public final ImageButton c() {
        return ((BrandInteractionView) this.c).c;
    }
}
