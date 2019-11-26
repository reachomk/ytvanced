package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: ddx */
public final class ddx {
    private static Boolean a;

    public static Parcel a(Bundle bundle) {
        Parcel obtain = Parcel.obtain();
        bundle.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        return obtain;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0054 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:22|23|24|31|30) */
    /* JADX WARNING: Missing block: B:23:?, code skipped:
            a = java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Missing block: B:25:0x005c, code skipped:
            r1.recycle();
     */
    public static synchronized boolean a() {
        /*
        r0 = defpackage.ddx.class;
        monitor-enter(r0);
        r1 = a;	 Catch:{ all -> 0x0068 }
        if (r1 != 0) goto L_0x0060;
    L_0x0007:
        r1 = new android.os.Bundle;	 Catch:{ all -> 0x0068 }
        r1.<init>();	 Catch:{ all -> 0x0068 }
        r2 = "key";
        r3 = "value";
        r1.putString(r2, r3);	 Catch:{ all -> 0x0068 }
        r1 = defpackage.ddx.a(r1);	 Catch:{ all -> 0x0068 }
        r2 = r1.readInt();	 Catch:{ RuntimeException -> 0x0054 }
        r3 = 0;
        r4 = 1;
        if (r2 <= 0) goto L_0x0021;
    L_0x001f:
        r2 = 1;
        goto L_0x0022;
    L_0x0021:
        r2 = 0;
    L_0x0022:
        defpackage.ddx.a(r2);	 Catch:{ RuntimeException -> 0x0054 }
        r2 = r1.readInt();	 Catch:{ RuntimeException -> 0x0054 }
        r5 = 1279544898; // 0x4c444e42 float:5.146036E7 double:6.321791764E-315;
        if (r2 != r5) goto L_0x0030;
    L_0x002e:
        r2 = 1;
        goto L_0x0031;
    L_0x0030:
        r2 = 0;
    L_0x0031:
        defpackage.ddx.a(r2);	 Catch:{ RuntimeException -> 0x0054 }
        r2 = r1.readInt();	 Catch:{ RuntimeException -> 0x0054 }
        if (r2 != r4) goto L_0x003b;
    L_0x003a:
        r3 = 1;
    L_0x003b:
        defpackage.ddx.a(r3);	 Catch:{ RuntimeException -> 0x0054 }
        r2 = "key";
        r3 = r1.readString();	 Catch:{ RuntimeException -> 0x0054 }
        r2 = r2.equals(r3);	 Catch:{ RuntimeException -> 0x0054 }
        r2 = java.lang.Boolean.valueOf(r2);	 Catch:{ RuntimeException -> 0x0054 }
        a = r2;	 Catch:{ RuntimeException -> 0x0054 }
        r1.recycle();	 Catch:{ all -> 0x0068 }
        goto L_0x0060;
    L_0x0052:
        r2 = move-exception;
        goto L_0x005c;
    L_0x0054:
        r2 = java.lang.Boolean.FALSE;	 Catch:{ all -> 0x0052 }
        a = r2;	 Catch:{ all -> 0x0052 }
        r1.recycle();	 Catch:{ all -> 0x0068 }
        goto L_0x0060;
    L_0x005c:
        r1.recycle();	 Catch:{ all -> 0x0068 }
        throw r2;	 Catch:{ all -> 0x0068 }
    L_0x0060:
        r1 = a;	 Catch:{ all -> 0x0068 }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x0068 }
        monitor-exit(r0);
        return r1;
    L_0x0068:
        r1 = move-exception;
        monitor-exit(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddx.a():boolean");
    }

    private static void a(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }
}
