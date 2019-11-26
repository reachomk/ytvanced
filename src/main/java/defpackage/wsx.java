package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.LinkedList;

/* renamed from: wsx */
public final class wsx implements akot, wmj {
    private final LayoutInflater a;
    private final akou b;
    private final aaas c;
    private final TextView d;
    private final TextView e;
    private final akyy f;
    private final akyy g;
    private final akyy h;
    private final wmh i;
    private aymx j;
    private final LinearLayout k;
    private final LinkedList l = new LinkedList();

    public wsx(Context context, wrx wrx, akzb akzb, aaas aaas, wmh wmh) {
        this.b = wrx;
        this.c = aaas;
        this.i = wmh;
        this.a = LayoutInflater.from(context);
        View inflate = this.a.inflate(R.layout.unlimited_manage_subscription_page, null);
        this.d = (TextView) inflate.findViewById(R.id.subscription_title);
        this.e = (TextView) inflate.findViewById(R.id.additional_info);
        this.f = akzb.a((TextView) inflate.findViewById(R.id.manage_family_button));
        this.g = akzb.a((TextView) inflate.findViewById(R.id.manage_subscription_button));
        this.h = akzb.a((TextView) inflate.findViewById(R.id.manage_fix_fop_button));
        this.k = (LinearLayout) inflate.findViewById(R.id.details_list_container);
        wrx.a(inflate);
    }

    public final boolean e() {
        return false;
    }

    public final View K_() {
        return this.b.a();
    }

    public final void a(akpb akpb) {
        this.i.b(this);
    }

    public final void a(boolean z) {
        if (z) {
            aymx aymx = this.j;
            if ((aymx.a & 64) != 0) {
                aaas aaas = this.c;
                apxu apxu = aymx.i;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aymx aymx = (aymx) obj;
        this.i.a((wmj) this);
        if (!amqq.a(this.j, aymx)) {
            CharSequence charSequence;
            aphg aphg;
            this.j = aymx;
            acvx acvx = akor.a;
            aphg aphg2 = null;
            acvx.a(aymx.g.d(), null);
            TextView textView = this.d;
            arml arml = aymx.b;
            if (arml == null) {
                arml = arml.f;
            }
            xpr.a(textView, ajqy.a(arml));
            this.k.removeAllViews();
            for (int i = 0; i < aymx.c.size(); i++) {
                if ((((aynb) aymx.c.get(i)).a & 1) != 0) {
                    LinearLayout linearLayout;
                    aymz aymz = ((aynb) aymx.c.get(i)).b;
                    if (aymz == null) {
                        aymz = aymz.d;
                    }
                    if (i < this.l.size()) {
                        linearLayout = (LinearLayout) this.l.get(i);
                    } else {
                        linearLayout = (LinearLayout) this.a.inflate(R.layout.unlimited_manage_subscription_page_offer_item, null);
                        this.l.add(linearLayout);
                    }
                    TextView textView2 = (TextView) linearLayout.findViewById(R.id.title);
                    arml arml2 = aymz.b;
                    if (arml2 == null) {
                        arml2 = arml.f;
                    }
                    xpr.a(textView2, ajqy.a(arml2));
                    textView2 = (TextView) linearLayout.findViewById(R.id.content);
                    arml arml3 = aymz.c;
                    if (arml3 == null) {
                        arml3 = arml.f;
                    }
                    xpr.a(textView2, ajqy.a(arml3));
                    this.k.addView(linearLayout);
                }
            }
            TextView textView3 = this.e;
            aaas aaas = this.c;
            if (aymx.e.isEmpty()) {
                charSequence = null;
            } else {
                charSequence = ajqy.a(TextUtils.concat(new CharSequence[]{System.getProperty("line.separator")}), aabb.b(aymx.e, aaas));
            }
            xpr.a(textView3, charSequence);
            akyy akyy = this.f;
            aymv aymv = aymx.h;
            if (aymv == null) {
                aymv = aymv.c;
            }
            if (aymv.a != 65153809) {
                aphg = null;
            } else {
                aymv = aymx.h;
                if (aymv == null) {
                    aymv = aymv.c;
                }
                if (aymv.a == 65153809) {
                    aphg = (aphg) aymv.b;
                } else {
                    aphg = aphg.s;
                }
            }
            akyy.a(aphg, acvx);
            akyy = this.g;
            aphj aphj = aymx.d;
            if (aphj == null) {
                aphj = aphj.d;
            }
            if ((aphj.a & 1) == 0) {
                aphg = null;
            } else {
                aphj = aymx.d;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                aphg = aphj.b;
                if (aphg == null) {
                    aphg = aphg.s;
                }
            }
            akyy.a(aphg, acvx);
            akyy = this.h;
            anxp anxp = aymx.f;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = aymx.f;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(ButtonRendererOuterClass.buttonRenderer);
                anxp2.a(access$0002);
                obj = anxp2.h.b(access$0002.d);
                if (obj == null) {
                    obj = access$0002.b;
                } else {
                    obj = access$0002.a(obj);
                }
                aphg2 = (aphg) obj;
            }
            akyy.a(aphg2, acvx);
            this.b.a(akor);
        }
    }
}
