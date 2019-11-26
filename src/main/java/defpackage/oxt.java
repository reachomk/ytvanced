package defpackage;

import android.os.ConditionVariable;

/* renamed from: oxt */
final class oxt extends Thread {
    private final /* synthetic */ ConditionVariable a;
    private final /* synthetic */ oxu b;

    oxt(oxu oxu, String str, ConditionVariable conditionVariable) {
        this.b = oxu;
        this.a = conditionVariable;
        super(str);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x009e */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|18|19|20|64) */
    public final void run() {
        /*
        r12 = this;
        r0 = r12.b;
        monitor-enter(r0);
        r1 = r12.a;	 Catch:{ all -> 0x01ca }
        r1.open();	 Catch:{ all -> 0x01ca }
        r1 = r12.b;	 Catch:{ all -> 0x01ca }
        r2 = r1.b;	 Catch:{ all -> 0x01ca }
        r2 = r2.exists();	 Catch:{ all -> 0x01ca }
        if (r2 != 0) goto L_0x0045;
    L_0x0012:
        r2 = r1.b;	 Catch:{ all -> 0x01ca }
        r2 = r2.mkdirs();	 Catch:{ all -> 0x01ca }
        if (r2 != 0) goto L_0x0045;
    L_0x001a:
        r2 = r1.b;	 Catch:{ all -> 0x01ca }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x01ca }
        r3 = r2.length();	 Catch:{ all -> 0x01ca }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01ca }
        r3 = r3 + 34;
        r4.<init>(r3);	 Catch:{ all -> 0x01ca }
        r3 = "Failed to create cache directory: ";
        r4.append(r3);	 Catch:{ all -> 0x01ca }
        r4.append(r2);	 Catch:{ all -> 0x01ca }
        r2 = r4.toString();	 Catch:{ all -> 0x01ca }
        r3 = "SimpleCache";
        defpackage.oyp.b(r3, r2);	 Catch:{ all -> 0x01ca }
        r3 = new owv;	 Catch:{ all -> 0x01ca }
        r3.<init>(r2);	 Catch:{ all -> 0x01ca }
        r1.e = r3;	 Catch:{ all -> 0x01ca }
        goto L_0x01c1;
    L_0x0045:
        r2 = r1.b;	 Catch:{ all -> 0x01ca }
        r2 = r2.listFiles();	 Catch:{ all -> 0x01ca }
        if (r2 != 0) goto L_0x0078;
    L_0x004d:
        r2 = r1.b;	 Catch:{ all -> 0x01ca }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x01ca }
        r3 = r2.length();	 Catch:{ all -> 0x01ca }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01ca }
        r3 = r3 + 38;
        r4.<init>(r3);	 Catch:{ all -> 0x01ca }
        r3 = "Failed to list cache directory files: ";
        r4.append(r3);	 Catch:{ all -> 0x01ca }
        r4.append(r2);	 Catch:{ all -> 0x01ca }
        r2 = r4.toString();	 Catch:{ all -> 0x01ca }
        r3 = "SimpleCache";
        defpackage.oyp.b(r3, r2);	 Catch:{ all -> 0x01ca }
        r3 = new owv;	 Catch:{ all -> 0x01ca }
        r3.<init>(r2);	 Catch:{ all -> 0x01ca }
        r1.e = r3;	 Catch:{ all -> 0x01ca }
        goto L_0x01c1;
    L_0x0078:
        r3 = r2.length;	 Catch:{ all -> 0x01ca }
        r4 = 0;
        r5 = 0;
    L_0x007b:
        r6 = 16;
        r7 = -1;
        if (r5 >= r3) goto L_0x00c4;
    L_0x0081:
        r9 = r2[r5];	 Catch:{ all -> 0x01ca }
        r10 = r9.getName();	 Catch:{ all -> 0x01ca }
        r11 = ".uid";
        r11 = r10.endsWith(r11);	 Catch:{ all -> 0x01ca }
        if (r11 == 0) goto L_0x00c1;
    L_0x008f:
        r11 = 46;
        r11 = r10.indexOf(r11);	 Catch:{ NumberFormatException -> 0x009e }
        r10 = r10.substring(r4, r11);	 Catch:{ NumberFormatException -> 0x009e }
        r9 = java.lang.Long.parseLong(r10, r6);	 Catch:{ NumberFormatException -> 0x009e }
        goto L_0x00c5;
    L_0x009e:
        r6 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x01ca }
        r7 = r6.length();	 Catch:{ all -> 0x01ca }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01ca }
        r7 = r7 + 20;
        r8.<init>(r7);	 Catch:{ all -> 0x01ca }
        r7 = "Malformed UID file: ";
        r8.append(r7);	 Catch:{ all -> 0x01ca }
        r8.append(r6);	 Catch:{ all -> 0x01ca }
        r6 = "SimpleCache";
        r7 = r8.toString();	 Catch:{ all -> 0x01ca }
        defpackage.oyp.b(r6, r7);	 Catch:{ all -> 0x01ca }
        r9.delete();	 Catch:{ all -> 0x01ca }
    L_0x00c1:
        r5 = r5 + 1;
        goto L_0x007b;
    L_0x00c4:
        r9 = r7;
    L_0x00c5:
        r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1));
        if (r3 == 0) goto L_0x00ca;
    L_0x00c9:
        goto L_0x0107;
    L_0x00ca:
        r3 = r1.b;	 Catch:{ IOException -> 0x0197 }
        r5 = new java.security.SecureRandom;	 Catch:{ IOException -> 0x0197 }
        r5.<init>();	 Catch:{ IOException -> 0x0197 }
        r7 = r5.nextLong();	 Catch:{ IOException -> 0x0197 }
        r9 = -9223372036854775808;
        r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));
        if (r5 == 0) goto L_0x00e0;
    L_0x00db:
        r7 = java.lang.Math.abs(r7);	 Catch:{ IOException -> 0x0197 }
        goto L_0x00e2;
    L_0x00e0:
        r7 = 0;
    L_0x00e2:
        r5 = java.lang.Long.toString(r7, r6);	 Catch:{ IOException -> 0x0197 }
        r6 = new java.io.File;	 Catch:{ IOException -> 0x0197 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ IOException -> 0x0197 }
        r7 = ".uid";
        r8 = r7.length();	 Catch:{ IOException -> 0x0197 }
        if (r8 != 0) goto L_0x00fa;
    L_0x00f4:
        r7 = new java.lang.String;	 Catch:{ IOException -> 0x0197 }
        r7.<init>(r5);	 Catch:{ IOException -> 0x0197 }
        goto L_0x00fe;
    L_0x00fa:
        r7 = r5.concat(r7);	 Catch:{ IOException -> 0x0197 }
    L_0x00fe:
        r6.<init>(r3, r7);	 Catch:{ IOException -> 0x0197 }
        r3 = r6.createNewFile();	 Catch:{ IOException -> 0x0197 }
        if (r3 == 0) goto L_0x0176;
    L_0x0107:
        r3 = r1.d;	 Catch:{ IOException -> 0x014b }
        r5 = r3.c;	 Catch:{ IOException -> 0x014b }
        r5.a();	 Catch:{ IOException -> 0x014b }
        r5 = r3.c;	 Catch:{ IOException -> 0x014b }
        r6 = r3.a;	 Catch:{ IOException -> 0x014b }
        r3 = r3.b;	 Catch:{ IOException -> 0x014b }
        r5.a(r6, r3);	 Catch:{ IOException -> 0x014b }
        r3 = r1.b;	 Catch:{ IOException -> 0x014b }
        r5 = 1;
        r1.a(r3, r5, r2);	 Catch:{ IOException -> 0x014b }
        r2 = r1.d;	 Catch:{ all -> 0x01ca }
        r3 = r2.a;	 Catch:{ all -> 0x01ca }
        r3 = r3.size();	 Catch:{ all -> 0x01ca }
        r3 = new java.lang.String[r3];	 Catch:{ all -> 0x01ca }
        r5 = r2.a;	 Catch:{ all -> 0x01ca }
        r5 = r5.keySet();	 Catch:{ all -> 0x01ca }
        r5.toArray(r3);	 Catch:{ all -> 0x01ca }
        r5 = r3.length;	 Catch:{ all -> 0x01ca }
    L_0x0131:
        if (r4 >= r5) goto L_0x013b;
    L_0x0133:
        r6 = r3[r4];	 Catch:{ all -> 0x01ca }
        r2.c(r6);	 Catch:{ all -> 0x01ca }
        r4 = r4 + 1;
        goto L_0x0131;
    L_0x013b:
        r1 = r1.d;	 Catch:{ IOException -> 0x0142 }
        r1.a();	 Catch:{ IOException -> 0x0142 }
        goto L_0x01c1;
    L_0x0142:
        r1 = move-exception;
        r2 = "SimpleCache";
        r3 = "Storing index file failed";
        defpackage.oyp.b(r2, r3, r1);	 Catch:{ all -> 0x01ca }
        goto L_0x01c1;
    L_0x014b:
        r2 = move-exception;
        r3 = r1.b;	 Catch:{ all -> 0x01ca }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x01ca }
        r4 = r3.length();	 Catch:{ all -> 0x01ca }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01ca }
        r4 = r4 + 36;
        r5.<init>(r4);	 Catch:{ all -> 0x01ca }
        r4 = "Failed to initialize cache indices: ";
        r5.append(r4);	 Catch:{ all -> 0x01ca }
        r5.append(r3);	 Catch:{ all -> 0x01ca }
        r3 = r5.toString();	 Catch:{ all -> 0x01ca }
        r4 = "SimpleCache";
        defpackage.oyp.b(r4, r3, r2);	 Catch:{ all -> 0x01ca }
        r4 = new owv;	 Catch:{ all -> 0x01ca }
        r4.<init>(r3, r2);	 Catch:{ all -> 0x01ca }
        r1.e = r4;	 Catch:{ all -> 0x01ca }
        goto L_0x01c1;
    L_0x0176:
        r2 = new java.io.IOException;	 Catch:{ IOException -> 0x0197 }
        r3 = java.lang.String.valueOf(r6);	 Catch:{ IOException -> 0x0197 }
        r4 = r3.length();	 Catch:{ IOException -> 0x0197 }
        r4 = r4 + 27;
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0197 }
        r5.<init>(r4);	 Catch:{ IOException -> 0x0197 }
        r4 = "Failed to create UID file: ";
        r5.append(r4);	 Catch:{ IOException -> 0x0197 }
        r5.append(r3);	 Catch:{ IOException -> 0x0197 }
        r3 = r5.toString();	 Catch:{ IOException -> 0x0197 }
        r2.<init>(r3);	 Catch:{ IOException -> 0x0197 }
        throw r2;	 Catch:{ IOException -> 0x0197 }
    L_0x0197:
        r2 = move-exception;
        r3 = r1.b;	 Catch:{ all -> 0x01ca }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x01ca }
        r4 = r3.length();	 Catch:{ all -> 0x01ca }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x01ca }
        r4 = r4 + 28;
        r5.<init>(r4);	 Catch:{ all -> 0x01ca }
        r4 = "Failed to create cache UID: ";
        r5.append(r4);	 Catch:{ all -> 0x01ca }
        r5.append(r3);	 Catch:{ all -> 0x01ca }
        r3 = r5.toString();	 Catch:{ all -> 0x01ca }
        r4 = "SimpleCache";
        defpackage.oyp.b(r4, r3, r2);	 Catch:{ all -> 0x01ca }
        r4 = new owv;	 Catch:{ all -> 0x01ca }
        r4.<init>(r3, r2);	 Catch:{ all -> 0x01ca }
        r1.e = r4;	 Catch:{ all -> 0x01ca }
    L_0x01c1:
        r1 = r12.b;	 Catch:{ all -> 0x01ca }
        r1 = r1.c;	 Catch:{ all -> 0x01ca }
        r1.b();	 Catch:{ all -> 0x01ca }
        monitor-exit(r0);	 Catch:{ all -> 0x01ca }
        return;
    L_0x01ca:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x01ca }
        goto L_0x01ce;
    L_0x01cd:
        throw r1;
    L_0x01ce:
        goto L_0x01cd;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oxt.run():void");
    }
}
