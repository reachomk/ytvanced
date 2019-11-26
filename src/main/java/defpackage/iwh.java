package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: iwh */
public final class iwh extends jxw implements iwu {
    private final TextView A;
    private final TextView B;
    private final akoj a;
    private final akou b;
    private final View c;
    private final TextView d;
    private final TextView e;
    private final TextView z;

    public iwh(Context context, akkq akkq, aaas aaas, flu flu, gal gal) {
        super(context, akkq, aaas, (akou) flu, gal, (int) R.layout.watch_card_one_vs_one_event_compact_video_item, null, null, null);
        this.b = (akou) amqw.a((Object) flu);
        this.a = new akoj(aaas, (akou) flu);
        View view = this.h;
        this.c = view.findViewById(R.id.thumbnail_layout);
        this.d = (TextView) view.findViewById(R.id.top_name);
        this.e = (TextView) view.findViewById(R.id.top_result);
        this.z = (TextView) view.findViewById(R.id.bottom_name);
        this.A = (TextView) view.findViewById(R.id.bottom_result);
        this.B = (TextView) view.findViewById(R.id.additional_event_description);
    }

    private static void a(View view, int i) {
        abe.a(view, i, view.getPaddingTop(), abe.k(view), view.getPaddingBottom());
    }

    public final void a(akpb akpb) {
        super.a(akpb);
        this.a.a();
    }

    public final View K_() {
        return this.b.a();
    }

    public final TextView b() {
        return this.d;
    }

    public final TextView c() {
        return this.e;
    }

    public final TextView d() {
        return this.z;
    }

    public final TextView e() {
        return this.A;
    }

    public final TextView f() {
        return this.l;
    }

    public final TextView g() {
        return this.B;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        axtr axtr = (axtr) obj;
        akoj akoj = this.a;
        acvx acvx = akor.a;
        arml arml = null;
        if ((axtr.a & 8) != 0) {
            apxu = axtr.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b(), this);
        akor.a.a(axtr.f.d(), null);
        akor akor2 = new akor(akor);
        akor2.b = axtr.f.d();
        axtp axtp = axtr.c;
        if (axtp == null) {
            axtp = axtp.i;
        }
        iwv.a((iwu) this, axtp);
        int i = axtr.a;
        int i2 = 0;
        if ((i & 1) != 0) {
            arml arml2;
            if ((i & 4) != 0) {
                arml2 = axtr.d;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            } else {
                arml2 = null;
            }
            CharSequence a = ajqy.a(arml2);
            if ((axtr.a & 4) != 0) {
                arml = axtr.d;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            a(a, ajqy.b(arml));
            aygk aygk = axtr.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
            a(aygk);
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
        if (this.c.getVisibility() == 8) {
            Resources resources = this.f.getResources();
            i2 = resources.getDimensionPixelSize(R.dimen.watch_card_one_vs_one_event_padding_start);
            View view = this.h;
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = resources.getDimensionPixelSize(R.dimen.watch_card_one_vs_one_event_no_thumbnail_height) - resources.getDimensionPixelSize(R.dimen.line_separator_height);
            view.setLayoutParams(layoutParams);
        }
        iwh.a(this.d, i2);
        iwh.a(this.z, i2);
        iwh.a(this.l, i2);
        iwh.a(this.B, i2);
        this.b.a(akor2);
    }
}
