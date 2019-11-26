package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: admb */
final class admb implements aebm {
    public Map a = Collections.emptyMap();
    private final String b;

    admb(String str) {
        this.b = str;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0071 */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:24|25|46) */
    /* JADX WARNING: Missing block: B:25:?, code skipped:
            r4 = defpackage.admc.a;
            r5 = new java.lang.StringBuilder(32);
            r5.append("Error parsing screen ");
            r5.append(r3);
            defpackage.xtl.b(r4, r5.toString());
     */
    public final void a(defpackage.xho r9) {
        /*
        r8 = this;
        r0 = "loungeToken";
        r1 = "screens";
        r2 = r9.b();
        r9 = r9.e();
        r3 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r2 != r3) goto L_0x00e9;
    L_0x0010:
        if (r9 == 0) goto L_0x00c1;
    L_0x0012:
        r2 = new adme;	 Catch:{ IOException -> 0x00a2 }
        r9 = r9.f();	 Catch:{ IOException -> 0x00a2 }
        r2.<init>(r9);	 Catch:{ IOException -> 0x00a2 }
        r9 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0093 }
        r2 = r2.a;	 Catch:{ JSONException -> 0x0093 }
        r9.<init>(r2);	 Catch:{ JSONException -> 0x0093 }
        r2 = r9.has(r1);	 Catch:{ JSONException -> 0x0093 }
        if (r2 == 0) goto L_0x008e;
    L_0x0028:
        r9 = r9.getJSONArray(r1);	 Catch:{ JSONException -> 0x0093 }
        if (r9 != 0) goto L_0x0033;
    L_0x002e:
        r9 = java.util.Collections.emptyMap();	 Catch:{ JSONException -> 0x0093 }
        goto L_0x009f;
    L_0x0033:
        r1 = new java.util.HashMap;	 Catch:{ JSONException -> 0x0093 }
        r1.<init>();	 Catch:{ JSONException -> 0x0093 }
        r2 = 0;
        r3 = 0;
    L_0x003a:
        r4 = r9.length();	 Catch:{ JSONException -> 0x0093 }
        if (r3 >= r4) goto L_0x008c;
    L_0x0040:
        r4 = r9.getJSONObject(r3);	 Catch:{ JSONException -> 0x0071 }
        r5 = "status";
        r5 = r4.optString(r5);	 Catch:{ JSONException -> 0x0071 }
        r6 = java.lang.Boolean.valueOf(r2);	 Catch:{ JSONException -> 0x0071 }
        if (r5 == 0) goto L_0x005d;
    L_0x0050:
        r7 = "online";
        r5 = r7.equals(r5);	 Catch:{ JSONException -> 0x0071 }
        if (r5 == 0) goto L_0x005d;
    L_0x0058:
        r5 = 1;
        r6 = java.lang.Boolean.valueOf(r5);	 Catch:{ JSONException -> 0x0071 }
    L_0x005d:
        r5 = r4.has(r0);	 Catch:{ JSONException -> 0x0071 }
        if (r5 != 0) goto L_0x0064;
    L_0x0063:
        goto L_0x0089;
    L_0x0064:
        r5 = new adim;	 Catch:{ JSONException -> 0x0071 }
        r4 = r4.getString(r0);	 Catch:{ JSONException -> 0x0071 }
        r5.<init>(r4);	 Catch:{ JSONException -> 0x0071 }
        r1.put(r5, r6);	 Catch:{ JSONException -> 0x0071 }
        goto L_0x0089;
    L_0x0071:
        r4 = defpackage.admc.a;	 Catch:{ JSONException -> 0x0093 }
        r5 = new java.lang.StringBuilder;	 Catch:{ JSONException -> 0x0093 }
        r6 = 32;
        r5.<init>(r6);	 Catch:{ JSONException -> 0x0093 }
        r6 = "Error parsing screen ";
        r5.append(r6);	 Catch:{ JSONException -> 0x0093 }
        r5.append(r3);	 Catch:{ JSONException -> 0x0093 }
        r5 = r5.toString();	 Catch:{ JSONException -> 0x0093 }
        defpackage.xtl.b(r4, r5);	 Catch:{ JSONException -> 0x0093 }
    L_0x0089:
        r3 = r3 + 1;
        goto L_0x003a;
    L_0x008c:
        r9 = r1;
        goto L_0x009f;
    L_0x008e:
        r9 = java.util.Collections.emptyMap();	 Catch:{ JSONException -> 0x0093 }
        goto L_0x009f;
    L_0x0093:
        r9 = move-exception;
        r0 = defpackage.admc.a;	 Catch:{ IOException -> 0x00a2 }
        r1 = "Error parsing screen status ";
        defpackage.xtl.a(r0, r1, r9);	 Catch:{ IOException -> 0x00a2 }
        r9 = java.util.Collections.emptyMap();	 Catch:{ IOException -> 0x00a2 }
    L_0x009f:
        r8.a = r9;	 Catch:{ IOException -> 0x00a2 }
        return;
    L_0x00a2:
        r9 = move-exception;
        r0 = defpackage.admc.a;
        r1 = r8.b;
        r1 = java.lang.String.valueOf(r1);
        r2 = "Error loading screen status from ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x00b9;
    L_0x00b3:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x00bd;
    L_0x00b9:
        r1 = r2.concat(r1);
    L_0x00bd:
        defpackage.xtl.a(r0, r1, r9);
        return;
    L_0x00c1:
        r9 = defpackage.admc.a;
        r0 = r8.b;
        r1 = java.lang.String.valueOf(r0);
        r1 = r1.length();
        r2 = new java.lang.StringBuilder;
        r1 = r1 + 27;
        r2.<init>(r1);
        r1 = "Response body from ";
        r2.append(r1);
        r2.append(r0);
        r0 = " is null";
        r2.append(r0);
        r0 = r2.toString();
        defpackage.xtl.a(r9, r0);
        return;
    L_0x00e9:
        r9 = defpackage.admc.a;
        r0 = r8.b;
        r1 = java.lang.String.valueOf(r0);
        r1 = r1.length();
        r3 = new java.lang.StringBuilder;
        r1 = r1 + 41;
        r3.<init>(r1);
        r1 = "POST ";
        r3.append(r1);
        r3.append(r0);
        r0 = " failed. Status code is: ";
        r3.append(r0);
        r3.append(r2);
        r0 = r3.toString();
        defpackage.xtl.b(r9, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admb.a(xho):void");
    }

    public final void a(IOException iOException) {
        String str = admc.a;
        String valueOf = String.valueOf(this.b);
        String str2 = "Error loading screen status from ";
        xtl.a(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), (Throwable) iOException);
    }
}
