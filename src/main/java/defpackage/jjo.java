package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jjo */
public final class jjo extends nd implements OnClickListener, xcp {
    public dvg Z;
    public bcaa aa;
    public bcaa ab;
    public bcaa ac;
    public bcaa ad;
    public xci ae;
    public fag af;
    public aeag ag;
    public akpe ah;
    public SharedPreferences ai;
    public afpu aj;
    public fga ak;
    public aaas al;
    public apxu am;
    public apxu an;
    private ajxh ao;
    private akpd ap;
    private akoh aq;
    private Spanned ar;
    private Spanned as;
    private Spanned at;
    private Spanned au;
    private View av;
    private RecyclerView aw;
    private boolean ax;
    private akph ay;
    private Toolbar az;

    public final void W_() {
        super.W_();
        Window window = this.c.getWindow();
        if (window != null) {
            W();
            window.setWindowAnimations(R.style.SlideUpDownAnimation);
        }
        this.ak.a(1);
    }

    public final void X_() {
        super.X_();
        this.ae.b(this);
    }

    public final void ad_() {
        super.ad_();
        dismiss();
    }

    public final Dialog a(Bundle bundle) {
        if (this.ax) {
            return new ff(p(), this.a);
        }
        return super.a(bundle);
    }

    public final void N_() {
        super.N_();
        this.ak.b(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d9  */
    public final void b(android.os.Bundle r8) {
        /*
        r7 = this;
        super.b(r8);
        r8 = r7.p();
        r8 = defpackage.xse.a(r8);
        r8 = (defpackage.jjt) r8;
        r8.a(r7);
        r8 = r7.ae;
        r8.a(r7);
        r8 = r7.j;
        if (r8 == 0) goto L_0x0053;
    L_0x0019:
        r0 = "MenuButtonRendererKey";
        r1 = r8.containsKey(r0);
        if (r1 == 0) goto L_0x0053;
    L_0x0021:
        r8 = r8.getByteArray(r0);
        r0 = new akbb;	 Catch:{ aocg -> 0x0034 }
        r0.<init>();	 Catch:{ aocg -> 0x0034 }
        defpackage.aocf.mergeFrom(r0, r8);	 Catch:{ aocg -> 0x0034 }
        r8 = r0.c;	 Catch:{ aocg -> 0x0034 }
        r8 = r8.a;	 Catch:{ aocg -> 0x0034 }
        r7.ao = r8;	 Catch:{ aocg -> 0x0034 }
        goto L_0x005a;
    L_0x0034:
        r8 = move-exception;
        r8 = r8.toString();
        r8 = java.lang.String.valueOf(r8);
        r0 = "Unable to decode menu items: ";
        r1 = r8.length();
        if (r1 != 0) goto L_0x004b;
    L_0x0045:
        r8 = new java.lang.String;
        r8.<init>(r0);
        goto L_0x004f;
    L_0x004b:
        r8 = r0.concat(r8);
    L_0x004f:
        defpackage.xtl.c(r8);
        goto L_0x005a;
    L_0x0053:
        r8 = new ajxh;
        r8.<init>();
        r7.ao = r8;
    L_0x005a:
        r8 = new akpk;
        r8.<init>();
        r0 = new akoh;
        r0.<init>();
        r7.aq = r0;
        r0 = r7.ao;
        r0 = r0.a;
        if (r0 != 0) goto L_0x006d;
    L_0x006c:
        goto L_0x007b;
    L_0x006d:
        r1 = r0.a;
        r2 = 77195710; // 0x499e9be float:3.6184785E-36 double:3.81397483E-316;
        if (r1 != r2) goto L_0x007b;
    L_0x0074:
        r0 = r0.b;
        r0 = (defpackage.aofj) r0;
        r8.add(r0);
    L_0x007b:
        r0 = r7.aq;
        r0.a(r8);
        r8 = r7.ao;
        r8 = r8.b;
        r8 = r8.length;
        r0 = 0;
        r1 = 0;
    L_0x0087:
        if (r1 >= r8) goto L_0x00d9;
    L_0x0089:
        r2 = r7.ao;
        r2 = r2.b;
        r2 = r2[r1];
        r3 = new akpk;
        r3.<init>();
        r2 = r2.b;
        r2 = r2.a;
        r2 = r2.iterator();
    L_0x009c:
        r4 = r2.hasNext();
        if (r4 == 0) goto L_0x00c5;
    L_0x00a2:
        r4 = r2.next();
        r4 = (defpackage.avdr) r4;
        r5 = r4.a;
        r6 = 94317419; // 0x59f2b6b float:1.4968237E-35 double:4.65989965E-316;
        if (r5 != r6) goto L_0x00b6;
    L_0x00af:
        r5 = r4.b;
        r5 = (defpackage.apaj) r5;
        r3.add(r5);
    L_0x00b6:
        r5 = r4.a;
        r6 = 79129962; // 0x4b76d6a float:4.3123574E-36 double:3.9095396E-316;
        if (r5 != r6) goto L_0x009c;
    L_0x00bd:
        r4 = r4.b;
        r4 = (defpackage.aqeq) r4;
        r3.add(r4);
        goto L_0x009c;
    L_0x00c5:
        r2 = r8 + -1;
        if (r1 >= r2) goto L_0x00d1;
    L_0x00c9:
        r2 = new kjt;
        r2.<init>();
        r3.add(r2);
    L_0x00d1:
        r2 = r7.aq;
        r2.a(r3);
        r1 = r1 + 1;
        goto L_0x0087;
    L_0x00d9:
        r8 = new akph;
        r8.<init>();
        r7.ay = r8;
        r8 = r7.ay;
        r1 = defpackage.aofj.class;
        r2 = new akpa;
        r3 = r7.aa;
        r2.<init>(r3);
        r8.a(r1, r2);
        r8 = r7.ay;
        r1 = defpackage.aqeq.class;
        r2 = new akpa;
        r3 = r7.ab;
        r2.<init>(r3);
        r8.a(r1, r2);
        r8 = r7.ay;
        r1 = defpackage.apaj.class;
        r2 = new akpa;
        r3 = r7.ac;
        r2.<init>(r3);
        r8.a(r1, r2);
        r8 = r7.ay;
        r1 = defpackage.kjt.class;
        r2 = new akpa;
        r3 = r7.ad;
        r2.<init>(r3);
        r8.a(r1, r2);
        r8 = r7.ah;
        r1 = r7.ay;
        r8 = r8.a(r1);
        r7.ap = r8;
        r8 = r7.ap;
        r1 = r7.aq;
        r8.a(r1);
        r8 = r7.ao;
        r1 = 2;
        if (r8 == 0) goto L_0x0152;
    L_0x012e:
        r8 = r8.e;
        if (r8 != 0) goto L_0x0133;
    L_0x0132:
        goto L_0x0152;
    L_0x0133:
        r2 = r8.a;
        r3 = 123890900; // 0x7626cd4 float:1.7034332E-34 double:6.12102375E-316;
        if (r2 != r3) goto L_0x0152;
    L_0x013a:
        r8 = r8.b;
        r8 = (defpackage.avdx) r8;
        r2 = r8.a;
        r2 = r2 & r1;
        if (r2 != 0) goto L_0x0145;
    L_0x0143:
        r8 = 0;
        goto L_0x014c;
    L_0x0145:
        r8 = r8.b;
        if (r8 == 0) goto L_0x014a;
    L_0x0149:
        goto L_0x014c;
    L_0x014a:
        r8 = defpackage.arml.f;
    L_0x014c:
        r8 = defpackage.ajqy.a(r8);
        r7.ar = r8;
    L_0x0152:
        r8 = r7.ao;
        r8 = r8.d;
        if (r8 != 0) goto L_0x015a;
    L_0x0158:
        goto L_0x01cf;
    L_0x015a:
        r2 = r8.a;
        r3 = 88571644; // 0x5477efc float:9.3802584E-36 double:4.37602065E-316;
        if (r2 != r3) goto L_0x0171;
    L_0x0161:
        r2 = r8.b;
        r2 = (defpackage.aulk) r2;
        r2 = r2.b;
        if (r2 != 0) goto L_0x016b;
    L_0x0169:
        r2 = defpackage.arml.f;
    L_0x016b:
        r2 = defpackage.ajqy.a(r2);
        r7.as = r2;
    L_0x0171:
        r2 = r8.a;
        r3 = 242554289; // 0xe7515b1 float:3.0209026E-30 double:1.198377414E-315;
        if (r2 != r3) goto L_0x017d;
    L_0x0178:
        r2 = r8.b;
        r2 = (defpackage.awnz) r2;
        goto L_0x017f;
    L_0x017d:
        r2 = defpackage.awnz.g;
    L_0x017f:
        r8 = r8.a;
        if (r8 != r3) goto L_0x01cf;
    L_0x0183:
        r8 = r2.a;
        r8 = r8 & 4;
        if (r8 == 0) goto L_0x01a7;
    L_0x0189:
        r8 = r2.d;
        if (r8 != 0) goto L_0x018f;
    L_0x018d:
        r8 = defpackage.axak.a;
    L_0x018f:
        r8 = defpackage.ajzv.a(r8);
        r3 = defpackage.aulk.class;
        r8 = defpackage.ajzv.a(r8, r3);
        r8 = (defpackage.aulk) r8;
        r8 = r8.b;
        if (r8 != 0) goto L_0x01a1;
    L_0x019f:
        r8 = defpackage.arml.f;
    L_0x01a1:
        r8 = defpackage.ajqy.a(r8);
        r7.as = r8;
    L_0x01a7:
        r8 = r2.b;
        if (r8 != 0) goto L_0x01ad;
    L_0x01ab:
        r8 = defpackage.arml.f;
    L_0x01ad:
        r8 = defpackage.ajqy.a(r8);
        r7.at = r8;
        r8 = r2.c;
        if (r8 != 0) goto L_0x01b9;
    L_0x01b7:
        r8 = defpackage.arml.f;
    L_0x01b9:
        r8 = defpackage.ajqy.a(r8);
        r7.au = r8;
        r8 = r2.e;
        if (r8 != 0) goto L_0x01c5;
    L_0x01c3:
        r8 = defpackage.apxu.d;
    L_0x01c5:
        r7.an = r8;
        r8 = r2.f;
        if (r8 != 0) goto L_0x01cd;
    L_0x01cb:
        r8 = defpackage.apxu.d;
    L_0x01cd:
        r7.am = r8;
    L_0x01cf:
        r8 = r7.aj;
        r8 = r8.g();
        r7.ax = r8;
        if (r8 != 0) goto L_0x0208;
    L_0x01d9:
        r8 = r7.M_();
        r8 = defpackage.xss.b(r8);
        r2 = r7.ai;
        r2 = defpackage.fmv.a(r2);
        if (r2 == r1) goto L_0x01f9;
    L_0x01e9:
        if (r8 != 0) goto L_0x01f2;
    L_0x01eb:
        r8 = 2132018040; // 0x7f140378 float:1.9674375E38 double:1.05335687E-314;
        r7.a(r0, r8);
        goto L_0x0208;
    L_0x01f2:
        r8 = 2132018041; // 0x7f140379 float:1.9674377E38 double:1.0533568704E-314;
        r7.a(r0, r8);
        return;
    L_0x01f9:
        if (r8 != 0) goto L_0x0202;
    L_0x01fb:
        r8 = 2132018025; // 0x7f140369 float:1.9674345E38 double:1.0533568625E-314;
        r7.a(r0, r8);
        return;
    L_0x0202:
        r8 = 2132018026; // 0x7f14036a float:1.9674347E38 double:1.053356863E-314;
        r7.a(r0, r8);
    L_0x0208:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jjo.b(android.os.Bundle):void");
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.av = layoutInflater.inflate(R.layout.multi_page_menu_dialog_fragment, viewGroup, false);
        this.aw = (RecyclerView) this.av.findViewById(R.id.list);
        this.az = (Toolbar) this.av.findViewById(R.id.toolbar);
        this.aw.a(this.ap);
        this.aw.a(new ans());
        this.aw.setOnClickListener(this);
        if (this.ao.a == null) {
            this.aw.setPaddingRelative(0, M_().getResources().getDimensionPixelSize(R.dimen.list_item_vpadding), 0, 0);
        }
        faa faa = this.af.b;
        this.az.b(faa.d().a(p()));
        this.az.setBackgroundColor(faa.a().a(p()));
        this.az.a((OnClickListener) this);
        this.az.a(this.ar);
        this.az.c((int) R.string.accessibility_close_button);
        xoe xoe = new xoe(M_());
        this.az.b(xoe.a(q().getDrawable(R.drawable.quantum_ic_close_white_24), faa.g().a(p())));
        if (this.ax) {
            this.az.setVisibility(8);
        }
        TextView textView = (TextView) this.av.findViewById(R.id.lugash_footer);
        Spanned spanned = this.as;
        if (spanned != null) {
            textView.setText(spanned);
            textView.setVisibility(0);
        }
        if (!(this.at == null || this.an == null || this.au == null || this.am == null)) {
            ((LinearLayout) this.av.findViewById(R.id.privacy_tos_footer)).setVisibility(0);
            textView = (TextView) this.av.findViewById(R.id.privacy_footer);
            TextView textView2 = (TextView) this.av.findViewById(R.id.tos_footer);
            textView.setText(this.at);
            textView.setOnClickListener(new jjr(this));
            textView2.setText(this.au);
            textView2.setOnClickListener(new jjq(this));
        }
        this.Z.t().a(this.ao.c, null);
        return this.av;
    }

    public final void onClick(View view) {
        dismiss();
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        W();
    }

    private final void W() {
        Context M_ = M_();
        Dialog dialog = this.c;
        Window window = dialog != null ? dialog.getWindow() : null;
        if (window != null && xss.b(M_)) {
            window.setLayout((int) (((float) xss.f(M_)) * 0.7f), (int) (((float) xss.g(M_)) * 0.7f));
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{ftj.class, uyw.class, aeaj.class};
        } else if (i == 0) {
            dismiss();
        } else if (i != 1) {
            if (i == 2) {
                dismiss();
                this.ag.b();
            } else {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            }
        } else if (((uyw) obj).b) {
            dismiss();
            return null;
        }
        return clsArr;
    }
}
