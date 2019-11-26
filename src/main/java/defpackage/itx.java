package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.youtube.R;

/* renamed from: itx */
public final class itx extends ilg {
    private final Context h;
    private final akou i;
    private final akoj j;

    public itx(Context context, akkq akkq, flu flu, aaas aaas, akvo akvo, akvp akvp, ViewGroup viewGroup) {
        super(context, akkq, akvo, akvp, viewGroup);
        this.h = (Context) amqw.a((Object) context);
        this.i = (akou) amqw.a((Object) flu);
        View view = this.c;
        flu.a(view);
        this.j = new akoj(aaas, (akou) flu);
        K_().setTag(R.id.offset_adjuster_tag, new itw(view));
        K_().setLayoutDirection(context.getResources().getConfiguration().getLayoutDirection());
    }

    public final View K_() {
        return this.i.a();
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.j.a();
    }

    private final int b() {
        return (this.h.getResources().getDimensionPixelSize(R.dimen.playlist_card_width) + this.c.getPaddingLeft()) + this.c.getPaddingRight();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        arml arml;
        awhd awhd = (awhd) obj;
        akoj akoj = this.j;
        acvx acvx = akor.a;
        arml arml2 = null;
        if ((awhd.a & 8) != 0) {
            apxu = awhd.f;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akor.a.a(awhd.i.d(), null);
        LayoutParams layoutParams = K_().getLayoutParams();
        if (layoutParams != null) {
            int i;
            Resources resources = this.h.getResources();
            if ((awhd.a & 32) != 0 && resources.getConfiguration().orientation == 1) {
                i = resources.getDisplayMetrics().widthPixels;
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.horizontal_card_list_item_spacing);
                int a = awhf.a(awhd.h);
                if (a == 0) {
                    a = 1;
                }
                a--;
                if (a == 0) {
                    i = b();
                } else if (a != 1) {
                    i = (i - ((dimensionPixelSize * 3) + resources.getDimensionPixelSize(R.dimen.playlist_card_peek_width_two_or_more_fully_visible))) / 2;
                } else {
                    i -= (dimensionPixelSize + dimensionPixelSize) + resources.getDimensionPixelSize(R.dimen.playlist_card_peek_width_one_fully_visible);
                }
            } else {
                i = b();
            }
            layoutParams.width = i;
            K_().setLayoutParams(layoutParams);
        }
        awkv awkv = awhd.b;
        if (awkv == null) {
            awkv = awkv.d;
        }
        a(awkv, null);
        b(awhd.e);
        if ((awhd.a & 2) != 0) {
            arml = awhd.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        a(ajqy.a(arml));
        if ((awhd.a & 4) != 0) {
            arml2 = awhd.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        b(ajqy.a(arml2));
        View a2 = this.i.a();
        auvr auvr = awhd.g;
        if (auvr == null) {
            auvr = auvr.c;
        }
        a(a2, auvr, awhd, akor.a);
        this.i.a(akor);
    }
}
