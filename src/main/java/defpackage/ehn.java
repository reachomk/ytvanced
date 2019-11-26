package defpackage;

/* renamed from: ehn */
public final class ehn implements xcp {
    private atwo[] a;
    private final bcaa b;
    private final bcaa c;
    private final wld d;
    private final ggc e;
    private final ehs f;

    public ehn(bcaa bcaa, bcaa bcaa2, ehs ehs, wld wld, ggc ggc) {
        this.b = bcaa;
        this.c = bcaa2;
        this.f = ehs;
        this.d = wld;
        this.e = ggc;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0253 A:{SYNTHETIC} */
    public final void a(java.lang.String r13, defpackage.ehp r14) {
        /*
        r12 = this;
        r0 = new android.os.Bundle;
        r0.<init>();
        r1 = r12.a;
        r2 = 0;
        if (r1 == 0) goto L_0x0024;
    L_0x000a:
        r3 = r1.length;
        r4 = 0;
    L_0x000c:
        if (r4 >= r3) goto L_0x0024;
    L_0x000e:
        r5 = r1[r4];
        r6 = r5.d;
        r7 = r5.b;
        r8 = 2;
        if (r7 != r8) goto L_0x001c;
    L_0x0017:
        r5 = r5.c;
        r5 = (java.lang.String) r5;
        goto L_0x001e;
    L_0x001c:
        r5 = "";
    L_0x001e:
        r0.putString(r6, r5);
        r4 = r4 + 1;
        goto L_0x000c;
    L_0x0024:
        r1 = r12.c;
        r1 = r1.get();
        r1 = (defpackage.amcr) r1;
        r3 = 0;
        r4 = new java.util.ArrayList;	 Catch:{ alzc -> 0x008f }
        r5 = r1.b;	 Catch:{ alzc -> 0x008f }
        r5 = r5.b();	 Catch:{ alzc -> 0x008f }
        r5 = r5.values();	 Catch:{ alzc -> 0x008f }
        r4.<init>(r5);	 Catch:{ alzc -> 0x008f }
        r5 = r1.a;
        r5 = r5.c();
        if (r5 == 0) goto L_0x0095;
    L_0x0044:
        r6 = defpackage.afpt.g;
        if (r5 == r6) goto L_0x0095;
    L_0x0048:
        r5 = r5.a();
        if (r5 != 0) goto L_0x0054;
    L_0x004e:
        r4 = "Cannot get user identity id.";
        defpackage.xtl.c(r4);
        goto L_0x0095;
    L_0x0054:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r7 = r4.size();
        r8 = 0;
    L_0x005e:
        if (r8 < r7) goto L_0x007a;
    L_0x0060:
        r4 = new amby;
        r4.<init>();
        java.util.Collections.sort(r6, r4);
        java.util.Collections.reverse(r6);
        r4 = r6.size();
        r5 = 10;
        if (r4 <= r5) goto L_0x0078;
    L_0x0073:
        r4 = r6.subList(r2, r5);
        goto L_0x0096;
    L_0x0078:
        r4 = r6;
        goto L_0x0096;
    L_0x007a:
        r9 = r4.get(r8);
        r9 = (defpackage.amea) r9;
        r10 = r9.c;
        r10 = r5.equals(r10);
        if (r10 != 0) goto L_0x0089;
    L_0x0088:
        goto L_0x008c;
    L_0x0089:
        r6.add(r9);
    L_0x008c:
        r8 = r8 + 1;
        goto L_0x005e;
    L_0x008f:
        r4 = move-exception;
        r5 = "Error while querying upload jobs from JobStorage";
        defpackage.xtl.a(r5, r4);
    L_0x0095:
        r4 = r3;
    L_0x0096:
        if (r4 != 0) goto L_0x009a;
    L_0x0098:
        goto L_0x022b;
    L_0x009a:
        r4 = r4.iterator();
        r5 = 0;
    L_0x009f:
        r6 = r4.hasNext();
        if (r6 == 0) goto L_0x0191;
    L_0x00a5:
        r6 = r4.next();
        r6 = (defpackage.amea) r6;
        r6 = r6.toBuilder();
        r6 = (defpackage.anxo) r6;
        r6 = (defpackage.amdz) r6;
        r6.copyOnWrite();
        r7 = r6.instance;
        r7 = (defpackage.amea) r7;
        r8 = r7.a;
        r8 = r8 & -2;
        r7.a = r8;
        r8 = defpackage.amea.U;
        r8 = r8.c;
        r7.c = r8;
        r6.copyOnWrite();
        r7 = r6.instance;
        r7 = (defpackage.amea) r7;
        r7.f = r3;
        r8 = r7.a;
        r8 = r8 & -9;
        r7.a = r8;
        r6.copyOnWrite();
        r7 = r6.instance;
        r7 = (defpackage.amea) r7;
        r8 = r7.a;
        r8 = r8 & -257;
        r7.a = r8;
        r8 = defpackage.amea.U;
        r8 = r8.i;
        r7.i = r8;
        r6 = r6.build();
        r6 = (defpackage.anxl) r6;
        r6 = (defpackage.amea) r6;
        r7 = r6.g;
        r8 = java.lang.String.valueOf(r7);
        r8 = r8.length();
        r9 = new java.lang.StringBuilder;
        r8 = r8 + 14;
        r9.<init>(r8);
        r8 = "frontend_id: ";
        r9.append(r8);
        r9.append(r7);
        r7 = "\n";
        r9.append(r7);
        r7 = r9.toString();
        r7 = java.lang.String.valueOf(r7);
        r8 = r6.G;
        r9 = r7.length();
        r10 = java.lang.String.valueOf(r8);
        r10 = r10.length();
        r11 = new java.lang.StringBuilder;
        r9 = r9 + 11;
        r9 = r9 + r10;
        r11.<init>(r9);
        r11.append(r7);
        r7 = "video_id: ";
        r11.append(r7);
        r11.append(r8);
        r7 = "\n";
        r11.append(r7);
        r7 = r11.toString();
        r7 = java.lang.String.valueOf(r7);
        r6 = r6.toByteArray();
        r6 = android.util.Base64.encodeToString(r6, r2);
        r8 = r7.length();
        r9 = java.lang.String.valueOf(r6);
        r9 = r9.length();
        r10 = new java.lang.StringBuilder;
        r8 = r8 + 8;
        r8 = r8 + r9;
        r10.<init>(r8);
        r10.append(r7);
        r7 = "base64: ";
        r10.append(r7);
        r10.append(r6);
        r6 = r10.toString();
        r7 = r5 + 1;
        r8 = new java.lang.StringBuilder;
        r9 = 22;
        r8.<init>(r9);
        r9 = "upload_job_";
        r8.append(r9);
        r8.append(r5);
        r5 = r8.toString();
        r0.putString(r5, r6);
        r5 = java.lang.String.valueOf(r6);
        r5.length();
        r5 = r7;
        goto L_0x009f;
    L_0x0191:
        r3 = defpackage.atlx.H;
        r3 = r3.createBuilder();
        r3 = (defpackage.atlz) r3;
        r1 = r1.c;	 Catch:{ anyg -> 0x01fd }
        r1 = r1.toByteArray();	 Catch:{ anyg -> 0x01fd }
        r4 = defpackage.anxa.c();	 Catch:{ anyg -> 0x01fd }
        r3.mergeFrom(r1, r4);	 Catch:{ anyg -> 0x01fd }
        r3.copyOnWrite();
        r1 = r3.instance;
        r1 = (defpackage.atlx) r1;
        r4 = defpackage.anxl.emptyLongList();
        r1.q = r4;
        r3.copyOnWrite();
        r1 = r3.instance;
        r1 = (defpackage.atlx) r1;
        r4 = defpackage.anxl.emptyLongList();
        r1.r = r4;
        r3.copyOnWrite();
        r1 = r3.instance;
        r1 = (defpackage.atlx) r1;
        r4 = defpackage.anxl.emptyLongList();
        r1.e = r4;
        r3.copyOnWrite();
        r1 = r3.instance;
        r1 = (defpackage.atlx) r1;
        r4 = defpackage.anxl.emptyLongList();
        r1.p = r4;
        r3.copyOnWrite();
        r1 = r3.instance;
        r1 = (defpackage.atlx) r1;
        r4 = defpackage.anxl.emptyLongList();
        r1.t = r4;
        r3.copyOnWrite();
        r1 = r3.instance;
        r1 = (defpackage.atlx) r1;
        r4 = defpackage.anxl.emptyLongList();
        r1.s = r4;
        r1 = r3.build();
        r1 = (defpackage.anxl) r1;
        r1 = (defpackage.atlx) r1;
        goto L_0x0205;
    L_0x01fd:
        r1 = move-exception;
        r3 = "Exception while cloning";
        defpackage.xtl.a(r3, r1);
        r1 = defpackage.atlx.H;
    L_0x0205:
        r3 = r1.toByteArray();
        r2 = android.util.Base64.encodeToString(r3, r2);
        r3 = "upload_config";
        r0.putString(r3, r2);
        r2 = "upload_config:\n";
        r1 = r1.toString();
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 != 0) goto L_0x0228;
    L_0x0222:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x022b;
    L_0x0228:
        r2.concat(r1);
    L_0x022b:
        r1 = r12.d;
        r1 = r1.a;
        if (r1 == 0) goto L_0x0238;
    L_0x0231:
        r1 = "has_viewed_community_posts_on_home";
        r2 = "YES";
        r0.putString(r1, r2);
    L_0x0238:
        r1 = r12.e;
        r1 = r1.a;
        if (r1 == 0) goto L_0x0245;
    L_0x023e:
        r1 = "has_viewed_stories_on_home";
        r2 = "YES";
        r0.putString(r1, r2);
    L_0x0245:
        if (r13 != 0) goto L_0x0248;
    L_0x0247:
        goto L_0x0266;
    L_0x0248:
        r1 = "yt_android_watch";
        r13 = r13.equals(r1);
        if (r13 == 0) goto L_0x0266;
    L_0x0250:
        r13 = r12.f;
        monitor-enter(r13);
        r1 = "CPN";
        r2 = r13.b;	 Catch:{ all -> 0x0263 }
        r0.putString(r1, r2);	 Catch:{ all -> 0x0263 }
        r1 = "video_id";
        r2 = r13.c;	 Catch:{ all -> 0x0263 }
        r0.putString(r1, r2);	 Catch:{ all -> 0x0263 }
        monitor-exit(r13);	 Catch:{ all -> 0x0263 }
        goto L_0x0266;
    L_0x0263:
        r14 = move-exception;
        monitor-exit(r13);	 Catch:{ all -> 0x0263 }
        throw r14;
    L_0x0266:
        r13 = r12.b;
        r13 = r13.get();
        r13 = (defpackage.adef) r13;
        r14.getClass();
        r1 = new ehq;
        r1.<init>(r14);
        r13.a(r0, r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehn.a(java.lang.String, ehp):void");
    }

    public final void a(ehp ehp) {
        a(null, ehp);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aaks.class};
        } else if (i == 0) {
            this.a = ((aaks) obj).a;
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
