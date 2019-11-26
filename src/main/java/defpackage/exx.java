package defpackage;

import android.widget.TextView;

/* renamed from: exx */
public final class exx {
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00e4 A:{RETURN, PHI: r2 } */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    public static boolean a(android.widget.TextView r6, java.lang.CharSequence r7, java.lang.CharSequence r8, java.util.List r9, defpackage.ayri r10) {
        /*
        r0 = 0;
        if (r9 == 0) goto L_0x0020;
    L_0x0003:
        r1 = r9.iterator();
    L_0x0007:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x0020;
    L_0x000d:
        r2 = r1.next();
        r2 = (defpackage.ayfu) r2;
        r3 = r2.a;
        r3 = r3 & 4096;
        if (r3 == 0) goto L_0x0007;
    L_0x0019:
        r1 = r2.m;
        if (r1 != 0) goto L_0x0021;
    L_0x001d:
        r1 = defpackage.ayfy.d;
        goto L_0x0021;
    L_0x0020:
        r1 = r0;
    L_0x0021:
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x0084;
    L_0x0025:
        if (r9 == 0) goto L_0x0043;
    L_0x0027:
        r9 = r9.iterator();
    L_0x002b:
        r1 = r9.hasNext();
        if (r1 == 0) goto L_0x0043;
    L_0x0031:
        r1 = r9.next();
        r1 = (defpackage.ayfu) r1;
        r4 = r1.a;
        r4 = r4 & 1024;
        if (r4 == 0) goto L_0x002b;
    L_0x003d:
        r0 = r1.l;
        if (r0 != 0) goto L_0x0043;
    L_0x0041:
        r0 = defpackage.apdn.d;
    L_0x0043:
        r9 = android.text.TextUtils.isEmpty(r7);
        if (r9 != 0) goto L_0x004b;
    L_0x0049:
        r3 = 0;
        goto L_0x0050;
    L_0x004b:
        if (r0 != 0) goto L_0x0050;
    L_0x004d:
        if (r10 != 0) goto L_0x0050;
    L_0x004f:
        goto L_0x0049;
    L_0x0050:
        if (r6 == 0) goto L_0x0083;
    L_0x0052:
        defpackage.exx.a(r6, r7);
        if (r3 == 0) goto L_0x0070;
    L_0x0057:
        r7 = 2131952671; // 0x7f13041f float:1.9541791E38 double:1.0533245733E-314;
        r6.setText(r7);
        r6.setVisibility(r2);
        r7 = r6 instanceof com.google.android.apps.youtube.app.common.widget.DurationBadgeView;
        if (r7 == 0) goto L_0x0083;
    L_0x0064:
        r6 = (com.google.android.apps.youtube.app.common.widget.DurationBadgeView) r6;
        if (r0 == 0) goto L_0x006c;
    L_0x0068:
        r6.a();
        goto L_0x0083;
    L_0x006c:
        r6.b();
        goto L_0x0083;
    L_0x0070:
        r7 = android.text.TextUtils.isEmpty(r7);
        if (r7 != 0) goto L_0x0083;
    L_0x0076:
        r6.setContentDescription(r8);
        r7 = r6 instanceof com.google.android.apps.youtube.app.common.widget.DurationBadgeView;
        if (r7 == 0) goto L_0x0083;
    L_0x007d:
        r6 = (com.google.android.apps.youtube.app.common.widget.DurationBadgeView) r6;
        r6.b();
        return r2;
    L_0x0083:
        return r3;
    L_0x0084:
        defpackage.amqw.a(r1);
        r7 = r1.c;
        r7 = defpackage.ayga.a(r7);
        if (r7 == 0) goto L_0x0090;
    L_0x008f:
        goto L_0x0091;
    L_0x0090:
        r7 = 1;
    L_0x0091:
        r8 = r1.c;
        r8 = defpackage.ayga.a(r8);
        if (r8 == 0) goto L_0x009a;
    L_0x0099:
        goto L_0x009b;
    L_0x009a:
        r8 = 1;
    L_0x009b:
        r9 = 4;
        r10 = 3;
        if (r6 != 0) goto L_0x00a7;
    L_0x009f:
        if (r7 == r10) goto L_0x00a5;
    L_0x00a1:
        if (r8 == r9) goto L_0x00a4;
    L_0x00a3:
        goto L_0x00e4;
    L_0x00a4:
        return r3;
    L_0x00a5:
        r2 = 1;
        goto L_0x00e4;
    L_0x00a7:
        r4 = r6 instanceof com.google.android.apps.youtube.app.common.widget.DurationBadgeView;
        if (r4 == 0) goto L_0x00b7;
    L_0x00ab:
        r4 = r6;
        r4 = (com.google.android.apps.youtube.app.common.widget.DurationBadgeView) r4;
        if (r7 != r10) goto L_0x00b4;
    L_0x00b0:
        r4.a();
        goto L_0x00b7;
    L_0x00b4:
        r4.b();
    L_0x00b7:
        r4 = r1.b;
        if (r4 != 0) goto L_0x00bd;
    L_0x00bb:
        r4 = defpackage.arml.f;
    L_0x00bd:
        r4 = defpackage.ajqy.a(r4);
        r5 = android.text.TextUtils.isEmpty(r4);
        if (r5 != 0) goto L_0x00df;
    L_0x00c7:
        r6.setVisibility(r2);
        r6.setText(r4);
        r4 = r1.a;
        r4 = r4 & r3;
        if (r4 == 0) goto L_0x00d8;
    L_0x00d2:
        r0 = r1.b;
        if (r0 != 0) goto L_0x00d8;
    L_0x00d6:
        r0 = defpackage.arml.f;
    L_0x00d8:
        r0 = defpackage.ajqy.b(r0);
        r6.setContentDescription(r0);
    L_0x00df:
        if (r7 != r10) goto L_0x00e2;
    L_0x00e1:
        goto L_0x00a5;
    L_0x00e2:
        if (r8 == r9) goto L_0x00e5;
    L_0x00e4:
        return r2;
    L_0x00e5:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exx.a(android.widget.TextView, java.lang.CharSequence, java.lang.CharSequence, java.util.List, ayri):boolean");
    }

    public static void a(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            xpr.a(textView, charSequence);
        }
    }
}
