package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;

/* renamed from: jsj */
public final class jsj implements vcy, vdc {
    private final bapu a;
    private final akde b;
    private ViewGroup c;
    private swo d;
    private boolean e;
    private int f = 1;

    public jsj(akde akde, bapu bapu) {
        this.a = bapu;
        this.b = akde;
    }

    public final void a(View view, akor akor) {
        ViewGroup viewGroup = this.c;
        if (viewGroup == null || viewGroup.getParent() != view) {
            b(view);
            this.c = (ViewGroup) xpr.a(view, (int) R.id.element_companion_card_stub, (int) R.id.element_companion_card);
            this.c.addView(this.b.K_());
        }
        c();
        this.b.a_(akor, this.d);
    }

    public final void a() {
        this.e = true;
        c();
    }

    public final void b() {
        c();
    }

    public final void a(View view) {
        b(view);
        this.c = null;
        this.d = null;
        this.f = 1;
        this.e = false;
    }

    public final boolean a(aaga aaga, aakj aakj) {
        arbs arbs = null;
        ajxu ajxu = aakj != null ? aakj.a : null;
        if (ajxu != null) {
            ajxp ajxp = ajxu.v;
            if (ajxp != null) {
                arbs = ajxp.d;
            }
        }
        return a(arbs);
    }

    public final boolean a(aaga aaga, akcb akcb) {
        ajtb ajtb = akcb.f;
        return a(ajtb != null ? ajtb.e : null);
    }

    private final void b(View view) {
        ViewGroup viewGroup;
        if (view != null) {
            viewGroup = (ViewGroup) xpr.a(view, (int) R.id.element_companion_card_stub, (int) R.id.element_companion_card);
            viewGroup.setVisibility(8);
            viewGroup.removeAllViews();
        }
        viewGroup = this.c;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.c.setVisibility(8);
            this.b.a(null);
            this.b.K_().setVisibility(8);
        }
    }

    private final void c() {
        ViewGroup viewGroup = this.c;
        if (viewGroup != null) {
            int i = 8;
            viewGroup.setVisibility(!this.e ? 8 : 0);
            View K_ = this.b.K_();
            if (this.e) {
                i = 0;
            }
            K_.setVisibility(i);
        }
    }

    /* JADX WARNING: Missing block: B:14:0x003e, code skipped:
            if (r3 != 0) goto L_0x0040;
     */
    private final boolean a(defpackage.arbs r3) {
        /*
        r2 = this;
        r0 = 0;
        if (r3 == 0) goto L_0x0043;
    L_0x0003:
        r1 = r2.a;
        r1 = r1.get();
        r1 = (defpackage.akdk) r1;
        r1 = r1.b(r3);
        r1 = r1.a();
        if (r1 != 0) goto L_0x0043;
    L_0x0015:
        r0 = r2.a;
        r0 = r0.get();
        r0 = (defpackage.akdk) r0;
        r0 = r0.b(r3);
        r2.d = r0;
        r0 = r3.e;
        if (r0 != 0) goto L_0x0029;
    L_0x0027:
        r0 = defpackage.arbu.g;
    L_0x0029:
        r0 = r0.a;
        r0 = r0 & 128;
        r1 = 1;
        if (r0 != 0) goto L_0x0032;
    L_0x0030:
        r3 = 1;
        goto L_0x0040;
    L_0x0032:
        r3 = r3.e;
        if (r3 != 0) goto L_0x0038;
    L_0x0036:
        r3 = defpackage.arbu.g;
    L_0x0038:
        r3 = r3.d;
        r3 = defpackage.aqhe.a(r3);
        if (r3 == 0) goto L_0x0030;
    L_0x0040:
        r2.f = r3;
        return r1;
    L_0x0043:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsj.a(arbs):boolean");
    }

    public final int a(vow vow, boolean z) {
        return jst.a(vow.b, z, this.f);
    }
}
