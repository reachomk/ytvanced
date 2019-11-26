package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.ArrayList;

/* renamed from: khi */
public final class khi extends akpl {
    private final Context a;
    private final akkq b;
    private final akvp c;
    private final akou d;
    private final akoj e;
    private final View f;
    private final ImageView g = ((ImageView) this.f.findViewById(R.id.thumbnail));
    private final TextView h = ((TextView) this.f.findViewById(R.id.thumbnail_overlay_bottom_panel));
    private final TextView i = ((TextView) this.f.findViewById(R.id.thumbnail_bottom_panel));
    private final TextView j = ((TextView) this.f.findViewById(R.id.title));
    private final TextView k = ((TextView) this.f.findViewById(R.id.subtitle));
    private final ViewGroup l = ((ViewGroup) this.f.findViewById(R.id.bottom_standalone_badges_container));
    private final akyy m;

    public khi(Context context, akkq akkq, akvp akvp, akop akop, akzb akzb, flu flu, ViewGroup viewGroup) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = (akvp) amqw.a((Object) akvp);
        this.d = (akou) amqw.a((Object) flu);
        this.e = akop.a(flu);
        this.f = LayoutInflater.from(context).inflate(R.layout.premium_season_card_item, viewGroup, false);
        this.m = akzb.a((TextView) this.f.findViewById(R.id.offer_button));
        this.d.a(this.f);
    }

    public final View K_() {
        return this.d.a();
    }

    public final void a(akpb akpb) {
        this.e.a();
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        apxu apxu;
        aygk aygk;
        CharSequence charSequence;
        awnc awnc = (awnc) obj;
        akoj akoj = this.e;
        acvx acvx = akor.a;
        Object obj2 = null;
        if ((awnc.a & 16) != 0) {
            apxu = awnc.h;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        akoj.a(acvx, apxu, akor.b());
        akkq akkq = this.b;
        ImageView imageView = this.g;
        boolean z = true;
        if ((awnc.a & 1) != 0) {
            aygk = awnc.b;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.h;
        anyd<ayfu> anyd = awnc.c;
        if (anyd == null || anyd.isEmpty()) {
            charSequence = null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (ayfu ayfu : anyd) {
                ayfe ayfe = ayfu.c;
                if (ayfe == null) {
                    ayfe = ayfe.c;
                }
                if ((ayfe.a & 1) != 0) {
                    ayfe ayfe2 = ayfu.c;
                    if (ayfe2 == null) {
                        ayfe2 = ayfe.c;
                    }
                    arml arml = ayfe2.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                    arrayList.add(ajqy.a(arml));
                }
            }
            charSequence = TextUtils.join(System.getProperty("line.separator"), arrayList);
        }
        xpr.a(textView, charSequence);
        textView = this.i;
        arml arml2 = awnc.d;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
        textView = this.j;
        arml2 = awnc.e;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
        textView = this.k;
        arml2 = awnc.f;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        xpr.a(textView, ajqy.a(arml2));
        fan.a(this.a, this.l, awnc.g);
        View view = this.l;
        if (view.getChildCount() <= 0) {
            z = false;
        }
        xpr.a(view, z);
        if ((awnc.a & 64) != 0) {
            obj2 = awnc.j;
            if (obj2 == null) {
                obj2 = axak.a;
            }
        }
        this.m.a((aphg) amqp.c(obj2).a(khl.a).c(), akor.a);
        this.d.a(akor);
    }
}
