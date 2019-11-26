package defpackage;

/* renamed from: dii */
public final class dii implements dig {
    private String a;
    private String b;

    public dii(String str, String str2) {
        String str3 = null;
        this.a = !dim.a(str) ? str.trim() : null;
        if (!dim.a(str2)) {
            str3 = str2.trim();
        }
        this.b = str3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2 A:{Catch:{ MalformedURLException -> 0x008f, IOException -> 0x007f, all -> 0x007d }} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c A:{Catch:{ MalformedURLException -> 0x008f, IOException -> 0x007f, all -> 0x007d }} */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b5  */
    public final void a(java.lang.String r5, java.util.Map r6) {
        /*
        r4 = this;
        r0 = "SenderHttpURLConnection";
        r5 = defpackage.dim.a(r5, r6);
        r6 = "http.agent";
        r6 = java.lang.System.getProperty(r6);
        r1 = r4.a;
        r1 = defpackage.dim.a(r1);
        if (r1 != 0) goto L_0x0032;
    L_0x0014:
        r1 = r4.b;
        r1 = defpackage.dim.a(r1);
        if (r1 != 0) goto L_0x0032;
    L_0x001c:
        r1 = 3;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r1[r2] = r6;
        r6 = 1;
        r2 = r4.a;
        r1[r6] = r2;
        r6 = 2;
        r2 = r4.b;
        r1[r6] = r2;
        r6 = "%s %s/%s";
        r6 = java.lang.String.format(r6, r1);
    L_0x0032:
        r1 = java.lang.String.valueOf(r6);
        r2 = "User Agent: ";
        r3 = r1.length();
        if (r3 != 0) goto L_0x0044;
    L_0x003e:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x0047;
    L_0x0044:
        r2.concat(r1);
    L_0x0047:
        r1 = 0;
        r2 = new java.net.URL;	 Catch:{ MalformedURLException -> 0x008f, IOException -> 0x007f }
        r2.<init>(r5);	 Catch:{ MalformedURLException -> 0x008f, IOException -> 0x007f }
        r2 = r2.openConnection();	 Catch:{ MalformedURLException -> 0x008f, IOException -> 0x007f }
        r2 = (java.net.HttpURLConnection) r2;	 Catch:{ MalformedURLException -> 0x008f, IOException -> 0x007f }
        r1 = "User-Agent";
        r2.setRequestProperty(r1, r6);	 Catch:{ MalformedURLException -> 0x007a, IOException -> 0x0077, all -> 0x0074 }
        r6 = "to send ";
        r1 = java.lang.String.valueOf(r5);	 Catch:{ MalformedURLException -> 0x007a, IOException -> 0x0077, all -> 0x0074 }
        r3 = r1.length();	 Catch:{ MalformedURLException -> 0x007a, IOException -> 0x0077, all -> 0x0074 }
        if (r3 != 0) goto L_0x006a;
    L_0x0064:
        r1 = new java.lang.String;	 Catch:{ MalformedURLException -> 0x007a, IOException -> 0x0077, all -> 0x0074 }
        r1.<init>(r6);	 Catch:{ MalformedURLException -> 0x007a, IOException -> 0x0077, all -> 0x0074 }
        goto L_0x006d;
    L_0x006a:
        r6.concat(r1);	 Catch:{ MalformedURLException -> 0x007a, IOException -> 0x0077, all -> 0x0074 }
    L_0x006d:
        r2.getResponseCode();	 Catch:{ MalformedURLException -> 0x007a, IOException -> 0x0077, all -> 0x0074 }
        r2.disconnect();
        return;
    L_0x0074:
        r5 = move-exception;
        r1 = r2;
        goto L_0x00b3;
    L_0x0077:
        r5 = move-exception;
        r1 = r2;
        goto L_0x0080;
    L_0x007a:
        r6 = move-exception;
        r1 = r2;
        goto L_0x0090;
    L_0x007d:
        r5 = move-exception;
        goto L_0x00b3;
    L_0x007f:
        r5 = move-exception;
    L_0x0080:
        r6 = "IO error";
        defpackage.dim.a(r0, r6);	 Catch:{ all -> 0x007d }
        r6 = new dij;	 Catch:{ all -> 0x007d }
        r5 = r5.getMessage();	 Catch:{ all -> 0x007d }
        r6.<init>(r5);	 Catch:{ all -> 0x007d }
        throw r6;	 Catch:{ all -> 0x007d }
    L_0x008f:
        r6 = move-exception;
    L_0x0090:
        r2 = "wrong url format: ";
        r5 = java.lang.String.valueOf(r5);	 Catch:{ all -> 0x007d }
        r3 = r5.length();	 Catch:{ all -> 0x007d }
        if (r3 != 0) goto L_0x00a2;
    L_0x009c:
        r5 = new java.lang.String;	 Catch:{ all -> 0x007d }
        r5.<init>(r2);	 Catch:{ all -> 0x007d }
        goto L_0x00a6;
    L_0x00a2:
        r5 = r2.concat(r5);	 Catch:{ all -> 0x007d }
    L_0x00a6:
        defpackage.dim.a(r0, r5);	 Catch:{ all -> 0x007d }
        r5 = new dij;	 Catch:{ all -> 0x007d }
        r6 = r6.getMessage();	 Catch:{ all -> 0x007d }
        r5.<init>(r6);	 Catch:{ all -> 0x007d }
        throw r5;	 Catch:{ all -> 0x007d }
    L_0x00b3:
        if (r1 == 0) goto L_0x00b8;
    L_0x00b5:
        r1.disconnect();
    L_0x00b8:
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dii.a(java.lang.String, java.util.Map):void");
    }
}
