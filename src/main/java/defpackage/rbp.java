package defpackage;

import java.io.PrintWriter;

/* renamed from: rbp */
public final class rbp {
    public static final rbr a;

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        a.a(th, printWriter);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007e  */
    static {
        /*
        r0 = 0;
        r1 = "android.os.Build$VERSION";
        r1 = java.lang.Class.forName(r1);	 Catch:{ Exception -> 0x0015 }
        r2 = "SDK_INT";
        r1 = r1.getField(r2);	 Catch:{ Exception -> 0x0015 }
        r1 = r1.get(r0);	 Catch:{ Exception -> 0x0015 }
        r1 = (java.lang.Integer) r1;	 Catch:{ Exception -> 0x0015 }
        r0 = r1;
        goto L_0x0022;
    L_0x0015:
        r1 = move-exception;
        r2 = java.lang.System.err;	 Catch:{ all -> 0x0048 }
        r3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.";
        r2.println(r3);	 Catch:{ all -> 0x0048 }
        r2 = java.lang.System.err;	 Catch:{ all -> 0x0048 }
        defpackage.ankx.a(r1, r2);	 Catch:{ all -> 0x0048 }
    L_0x0022:
        if (r0 == 0) goto L_0x0032;
    L_0x0024:
        r1 = r0.intValue();	 Catch:{ all -> 0x0048 }
        r2 = 19;
        if (r1 < r2) goto L_0x0032;
    L_0x002c:
        r1 = new rbv;	 Catch:{ all -> 0x0048 }
        r1.<init>();	 Catch:{ all -> 0x0048 }
        goto L_0x007a;
    L_0x0032:
        r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic";
        r1 = java.lang.Boolean.getBoolean(r1);	 Catch:{ all -> 0x0048 }
        r1 = r1 ^ 1;
        if (r1 == 0) goto L_0x0042;
    L_0x003c:
        r1 = new rbw;	 Catch:{ all -> 0x0048 }
        r1.<init>();	 Catch:{ all -> 0x0048 }
        goto L_0x007a;
    L_0x0042:
        r1 = new rbs;	 Catch:{ all -> 0x0048 }
        r1.<init>();	 Catch:{ all -> 0x0048 }
        goto L_0x007a;
    L_0x0048:
        r1 = move-exception;
        r2 = java.lang.System.err;
        r3 = defpackage.rbs.class;
        r3 = r3.getName();
        r4 = r3.length();
        r5 = new java.lang.StringBuilder;
        r4 = r4 + 132;
        r5.<init>(r4);
        r4 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ";
        r5.append(r4);
        r5.append(r3);
        r3 = "will be used. The error is: ";
        r5.append(r3);
        r3 = r5.toString();
        r2.println(r3);
        r2 = java.lang.System.err;
        defpackage.ankx.a(r1, r2);
        r1 = new rbs;
        r1.<init>();
    L_0x007a:
        a = r1;
        if (r0 == 0) goto L_0x0081;
    L_0x007e:
        r0.intValue();
    L_0x0081:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rbp.<clinit>():void");
    }
}
