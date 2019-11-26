package defpackage;

import android.content.Context;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: amgb */
public final class amgb extends amgh {
    public final amab a;
    private final Context c;
    private final atlx d;
    private final afpu e;
    private final utc f;
    private final azzn h;
    private final alys i;
    private final amjf j;
    private final amjm k;
    private final amac l;
    private final amch m;

    public amgb(Context context, atlx atlx, afpu afpu, utc utc, amab amab, amch amch, alys alys, amjf amjf, amjm amjm, amac amac, ambw ambw) {
        super(34, ambw);
        this.c = context;
        this.d = atlx;
        this.e = afpu;
        this.f = utc;
        this.a = amab;
        this.i = alys;
        this.j = amjf;
        this.k = amjm;
        this.l = amac;
        this.m = amch;
        azzm a = azzn.a();
        this.h = a.a();
    }

    public final String a() {
        return "CreateScottyIdTask";
    }

    public final boolean d() {
        return true;
    }

    public final amec a(amea amea) {
        amec amec = amea.t;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amge.a;
    }

    public final amcj b() {
        return this.m;
    }

    /* JADX WARNING: Missing block: B:6:0x001d, code skipped:
            if (r5 != 0) goto L_0x0021;
     */
    public final defpackage.anjv a(java.lang.String r20, defpackage.amea r21) {
        /*
        r19 = this;
        r1 = r19;
        r0 = r21;
        r2 = r0.c;
        r3 = r0.d;
        r4 = r0.g;
        r5 = r0.a;
        r5 = r5 & 8192;
        r6 = 1;
        if (r5 == 0) goto L_0x0020;
    L_0x0011:
        r5 = r0.n;
        if (r5 != 0) goto L_0x0017;
    L_0x0015:
        r5 = defpackage.amdl.h;
    L_0x0017:
        r5 = r5.b;
        r5 = defpackage.amdo.a(r5);
        if (r5 == 0) goto L_0x0020;
    L_0x001f:
        goto L_0x0021;
    L_0x0020:
        r5 = 1;
    L_0x0021:
        r7 = r5 + -1;
        r8 = 0;
        if (r5 == 0) goto L_0x0286;
    L_0x0026:
        r5 = 4;
        r9 = 3;
        r10 = 2;
        if (r7 == 0) goto L_0x004d;
    L_0x002b:
        if (r7 == r6) goto L_0x004a;
    L_0x002d:
        if (r7 == r10) goto L_0x0047;
    L_0x002f:
        if (r7 == r9) goto L_0x0044;
    L_0x0031:
        if (r7 == r5) goto L_0x0041;
    L_0x0033:
        r11 = 5;
        if (r7 != r11) goto L_0x0039;
    L_0x0036:
        r7 = "SAFE_APPLIED";
        goto L_0x004f;
    L_0x0039:
        r0 = new java.lang.AssertionError;
        r2 = "Invalid enum";
        r0.<init>(r2);
        throw r0;
    L_0x0041:
        r7 = "DANGEROUS";
        goto L_0x004f;
    L_0x0044:
        r7 = "UNSUPPORTED";
        goto L_0x004f;
    L_0x0047:
        r7 = "UNNECESSARY";
        goto L_0x004f;
    L_0x004a:
        r7 = "NOT_APPLICABLE";
        goto L_0x004f;
    L_0x004d:
        r7 = "NOT_ATTEMPTED";
    L_0x004f:
        r11 = r0.m;
        if (r11 != 0) goto L_0x0055;
    L_0x0053:
        r11 = defpackage.amec.g;
    L_0x0055:
        r12 = r0.k;
        r12 = defpackage.ameg.a(r12);
        if (r12 == 0) goto L_0x005e;
    L_0x005d:
        goto L_0x005f;
    L_0x005e:
        r12 = 1;
    L_0x005f:
        r13 = r11.b;
        r13 = defpackage.amee.a(r13);
        if (r13 == 0) goto L_0x006e;
    L_0x0067:
        if (r13 == r10) goto L_0x006a;
    L_0x0069:
        goto L_0x006e;
    L_0x006a:
        r9 = "SUCCEEDED";
        goto L_0x00dd;
    L_0x006e:
        r13 = 10;
        r13 = defpackage.amjq.a(r11, r13);
        if (r13 == 0) goto L_0x007a;
    L_0x0076:
        r9 = "DISABLED";
        goto L_0x00dd;
    L_0x007a:
        r13 = 11;
        r13 = defpackage.amjq.a(r11, r13);
        if (r13 == 0) goto L_0x0085;
    L_0x0082:
        r9 = "DISABLED_BY_USER";
        goto L_0x00dd;
    L_0x0085:
        r13 = 12;
        r13 = defpackage.amjq.a(r11, r13);
        if (r13 == 0) goto L_0x0090;
    L_0x008d:
        r9 = "NOT_POSSIBLE";
        goto L_0x00dd;
    L_0x0090:
        r13 = 14;
        r13 = defpackage.amjq.a(r11, r13);
        if (r13 == 0) goto L_0x009b;
    L_0x0098:
        r9 = "INTERRUPTED";
        goto L_0x00dd;
    L_0x009b:
        r13 = 15;
        r13 = defpackage.amjq.a(r11, r13);
        if (r13 == 0) goto L_0x00a6;
    L_0x00a3:
        r9 = "THREAD_INTERRUPTED";
        goto L_0x00dd;
    L_0x00a6:
        r13 = 16;
        r13 = defpackage.amjq.a(r11, r13);
        if (r13 == 0) goto L_0x00b1;
    L_0x00ae:
        r9 = "FAILED";
        goto L_0x00dd;
    L_0x00b1:
        r13 = 13;
        r13 = defpackage.amjq.a(r11, r13);
        if (r13 == 0) goto L_0x00d2;
    L_0x00b9:
        r12 = r12 + -1;
        if (r12 == r6) goto L_0x00cf;
    L_0x00bd:
        if (r12 == r10) goto L_0x00cc;
    L_0x00bf:
        if (r12 == r9) goto L_0x00c9;
    L_0x00c1:
        if (r12 == r5) goto L_0x00c6;
    L_0x00c3:
        r9 = "REJECTED_UNKNOWN_REASON";
        goto L_0x00dd;
    L_0x00c6:
        r9 = "REJECTED_INSUFFICIENT_SPACE";
        goto L_0x00dd;
    L_0x00c9:
        r9 = "REJECTED_ALREADY_LOW_BITRATE";
        goto L_0x00dd;
    L_0x00cc:
        r9 = "REJECTED_UNSUPPORTED_ASPECT_RATIO";
        goto L_0x00dd;
    L_0x00cf:
        r9 = "REJECTED_UNSUPPORTED_TRACK_STRUCTURE";
        goto L_0x00dd;
    L_0x00d2:
        r9 = defpackage.amjq.a(r11, r9);
        if (r9 != 0) goto L_0x00db;
    L_0x00d8:
        r9 = "UNKNOWN";
        goto L_0x00dd;
    L_0x00db:
        r9 = "SOURCE_FAILED";
    L_0x00dd:
        r10 = r1.j;
        r11 = new amgd;
        r11.<init>(r1, r2, r4);
        r16 = r10.a(r0, r11);
        r15 = new azyn;
        r15.<init>();
        r10 = r16.a();
        r12 = -1;
        r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r0 == 0) goto L_0x0100;
    L_0x00f7:
        r0 = java.lang.Long.toString(r10);
        r10 = "X-Goog-Upload-Header-Content-Length";
        r15.a(r10, r0);
    L_0x0100:
        r0 = r1.e;
        r0 = r0.a(r2);
        if (r0 == 0) goto L_0x027e;
    L_0x0108:
        r2 = r0 instanceof defpackage.ust;
        if (r2 == 0) goto L_0x0276;
    L_0x010c:
        r2 = r1.f;
        r0 = (defpackage.ust) r0;
        r0 = r2.a(r0);
        r2 = r0.a();
        if (r2 == 0) goto L_0x026e;
    L_0x011a:
        r0 = r0.d();
        r2 = r0.first;
        r2 = (java.lang.String) r2;
        r0 = r0.second;
        r0 = (java.lang.String) r0;
        r15.a(r2, r0);
        r0 = new org.json.JSONObject;
        r0.<init>();
        r2 = "frontendUploadId";
        r0.put(r2, r4);	 Catch:{ JSONException -> 0x0267 }
        r2 = "deviceDisplayName";
        r4 = android.os.Build.MANUFACTURER;	 Catch:{ JSONException -> 0x0267 }
        r10 = java.util.Locale.getDefault();	 Catch:{ JSONException -> 0x0267 }
        r4 = r4.toUpperCase(r10);	 Catch:{ JSONException -> 0x0267 }
        r10 = android.os.Build.MODEL;	 Catch:{ JSONException -> 0x0267 }
        r11 = java.lang.String.valueOf(r4);	 Catch:{ JSONException -> 0x0267 }
        r11 = r11.length();	 Catch:{ JSONException -> 0x0267 }
        r11 = r11 + r6;
        r12 = java.lang.String.valueOf(r10);	 Catch:{ JSONException -> 0x0267 }
        r12 = r12.length();	 Catch:{ JSONException -> 0x0267 }
        r11 = r11 + r12;
        r12 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0267 }
        r12.<init>(r11);	 Catch:{ JSONException -> 0x0267 }
        r12.append(r4);	 Catch:{ JSONException -> 0x0267 }
        r4 = " ";
        r12.append(r4);	 Catch:{ JSONException -> 0x0267 }
        r12.append(r10);	 Catch:{ JSONException -> 0x0267 }
        r4 = r12.toString();	 Catch:{ JSONException -> 0x0267 }
        r0.put(r2, r4);	 Catch:{ JSONException -> 0x0267 }
        r2 = "fileId";
        r0.put(r2, r3);	 Catch:{ JSONException -> 0x0267 }
        r2 = "mp4MoovAtomRelocationStatus";
        r0.put(r2, r7);	 Catch:{ JSONException -> 0x0267 }
        r2 = "transcodeResult";
        r0.put(r2, r9);	 Catch:{ JSONException -> 0x0267 }
        r2 = "connectionType";
        r4 = r1.c;	 Catch:{ JSONException -> 0x0267 }
        r7 = "connectivity";
        r4 = r4.getSystemService(r7);	 Catch:{ JSONException -> 0x0267 }
        r4 = (android.net.ConnectivityManager) r4;	 Catch:{ JSONException -> 0x0267 }
        r7 = 6;
        r9 = "UNKNOWN_CONNECTION";
        if (r4 != 0) goto L_0x018c;
    L_0x018a:
        goto L_0x01f2;
    L_0x018c:
        r4 = r4.getActiveNetworkInfo();	 Catch:{ JSONException -> 0x0267 }
        if (r4 == 0) goto L_0x01f2;
    L_0x0192:
        r10 = r4.isConnected();	 Catch:{ JSONException -> 0x0267 }
        if (r10 != 0) goto L_0x019a;
    L_0x0198:
        goto L_0x01f2;
    L_0x019a:
        r9 = r4.getType();	 Catch:{ JSONException -> 0x0267 }
        if (r9 == 0) goto L_0x01bc;
    L_0x01a0:
        if (r9 == r6) goto L_0x01b9;
    L_0x01a2:
        if (r9 == r5) goto L_0x01bc;
    L_0x01a4:
        r4 = 9;
        if (r9 == r4) goto L_0x01b6;
    L_0x01a8:
        if (r9 == r7) goto L_0x01b3;
    L_0x01aa:
        r4 = 7;
        if (r9 == r4) goto L_0x01b0;
    L_0x01ad:
        r9 = "OTHER";
        goto L_0x01f2;
    L_0x01b0:
        r9 = "ANDROID_BLUETOOTH";
        goto L_0x01f2;
    L_0x01b3:
        r9 = "ANDROID_WIMAX";
        goto L_0x01f2;
    L_0x01b6:
        r9 = "ANDROID_ETHERNET";
        goto L_0x01f2;
    L_0x01b9:
        r9 = "WIFI";
        goto L_0x01f2;
    L_0x01bc:
        r4 = r4.getSubtype();	 Catch:{ JSONException -> 0x0267 }
        switch(r4) {
            case 1: goto L_0x01f0;
            case 2: goto L_0x01ed;
            case 3: goto L_0x01ea;
            case 4: goto L_0x01e7;
            case 5: goto L_0x01e4;
            case 6: goto L_0x01e1;
            case 7: goto L_0x01de;
            case 8: goto L_0x01db;
            case 9: goto L_0x01d8;
            case 10: goto L_0x01d5;
            case 11: goto L_0x01d2;
            case 12: goto L_0x01cf;
            case 13: goto L_0x01cc;
            case 14: goto L_0x01c9;
            case 15: goto L_0x01c6;
            default: goto L_0x01c3;
        };	 Catch:{ JSONException -> 0x0267 }
    L_0x01c3:
        r9 = "ANDROID_CELLULAR_UNKNOWN";
        goto L_0x01f2;
    L_0x01c6:
        r9 = "ANDROID_CELLULAR_3G_HSPAP";
        goto L_0x01f2;
    L_0x01c9:
        r9 = "ANDROID_CELLULAR_3G_EHRPD";
        goto L_0x01f2;
    L_0x01cc:
        r9 = "ANDROID_CELLULAR_4G_LTE";
        goto L_0x01f2;
    L_0x01cf:
        r9 = "ANDROID_CELLULAR_3G_EVDO_B";
        goto L_0x01f2;
    L_0x01d2:
        r9 = "ANDROID_CELLULAR_3G_IDEN";
        goto L_0x01f2;
    L_0x01d5:
        r9 = "ANDROID_CELLULAR_3G_HSPA";
        goto L_0x01f2;
    L_0x01d8:
        r9 = "ANDROID_CELLULAR_3G_HSUPA";
        goto L_0x01f2;
    L_0x01db:
        r9 = "ANDROID_CELLULAR_3G_HSDPA";
        goto L_0x01f2;
    L_0x01de:
        r9 = "ANDROID_CELLULAR_3G_1XRTT";
        goto L_0x01f2;
    L_0x01e1:
        r9 = "ANDROID_CELLULAR_3G_EVDO_A";
        goto L_0x01f2;
    L_0x01e4:
        r9 = "ANDROID_CELLULAR_3G_EVDO_0";
        goto L_0x01f2;
    L_0x01e7:
        r9 = "ANDROID_CELLULAR_3G_CDMA";
        goto L_0x01f2;
    L_0x01ea:
        r9 = "ANDROID_CELLULAR_3G_UMTS";
        goto L_0x01f2;
    L_0x01ed:
        r9 = "ANDROID_CELLULAR_2G_EDGE";
        goto L_0x01f2;
    L_0x01f0:
        r9 = "ANDROID_CELLULAR_2G_GPRS";
    L_0x01f2:
        r0.put(r2, r9);	 Catch:{ JSONException -> 0x0267 }
        r2 = r1.k;
        r12 = r2.a();
        r2 = android.net.Uri.parse(r3);
        r2 = defpackage.amfg.a(r2);
        if (r2 != 0) goto L_0x020a;
    L_0x0205:
        r2 = r1.d;
        r2 = r2.d;
        goto L_0x0223;
    L_0x020a:
        r2 = r1.d;
        r2 = r2.d;
        r2 = android.net.Uri.parse(r2);
        r2 = defpackage.xvo.a(r2);
        r3 = "ephemeral";
        r2.b(r3, r8);
        r2 = r2.a();
        r2 = r2.toString();
    L_0x0223:
        r13 = r2;
        r17 = r0.toString();
        r0 = r1.h;
        r14 = "POST";
        r18 = r0;
        r0 = r12.a(r13, r14, r15, r16, r17, r18);
        r2 = r1.l;
        r2.m();
        r2 = r0.h();
        if (r2 != 0) goto L_0x0257;
    L_0x023d:
        r0 = r1.i;
        r2 = "CreateScottyIdTask";
        r3 = " Transfer does not support startSend";
        r2 = r2.concat(r3);
        r0.a(r2);
        r0 = defpackage.amjq.a(r7);
        r0 = r1.a(r0, r6);
        r0 = defpackage.anjf.a(r0);
        return r0;
    L_0x0257:
        r2 = r0.i();
        r3 = new amgg;
        r3.<init>(r1, r0);
        r0 = defpackage.aniv.a;
        r0 = defpackage.anic.a(r2, r3, r0);
        return r0;
    L_0x0267:
        r0 = move-exception;
        r2 = new java.lang.RuntimeException;
        r2.<init>(r0);
        throw r2;
    L_0x026e:
        r0 = new bpx;
        r2 = "Could not fetch auth token";
        r0.<init>(r2);
        throw r0;
    L_0x0276:
        r0 = new bpx;
        r2 = "Sign in with AccountIdentity required";
        r0.<init>(r2);
        throw r0;
    L_0x027e:
        r0 = new bpx;
        r2 = "Identity not found";
        r0.<init>(r2);
        throw r0;
    L_0x0286:
        throw r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amgb.a(java.lang.String, amea):anjv");
    }

    /* Access modifiers changed, original: final */
    public final alzf a(Throwable th, amea amea, boolean z) {
        int i = 1;
        String str = "CreateScottyIdTask";
        alys alys;
        int a;
        if (th instanceof SecurityException) {
            alys = this.i;
            str = str.concat(" File Permission");
            a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(24), z);
        } else if (th instanceof FileNotFoundException) {
            alys = this.i;
            str = str.concat(" File Not Found");
            a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(23), z);
        } else if ((th instanceof IOException) || (th instanceof IndexOutOfBoundsException)) {
            alys = this.i;
            str = str.concat(" Source Failed");
            a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(3), z);
        } else if (th instanceof bpx) {
            alys = this.i;
            str = str.concat(" Auth Failed");
            a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(4), z);
        } else if (th instanceof bql) {
            alys = this.i;
            str = str.concat(" Transfer Failed");
            a = amek.a(amea.h);
            if (a == 0) {
                a = 1;
            }
            alys.a(str, th, a);
            return a(amjq.a(6), z);
        } else if (th instanceof bqe) {
            Object obj = amea.t;
            if (obj == null) {
                obj = amec.g;
            }
            return a(amjq.a(6, (amec) amqw.a(obj), this.d.e, this.i), z);
        } else {
            alys = this.i;
            str = str.concat(" Throwable");
            int a2 = amek.a(amea.h);
            if (a2 != 0) {
                i = a2;
            }
            alys.a(str, th, i);
            return super.a(th, amea, z);
        }
    }

    /* Access modifiers changed, original: final */
    public final boolean b(amea amea) {
        int i = amea.a;
        return ((i & 1) == 0 || (i & 2) == 0 || (i & 16) == 0) ? false : true;
    }

    public static bqd a(int i, azyn azyn, byte[] bArr) {
        HashMap hashMap = new HashMap();
        for (String str : azyn.a()) {
            hashMap.put(str, azyn.b(str));
        }
        return new bqd(i, bArr, hashMap);
    }
}
