package defpackage;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

@qlp
/* renamed from: rpx */
public final class rpx extends pcr {
    public final rpv a;
    public final List b = new ArrayList();
    public final rop c;
    public final pbl d = new pbl();
    private final List e = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:59:0x0029 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053 A:{Catch:{ RemoteException -> 0x005e }} */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x006e A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0099 A:{Catch:{ RemoteException -> 0x00a4 }} */
    public rpx(defpackage.rpv r6) {
        /*
        r5 = this;
        r0 = "";
        r5.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r5.b = r1;
        r1 = new pbl;
        r1.<init>();
        r5.d = r1;
        r1 = new java.util.ArrayList;
        r1.<init>();
        r5.e = r1;
        r5.a = r6;
        r6 = 0;
        r1 = r5.a;	 Catch:{ RemoteException -> 0x005e }
        r1 = r1.b();	 Catch:{ RemoteException -> 0x005e }
        if (r1 == 0) goto L_0x0062;
    L_0x0025:
        r1 = r1.iterator();	 Catch:{ RemoteException -> 0x005e }
    L_0x0029:
        r2 = r1.hasNext();	 Catch:{ RemoteException -> 0x005e }
        if (r2 == 0) goto L_0x0062;
    L_0x002f:
        r2 = r1.next();	 Catch:{ RemoteException -> 0x005e }
        r3 = r2 instanceof android.os.IBinder;	 Catch:{ RemoteException -> 0x005e }
        if (r3 == 0) goto L_0x0050;
    L_0x0037:
        r2 = (android.os.IBinder) r2;	 Catch:{ RemoteException -> 0x005e }
        if (r2 == 0) goto L_0x0050;
    L_0x003b:
        r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage";
        r3 = r2.queryLocalInterface(r3);	 Catch:{ RemoteException -> 0x005e }
        r4 = r3 instanceof defpackage.roo;	 Catch:{ RemoteException -> 0x005e }
        if (r4 == 0) goto L_0x0049;
    L_0x0045:
        r2 = r3;
        r2 = (defpackage.roo) r2;	 Catch:{ RemoteException -> 0x005e }
        goto L_0x0051;
    L_0x0049:
        r3 = new roq;	 Catch:{ RemoteException -> 0x005e }
        r3.<init>(r2);	 Catch:{ RemoteException -> 0x005e }
        r2 = r3;
        goto L_0x0051;
    L_0x0050:
        r2 = r6;
    L_0x0051:
        if (r2 == 0) goto L_0x0029;
    L_0x0053:
        r3 = r5.b;	 Catch:{ RemoteException -> 0x005e }
        r4 = new rop;	 Catch:{ RemoteException -> 0x005e }
        r4.<init>(r2);	 Catch:{ RemoteException -> 0x005e }
        r3.add(r4);	 Catch:{ RemoteException -> 0x005e }
        goto L_0x0029;
    L_0x005e:
        r1 = move-exception;
        defpackage.qml.a(r0, r1);
    L_0x0062:
        r1 = r5.a;	 Catch:{ RemoteException -> 0x00a4 }
        r1 = r1.n();	 Catch:{ RemoteException -> 0x00a4 }
        if (r1 == 0) goto L_0x00a8;
    L_0x006a:
        r1 = r1.iterator();	 Catch:{ RemoteException -> 0x00a4 }
    L_0x006e:
        r2 = r1.hasNext();	 Catch:{ RemoteException -> 0x00a4 }
        if (r2 == 0) goto L_0x00a8;
    L_0x0074:
        r2 = r1.next();	 Catch:{ RemoteException -> 0x00a4 }
        r3 = r2 instanceof android.os.IBinder;	 Catch:{ RemoteException -> 0x00a4 }
        if (r3 == 0) goto L_0x0096;
    L_0x007c:
        r2 = (android.os.IBinder) r2;	 Catch:{ RemoteException -> 0x00a4 }
        if (r2 != 0) goto L_0x0081;
    L_0x0080:
        goto L_0x0096;
    L_0x0081:
        r3 = "com.google.android.gms.ads.internal.client.IMuteThisAdReason";
        r3 = r2.queryLocalInterface(r3);	 Catch:{ RemoteException -> 0x00a4 }
        r4 = r3 instanceof defpackage.rms;	 Catch:{ RemoteException -> 0x00a4 }
        if (r4 == 0) goto L_0x008f;
    L_0x008b:
        r2 = r3;
        r2 = (defpackage.rms) r2;	 Catch:{ RemoteException -> 0x00a4 }
        goto L_0x0097;
    L_0x008f:
        r3 = new rmr;	 Catch:{ RemoteException -> 0x00a4 }
        r3.<init>(r2);	 Catch:{ RemoteException -> 0x00a4 }
        r2 = r3;
        goto L_0x0097;
    L_0x0096:
        r2 = r6;
    L_0x0097:
        if (r2 == 0) goto L_0x006e;
    L_0x0099:
        r3 = r5.e;	 Catch:{ RemoteException -> 0x00a4 }
        r4 = new rmu;	 Catch:{ RemoteException -> 0x00a4 }
        r4.<init>(r2);	 Catch:{ RemoteException -> 0x00a4 }
        r3.add(r4);	 Catch:{ RemoteException -> 0x00a4 }
        goto L_0x006e;
    L_0x00a4:
        r1 = move-exception;
        defpackage.qml.a(r0, r1);
    L_0x00a8:
        r1 = r5.a;	 Catch:{ RemoteException -> 0x00b7 }
        r1 = r1.d();	 Catch:{ RemoteException -> 0x00b7 }
        if (r1 == 0) goto L_0x00bb;
    L_0x00b0:
        r2 = new rop;	 Catch:{ RemoteException -> 0x00b7 }
        r2.<init>(r1);	 Catch:{ RemoteException -> 0x00b7 }
        r6 = r2;
        goto L_0x00bb;
    L_0x00b7:
        r1 = move-exception;
        defpackage.qml.a(r0, r1);
    L_0x00bb:
        r5.c = r6;
        r6 = r5.a;	 Catch:{ RemoteException -> 0x00d1 }
        r6 = r6.k();	 Catch:{ RemoteException -> 0x00d1 }
        if (r6 == 0) goto L_0x00d0;
    L_0x00c5:
        r6 = new rol;	 Catch:{ RemoteException -> 0x00d1 }
        r1 = r5.a;	 Catch:{ RemoteException -> 0x00d1 }
        r1 = r1.k();	 Catch:{ RemoteException -> 0x00d1 }
        r6.<init>(r1);	 Catch:{ RemoteException -> 0x00d1 }
    L_0x00d0:
        return;
    L_0x00d1:
        r6 = move-exception;
        defpackage.qml.a(r0, r6);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rpx.<init>(rpv):void");
    }

    public final /* synthetic */ Object a() {
        try {
            return this.a.l();
        } catch (RemoteException e) {
            qml.a("", e);
            return null;
        }
    }
}
