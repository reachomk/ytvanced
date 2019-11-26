package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.google.android.youtube.R;

/* renamed from: wnw */
public final class wnw {
    public final View a;
    public final ScrollView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    private final akvp l;
    private final akkq m;
    private final ImageView n;

    public wnw(Context context, akvp akvp, akkq akkq, View view) {
        this.l = akvp;
        this.m = akkq;
        amqw.a((Object) view);
        this.a = view.findViewById(R.id.header_container);
        this.n = (ImageView) view.findViewById(R.id.header_background);
        this.b = (ScrollView) view.findViewById(R.id.perks_scroll_view);
        this.e = (ImageView) view.findViewById(R.id.membership_icon);
        this.c = (ImageView) view.findViewById(R.id.channel_thumbnail);
        this.d = (ImageView) view.findViewById(R.id.viewer_thumbnail);
        Resources resources = context.getResources();
        this.f = resources.getDimensionPixelSize(R.dimen.membership_offer_header_minimum_size);
        this.g = resources.getDimensionPixelSize(R.dimen.membership_offer_header_maximum_size);
        this.h = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_avatars_minimum_size);
        this.i = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_avatars_maximum_size);
        this.j = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_offer_minimum_size);
        this.k = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_offer_maximum_size);
        this.b.getViewTreeObserver().addOnScrollChangedListener(new wnv(this));
    }

    public static void a(View view, float f, float f2, float f3, boolean z) {
        LayoutParams layoutParams = view.getLayoutParams();
        int i = (int) (f + (f3 * (f2 - f)));
        layoutParams.height = i;
        if (z) {
            layoutParams.width = i;
        }
        view.setLayoutParams(layoutParams);
    }

    /* Access modifiers changed, original: final */
    public final void a(aygk aygk, aygk aygk2, aygk aygk3, arwf arwf) {
        arwh arwh;
        this.m.a(this.n, aygk);
        this.m.a(this.c, aygk2);
        this.m.a(this.d, aygk3);
        akvp akvp = this.l;
        if (arwf == null) {
            arwh = arwh.UNKNOWN;
        } else {
            arwh = arwh.a(arwf.b);
            if (arwh == null) {
                arwh = arwh.UNKNOWN;
            }
        }
        int a = akvp.a(arwh);
        this.e.setImageResource(a);
        xpr.a(this.e, a != 0);
    }

    static void a(View view, aphj aphj) {
        if (aphj != null) {
            aphg aphg = aphj.b;
            if (aphg == null) {
                aphg = aphg.s;
            }
            aodx aodx = aphg.q;
            if (aodx == null) {
                aodx = aodx.c;
            }
            aodv aodv = aodx.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            if ((aodv.a & 2) != 0) {
                aphg aphg2 = aphj.b;
                if (aphg2 == null) {
                    aphg2 = aphg.s;
                }
                aodx aodx2 = aphg2.q;
                if (aodx2 == null) {
                    aodx2 = aodx.c;
                }
                aodv aodv2 = aodx2.b;
                if (aodv2 == null) {
                    aodv2 = aodv.c;
                }
                view.setContentDescription(aodv2.b);
            }
        }
    }

    static void a(akor akor, won won, ajzw ajzw) {
        avvt avvt = (avvt) ajzv.a(ajzw, avvt.class);
        if (avvt != null) {
            won.a(avvt);
            xpr.a(won.a, true);
            return;
        }
        xpr.a(won.a, false);
    }
}
