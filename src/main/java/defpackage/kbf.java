package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: kbf */
public final class kbf implements akot {
    private final akou a;
    private final aaas b;
    private final akkq c;
    private final View d;
    private final RelativeLayout e = ((RelativeLayout) this.d.findViewById(R.id.thumbnail_layout));
    private final akvo f;
    private final View g = this.d.findViewById(R.id.contextual_menu_anchor);
    private final ImageView h = ((ImageView) this.d.findViewById(R.id.thumbnail));
    private final TextView i = ((TextView) this.d.findViewById(R.id.title));
    private final TextView j = ((TextView) this.d.findViewById(R.id.short_byline));
    private final TextView k = ((TextView) this.d.findViewById(R.id.long_byline));
    private final TextView l = ((TextView) this.d.findViewById(R.id.bottom_text));
    private final ipk m = new ipk((ViewStub) this.d.findViewById(R.id.bottom_title_standalone_red_badge));
    private final Resources n;
    private final akoj o;
    private CharSequence p;
    private aqgk q;

    public kbf(Context context, flu flu, akkq akkq, akvo akvo, aaas aaas) {
        this.o = new akoj(aaas, (akou) flu);
        amqw.a((Object) context);
        this.a = (akou) amqw.a((Object) flu);
        this.f = (akvo) amqw.a((Object) akvo);
        this.c = (akkq) amqw.a((Object) akkq);
        this.b = (aaas) amqw.a((Object) aaas);
        this.n = context.getResources();
        this.d = LayoutInflater.from(context).inflate(R.layout.compact_show_item, null);
        this.a.a(this.d);
        this.d.setOnClickListener(this.o);
    }

    public final View K_() {
        return this.a.a();
    }

    public final void a(akpb akpb) {
        this.o.a();
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        apxu apxu;
        aygk aygk;
        auvn auvn;
        arml arml;
        aqgk aqgk = (aqgk) obj;
        apeb apeb = null;
        if (!aqgk.equals(this.q)) {
            this.p = null;
        }
        this.q = aqgk;
        akoj akoj = this.o;
        acvx acvx = akor.a;
        if ((aqgk.a & 4) != 0) {
            apxu = aqgk.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akor.a.a(aqgk.j.d(), null);
        this.e.getLayoutParams().width = (int) this.n.getDimension(R.dimen.list_item_thumbnail_width);
        this.c.a(this.h);
        akkq akkq = this.c;
        ImageView imageView = this.h;
        axmx axmx = this.q.c;
        if (axmx == null) {
            axmx = axmx.c;
        }
        if ((axmx.a & 1) != 0) {
            axmx = this.q.c;
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
        TextView textView = this.l;
        if (this.p == null) {
            ArrayList arrayList = new ArrayList();
            for (ayfu ayfu : this.q.d) {
                ayfe ayfe = ayfu.c;
                if (ayfe == null) {
                    ayfe = ayfe.c;
                }
                if ((ayfe.a & 1) != 0) {
                    ayfe ayfe2 = ayfu.c;
                    if (ayfe2 == null) {
                        ayfe2 = ayfe.c;
                    }
                    arml arml2 = ayfe2.b;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                    arrayList.add(ajqy.a(arml2));
                }
            }
            this.p = TextUtils.join(System.getProperty("line.separator"), arrayList);
        }
        xpr.a(textView, this.p);
        acvx acvx2 = akor.a;
        akvo akvo = this.f;
        View a = this.a.a();
        View view = this.g;
        auvr auvr = aqgk.i;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) == 0) {
            auvn = null;
        } else {
            auvr = aqgk.i;
            if (auvr == null) {
                auvr = auvr.c;
            }
            auvn = auvr.b;
            if (auvn == null) {
                auvn = auvn.l;
            }
        }
        akvo.a(a, view, auvn, aqgk, acvx2);
        textView = this.i;
        arml arml3 = aqgk.b;
        if (arml3 == null) {
            arml3 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml3));
        if ((aqgk.a & 8) != 0) {
            arml = aqgk.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        CharSequence a2 = aabb.a(arml, this.b, false);
        if (TextUtils.isEmpty(a2)) {
            textView = this.k;
            arml arml4 = aqgk.g;
            if (arml4 == null) {
                arml4 = arml.f;
            }
            xpr.a(textView, aabb.a(arml4, this.b, false));
            this.j.setVisibility(8);
        } else {
            xpr.a(this.j, a2);
            this.k.setVisibility(8);
        }
        ipk ipk = this.m;
        apdx apdx = this.q.h;
        if (apdx == null) {
            apdx = apdx.g;
        }
        if ((apdx.a & 2) != 0) {
            apdx = this.q.h;
            if (apdx == null) {
                apdx = apdx.g;
            }
            apeb = apdx.c;
            if (apeb == null) {
                apeb = apeb.e;
            }
        }
        ipk.a(apeb);
        this.a.a(akor);
    }
}
