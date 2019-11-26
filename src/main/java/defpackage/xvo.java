package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: xvo */
public final class xvo {
    public String a;
    private final Uri b;
    private final HashMap c;
    private final List d;
    private int e;

    private xvo(xvo xvo) {
        this.b = xvo.b;
        this.a = xvo.a;
        this.e = xvo.e;
        this.c = new HashMap(xvo.c);
        this.d = new ArrayList(xvo.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    private xvo(android.net.Uri r13) {
        /*
        r12 = this;
        r12.<init>();
        r0 = defpackage.amqw.a(r13);
        r0 = (android.net.Uri) r0;
        r12.b = r0;
        r0 = new java.util.HashMap;
        r0.<init>();
        r12.c = r0;
        r0 = new java.util.ArrayList;
        r0.<init>();
        r12.d = r0;
        r13 = r13.getEncodedQuery();
        if (r13 == 0) goto L_0x0064;
    L_0x001f:
        r0 = r13.length();
        r1 = 0;
    L_0x0024:
        if (r1 >= r0) goto L_0x0064;
    L_0x0026:
        r2 = 61;
        r2 = r13.indexOf(r2, r1);
        r3 = 38;
        r3 = r13.indexOf(r3, r1);
        if (r3 >= 0) goto L_0x0035;
    L_0x0034:
        goto L_0x0038;
    L_0x0035:
        if (r3 >= r2) goto L_0x0038;
    L_0x0037:
        r2 = -1;
    L_0x0038:
        if (r2 <= 0) goto L_0x0040;
    L_0x003a:
        if (r3 <= 0) goto L_0x0040;
    L_0x003c:
        r4 = r2 + 1;
        r5 = r3;
        goto L_0x0045;
    L_0x0040:
        if (r2 < 0) goto L_0x0047;
    L_0x0042:
        r4 = r2 + 1;
        r5 = r0;
    L_0x0045:
        r3 = r2;
        goto L_0x004d;
    L_0x0047:
        if (r3 < 0) goto L_0x004a;
    L_0x0049:
        goto L_0x004b;
    L_0x004a:
        r3 = r0;
    L_0x004b:
        r4 = r3;
        r5 = r4;
    L_0x004d:
        r7 = r13.substring(r1, r3);
        if (r2 <= 0) goto L_0x0058;
    L_0x0053:
        r1 = r13.substring(r4, r5);
        goto L_0x0059;
    L_0x0058:
        r1 = 0;
    L_0x0059:
        r8 = r1;
        r9 = 0;
        r10 = 1;
        r11 = 0;
        r6 = r12;
        r6.a(r7, r8, r9, r10, r11);
        r1 = r5 + 1;
        goto L_0x0024;
    L_0x0064:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xvo.<init>(android.net.Uri):void");
    }

    public final xvn a(String str, String str2, String str3, boolean z, boolean z2) {
        int i = this.e;
        this.e = i + 1;
        xvn xvn = new xvn(str, str2, str3, z, z2, i);
        xvn xvn2 = (xvn) this.c.put(xvn.c, xvn);
        this.d.add(xvn);
        return xvn2;
    }

    public static xvo a(xvo xvo) {
        return new xvo(xvo);
    }

    public static xvo a(Uri uri) {
        return new xvo(uri);
    }

    public final xvo a(String str, String str2) {
        xvn a = a(str, str2, null, false, true);
        if (a != null) {
            this.d.set(a.f, null);
        }
        return this;
    }

    public final xvo a(String str) {
        xvn xvn = (xvn) this.c.remove(str);
        if (xvn != null) {
            this.d.set(xvn.f, null);
        }
        return this;
    }

    public final String b(String str) {
        xvn xvn = (xvn) this.c.get(str);
        return xvn != null ? xvn.e : null;
    }

    public final xvo b(String str, String str2) {
        if (!this.c.containsKey(str)) {
            a(str, str2, null, false, true);
        }
        return this;
    }

    public final xvo a(String str, int i) {
        b(str, String.valueOf(i));
        return this;
    }

    public final xvo a(String str, String str2, String str3) {
        if (!this.c.containsKey(str)) {
            a(str, str2, str3, false, true);
        }
        return this;
    }

    public final Uri a() {
        Builder buildUpon = ((Uri) amqw.a(this.b)).buildUpon();
        StringBuilder stringBuilder = new StringBuilder(4096);
        String str = "";
        for (xvn xvn : this.d) {
            if (xvn != null) {
                stringBuilder.append(str);
                if (xvn.a) {
                    str = xvn.c;
                } else {
                    str = Uri.encode(xvn.c);
                }
                stringBuilder.append(str);
                if (xvn.b || xvn.e != null) {
                    stringBuilder.append('=');
                    if (xvn.a) {
                        str = xvn.e;
                    } else {
                        str = Uri.encode(xvn.e, xvn.d);
                    }
                    stringBuilder.append(str);
                }
                str = "&";
            }
        }
        buildUpon.encodedQuery(stringBuilder.toString());
        String str2 = this.a;
        if (str2 != null) {
            buildUpon.authority(str2);
        }
        return buildUpon.build();
    }

    public final String toString() {
        return a().toString();
    }
}
