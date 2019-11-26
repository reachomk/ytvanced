package defpackage;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: alfk */
public final class alfk {
    private static final alch c = new alfq(R.color.color_brand_primary_alternate, R.drawable.tooltip_button_background);
    private static final alch d = new alfq(R.color.quantum_white_text, 0);
    public final int[] a = new int[2];
    public aaas b;
    private final SharedPreferences e;
    private final Set f = new HashSet();
    private final Handler g;
    private final Rect h = new Rect();
    private albo i;

    public alfk(SharedPreferences sharedPreferences, Handler handler) {
        this.e = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.g = (Handler) amqw.a((Object) handler);
    }

    public final albo a(aruh aruh, View view, Object obj, aaas aaas) {
        this.b = aaas;
        if (a(view)) {
            return a(aruh, view, obj);
        }
        view.addOnLayoutChangeListener(new alfm(this, view, aruh, obj));
        return null;
    }

    public final boolean a(View view) {
        return view.getGlobalVisibleRect(this.h);
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01df A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x01bf  */
    public final defpackage.albo a(defpackage.aruh r13, android.view.View r14, java.lang.Object r15) {
        /*
        r12 = this;
        r0 = 0;
        if (r13 != 0) goto L_0x0005;
    L_0x0003:
        goto L_0x01e3;
    L_0x0005:
        r1 = r12.i;
        r2 = 0;
        r3 = 1;
        if (r1 == 0) goto L_0x0014;
    L_0x000b:
        r1 = r1.c();
        if (r1 != 0) goto L_0x0012;
    L_0x0011:
        goto L_0x0014;
    L_0x0012:
        r1 = 0;
        goto L_0x0015;
    L_0x0014:
        r1 = 1;
    L_0x0015:
        r4 = r13.a;
        r4 = r4 & 16;
        r5 = 0;
        if (r4 == 0) goto L_0x0026;
    L_0x001d:
        r4 = r13.f;
        if (r4 != 0) goto L_0x0023;
    L_0x0021:
        r4 = defpackage.aruj.d;
    L_0x0023:
        r7 = r4.c;
        goto L_0x0027;
    L_0x0026:
        r7 = r5;
    L_0x0027:
        if (r1 == 0) goto L_0x01e3;
    L_0x0029:
        r1 = r12.f;
        r4 = new android.util.Pair;
        r4.<init>(r13, r15);
        r1 = r1.contains(r4);
        if (r1 != 0) goto L_0x01e3;
    L_0x0036:
        r1 = r12.e;
        r4 = defpackage.alfk.a(r13);
        r4 = r1.getLong(r4, r5);
        r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1));
        if (r1 >= 0) goto L_0x01e3;
    L_0x0044:
        r1 = r13.c;
        if (r1 != 0) goto L_0x004a;
    L_0x0048:
        r1 = defpackage.arub.c;
    L_0x004a:
        r1 = r1.a;
        r4 = 106514900; // 0x65949d4 float:4.0867404E-35 double:5.2625353E-316;
        if (r1 != r4) goto L_0x01e0;
    L_0x0051:
        r1 = r13.c;
        if (r1 != 0) goto L_0x0057;
    L_0x0055:
        r1 = defpackage.arub.c;
    L_0x0057:
        r5 = r1.a;
        if (r5 != r4) goto L_0x0060;
    L_0x005b:
        r1 = r1.b;
        r1 = (defpackage.artp) r1;
        goto L_0x0062;
    L_0x0060:
        r1 = defpackage.artp.i;
    L_0x0062:
        r1 = r1.b;
        if (r1 == 0) goto L_0x01e0;
    L_0x0066:
        r1 = r13.a;
        r5 = 2;
        r1 = r1 & r5;
        if (r1 == 0) goto L_0x007e;
    L_0x006c:
        r1 = r13.c;
        if (r1 != 0) goto L_0x0072;
    L_0x0070:
        r1 = defpackage.arub.c;
    L_0x0072:
        r6 = r1.a;
        if (r6 != r4) goto L_0x007b;
    L_0x0076:
        r1 = r1.b;
        r1 = (defpackage.artp) r1;
        goto L_0x007f;
    L_0x007b:
        r1 = defpackage.artp.i;
        goto L_0x007f;
    L_0x007e:
        r1 = r0;
    L_0x007f:
        r4 = 3;
        r6 = 4;
        if (r1 != 0) goto L_0x0086;
    L_0x0083:
        r7 = r0;
        goto L_0x0175;
    L_0x0086:
        r7 = new alcf;
        r7.<init>(r14);
        r8 = r13.g;
        if (r8 != 0) goto L_0x0091;
    L_0x008f:
        r8 = defpackage.arul.c;
    L_0x0091:
        if (r8 == 0) goto L_0x00ab;
    L_0x0093:
        r8 = r8.b;
        r8 = defpackage.arun.a(r8);
        if (r8 == 0) goto L_0x009c;
    L_0x009b:
        goto L_0x009d;
    L_0x009c:
        r8 = 1;
    L_0x009d:
        r8 = r8 + -1;
        if (r8 == r3) goto L_0x00ab;
    L_0x00a1:
        if (r8 == r4) goto L_0x00a9;
    L_0x00a3:
        if (r8 == r6) goto L_0x00a7;
    L_0x00a5:
        r8 = 2;
        goto L_0x00ac;
    L_0x00a7:
        r8 = 4;
        goto L_0x00ac;
    L_0x00a9:
        r8 = 3;
        goto L_0x00ac;
    L_0x00ab:
        r8 = 1;
    L_0x00ac:
        r7.a = r8;
        r7.a();
        r8 = r1.a;
        r8 = r8 & r5;
        if (r8 == 0) goto L_0x00bd;
    L_0x00b6:
        r8 = r1.c;
        if (r8 != 0) goto L_0x00be;
    L_0x00ba:
        r8 = defpackage.arml.f;
        goto L_0x00be;
    L_0x00bd:
        r8 = r0;
    L_0x00be:
        r8 = defpackage.ajqy.a(r8);
        r7.b = r8;
        r8 = r1.a;
        r8 = r8 & r6;
        if (r8 == 0) goto L_0x00d0;
    L_0x00c9:
        r8 = r1.d;
        if (r8 != 0) goto L_0x00d1;
    L_0x00cd:
        r8 = defpackage.arml.f;
        goto L_0x00d1;
    L_0x00d0:
        r8 = r0;
    L_0x00d1:
        r8 = defpackage.ajqy.a(r8);
        r7.c = r8;
        r8 = r1.h;
        if (r8 != 0) goto L_0x00dd;
    L_0x00db:
        r8 = defpackage.arto.c;
    L_0x00dd:
        r8 = r8.a;
        r9 = 47244396; // 0x2d0e46c float:3.069396E-37 double:2.3341833E-316;
        if (r8 != r9) goto L_0x011b;
    L_0x00e4:
        r8 = r1.h;
        if (r8 != 0) goto L_0x00ea;
    L_0x00e8:
        r8 = defpackage.arto.c;
    L_0x00ea:
        r10 = r8.a;
        if (r10 != r9) goto L_0x00f3;
    L_0x00ee:
        r8 = r8.b;
        r8 = (defpackage.artr) r8;
        goto L_0x00f5;
    L_0x00f3:
        r8 = defpackage.artr.j;
    L_0x00f5:
        r10 = r8.a;
        r10 = r10 & 8;
        if (r10 == 0) goto L_0x0102;
    L_0x00fb:
        r10 = r8.e;
        if (r10 != 0) goto L_0x0103;
    L_0x00ff:
        r10 = defpackage.arml.f;
        goto L_0x0103;
    L_0x0102:
        r10 = r0;
    L_0x0103:
        r10 = defpackage.ajqy.a(r10);
        r11 = r8.b;
        if (r11 != 0) goto L_0x010d;
    L_0x010b:
        r11 = defpackage.artt.c;
    L_0x010d:
        r11 = defpackage.alfk.a(r11);
        r8 = r12.a(r8);
        r7.d = r10;
        r7.e = r11;
        r7.f = r8;
    L_0x011b:
        r8 = r1.g;
        if (r8 != 0) goto L_0x0121;
    L_0x011f:
        r8 = defpackage.arto.c;
    L_0x0121:
        r8 = r8.a;
        if (r8 != r9) goto L_0x015c;
    L_0x0125:
        r8 = r1.g;
        if (r8 != 0) goto L_0x012b;
    L_0x0129:
        r8 = defpackage.arto.c;
    L_0x012b:
        r10 = r8.a;
        if (r10 != r9) goto L_0x0134;
    L_0x012f:
        r8 = r8.b;
        r8 = (defpackage.artr) r8;
        goto L_0x0136;
    L_0x0134:
        r8 = defpackage.artr.j;
    L_0x0136:
        r9 = r8.a;
        r9 = r9 & 8;
        if (r9 != 0) goto L_0x013e;
    L_0x013c:
        r9 = r0;
        goto L_0x0144;
    L_0x013e:
        r9 = r8.e;
        if (r9 != 0) goto L_0x0144;
    L_0x0142:
        r9 = defpackage.arml.f;
    L_0x0144:
        r9 = defpackage.ajqy.a(r9);
        r10 = r8.b;
        if (r10 != 0) goto L_0x014e;
    L_0x014c:
        r10 = defpackage.artt.c;
    L_0x014e:
        r10 = defpackage.alfk.a(r10);
        r8 = r12.a(r8);
        r7.g = r9;
        r7.h = r10;
        r7.i = r8;
    L_0x015c:
        r7 = r7.b();
        r1 = r1.f;
        r8 = 0;
        r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1));
        if (r8 > 0) goto L_0x0168;
    L_0x0167:
        goto L_0x0175;
    L_0x0168:
        r8 = r7.a;
        r8.h = r1;
        r1 = r8.isShown();
        if (r1 == 0) goto L_0x0175;
    L_0x0172:
        r8.requestLayout();
    L_0x0175:
        r1 = r13.d;
        if (r1 != 0) goto L_0x017b;
    L_0x0179:
        r1 = defpackage.arud.c;
    L_0x017b:
        r8 = r13.a;
        r8 = r8 & r6;
        if (r8 != 0) goto L_0x0182;
    L_0x0180:
        r4 = 1;
        goto L_0x018f;
    L_0x0182:
        r8 = r1.b;
        r8 = defpackage.aruf.a(r8);
        if (r8 != 0) goto L_0x018b;
    L_0x018a:
        goto L_0x0180;
    L_0x018b:
        if (r8 == r4) goto L_0x018e;
    L_0x018d:
        goto L_0x0180;
    L_0x018e:
        r4 = 0;
    L_0x018f:
        r8 = r13.a;
        r6 = r6 & r8;
        if (r6 == 0) goto L_0x01a1;
    L_0x0194:
        r1 = r1.b;
        r1 = defpackage.aruf.a(r1);
        if (r1 != 0) goto L_0x019e;
    L_0x019c:
        r2 = 1;
        goto L_0x01a1;
    L_0x019e:
        if (r1 == r5) goto L_0x01a1;
    L_0x01a0:
        goto L_0x019c;
    L_0x01a1:
        if (r4 != 0) goto L_0x01a4;
    L_0x01a3:
        goto L_0x01af;
    L_0x01a4:
        r7.b();
        r1 = new alfo;
        r1.<init>(r7);
        r7.a(r1);
    L_0x01af:
        if (r2 == 0) goto L_0x01bd;
    L_0x01b1:
        r1 = r12.g;
        r2 = new alfr;
        r2.<init>(r7);
        r3 = r13.e;
        r1.postDelayed(r2, r3);
    L_0x01bd:
        if (r7 == 0) goto L_0x01df;
    L_0x01bf:
        r0 = r12.a(r14);
        if (r0 == 0) goto L_0x01d9;
    L_0x01c5:
        r7.d();
        r0 = r12.a;
        r14.getLocationOnScreen(r0);
        r0 = r14.getViewTreeObserver();
        r1 = new alfp;
        r1.<init>(r12, r7, r14);
        r0.addOnPreDrawListener(r1);
    L_0x01d9:
        r12.i = r7;
        r12.a(r13, r15);
        return r7;
    L_0x01df:
        return r0;
    L_0x01e0:
        r12.a(r13, r15);
    L_0x01e3:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alfk.a(aruh, android.view.View, java.lang.Object):albo");
    }

    private static alch a(artt artt) {
        if (artt == null) {
            return null;
        }
        int a = artv.a(artt.b);
        if (a == 0) {
            a = 1;
        }
        a--;
        if (a == 1) {
            return c;
        }
        if (a != 2) {
            return null;
        }
        return d;
    }

    private final OnClickListener a(artr artr) {
        return new alfn(this, artr);
    }

    private final void a(aruh aruh, Object obj) {
        this.f.add(new Pair(aruh, obj));
        String a = alfk.a(aruh);
        this.e.edit().putLong(a, this.e.getLong(a, 0) + 1).apply();
        if (this.b != null && aruh.i.size() != 0) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", aruh);
            for (apxu a2 : aruh.i) {
                this.b.a(a2, hashMap);
            }
        }
    }

    private static String a(aruh aruh) {
        String valueOf = String.valueOf(aruh.b);
        int length = valueOf.length();
        String str = ebn.HINT_ID_PREFIX;
        return length == 0 ? new String(str) : str.concat(valueOf);
    }
}
