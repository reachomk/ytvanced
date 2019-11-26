package defpackage;

/* renamed from: efz */
public final class efz implements egb {
    private final xba a;

    public efz(xba xba) {
        this.a = xba;
    }

    public final boolean a() {
        return true;
    }

    public final void a(acya acya) {
        acya.a(egc.class, "proc_k");
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x0141 A:{Catch:{ Exception -> 0x00ea, Exception -> 0x0149 }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013b A:{Catch:{ Exception -> 0x00ea, Exception -> 0x0149 }} */
    public final defpackage.xbb b() {
        /*
        r11 = this;
        r0 = 0;
        r1 = r11.a;	 Catch:{ Exception -> 0x0149 }
        r2 = new java.io.File;	 Catch:{ Exception -> 0x012b }
        r3 = "/proc/self/stat";
        r2.<init>(r3);	 Catch:{ Exception -> 0x012b }
        r3 = r1.b;	 Catch:{ Exception -> 0x012b }
        r2 = r3.a(r2);	 Catch:{ Exception -> 0x012b }
        r3 = " ";
        r3 = r2.split(r3);	 Catch:{ Exception -> 0x0129 }
        r4 = r3.length;	 Catch:{ Exception -> 0x0129 }
        r5 = 21;
        if (r4 <= r5) goto L_0x0110;
    L_0x001b:
        r3 = r3[r5];	 Catch:{ Exception -> 0x0129 }
        r4 = java.lang.Long.decode(r3);	 Catch:{ NumberFormatException -> 0x00f3 }
        r2 = r4.longValue();	 Catch:{ NumberFormatException -> 0x00f3 }
        r4 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x0149 }
        if (r4 < r5) goto L_0x0030;
    L_0x0029:
        r4 = android.system.OsConstants._SC_CLK_TCK;	 Catch:{ Exception -> 0x0149 }
        r4 = android.system.Os.sysconf(r4);	 Catch:{ Exception -> 0x0149 }
        goto L_0x007a;
    L_0x0030:
        r4 = "libcore.io.Libcore";
        r4 = java.lang.Class.forName(r4);	 Catch:{ Exception -> 0x00ea }
        r5 = "os";
        r4 = r4.getField(r5);	 Catch:{ Exception -> 0x00ea }
        r4 = r4.get(r0);	 Catch:{ Exception -> 0x00ea }
        r5 = r4.getClass();	 Catch:{ Exception -> 0x00ea }
        r6 = "sysconf";
        r7 = 1;
        r8 = new java.lang.Class[r7];	 Catch:{ Exception -> 0x00ea }
        r9 = java.lang.Integer.TYPE;	 Catch:{ Exception -> 0x00ea }
        r10 = 0;
        r8[r10] = r9;	 Catch:{ Exception -> 0x00ea }
        r5 = r5.getMethod(r6, r8);	 Catch:{ Exception -> 0x00ea }
        r6 = "libcore.io.OsConstants";
        r6 = java.lang.Class.forName(r6);	 Catch:{ Exception -> 0x00ea }
        r8 = "_SC_CLK_TCK";
        r6 = r6.getField(r8);	 Catch:{ Exception -> 0x00ea }
        r6 = r6.get(r0);	 Catch:{ Exception -> 0x00ea }
        r6 = (java.lang.Integer) r6;	 Catch:{ Exception -> 0x00ea }
        r6 = r6.intValue();	 Catch:{ Exception -> 0x00ea }
        r7 = new java.lang.Object[r7];	 Catch:{ Exception -> 0x00ea }
        r6 = java.lang.Integer.valueOf(r6);	 Catch:{ Exception -> 0x00ea }
        r7[r10] = r6;	 Catch:{ Exception -> 0x00ea }
        r4 = r5.invoke(r4, r7);	 Catch:{ Exception -> 0x00ea }
        r4 = (java.lang.Long) r4;	 Catch:{ Exception -> 0x00ea }
        r4 = r4.longValue();	 Catch:{ Exception -> 0x00ea }
    L_0x007a:
        r6 = 0;
        r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r8 <= 0) goto L_0x00d1;
    L_0x0080:
        r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r8 <= 0) goto L_0x00b8;
    L_0x0084:
        r8 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ Exception -> 0x0149 }
        r2 = r8.toMillis(r2);	 Catch:{ Exception -> 0x0149 }
        r2 = r2 / r4;
        r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x009f;
    L_0x008f:
        r1 = r1.a;	 Catch:{ Exception -> 0x0149 }
        r4 = r1.b();	 Catch:{ Exception -> 0x0149 }
        r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r1 >= 0) goto L_0x009f;
    L_0x0099:
        r1 = new egc;	 Catch:{ Exception -> 0x0149 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0149 }
        return r1;
    L_0x009f:
        r1 = new xbf;	 Catch:{ Exception -> 0x0149 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0149 }
        r5 = 52;
        r4.<init>(r5);	 Catch:{ Exception -> 0x0149 }
        r5 = "valueInElapsedMillis bad value: ";
        r4.append(r5);	 Catch:{ Exception -> 0x0149 }
        r4.append(r2);	 Catch:{ Exception -> 0x0149 }
        r2 = r4.toString();	 Catch:{ Exception -> 0x0149 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0149 }
        throw r1;	 Catch:{ Exception -> 0x0149 }
    L_0x00b8:
        r1 = new xbf;	 Catch:{ Exception -> 0x0149 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0149 }
        r5 = 56;
        r4.<init>(r5);	 Catch:{ Exception -> 0x0149 }
        r5 = "processCreateTimeJiffies bad value: ";
        r4.append(r5);	 Catch:{ Exception -> 0x0149 }
        r4.append(r2);	 Catch:{ Exception -> 0x0149 }
        r2 = r4.toString();	 Catch:{ Exception -> 0x0149 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0149 }
        throw r1;	 Catch:{ Exception -> 0x0149 }
    L_0x00d1:
        r1 = new xbf;	 Catch:{ Exception -> 0x0149 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0149 }
        r3 = 48;
        r2.<init>(r3);	 Catch:{ Exception -> 0x0149 }
        r3 = "jiffiesPerSecond bad value: ";
        r2.append(r3);	 Catch:{ Exception -> 0x0149 }
        r2.append(r4);	 Catch:{ Exception -> 0x0149 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0149 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0149 }
        throw r1;	 Catch:{ Exception -> 0x0149 }
    L_0x00ea:
        r1 = move-exception;
        r2 = new xbf;	 Catch:{ Exception -> 0x0149 }
        r3 = "reflection jiffies";
        r2.<init>(r3, r1);	 Catch:{ Exception -> 0x0149 }
        throw r2;	 Catch:{ Exception -> 0x0149 }
    L_0x00f3:
        r1 = move-exception;
        r4 = new xbf;	 Catch:{ Exception -> 0x0129 }
        r5 = "Failed to parse: ";
        r3 = java.lang.String.valueOf(r3);	 Catch:{ Exception -> 0x0129 }
        r6 = r3.length();	 Catch:{ Exception -> 0x0129 }
        if (r6 != 0) goto L_0x0108;
    L_0x0102:
        r3 = new java.lang.String;	 Catch:{ Exception -> 0x0129 }
        r3.<init>(r5);	 Catch:{ Exception -> 0x0129 }
        goto L_0x010c;
    L_0x0108:
        r3 = r5.concat(r3);	 Catch:{ Exception -> 0x0129 }
    L_0x010c:
        r4.<init>(r3, r1);	 Catch:{ Exception -> 0x0129 }
        throw r4;	 Catch:{ Exception -> 0x0129 }
    L_0x0110:
        r1 = new xbf;	 Catch:{ Exception -> 0x0129 }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0129 }
        r5 = 30;
        r3.<init>(r5);	 Catch:{ Exception -> 0x0129 }
        r5 = "Not enough fields: ";
        r3.append(r5);	 Catch:{ Exception -> 0x0129 }
        r3.append(r4);	 Catch:{ Exception -> 0x0129 }
        r3 = r3.toString();	 Catch:{ Exception -> 0x0129 }
        r1.<init>(r3);	 Catch:{ Exception -> 0x0129 }
        throw r1;	 Catch:{ Exception -> 0x0129 }
    L_0x0129:
        r1 = move-exception;
        goto L_0x012d;
    L_0x012b:
        r1 = move-exception;
        r2 = r0;
    L_0x012d:
        r3 = new xbf;	 Catch:{ Exception -> 0x0149 }
        r4 = "Failed to get process create time: ";
        r2 = java.lang.String.valueOf(r2);	 Catch:{ Exception -> 0x0149 }
        r5 = r2.length();	 Catch:{ Exception -> 0x0149 }
        if (r5 != 0) goto L_0x0141;
    L_0x013b:
        r2 = new java.lang.String;	 Catch:{ Exception -> 0x0149 }
        r2.<init>(r4);	 Catch:{ Exception -> 0x0149 }
        goto L_0x0145;
    L_0x0141:
        r2 = r4.concat(r2);	 Catch:{ Exception -> 0x0149 }
    L_0x0145:
        r3.<init>(r2, r1);	 Catch:{ Exception -> 0x0149 }
        throw r3;	 Catch:{ Exception -> 0x0149 }
    L_0x0149:
        r1 = move-exception;
        r2 = 2;
        r3 = defpackage.afpf.initialization;
        r4 = "Failed to obtain process fork time using Kernel stats";
        defpackage.afpc.a(r2, r3, r4, r1);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efz.b():xbb");
    }
}
