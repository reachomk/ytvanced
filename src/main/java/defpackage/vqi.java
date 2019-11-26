package defpackage;

/* renamed from: vqi */
public final class vqi {
    public static final vqi a = new vqi(vql.NONE);
    public final vql b;
    public final String c;

    private vqi(vql vql) {
        this(vql, "");
    }

    public vqi(vql vql, String str) {
        this.b = (vql) amqw.a((Object) vql);
        this.c = afht.a(amqw.a((Object) str));
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String str = this.c;
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 23) + String.valueOf(str).length());
        stringBuilder.append("AdError: type=");
        stringBuilder.append(valueOf);
        stringBuilder.append(" message=");
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    public static defpackage.vqi a(defpackage.afif r8) {
        /*
        r0 = new vqi;
        r1 = r8.a();
        r2 = r1.hashCode();
        r3 = 5;
        r4 = 4;
        r5 = 3;
        r6 = 2;
        r7 = 1;
        switch(r2) {
            case -1190444323: goto L_0x0045;
            case -429516272: goto L_0x003b;
            case 107525503: goto L_0x0031;
            case 1835746713: goto L_0x0027;
            case 1841299800: goto L_0x001d;
            case 2112079600: goto L_0x0013;
            default: goto L_0x0012;
        };
    L_0x0012:
        goto L_0x004f;
    L_0x0013:
        r2 = "fmt.noneavailable";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x004f;
    L_0x001b:
        r1 = 5;
        goto L_0x0050;
    L_0x001d:
        r2 = "net.dns";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x004f;
    L_0x0025:
        r1 = 0;
        goto L_0x0050;
    L_0x0027:
        r2 = "net.connect";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x004f;
    L_0x002f:
        r1 = 1;
        goto L_0x0050;
    L_0x0031:
        r2 = "net.unavailable";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x004f;
    L_0x0039:
        r1 = 4;
        goto L_0x0050;
    L_0x003b:
        r2 = "net.timeout";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x004f;
    L_0x0043:
        r1 = 2;
        goto L_0x0050;
    L_0x0045:
        r2 = "net.closed";
        r1 = r1.equals(r2);
        if (r1 == 0) goto L_0x004f;
    L_0x004d:
        r1 = 3;
        goto L_0x0050;
    L_0x004f:
        r1 = -1;
    L_0x0050:
        if (r1 == 0) goto L_0x006e;
    L_0x0052:
        if (r1 == r7) goto L_0x006b;
    L_0x0054:
        if (r1 == r6) goto L_0x0068;
    L_0x0056:
        if (r1 == r5) goto L_0x0065;
    L_0x0058:
        if (r1 == r4) goto L_0x0062;
    L_0x005a:
        if (r1 == r3) goto L_0x005f;
    L_0x005c:
        r1 = defpackage.vql.VIDEO_PLAYBACK_UNKNOWN_ERROR;
        goto L_0x0070;
    L_0x005f:
        r1 = defpackage.vql.UNSUPPORTED_VIDEO_FORMAT;
        goto L_0x0070;
    L_0x0062:
        r1 = defpackage.vql.VIDEO_PLAYBACK_ERROR_NO_NETWORK;
        goto L_0x0070;
    L_0x0065:
        r1 = defpackage.vql.VIDEO_PLAYBACK_ERROR_TIMEOUT;
        goto L_0x0070;
    L_0x0068:
        r1 = defpackage.vql.VIDEO_PLAYBACK_ERROR_TIMEOUT;
        goto L_0x0070;
    L_0x006b:
        r1 = defpackage.vql.VIDEO_PLAYBACK_ERROR_CANNOT_CONNECT;
        goto L_0x0070;
    L_0x006e:
        r1 = defpackage.vql.VIDEO_PLAYBACK_ERROR_UNKNOWN_HOST;
    L_0x0070:
        r8 = r8.c;
        r8 = defpackage.afht.a(r8);
        r0.<init>(r1, r8);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vqi.a(afif):vqi");
    }
}
