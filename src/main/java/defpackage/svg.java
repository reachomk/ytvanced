package defpackage;

/* renamed from: svg */
final /* synthetic */ class svg implements Runnable {
    private final svd a;

    svg(svd svd) {
        this.a = svd;
    }

    /* JADX WARNING: Missing block: B:56:0x015b, code skipped:
            if (r1 != null) goto L_0x015d;
     */
    /* JADX WARNING: Missing block: B:58:?, code skipped:
            r1.close();
     */
    public final void run() {
        /*
        r9 = this;
        r0 = r9.a;
        r1 = defpackage.azuv.b;	 Catch:{ IOException -> 0x016b }
        r1 = r1.createBuilder();	 Catch:{ IOException -> 0x016b }
        r1 = (defpackage.azuu) r1;	 Catch:{ IOException -> 0x016b }
        r2 = new java.util.HashSet;	 Catch:{ IOException -> 0x016b }
        r2.<init>();	 Catch:{ IOException -> 0x016b }
        r3 = r0.a;	 Catch:{ IOException -> 0x016b }
        r3 = r3.keySet();	 Catch:{ IOException -> 0x016b }
        r2.addAll(r3);	 Catch:{ IOException -> 0x016b }
        r3 = r0.b;	 Catch:{ IOException -> 0x016b }
        r3 = r3.keySet();	 Catch:{ IOException -> 0x016b }
        r2.addAll(r3);	 Catch:{ IOException -> 0x016b }
        r2 = r2.iterator();	 Catch:{ IOException -> 0x016b }
    L_0x0025:
        r3 = r2.hasNext();	 Catch:{ IOException -> 0x016b }
        r4 = 2;
        r5 = 1;
        if (r3 == 0) goto L_0x009d;
    L_0x002d:
        r3 = r2.next();	 Catch:{ IOException -> 0x016b }
        r3 = (java.lang.String) r3;	 Catch:{ IOException -> 0x016b }
        r6 = defpackage.azux.d;	 Catch:{ IOException -> 0x016b }
        r6 = r6.createBuilder();	 Catch:{ IOException -> 0x016b }
        r6 = (defpackage.azuw) r6;	 Catch:{ IOException -> 0x016b }
        r6.copyOnWrite();	 Catch:{ IOException -> 0x016b }
        r7 = r6.instance;	 Catch:{ IOException -> 0x016b }
        r7 = (defpackage.azux) r7;	 Catch:{ IOException -> 0x016b }
        if (r3 == 0) goto L_0x0097;
    L_0x0044:
        r8 = r7.a;	 Catch:{ IOException -> 0x016b }
        r5 = r5 | r8;
        r7.a = r5;	 Catch:{ IOException -> 0x016b }
        r7.b = r3;	 Catch:{ IOException -> 0x016b }
        r5 = r0.c;	 Catch:{ IOException -> 0x016b }
        r5 = r5.containsKey(r3);	 Catch:{ IOException -> 0x016b }
        if (r5 == 0) goto L_0x0072;
    L_0x0053:
        r5 = r0.c;	 Catch:{ IOException -> 0x016b }
        r3 = r5.get(r3);	 Catch:{ IOException -> 0x016b }
        r3 = (java.lang.String) r3;	 Catch:{ IOException -> 0x016b }
        r6.copyOnWrite();	 Catch:{ IOException -> 0x016b }
        r5 = r6.instance;	 Catch:{ IOException -> 0x016b }
        r5 = (defpackage.azux) r5;	 Catch:{ IOException -> 0x016b }
        if (r3 == 0) goto L_0x006c;
    L_0x0064:
        r7 = r5.a;	 Catch:{ IOException -> 0x016b }
        r4 = r4 | r7;
        r5.a = r4;	 Catch:{ IOException -> 0x016b }
        r5.c = r3;	 Catch:{ IOException -> 0x016b }
        goto L_0x0072;
    L_0x006c:
        r0 = new java.lang.NullPointerException;	 Catch:{ IOException -> 0x016b }
        r0.<init>();	 Catch:{ IOException -> 0x016b }
        throw r0;	 Catch:{ IOException -> 0x016b }
    L_0x0072:
        r1.copyOnWrite();	 Catch:{ IOException -> 0x016b }
        r3 = r1.instance;	 Catch:{ IOException -> 0x016b }
        r3 = (defpackage.azuv) r3;	 Catch:{ IOException -> 0x016b }
        r4 = r3.a;	 Catch:{ IOException -> 0x016b }
        r4 = r4.a();	 Catch:{ IOException -> 0x016b }
        if (r4 != 0) goto L_0x0089;
    L_0x0081:
        r4 = r3.a;	 Catch:{ IOException -> 0x016b }
        r4 = defpackage.anxl.mutableCopy(r4);	 Catch:{ IOException -> 0x016b }
        r3.a = r4;	 Catch:{ IOException -> 0x016b }
    L_0x0089:
        r3 = r3.a;	 Catch:{ IOException -> 0x016b }
        r4 = r6.build();	 Catch:{ IOException -> 0x016b }
        r4 = (defpackage.anxl) r4;	 Catch:{ IOException -> 0x016b }
        r4 = (defpackage.azux) r4;	 Catch:{ IOException -> 0x016b }
        r3.add(r4);	 Catch:{ IOException -> 0x016b }
        goto L_0x0025;
    L_0x0097:
        r0 = new java.lang.NullPointerException;	 Catch:{ IOException -> 0x016b }
        r0.<init>();	 Catch:{ IOException -> 0x016b }
        throw r0;	 Catch:{ IOException -> 0x016b }
    L_0x009d:
        r1 = r1.build();	 Catch:{ IOException -> 0x016b }
        r1 = (defpackage.anxl) r1;	 Catch:{ IOException -> 0x016b }
        r1 = (defpackage.azuv) r1;	 Catch:{ IOException -> 0x016b }
        r1 = r1.toByteArray();	 Catch:{ IOException -> 0x016b }
        r2 = new java.net.URL;	 Catch:{ IOException -> 0x016b }
        r3 = r0.e;	 Catch:{ IOException -> 0x016b }
        r6 = r0.f;	 Catch:{ IOException -> 0x016b }
        r7 = r0.g;	 Catch:{ IOException -> 0x016b }
        r8 = "/stateless_manifest";
        r2.<init>(r3, r6, r7, r8);	 Catch:{ IOException -> 0x016b }
        r2 = r2.openConnection();	 Catch:{ IOException -> 0x016b }
        r2 = (java.net.HttpURLConnection) r2;	 Catch:{ IOException -> 0x016b }
        r3 = "POST";
        r2.setRequestMethod(r3);	 Catch:{ IOException -> 0x016b }
        r2.setDoOutput(r5);	 Catch:{ IOException -> 0x016b }
        r3 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x016b }
        r6 = r2.getOutputStream();	 Catch:{ IOException -> 0x016b }
        r3.<init>(r6);	 Catch:{ IOException -> 0x016b }
        r3.write(r1);	 Catch:{ IOException -> 0x016b }
        r3.close();	 Catch:{ IOException -> 0x016b }
        r2.connect();	 Catch:{ IOException -> 0x016b }
        r1 = r2.getInputStream();	 Catch:{ all -> 0x0166 }
        r3 = defpackage.anaz.a(r1);	 Catch:{ all -> 0x0158 }
        if (r1 == 0) goto L_0x00e3;
    L_0x00e0:
        r1.close();	 Catch:{ all -> 0x0166 }
    L_0x00e3:
        r2.disconnect();	 Catch:{ IOException -> 0x016b }
        r1 = defpackage.azup.b;	 Catch:{ IOException -> 0x016b }
        r1 = defpackage.anxl.parseFrom(r1, r3);	 Catch:{ IOException -> 0x016b }
        r1 = (defpackage.azup) r1;	 Catch:{ IOException -> 0x016b }
        r1 = r1.a;	 Catch:{ IOException -> 0x016b }
        r1 = r1.iterator();	 Catch:{ IOException -> 0x016b }
    L_0x00f4:
        r2 = r1.hasNext();	 Catch:{ IOException -> 0x016b }
        if (r2 == 0) goto L_0x0157;
    L_0x00fa:
        r2 = r1.next();	 Catch:{ IOException -> 0x016b }
        r2 = (defpackage.azur) r2;	 Catch:{ IOException -> 0x016b }
        r3 = r2.b;	 Catch:{ IOException -> 0x016b }
        r6 = r0.c;	 Catch:{ IOException -> 0x016b }
        r7 = r2.e;	 Catch:{ IOException -> 0x016b }
        r6.put(r3, r7);	 Catch:{ IOException -> 0x016b }
        r6 = r2.d;	 Catch:{ IOException -> 0x016b }
        r6 = defpackage.azut.a(r6);	 Catch:{ IOException -> 0x016b }
        if (r6 == 0) goto L_0x0112;
    L_0x0111:
        goto L_0x0113;
    L_0x0112:
        r6 = 1;
    L_0x0113:
        r6 = r6 + -1;
        if (r6 == r5) goto L_0x0120;
    L_0x0117:
        if (r6 == r4) goto L_0x011a;
    L_0x0119:
        goto L_0x012b;
    L_0x011a:
        r6 = r2.c;	 Catch:{ IOException -> 0x016b }
        r6.d();	 Catch:{ IOException -> 0x016b }
        goto L_0x012b;
    L_0x0120:
        r6 = r2.c;	 Catch:{ IOException -> 0x016b }
        r6 = r6.d();	 Catch:{ IOException -> 0x016b }
        r7 = r0.a;	 Catch:{ IOException -> 0x016b }
        r7.put(r3, r6);	 Catch:{ IOException -> 0x016b }
    L_0x012b:
        r6 = r2.d;	 Catch:{ IOException -> 0x016b }
        r6 = defpackage.azut.a(r6);	 Catch:{ IOException -> 0x016b }
        if (r6 == 0) goto L_0x00f4;
    L_0x0133:
        if (r6 != r4) goto L_0x00f4;
    L_0x0135:
        r6 = "/system/template/";
        r3 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x016b }
        r7 = r3.length();	 Catch:{ IOException -> 0x016b }
        if (r7 != 0) goto L_0x0147;
    L_0x0141:
        r3 = new java.lang.String;	 Catch:{ IOException -> 0x016b }
        r3.<init>(r6);	 Catch:{ IOException -> 0x016b }
        goto L_0x014b;
    L_0x0147:
        r3 = r6.concat(r3);	 Catch:{ IOException -> 0x016b }
    L_0x014b:
        r6 = r0.d;	 Catch:{ IOException -> 0x016b }
        r2 = r2.c;	 Catch:{ IOException -> 0x016b }
        r2 = r2.d();	 Catch:{ IOException -> 0x016b }
        r6.a(r3, r2);	 Catch:{ IOException -> 0x016b }
        goto L_0x00f4;
    L_0x0157:
        return;
    L_0x0158:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x015a }
    L_0x015a:
        r3 = move-exception;
        if (r1 == 0) goto L_0x0165;
    L_0x015d:
        r1.close();	 Catch:{ all -> 0x0161 }
        goto L_0x0165;
    L_0x0161:
        r1 = move-exception;
        defpackage.ankx.a(r0, r1);	 Catch:{ all -> 0x0166 }
    L_0x0165:
        throw r3;	 Catch:{ all -> 0x0166 }
    L_0x0166:
        r0 = move-exception;
        r2.disconnect();	 Catch:{ IOException -> 0x016b }
        throw r0;	 Catch:{ IOException -> 0x016b }
    L_0x016b:
        r0 = move-exception;
        r1 = "DevServerTemplateLoader";
        r2 = "Error talking to ElementsDevServer";
        android.util.Log.w(r1, r2, r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svg.run():void");
    }
}
