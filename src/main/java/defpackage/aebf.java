package defpackage;

/* renamed from: aebf */
public final class aebf {
    private static final String a = xtl.b("MDX.LoungeStatusParser");

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092 A:{Catch:{ JSONException -> 0x00a0 }} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0091 A:{Catch:{ JSONException -> 0x00a0 }} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064 A:{SKIP} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0091 A:{Catch:{ JSONException -> 0x00a0 }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092 A:{Catch:{ JSONException -> 0x00a0 }} */
    public static android.util.Pair a(org.json.JSONObject r13) {
        /*
        r0 = "LOUNGE_SCREEN";
        r1 = "Error parsing lounge status message";
        r2 = new java.util.HashSet;
        r2.<init>();
        r3 = 0;
        r4 = new org.json.JSONArray;	 Catch:{ JSONException -> 0x00ac }
        r5 = "devices";
        r13 = r13.getString(r5);	 Catch:{ JSONException -> 0x00ac }
        r4.<init>(r13);	 Catch:{ JSONException -> 0x00ac }
        r13 = 0;
        r6 = r3;
        r5 = 0;
    L_0x0018:
        r7 = r4.length();	 Catch:{ JSONException -> 0x00aa }
        if (r5 >= r7) goto L_0x00b3;
    L_0x001e:
        r7 = r4.getJSONObject(r5);	 Catch:{ JSONException -> 0x00a0 }
        r8 = "type";
        r8 = r7.getString(r8);	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        r9 = "id";
        r9 = r7.getString(r9);	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        r10 = new adik;	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        r11 = "clientName";
        r11 = r7.getString(r11);	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        r10.<init>(r11);	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        r10 = "localChannelEncryptionKey";
        r7 = r7.optString(r10);	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        r10 = r8.hashCode();
        r11 = -201662908; // 0xfffffffff3fade44 float:-3.9751657E31 double:NaN;
        r12 = 1;
        if (r10 == r11) goto L_0x0057;
    L_0x0049:
        r11 = 1587305233; // 0x5e9c5b11 float:5.6333088E18 double:7.84232985E-315;
        if (r10 == r11) goto L_0x004f;
    L_0x004e:
        goto L_0x0061;
    L_0x004f:
        r10 = r8.equals(r0);
        if (r10 == 0) goto L_0x0061;
    L_0x0055:
        r10 = 1;
        goto L_0x0062;
    L_0x0057:
        r10 = "REMOTE_CONTROL";
        r10 = r8.equals(r10);
        if (r10 == 0) goto L_0x0061;
    L_0x005f:
        r10 = 0;
        goto L_0x0062;
    L_0x0061:
        r10 = -1;
    L_0x0062:
        if (r10 == 0) goto L_0x007e;
    L_0x0064:
        if (r10 == r12) goto L_0x007e;
    L_0x0066:
        r7 = new java.lang.IllegalArgumentException;	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        r9 = "Unknown SessionMemberType: ";
        r10 = r8.length();	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        if (r10 != 0) goto L_0x0076;
    L_0x0070:
        r8 = new java.lang.String;	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        r8.<init>(r9);	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        goto L_0x007a;
    L_0x0076:
        r8 = r9.concat(r8);	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
    L_0x007a:
        r7.<init>(r8);	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        throw r7;	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
    L_0x007e:
        r10 = new adii;	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        r10.<init>(r8, r9, r7);	 Catch:{ JSONException -> 0x0086, IllegalArgumentException | JSONException -> 0x0084 }
        goto L_0x008f;
    L_0x0084:
        r7 = move-exception;
        goto L_0x0087;
    L_0x0086:
        r7 = move-exception;
    L_0x0087:
        r8 = a;	 Catch:{ JSONException -> 0x00a0 }
        r9 = "Error parsing device object";
        defpackage.xtl.a(r8, r9, r7);	 Catch:{ JSONException -> 0x00a0 }
        r10 = r3;
    L_0x008f:
        if (r10 != 0) goto L_0x0092;
    L_0x0091:
        goto L_0x00a6;
    L_0x0092:
        r7 = r10.a;	 Catch:{ JSONException -> 0x00a0 }
        r7 = r7.equals(r0);	 Catch:{ JSONException -> 0x00a0 }
        if (r7 != 0) goto L_0x009e;
    L_0x009a:
        r2.add(r10);	 Catch:{ JSONException -> 0x00a0 }
        goto L_0x00a6;
    L_0x009e:
        r6 = r10;
        goto L_0x00a6;
    L_0x00a0:
        r7 = move-exception;
        r8 = a;	 Catch:{ JSONException -> 0x00aa }
        defpackage.xtl.a(r8, r1, r7);	 Catch:{ JSONException -> 0x00aa }
    L_0x00a6:
        r5 = r5 + 1;
        goto L_0x0018;
    L_0x00aa:
        r13 = move-exception;
        goto L_0x00ae;
    L_0x00ac:
        r13 = move-exception;
        r6 = r3;
    L_0x00ae:
        r0 = a;
        defpackage.xtl.a(r0, r1, r13);
    L_0x00b3:
        r13 = android.util.Pair.create(r6, r2);
        return r13;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aebf.a(org.json.JSONObject):android.util.Pair");
    }
}
