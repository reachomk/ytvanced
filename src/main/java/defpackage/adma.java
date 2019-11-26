package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: adma */
final class adma implements aebm {
    public Map a = Collections.emptyMap();
    private final String b;

    adma(String str) {
        this.b = str;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x006a */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|59) */
    /* JADX WARNING: Missing block: B:22:?, code skipped:
            r5 = defpackage.adly.a;
            r6 = new java.lang.StringBuilder(32);
            r6.append("Error parsing screen ");
            r6.append(r3);
            defpackage.xtl.b(r5, r6.toString());
     */
    public final void a(defpackage.xho r9) {
        /*
        r8 = this;
        r0 = "loungeToken";
        r1 = "screenId";
        r2 = "screens";
        r3 = r9.e();
        r9 = r9.b();
        r4 = "Error posting to ";
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r9 != r5) goto L_0x00d6;
    L_0x0014:
        if (r3 == 0) goto L_0x00b8;
    L_0x0016:
        r9 = new adlx;	 Catch:{ IOException -> 0x009b }
        r3 = r3.f();	 Catch:{ IOException -> 0x009b }
        r9.<init>(r3);	 Catch:{ IOException -> 0x009b }
        r3 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x008c }
        r9 = r9.a;	 Catch:{ JSONException -> 0x008c }
        r3.<init>(r9);	 Catch:{ JSONException -> 0x008c }
        r9 = r3.has(r2);	 Catch:{ JSONException -> 0x008c }
        if (r9 == 0) goto L_0x0087;
    L_0x002c:
        r9 = r3.getJSONArray(r2);	 Catch:{ JSONException -> 0x008c }
        if (r9 != 0) goto L_0x0037;
    L_0x0032:
        r9 = java.util.Collections.emptyMap();	 Catch:{ JSONException -> 0x008c }
        goto L_0x0098;
    L_0x0037:
        r2 = new java.util.HashMap;	 Catch:{ JSONException -> 0x008c }
        r2.<init>();	 Catch:{ JSONException -> 0x008c }
        r3 = 0;
    L_0x003d:
        r5 = r9.length();	 Catch:{ JSONException -> 0x008c }
        if (r3 >= r5) goto L_0x0085;
    L_0x0043:
        r5 = r9.getJSONObject(r3);	 Catch:{ JSONException -> 0x006a }
        r6 = r5.has(r1);	 Catch:{ JSONException -> 0x006a }
        if (r6 != 0) goto L_0x004e;
    L_0x004d:
        goto L_0x0082;
    L_0x004e:
        r6 = r5.has(r0);	 Catch:{ JSONException -> 0x006a }
        if (r6 == 0) goto L_0x0082;
    L_0x0054:
        r6 = new adjb;	 Catch:{ JSONException -> 0x006a }
        r7 = r5.getString(r1);	 Catch:{ JSONException -> 0x006a }
        r6.<init>(r7);	 Catch:{ JSONException -> 0x006a }
        r7 = new adim;	 Catch:{ JSONException -> 0x006a }
        r5 = r5.getString(r0);	 Catch:{ JSONException -> 0x006a }
        r7.<init>(r5);	 Catch:{ JSONException -> 0x006a }
        r2.put(r6, r7);	 Catch:{ JSONException -> 0x006a }
        goto L_0x0082;
    L_0x006a:
        r5 = defpackage.adly.a;	 Catch:{ JSONException -> 0x008c }
        r6 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x008c }
        r7 = 32;
        r6.<init>(r7);	 Catch:{ JSONException -> 0x008c }
        r7 = "Error parsing screen ";
        r6.append(r7);	 Catch:{ JSONException -> 0x008c }
        r6.append(r3);	 Catch:{ JSONException -> 0x008c }
        r6 = r6.toString();	 Catch:{ JSONException -> 0x008c }
        defpackage.xtl.b(r5, r6);	 Catch:{ JSONException -> 0x008c }
    L_0x0082:
        r3 = r3 + 1;
        goto L_0x003d;
    L_0x0085:
        r9 = r2;
        goto L_0x0098;
    L_0x0087:
        r9 = java.util.Collections.emptyMap();	 Catch:{ JSONException -> 0x008c }
        goto L_0x0098;
    L_0x008c:
        r9 = move-exception;
        r0 = defpackage.adly.a;	 Catch:{ IOException -> 0x009b }
        r1 = "Error parsing screen status ";
        defpackage.xtl.a(r0, r1, r9);	 Catch:{ IOException -> 0x009b }
        r9 = java.util.Collections.emptyMap();	 Catch:{ IOException -> 0x009b }
    L_0x0098:
        r8.a = r9;	 Catch:{ IOException -> 0x009b }
        return;
    L_0x009b:
        r9 = move-exception;
        r0 = defpackage.adly.a;
        r1 = r8.b;
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        if (r2 != 0) goto L_0x00b0;
    L_0x00aa:
        r1 = new java.lang.String;
        r1.<init>(r4);
        goto L_0x00b4;
    L_0x00b0:
        r1 = r4.concat(r1);
    L_0x00b4:
        defpackage.xtl.a(r0, r1, r9);
        return;
    L_0x00b8:
        r9 = defpackage.adly.a;
        r0 = r8.b;
        r0 = java.lang.String.valueOf(r0);
        r1 = "Response body is null from ";
        r2 = r0.length();
        if (r2 != 0) goto L_0x00ce;
    L_0x00c8:
        r0 = new java.lang.String;
        r0.<init>(r1);
        goto L_0x00d2;
    L_0x00ce:
        r0 = r1.concat(r0);
    L_0x00d2:
        defpackage.xtl.a(r9, r0);
        return;
    L_0x00d6:
        r0 = defpackage.adly.a;
        r1 = r8.b;
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r5 = new java.lang.StringBuilder;
        r2 = r2 + 43;
        r5.<init>(r2);
        r2 = "POST ";
        r5.append(r2);
        r5.append(r1);
        r1 = " failed. Response code is: ";
        r5.append(r1);
        r5.append(r9);
        r9 = r5.toString();
        defpackage.xtl.b(r0, r9);
        if (r3 == 0) goto L_0x0144;
    L_0x0102:
        r9 = r3.d();	 Catch:{ IOException -> 0x0127 }
        r0 = defpackage.adly.a;	 Catch:{ IOException -> 0x0127 }
        r9 = java.lang.String.valueOf(r9);	 Catch:{ IOException -> 0x0127 }
        r1 = r9.length();	 Catch:{ IOException -> 0x0127 }
        r1 = r1 + 19;
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0127 }
        r2.<init>(r1);	 Catch:{ IOException -> 0x0127 }
        r1 = "Error from server: ";
        r2.append(r1);	 Catch:{ IOException -> 0x0127 }
        r2.append(r9);	 Catch:{ IOException -> 0x0127 }
        r9 = r2.toString();	 Catch:{ IOException -> 0x0127 }
        defpackage.xtl.a(r0, r9);	 Catch:{ IOException -> 0x0127 }
        return;
    L_0x0127:
        r9 = move-exception;
        r0 = defpackage.adly.a;
        r1 = r8.b;
        r1 = java.lang.String.valueOf(r1);
        r2 = r1.length();
        if (r2 != 0) goto L_0x013c;
    L_0x0136:
        r1 = new java.lang.String;
        r1.<init>(r4);
        goto L_0x0140;
    L_0x013c:
        r1 = r4.concat(r1);
    L_0x0140:
        defpackage.xtl.a(r0, r1, r9);
        return;
    L_0x0144:
        r9 = defpackage.adly.a;
        r0 = "Response body is null";
        defpackage.xtl.a(r9, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adma.a(xho):void");
    }

    public final void a(IOException iOException) {
        String str = adly.a;
        String valueOf = String.valueOf(this.b);
        String str2 = "Error posting to ";
        xtl.a(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), (Throwable) iOException);
    }
}
