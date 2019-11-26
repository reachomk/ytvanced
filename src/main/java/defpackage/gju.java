package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.libraries.youtube.edit.ui.RoundedCornersEditText;
import com.google.android.youtube.R;

/* renamed from: gju */
public final class gju implements OnClickListener, gba, gjs {
    public static final Typeface a = Typeface.create("sans-serif-black", 0);
    private final acvx A;
    private final SharedPreferences B;
    private bacy C;
    private babk D = babk.CLASSIC;
    public final Activity b;
    public final nf c;
    public final gkp d;
    public final gaz e;
    public final gkf f = new gkf();
    public final gkj g;
    public final zzl h;
    public View i;
    public RoundedCornersEditText j;
    public View k;
    public View l;
    public ImageView m;
    public View n;
    public View o;
    public LinearLayout p;
    public View q;
    public ImageView r;
    public TextView s;
    public SeekBar t;
    public boolean u;
    public boolean v;
    public boolean w;
    public gke x;
    private final zrp y;
    private final gkd z;

    gju(nf nfVar, zrp zrp, gkp gkp, gaz gaz, gkd gkd, acvx acvx, SharedPreferences sharedPreferences, zzl zzl, gkj gkj) {
        this.y = zrp;
        this.d = gkp;
        this.e = gaz;
        this.e.d = this;
        this.z = gkd;
        this.c = nfVar;
        this.b = nfVar.p();
        this.A = acvx;
        this.B = sharedPreferences;
        this.h = zzl;
        this.g = gkj;
    }

    public final void a(bacz bacz) {
        badg badg;
        this.C = gju.b(bacz);
        bacx b = this.C.b();
        if (b.b == 1) {
            badg = (badg) b.c;
        } else {
            badg = badg.k;
        }
        b(badg.b.isEmpty());
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02eb  */
    private final void d() {
        /*
        r17 = this;
        r0 = r17;
        r1 = r0.C;
        if (r1 == 0) goto L_0x0368;
    L_0x0006:
        r1 = r0.j;
        r1 = r1.getText();
        r1 = r1.length();
        r2 = 4;
        if (r1 <= 0) goto L_0x0338;
    L_0x0013:
        r1 = r0.j;
        r1.clearComposingText();
        r1 = r0.j;
        r3 = 0;
        r1.setCursorVisible(r3);
        r1 = r0.y;
        r5 = r1.a();
        r1 = r0.b;
        r10 = r0.j;
        r8 = r0.C;
        r11 = new gjw;
        r11.<init>(r0);
        r4 = 1;
        r10.setDrawingCacheEnabled(r4);
        r10.buildDrawingCache(r4);
        r6 = r10.getContext();
        r7 = r10.getWidth();
        r9 = r10.getLayout();
        r9 = r9.getHeight();
        r12 = r10.getParent();
        r12 = (android.widget.LinearLayout) r12;
        r12.removeView(r10);
        r13 = r10.getLayoutParams();
        r14 = new android.widget.FrameLayout$LayoutParams;
        r14.<init>(r7, r9);
        r10.setLayoutParams(r14);
        r10.scrollTo(r3, r3);
        r14 = defpackage.zmb.a(r6, r10);
        r12.addView(r10);
        r10.setLayoutParams(r13);
        r6 = r10.getTextAlignment();
        r7 = 5;
        if (r6 == r7) goto L_0x007a;
    L_0x006f:
        r6 = r10.getTextAlignment();
        r7 = 6;
        if (r6 != r7) goto L_0x0078;
    L_0x0076:
        r6 = 4;
        goto L_0x007b;
    L_0x0078:
        r6 = 3;
        goto L_0x007b;
    L_0x007a:
        r6 = 2;
    L_0x007b:
        r7 = r10.getTextSize();
        r12 = r1.getResources();
        r12 = r12.getDisplayMetrics();
        r12 = r12.scaledDensity;
        r7 = r7 / r12;
        r12 = r10.getText();
        r12 = r12.toString();
        r13 = r8.b();
        r15 = r13.b;
        if (r15 != r4) goto L_0x009f;
    L_0x009a:
        r13 = r13.c;
        r13 = (defpackage.badg) r13;
        goto L_0x00a1;
    L_0x009f:
        r13 = defpackage.badg.k;
    L_0x00a1:
        r13 = r13.toBuilder();
        r13 = (defpackage.anxo) r13;
        r13 = (defpackage.badj) r13;
        r13.copyOnWrite();
        r15 = r13.instance;
        r15 = (defpackage.badg) r15;
        if (r12 == 0) goto L_0x0332;
    L_0x00b2:
        r9 = r15.a;
        r9 = r9 | r4;
        r15.a = r9;
        r15.b = r12;
        r9 = java.util.Locale.getDefault();
        r9 = r9.toString();
        r13.copyOnWrite();
        r12 = r13.instance;
        r12 = (defpackage.badg) r12;
        if (r9 == 0) goto L_0x032c;
    L_0x00ca:
        r15 = r12.a;
        r15 = r15 | r2;
        r12.a = r15;
        r12.c = r9;
        r9 = r8.instance;
        r9 = (defpackage.bacz) r9;
        r9 = r9.a;
        r9 = r9 & 8;
        if (r9 == 0) goto L_0x0194;
    L_0x00db:
        r9 = r12.g;
        r9 = defpackage.baak.a(r9);
        if (r9 == 0) goto L_0x00e4;
    L_0x00e3:
        goto L_0x00e5;
    L_0x00e4:
        r9 = 1;
    L_0x00e5:
        if (r9 != r6) goto L_0x0194;
    L_0x00e7:
        r9 = r13.instance;
        r9 = (defpackage.badg) r9;
        r9 = r9.i;
        r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r9 != 0) goto L_0x00f3;
    L_0x00f1:
        goto L_0x020f;
    L_0x00f3:
        r9 = defpackage.zlw.a(r1);
        r12 = defpackage.zlw.a(r10);
        r2 = r8.instance;
        r2 = (defpackage.bacz) r2;
        r2 = r2.e;
        if (r2 != 0) goto L_0x0105;
    L_0x0103:
        r2 = defpackage.aocz.f;
    L_0x0105:
        r12 = r12.height();
        r12 = (float) r12;
        r4 = r9.width();
        r9 = r9.height();
        r4 = java.lang.Math.min(r4, r9);
        r4 = (float) r4;
        r12 = r12 / r4;
        r4 = r2.d;
        r4 = r4.c(r3);
        r12 = r12 / r4;
        r4 = new android.graphics.Matrix;
        r4.<init>();
        r9 = r2.d;
        r3 = r9 instanceof defpackage.anhc;
        if (r3 != 0) goto L_0x0147;
    L_0x012a:
        r3 = r9.toArray();
        r9 = r3.length;
        r15 = new float[r9];
        r0 = 0;
    L_0x0132:
        if (r0 >= r9) goto L_0x0145;
    L_0x0134:
        r16 = r3[r0];
        r16 = defpackage.amqw.a(r16);
        r16 = (java.lang.Number) r16;
        r16 = r16.floatValue();
        r15[r0] = r16;
        r0 = r0 + 1;
        goto L_0x0132;
    L_0x0145:
        r3 = 0;
        goto L_0x014d;
    L_0x0147:
        r0 = 0;
        r3 = 0;
        r15 = java.util.Arrays.copyOfRange(r0, r3, r3);
    L_0x014d:
        r4.setValues(r15);
        r0 = 2;
        r0 = new float[r0];
        r0 = {1056964608, 1056964608};
        r4.mapPoints(r0);
        r9 = r0[r3];
        r15 = 1;
        r0 = r0[r15];
        r4.preScale(r12, r12, r9, r0);
        r0 = 9;
        r9 = new float[r0];
        r4.getValues(r9);
        r2 = r2.toBuilder();
        r2 = (defpackage.anxo) r2;
        r2 = (defpackage.aodc) r2;
        r2.copyOnWrite();
        r4 = r2.instance;
        r4 = (defpackage.aocz) r4;
        r12 = defpackage.anxl.emptyFloatList();
        r4.d = r12;
    L_0x017d:
        if (r3 >= r0) goto L_0x0187;
    L_0x017f:
        r4 = r9[r3];
        r2.a(r4);
        r3 = r3 + 1;
        goto L_0x017d;
    L_0x0187:
        r0 = r2.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aocz) r0;
        r8.a(r0);
        goto L_0x020f;
    L_0x0194:
        r0 = defpackage.zlw.a(r1);
        r2 = defpackage.zlw.a(r10);
        r3 = r0.width();
        r4 = r0.height();
        r3 = java.lang.Math.min(r3, r4);
        r4 = r2.height();
        r4 = (float) r4;
        r3 = (float) r3;
        r4 = r4 / r3;
        r3 = defpackage.aocz.f;
        r3 = r3.createBuilder();
        r3 = (defpackage.aodc) r3;
        r3.a();
        r3.b();
        r9 = 2;
        r3.a(r9);
        r2 = r2.width();
        r2 = (float) r2;
        r0 = r0.width();
        r0 = (float) r0;
        r2 = r2 / r0;
        r0 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r9 = r0 - r2;
        r2 = r2 * r4;
        r9 = r9 - r2;
        r2 = 1073741824; // 0x40000000 float:2.0 double:5.304989477E-315;
        r9 = r9 / r2;
        r12 = 0;
        r9 = java.lang.Math.max(r9, r12);
        r15 = 2;
        if (r6 != r15) goto L_0x01e0;
    L_0x01de:
        r9 = -r9;
        goto L_0x01e5;
    L_0x01e0:
        r15 = 4;
        if (r6 != r15) goto L_0x01e4;
    L_0x01e3:
        goto L_0x01e5;
    L_0x01e4:
        r9 = 0;
    L_0x01e5:
        r3.a(r4);
        r3.a(r12);
        r15 = r0 - r4;
        r15 = r15 / r2;
        r9 = r9 + r15;
        r3.a(r9);
        r3.a(r12);
        r3.a(r4);
        r3.a(r15);
        r3.a(r12);
        r3.a(r12);
        r3.a(r0);
        r0 = r3.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.aocz) r0;
        r8.a(r0);
    L_0x020f:
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.badg) r0;
        r2 = r0.a;
        r2 = r2 | 1024;
        r0.a = r2;
        r0.i = r7;
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.badg) r0;
        r2 = r0.a;
        r2 = r2 | 256;
        r0.a = r2;
        r6 = r6 + -1;
        r0.g = r6;
        r0 = r10.getCurrentTextColor();
        r2 = defpackage.aocv.f;
        r2 = r2.createBuilder();
        r2 = (defpackage.aocy) r2;
        r3 = android.graphics.Color.red(r0);
        r3 = (double) r3;
        r2.a(r3);
        r3 = android.graphics.Color.green(r0);
        r3 = (double) r3;
        r2.b(r3);
        r3 = android.graphics.Color.blue(r0);
        r3 = (double) r3;
        r2.c(r3);
        r0 = android.graphics.Color.alpha(r0);
        r3 = (double) r0;
        r2.d(r3);
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.badg) r0;
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.aocv) r2;
        r0.d = r2;
        r2 = r0.a;
        r2 = r2 | 8;
        r0.a = r2;
        r0 = r10.getBackground();
        r2 = r0 instanceof android.graphics.drawable.ColorDrawable;
        if (r2 == 0) goto L_0x02bf;
    L_0x027a:
        r0 = (android.graphics.drawable.ColorDrawable) r0;
        r0 = r0.getColor();
        r2 = defpackage.aocv.f;
        r2 = r2.createBuilder();
        r2 = (defpackage.aocy) r2;
        r3 = android.graphics.Color.red(r0);
        r3 = (double) r3;
        r2.a(r3);
        r3 = android.graphics.Color.green(r0);
        r3 = (double) r3;
        r2.b(r3);
        r3 = android.graphics.Color.blue(r0);
        r3 = (double) r3;
        r2.c(r3);
        r0 = android.graphics.Color.alpha(r0);
        r3 = (double) r0;
        r2.d(r3);
        r13.copyOnWrite();
        r0 = r13.instance;
        r0 = (defpackage.badg) r0;
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.aocv) r2;
        r0.e = r2;
        r2 = r0.a;
        r2 = r2 | 16;
        r0.a = r2;
    L_0x02bf:
        r0 = r8.b();
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.bacw) r0;
        r0.a(r13);
        r8.a(r0);
        r0 = new zlv;
        r4 = r0;
        r6 = r1;
        r7 = r13;
        r9 = r14;
        r4.<init>(r5, r6, r7, r8, r9, r10, r11);
        defpackage.zkw.a(r1, r14, r0);
        r0 = r17;
        r1 = r0.j;
        r2 = 4;
        r1.setVisibility(r2);
        r1 = r0.v;
        if (r1 != 0) goto L_0x02eb;
    L_0x02e9:
        r1 = 0;
        goto L_0x0329;
    L_0x02eb:
        r1 = r0.j;
        r1 = r1.getBackground();
        r1 = (android.graphics.drawable.ColorDrawable) r1;
        r2 = r0.B;
        r2 = r2.edit();
        r3 = r0.j;
        r3 = r3.getCurrentTextColor();
        r4 = "TEXT_COLOR";
        r2 = r2.putInt(r4, r3);
        r1 = r1.getColor();
        r3 = "BACKGROUND_COLOR";
        r1 = r2.putInt(r3, r1);
        r2 = r0.j;
        r2 = r2.getTextAlignment();
        r3 = "ALIGNMENT";
        r1 = r1.putInt(r3, r2);
        r2 = r0.D;
        r2 = r2.h;
        r3 = "FONT_FAMILY";
        r1 = r1.putInt(r3, r2);
        r1.apply();
        goto L_0x02e9;
    L_0x0329:
        r0.C = r1;
        goto L_0x033b;
    L_0x032c:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        throw r1;
    L_0x0332:
        r1 = new java.lang.NullPointerException;
        r1.<init>();
        throw r1;
    L_0x0338:
        r17.b();
    L_0x033b:
        r1 = r0.u;
        if (r1 == 0) goto L_0x0368;
    L_0x033f:
        r1 = r0.b;
        r2 = 2130839067; // 0x7f02061b float:1.7283134E38 double:1.05277438E-314;
        r1 = r1.getDrawable(r2);
        r2 = r0.q;
        r3 = r0.b;
        r4 = 2131953693; // 0x7f13081d float:1.9543864E38 double:1.053325078E-314;
        r3 = r3.getString(r4);
        r2.setContentDescription(r3);
        r2 = r0.r;
        r2.setImageDrawable(r1);
        r1 = r0.j;
        r2 = 4;
        r1.setTextAlignment(r2);
        r1 = r0.p;
        r2 = 17;
        r1.setGravity(r2);
    L_0x0368:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gju.d():void");
    }

    private final void b(boolean z) {
        int i;
        babk a;
        String str;
        int i2;
        float f;
        float f2;
        int i3 = 4;
        int i4;
        if (z && this.v) {
            i = this.B.getInt("TEXT_COLOR", 0);
            i4 = this.B.getInt("BACKGROUND_COLOR", 0);
            i3 = this.B.getInt("ALIGNMENT", 4);
            a = babk.a(this.B.getInt("FONT_FAMILY", 0));
            if (a == null) {
                a = babk.FONT_FAMILY_UNSPECIFIED;
            }
            a(true);
            str = "";
            i2 = i4;
            f = 36.0f;
        } else {
            bacx b = this.C.b();
            badg badg = b.b == 1 ? (badg) b.c : badg.k;
            i4 = baak.a(badg.g);
            if (i4 == 0) {
                i4 = 1;
            }
            if (i4 == 2) {
                i3 = 5;
            } else if (i4 == 4) {
                i3 = 6;
            }
            babk a2 = babk.a(badg.h);
            if (a2 == null) {
                a2 = babk.FONT_FAMILY_UNSPECIFIED;
            }
            a = a2;
            f = badg.i;
            str = badg.b;
            aocv aocv = badg.d;
            if (aocv == null) {
                aocv = aocv.f;
            }
            i2 = gju.a(aocv);
            aocv aocv2 = badg.e;
            if (aocv2 == null) {
                aocv2 = aocv.f;
            }
            int i5 = i2;
            i2 = gju.a(aocv2);
            i = i5;
        }
        this.j.setEnabled(true);
        this.A.a(acwl.ay, null, null);
        Drawable drawable = this.b.getDrawable(R.drawable.quantum_ic_format_align_left_white_24);
        Drawable drawable2 = this.b.getDrawable(R.drawable.quantum_ic_format_align_right_white_24);
        if (this.u) {
            this.j.setTextAlignment(i3);
            if (i3 == 5) {
                this.r.setImageDrawable(drawable);
                this.p.setGravity(3);
            } else if (i3 == 6) {
                this.r.setImageDrawable(drawable2);
                this.p.setGravity(5);
            }
            if (a == babk.FONT_FAMILY_UNSPECIFIED) {
                a = babk.CLASSIC;
            }
            this.D = a;
            Typeface a3 = this.f.a(this.D);
            if (a3 == null) {
                this.D = babk.CLASSIC;
                a3 = this.f.a(this.D);
            }
            this.j.setTypeface(a3);
            this.s.setText(((gki) this.f.get(this.D)).a);
            bacx b2 = this.C.b();
            badj badj = (badj) ((anxo) (b2.b == 1 ? (badg) b2.c : badg.k).toBuilder());
            badj.a(this.D);
            badg badg2 = (badg) ((anxl) badj.build());
            bacy bacy = this.C;
            bacw bacw = (bacw) ((anxo) bacy.b().toBuilder());
            bacw.a(badg2);
            bacy.a(bacw);
            f2 = f == 0.0f ? 36.0f : f;
            this.t.setProgress((int) (-12.0f + f2));
        } else {
            gkp gkp = this.d;
            amqw.a(gkp.e);
            amqw.a(gkp.c);
            amqw.a(gkp.f);
            gkp.e.addOnLayoutChangeListener(gkp);
            gkp.c.addOnLayoutChangeListener(gkp);
            f2 = 36.0f;
        }
        this.j.postDelayed(new gjz(this, f2, str), 300);
        gkj gkj = this.g;
        gkr gkr = gkj.b;
        if (i2 == 0) {
            gkr.b = 0;
        } else if (Color.alpha(i2) == 255) {
            gkr.b = 1;
            i = i2;
        } else {
            gkr.b = 2;
            if (i2 == -2134061876) {
                i = gkr.c.getResources().getColor(R.color.text_color_white, null);
            } else {
                i = Color.argb(255, Color.red(i2), Color.green(i2), Color.blue(i2));
            }
        }
        if (i == 0) {
            i = gkj.c.getResources().getColor(R.color.text_color_white, null);
        }
        if (gkj.h) {
            gkh gkh = (gkh) ((RecyclerView) gkj.d).m;
            Integer valueOf = Integer.valueOf(i);
            gkh.d = 0;
            gkh.c = valueOf;
            gkh.aa_();
        } else {
            gkj.a(gkj.a(new gkl(i)));
        }
        a(gkj.b);
        InputMethodManager inputMethodManager = (InputMethodManager) this.b.getSystemService("input_method");
        this.j.requestFocus();
        this.e.b();
        inputMethodManager.showSoftInput(this.j, 1);
        c(true);
        this.z.a(true);
    }

    public final void b() {
        this.j.setEnabled(false);
        gkp gkp = this.d;
        amqw.a(gkp.e);
        amqw.a(gkp.c);
        amqw.a(gkp.f);
        gkp.e.removeOnLayoutChangeListener(gkp);
        gkp.c.removeOnLayoutChangeListener(gkp);
        InputMethodManager inputMethodManager = (InputMethodManager) this.b.getSystemService("input_method");
        this.e.a();
        inputMethodManager.hideSoftInputFromWindow(this.j.getWindowToken(), 2);
        c(false);
        this.A.a();
        this.z.a(false);
    }

    private static int a(aocv aocv) {
        return Color.argb((int) aocv.e, (int) aocv.b, (int) aocv.c, (int) aocv.d);
    }

    private final void a(gkr gkr) {
        ImageView imageView = this.m;
        int i = gkr.b;
        i = i != 0 ? i != 1 ? R.drawable.ic_background_translucent : R.drawable.ic_background_on : R.drawable.ic_background_off;
        imageView.setBackgroundResource(i);
        View view = this.l;
        Activity activity = this.b;
        int i2 = gkr.b;
        i2 = i2 != 0 ? i2 != 1 ? R.string.text_background_translucent : R.string.text_background_on : R.string.text_background_off;
        view.setContentDescription(activity.getString(i2));
    }

    private static bacy b(bacz bacz) {
        if (bacz == null) {
            return (bacy) bacz.g.createBuilder();
        }
        return (bacy) ((anxo) bacz.toBuilder());
    }

    private final void c(boolean z) {
        this.i.animate().alpha(!z ? 0.0f : 1.0f).setDuration(250).setListener(new gka(this, z)).start();
    }

    public final void onClick(View view) {
        if (view == this.n) {
            this.A.a(3, new acvs(acwc.UPLOAD_VIDEO_EDITING_ADD_TEXT_BUTTON), null);
            this.C = gju.b(null);
            b(true);
        } else if (view == this.i || view == this.o) {
            d();
        } else {
            boolean z = false;
            int i;
            int i2;
            if (view == this.l) {
                a(false);
                gkj gkj = this.g;
                gkr gkr = gkj.b;
                i = gkr.b;
                if (i == 0) {
                    gkr.b = 1;
                } else if (i != 1) {
                    gkr.b = 0;
                } else {
                    if (gkr.a) {
                        i2 = 2;
                    }
                    gkr.b = i2;
                }
                gkj.a(gkj.f);
                a(gkj.b);
            } else if (view == this.q) {
                a(false);
                String obj = this.j.getText().toString();
                if (this.j.getTextAlignment() == 4) {
                    this.r.setImageDrawable(this.b.getDrawable(R.drawable.quantum_ic_format_align_left_white_24));
                    this.q.setContentDescription(this.b.getString(R.string.text_alignment_left));
                    this.j.setTextAlignment(5);
                    this.p.setGravity(3);
                } else if (this.j.getTextAlignment() == 5) {
                    this.r.setImageDrawable(this.b.getDrawable(R.drawable.quantum_ic_format_align_right_white_24));
                    this.q.setContentDescription(this.b.getString(R.string.text_alignment_right));
                    this.j.setTextAlignment(6);
                    this.p.setGravity(5);
                } else {
                    this.r.setImageDrawable(this.b.getDrawable(R.drawable.quantum_ic_format_align_center_white_24));
                    this.q.setContentDescription(this.b.getString(R.string.text_alignment_center));
                    this.j.setTextAlignment(4);
                    this.p.setGravity(17);
                }
                this.j.setText(obj);
                this.j.setSelection(obj.length());
            } else if (view == this.s) {
                anxl anxl;
                a(false);
                babk babk = babk.CLASSIC;
                amul a = amul.a(this.f.keySet());
                i = a.indexOf(this.D);
                if (this.f.size() != 0) {
                    z = true;
                }
                amqw.b(z, (Object) "Fonts not initialized");
                for (i2 = (i + 1) % a.size(); i2 != i; i2 = (i2 + 1) % a.size()) {
                    babk = (babk) a.get(i2);
                    if (this.f.a(babk) != null) {
                        break;
                    }
                }
                this.j.setTypeface(this.f.a(babk));
                this.s.setText(((gki) this.f.get(babk)).a);
                bacx b = this.C.b();
                if (b.b == 1) {
                    anxl = (badg) b.c;
                } else {
                    anxl = badg.k;
                }
                badj badj = (badj) ((anxo) anxl.toBuilder());
                badj.a(babk);
                badg badg = (badg) ((anxl) badj.build());
                bacy bacy = this.C;
                bacw bacw = (bacw) ((anxo) bacy.b().toBuilder());
                bacw.a(badg);
                bacy.a(bacw);
                this.D = babk;
                c();
            }
        }
    }

    public final void a(boolean z) {
        bacy bacy = this.C;
        if (bacy != null) {
            anxl anxl;
            bacx b = bacy.b();
            if (b.b == 1) {
                anxl = (badg) b.c;
            } else {
                anxl = badg.k;
            }
            badj badj = (badj) ((anxo) anxl.toBuilder());
            badj.copyOnWrite();
            badg badg = (badg) badj.instance;
            badg.a |= 16384;
            badg.j = z;
            badg badg2 = (badg) ((anxl) badj.build());
            bacw bacw = (bacw) ((anxo) this.C.b().toBuilder());
            bacw.a(badg2);
            bacx bacx = (bacx) ((anxl) bacw.build());
            bacy = this.C;
            bacy.a(bacx);
            this.C = bacy;
        }
    }

    public final void a() {
        d();
    }

    public final void c() {
        if (this.f.get(this.D) != null) {
            amqp amqp = ((gki) this.f.get(this.D)).b;
            if (amqp.a()) {
                RoundedCornersEditText roundedCornersEditText = this.j;
                roundedCornersEditText.a((int) (roundedCornersEditText.getTextSize() * ((Float) amqp.b()).floatValue()));
                return;
            }
            this.j.a(0);
        }
    }
}
