package defpackage;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.Header;

/* renamed from: aivh */
public final class aivh {
    private static final Pattern d = Pattern.compile("bytes=(\\d*)-(\\d*)");
    public final long a;
    public final long b;
    public final long c;
    private final boolean e;

    private aivh(long j, long j2, long j3, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.e = z;
    }

    /* JADX WARNING: Missing block: B:3:0x000e, code skipped:
            if (r8.a >= 0) goto L_0x0022;
     */
    /* JADX WARNING: Missing block: B:9:0x001f, code skipped:
            if (r4 <= r2) goto L_0x0022;
     */
    public final boolean a(org.apache.http.HttpResponse r9) {
        /*
        r8 = this;
        r0 = r8.c;
        r2 = 0;
        r4 = -1;
        r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x0011;
    L_0x000a:
        r0 = r8.a;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 < 0) goto L_0x0061;
    L_0x0010:
        goto L_0x0022;
    L_0x0011:
        r4 = r8.a;
        r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r6 < 0) goto L_0x0061;
    L_0x0017:
        r2 = r8.b;
        r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r6 >= 0) goto L_0x0061;
    L_0x001d:
        r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0022;
    L_0x0021:
        goto L_0x0061;
    L_0x0022:
        r0 = r8.e;
        if (r0 == 0) goto L_0x005a;
    L_0x0026:
        r0 = 206; // 0xce float:2.89E-43 double:1.02E-321;
        r9.setStatusCode(r0);
        r0 = r8.a;
        r2 = r8.b;
        r4 = r8.c;
        r6 = new java.lang.StringBuilder;
        r7 = 68;
        r6.<init>(r7);
        r7 = "bytes ";
        r6.append(r7);
        r6.append(r0);
        r0 = "-";
        r6.append(r0);
        r6.append(r2);
        r0 = "/";
        r6.append(r0);
        r6.append(r4);
        r0 = r6.toString();
        r1 = "Content-Range";
        r9.setHeader(r1, r0);
        goto L_0x005f;
    L_0x005a:
        r0 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        r9.setStatusCode(r0);
    L_0x005f:
        r9 = 1;
        return r9;
    L_0x0061:
        r0 = 416; // 0x1a0 float:5.83E-43 double:2.055E-321;
        r9.setStatusCode(r0);
        r9 = 0;
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aivh.a(org.apache.http.HttpResponse):boolean");
    }

    public static aivh a(Header header, long j) {
        long j2 = j - 1;
        if (header == null) {
            return new aivh(0, j2, j, false);
        }
        Matcher matcher = d.matcher(header.getValue());
        if (!matcher.matches()) {
            return new aivh(0, j2, j, false);
        }
        String group = matcher.group(1);
        long parseLong = !TextUtils.isEmpty(group) ? Long.parseLong(group) : 0;
        String group2 = matcher.group(2);
        if (!TextUtils.isEmpty(group2)) {
            j2 = Long.parseLong(group2);
        }
        return new aivh(parseLong, j2, j, true);
    }
}
