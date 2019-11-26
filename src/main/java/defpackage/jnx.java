package defpackage;

import android.content.Context;
import android.widget.TextView;

/* renamed from: jnx */
public final class jnx {
    private final Context a;
    private final akyu b;
    private final fmx c;
    private final TextView d;

    public jnx(Context context, fmx fmx, akyz akyz, TextView textView) {
        this.a = context;
        this.b = akyz.a(textView);
        this.c = fmx;
        this.d = textView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    public final void a(defpackage.aphg r6, defpackage.acvx r7) {
        /*
        r5 = this;
        r0 = defpackage.acwi.b;
        r1 = java.lang.Boolean.TRUE;
        r0 = defpackage.amur.a(r0, r1);
        r1 = r5.b;
        r1.a(r6, r7, r0);
        if (r6 == 0) goto L_0x00ea;
    L_0x000f:
        r0 = r5.d;
        r1 = r6.a;
        r1 = r1 & 128;
        r2 = 0;
        if (r1 == 0) goto L_0x001f;
    L_0x0018:
        r1 = r6.g;
        if (r1 != 0) goto L_0x0020;
    L_0x001c:
        r1 = defpackage.arml.f;
        goto L_0x0020;
    L_0x001f:
        r1 = r2;
    L_0x0020:
        r1 = defpackage.ajqy.a(r1);
        r0.setText(r1);
        r0 = r6.b;
        r1 = 1;
        if (r0 == r1) goto L_0x002d;
    L_0x002c:
        goto L_0x004e;
    L_0x002d:
        r0 = r6.c;
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = defpackage.aphh.a(r0);
        if (r0 == 0) goto L_0x004e;
    L_0x003b:
        r3 = 7;
        if (r0 != r3) goto L_0x004e;
    L_0x003e:
        r0 = r5.d;
        r1 = r5.a;
        r3 = 2131559459; // 0x7f0d0423 float:1.8744263E38 double:1.053130301E-314;
        r1 = defpackage.ra.c(r1, r3);
        r0.setTextColor(r1);
        goto L_0x00be;
    L_0x004e:
        r0 = r6.b;
        r3 = 2131559461; // 0x7f0d0425 float:1.8744267E38 double:1.0531303017E-314;
        if (r0 == r1) goto L_0x0056;
    L_0x0055:
        goto L_0x0073;
    L_0x0056:
        r0 = r6.c;
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = defpackage.aphh.a(r0);
        if (r0 == 0) goto L_0x0073;
    L_0x0064:
        r4 = 6;
        if (r0 != r4) goto L_0x0073;
    L_0x0067:
        r0 = r5.d;
        r1 = r5.a;
        r1 = defpackage.ra.c(r1, r3);
        r0.setTextColor(r1);
        goto L_0x00be;
    L_0x0073:
        r0 = r6.b;
        if (r0 != r1) goto L_0x0086;
    L_0x0077:
        r0 = r6.c;
        r0 = (java.lang.Integer) r0;
        r0 = r0.intValue();
        r0 = defpackage.aphh.a(r0);
        if (r0 == 0) goto L_0x0086;
    L_0x0085:
        r1 = r0;
    L_0x0086:
        if (r1 != 0) goto L_0x008b;
    L_0x0088:
        r0 = "null";
        goto L_0x0095;
    L_0x008b:
        if (r1 == 0) goto L_0x00e9;
    L_0x008d:
        if (r1 == 0) goto L_0x00e8;
    L_0x008f:
        r1 = r1 + -1;
        r0 = java.lang.Integer.toString(r1);
    L_0x0095:
        r0 = java.lang.String.valueOf(r0);
        r1 = r0.length();
        r4 = new java.lang.StringBuilder;
        r1 = r1 + 30;
        r4.<init>(r1);
        r1 = "Unknown sponsor button style: ";
        r4.append(r1);
        r4.append(r0);
        r0 = r4.toString();
        defpackage.xtl.c(r0);
        r0 = r5.d;
        r1 = r5.a;
        r1 = defpackage.ra.c(r1, r3);
        r0.setTextColor(r1);
    L_0x00be:
        r0 = r6.k;
        if (r0 != 0) goto L_0x00c4;
    L_0x00c2:
        r0 = defpackage.arup.c;
    L_0x00c4:
        r0 = r0.a;
        r1 = 102716411; // 0x61f53fb float:2.9966275E-35 double:5.074865E-316;
        if (r0 == r1) goto L_0x00cc;
    L_0x00cb:
        goto L_0x00de;
    L_0x00cc:
        r0 = r6.k;
        if (r0 != 0) goto L_0x00d2;
    L_0x00d0:
        r0 = defpackage.arup.c;
    L_0x00d2:
        r2 = r0.a;
        if (r2 != r1) goto L_0x00dc;
    L_0x00d6:
        r0 = r0.b;
        r2 = r0;
        r2 = (defpackage.aruh) r2;
        goto L_0x00de;
    L_0x00dc:
        r2 = defpackage.aruh.j;
    L_0x00de:
        if (r2 == 0) goto L_0x00e7;
    L_0x00e0:
        r0 = r5.c;
        r1 = r5.d;
        r0.a(r2, r1, r6, r7);
    L_0x00e7:
        return;
    L_0x00e8:
        throw r2;
    L_0x00e9:
        throw r2;
    L_0x00ea:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jnx.a(aphg, acvx):void");
    }
}
