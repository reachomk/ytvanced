package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: kcy */
public final class kcy implements akot {
    private final Context a;
    private final Resources b = this.a.getResources();
    private final aaas c;
    private final akou d;
    private final View e = LayoutInflater.from(this.a).inflate(R.layout.grid_show_item, null);
    private final akkq f;
    private final akvo g;
    private final LinearLayout h = ((LinearLayout) this.e.findViewById(R.id.grid_show_view));
    private final RelativeLayout i = ((RelativeLayout) this.e.findViewById(R.id.thumbnail_layout));
    private final RelativeLayout j = ((RelativeLayout) this.e.findViewById(R.id.text_layout));
    private final akoj k;
    private CharSequence l;
    private arsq m;
    private final ImageView n = ((ImageView) this.e.findViewById(R.id.thumbnail));
    private final TextView o = ((TextView) this.e.findViewById(R.id.bottom_panel));
    private final TextView p = ((TextView) this.e.findViewById(R.id.title));
    private final TextView q = ((TextView) this.e.findViewById(R.id.short_byline));
    private final TextView r = ((TextView) this.e.findViewById(R.id.long_byline));
    private final View s = this.e.findViewById(R.id.contextual_menu_anchor);
    private final ipk t = new ipk((ViewStub) this.e.findViewById(R.id.bottom_title_standalone_red_badge));

    public kcy(Context context, flu flu, akkq akkq, akvo akvo, aaas aaas) {
        this.k = new akoj(aaas, (akou) flu);
        this.a = (Context) amqw.a((Object) context);
        this.c = (aaas) amqw.a((Object) aaas);
        this.d = (akou) amqw.a((Object) flu);
        this.f = (akkq) amqw.a((Object) akkq);
        this.g = (akvo) amqw.a((Object) akvo);
        this.d.a(this.e);
        this.e.setOnClickListener(this.k);
    }

    public final View K_() {
        return this.d.a();
    }

    public final void a(akpb akpb) {
        this.k.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        int i;
        aygk aygk;
        auvn auvn;
        arml arml;
        arml arml2;
        arsq arsq = (arsq) obj;
        apeb apeb = null;
        if (!arsq.equals(this.m)) {
            this.l = null;
        }
        this.m = arsq;
        akoj akoj = this.k;
        acvx acvx = akor.a;
        if ((arsq.a & 4) != 0) {
            apxu = arsq.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akor.a.a(arsq.l.d(), null);
        LayoutParams layoutParams = (LayoutParams) this.i.getLayoutParams();
        LayoutParams layoutParams2 = (LayoutParams) this.j.getLayoutParams();
        if (etj.a(akor)) {
            this.h.setOrientation(1);
            layoutParams.width = -1;
            this.p.setMaxLines(this.b.getInteger(R.integer.compact_renderer_title_grid_mode_max_lines));
            i = 0;
        } else {
            auma auma;
            this.h.setOrientation(0);
            Resources resources = this.b;
            arsq arsq2 = this.m;
            if ((arsq2.a & 256) != 0) {
                auma = arsq2.k;
                if (auma == null) {
                    auma = auma.c;
                }
            } else {
                auma = null;
            }
            kcz.a(resources, auma, layoutParams, layoutParams2);
            Resources resources2 = this.b;
            auma auma2 = this.m.k;
            if (auma2 == null) {
                auma2 = auma.c;
            }
            this.p.setMaxLines(kcz.a(resources2, auma2));
            i = (int) this.b.getDimension(R.dimen.compact_video_thumbnail_margin);
        }
        layoutParams.setMarginEnd(i);
        this.f.a(this.n);
        akkq akkq = this.f;
        ImageView imageView = this.n;
        axmx axmx = this.m.c;
        if (axmx == null) {
            axmx = axmx.c;
        }
        if ((axmx.a & 1) != 0) {
            axmx = this.m.c;
            if (axmx == null) {
                axmx = axmx.c;
            }
            axmv axmv = axmx.b;
            if (axmv == null) {
                axmv = axmv.c;
            }
            aygk = axmv.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.o;
        if (this.l == null) {
            ArrayList arrayList = new ArrayList();
            for (ayfu ayfu : this.m.d) {
                ayfe ayfe = ayfu.c;
                if (ayfe == null) {
                    ayfe = ayfe.c;
                }
                if ((ayfe.a & 1) != 0) {
                    ayfe ayfe2 = ayfu.c;
                    if (ayfe2 == null) {
                        ayfe2 = ayfe.c;
                    }
                    arml arml3 = ayfe2.b;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                    arrayList.add(ajqy.a(arml3));
                }
            }
            this.l = TextUtils.join(System.getProperty("line.separator"), arrayList);
        }
        xpr.a(textView, this.l);
        acvx acvx2 = akor.a;
        akvo akvo = this.g;
        View a = this.d.a();
        View view = this.s;
        auvr auvr = arsq.j;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) == 0) {
            auvn = null;
        } else {
            auvr = arsq.j;
            if (auvr == null) {
                auvr = auvr.c;
            }
            auvn auvn2 = auvr.b;
            if (auvn2 == null) {
                auvn2 = auvn.l;
            }
            auvn = auvn2;
        }
        akvo.a(a, view, auvn, arsq, acvx2);
        TextView textView2 = this.p;
        if ((arsq.a & 1) != 0) {
            arml = arsq.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView2, ajqy.a(arml));
        if ((arsq.a & 16) != 0) {
            arml2 = arsq.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        CharSequence a2 = aabb.a(arml2, this.c, false);
        if (TextUtils.isEmpty(a2)) {
            arml arml4;
            textView2 = this.r;
            if ((arsq.a & 32) != 0) {
                arml4 = arsq.h;
                if (arml4 == null) {
                    arml4 = arml.f;
                }
            } else {
                arml4 = null;
            }
            xpr.a(textView2, aabb.a(arml4, this.c, false));
            this.q.setVisibility(8);
        } else {
            xpr.a(this.q, a2);
            this.r.setVisibility(8);
        }
        ipk ipk = this.t;
        apdx apdx = this.m.i;
        if (apdx == null) {
            apdx = apdx.g;
        }
        if ((apdx.a & 2) != 0) {
            apdx = this.m.i;
            if (apdx == null) {
                apdx = apdx.g;
            }
            apeb = apdx.c;
            if (apeb == null) {
                apeb = apeb.e;
            }
        }
        ipk.a(apeb);
    }
}
