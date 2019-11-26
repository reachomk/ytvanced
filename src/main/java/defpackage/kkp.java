package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.youtube.app.offline.ui.OfflineArrowView;
import com.google.android.youtube.R;

/* renamed from: kkp */
public final class kkp implements hic, kkg {
    public final hia a;
    public final Context b;
    public final xci c;
    public final aaas d;
    public final View e;
    public final TextView f = ((TextView) this.e.findViewById(R.id.button_text));
    public final OfflineArrowView g = ((OfflineArrowView) this.e.findViewById(R.id.button_icon));
    public final hif h;
    public final aizy i;
    public final akpi j;
    public final OnClickListener k;
    public final ColorStateList l = this.f.getTextColors();
    public final ColorStateList m = this.g.e;
    public acvx n;
    public axpc o;
    public String p;
    public aphg q;
    private final bcaa r;
    private final hmi s;

    public kkp(ahcn ahcn, aizy aizy, bcaa bcaa, hih hih, Context context, xci xci, aaas aaas, SharedPreferences sharedPreferences, akpi akpi, ViewGroup viewGroup) {
        bcaa bcaa2 = bcaa;
        this.r = bcaa2;
        aizy aizy2 = aizy;
        this.i = aizy2;
        hih hih2 = hih;
        this.a = hih.a(this);
        Context context2 = context;
        this.b = context2;
        this.c = xci;
        aaas aaas2 = aaas;
        this.d = aaas2;
        this.j = akpi;
        this.e = LayoutInflater.from(context).inflate(R.layout.slim_metadata_offline_button, viewGroup, false);
        this.h = new hie(context2, this.a, ahcn, bcaa2, aizy2, new kko(this), sharedPreferences, aaas2);
        this.k = new kkr(this);
        this.s = hml.a(this.g, this.k);
    }

    public final void a() {
        this.p = null;
        this.o = null;
        this.n = null;
        this.q = null;
        this.a.c = null;
        this.e.setOnClickListener(null);
        this.e.setAlpha(0.5f);
        this.e.setClickable(false);
        this.g.setClickable(false);
        this.c.b(this.a);
    }

    public static aphg a(aizy aizy) {
        aakj b = elq.b(aizy);
        if (!(b == null || b.l() == null)) {
            atdl atdl = b.l().k;
            if (atdl == null) {
                atdl = atdl.c;
            }
            if (atdl.a == 65153809) {
                aphg aphg;
                atdl atdl2 = b.l().k;
                if (atdl2 == null) {
                    atdl2 = atdl.c;
                }
                if (atdl2.a == 65153809) {
                    aphg = (aphg) atdl2.b;
                } else {
                    aphg = aphg.s;
                }
                return aphg;
            }
        }
        return null;
    }

    public final agqy c() {
        return !TextUtils.isEmpty(this.p) ? ((agwc) this.r.get()).b().k().a(this.p) : null;
    }

    public final View b() {
        return this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003f  */
    public final void b(defpackage.agqy r4) {
        /*
        r3 = this;
        r0 = 0;
        if (r4 != 0) goto L_0x0005;
    L_0x0003:
        r4 = r0;
        goto L_0x003d;
    L_0x0005:
        r1 = r4.u();
        r2 = defpackage.agqs.PLAYABLE;
        if (r1 != r2) goto L_0x0022;
    L_0x000d:
        r4 = r3.o;
        r1 = r4.a;
        r1 = r1 & 4;
        if (r1 == 0) goto L_0x001c;
    L_0x0015:
        r4 = r4.d;
        if (r4 != 0) goto L_0x001d;
    L_0x0019:
        r4 = defpackage.arml.f;
        goto L_0x001d;
    L_0x001c:
        r4 = r0;
    L_0x001d:
        r4 = defpackage.ajqy.a(r4);
        goto L_0x003d;
    L_0x0022:
        r4 = r4.l;
        r1 = defpackage.agqf.ACTIVE;
        if (r4 == r1) goto L_0x0029;
    L_0x0028:
        goto L_0x0003;
    L_0x0029:
        r4 = r3.o;
        r1 = r4.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x0038;
    L_0x0031:
        r4 = r4.c;
        if (r4 != 0) goto L_0x0039;
    L_0x0035:
        r4 = defpackage.arml.f;
        goto L_0x0039;
    L_0x0038:
        r4 = r0;
    L_0x0039:
        r4 = defpackage.ajqy.a(r4);
    L_0x003d:
        if (r4 != 0) goto L_0x0051;
    L_0x003f:
        r4 = r3.q;
        r1 = r4.a;
        r1 = r1 & 128;
        if (r1 == 0) goto L_0x004d;
    L_0x0047:
        r0 = r4.g;
        if (r0 != 0) goto L_0x004d;
    L_0x004b:
        r0 = defpackage.arml.f;
    L_0x004d:
        r4 = defpackage.ajqy.a(r0);
    L_0x0051:
        r0 = r3.f;
        r0.setText(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kkp.b(agqy):void");
    }

    public final void aC_() {
        this.s.c();
    }

    public final void a(agqy agqy, avsj avsj) {
        if ((agqy != null && !agqy.t()) || avsj == null || avsj.b) {
            this.s.a(true);
            this.s.a(agqy);
            b(agqy);
            return;
        }
        this.s.a(false);
        this.s.a();
    }

    public final void a(agqy agqy) {
        this.s.a(true);
        this.s.a(agqy);
        b(agqy);
    }
}
