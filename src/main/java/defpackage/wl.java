package defpackage;

import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* renamed from: wl */
final class wl extends ResultReceiver {
    private final WeakReference a;

    wl(wi wiVar) {
        super(null);
        this.a = new WeakReference(wiVar);
    }

    /* Access modifiers changed, original: protected|final */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0069 A:{Catch:{ RemoteException -> 0x0094 }} */
    public final void onReceiveResult(int r7, android.os.Bundle r8) {
        /*
        r6 = this;
        r7 = r6.a;
        r7 = r7.get();
        r7 = (defpackage.wi) r7;
        if (r7 == 0) goto L_0x00a6;
    L_0x000a:
        if (r8 == 0) goto L_0x00a6;
    L_0x000c:
        r0 = r7.a;
        monitor-enter(r0);
        r1 = r7.d;	 Catch:{ all -> 0x00a3 }
        r2 = "android.support.v4.media.session.EXTRA_BINDER";
        r2 = r8.getBinder(r2);	 Catch:{ all -> 0x00a3 }
        r3 = 0;
        if (r2 != 0) goto L_0x001c;
    L_0x001a:
        r2 = r3;
        goto L_0x0032;
    L_0x001c:
        r4 = "android.support.v4.media.session.IMediaSession";
        r4 = r2.queryLocalInterface(r4);	 Catch:{ all -> 0x00a3 }
        if (r4 == 0) goto L_0x002c;
    L_0x0024:
        r5 = r4 instanceof defpackage.vy;	 Catch:{ all -> 0x00a3 }
        if (r5 == 0) goto L_0x002c;
    L_0x0028:
        r2 = r4;
        r2 = (defpackage.vy) r2;	 Catch:{ all -> 0x00a3 }
        goto L_0x0032;
    L_0x002c:
        r4 = new wa;	 Catch:{ all -> 0x00a3 }
        r4.<init>(r2);	 Catch:{ all -> 0x00a3 }
        r2 = r4;
    L_0x0032:
        r1.b = r2;	 Catch:{ all -> 0x00a3 }
        r1 = r7.d;	 Catch:{ all -> 0x00a3 }
        r2 = "android.support.v4.media.session.SESSION_TOKEN2";
        r8 = r8.getParcelable(r2);	 Catch:{ RuntimeException -> 0x0060 }
        r8 = (android.os.Bundle) r8;	 Catch:{ RuntimeException -> 0x0060 }
        if (r8 == 0) goto L_0x0060;
    L_0x0040:
        r2 = defpackage.big.class;
        r2 = r2.getClassLoader();	 Catch:{ RuntimeException -> 0x0060 }
        r8.setClassLoader(r2);	 Catch:{ RuntimeException -> 0x0060 }
        r2 = "a";
        r8 = r8.getParcelable(r2);	 Catch:{ RuntimeException -> 0x0060 }
        r2 = r8 instanceof defpackage.bie;	 Catch:{ RuntimeException -> 0x0060 }
        if (r2 == 0) goto L_0x0058;
    L_0x0053:
        r8 = (defpackage.bie) r8;	 Catch:{ RuntimeException -> 0x0060 }
        r8 = r8.a;	 Catch:{ RuntimeException -> 0x0060 }
        goto L_0x0061;
    L_0x0058:
        r8 = new java.lang.IllegalArgumentException;	 Catch:{ RuntimeException -> 0x0060 }
        r2 = "Invalid parcel";
        r8.<init>(r2);	 Catch:{ RuntimeException -> 0x0060 }
        throw r8;	 Catch:{ RuntimeException -> 0x0060 }
    L_0x0060:
        r8 = r3;
    L_0x0061:
        r1.c = r8;	 Catch:{ all -> 0x00a3 }
        r8 = r7.d;	 Catch:{ all -> 0x00a3 }
        r8 = r8.b;	 Catch:{ all -> 0x00a3 }
        if (r8 == 0) goto L_0x00a1;
    L_0x0069:
        r8 = r7.b;	 Catch:{ all -> 0x00a3 }
        r8 = r8.iterator();	 Catch:{ all -> 0x00a3 }
    L_0x006f:
        r1 = r8.hasNext();	 Catch:{ all -> 0x00a3 }
        if (r1 == 0) goto L_0x009c;
    L_0x0075:
        r1 = r8.next();	 Catch:{ all -> 0x00a3 }
        r1 = (defpackage.wc) r1;	 Catch:{ all -> 0x00a3 }
        r2 = new wk;	 Catch:{ all -> 0x00a3 }
        r2.<init>(r1);	 Catch:{ all -> 0x00a3 }
        r4 = r7.c;	 Catch:{ all -> 0x00a3 }
        r4.put(r1, r2);	 Catch:{ all -> 0x00a3 }
        r1.b = r2;	 Catch:{ all -> 0x00a3 }
        r4 = r7.d;	 Catch:{ RemoteException -> 0x0094 }
        r4 = r4.b;	 Catch:{ RemoteException -> 0x0094 }
        r4.a(r2);	 Catch:{ RemoteException -> 0x0094 }
        r2 = 13;
        r1.a(r2, r3, r3);	 Catch:{ all -> 0x00a3 }
        goto L_0x006f;
    L_0x0094:
        r8 = move-exception;
        r1 = "MediaControllerCompat";
        r2 = "Dead object in registerCallback.";
        android.util.Log.e(r1, r2, r8);	 Catch:{ all -> 0x00a3 }
    L_0x009c:
        r7 = r7.b;	 Catch:{ all -> 0x00a3 }
        r7.clear();	 Catch:{ all -> 0x00a3 }
    L_0x00a1:
        monitor-exit(r0);	 Catch:{ all -> 0x00a3 }
        return;
    L_0x00a3:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00a3 }
        throw r7;
    L_0x00a6:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl.onReceiveResult(int, android.os.Bundle):void");
    }
}
