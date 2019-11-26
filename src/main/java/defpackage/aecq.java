package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: aecq */
public final class aecq {
    public Context a;
    public Executor b;
    public String c;
    public zyw d;
    public bcaa e;
    public afjj f;
    public xax g;
    public Executor h;
    public xgv i;
    public xti j;

    /* Access modifiers changed, original: final */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008f A:{Catch:{ all -> 0x00f1 }} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c9 A:{Catch:{ all -> 0x00f1 }} */
    public final defpackage.bciz a(boolean r8) {
        /*
        r7 = this;
        r0 = r7.j;
        r1 = 0;
        r2 = "disable_native_cronet";
        r0 = r0.a(r2, r1);
        r2 = 0;
        if (r0 != 0) goto L_0x00f9;
    L_0x000c:
        r0 = new bcjk;
        r3 = r7.a;
        r0.<init>(r3);
        r0.a(r8);
        r0.b(r1);
        r8 = 443; // 0x1bb float:6.21E-43 double:2.19E-321;
        r3 = "foo.googlevideo.com";
        r0.a(r3, r8, r8);
        r3 = "foo.c.youtube.com";
        r0.a(r3, r8, r8);
        r8 = new aecp;
        r8.<init>(r7);
        r0.a(r8);
        r8 = r7.d;
        r8 = r8.a();
        r8 = defpackage.aekx.a(r8);
        r3 = 1;
        if (r8 == 0) goto L_0x0055;
    L_0x003a:
        r4 = r8.c;
        if (r4 != 0) goto L_0x0040;
    L_0x003e:
        r4 = defpackage.aotb.d;
    L_0x0040:
        r4 = r4.a;
        r4 = r4 & r3;
        if (r4 != 0) goto L_0x0046;
    L_0x0045:
        goto L_0x0055;
    L_0x0046:
        r8 = r8.c;
        if (r8 != 0) goto L_0x004c;
    L_0x004a:
        r8 = defpackage.aotb.d;
    L_0x004c:
        r8 = r8.b;
        if (r8 != 0) goto L_0x0052;
    L_0x0050:
        r8 = defpackage.aosv.d;
    L_0x0052:
        r8 = r8.b;
        goto L_0x0056;
    L_0x0055:
        r8 = r2;
    L_0x0056:
        r4 = android.text.TextUtils.isEmpty(r8);
        if (r4 != 0) goto L_0x005f;
    L_0x005c:
        r0.a(r8);
    L_0x005f:
        r8 = r7.c;
        r4 = "76.0.3786.0";
        r4.length();
        r4 = "(\\(Linux; (U|N|I); Android.+?)\\)";
        r5 = "$1; Cronet/76.0.3786.0)";
        r8 = r8.replaceFirst(r4, r5);
        r0.b(r8);
        r8 = r0.a();	 Catch:{ all -> 0x00f1 }
        r8 = (defpackage.bcjh) r8;	 Catch:{ all -> 0x00f1 }
        if (r8 == 0) goto L_0x008d;
    L_0x0079:
        r0 = r8.a();	 Catch:{ all -> 0x00f1 }
        r4 = "CronetHttpURLConnection/";
        r0 = r0.startsWith(r4);	 Catch:{ all -> 0x00f1 }
        if (r0 == 0) goto L_0x008d;
    L_0x0085:
        r8 = defpackage.afpf.media;	 Catch:{ all -> 0x00f1 }
        r0 = "Ignoring JavaCronetEngine";
        defpackage.afpc.a(r3, r8, r0);	 Catch:{ all -> 0x00f1 }
        return r2;
    L_0x008d:
        if (r8 == 0) goto L_0x00c7;
    L_0x008f:
        r0 = r7.d;	 Catch:{ all -> 0x00f1 }
        r0 = r0.a();	 Catch:{ all -> 0x00f1 }
        r0 = defpackage.aekx.b(r0);	 Catch:{ all -> 0x00f1 }
        if (r0 != 0) goto L_0x009c;
    L_0x009b:
        goto L_0x00c7;
    L_0x009c:
        r0 = r0.b;	 Catch:{ all -> 0x00f1 }
        if (r0 == 0) goto L_0x00c7;
    L_0x00a0:
        r0 = r7.b;	 Catch:{ all -> 0x00f1 }
        r4 = r7.e;	 Catch:{ all -> 0x00f1 }
        r4 = r4.get();	 Catch:{ all -> 0x00f1 }
        r4 = (defpackage.aelx) r4;	 Catch:{ all -> 0x00f1 }
        r5 = r7.f;	 Catch:{ all -> 0x00f1 }
        r6 = r7.d;	 Catch:{ all -> 0x00f1 }
        r6 = r6.a();	 Catch:{ all -> 0x00f1 }
        r6 = defpackage.aekx.b(r6);	 Catch:{ all -> 0x00f1 }
        if (r6 != 0) goto L_0x00b9;
    L_0x00b8:
        goto L_0x00bf;
    L_0x00b9:
        r6 = r6.c;	 Catch:{ all -> 0x00f1 }
        if (r6 != 0) goto L_0x00be;
    L_0x00bd:
        goto L_0x00bf;
    L_0x00be:
        r1 = 1;
    L_0x00bf:
        r6 = new aenb;	 Catch:{ all -> 0x00f1 }
        r6.<init>(r0, r4, r5, r1);	 Catch:{ all -> 0x00f1 }
        r8.a(r6);	 Catch:{ all -> 0x00f1 }
    L_0x00c7:
        if (r8 == 0) goto L_0x00f0;
    L_0x00c9:
        r0 = r7.g;	 Catch:{ all -> 0x00f1 }
        r1 = r0.b();	 Catch:{ all -> 0x00f1 }
        if (r1 == 0) goto L_0x00f0;
    L_0x00d1:
        r0 = r0.b();	 Catch:{ all -> 0x00f1 }
        r0 = r0.d;	 Catch:{ all -> 0x00f1 }
        if (r0 != 0) goto L_0x00db;
    L_0x00d9:
        r0 = defpackage.aydk.o;	 Catch:{ all -> 0x00f1 }
    L_0x00db:
        r0 = r0.k;	 Catch:{ all -> 0x00f1 }
        if (r0 != 0) goto L_0x00e0;
    L_0x00df:
        goto L_0x00f0;
    L_0x00e0:
        r0 = r7.i;	 Catch:{ all -> 0x00f1 }
        if (r0 == 0) goto L_0x00f0;
    L_0x00e4:
        r1 = r7.h;	 Catch:{ all -> 0x00f1 }
        if (r1 == 0) goto L_0x00f0;
    L_0x00e8:
        r4 = new xih;	 Catch:{ all -> 0x00f1 }
        r4.<init>(r0, r1);	 Catch:{ all -> 0x00f1 }
        r8.a(r4);	 Catch:{ all -> 0x00f1 }
    L_0x00f0:
        return r8;
    L_0x00f1:
        r8 = move-exception;
        r0 = defpackage.afpf.media;
        r1 = "Unable to build CronetEngine";
        defpackage.afpc.a(r3, r0, r1, r8);
    L_0x00f9:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aecq.a(boolean):bciz");
    }
}
