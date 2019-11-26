package defpackage;

import android.content.Context;
import android.util.Base64;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: aeth */
final class aeth extends afsv {
    public final afpt a;
    public final afqa b;
    private final Context k;
    private final byte[] l;
    private final afsa[] m;
    private final afsw n;
    private Map o;

    aeth(Context context, String str, byte[] bArr, afsa[] afsaArr, afpt afpt, afqa afqa, afsw afsw) {
        super(1, str, (bqk) afsw);
        this.k = context;
        this.l = bArr;
        this.a = (afpt) amqw.a((Object) afpt);
        this.b = afqa;
        this.n = afsw;
        this.m = afsaArr;
        n();
    }

    public final boolean j() {
        return true;
    }

    /* Access modifiers changed, original: final */
    public final void n() {
        this.o = new HashMap();
        for (afsa a : this.m) {
            try {
                a.a(this.o, this);
            } catch (bpx e) {
                afpc.a(1, afpf.media, "AuthFailure while initialization request headers.");
                String valueOf = String.valueOf(e.toString());
                String str = "WindvineGlsRequest: AuthFailureError";
                xtl.c(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
            }
        }
    }

    public final bqi d() {
        return bqi.IMMEDIATE;
    }

    public final bqh a(bqd bqd) {
        try {
            aetl a = aeth.a(this.k, bqd);
            if (a.a == 0) {
                return bqh.a(a, null);
            }
            return bqh.a(new aeti(a));
        } catch (bqf e) {
            return bqh.a(e);
        }
    }

    private static aetj a(Context context, bqd bqd) {
        try {
            String a = bqp.a(bqd.c);
            byte[] bArr = bqd.b;
            String str = new String(bArr, a);
            if (str.startsWith("GLS/1.")) {
                int indexOf = str.indexOf("\r\n\r\n");
                if (indexOf != -1) {
                    String[] split = str.substring(0, indexOf).split("\r\n");
                    Matcher matcher = Pattern.compile("GLS/[0-9]+\\.[0-9]+ ([0-9]+) (.*)").matcher(split[0]);
                    if (matcher.find()) {
                        int parseInt = Integer.parseInt(matcher.group(1));
                        HashMap hashMap = new HashMap();
                        for (int i = 1; i < split.length; i++) {
                            String[] split2 = split[i].split(": ");
                            hashMap.put(split2[0], split2[1]);
                        }
                        return new aetj(context, parseInt, Arrays.copyOfRange(bArr, indexOf + 4, bArr.length), hashMap);
                    }
                    throw new Exception("pattern not found.");
                }
                throw new IOException("Invalid response from server. Could not locate DRM message");
            }
            throw new IOException("Invalid response from server. Expected GLS/1.x");
        } catch (Exception e) {
            throw new bqf(e);
        }
    }

    public final Map c() {
        return this.o;
    }

    public final byte[] a() {
        return this.l;
    }

    public final afpt bm_() {
        return this.a;
    }

    public final List m() {
        byte[] bArr;
        StringBuilder stringBuilder = new StringBuilder("curl ");
        for (String str : this.o.keySet()) {
            stringBuilder.append("-H \"");
            stringBuilder.append(str);
            stringBuilder.append(":");
            stringBuilder.append((String) this.o.get(str));
            stringBuilder.append("\" ");
        }
        stringBuilder.append("--data-binary @<(echo '");
        try {
            bArr = this.l;
        } catch (bpx unused) {
            bArr = afsv.p;
        }
        stringBuilder.append(Base64.encodeToString(bArr, 2));
        stringBuilder.append("' | base64 -d - ) '");
        stringBuilder.append(this.d);
        stringBuilder.append("'");
        return Collections.singletonList(stringBuilder.toString());
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x012f */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:26|27|28|29) */
    /* JADX WARNING: Missing block: B:24:0x012c, code skipped:
            return r1;
     */
    /* JADX WARNING: Missing block: B:29:0x0134, code skipped:
            return super.b(r9);
     */
    public final synchronized java.util.List b(defpackage.bqd r9) {
        /*
        r8 = this;
        monitor-enter(r8);
        r0 = r8.k;	 Catch:{ bqf -> 0x012f }
        r0 = defpackage.aeth.a(r0, r9);	 Catch:{ bqf -> 0x012f }
        r1 = new java.util.ArrayList;	 Catch:{ all -> 0x012d }
        r1.<init>();	 Catch:{ all -> 0x012d }
        r2 = "GLS response logging with binary data converted into base64";
        r1.add(r2);	 Catch:{ all -> 0x012d }
        r2 = r9.a;	 Catch:{ all -> 0x012d }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012d }
        r4 = 20;
        r3.<init>(r4);	 Catch:{ all -> 0x012d }
        r4 = "Status: ";
        r3.append(r4);	 Catch:{ all -> 0x012d }
        r3.append(r2);	 Catch:{ all -> 0x012d }
        r2 = "\n";
        r3.append(r2);	 Catch:{ all -> 0x012d }
        r2 = r3.toString();	 Catch:{ all -> 0x012d }
        r1.add(r2);	 Catch:{ all -> 0x012d }
        r2 = r9.c;	 Catch:{ all -> 0x012d }
        r2 = r2.keySet();	 Catch:{ all -> 0x012d }
        r2 = r2.iterator();	 Catch:{ all -> 0x012d }
    L_0x0038:
        r3 = r2.hasNext();	 Catch:{ all -> 0x012d }
        if (r3 == 0) goto L_0x0081;
    L_0x003e:
        r3 = r2.next();	 Catch:{ all -> 0x012d }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x012d }
        r4 = r9.c;	 Catch:{ all -> 0x012d }
        r4 = r4.get(r3);	 Catch:{ all -> 0x012d }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x012d }
        r5 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x012d }
        r5 = r5.length();	 Catch:{ all -> 0x012d }
        r6 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x012d }
        r6 = r6.length();	 Catch:{ all -> 0x012d }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012d }
        r5 = r5 + 9;
        r5 = r5 + r6;
        r7.<init>(r5);	 Catch:{ all -> 0x012d }
        r5 = "Header:";
        r7.append(r5);	 Catch:{ all -> 0x012d }
        r7.append(r3);	 Catch:{ all -> 0x012d }
        r3 = ":";
        r7.append(r3);	 Catch:{ all -> 0x012d }
        r7.append(r4);	 Catch:{ all -> 0x012d }
        r3 = "\n";
        r7.append(r3);	 Catch:{ all -> 0x012d }
        r3 = r7.toString();	 Catch:{ all -> 0x012d }
        r1.add(r3);	 Catch:{ all -> 0x012d }
        goto L_0x0038;
    L_0x0081:
        r9 = r0.a;	 Catch:{ all -> 0x012d }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012d }
        r3 = 24;
        r2.<init>(r3);	 Catch:{ all -> 0x012d }
        r3 = "GLS Status: ";
        r2.append(r3);	 Catch:{ all -> 0x012d }
        r2.append(r9);	 Catch:{ all -> 0x012d }
        r9 = "\n";
        r2.append(r9);	 Catch:{ all -> 0x012d }
        r9 = r2.toString();	 Catch:{ all -> 0x012d }
        r1.add(r9);	 Catch:{ all -> 0x012d }
        r9 = r0.c;	 Catch:{ all -> 0x012d }
        r2 = r9.keySet();	 Catch:{ all -> 0x012d }
        r2 = r2.iterator();	 Catch:{ all -> 0x012d }
    L_0x00a8:
        r3 = r2.hasNext();	 Catch:{ all -> 0x012d }
        if (r3 == 0) goto L_0x00ef;
    L_0x00ae:
        r3 = r2.next();	 Catch:{ all -> 0x012d }
        r3 = (java.lang.String) r3;	 Catch:{ all -> 0x012d }
        r4 = r9.get(r3);	 Catch:{ all -> 0x012d }
        r4 = (java.lang.String) r4;	 Catch:{ all -> 0x012d }
        r5 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x012d }
        r5 = r5.length();	 Catch:{ all -> 0x012d }
        r6 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x012d }
        r6 = r6.length();	 Catch:{ all -> 0x012d }
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x012d }
        r5 = r5 + 13;
        r5 = r5 + r6;
        r7.<init>(r5);	 Catch:{ all -> 0x012d }
        r5 = "GLS Header:";
        r7.append(r5);	 Catch:{ all -> 0x012d }
        r7.append(r3);	 Catch:{ all -> 0x012d }
        r3 = ":";
        r7.append(r3);	 Catch:{ all -> 0x012d }
        r7.append(r4);	 Catch:{ all -> 0x012d }
        r3 = "\n";
        r7.append(r3);	 Catch:{ all -> 0x012d }
        r3 = r7.toString();	 Catch:{ all -> 0x012d }
        r1.add(r3);	 Catch:{ all -> 0x012d }
        goto L_0x00a8;
    L_0x00ef:
        r9 = r0.b;	 Catch:{ all -> 0x012d }
        if (r9 == 0) goto L_0x0126;
    L_0x00f3:
        r0 = 2;
        r9 = android.util.Base64.encodeToString(r9, r0);	 Catch:{ all -> 0x012d }
        r9 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x012d }
        r0 = "GLS response in base64: ";
        r2 = r9.length();	 Catch:{ all -> 0x012d }
        if (r2 != 0) goto L_0x010a;
    L_0x0104:
        r9 = new java.lang.String;	 Catch:{ all -> 0x012d }
        r9.<init>(r0);	 Catch:{ all -> 0x012d }
        goto L_0x010e;
    L_0x010a:
        r9 = r0.concat(r9);	 Catch:{ all -> 0x012d }
    L_0x010e:
        r9 = defpackage.xvd.b(r9);	 Catch:{ all -> 0x012d }
        r9 = r9.iterator();	 Catch:{ all -> 0x012d }
    L_0x0116:
        r0 = r9.hasNext();	 Catch:{ all -> 0x012d }
        if (r0 == 0) goto L_0x012b;
    L_0x011c:
        r0 = r9.next();	 Catch:{ all -> 0x012d }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x012d }
        r1.add(r0);	 Catch:{ all -> 0x012d }
        goto L_0x0116;
    L_0x0126:
        r9 = "GLS Response had no data.";
        r1.add(r9);	 Catch:{ all -> 0x012d }
    L_0x012b:
        monitor-exit(r8);
        return r1;
    L_0x012d:
        r9 = move-exception;
        goto L_0x0135;
    L_0x012f:
        r9 = super.b(r9);	 Catch:{ all -> 0x012d }
        monitor-exit(r8);
        return r9;
    L_0x0135:
        monitor-exit(r8);
        goto L_0x0138;
    L_0x0137:
        throw r9;
    L_0x0138:
        goto L_0x0137;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeth.b(bqd):java.util.List");
    }
}
