package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;

/* renamed from: jxc */
public class jxc implements kkg {
    public final View a;
    private final akvp b;
    private final fmx c;
    private final Context d;
    private final ImageView e = ((ImageView) this.a.findViewById(R.id.button_icon));
    private final TextView f = ((TextView) this.a.findViewById(R.id.button_text));
    private final akyu g;
    private final ColorStateList h = this.f.getTextColors();
    private final int i;
    private acvx j;
    private aphg k;
    private akor l;

    public jxc(akvp akvp, fmx fmx, Context context, akyz akyz, ViewGroup viewGroup, int i, int i2) {
        this.b = akvp;
        this.c = fmx;
        this.d = context;
        this.a = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.g = akyz.a(this.a);
        this.i = i2;
    }

    public final void a() {
        this.j = null;
        this.k = null;
        this.l = null;
        this.a.setContentDescription(null);
    }

    public void a(axpc axpc, acvx acvx, akor akor) {
        int a;
        ColorStateList valueOf;
        this.j = (acvx) amqw.a((Object) acvx);
        aphj aphj = axpc.e;
        if (aphj == null) {
            aphj = aphj.d;
        }
        amqw.b((aphj.a & 1) != 0);
        aphj aphj2 = axpc.e;
        if (aphj2 == null) {
            aphj2 = aphj.d;
        }
        aphg aphg = aphj2.b;
        if (aphg == null) {
            aphg = aphg.s;
        }
        this.k = aphg;
        this.l = akor;
        akyu akyu = this.g;
        aphg aphg2 = this.k;
        acvx acvx2 = this.j;
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        akor akor2 = this.l;
        if (akor2 != null) {
            String str = "sectionListController";
            hashMap.put(str, akor2.a(str));
            hashMap.putAll(this.l.b());
        }
        akyu.a(aphg2, acvx2, hashMap);
        aphg = this.k;
        if ((aphg.a & 16) != 0) {
            akvp akvp = this.b;
            arwf arwf = aphg.e;
            if (arwf == null) {
                arwf = arwf.c;
            }
            arwh a2 = arwh.a(arwf.b);
            if (a2 == null) {
                a2 = arwh.UNKNOWN;
            }
            a = akvp.a(a2);
        } else {
            a = 0;
        }
        arml arml = null;
        Drawable a3 = a != 0 ? ra.a(this.d, a) : null;
        if (a3 != null) {
            int a4;
            aphg aphg3 = this.k;
            ayet ayet = aphg3.b == 20 ? (ayet) aphg3.c : ayet.d;
            if ((ayet.a & 2) == 0) {
                a4 = xwe.a(this.d, this.i, 0);
            } else {
                Context context = this.d;
                ayem a5 = ayem.a(ayet.c);
                if (a5 == null) {
                    a5 = ayem.THEME_ATTRIBUTE_UNKNOWN;
                }
                a4 = alay.a(context, a5);
            }
            a3 = st.d(a3).mutate();
            st.a(a3, a4);
            this.e.setImageDrawable(a3);
        } else {
            this.e.setImageResource(0);
        }
        TextView textView = this.f;
        aphg aphg4 = this.k;
        if ((aphg4.a & 128) != 0) {
            arml = aphg4.g;
            if (arml == null) {
                arml = arml.f;
            }
        }
        textView.setText(ajqy.a(arml));
        aphg = this.k;
        ayet ayet2 = aphg.b == 20 ? (ayet) aphg.c : ayet.d;
        if ((ayet2.a & 1) != 0) {
            Context context2 = this.d;
            ayem a6 = ayem.a(ayet2.b);
            if (a6 == null) {
                a6 = ayem.THEME_ATTRIBUTE_UNKNOWN;
            }
            valueOf = ColorStateList.valueOf(alay.a(context2, a6));
        } else {
            valueOf = this.h;
        }
        this.f.setTextColor(valueOf);
        if (this.c != null) {
            arup arup = this.k.k;
            if (arup == null) {
                arup = arup.c;
            }
            if (arup.a == 102716411) {
                aruh aruh;
                fmx fmx = this.c;
                arup arup2 = this.k.k;
                if (arup2 == null) {
                    arup2 = arup.c;
                }
                if (arup2.a == 102716411) {
                    aruh = (aruh) arup2.b;
                } else {
                    aruh = aruh.j;
                }
                fmx.a(aruh, this.a, this.k, this.j);
            }
        }
    }

    public final View b() {
        return this.a;
    }
}
