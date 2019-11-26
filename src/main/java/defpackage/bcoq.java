package defpackage;

import android.content.Context;

/* renamed from: bcoq */
public final class bcoq {
    private static final Object a = new Object();
    private static int b = 0;

    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002a */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:5|6|7|8|9|10|11) */
    public static java.lang.String a(android.content.Context r4) {
        /*
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r1 = r4.getPackageName();
        r0.append(r1);
        r1 = 47;
        r0.append(r1);
        r1 = a;
        monitor-enter(r1);
        r2 = b;	 Catch:{ all -> 0x0084 }
        if (r2 != 0) goto L_0x0032;
    L_0x0018:
        r2 = r4.getPackageManager();	 Catch:{ all -> 0x0084 }
        r4 = r4.getPackageName();	 Catch:{ all -> 0x0084 }
        r3 = 0;
        r4 = r2.getPackageInfo(r4, r3);	 Catch:{ NameNotFoundException -> 0x002a }
        r4 = r4.versionCode;	 Catch:{ NameNotFoundException -> 0x002a }
        b = r4;	 Catch:{ NameNotFoundException -> 0x002a }
        goto L_0x0032;
    L_0x002a:
        r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0084 }
        r0 = "Cannot determine package version";
        r4.<init>(r0);	 Catch:{ all -> 0x0084 }
        throw r4;	 Catch:{ all -> 0x0084 }
    L_0x0032:
        r4 = b;	 Catch:{ all -> 0x0084 }
        monitor-exit(r1);	 Catch:{ all -> 0x0084 }
        r0.append(r4);
        r4 = " (Linux; U; Android ";
        r0.append(r4);
        r4 = android.os.Build.VERSION.RELEASE;
        r0.append(r4);
        r4 = "; ";
        r0.append(r4);
        r4 = java.util.Locale.getDefault();
        r4 = r4.toString();
        r0.append(r4);
        r4 = android.os.Build.MODEL;
        r1 = r4.length();
        if (r1 <= 0) goto L_0x0062;
    L_0x005a:
        r1 = "; ";
        r0.append(r1);
        r0.append(r4);
    L_0x0062:
        r4 = android.os.Build.ID;
        r1 = r4.length();
        if (r1 <= 0) goto L_0x0072;
    L_0x006a:
        r1 = "; Build/";
        r0.append(r1);
        r0.append(r4);
    L_0x0072:
        r4 = ";";
        r0.append(r4);
        defpackage.bcoq.a(r0);
        r4 = 41;
        r0.append(r4);
        r4 = r0.toString();
        return r4;
    L_0x0084:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0084 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcoq.a(android.content.Context):java.lang.String");
    }

    public static String b(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getPackageName());
        bcoq.a(stringBuilder);
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder) {
        stringBuilder.append(" Cronet/76.0.3786.0");
    }
}
