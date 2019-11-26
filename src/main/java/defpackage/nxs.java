package defpackage;

import android.os.ConditionVariable;

/* renamed from: nxs */
final class nxs extends Thread {
    private final /* synthetic */ ConditionVariable a;
    private final /* synthetic */ nxp b;

    nxs(nxp nxp, String str, ConditionVariable conditionVariable) {
        this.b = nxp;
        this.a = conditionVariable;
        super(str);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0047 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x0121 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|(2:7|(20:9|10|(4:13|(6:15|16|17|18|19|61)(1:62)|20|11)|60|21|(1:23)(1:24)|25|(1:27)(1:28)|29|(3:50|51|52)(0)|31|32|(1:34)|35|36|37|38|(2:40|41)|42|43)(0))(0)|53|54|55) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|16|17|18|19|61) */
    public final void run() {
        /*
        r12 = this;
        r0 = r12.b;
        monitor-enter(r0);
        r1 = r12.a;	 Catch:{ all -> 0x012a }
        r1.open();	 Catch:{ all -> 0x012a }
        r1 = r12.b;	 Catch:{ all -> 0x012a }
        r2 = r1.a;	 Catch:{ all -> 0x012a }
        r2 = r2.exists();	 Catch:{ all -> 0x012a }
        if (r2 != 0) goto L_0x001a;
    L_0x0012:
        r2 = r1.a;	 Catch:{ all -> 0x012a }
        r2 = r2.mkdirs();	 Catch:{ all -> 0x012a }
        if (r2 == 0) goto L_0x0121;
    L_0x001a:
        r2 = r1.a;	 Catch:{ all -> 0x012a }
        r2 = r2.listFiles();	 Catch:{ all -> 0x012a }
        if (r2 == 0) goto L_0x0121;
    L_0x0022:
        r3 = r1.a;	 Catch:{ IOException -> 0x0121 }
        r4 = r2.length;	 Catch:{ IOException -> 0x0121 }
        r5 = 0;
        r6 = 0;
    L_0x0027:
        r7 = 16;
        if (r6 >= r4) goto L_0x006d;
    L_0x002b:
        r8 = r2[r6];	 Catch:{ IOException -> 0x0121 }
        r9 = r8.getName();	 Catch:{ IOException -> 0x0121 }
        r10 = ".uid";
        r10 = r9.endsWith(r10);	 Catch:{ IOException -> 0x0121 }
        if (r10 == 0) goto L_0x006a;
    L_0x0039:
        r10 = 46;
        r10 = r9.indexOf(r10);	 Catch:{ NumberFormatException -> 0x0047 }
        r9 = r9.substring(r5, r10);	 Catch:{ NumberFormatException -> 0x0047 }
        java.lang.Long.parseLong(r9, r7);	 Catch:{ NumberFormatException -> 0x0047 }
        goto L_0x00a8;
    L_0x0047:
        r7 = "SimpleCache";
        r9 = java.lang.String.valueOf(r8);	 Catch:{ IOException -> 0x0121 }
        r10 = r9.length();	 Catch:{ IOException -> 0x0121 }
        r10 = r10 + 20;
        r11 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0121 }
        r11.<init>(r10);	 Catch:{ IOException -> 0x0121 }
        r10 = "Malformed UID file: ";
        r11.append(r10);	 Catch:{ IOException -> 0x0121 }
        r11.append(r9);	 Catch:{ IOException -> 0x0121 }
        r9 = r11.toString();	 Catch:{ IOException -> 0x0121 }
        defpackage.oyp.b(r7, r9);	 Catch:{ IOException -> 0x0121 }
        r8.delete();	 Catch:{ IOException -> 0x0121 }
    L_0x006a:
        r6 = r6 + 1;
        goto L_0x0027;
    L_0x006d:
        r4 = new java.security.SecureRandom;	 Catch:{ IOException -> 0x0121 }
        r4.<init>();	 Catch:{ IOException -> 0x0121 }
        r8 = r4.nextLong();	 Catch:{ IOException -> 0x0121 }
        r10 = -9223372036854775808;
        r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r4 == 0) goto L_0x0081;
    L_0x007c:
        r8 = java.lang.Math.abs(r8);	 Catch:{ IOException -> 0x0121 }
        goto L_0x0083;
    L_0x0081:
        r8 = 0;
    L_0x0083:
        r4 = java.lang.Long.toString(r8, r7);	 Catch:{ IOException -> 0x0121 }
        r6 = new java.io.File;	 Catch:{ IOException -> 0x0121 }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ IOException -> 0x0121 }
        r7 = ".uid";
        r8 = r7.length();	 Catch:{ IOException -> 0x0121 }
        if (r8 != 0) goto L_0x009b;
    L_0x0095:
        r7 = new java.lang.String;	 Catch:{ IOException -> 0x0121 }
        r7.<init>(r4);	 Catch:{ IOException -> 0x0121 }
        goto L_0x009f;
    L_0x009b:
        r7 = r4.concat(r7);	 Catch:{ IOException -> 0x0121 }
    L_0x009f:
        r6.<init>(r3, r7);	 Catch:{ IOException -> 0x0121 }
        r3 = r6.createNewFile();	 Catch:{ IOException -> 0x0121 }
        if (r3 == 0) goto L_0x0100;
    L_0x00a8:
        r3 = r1.c;	 Catch:{ all -> 0x012a }
        r4 = r3.c;	 Catch:{ all -> 0x012a }
        r4.a();	 Catch:{ all -> 0x012a }
        r4 = r3.c;	 Catch:{ all -> 0x012a }
        r6 = r3.a;	 Catch:{ all -> 0x012a }
        r7 = r3.b;	 Catch:{ all -> 0x012a }
        r4 = r4.a(r6, r7);	 Catch:{ all -> 0x012a }
        if (r4 != 0) goto L_0x00c5;
    L_0x00bb:
        r4 = r3.a;	 Catch:{ all -> 0x012a }
        r4.clear();	 Catch:{ all -> 0x012a }
        r3 = r3.b;	 Catch:{ all -> 0x012a }
        r3.clear();	 Catch:{ all -> 0x012a }
    L_0x00c5:
        r3 = r1.a;	 Catch:{ odd -> 0x00f8 }
        r4 = 1;
        r1.a(r3, r4, r2);	 Catch:{ odd -> 0x00f8 }
        r2 = r1.c;	 Catch:{ all -> 0x012a }
        r3 = r2.a;	 Catch:{ all -> 0x012a }
        r3 = r3.size();	 Catch:{ all -> 0x012a }
        r3 = new java.lang.String[r3];	 Catch:{ all -> 0x012a }
        r4 = r2.a;	 Catch:{ all -> 0x012a }
        r4 = r4.keySet();	 Catch:{ all -> 0x012a }
        r4.toArray(r3);	 Catch:{ all -> 0x012a }
        r4 = r3.length;	 Catch:{ all -> 0x012a }
    L_0x00df:
        if (r5 >= r4) goto L_0x00e9;
    L_0x00e1:
        r6 = r3[r5];	 Catch:{ all -> 0x012a }
        r2.c(r6);	 Catch:{ all -> 0x012a }
        r5 = r5 + 1;
        goto L_0x00df;
    L_0x00e9:
        r1 = r1.c;	 Catch:{ owv -> 0x00ef }
        r1.a();	 Catch:{ owv -> 0x00ef }
        goto L_0x0121;
    L_0x00ef:
        r1 = move-exception;
        r2 = "SimpleCache";
        r3 = "Storing index file failed";
        defpackage.oyp.b(r2, r3, r1);	 Catch:{ all -> 0x012a }
        goto L_0x0121;
    L_0x00f8:
        r1 = move-exception;
        r1 = r1.getCause();	 Catch:{ all -> 0x012a }
        r1 = (android.database.SQLException) r1;	 Catch:{ all -> 0x012a }
        throw r1;	 Catch:{ all -> 0x012a }
    L_0x0100:
        r1 = new java.io.IOException;	 Catch:{ IOException -> 0x0121 }
        r2 = java.lang.String.valueOf(r6);	 Catch:{ IOException -> 0x0121 }
        r3 = r2.length();	 Catch:{ IOException -> 0x0121 }
        r3 = r3 + 27;
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0121 }
        r4.<init>(r3);	 Catch:{ IOException -> 0x0121 }
        r3 = "Failed to create UID file: ";
        r4.append(r3);	 Catch:{ IOException -> 0x0121 }
        r4.append(r2);	 Catch:{ IOException -> 0x0121 }
        r2 = r4.toString();	 Catch:{ IOException -> 0x0121 }
        r1.<init>(r2);	 Catch:{ IOException -> 0x0121 }
        throw r1;	 Catch:{ IOException -> 0x0121 }
    L_0x0121:
        r1 = r12.b;	 Catch:{ all -> 0x012a }
        r1 = r1.b;	 Catch:{ all -> 0x012a }
        r1.b();	 Catch:{ all -> 0x012a }
        monitor-exit(r0);	 Catch:{ all -> 0x012a }
        return;
    L_0x012a:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x012a }
        goto L_0x012e;
    L_0x012d:
        throw r1;
    L_0x012e:
        goto L_0x012d;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxs.run():void");
    }
}
