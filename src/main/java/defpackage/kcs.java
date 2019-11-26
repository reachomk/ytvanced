package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kcs */
public final class kcs extends jxw {
    private final akou a;
    private final LinearLayout b = ((LinearLayout) this.h.findViewById(R.id.video_info_view));
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));
    private final akvo d;
    private final akoj e;

    public kcs(Context context, akkq akkq, aaas aaas, gal gal, akvo akvo, flu flu, hmc hmc) {
        super(context, akkq, flu, LayoutInflater.from(context).inflate(R.layout.grid_narrow_video_item, null, false), aaas, gal, hmc, null);
        this.d = (akvo) amqw.a((Object) akvo);
        this.a = (akou) amqw.a((Object) flu);
        aaas aaas2 = aaas;
        this.e = new akoj(aaas, (akou) flu);
    }

    public final View K_() {
        return this.a.a();
    }

    private static apeb a(arry arry) {
        if ((arry.a & 2048) == 0) {
            return null;
        }
        apdx apdx = arry.m;
        if (apdx == null) {
            apdx = apdx.g;
        }
        apeb apeb = apdx.c;
        if (apeb == null) {
            apeb = apeb.e;
        }
        return apeb;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        auvn auvn;
        CharSequence charSequence;
        arml arml;
        apdx apdx;
        aped aped;
        obj = (arry) obj;
        amqw.a(obj);
        boolean z = kcs.a(obj) != null;
        akoj akoj = this.e;
        acvx acvx = akor.a;
        apxu apxu = obj.g;
        if (apxu == null) {
            apxu = apxu.d;
        }
        akoj.a(acvx, apxu, akor.b(), this);
        apdz apdz = null;
        akor.a.a(obj.o.d(), null);
        arml arml2 = obj.d;
        if (arml2 == null) {
            arml2 = arml.f;
        }
        a(ajqy.a(arml2));
        aygk aygk = obj.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        a(aygk);
        this.a.a(akor);
        akor akor2 = new akor(akor);
        acvx acvx2 = akor2.a;
        akvo akvo = this.d;
        View a = this.a.a();
        View view = this.v;
        auvr auvr = obj.f;
        if (auvr == null) {
            auvr = auvr.c;
        }
        if ((auvr.a & 1) == 0) {
            auvn = null;
        } else {
            auvr = obj.f;
            if (auvr == null) {
                auvr = auvr.c;
            }
            auvn auvn2 = auvr.b;
            if (auvn2 == null) {
                auvn2 = auvn.l;
            }
            auvn = auvn2;
        }
        akvo.a(a, view, auvn, obj, acvx2);
        ayfy ayfy = (ayfy) ipo.a(obj.c, ipr.a);
        if (ayfy == null) {
            charSequence = null;
        } else {
            arml = ayfy.b;
            if (arml == null) {
                arml = arml.f;
            }
            charSequence = ajqy.a(arml);
        }
        a(charSequence, null, obj.c, null);
        if ((obj.a & 256) != 0) {
            arml = obj.j;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        charSequence = ajqy.a(arml);
        if ((obj.a & 128) != 0) {
            arml2 = obj.i;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        } else {
            arml2 = null;
        }
        a(charSequence, ajqy.a(arml2), z);
        if ((obj.a & 1024) != 0) {
            apdx = obj.l;
            if (apdx == null) {
                apdx = apdx.g;
            }
            aped = apdx.b;
            if (aped == null) {
                aped = aped.g;
            }
        } else {
            aped = null;
        }
        a(aped);
        a(kcs.a(obj));
        if ((obj.a & 512) != 0) {
            apdx = obj.k;
            if (apdx == null) {
                apdx = apdx.g;
            }
            apdz = apdx.d;
            if (apdz == null) {
                apdz = apdz.e;
            }
        }
        a(apdz);
        a(ipo.a(obj.c));
        this.a.a(akor2);
        TextView textView = this.c;
        int i = obj.e;
        if (i == 0) {
            i = 1;
        }
        textView.setMaxLines(i);
    }
}
