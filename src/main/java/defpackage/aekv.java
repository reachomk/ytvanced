package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: aekv */
public final class aekv implements ovx {
    private final ovx a;
    private final xhv b;
    private final aajj c;
    private final afhi d;
    private Exception e;
    private boolean f;
    private boolean g;
    private Uri h;
    private int j;

    public aekv(ovx ovx, xhv xhv, aajj aajj, afhi afhi) {
        this.a = (ovx) amqw.a((Object) ovx);
        this.b = (xhv) amqw.a((Object) xhv);
        this.c = (aajj) amqw.a((Object) aajj);
        this.d = (afhi) amqw.a((Object) afhi);
    }

    public final void a(owt owt) {
        this.a.a(owt);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    public final long a(defpackage.ovm r7) {
        /*
        r6 = this;
        r0 = r6.c;
        r0 = r0.c;
        r1 = r0.a;
        r1 = r1 & 2;
        if (r1 == 0) goto L_0x001e;
    L_0x000a:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0010;
    L_0x000e:
        r0 = defpackage.arhh.bv;
    L_0x0010:
        r0 = r0.aE;
        if (r0 != 0) goto L_0x0015;
    L_0x0014:
        goto L_0x001e;
    L_0x0015:
        r0 = r7.a;
        r1 = r6.h;
        r0 = defpackage.aeky.a(r0, r1);
        goto L_0x0026;
    L_0x001e:
        r0 = r7.a;
        r1 = r6.h;
        r0 = r0.equals(r1);
    L_0x0026:
        r1 = 0;
        if (r0 == 0) goto L_0x002a;
    L_0x0029:
        goto L_0x0043;
    L_0x002a:
        r0 = r6.e;
        if (r0 == 0) goto L_0x0036;
    L_0x002e:
        r0 = r0.getCause();
        r0 = r0 instanceof java.net.SocketTimeoutException;
        if (r0 != 0) goto L_0x003f;
    L_0x0036:
        r0 = 0;
        r6.e = r0;
        r6.f = r1;
        r6.g = r1;
        r6.j = r1;
    L_0x003f:
        r0 = r7.a;
        r6.h = r0;
    L_0x0043:
        r0 = r6.c;
        r0 = r0.c;
        r2 = r0.a;
        r2 = r2 & 2;
        if (r2 == 0) goto L_0x00ca;
    L_0x004d:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0053;
    L_0x0051:
        r0 = defpackage.arhh.bv;
    L_0x0053:
        r0 = r0.ap;
        if (r0 == 0) goto L_0x00ca;
    L_0x0057:
        r0 = r6.j;
        r2 = r6.c;
        r2 = r2.c;
        r3 = r2.a;
        r3 = r3 & 2;
        if (r3 == 0) goto L_0x006c;
    L_0x0063:
        r2 = r2.d;
        if (r2 != 0) goto L_0x0069;
    L_0x0067:
        r2 = defpackage.arhh.bv;
    L_0x0069:
        r2 = r2.ar;
        goto L_0x006d;
    L_0x006c:
        r2 = 0;
    L_0x006d:
        if (r0 <= r2) goto L_0x00ca;
    L_0x006f:
        r0 = r6.g;
        if (r0 == 0) goto L_0x0074;
    L_0x0073:
        goto L_0x00ca;
    L_0x0074:
        r0 = r7.a;
        r1 = r0.getAuthority();
        r2 = r0.buildUpon();
        r3 = "redirector.googlevideo.com";
        r2 = r2.authority(r3);
        r3 = "a1.googlevideo.com";
        r3 = r1.endsWith(r3);
        r4 = "pf=1";
        r5 = "cmo";
        if (r3 == 0) goto L_0x009f;
    L_0x0090:
        r0 = r2.appendQueryParameter(r5, r4);
        r1 = "td=a1.googlevideo.com";
        r0 = r0.appendQueryParameter(r5, r1);
        r0 = r0.build();
        goto L_0x00c2;
    L_0x009f:
        r3 = "googlevideo.com";
        r3 = r1.endsWith(r3);
        if (r3 == 0) goto L_0x00b0;
    L_0x00a7:
        r0 = r2.appendQueryParameter(r5, r4);
        r0 = r0.build();
        goto L_0x00c2;
    L_0x00b0:
        r3 = "c.youtube.com";
        r1 = r1.endsWith(r3);
        if (r1 == 0) goto L_0x00c2;
    L_0x00b8:
        r0 = "td=c.youtube.com";
        r0 = r2.appendQueryParameter(r5, r0);
        r0 = r0.build();
    L_0x00c2:
        r7 = r7.a(r0);
        r0 = 1;
        r6.f = r0;
        goto L_0x00cc;
    L_0x00ca:
        r6.f = r1;
    L_0x00cc:
        r0 = r6.a;	 Catch:{ owb -> 0x00e1 }
        r0 = r0.a(r7);	 Catch:{ owb -> 0x00e1 }
        r7 = r6.d;	 Catch:{ owb -> 0x00e1 }
        r2 = r6.a;	 Catch:{ owb -> 0x00e1 }
        r2 = r2.c();	 Catch:{ owb -> 0x00e1 }
        r7.a(r2);	 Catch:{ owb -> 0x00e1 }
        r6.e();	 Catch:{ owb -> 0x00e1 }
        return r0;
    L_0x00e1:
        r7 = move-exception;
        r6.a(r7);
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aekv.a(ovm):long");
    }

    public final void a() {
        try {
            this.a.a();
        } catch (owb e) {
            throw e;
        }
    }

    public final int a(byte[] bArr, int i, int i2) {
        try {
            int a = this.a.a(bArr, i, i2);
            e();
            return a;
        } catch (owb e) {
            a(e);
            throw e;
        }
    }

    public final void a(String str, String str2) {
        this.a.a(str, str2);
    }

    public final void d() {
        this.a.d();
    }

    public final Map c() {
        return this.a.c();
    }

    public final Uri b() {
        return this.a.b();
    }

    private final void a(owb owb) {
        if (this.b.c()) {
            if (this.f) {
                this.g = true;
            } else {
                this.e = owb;
                this.j++;
            }
        }
    }

    private final void e() {
        if (!this.f) {
            this.j = 0;
        }
    }
}
