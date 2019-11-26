package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;

/* renamed from: ivh */
final class ivh extends jxw {
    private final akoj a;
    private final akvp b;
    private final Resources c;
    private final LinearLayout d = ((LinearLayout) this.h.findViewById(R.id.video_info_view));
    private final RelativeLayout e = ((RelativeLayout) this.d.findViewById(R.id.thumbnail_layout));
    private final ViewGroup z = ((ViewGroup) this.d.findViewById(R.id.badge_layout));

    public ivh(Context context, akkq akkq, aaas aaas, akou akou, gal gal, akvp akvp) {
        super(context, akkq, aaas, gal, akou, (int) R.layout.watch_card_compact_video_item, null);
        this.c = context.getResources();
        this.a = new akoj(aaas, akou);
        this.b = akvp;
    }

    public final View K_() {
        return this.h;
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.a.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        int i;
        arml arml;
        azhw azhw = (azhw) obj;
        akoj akoj = this.a;
        acvx acvx = akor.a;
        arml arml2 = null;
        if ((azhw.a & 64) != 0) {
            apxu = azhw.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b(), this);
        LayoutParams layoutParams = (LayoutParams) this.e.getLayoutParams();
        if (etj.a(akor)) {
            this.d.setOrientation(1);
            layoutParams.width = -1;
            i = 0;
        } else {
            this.d.setOrientation(0);
            layoutParams.width = (int) this.c.getDimension(R.dimen.watch_card_list_item_thumbnail_width);
            i = (int) this.c.getDimension(R.dimen.compact_video_thumbnail_margin);
        }
        layoutParams.setMarginEnd(i);
        if ((azhw.a & 2) != 0) {
            arml = azhw.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        a(ajqy.a(arml));
        if ((azhw.a & 8) != 0) {
            arml = azhw.e;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(this.k, ajqy.a(arml));
        if ((azhw.a & 4) != 0) {
            arml = azhw.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(this.l, ajqy.a(arml));
        if ((azhw.a & 16) != 0) {
            arml = azhw.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence a = ajqy.a(arml);
        if ((azhw.a & 16) != 0) {
            arml2 = azhw.f;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        a(a, ajqy.b(arml2));
        aygk aygk = azhw.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        a(aygk);
        iwv.a(this.f, this.z, this.b, azhw.i, false);
    }
}
