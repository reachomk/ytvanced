package defpackage;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adcy */
public final class adcy {
    private static final String e = xtl.b("MDX.remote");
    public final xhv a;
    public final xsc b;
    public final addr c = new adcx(this);
    public final adcw d;
    private final SharedPreferences f;

    public adcy(xhv xhv, SharedPreferences sharedPreferences, xsc xsc, adcw adcw) {
        this.a = xhv;
        this.f = (SharedPreferences) amqw.a((Object) sharedPreferences);
        this.b = xsc;
        this.d = adcw;
        b();
    }

    /* JADX WARNING: Missing block: B:49:0x0100, code skipped:
            if (r7 != null) goto L_0x0102;
     */
    private final synchronized void b() {
        /*
        r18 = this;
        r1 = r18;
        monitor-enter(r18);
        r0 = r1.f;	 Catch:{ all -> 0x0130 }
        r2 = "youtube.mdx:dial_devices";
        r3 = "[]";
        r0 = r0.getString(r2, r3);	 Catch:{ all -> 0x0130 }
        r2 = r1.d;	 Catch:{ IllegalArgumentException -> 0x0115 }
        r3 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x0107 }
        r3.<init>(r0);	 Catch:{ JSONException -> 0x0107 }
        r0 = r3.length();	 Catch:{ JSONException -> 0x0107 }
        r4 = 0;
        r6 = 0;
        if (r0 <= 0) goto L_0x0073;
    L_0x001d:
        r0 = r3.optJSONObject(r6);	 Catch:{ JSONException -> 0x0107 }
        r7 = "wifi";
        r0 = r0.has(r7);	 Catch:{ JSONException -> 0x0107 }
        if (r0 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x0073;
    L_0x002a:
        r0 = r3.length();	 Catch:{ JSONException -> 0x0107 }
        if (r6 >= r0) goto L_0x006e;
    L_0x0030:
        r0 = r3.optJSONObject(r6);	 Catch:{ JSONException -> 0x0107 }
        if (r0 != 0) goto L_0x0037;
    L_0x0036:
        goto L_0x006b;
    L_0x0037:
        r7 = "id";
        r7 = r0.has(r7);	 Catch:{ JSONException -> 0x0107 }
        if (r7 == 0) goto L_0x006b;
    L_0x003f:
        r7 = new adjg;	 Catch:{ JSONException -> 0x0107 }
        r8 = "id";
        r8 = r0.getString(r8);	 Catch:{ JSONException -> 0x0107 }
        r7.<init>(r8);	 Catch:{ JSONException -> 0x0107 }
        r8 = "ts";
        r8 = r0.optLong(r8, r4);	 Catch:{ JSONException -> 0x0107 }
        r10 = r2.c;	 Catch:{ JSONException -> 0x0107 }
        r10 = r10.a();	 Catch:{ JSONException -> 0x0107 }
        r8 = defpackage.adcw.a(r10, r8);	 Catch:{ JSONException -> 0x0107 }
        if (r8 != 0) goto L_0x0064;
    L_0x005c:
        r0 = defpackage.adcw.a(r0);	 Catch:{ JSONException -> 0x0107 }
        r2.a(r7, r0);	 Catch:{ JSONException -> 0x0107 }
        goto L_0x006b;
    L_0x0064:
        r0 = java.lang.String.valueOf(r7);	 Catch:{ JSONException -> 0x0107 }
        r0.length();	 Catch:{ JSONException -> 0x0107 }
    L_0x006b:
        r6 = r6 + 1;
        goto L_0x002a;
    L_0x006e:
        r3.length();	 Catch:{ JSONException -> 0x0107 }
        goto L_0x0102;
    L_0x0073:
        r0 = 0;
        r7 = 0;
    L_0x0075:
        r8 = r3.length();	 Catch:{ JSONException -> 0x0107 }
        if (r0 >= r8) goto L_0x0100;
    L_0x007b:
        r8 = r3.optJSONObject(r0);	 Catch:{ JSONException -> 0x0107 }
        r9 = 1;
        if (r8 == 0) goto L_0x00fa;
    L_0x0082:
        r10 = "wifi";
        r10 = r8.has(r10);	 Catch:{ JSONException -> 0x0107 }
        if (r10 == 0) goto L_0x00fa;
    L_0x008a:
        r10 = "ts";
        r10 = r8.optLong(r10, r4);	 Catch:{ JSONException -> 0x0107 }
        r12 = "wifi";
        r12 = r8.getString(r12);	 Catch:{ JSONException -> 0x0107 }
        r13 = r2.c;	 Catch:{ JSONException -> 0x0107 }
        r13 = r13.a();	 Catch:{ JSONException -> 0x0107 }
        r15 = defpackage.adcw.b;	 Catch:{ JSONException -> 0x0107 }
        r15 = r15 + r10;
        r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1));
        if (r17 > 0) goto L_0x00f2;
    L_0x00a3:
        r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1));
        if (r15 <= 0) goto L_0x00a8;
    L_0x00a7:
        goto L_0x00f2;
    L_0x00a8:
        r10 = defpackage.adcv.a(r10, r12);	 Catch:{ JSONException -> 0x0107 }
        r11 = "devices";
        r8 = r8.getJSONArray(r11);	 Catch:{ JSONException -> 0x0107 }
        r11 = r7;
        r7 = 0;
    L_0x00b4:
        r12 = r8.length();	 Catch:{ JSONException -> 0x0107 }
        if (r7 >= r12) goto L_0x00f0;
    L_0x00ba:
        r12 = r8.getJSONObject(r7);	 Catch:{ JSONException -> 0x0107 }
        r13 = new adjg;	 Catch:{ JSONException -> 0x0107 }
        r14 = "id";
        r14 = r12.getString(r14);	 Catch:{ JSONException -> 0x0107 }
        r13.<init>(r14);	 Catch:{ JSONException -> 0x0107 }
        r14 = "ts";
        r14 = r12.optLong(r14, r4);	 Catch:{ JSONException -> 0x0107 }
        r4 = r2.c;	 Catch:{ JSONException -> 0x0107 }
        r4 = r4.a();	 Catch:{ JSONException -> 0x0107 }
        r4 = defpackage.adcw.a(r4, r14);	 Catch:{ JSONException -> 0x0107 }
        if (r4 != 0) goto L_0x00e3;
    L_0x00db:
        r4 = defpackage.adcw.a(r12);	 Catch:{ JSONException -> 0x0107 }
        r2.a(r10, r13, r4, r6);	 Catch:{ JSONException -> 0x0107 }
        goto L_0x00eb;
    L_0x00e3:
        r4 = java.lang.String.valueOf(r13);	 Catch:{ JSONException -> 0x0107 }
        r4.length();	 Catch:{ JSONException -> 0x0107 }
        r11 = 1;
    L_0x00eb:
        r7 = r7 + 1;
        r4 = 0;
        goto L_0x00b4;
    L_0x00f0:
        r7 = r11;
        goto L_0x00fa;
    L_0x00f2:
        r4 = java.lang.String.valueOf(r12);	 Catch:{ JSONException -> 0x0107 }
        r4.length();	 Catch:{ JSONException -> 0x0107 }
        r7 = 1;
    L_0x00fa:
        r0 = r0 + 1;
        r4 = 0;
        goto L_0x0075;
    L_0x0100:
        if (r7 == 0) goto L_0x0105;
    L_0x0102:
        r18.a();	 Catch:{ all -> 0x0130 }
    L_0x0105:
        monitor-exit(r18);
        return;
    L_0x0107:
        r0 = move-exception;
        r2 = defpackage.adcw.a;	 Catch:{ IllegalArgumentException -> 0x0115 }
        r3 = "Could not load DIAL device cache.";
        defpackage.xtl.a(r2, r3, r0);	 Catch:{ IllegalArgumentException -> 0x0115 }
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0115 }
        r2.<init>(r0);	 Catch:{ IllegalArgumentException -> 0x0115 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0115 }
    L_0x0115:
        r0 = move-exception;
        r2 = e;	 Catch:{ all -> 0x0130 }
        r3 = "Error loading dial devices from pref";
        defpackage.xtl.a(r2, r3, r0);	 Catch:{ all -> 0x0130 }
        r0 = r1.f;	 Catch:{ all -> 0x0130 }
        r0 = r0.edit();	 Catch:{ all -> 0x0130 }
        r2 = "youtube.mdx:dial_devices";
        r3 = "[]";
        r0 = r0.putString(r2, r3);	 Catch:{ all -> 0x0130 }
        r0.apply();	 Catch:{ all -> 0x0130 }
        monitor-exit(r18);
        return;
    L_0x0130:
        r0 = move-exception;
        monitor-exit(r18);
        goto L_0x0134;
    L_0x0133:
        throw r0;
    L_0x0134:
        goto L_0x0133;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adcy.b():void");
    }

    public final synchronized void a() {
        Editor edit = this.f.edit();
        adcw adcw = this.d;
        try {
            JSONArray jSONArray = new JSONArray();
            for (adcv adcv : adcw.d.values()) {
                JSONObject put = new JSONObject().put("wifi", adcv.a()).put("ts", adcv.a);
                jSONArray.put(put);
                JSONArray jSONArray2 = new JSONArray();
                put.put("devices", jSONArray2);
                for (Entry entry : ((ConcurrentHashMap) adcw.get(adcv)).entrySet()) {
                    adda adda = (adda) entry.getValue();
                    put = new JSONObject().put("id", entry.getKey()).put("ts", adda.a).putOpt("name", adda.a()).putOpt("ssid", adda.d()).putOpt("timeout", Integer.valueOf(adda.c())).putOpt("wol", Boolean.valueOf(adda.e()));
                    put.putOpt("mac", adda.b());
                    jSONArray2.put(put);
                }
            }
            edit.putString("youtube.mdx:dial_devices", jSONArray.toString()).apply();
        } catch (JSONException e) {
            xtl.a(adcw.a, "Could not save DIAL device cache.", e);
            throw new IllegalArgumentException(e);
        }
    }
}
