package defpackage;

/* renamed from: aeqp */
final class aeqp implements owt {
    private final /* synthetic */ aeqo a;

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    public final void a(defpackage.ovi r6, defpackage.ovm r7, boolean r8) {
        /*
        r5 = this;
        r8 = r5.a;
        monitor-enter(r8);
        r0 = r5.a;	 Catch:{ all -> 0x009b }
        r0 = r0.b;	 Catch:{ all -> 0x009b }
        r0.remove(r6);	 Catch:{ all -> 0x009b }
        r0 = r5.a;	 Catch:{ all -> 0x009b }
        r0 = r0.a;	 Catch:{ all -> 0x009b }
        r0 = r0.get();	 Catch:{ all -> 0x009b }
        r0 = (defpackage.aajj) r0;	 Catch:{ all -> 0x009b }
        r0 = r0.an();	 Catch:{ all -> 0x009b }
        if (r0 == 0) goto L_0x0099;
    L_0x001a:
        r7 = r7.a;	 Catch:{ all -> 0x009b }
        r0 = defpackage.aahv.h();	 Catch:{ all -> 0x009b }
        r1 = r7.getPath();	 Catch:{ all -> 0x009b }
        r2 = -1;
        if (r1 == 0) goto L_0x0087;
    L_0x0027:
        r3 = "/videoplayback";
        r3 = r1.startsWith(r3);	 Catch:{ all -> 0x009b }
        if (r3 != 0) goto L_0x0038;
    L_0x002f:
        r3 = "/initsegment";
        r3 = r1.startsWith(r3);	 Catch:{ all -> 0x009b }
        if (r3 != 0) goto L_0x0038;
    L_0x0037:
        goto L_0x0087;
    L_0x0038:
        r3 = "itag";
        r7 = r7.getQueryParameter(r3);	 Catch:{ all -> 0x009b }
        r3 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x009b }
        if (r3 != 0) goto L_0x004d;
    L_0x0044:
        r7 = defpackage.aajy.a(r7);	 Catch:{ all -> 0x009b }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x009b }
        goto L_0x008b;
    L_0x004d:
        r7 = 47;
        r7 = defpackage.amqz.a(r7);	 Catch:{ all -> 0x009b }
        r7 = r7.c(r1);	 Catch:{ all -> 0x009b }
        r1 = 0;
    L_0x0058:
        r3 = r7.size();	 Catch:{ all -> 0x009b }
        r3 = r3 + r2;
        if (r1 >= r3) goto L_0x0077;
    L_0x005f:
        r3 = "itag";
        r4 = r7.get(r1);	 Catch:{ all -> 0x009b }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x009b }
        if (r3 == 0) goto L_0x0074;
    L_0x006b:
        r1 = r1 + 1;
        r7 = r7.get(r1);	 Catch:{ all -> 0x009b }
        r7 = (java.lang.String) r7;	 Catch:{ all -> 0x009b }
        goto L_0x0078;
    L_0x0074:
        r1 = r1 + 1;
        goto L_0x0058;
    L_0x0077:
        r7 = 0;
    L_0x0078:
        r1 = android.text.TextUtils.isEmpty(r7);	 Catch:{ all -> 0x009b }
        if (r1 != 0) goto L_0x0082;
    L_0x007e:
        r2 = defpackage.aajy.a(r7);	 Catch:{ all -> 0x009b }
    L_0x0082:
        r7 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x009b }
        goto L_0x008b;
    L_0x0087:
        r7 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x009b }
    L_0x008b:
        r7 = r0.contains(r7);	 Catch:{ all -> 0x009b }
        if (r7 == 0) goto L_0x0092;
    L_0x0091:
        goto L_0x0099;
    L_0x0092:
        r7 = r5.a;	 Catch:{ all -> 0x009b }
        r7 = r7.b;	 Catch:{ all -> 0x009b }
        r7.add(r6);	 Catch:{ all -> 0x009b }
    L_0x0099:
        monitor-exit(r8);	 Catch:{ all -> 0x009b }
        return;
    L_0x009b:
        r6 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x009b }
        goto L_0x009f;
    L_0x009e:
        throw r6;
    L_0x009f:
        goto L_0x009e;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeqp.a(ovi, ovm, boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081 A:{SYNTHETIC, Splitter:B:43:0x0081} */
    public final void b(defpackage.ovi r10, defpackage.ovm r11, boolean r12) {
        /*
        r9 = this;
        r0 = r9.a;
        monitor-enter(r0);
        r1 = r9.a;	 Catch:{ all -> 0x00b6 }
        r1 = r1.b;	 Catch:{ all -> 0x00b6 }
        r1 = r1.contains(r10);	 Catch:{ all -> 0x00b6 }
        if (r1 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r0);	 Catch:{ all -> 0x00b6 }
        return;
    L_0x000f:
        r1 = r10 instanceof defpackage.oeo;	 Catch:{ all -> 0x00b6 }
        if (r1 == 0) goto L_0x00af;
    L_0x0013:
        r1 = r9.a;	 Catch:{ all -> 0x00b6 }
        r1 = r1.a;	 Catch:{ all -> 0x00b6 }
        r1 = r1.get();	 Catch:{ all -> 0x00b6 }
        r1 = (defpackage.aajj) r1;	 Catch:{ all -> 0x00b6 }
        r2 = r1.c;	 Catch:{ all -> 0x00b6 }
        r3 = r2.b;	 Catch:{ all -> 0x00b6 }
        r4 = 131072; // 0x20000 float:1.83671E-40 double:6.47582E-319;
        r3 = r3 & r4;
        r4 = -1;
        if (r3 == 0) goto L_0x007b;
    L_0x0028:
        r2 = r2.G;	 Catch:{ all -> 0x00b6 }
        if (r2 != 0) goto L_0x002e;
    L_0x002c:
        r2 = defpackage.aujb.c;	 Catch:{ all -> 0x00b6 }
    L_0x002e:
        r2 = r2.b;	 Catch:{ all -> 0x00b6 }
        if (r2 != 0) goto L_0x0033;
    L_0x0032:
        goto L_0x007b;
    L_0x0033:
        r2 = r10;
        r2 = (defpackage.oeo) r2;	 Catch:{ all -> 0x00b6 }
        r3 = r1.c;	 Catch:{ all -> 0x00b6 }
        r6 = r3.a;	 Catch:{ all -> 0x00b6 }
        r6 = r6 & 2;
        if (r6 == 0) goto L_0x0047;
    L_0x003e:
        r3 = r3.d;	 Catch:{ all -> 0x00b6 }
        if (r3 != 0) goto L_0x0044;
    L_0x0042:
        r3 = defpackage.arhh.bv;	 Catch:{ all -> 0x00b6 }
    L_0x0044:
        r3 = r3.at;	 Catch:{ all -> 0x00b6 }
        goto L_0x0049;
    L_0x0047:
        r3 = "";
    L_0x0049:
        r6 = android.text.TextUtils.isEmpty(r3);	 Catch:{ IllegalArgumentException -> 0x007b }
        r7 = 0;
        if (r6 != 0) goto L_0x006c;
    L_0x0050:
        r2 = r2.c();	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r2 == 0) goto L_0x006c;
    L_0x0056:
        r2 = r2.get(r3);	 Catch:{ IllegalArgumentException -> 0x007b }
        r2 = (java.util.List) r2;	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r2 == 0) goto L_0x006c;
    L_0x005e:
        r3 = r2.isEmpty();	 Catch:{ IllegalArgumentException -> 0x007b }
        if (r3 != 0) goto L_0x006c;
    L_0x0064:
        r3 = 0;
        r2 = r2.get(r3);	 Catch:{ IllegalArgumentException -> 0x007b }
        r7 = r2;
        r7 = (java.lang.String) r7;	 Catch:{ IllegalArgumentException -> 0x007b }
    L_0x006c:
        if (r7 == 0) goto L_0x007b;
    L_0x006e:
        r2 = java.lang.Long.parseLong(r7);	 Catch:{ IllegalArgumentException -> 0x007b }
        r6 = 0;
        r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r8 <= 0) goto L_0x007b;
    L_0x0078:
        r6 = 3;
        r2 = r2 << r6;
        goto L_0x007c;
    L_0x007b:
        r2 = r4;
    L_0x007c:
        r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r6 != 0) goto L_0x0081;
    L_0x0080:
        goto L_0x00af;
    L_0x0081:
        r11 = r1.c;	 Catch:{ all -> 0x00b6 }
        r12 = r11.a;	 Catch:{ all -> 0x00b6 }
        r12 = r12 & 2;
        r1 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        if (r12 == 0) goto L_0x0094;
    L_0x008b:
        r11 = r11.d;	 Catch:{ all -> 0x00b6 }
        if (r11 != 0) goto L_0x0091;
    L_0x008f:
        r11 = defpackage.arhh.bv;	 Catch:{ all -> 0x00b6 }
    L_0x0091:
        r11 = r11.aL;	 Catch:{ all -> 0x00b6 }
        goto L_0x0096;
    L_0x0094:
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x0096:
        r12 = 0;
        r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1));
        if (r12 > 0) goto L_0x009d;
    L_0x009b:
        r11 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
    L_0x009d:
        r12 = r9.a;	 Catch:{ all -> 0x00b6 }
        r1 = (float) r2;	 Catch:{ all -> 0x00b6 }
        r1 = r1 * r11;
        r1 = (long) r1;	 Catch:{ all -> 0x00b6 }
        r12.a(r1);	 Catch:{ all -> 0x00b6 }
        r11 = r9.a;	 Catch:{ all -> 0x00b6 }
        r11 = r11.b;	 Catch:{ all -> 0x00b6 }
        r11.add(r10);	 Catch:{ all -> 0x00b6 }
        monitor-exit(r0);	 Catch:{ all -> 0x00b6 }
        return;
    L_0x00af:
        r1 = r9.a;	 Catch:{ all -> 0x00b6 }
        r1.b(r10, r11, r12);	 Catch:{ all -> 0x00b6 }
        monitor-exit(r0);	 Catch:{ all -> 0x00b6 }
        return;
    L_0x00b6:
        r10 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00b6 }
        throw r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeqp.b(ovi, ovm, boolean):void");
    }

    public final void a(ovi ovi, ovm ovm, boolean z, int i) {
        synchronized (this.a) {
            if (!this.a.b.contains(ovi)) {
                this.a.a(ovi, ovm, z, i);
            }
        }
    }

    public final void c(ovi ovi, ovm ovm, boolean z) {
        synchronized (this.a) {
            if (!this.a.b.contains(ovi)) {
                this.a.c(ovi, ovm, z);
            }
        }
    }

    /* synthetic */ aeqp(aeqo aeqo) {
        this.a = aeqo;
    }
}
