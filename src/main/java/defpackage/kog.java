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

/* renamed from: kog */
public final class kog extends jxw {
    private final akou A;
    private final akoj B;
    private final kqv C;
    public ajtc a;
    private final LinearLayout b = ((LinearLayout) this.h.findViewById(R.id.video_info_view));
    private final RelativeLayout c = ((RelativeLayout) this.b.findViewById(R.id.thumbnail_layout));
    private final TextView d = ((TextView) this.b.findViewById(R.id.ad_call_to_action));
    private final Resources e;
    private final akvo z;

    public kog(Context context, akkq akkq, aaas aaas, flu flu, akvo akvo, tpu tpu, gal gal, dwk dwk) {
        aaas aaas2 = aaas;
        super(context, akkq, aaas, gal, (akou) flu, (int) R.layout.compact_promoted_video_item, null);
        this.A = (akou) amqw.a((Object) flu);
        this.e = context.getResources();
        this.z = (akvo) amqw.a((Object) akvo);
        flu flu2 = flu;
        this.B = new akoj(aaas, (akou) flu);
        this.d.setOnClickListener(new koj(this, aaas));
        this.C = new kqv(aaas, tpu, dwk, K_());
    }

    public final View K_() {
        return this.A.a();
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.B.a();
        this.C.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        int i;
        CharSequence a;
        ajyl ajyl = (ajtc) obj;
        this.B.a(akor.a, ajyl.g, akor.b(), this);
        this.a = (ajtc) amqw.a((Object) ajyl);
        this.C.a(akor.a, ajyl, ajyl.m, kqv.a(ajyl.i), ajyl, ajyl.l, ajyl.h);
        LayoutParams layoutParams = (LayoutParams) this.c.getLayoutParams();
        if (etj.a(akor)) {
            this.b.setOrientation(1);
            layoutParams.width = -1;
            this.w = this.e.getInteger(R.integer.compact_renderer_title_grid_mode_max_lines);
            i = 0;
        } else {
            this.b.setOrientation(0);
            layoutParams.width = (int) this.e.getDimension(R.dimen.list_item_thumbnail_width);
            this.w = this.e.getInteger(R.integer.compact_renderer_title_max_lines);
            i = (int) this.e.getDimension(R.dimen.compact_video_thumbnail_margin);
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
        aqge aqge = this.a.k;
        if (aqge == null || (aqge.a & 1) == 0) {
            this.l.setVisibility(0);
            this.d.setVisibility(8);
        } else {
            awtc awtc = aqge.b;
            if (awtc == null) {
                awtc = awtc.d;
            }
            arml arml2 = awtc.b;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            Spanned a3 = ajqy.a(arml2);
            if (TextUtils.isEmpty(a3)) {
                this.d.setText(null);
                adl.a(this.d, 0, R.drawable.ad_feed_call_to_action_arrow);
            } else {
                this.d.setText(a3);
                this.d.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
            this.l.setVisibility(4);
            this.d.setVisibility(0);
        }
        auvr auvr = ajyl.j;
        if (auvr == null || (auvr.a & 1) == 0) {
            this.v.setVisibility(8);
        } else {
            akvo akvo = this.z;
            View a4 = this.A.a();
            View view = this.v;
            auvn auvn = ajyl.j.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
            akvo.a(a4, view, auvn, ajyl, akor.a);
            this.v.setVisibility(0);
        }
        this.A.a(akor);
    }
}
