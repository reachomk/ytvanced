package defpackage;

/* renamed from: xim */
public final class xim implements baqa {
    private final bcaa a;
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    private xim(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        this.a = bcaa;
        this.b = bcaa2;
        this.c = bcaa3;
        this.d = bcaa4;
    }

    public static xim a(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4) {
        return new xim(bcaa, bcaa2, bcaa3, bcaa4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0125 A:{LOOP_END, Catch:{ all -> 0x0137 }, LOOP:0: B:43:0x0123->B:44:0x0125} */
    public final /* synthetic */ java.lang.Object get() {
        /*
        r11 = this;
        r0 = r11.a;
        r0 = r0.get();
        r0 = (android.content.Context) r0;
        r1 = r11.b;
        r1 = r1.get();
        r1 = (defpackage.xax) r1;
        r2 = r11.c;
        r2 = r2.get();
        r2 = (java.io.File) r2;
        r3 = r11.d;
        r3 = r3.get();
        r3 = (defpackage.xti) r3;
        r4 = 0;
        r5 = "disable_native_cronet";
        r3 = r3.a(r5, r4);
        if (r3 == 0) goto L_0x002f;
    L_0x0029:
        r0 = defpackage.xik.a(r0);
        goto L_0x0141;
    L_0x002f:
        r3 = new bcjk;	 Catch:{ all -> 0x0137 }
        r3.<init>(r0);	 Catch:{ all -> 0x0137 }
        r5 = r1.g();	 Catch:{ all -> 0x0137 }
        r5 = r5.c;	 Catch:{ all -> 0x0137 }
        r3.a(r5);	 Catch:{ all -> 0x0137 }
        r5 = r1.g();	 Catch:{ all -> 0x0137 }
        r5 = r5.b;	 Catch:{ all -> 0x0137 }
        r3.b(r5);	 Catch:{ all -> 0x0137 }
        r5 = new xij;	 Catch:{ all -> 0x0137 }
        r5.<init>(r0);	 Catch:{ all -> 0x0137 }
        r3.a(r5);	 Catch:{ all -> 0x0137 }
        r5 = new java.io.File;	 Catch:{ all -> 0x0137 }
        r6 = "cronet_metadata_cache";
        r5.<init>(r2, r6);	 Catch:{ all -> 0x0137 }
        r5.mkdirs();	 Catch:{ all -> 0x0137 }
        r2 = r5.isDirectory();	 Catch:{ all -> 0x0137 }
        r6 = 3;
        r7 = 2;
        if (r2 == 0) goto L_0x0087;
    L_0x0060:
        r2 = r5.getAbsolutePath();	 Catch:{ all -> 0x0137 }
        r3.c(r2);	 Catch:{ all -> 0x0137 }
        r2 = r1.a();	 Catch:{ all -> 0x0137 }
        r2 = r2.l;	 Catch:{ all -> 0x0137 }
        if (r2 != 0) goto L_0x0075;
    L_0x006f:
        r8 = 0;
        r3.a(r7, r8);	 Catch:{ all -> 0x0137 }
        goto L_0x0087;
    L_0x0075:
        r2 = r1.a();	 Catch:{ all -> 0x0137 }
        r2 = r2.m;	 Catch:{ all -> 0x0137 }
        if (r2 > 0) goto L_0x007f;
    L_0x007d:
        r2 = 250; // 0xfa float:3.5E-43 double:1.235E-321;
    L_0x007f:
        r5 = 1048576; // 0x100000 float:1.469368E-39 double:5.180654E-318;
        r2 = r2 * r5;
        r8 = (long) r2;	 Catch:{ all -> 0x0137 }
        r3.a(r6, r8);	 Catch:{ all -> 0x0137 }
    L_0x0087:
        r2 = r1.f();	 Catch:{ all -> 0x0137 }
        r5 = r2.a;	 Catch:{ all -> 0x0137 }
        r8 = 4;
        r5 = r5 & r8;
        r9 = 0;
        if (r5 == 0) goto L_0x009f;
    L_0x0092:
        r2 = r2.c;	 Catch:{ all -> 0x0137 }
        if (r2 != 0) goto L_0x0098;
    L_0x0096:
        r2 = defpackage.aotb.d;	 Catch:{ all -> 0x0137 }
    L_0x0098:
        r2 = r2.b;	 Catch:{ all -> 0x0137 }
        if (r2 != 0) goto L_0x00a0;
    L_0x009c:
        r2 = defpackage.aosv.d;	 Catch:{ all -> 0x0137 }
        goto L_0x00a0;
    L_0x009f:
        r2 = r9;
    L_0x00a0:
        if (r2 == 0) goto L_0x00a5;
    L_0x00a2:
        r5 = r2.b;	 Catch:{ all -> 0x0137 }
        goto L_0x00a6;
    L_0x00a5:
        r5 = r9;
    L_0x00a6:
        r10 = android.text.TextUtils.isEmpty(r5);	 Catch:{ all -> 0x0137 }
        if (r10 != 0) goto L_0x00af;
    L_0x00ac:
        r3.a(r5);	 Catch:{ all -> 0x0137 }
    L_0x00af:
        r1 = r1.g();	 Catch:{ all -> 0x0137 }
        r1 = r1.c;	 Catch:{ all -> 0x0137 }
        if (r1 != 0) goto L_0x00b9;
    L_0x00b7:
        goto L_0x012f;
    L_0x00b9:
        if (r2 != 0) goto L_0x00bc;
    L_0x00bb:
        goto L_0x00cf;
    L_0x00bc:
        r1 = r2.c;	 Catch:{ all -> 0x0137 }
        r1 = r1.size();	 Catch:{ all -> 0x0137 }
        if (r1 == 0) goto L_0x00cf;
    L_0x00c4:
        r1 = r2.c;	 Catch:{ all -> 0x0137 }
        r2 = new java.lang.String[r4];	 Catch:{ all -> 0x0137 }
        r1 = r1.toArray(r2);	 Catch:{ all -> 0x0137 }
        r9 = r1;
        r9 = (java.lang.String[]) r9;	 Catch:{ all -> 0x0137 }
    L_0x00cf:
        if (r9 != 0) goto L_0x00d2;
    L_0x00d1:
        goto L_0x00d6;
    L_0x00d2:
        r1 = r9.length;	 Catch:{ all -> 0x0137 }
        if (r1 == 0) goto L_0x00d6;
    L_0x00d5:
        goto L_0x0122;
    L_0x00d6:
        r1 = 14;
        r9 = new java.lang.String[r1];	 Catch:{ all -> 0x0137 }
        r1 = "www.googleapis.com";
        r9[r4] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "www.googleadservices.com";
        r2 = 1;
        r9[r2] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "youtubei.googleapis.com";
        r9[r7] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "yt3.ggpht.com";
        r9[r6] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "yt3.googleusercontent.com";
        r9[r8] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "www.gstatic.com";
        r2 = 5;
        r9[r2] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "csi.gstatic.com";
        r2 = 6;
        r9[r2] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "myphonenumbers-pa.googleapis.com";
        r2 = 7;
        r9[r2] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "people-pa.googleapis.com";
        r2 = 8;
        r9[r2] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "i.ytimg.com";
        r2 = 9;
        r9[r2] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "video.google.com";
        r2 = 10;
        r9[r2] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "s.youtube.com";
        r2 = 11;
        r9[r2] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "www.youtube.com";
        r2 = 12;
        r9[r2] = r1;	 Catch:{ all -> 0x0137 }
        r1 = "googleads.g.doubleclick.net";
        r2 = 13;
        r9[r2] = r1;	 Catch:{ all -> 0x0137 }
    L_0x0122:
        r1 = r9.length;	 Catch:{ all -> 0x0137 }
    L_0x0123:
        if (r4 >= r1) goto L_0x012f;
    L_0x0125:
        r2 = r9[r4];	 Catch:{ all -> 0x0137 }
        r5 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r3.a(r2, r5, r5);	 Catch:{ all -> 0x0137 }
        r4 = r4 + 1;
        goto L_0x0123;
    L_0x012f:
        r1 = r3.a();	 Catch:{ all -> 0x0137 }
        r1 = (defpackage.bcjh) r1;	 Catch:{ all -> 0x0137 }
        r0 = r1;
        goto L_0x0141;
    L_0x0137:
        r1 = move-exception;
        r2 = "Failed to construct CronetEngine. Using fallback Java implementation.";
        defpackage.xtl.a(r2, r1);
        r0 = defpackage.xik.a(r0);
    L_0x0141:
        r1 = "Cannot return null from a non-@Nullable @Provides method";
        r0 = defpackage.baqd.a(r0, r1);
        r0 = (defpackage.bciz) r0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xim.get():java.lang.Object");
    }
}
