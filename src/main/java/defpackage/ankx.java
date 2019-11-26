package defpackage;

import java.io.PrintStream;
import java.io.PrintWriter;

/* renamed from: ankx */
public final class ankx {
    private static final anla a;

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }

    public static void a(Throwable th) {
        a.a(th);
    }

    public static void a(Throwable th, PrintWriter printWriter) {
        a.a(th, printWriter);
    }

    public static void a(Throwable th, PrintStream printStream) {
        a.a(th, printStream);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
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
        r2 = java.lang.System.err;	 Catch:{ all -> 0x0049 }
        r3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.";
        r2.println(r3);	 Catch:{ all -> 0x0049 }
        r2 = java.lang.System.err;	 Catch:{ all -> 0x0049 }
        r1.printStackTrace(r2);	 Catch:{ all -> 0x0049 }
    L_0x0022:
        if (r0 != 0) goto L_0x0025;
    L_0x0024:
        goto L_0x0033;
    L_0x0025:
        r1 = r0.intValue();	 Catch:{ all -> 0x0049 }
        r2 = 19;
        if (r1 < r2) goto L_0x0033;
    L_0x002d:
        r1 = new anld;	 Catch:{ all -> 0x0049 }
        r1.<init>();	 Catch:{ all -> 0x0049 }
        goto L_0x007b;
    L_0x0033:
        r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic";
        r1 = java.lang.Boolean.getBoolean(r1);	 Catch:{ all -> 0x0049 }
        r1 = r1 ^ 1;
        if (r1 != 0) goto L_0x0043;
    L_0x003d:
        r1 = new anle;	 Catch:{ all -> 0x0049 }
        r1.<init>();	 Catch:{ all -> 0x0049 }
        goto L_0x007b;
    L_0x0043:
        r1 = new anlb;	 Catch:{ all -> 0x0049 }
        r1.<init>();	 Catch:{ all -> 0x0049 }
        goto L_0x007b;
    L_0x0049:
        r1 = move-exception;
        r2 = java.lang.System.err;
        r3 = defpackage.anle.class;
        r3 = r3.getName();
        r4 = r3.length();
        r5 = new java.lang.StringBuilder;
        r4 = r4 + 133;
        r5.<init>(r4);
        r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy ";
        r5.append(r4);
        r5.append(r3);
        r3 = "will be used. The error is: ";
        r5.append(r3);
        r3 = r5.toString();
        r2.println(r3);
        r2 = java.lang.System.err;
        r1.printStackTrace(r2);
        r1 = new anle;
        r1.<init>();
    L_0x007b:
        a = r1;
        if (r0 == 0) goto L_0x0082;
    L_0x007f:
        r0.intValue();
    L_0x0082:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ankx.<clinit>():void");
    }
}
