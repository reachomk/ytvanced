package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: aly */
public final class aly {
    public ary a;
    public int b = 0;
    public Typeface c;
    public boolean d;
    private final TextView e;
    private ary f;
    private ary g;
    private ary h;
    private ary i;
    private ary j;
    private ary k;
    private final alz l;
    private int m = -1;

    public aly(TextView textView) {
        this.e = textView;
        this.l = new alz(this.e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x025d  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02fa  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02c5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x034c  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x035c  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0357  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0365  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0378  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0373  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03cc  */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x03f6  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x03fb  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0411  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0473  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x047a  */
    /* JADX WARNING: Removed duplicated region for block: B:256:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0481  */
    public final void a(android.util.AttributeSet r19, int r20) {
        /*
        r18 = this;
        r0 = r18;
        r1 = r19;
        r2 = r20;
        r3 = r0.e;
        r3 = r3.getContext();
        r4 = defpackage.aky.b();
        r5 = defpackage.afy.S;
        r6 = 0;
        r5 = defpackage.arz.a(r3, r1, r5, r2, r6);
        r7 = defpackage.afy.Z;
        r8 = -1;
        r7 = r5.f(r7, r8);
        r9 = defpackage.afy.V;
        r9 = r5.h(r9);
        if (r9 == 0) goto L_0x0032;
    L_0x0026:
        r9 = defpackage.afy.V;
        r9 = r5.f(r9, r6);
        r9 = defpackage.aly.a(r3, r4, r9);
        r0.f = r9;
    L_0x0032:
        r9 = defpackage.afy.Y;
        r9 = r5.h(r9);
        if (r9 == 0) goto L_0x0046;
    L_0x003a:
        r9 = defpackage.afy.Y;
        r9 = r5.f(r9, r6);
        r9 = defpackage.aly.a(r3, r4, r9);
        r0.g = r9;
    L_0x0046:
        r9 = defpackage.afy.W;
        r9 = r5.h(r9);
        if (r9 == 0) goto L_0x005a;
    L_0x004e:
        r9 = defpackage.afy.W;
        r9 = r5.f(r9, r6);
        r9 = defpackage.aly.a(r3, r4, r9);
        r0.h = r9;
    L_0x005a:
        r9 = defpackage.afy.T;
        r9 = r5.h(r9);
        if (r9 == 0) goto L_0x006e;
    L_0x0062:
        r9 = defpackage.afy.T;
        r9 = r5.f(r9, r6);
        r9 = defpackage.aly.a(r3, r4, r9);
        r0.i = r9;
    L_0x006e:
        r9 = defpackage.afy.X;
        r9 = r5.h(r9);
        if (r9 == 0) goto L_0x0082;
    L_0x0076:
        r9 = defpackage.afy.X;
        r9 = r5.f(r9, r6);
        r9 = defpackage.aly.a(r3, r4, r9);
        r0.j = r9;
    L_0x0082:
        r9 = defpackage.afy.U;
        r9 = r5.h(r9);
        if (r9 == 0) goto L_0x0096;
    L_0x008a:
        r9 = defpackage.afy.U;
        r9 = r5.f(r9, r6);
        r9 = defpackage.aly.a(r3, r4, r9);
        r0.k = r9;
    L_0x0096:
        r5.a();
        r5 = r0.e;
        r5 = r5.getTransformationMethod();
        r5 = r5 instanceof android.text.method.PasswordTransformationMethod;
        r9 = 26;
        r10 = 23;
        if (r7 != r8) goto L_0x00b0;
    L_0x00a7:
        r7 = 0;
        r8 = 0;
        r10 = 0;
        r11 = 0;
        r12 = 0;
        r14 = 0;
        r15 = 0;
        goto L_0x0137;
    L_0x00b0:
        r13 = defpackage.afy.cy;
        r7 = defpackage.arz.a(r3, r7, r13);
        if (r5 != 0) goto L_0x00c9;
    L_0x00b8:
        r13 = defpackage.afy.cJ;
        r13 = r7.h(r13);
        if (r13 == 0) goto L_0x00c9;
    L_0x00c0:
        r13 = defpackage.afy.cJ;
        r13 = r7.a(r13, r6);
        r14 = r13;
        r13 = 1;
        goto L_0x00cb;
    L_0x00c9:
        r13 = 0;
        r14 = 0;
    L_0x00cb:
        r0.a(r3, r7);
        r15 = android.os.Build.VERSION.SDK_INT;
        if (r15 < r10) goto L_0x00d6;
    L_0x00d2:
        r11 = 0;
        r12 = 0;
    L_0x00d4:
        r15 = 0;
        goto L_0x010e;
    L_0x00d6:
        r15 = defpackage.afy.cA;
        r15 = r7.h(r15);
        if (r15 == 0) goto L_0x00e5;
    L_0x00de:
        r15 = defpackage.afy.cA;
        r15 = r7.f(r15);
        goto L_0x00e6;
    L_0x00e5:
        r15 = 0;
    L_0x00e6:
        r12 = defpackage.afy.cB;
        r12 = r7.h(r12);
        if (r12 == 0) goto L_0x00f5;
    L_0x00ee:
        r12 = defpackage.afy.cB;
        r12 = r7.f(r12);
        goto L_0x00f6;
    L_0x00f5:
        r12 = 0;
    L_0x00f6:
        r11 = defpackage.afy.cC;
        r11 = r7.h(r11);
        if (r11 == 0) goto L_0x010b;
    L_0x00fe:
        r11 = defpackage.afy.cC;
        r11 = r7.f(r11);
        r17 = r15;
        r15 = r11;
        r11 = r12;
        r12 = r17;
        goto L_0x010e;
    L_0x010b:
        r11 = r12;
        r12 = r15;
        goto L_0x00d4;
    L_0x010e:
        r8 = defpackage.afy.cK;
        r8 = r7.h(r8);
        if (r8 == 0) goto L_0x011d;
    L_0x0116:
        r8 = defpackage.afy.cK;
        r8 = r7.d(r8);
        goto L_0x011e;
    L_0x011d:
        r8 = 0;
    L_0x011e:
        r10 = android.os.Build.VERSION.SDK_INT;
        if (r10 < r9) goto L_0x0131;
    L_0x0122:
        r10 = defpackage.afy.cI;
        r10 = r7.h(r10);
        if (r10 == 0) goto L_0x0131;
    L_0x012a:
        r10 = defpackage.afy.cI;
        r10 = r7.d(r10);
        goto L_0x0132;
    L_0x0131:
        r10 = 0;
    L_0x0132:
        r7.a();
        r7 = r11;
        r11 = r13;
    L_0x0137:
        r13 = defpackage.afy.cy;
        r13 = defpackage.arz.a(r3, r1, r13, r2, r6);
        if (r5 != 0) goto L_0x014e;
    L_0x013f:
        r9 = defpackage.afy.cJ;
        r9 = r13.h(r9);
        if (r9 == 0) goto L_0x014e;
    L_0x0147:
        r9 = defpackage.afy.cJ;
        r14 = r13.a(r9, r6);
        r11 = 1;
    L_0x014e:
        r9 = android.os.Build.VERSION.SDK_INT;
        r6 = 23;
        if (r9 < r6) goto L_0x0155;
    L_0x0154:
        goto L_0x017f;
    L_0x0155:
        r6 = defpackage.afy.cA;
        r6 = r13.h(r6);
        if (r6 == 0) goto L_0x0163;
    L_0x015d:
        r6 = defpackage.afy.cA;
        r12 = r13.f(r6);
    L_0x0163:
        r6 = defpackage.afy.cB;
        r6 = r13.h(r6);
        if (r6 == 0) goto L_0x0171;
    L_0x016b:
        r6 = defpackage.afy.cB;
        r7 = r13.f(r6);
    L_0x0171:
        r6 = defpackage.afy.cC;
        r6 = r13.h(r6);
        if (r6 == 0) goto L_0x017f;
    L_0x0179:
        r6 = defpackage.afy.cC;
        r15 = r13.f(r6);
    L_0x017f:
        r6 = defpackage.afy.cK;
        r6 = r13.h(r6);
        if (r6 == 0) goto L_0x018d;
    L_0x0187:
        r6 = defpackage.afy.cK;
        r8 = r13.d(r6);
    L_0x018d:
        r6 = android.os.Build.VERSION.SDK_INT;
        r9 = 26;
        if (r6 < r9) goto L_0x01a1;
    L_0x0193:
        r6 = defpackage.afy.cI;
        r6 = r13.h(r6);
        if (r6 == 0) goto L_0x01a1;
    L_0x019b:
        r6 = defpackage.afy.cI;
        r10 = r13.d(r6);
    L_0x01a1:
        r6 = android.os.Build.VERSION.SDK_INT;
        r9 = 28;
        if (r6 < r9) goto L_0x01c2;
    L_0x01a7:
        r6 = defpackage.afy.cE;
        r6 = r13.h(r6);
        if (r6 == 0) goto L_0x01c2;
    L_0x01af:
        r6 = defpackage.afy.cE;
        r9 = -1;
        r6 = r13.d(r6, r9);
        if (r6 != 0) goto L_0x01c2;
    L_0x01b8:
        r6 = r0.e;
        r9 = 0;
        r16 = r4;
        r4 = 0;
        r6.setTextSize(r4, r9);
        goto L_0x01c4;
    L_0x01c2:
        r16 = r4;
    L_0x01c4:
        r0.a(r3, r13);
        r13.a();
        if (r12 == 0) goto L_0x01d1;
    L_0x01cc:
        r4 = r0.e;
        r4.setTextColor(r12);
    L_0x01d1:
        if (r7 == 0) goto L_0x01d8;
    L_0x01d3:
        r4 = r0.e;
        r4.setHintTextColor(r7);
    L_0x01d8:
        if (r15 == 0) goto L_0x01df;
    L_0x01da:
        r4 = r0.e;
        r4.setLinkTextColor(r15);
    L_0x01df:
        if (r5 == 0) goto L_0x01e2;
    L_0x01e1:
        goto L_0x01e7;
    L_0x01e2:
        if (r11 == 0) goto L_0x01e7;
    L_0x01e4:
        r0.a(r14);
    L_0x01e7:
        r4 = r0.c;
        if (r4 == 0) goto L_0x01fd;
    L_0x01eb:
        r5 = r0.m;
        r6 = -1;
        if (r5 != r6) goto L_0x01f8;
    L_0x01f0:
        r5 = r0.e;
        r6 = r0.b;
        r5.setTypeface(r4, r6);
        goto L_0x01fd;
    L_0x01f8:
        r5 = r0.e;
        r5.setTypeface(r4);
    L_0x01fd:
        if (r10 == 0) goto L_0x0204;
    L_0x01ff:
        r4 = r0.e;
        r4.setFontVariationSettings(r10);
    L_0x0204:
        if (r8 == 0) goto L_0x0231;
    L_0x0206:
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 24;
        if (r4 < r5) goto L_0x0216;
    L_0x020c:
        r4 = r0.e;
        r5 = android.os.LocaleList.forLanguageTags(r8);
        r4.setTextLocales(r5);
        goto L_0x0231;
    L_0x0216:
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 21;
        if (r4 < r5) goto L_0x0231;
    L_0x021c:
        r4 = 44;
        r4 = r8.indexOf(r4);
        r5 = 0;
        r4 = r8.substring(r5, r4);
        r6 = r0.e;
        r4 = java.util.Locale.forLanguageTag(r4);
        r6.setTextLocale(r4);
        goto L_0x0232;
    L_0x0231:
        r5 = 0;
    L_0x0232:
        r4 = r0.l;
        r6 = r4.h;
        r7 = defpackage.afy.aa;
        r2 = r6.obtainStyledAttributes(r1, r7, r2, r5);
        r6 = defpackage.afy.af;
        r6 = r2.hasValue(r6);
        if (r6 == 0) goto L_0x024c;
    L_0x0244:
        r6 = defpackage.afy.af;
        r6 = r2.getInt(r6, r5);
        r4.a = r6;
    L_0x024c:
        r5 = defpackage.afy.ae;
        r5 = r2.hasValue(r5);
        r6 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        if (r5 == 0) goto L_0x025d;
    L_0x0256:
        r5 = defpackage.afy.ae;
        r5 = r2.getDimension(r5, r6);
        goto L_0x025f;
    L_0x025d:
        r5 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x025f:
        r7 = defpackage.afy.ac;
        r7 = r2.hasValue(r7);
        if (r7 == 0) goto L_0x026e;
    L_0x0267:
        r7 = defpackage.afy.ac;
        r7 = r2.getDimension(r7, r6);
        goto L_0x0270;
    L_0x026e:
        r7 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x0270:
        r8 = defpackage.afy.ab;
        r8 = r2.hasValue(r8);
        if (r8 == 0) goto L_0x027f;
    L_0x0278:
        r8 = defpackage.afy.ab;
        r8 = r2.getDimension(r8, r6);
        goto L_0x0281;
    L_0x027f:
        r8 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
    L_0x0281:
        r9 = defpackage.afy.ad;
        r9 = r2.hasValue(r9);
        if (r9 == 0) goto L_0x02bb;
    L_0x0289:
        r9 = defpackage.afy.ad;
        r10 = 0;
        r9 = r2.getResourceId(r9, r10);
        if (r9 <= 0) goto L_0x02bb;
    L_0x0292:
        r10 = r2.getResources();
        r9 = r10.obtainTypedArray(r9);
        r10 = r9.length();
        r11 = new int[r10];
        if (r10 <= 0) goto L_0x02b8;
    L_0x02a2:
        r12 = 0;
    L_0x02a3:
        if (r12 >= r10) goto L_0x02af;
    L_0x02a5:
        r13 = -1;
        r14 = r9.getDimensionPixelSize(r12, r13);
        r11[r12] = r14;
        r12 = r12 + 1;
        goto L_0x02a3;
    L_0x02af:
        r10 = defpackage.alz.a(r11);
        r4.f = r10;
        r4.d();
    L_0x02b8:
        r9.recycle();
    L_0x02bb:
        r2.recycle();
        r2 = r4.h();
        r9 = 2;
        if (r2 == 0) goto L_0x02fa;
    L_0x02c5:
        r2 = r4.a;
        r10 = 1;
        if (r2 != r10) goto L_0x02fd;
    L_0x02ca:
        r2 = r4.g;
        if (r2 != 0) goto L_0x02f6;
    L_0x02ce:
        r2 = r4.h;
        r2 = r2.getResources();
        r2 = r2.getDisplayMetrics();
        r10 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1));
        if (r10 != 0) goto L_0x02e2;
    L_0x02dc:
        r7 = 1094713344; // 0x41400000 float:12.0 double:5.408602553E-315;
        r7 = android.util.TypedValue.applyDimension(r9, r7, r2);
    L_0x02e2:
        r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1));
        if (r10 != 0) goto L_0x02ec;
    L_0x02e6:
        r8 = 1121976320; // 0x42e00000 float:112.0 double:5.54329955E-315;
        r8 = android.util.TypedValue.applyDimension(r9, r8, r2);
    L_0x02ec:
        r2 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1));
        if (r2 == 0) goto L_0x02f1;
    L_0x02f0:
        goto L_0x02f3;
    L_0x02f1:
        r5 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x02f3:
        r4.a(r7, r8, r5);
    L_0x02f6:
        r4.e();
        goto L_0x02fd;
    L_0x02fa:
        r2 = 0;
        r4.a = r2;
    L_0x02fd:
        r2 = defpackage.acv.k;
        if (r2 == 0) goto L_0x0336;
    L_0x0301:
        r2 = r0.l;
        r4 = r2.a;
        if (r4 == 0) goto L_0x0336;
    L_0x0307:
        r2 = r2.f;
        r4 = r2.length;
        if (r4 <= 0) goto L_0x0336;
    L_0x030c:
        r4 = r0.e;
        r4 = r4.getAutoSizeStepGranularity();
        r4 = (float) r4;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 == 0) goto L_0x0330;
    L_0x0317:
        r2 = r0.e;
        r4 = r0.l;
        r4 = r4.b();
        r5 = r0.l;
        r5 = r5.c();
        r6 = r0.l;
        r6 = r6.a();
        r7 = 0;
        r2.setAutoSizeTextTypeUniformWithConfiguration(r4, r5, r6, r7);
        goto L_0x0336;
    L_0x0330:
        r7 = 0;
        r4 = r0.e;
        r4.setAutoSizeTextTypeUniformWithPresetSizes(r2, r7);
    L_0x0336:
        r2 = defpackage.afy.aa;
        r1 = defpackage.arz.a(r3, r1, r2);
        r2 = defpackage.afy.ai;
        r4 = -1;
        r2 = r1.f(r2, r4);
        if (r2 == r4) goto L_0x034c;
    L_0x0345:
        r5 = r16;
        r12 = r5.a(r3, r2);
        goto L_0x034f;
    L_0x034c:
        r5 = r16;
        r12 = 0;
    L_0x034f:
        r2 = defpackage.afy.an;
        r2 = r1.f(r2, r4);
        if (r2 == r4) goto L_0x035c;
    L_0x0357:
        r2 = r5.a(r3, r2);
        goto L_0x035d;
    L_0x035c:
        r2 = 0;
    L_0x035d:
        r6 = defpackage.afy.aj;
        r6 = r1.f(r6, r4);
        if (r6 == r4) goto L_0x036a;
    L_0x0365:
        r6 = r5.a(r3, r6);
        goto L_0x036b;
    L_0x036a:
        r6 = 0;
    L_0x036b:
        r7 = defpackage.afy.ag;
        r7 = r1.f(r7, r4);
        if (r7 == r4) goto L_0x0378;
    L_0x0373:
        r7 = r5.a(r3, r7);
        goto L_0x0379;
    L_0x0378:
        r7 = 0;
    L_0x0379:
        r8 = defpackage.afy.ak;
        r8 = r1.f(r8, r4);
        if (r8 == r4) goto L_0x0386;
    L_0x0381:
        r8 = r5.a(r3, r8);
        goto L_0x0387;
    L_0x0386:
        r8 = 0;
    L_0x0387:
        r10 = defpackage.afy.ah;
        r10 = r1.f(r10, r4);
        if (r10 == r4) goto L_0x0394;
    L_0x038f:
        r3 = r5.a(r3, r10);
        goto L_0x0395;
    L_0x0394:
        r3 = 0;
    L_0x0395:
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 17;
        r10 = 3;
        if (r4 < r5) goto L_0x03c0;
    L_0x039c:
        if (r8 == 0) goto L_0x039f;
    L_0x039e:
        goto L_0x03a2;
    L_0x039f:
        if (r3 != 0) goto L_0x03a2;
    L_0x03a1:
        goto L_0x03c0;
    L_0x03a2:
        r4 = r0.e;
        r4 = r4.getCompoundDrawablesRelative();
        r5 = r0.e;
        if (r8 != 0) goto L_0x03af;
    L_0x03ac:
        r6 = 0;
        r8 = r4[r6];
    L_0x03af:
        if (r2 != 0) goto L_0x03b4;
    L_0x03b1:
        r6 = 1;
        r2 = r4[r6];
    L_0x03b4:
        if (r3 != 0) goto L_0x03b8;
    L_0x03b6:
        r3 = r4[r9];
    L_0x03b8:
        if (r7 != 0) goto L_0x03bc;
    L_0x03ba:
        r7 = r4[r10];
    L_0x03bc:
        r5.setCompoundDrawablesRelativeWithIntrinsicBounds(r8, r2, r3, r7);
        goto L_0x0409;
    L_0x03c0:
        if (r12 != 0) goto L_0x03c8;
    L_0x03c2:
        if (r2 != 0) goto L_0x03c8;
    L_0x03c4:
        if (r6 != 0) goto L_0x03c8;
    L_0x03c6:
        if (r7 == 0) goto L_0x0409;
    L_0x03c8:
        r3 = android.os.Build.VERSION.SDK_INT;
        if (r3 < r5) goto L_0x03ec;
    L_0x03cc:
        r3 = r0.e;
        r3 = r3.getCompoundDrawablesRelative();
        r4 = 0;
        r5 = r3[r4];
        if (r5 != 0) goto L_0x03db;
    L_0x03d7:
        r4 = r3[r9];
        if (r4 == 0) goto L_0x03ec;
    L_0x03db:
        r4 = r0.e;
        if (r2 != 0) goto L_0x03e2;
    L_0x03df:
        r6 = 1;
        r2 = r3[r6];
    L_0x03e2:
        r6 = r3[r9];
        if (r7 != 0) goto L_0x03e8;
    L_0x03e6:
        r7 = r3[r10];
    L_0x03e8:
        r4.setCompoundDrawablesRelativeWithIntrinsicBounds(r5, r2, r6, r7);
        goto L_0x0409;
    L_0x03ec:
        r3 = r0.e;
        r3 = r3.getCompoundDrawables();
        r4 = r0.e;
        if (r12 != 0) goto L_0x03f9;
    L_0x03f6:
        r5 = 0;
        r12 = r3[r5];
    L_0x03f9:
        if (r2 != 0) goto L_0x03fe;
    L_0x03fb:
        r5 = 1;
        r2 = r3[r5];
    L_0x03fe:
        if (r6 != 0) goto L_0x0402;
    L_0x0400:
        r6 = r3[r9];
    L_0x0402:
        if (r7 != 0) goto L_0x0406;
    L_0x0404:
        r7 = r3[r10];
    L_0x0406:
        r4.setCompoundDrawablesWithIntrinsicBounds(r12, r2, r6, r7);
    L_0x0409:
        r2 = defpackage.afy.al;
        r2 = r1.h(r2);
        if (r2 == 0) goto L_0x042f;
    L_0x0411:
        r2 = defpackage.afy.al;
        r2 = r1.f(r2);
        r3 = r0.e;
        defpackage.aad.a(r3);
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 23;
        if (r4 < r5) goto L_0x0426;
    L_0x0422:
        r3.setCompoundDrawableTintList(r2);
        goto L_0x042f;
    L_0x0426:
        r4 = r3 instanceof defpackage.adm;
        if (r4 == 0) goto L_0x042f;
    L_0x042a:
        r3 = (defpackage.adm) r3;
        r3.a(r2);
    L_0x042f:
        r2 = defpackage.afy.am;
        r2 = r1.h(r2);
        if (r2 == 0) goto L_0x045b;
    L_0x0437:
        r2 = defpackage.afy.am;
        r3 = -1;
        r2 = r1.a(r2, r3);
        r3 = 0;
        r2 = defpackage.amu.a(r2, r3);
        r3 = r0.e;
        defpackage.aad.a(r3);
        r4 = android.os.Build.VERSION.SDK_INT;
        r5 = 23;
        if (r4 < r5) goto L_0x0452;
    L_0x044e:
        r3.setCompoundDrawableTintMode(r2);
        goto L_0x045b;
    L_0x0452:
        r4 = r3 instanceof defpackage.adm;
        if (r4 == 0) goto L_0x045b;
    L_0x0456:
        r3 = (defpackage.adm) r3;
        r3.a(r2);
    L_0x045b:
        r2 = defpackage.afy.ao;
        r3 = -1;
        r2 = r1.d(r2, r3);
        r4 = defpackage.afy.ap;
        r4 = r1.d(r4, r3);
        r5 = defpackage.afy.aq;
        r5 = r1.d(r5, r3);
        r1.a();
        if (r2 == r3) goto L_0x0478;
    L_0x0473:
        r1 = r0.e;
        defpackage.adl.b(r1, r2);
    L_0x0478:
        if (r4 == r3) goto L_0x047f;
    L_0x047a:
        r1 = r0.e;
        defpackage.adl.c(r1, r4);
    L_0x047f:
        if (r5 == r3) goto L_0x0486;
    L_0x0481:
        r1 = r0.e;
        defpackage.adl.d(r1, r5);
    L_0x0486:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aly.a(android.util.AttributeSet, int):void");
    }

    private final void a(Context context, arz arz) {
        int a;
        arz arz2 = arz;
        this.b = arz2.a(afy.cF, this.b);
        if (VERSION.SDK_INT >= 28) {
            a = arz2.a(afy.cD, -1);
            this.m = a;
            if (a != -1) {
                this.b &= 2;
            }
        }
        boolean z = true;
        if (arz2.h(afy.cz) || arz2.h(afy.cH)) {
            Typeface typeface = null;
            this.c = null;
            int i = !arz2.h(afy.cH) ? afy.cz : afy.cH;
            int i2 = this.m;
            int i3 = this.b;
            if (!context.isRestricted()) {
                ry alx = new alx(this, i2, i3, new WeakReference(this.e));
                try {
                    i2 = this.b;
                    int resourceId = arz2.b.getResourceId(i, 0);
                    if (resourceId != 0) {
                        if (arz2.c == null) {
                            arz2.c = new TypedValue();
                        }
                        Context context2 = arz2.a;
                        TypedValue typedValue = arz2.c;
                        if (!context2.isRestricted()) {
                            typeface = rz.a(context2, resourceId, typedValue, i2, alx, true);
                        }
                    }
                    if (typeface != null) {
                        if (VERSION.SDK_INT < 28 || this.m == -1) {
                            this.c = typeface;
                        } else {
                            this.c = Typeface.create(Typeface.create(typeface, 0), this.m, (this.b & 2) != 0);
                        }
                    }
                    this.d = this.c == null;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.c == null) {
                String d = arz2.d(i);
                if (d != null) {
                    if (VERSION.SDK_INT < 28 || this.m == -1) {
                        this.c = Typeface.create(d, this.b);
                    } else {
                        Typeface create = Typeface.create(d, 0);
                        a = this.m;
                        if ((this.b & 2) == 0) {
                            z = false;
                        }
                        this.c = Typeface.create(create, a, z);
                    }
                }
            }
            return;
        }
        if (arz2.h(afy.cG)) {
            this.d = false;
            int a2 = arz2.a(afy.cG, 1);
            if (a2 == 1) {
                this.c = Typeface.SANS_SERIF;
            } else if (a2 == 2) {
                this.c = Typeface.SERIF;
            } else if (a2 == 3) {
                this.c = Typeface.MONOSPACE;
            }
        }
    }

    public final void a(Context context, int i) {
        arz a = arz.a(context, i, afy.cy);
        if (a.h(afy.cJ)) {
            a(a.a(afy.cJ, false));
        }
        if (VERSION.SDK_INT < 23 && a.h(afy.cA)) {
            ColorStateList f = a.f(afy.cA);
            if (f != null) {
                this.e.setTextColor(f);
            }
        }
        if (a.h(afy.cE) && a.d(afy.cE, -1) == 0) {
            this.e.setTextSize(0, 0.0f);
        }
        a(context, a);
        if (VERSION.SDK_INT >= 26 && a.h(afy.cI)) {
            String d = a.d(afy.cI);
            if (d != null) {
                this.e.setFontVariationSettings(d);
            }
        }
        a.a();
        Typeface typeface = this.c;
        if (typeface != null) {
            this.e.setTypeface(typeface, this.b);
        }
    }

    public final void a(boolean z) {
        this.e.setAllCaps(z);
    }

    public final void a() {
        Drawable[] compoundDrawables;
        if (!(this.f == null && this.g == null && this.h == null && this.i == null)) {
            compoundDrawables = this.e.getCompoundDrawables();
            a(compoundDrawables[0], this.f);
            a(compoundDrawables[1], this.g);
            a(compoundDrawables[2], this.h);
            a(compoundDrawables[3], this.i);
        }
        if (this.j != null || this.k != null) {
            compoundDrawables = this.e.getCompoundDrawablesRelative();
            a(compoundDrawables[0], this.j);
            a(compoundDrawables[2], this.k);
        }
    }

    private final void a(Drawable drawable, ary ary) {
        if (drawable != null && ary != null) {
            aky.a(drawable, ary, this.e.getDrawableState());
        }
    }

    private static ary a(Context context, aky aky, int i) {
        ColorStateList c = aky.c(context, i);
        if (c == null) {
            return null;
        }
        ary ary = new ary();
        ary.d = true;
        ary.a = c;
        return ary;
    }

    public final void b() {
        if (!acv.k) {
            c();
        }
    }

    public final void a(int i, float f) {
        if (!acv.k && !d()) {
            this.l.a(i, f);
        }
    }

    public final void c() {
        this.l.f();
    }

    public final boolean d() {
        return this.l.g();
    }

    public final void a(int i) {
        alz alz = this.l;
        if (!alz.h()) {
            return;
        }
        if (i == 0) {
            alz.a = 0;
            alz.d = -1.0f;
            alz.e = -1.0f;
            alz.c = -1.0f;
            alz.f = new int[0];
            alz.b = false;
        } else if (i == 1) {
            DisplayMetrics displayMetrics = alz.h.getResources().getDisplayMetrics();
            alz.a(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (alz.e()) {
                alz.f();
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown auto-size text type: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        alz alz = this.l;
        if (alz.h()) {
            DisplayMetrics displayMetrics = alz.h.getResources().getDisplayMetrics();
            alz.a(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (alz.e()) {
                alz.f();
            }
        }
    }

    public final void a(int[] iArr, int i) {
        alz alz = this.l;
        if (alz.h()) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = alz.h.getResources().getDisplayMetrics();
                    while (i2 < length) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                        i2++;
                    }
                }
                alz.f = alz.a(iArr2);
                if (!alz.d()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("None of the preset sizes is valid: ");
                    stringBuilder.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            alz.g = false;
            if (alz.e()) {
                alz.f();
            }
        }
    }

    public final int e() {
        return this.l.a;
    }

    public final int f() {
        return this.l.a();
    }

    public final int g() {
        return this.l.b();
    }

    public final int h() {
        return this.l.c();
    }

    public final int[] i() {
        return this.l.f;
    }

    public final void j() {
        ary ary = this.a;
        this.f = ary;
        this.g = ary;
        this.h = ary;
        this.i = ary;
        this.j = ary;
        this.k = ary;
    }
}
