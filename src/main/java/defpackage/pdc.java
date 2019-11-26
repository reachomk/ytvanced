package defpackage;

import java.util.Map;

/* renamed from: pdc */
final class pdc extends Thread {
    private final /* synthetic */ Map a;

    pdc(Map map) {
        this.a = map;
    }

    /* JADX WARNING: Missing block: B:12:0x0051, code skipped:
            if (r4 >= 300) goto L_0x0053;
     */
    public final void run() {
        /*
        r8 = this;
        r0 = ". ";
        r1 = "HttpUrlPinger";
        r2 = new pdd;
        r2.<init>();
        r2 = r8.a;
        r3 = "https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps";
        r3 = android.net.Uri.parse(r3);
        r3 = r3.buildUpon();
        r4 = r2.keySet();
        r4 = r4.iterator();
    L_0x001d:
        r5 = r4.hasNext();
        if (r5 == 0) goto L_0x0033;
    L_0x0023:
        r5 = r4.next();
        r5 = (java.lang.String) r5;
        r6 = r2.get(r5);
        r6 = (java.lang.String) r6;
        r3.appendQueryParameter(r5, r6);
        goto L_0x001d;
    L_0x0033:
        r2 = r3.build();
        r2 = r2.toString();
        r3 = new java.net.URL;	 Catch:{ IndexOutOfBoundsException -> 0x00b7, IOException -> 0x0084, IOException | RuntimeException -> 0x0082 }
        r3.<init>(r2);	 Catch:{ IndexOutOfBoundsException -> 0x00b7, IOException -> 0x0084, IOException | RuntimeException -> 0x0082 }
        r3 = r3.openConnection();	 Catch:{ IndexOutOfBoundsException -> 0x00b7, IOException -> 0x0084, IOException | RuntimeException -> 0x0082 }
        r3 = (java.net.HttpURLConnection) r3;	 Catch:{ IndexOutOfBoundsException -> 0x00b7, IOException -> 0x0084, IOException | RuntimeException -> 0x0082 }
        r4 = r3.getResponseCode();	 Catch:{ all -> 0x007d }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 >= r5) goto L_0x004f;
    L_0x004e:
        goto L_0x0053;
    L_0x004f:
        r5 = 300; // 0x12c float:4.2E-43 double:1.48E-321;
        if (r4 < r5) goto L_0x0079;
    L_0x0053:
        r5 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x007d }
        r5 = r5.length();	 Catch:{ all -> 0x007d }
        r5 = r5 + 65;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x007d }
        r6.<init>(r5);	 Catch:{ all -> 0x007d }
        r5 = "Received non-success response code ";
        r6.append(r5);	 Catch:{ all -> 0x007d }
        r6.append(r4);	 Catch:{ all -> 0x007d }
        r4 = " from pinging URL: ";
        r6.append(r4);	 Catch:{ all -> 0x007d }
        r6.append(r2);	 Catch:{ all -> 0x007d }
        r4 = r6.toString();	 Catch:{ all -> 0x007d }
        android.util.Log.w(r1, r4);	 Catch:{ all -> 0x007d }
    L_0x0079:
        r3.disconnect();	 Catch:{ IndexOutOfBoundsException -> 0x00b7, IOException -> 0x0084, IOException | RuntimeException -> 0x0082 }
        return;
    L_0x007d:
        r4 = move-exception;
        r3.disconnect();	 Catch:{ IndexOutOfBoundsException -> 0x00b7, IOException -> 0x0084, IOException | RuntimeException -> 0x0082 }
        throw r4;	 Catch:{ IndexOutOfBoundsException -> 0x00b7, IOException -> 0x0084, IOException | RuntimeException -> 0x0082 }
    L_0x0082:
        r3 = move-exception;
        goto L_0x0085;
    L_0x0084:
        r3 = move-exception;
    L_0x0085:
        r4 = r3.getMessage();
        r5 = java.lang.String.valueOf(r2);
        r5 = r5.length();
        r6 = java.lang.String.valueOf(r4);
        r6 = r6.length();
        r7 = new java.lang.StringBuilder;
        r5 = r5 + 27;
        r5 = r5 + r6;
        r7.<init>(r5);
        r5 = "Error while pinging URL: ";
        r7.append(r5);
        r7.append(r2);
        r7.append(r0);
        r7.append(r4);
        r0 = r7.toString();
        android.util.Log.w(r1, r0, r3);
        return;
    L_0x00b7:
        r3 = move-exception;
        r4 = r3.getMessage();
        r5 = java.lang.String.valueOf(r2);
        r5 = r5.length();
        r6 = java.lang.String.valueOf(r4);
        r6 = r6.length();
        r7 = new java.lang.StringBuilder;
        r5 = r5 + 32;
        r5 = r5 + r6;
        r7.<init>(r5);
        r5 = "Error while parsing ping URL: ";
        r7.append(r5);
        r7.append(r2);
        r7.append(r0);
        r7.append(r4);
        r0 = r7.toString();
        android.util.Log.w(r1, r0, r3);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdc.run():void");
    }
}
