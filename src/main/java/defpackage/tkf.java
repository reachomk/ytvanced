package defpackage;

import android.content.Context;

/* renamed from: tkf */
public final class tkf extends tkc {
    private final Context a;

    public tkf(Context context) {
        this.a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x0195 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053  */
    public final java.lang.String a(java.lang.String r10, java.lang.String r11) {
        /*
        r9 = this;
        r0 = r9.a;
        r0 = defpackage.qhq.b(r0);
        r1 = android.os.Looper.getMainLooper();
        r2 = android.os.Looper.myLooper();
        if (r1 == r2) goto L_0x0196;
    L_0x0010:
        r1 = defpackage.qhq.b;
        r2 = "appVersion";
        r1 = r1.a(r2);
        r2 = 0;
        if (r1 == 0) goto L_0x0050;
    L_0x001b:
        r3 = defpackage.qhq.d;
        r1 = r1.equals(r3);
        if (r1 == 0) goto L_0x0050;
    L_0x0023:
        r1 = defpackage.qhq.b;
        r3 = "lastToken";
        r1 = r1.a(r3);
        if (r1 == 0) goto L_0x0050;
    L_0x002d:
        r3 = java.lang.Long.parseLong(r1);
        r1 = java.lang.Long.valueOf(r3);
        r3 = java.lang.System.currentTimeMillis();
        r5 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r3 = r3 / r5;
        r5 = r1.longValue();
        r3 = r3 - r5;
        r5 = defpackage.qhq.a;
        r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r1 > 0) goto L_0x0050;
    L_0x0047:
        r1 = defpackage.qhq.b;
        r3 = r0.f;
        r1 = r1.a(r3, r10, r11);
        goto L_0x0051;
    L_0x0050:
        r1 = r2;
    L_0x0051:
        if (r1 != 0) goto L_0x0195;
    L_0x0053:
        r1 = new android.os.Bundle;
        r1.<init>();
        r3 = "scope";
        r1.putString(r3, r11);
        r3 = "sender";
        r1.putString(r3, r10);
        r3 = r0.f;
        r4 = "";
        r3 = r4.equals(r3);
        if (r3 != 0) goto L_0x006f;
    L_0x006c:
        r3 = r0.f;
        goto L_0x0070;
    L_0x006f:
        r3 = r10;
    L_0x0070:
        r4 = "legacy.register";
        r4 = r1.containsKey(r4);
        if (r4 != 0) goto L_0x008c;
    L_0x0078:
        r4 = "subscription";
        r1.putString(r4, r10);
        r4 = "subtype";
        r1.putString(r4, r3);
        r4 = "X-subscription";
        r1.putString(r4, r10);
        r4 = "X-subtype";
        r1.putString(r4, r3);
    L_0x008c:
        r3 = defpackage.qhq.c;
        r4 = defpackage.qhq.b;
        r5 = r0.f;
        r4 = r4.b(r5);
        r4 = r4.a;
        r5 = r3.b;
        r6 = r5.getPackageManager();
        r7 = 0;
        r5 = defpackage.qhu.a(r5);	 Catch:{ NameNotFoundException -> 0x00aa }
        r5 = r6.getPackageInfo(r5, r7);	 Catch:{ NameNotFoundException -> 0x00aa }
        r5 = r5.versionCode;	 Catch:{ NameNotFoundException -> 0x00aa }
        goto L_0x00ab;
    L_0x00aa:
        r5 = -1;
    L_0x00ab:
        r6 = java.lang.Integer.toString(r5);
        r8 = "gmsv";
        r1.putString(r8, r6);
        r6 = android.os.Build.VERSION.SDK_INT;
        r6 = java.lang.Integer.toString(r6);
        r8 = "osv";
        r1.putString(r8, r6);
        r6 = r3.b;
        r6 = defpackage.qhq.a(r6);
        r6 = java.lang.Integer.toString(r6);
        r8 = "app_ver";
        r1.putString(r8, r6);
        r6 = r3.b;
        r8 = r6.getPackageManager();	 Catch:{ NameNotFoundException -> 0x00df }
        r6 = r6.getPackageName();	 Catch:{ NameNotFoundException -> 0x00df }
        r6 = r8.getPackageInfo(r6, r7);	 Catch:{ NameNotFoundException -> 0x00df }
        r6 = r6.versionName;	 Catch:{ NameNotFoundException -> 0x00df }
        goto L_0x0101;
    L_0x00df:
        r6 = move-exception;
        r6 = java.lang.String.valueOf(r6);
        r7 = r6.length();
        r8 = new java.lang.StringBuilder;
        r7 = r7 + 38;
        r8.<init>(r7);
        r7 = "Never happens: can't find own package ";
        r8.append(r7);
        r8.append(r6);
        r6 = r8.toString();
        r7 = "InstanceID";
        android.util.Log.w(r7, r6);
        r6 = r2;
    L_0x0101:
        r7 = "app_ver_name";
        r1.putString(r7, r6);
        r6 = "cliv";
        r7 = "iid-13280000";
        r1.putString(r6, r7);
        r4 = defpackage.qhq.a(r4);
        r6 = "appid";
        r1.putString(r6, r4);
        r4 = 12000000; // 0xb71b00 float:1.6815582E-38 double:5.9287878E-317;
        if (r5 < r4) goto L_0x0161;
    L_0x011b:
        r4 = defpackage.qhu.a;
        r4 = r4.a();
        r4 = (java.lang.Boolean) r4;
        r4 = r4.booleanValue();
        if (r4 == 0) goto L_0x0161;
    L_0x0129:
        r4 = new qih;
        r5 = r3.b;
        r4.<init>(r5);
        r5 = new qis;
        r6 = r4.a();
        r5.<init>(r6, r1);
        r4 = r4.a(r5);
        r4 = defpackage.rym.a(r4);	 Catch:{ InterruptedException -> 0x0147, InterruptedException | ExecutionException -> 0x0145 }
        r4 = (android.os.Bundle) r4;	 Catch:{ InterruptedException -> 0x0147, InterruptedException | ExecutionException -> 0x0145 }
        r2 = r4;
        goto L_0x0165;
    L_0x0145:
        r4 = move-exception;
        goto L_0x0148;
    L_0x0147:
        r4 = move-exception;
    L_0x0148:
        r5 = r4.getCause();
        r5 = r5 instanceof defpackage.qip;
        if (r5 == 0) goto L_0x0165;
    L_0x0150:
        r4 = r4.getCause();
        r4 = (defpackage.qip) r4;
        r4 = r4.a;
        r5 = 4;
        if (r4 == r5) goto L_0x015c;
    L_0x015b:
        goto L_0x0165;
    L_0x015c:
        r2 = r3.b(r1);
        goto L_0x0165;
    L_0x0161:
        r2 = r3.b(r1);
    L_0x0165:
        r1 = defpackage.qhu.a(r2);
        r2 = "RST";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x0186;
    L_0x0171:
        r2 = "RST|";
        r2 = r1.startsWith(r2);
        if (r2 != 0) goto L_0x0186;
    L_0x0179:
        r3 = defpackage.qhq.b;
        r4 = r0.f;
        r8 = defpackage.qhq.d;
        r5 = r10;
        r6 = r11;
        r7 = r1;
        r3.a(r4, r5, r6, r7, r8);
        return r1;
    L_0x0186:
        r10 = r0.e;
        r11 = defpackage.qhq.b;
        defpackage.qhs.a(r10, r11);
        r10 = new java.io.IOException;
        r11 = "SERVICE_NOT_AVAILABLE";
        r10.<init>(r11);
        throw r10;
    L_0x0195:
        return r1;
    L_0x0196:
        r10 = new java.io.IOException;
        r11 = "MAIN_THREAD";
        r10.<init>(r11);
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tkf.a(java.lang.String, java.lang.String):java.lang.String");
    }
}
