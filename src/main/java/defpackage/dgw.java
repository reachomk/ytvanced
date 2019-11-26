package defpackage;

import android.os.RemoteException;
import android.view.View;

/* renamed from: dgw */
public final class dgw extends pdt {
    private final pcr o;

    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A:{Catch:{ RemoteException -> 0x00a4 }} */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ba A:{Catch:{ RemoteException -> 0x00cb }} */
    public dgw(defpackage.pcr r9) {
        /*
        r8 = this;
        r0 = "";
        r8.<init>();
        r8.o = r9;
        r1 = 0;
        r2 = r9;
        r2 = (defpackage.rpx) r2;	 Catch:{ RemoteException -> 0x0012 }
        r2 = r2.a;	 Catch:{ RemoteException -> 0x0012 }
        r2 = r2.a();	 Catch:{ RemoteException -> 0x0012 }
        goto L_0x0017;
    L_0x0012:
        r2 = move-exception;
        defpackage.qml.a(r0, r2);
        r2 = r1;
    L_0x0017:
        r8.a = r2;
        r2 = r9;
        r2 = (defpackage.rpx) r2;
        r3 = r2.b;
        r8.b = r3;
        r3 = r9;
        r3 = (defpackage.rpx) r3;	 Catch:{ RemoteException -> 0x002a }
        r3 = r3.a;	 Catch:{ RemoteException -> 0x002a }
        r3 = r3.c();	 Catch:{ RemoteException -> 0x002a }
        goto L_0x002f;
    L_0x002a:
        r3 = move-exception;
        defpackage.qml.a(r0, r3);
        r3 = r1;
    L_0x002f:
        r8.c = r3;
        r3 = r2.c;
        r8.d = r3;
        r3 = r9;
        r3 = (defpackage.rpx) r3;	 Catch:{ RemoteException -> 0x003f }
        r3 = r3.a;	 Catch:{ RemoteException -> 0x003f }
        r3 = r3.e();	 Catch:{ RemoteException -> 0x003f }
        goto L_0x0044;
    L_0x003f:
        r3 = move-exception;
        defpackage.qml.a(r0, r3);
        r3 = r1;
    L_0x0044:
        r8.e = r3;
        r3 = r9;
        r3 = (defpackage.rpx) r3;	 Catch:{ RemoteException -> 0x0050 }
        r3 = r3.a;	 Catch:{ RemoteException -> 0x0050 }
        r3 = r3.f();	 Catch:{ RemoteException -> 0x0050 }
        goto L_0x0055;
    L_0x0050:
        r3 = move-exception;
        defpackage.qml.a(r0, r3);
        r3 = r1;
    L_0x0055:
        r8.f = r3;
        r3 = r9;
        r3 = (defpackage.rpx) r3;	 Catch:{ RemoteException -> 0x006b }
        r3 = r3.a;	 Catch:{ RemoteException -> 0x006b }
        r3 = r3.g();	 Catch:{ RemoteException -> 0x006b }
        r5 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1));
        if (r7 == 0) goto L_0x006f;
    L_0x0066:
        r3 = java.lang.Double.valueOf(r3);	 Catch:{ RemoteException -> 0x006b }
        goto L_0x0070;
    L_0x006b:
        r3 = move-exception;
        defpackage.qml.a(r0, r3);
    L_0x006f:
        r3 = r1;
    L_0x0070:
        r8.g = r3;
        r3 = r9;
        r3 = (defpackage.rpx) r3;	 Catch:{ RemoteException -> 0x007c }
        r3 = r3.a;	 Catch:{ RemoteException -> 0x007c }
        r3 = r3.h();	 Catch:{ RemoteException -> 0x007c }
        goto L_0x0081;
    L_0x007c:
        r3 = move-exception;
        defpackage.qml.a(r0, r3);
        r3 = r1;
    L_0x0081:
        r8.h = r3;
        r3 = r9;
        r3 = (defpackage.rpx) r3;	 Catch:{ RemoteException -> 0x008d }
        r3 = r3.a;	 Catch:{ RemoteException -> 0x008d }
        r3 = r3.i();	 Catch:{ RemoteException -> 0x008d }
        goto L_0x0092;
    L_0x008d:
        r3 = move-exception;
        defpackage.qml.a(r0, r3);
        r3 = r1;
    L_0x0092:
        r8.i = r3;
        r3 = r9;
        r3 = (defpackage.rpx) r3;	 Catch:{ RemoteException -> 0x00a4 }
        r3 = r3.a;	 Catch:{ RemoteException -> 0x00a4 }
        r3 = r3.m();	 Catch:{ RemoteException -> 0x00a4 }
        if (r3 == 0) goto L_0x00a8;
    L_0x009f:
        r1 = defpackage.qct.a(r3);	 Catch:{ RemoteException -> 0x00a4 }
        goto L_0x00a8;
    L_0x00a4:
        r3 = move-exception;
        defpackage.qml.a(r0, r3);
    L_0x00a8:
        r8.k = r1;
        r0 = 1;
        r8.m = r0;
        r8.n = r0;
        r0 = r9;
        r0 = (defpackage.rpx) r0;	 Catch:{ RemoteException -> 0x00cb }
        r0 = r0.a;	 Catch:{ RemoteException -> 0x00cb }
        r0 = r0.j();	 Catch:{ RemoteException -> 0x00cb }
        if (r0 == 0) goto L_0x00d1;
    L_0x00ba:
        r0 = r9;
        r0 = (defpackage.rpx) r0;	 Catch:{ RemoteException -> 0x00cb }
        r0 = r0.d;	 Catch:{ RemoteException -> 0x00cb }
        r9 = (defpackage.rpx) r9;	 Catch:{ RemoteException -> 0x00cb }
        r9 = r9.a;	 Catch:{ RemoteException -> 0x00cb }
        r9 = r9.j();	 Catch:{ RemoteException -> 0x00cb }
        r0.a(r9);	 Catch:{ RemoteException -> 0x00cb }
        goto L_0x00d1;
    L_0x00cb:
        r9 = move-exception;
        r0 = "Exception occurred while getting video controller";
        defpackage.qml.a(r0, r9);
    L_0x00d1:
        r9 = r2.d;
        r8.j = r9;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgw.<init>(pcr):void");
    }

    public final void a(View view) {
        if (view instanceof pct) {
            try {
                this.o.a();
                ros ros = null;
                ros.a();
            } catch (RemoteException e) {
                qml.a("Unable to call setNativeAd on delegate", e);
            }
        } else if (((pck) pck.a.get(view)) != null) {
            this.o.a();
            throw new NoSuchMethodError();
        }
    }
}
