package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alnt */
public final class alnt implements akot {
    public apxu a;
    public apxu b;
    public apxu c;
    public arml d;
    private final aaas e;
    private final akvp f;
    private final View g;
    private final akle h;
    private final TextView i = ((TextView) this.g.findViewById(R.id.promo_text));
    private final TextView j = ((TextView) this.g.findViewById(R.id.add_contacts_button));
    private final ImageView k;

    public alnt(Context context, akkq akkq, aaas aaas, akvp akvp, alnx alnx) {
        this.e = (aaas) amqw.a((Object) aaas);
        this.f = (akvp) amqw.a((Object) akvp);
        this.g = View.inflate(context, R.layout.share_panel_promo, null);
        this.h = new akle(akkq, (ImageView) this.g.findViewById(R.id.promo_image), true);
        this.j.setOnClickListener(new alns(this, aaas));
        this.k = (ImageView) this.g.findViewById(R.id.close_button);
        this.k.setOnClickListener(new alnv(this, aaas, alnx));
        alpf.a(this.g, true);
    }

    public final View K_() {
        return this.g;
    }

    public final void a(akpb akpb) {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        arml arml2;
        apxu apxu;
        apxu apxu2;
        ayly ayly = (ayly) obj;
        int i = 0;
        if (TextUtils.isEmpty(ayly.b)) {
            this.g.setBackgroundColor(0);
        } else {
            this.g.setBackgroundColor(Color.parseColor(ayly.b));
        }
        akle akle = this.h;
        aygk aygk = ayly.g;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akle.a(aygk);
        TextView textView = this.i;
        if ((ayly.a & 64) != 0) {
            arml = ayly.h;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        aphj aphj = ayly.i;
        if (aphj == null) {
            aphj = aphj.d;
        }
        aphg aphg = aphj.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        TextView textView2 = this.j;
        if ((aphg.a & 128) != 0) {
            arml2 = aphg.g;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        xpr.a(textView2, aabb.a(arml2, this.e, false));
        if ((aphg.a & 2048) != 0) {
            apxu = aphg.l;
            if (apxu == null) {
                apxu = apxu.d;
            }
        } else {
            apxu = null;
        }
        this.a = apxu;
        if ((aphg.a & 4096) != 0) {
            apxu2 = aphg.m;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
        } else {
            apxu2 = null;
        }
        this.b = apxu2;
        if ((ayly.a & 2) != 0) {
            akvp akvp = this.f;
            arwf arwf = ayly.c;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a = arwh.a(arwf.b);
            if (a == null) {
                a = arwh.UNKNOWN;
            }
            i = akvp.a(a);
        }
        if (i != 0) {
            this.k.setImageResource(i);
        } else {
            this.k.setImageDrawable(null);
        }
        apxu2 = ayly.d;
        if (apxu2 == null) {
            apxu2 = apxu.d;
        }
        this.c = apxu2;
        arml arml3 = ayly.e;
        if (arml3 == null) {
            arml3 = arml.f;
        }
        this.d = arml3;
    }
}
