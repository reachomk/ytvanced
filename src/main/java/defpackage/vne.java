package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: vne */
public final class vne extends vnd {
    private final bapu f;
    private final SharedPreferences g;
    private final long h;
    private vnh i;

    /* Access modifiers changed, original: protected|final */
    public final vnf g() {
        if (this.i == null) {
            SharedPreferences sharedPreferences = this.g;
            vnh a = vnh.a(sharedPreferences.getString("last_ad_signals_adid", null), sharedPreferences.getBoolean("last_ad_signals_lat", false), sharedPreferences.getLong("last_ad_signals_timestamp", 0), sharedPreferences.getString("last_ad_signals_identity", null));
            if (a != null) {
                a.e = true;
            }
            this.i = a;
            if (!a(this.i)) {
                this.i = null;
                vnh.a(this.g, null);
            }
        }
        return this.e;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(String str, String str2) {
        super.a(str, str2);
        if (TextUtils.isEmpty(str)) {
            this.i = null;
        }
        vnh.a(this.g, this.i);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(vnf vnf, long j) {
        return super.a(vnf, j) && a(this.i);
    }

    private final boolean a(vnh vnh) {
        if (vnh == null) {
            return false;
        }
        if (this.h != -1) {
            return vnd.a(vnh.c, this.d.a(), this.h) && b(vnh.d);
        } else {
            return true;
        }
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056 A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0048 A:{Catch:{ Exception -> 0x0057 }} */
    public final int e() {
        /*
        r6 = this;
        r0 = r6.i;	 Catch:{ Exception -> 0x0057 }
        r1 = 0;
        if (r0 != 0) goto L_0x003e;
    L_0x0005:
        r0 = r6.f;	 Catch:{ Exception -> 0x0057 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0057 }
        r0 = (defpackage.tax) r0;	 Catch:{ Exception -> 0x0057 }
        r2 = r6.a;	 Catch:{ Exception -> 0x0057 }
        r0 = r0.a(r2);	 Catch:{ Exception -> 0x0057 }
        if (r0 == 0) goto L_0x003b;
    L_0x0015:
        r2 = r0.a();	 Catch:{ Exception -> 0x0057 }
        r2 = android.text.TextUtils.isEmpty(r2);	 Catch:{ Exception -> 0x0057 }
        if (r2 != 0) goto L_0x0038;
    L_0x001f:
        r2 = r6.d;	 Catch:{ Exception -> 0x0057 }
        r2 = r2.a();	 Catch:{ Exception -> 0x0057 }
        r4 = r6.h();	 Catch:{ Exception -> 0x0057 }
        r5 = r0.a();	 Catch:{ Exception -> 0x0057 }
        r0 = r0.b();	 Catch:{ Exception -> 0x0057 }
        r0 = defpackage.vnh.a(r5, r0, r2, r4);	 Catch:{ Exception -> 0x0057 }
        r6.i = r0;	 Catch:{ Exception -> 0x0057 }
        goto L_0x003e;
    L_0x0038:
        r0 = 17;
        goto L_0x0046;
    L_0x003b:
        r0 = 16;
        goto L_0x0046;
    L_0x003e:
        r0 = r6.i;	 Catch:{ Exception -> 0x0057 }
        if (r0 == 0) goto L_0x0044;
    L_0x0042:
        r0 = 0;
        goto L_0x0046;
    L_0x0044:
        r0 = 18;
    L_0x0046:
        if (r0 != 0) goto L_0x0056;
    L_0x0048:
        r0 = r6.b;	 Catch:{ Exception -> 0x0057 }
        r0 = r0.get();	 Catch:{ Exception -> 0x0057 }
        r0 = (defpackage.tas) r0;	 Catch:{ Exception -> 0x0057 }
        r2 = r6.i;	 Catch:{ Exception -> 0x0057 }
        r0.a(r2);	 Catch:{ Exception -> 0x0057 }
        return r1;
    L_0x0056:
        return r0;
    L_0x0057:
        r0 = move-exception;
        r1 = r0 instanceof defpackage.tau;
        if (r1 != 0) goto L_0x007b;
    L_0x005c:
        r1 = r0 instanceof android.os.RemoteException;
        if (r1 != 0) goto L_0x0078;
    L_0x0060:
        r1 = r0 instanceof defpackage.tei;
        if (r1 != 0) goto L_0x0075;
    L_0x0064:
        r1 = r0 instanceof java.io.IOException;
        if (r1 != 0) goto L_0x0072;
    L_0x0068:
        r0 = r0 instanceof defpackage.tej;
        if (r0 != 0) goto L_0x006f;
    L_0x006c:
        r0 = 13;
        goto L_0x007d;
    L_0x006f:
        r0 = 22;
        return r0;
    L_0x0072:
        r0 = 24;
        goto L_0x007d;
    L_0x0075:
        r0 = 23;
        goto L_0x007d;
    L_0x0078:
        r0 = 21;
        goto L_0x007d;
    L_0x007b:
        r0 = 20;
    L_0x007d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vne.e():int");
    }

    vne(Context context, String str, aoqb aoqb, String str2, String str3, tar tar, bapu bapu, xsc xsc, long j, long j2, SharedPreferences sharedPreferences, afpu afpu, boolean z, boolean z2, int i) {
        long j3 = j2;
        super(context, str, aoqb, str2, str3, tar, xsc, j, afpu, z, z2, i);
        this.f = (bapu) amqw.a((Object) bapu);
        this.g = (SharedPreferences) amqw.a((Object) sharedPreferences);
        boolean z3 = true;
        long j4 = j2;
        if (j4 != -1 && j4 < 0) {
            z3 = false;
        }
        amqw.b(z3);
        this.h = j4;
    }
}
