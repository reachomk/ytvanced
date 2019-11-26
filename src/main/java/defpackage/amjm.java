package defpackage;

import android.content.Context;

/* renamed from: amjm */
public final class amjm {
    public final Context a;
    private final atlx b;
    private azzp c;

    public amjm(Context context, atlx atlx) {
        this.a = context;
        this.b = atlx;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0148  */
    public final defpackage.azzp a() {
        /*
        r8 = this;
        r0 = r8.c;
        if (r0 != 0) goto L_0x018f;
    L_0x0004:
        r0 = r8.b;
        r0 = r0.h;
        r1 = new java.lang.StringBuilder;
        r2 = 21;
        r1.<init>(r2);
        r2 = "Cronet enabled: ";
        r1.append(r2);
        r1.append(r0);
        r0 = r1.toString();
        defpackage.xtl.e(r0);
        r0 = r8.b;
        r0 = r0.h;
        r1 = 0;
        if (r0 == 0) goto L_0x017e;
    L_0x0025:
        r0 = new bcjk;
        r2 = r8.a;
        r0.<init>(r2);
        r2 = new amjl;
        r2.<init>(r8);
        r0.a(r2);
        r2 = r8.b;
        r3 = r2.k;
        r4 = 1;
        r5 = 0;
        if (r3 == 0) goto L_0x00dd;
    L_0x003c:
        r2 = r2.m;
        r2 = r2.size();
        if (r2 == 0) goto L_0x00de;
    L_0x0044:
        r2 = r8.a;
        r3 = "connectivity";
        r2 = r2.getSystemService(r3);
        r2 = (android.net.ConnectivityManager) r2;
        if (r2 != 0) goto L_0x0054;
    L_0x0050:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_UNKNOWN;
        goto L_0x00bf;
    L_0x0054:
        r2 = r2.getActiveNetworkInfo();
        if (r2 == 0) goto L_0x00bd;
    L_0x005a:
        r3 = r2.isConnected();
        if (r3 != 0) goto L_0x0062;
    L_0x0060:
        goto L_0x00bd;
    L_0x0062:
        r3 = r2.getType();
        if (r3 == 0) goto L_0x0086;
    L_0x0068:
        if (r3 == r4) goto L_0x0083;
    L_0x006a:
        r6 = 4;
        if (r3 == r6) goto L_0x0086;
    L_0x006d:
        r2 = 9;
        if (r3 == r2) goto L_0x0080;
    L_0x0071:
        r2 = 6;
        if (r3 == r2) goto L_0x007d;
    L_0x0074:
        r2 = 7;
        if (r3 == r2) goto L_0x007a;
    L_0x0077:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_UNKNOWN;
        goto L_0x00bf;
    L_0x007a:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_BLUETOOTH;
        goto L_0x00bf;
    L_0x007d:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_WIMAX;
        goto L_0x00bf;
    L_0x0080:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_ETHERNET;
        goto L_0x00bf;
    L_0x0083:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_WIFI;
        goto L_0x00bf;
    L_0x0086:
        r2 = r2.getSubtype();
        switch(r2) {
            case 1: goto L_0x00ba;
            case 2: goto L_0x00b7;
            case 3: goto L_0x00b4;
            case 4: goto L_0x00b1;
            case 5: goto L_0x00ae;
            case 6: goto L_0x00ab;
            case 7: goto L_0x00a8;
            case 8: goto L_0x00a5;
            case 9: goto L_0x00a2;
            case 10: goto L_0x009f;
            case 11: goto L_0x009c;
            case 12: goto L_0x0099;
            case 13: goto L_0x0096;
            case 14: goto L_0x0093;
            case 15: goto L_0x0090;
            default: goto L_0x008d;
        };
    L_0x008d:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_UNKNOWN;
        goto L_0x00bf;
    L_0x0090:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_HSPAP;
        goto L_0x00bf;
    L_0x0093:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_EHRPD;
        goto L_0x00bf;
    L_0x0096:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_LTE;
        goto L_0x00bf;
    L_0x0099:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_EVDO_B;
        goto L_0x00bf;
    L_0x009c:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_IDEN;
        goto L_0x00bf;
    L_0x009f:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_HSPA;
        goto L_0x00bf;
    L_0x00a2:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_HSUPA;
        goto L_0x00bf;
    L_0x00a5:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_HSDPA;
        goto L_0x00bf;
    L_0x00a8:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_1XRTT;
        goto L_0x00bf;
    L_0x00ab:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_EVDO_A;
        goto L_0x00bf;
    L_0x00ae:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_EVDO_0;
        goto L_0x00bf;
    L_0x00b1:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_CDMA;
        goto L_0x00bf;
    L_0x00b4:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_UMTS;
        goto L_0x00bf;
    L_0x00b7:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_EDGE;
        goto L_0x00bf;
    L_0x00ba:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_CELLULAR_GPRS;
        goto L_0x00bf;
    L_0x00bd:
        r2 = defpackage.atmc.UPLOAD_CONNECTION_TYPE_UNKNOWN;
    L_0x00bf:
        r3 = r8.b;
        r6 = new anyc;
        r3 = r3.m;
        r7 = defpackage.atlx.n;
        r6.<init>(r3, r7);
        r3 = r6.iterator();
    L_0x00ce:
        r6 = r3.hasNext();
        if (r6 == 0) goto L_0x00dd;
    L_0x00d4:
        r6 = r3.next();
        r6 = (defpackage.atmc) r6;
        if (r2 != r6) goto L_0x00ce;
    L_0x00dc:
        goto L_0x00de;
    L_0x00dd:
        r4 = 0;
    L_0x00de:
        r2 = new java.lang.StringBuilder;
        r3 = 26;
        r2.<init>(r3);
        r3 = "Cronet QUIC enabled: ";
        r2.append(r3);
        r2.append(r4);
        r2 = r2.toString();
        defpackage.xtl.e(r2);
        r0.a(r4);
        r2 = r8.b;
        r2 = r2.l;
        r3 = new java.lang.StringBuilder;
        r4 = 27;
        r3.<init>(r4);
        r4 = "Cronet HTTP2 enabled: ";
        r3.append(r4);
        r3.append(r2);
        r2 = r3.toString();
        defpackage.xtl.e(r2);
        r2 = r8.b;
        r2 = r2.l;
        r0.b(r2);
        r2 = new java.net.URL;
        r3 = r8.b;
        r3 = r3.d;
        r2.<init>(r3);
        r3 = r2.getDefaultPort();
        r4 = -1;
        if (r3 == r4) goto L_0x0137;
    L_0x0128:
        r3 = r2.getHost();
        r4 = r2.getDefaultPort();
        r2 = r2.getDefaultPort();
        r0.a(r3, r4, r2);
    L_0x0137:
        r2 = r8.b;
        r2 = r2.i;
        r0.a(r2);
        r0 = r0.a();	 Catch:{ all -> 0x0145 }
        r0 = (defpackage.bcjh) r0;	 Catch:{ all -> 0x0145 }
        goto L_0x0146;
    L_0x0145:
        r0 = r1;
    L_0x0146:
        if (r0 != 0) goto L_0x014e;
    L_0x0148:
        r0 = "CronetEngine is null";
        defpackage.xtl.e(r0);
        goto L_0x017e;
    L_0x014e:
        r1 = r8.b;
        r1 = r1.j;
        r2 = new java.lang.StringBuilder;
        r3 = 37;
        r2.<init>(r3);
        r3 = "Cronet Async interface enabled: ";
        r2.append(r3);
        r2.append(r1);
        r1 = r2.toString();
        defpackage.xtl.e(r1);
        r1 = r8.b;
        r1 = r1.j;
        if (r1 != 0) goto L_0x0179;
    L_0x016e:
        r1 = new azyo;
        r2 = new amjo;
        r2.<init>(r0);
        r1.<init>(r2, r5);
        goto L_0x017e;
    L_0x0179:
        r1 = new azzt;
        r1.<init>(r0);
    L_0x017e:
        if (r1 != 0) goto L_0x0185;
    L_0x0180:
        r1 = new azyo;
        r1.<init>();
    L_0x0185:
        r0 = defpackage.azzo.a(r1);
        r0 = r0.a();
        r8.c = r0;
    L_0x018f:
        r0 = r8.c;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amjm.a():azzp");
    }
}
