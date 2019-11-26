package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kpk */
public final class kpk extends jxw {
    private final akvo A;
    private final akou B;
    private final akoj C;
    private final kqv D;
    public ajvv a;
    private final LinearLayout b = ((LinearLayout) this.h.findViewById(R.id.video_info_view));
    private final RelativeLayout c = ((RelativeLayout) this.b.findViewById(R.id.thumbnail_layout));
    private final RelativeLayout d = ((RelativeLayout) this.b.findViewById(R.id.text_layout));
    private final TextView e = ((TextView) this.b.findViewById(R.id.ad_call_to_action));
    private final Resources z;

    public kpk(Context context, akkq akkq, aaas aaas, gal gal, flu flu, akvo akvo, tpu tpu, dwk dwk) {
        aaas aaas2 = aaas;
        super(context, akkq, aaas, gal, (akou) flu, (int) R.layout.compact_promoted_video_item, null);
        this.B = (akou) amqw.a((Object) flu);
        this.z = context.getResources();
        this.A = (akvo) amqw.a((Object) akvo);
        flu flu2 = flu;
        this.C = new akoj(aaas, (akou) flu);
        this.e.setOnClickListener(new kpn(this, aaas));
        this.D = new kqv(aaas, tpu, dwk, K_());
    }

    public final View K_() {
        return this.B.a();
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.C.a();
        this.D.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        int i;
        CharSequence a;
        ajyl ajyl = (ajvv) obj;
        this.C.a(akor.a, ajyl.g, akor.b(), this);
        this.a = (ajvv) amqw.a((Object) ajyl);
        this.D.a(akor.a, ajyl, ajyl.n, kqv.a(ajyl.i), ajyl, ajyl.m, ajyl.h);
        LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) this.d.getLayoutParams();
        if (etj.a(akor) || kcz.a(ajyl.l)) {
            this.b.setOrientation(1);
            layoutParams.width = -1;
            this.i.setMaxLines(this.z.getInteger(R.integer.compact_renderer_title_grid_mode_max_lines));
            i = 0;
        } else {
            this.b.setOrientation(0);
            this.i.setMaxLines(kcz.a(this.z, ajyl.l));
            i = (int) this.z.getDimension(R.dimen.compact_video_thumbnail_margin);
            kcz.a(this.z, ajyl.l, layoutParams, layoutParams2);
        }
        layoutParams.setMarginEnd(i);
        a(ajqy.a(ajyl.b));
        CharSequence a2 = ajqy.a(ajyl.c);
        arml arml = ajyl.e;
        if (arml != null) {
            a = ajqy.a(arml);
        } else {
            arml = ajyl.d;
            if (arml != null) {
                a = ajqy.a(arml);
            } else {
                a = null;
            }
        }
        a(a2, a, false);
        a(ajqy.a(ajyl.f), ajqy.b(ajyl.f));
        a(ajyl.a);
        arse arse = this.a.k;
        if (arse == null || (arse.a & 1) == 0) {
            this.l.setVisibility(0);
            this.e.setVisibility(8);
        } else {
            awtc awtc = arse.b;
            if (awtc == null) {
                awtc = awtc.d;
            }
            arml arml2 = awtc.b;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            Spanned a3 = ajqy.a(arml2);
            if (TextUtils.isEmpty(a3)) {
                arse = this.a.k;
                if (!(arse == null || (arse.a & 1) == 0)) {
                    this.e.setText(null);
                    adl.a(this.e, 0, R.drawable.ad_feed_call_to_action_arrow);
                }
            } else {
                this.e.setText(a3);
                this.e.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            this.l.setVisibility(8);
            this.e.setVisibility(0);
        }
        auvr auvr = ajyl.j;
        if (auvr == null || (auvr.a & 1) == 0) {
            this.v.setVisibility(8);
        } else {
            akvo akvo = this.A;
            View a4 = this.B.a();
            View view = this.v;
            auvn auvn = ajyl.j.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
            akvo.a(a4, view, auvn, ajyl, akor.a);
            this.v.setVisibility(0);
        }
        this.B.a(akor);
    }
}
