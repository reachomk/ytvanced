package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.youtube.R;

/* renamed from: wrw */
public final class wrw extends akpl {
    private final akkq a;
    private final aaas b;
    private final Resources c;
    private final LayoutInflater d;
    private final akuh e;
    private avhe f;
    private final ViewGroup g;
    private wrz h;
    private wrz i;
    private final int j = this.c.getColor(R.color.text_color_primary_default_light);
    private final int k = this.c.getColor(R.color.text_color_secondary_default_light);
    private final int l = this.c.getColor(R.color.text_link_color);

    public wrw(Context context, akkq akkq, aaas aaas, akuh akuh) {
        this.a = akkq;
        this.b = aaas;
        this.e = akuh;
        this.c = context.getResources();
        this.d = LayoutInflater.from(context);
        this.g = new FrameLayout(context);
        this.g.setLayoutParams(new LayoutParams(-1, -2));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011b  */
    private final void a(defpackage.wrz r15) {
        /*
        r14 = this;
        r0 = r15.b;
        r1 = r14.f;
        r2 = r1.a;
        r2 = r2 & 32;
        r3 = 0;
        if (r2 == 0) goto L_0x0012;
    L_0x000b:
        r1 = r1.d;
        if (r1 != 0) goto L_0x0013;
    L_0x000f:
        r1 = defpackage.arml.f;
        goto L_0x0013;
    L_0x0012:
        r1 = r3;
    L_0x0013:
        r1 = defpackage.ajqy.a(r1);
        r0.setText(r1);
        r0 = r15.c;
        r1 = r14.f;
        r2 = r1.a;
        r2 = r2 & 64;
        if (r2 == 0) goto L_0x002b;
    L_0x0024:
        r1 = r1.e;
        if (r1 != 0) goto L_0x002c;
    L_0x0028:
        r1 = defpackage.arml.f;
        goto L_0x002c;
    L_0x002b:
        r1 = r3;
    L_0x002c:
        r1 = defpackage.ajqy.a(r1);
        defpackage.xpr.a(r0, r1);
        r0 = r15.d;
        r1 = r14.f;
        r2 = r1.a;
        r2 = r2 & 128;
        if (r2 == 0) goto L_0x0044;
    L_0x003d:
        r1 = r1.f;
        if (r1 != 0) goto L_0x0045;
    L_0x0041:
        r1 = defpackage.arml.f;
        goto L_0x0045;
    L_0x0044:
        r1 = r3;
    L_0x0045:
        r2 = r14.b;
        r4 = 0;
        r1 = defpackage.aabb.a(r1, r2, r4);
        defpackage.xpr.a(r0, r1);
        r0 = r15.e;
        r1 = r14.f;
        r1 = r1.g;
        r2 = new defpackage.arml[r4];
        r1 = r1.toArray(r2);
        r1 = (defpackage.arml[]) r1;
        r1 = defpackage.ajqy.a(r1);
        r2 = 2;
        r5 = "line.separator";
        if (r1 == 0) goto L_0x00a1;
    L_0x0066:
        r6 = r1.length;
        if (r6 <= 0) goto L_0x00a1;
    L_0x0069:
        r7 = java.lang.System.getProperty(r5);
        r9 = r3;
        r8 = 0;
    L_0x006f:
        if (r8 >= r6) goto L_0x00a2;
    L_0x0071:
        r10 = r1[r8];
        r11 = android.text.TextUtils.isEmpty(r10);
        if (r11 != 0) goto L_0x009e;
    L_0x0079:
        r11 = new android.text.SpannableString;
        r11.<init>(r10);
        r12 = new android.text.style.BulletSpan;
        r13 = 20;
        r12.<init>(r13);
        r10 = r10.length();
        r11.setSpan(r12, r4, r10, r4);
        if (r9 == 0) goto L_0x009d;
    L_0x008e:
        r10 = 3;
        r10 = new java.lang.CharSequence[r10];
        r10[r4] = r9;
        r9 = 1;
        r10[r9] = r7;
        r10[r2] = r11;
        r9 = android.text.TextUtils.concat(r10);
        goto L_0x009e;
    L_0x009d:
        r9 = r11;
    L_0x009e:
        r8 = r8 + 1;
        goto L_0x006f;
    L_0x00a1:
        r9 = r3;
    L_0x00a2:
        defpackage.xpr.a(r0, r9);
        r0 = r15.f;
        r1 = java.lang.System.getProperty(r5);
        r5 = r14.f;
        r5 = r5.h;
        r6 = new defpackage.arml[r4];
        r5 = r5.toArray(r6);
        r5 = (defpackage.arml[]) r5;
        r6 = r14.b;
        r5 = defpackage.aabb.a(r5, r6);
        r1 = defpackage.ajqy.a(r1, r5);
        defpackage.xpr.a(r0, r1);
        r0 = r14.f;
        r1 = r0.a;
        r1 = r1 & r2;
        if (r1 == 0) goto L_0x00e0;
    L_0x00cb:
        r0 = r0.b;
        if (r0 != 0) goto L_0x00d1;
    L_0x00cf:
        r0 = defpackage.avhc.c;
    L_0x00d1:
        r1 = r0.a;
        r2 = 118483990; // 0x70fec16 float:1.0827504E-34 double:5.8538869E-316;
        if (r1 != r2) goto L_0x00de;
    L_0x00d8:
        r0 = r0.b;
        r3 = r0;
        r3 = (defpackage.apfb) r3;
        goto L_0x00e0;
    L_0x00de:
        r3 = defpackage.apfb.f;
    L_0x00e0:
        r0 = r14.e;
        r0 = r0.a;
        r0 = r0.c();
        r1 = r15.b;
        r0 = r0.a(r1);
        r1 = r14.j;
        r0 = r0.a(r1);
        r1 = r15.d;
        r0 = r0.b(r1);
        r1 = r14.k;
        r0 = r0.b(r1);
        r1 = r14.l;
        r0 = r0.c(r1);
        r0 = r0.b();
        r0.a(r3);
        r0 = r14.f;
        r0 = r0.c;
        if (r0 != 0) goto L_0x0115;
    L_0x0113:
        r0 = defpackage.aygk.f;
    L_0x0115:
        r0 = defpackage.aklb.a(r0);
        if (r0 == 0) goto L_0x0145;
    L_0x011b:
        r0 = r14.f;
        r0 = r0.c;
        if (r0 != 0) goto L_0x0123;
    L_0x0121:
        r0 = defpackage.aygk.f;
    L_0x0123:
        r0 = defpackage.aklb.g(r0);
        r1 = 0;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x0130;
    L_0x012c:
        r1 = r15.h;
        r1.a = r0;
    L_0x0130:
        r0 = r14.a;
        r1 = r15.g;
        r2 = r14.f;
        r2 = r2.c;
        if (r2 != 0) goto L_0x013c;
    L_0x013a:
        r2 = defpackage.aygk.f;
    L_0x013c:
        r0.a(r1, r2);
        r0 = r15.g;
        r0.setVisibility(r4);
        goto L_0x0153;
    L_0x0145:
        r0 = r14.a;
        r1 = r15.g;
        r0.a(r1);
        r0 = r15.g;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0153:
        r0 = r14.g;
        r0.removeAllViews();
        r0 = r14.g;
        r15 = r15.a;
        r0.addView(r15);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wrw.a(wrz):void");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        this.f = (avhe) obj;
        if (this.c.getConfiguration().orientation == 1) {
            if (this.h == null) {
                this.h = new wrz(this.d.inflate(R.layout.music_key_promo_feature_item, this.g, false));
            }
            a(this.h);
            return;
        }
        if (this.i == null) {
            this.i = new wrz(this.d.inflate(R.layout.music_key_promo_feature_item, this.g, false));
        }
        a(this.i);
    }
}
