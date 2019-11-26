package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedImageClientService.Stub;
import defpackage.akkq;
import defpackage.mzq;
import defpackage.ngm;
import defpackage.wxg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

public class EmbedImageClientService extends Stub {
    public final HashMap a = new HashMap();
    private mzq b;
    private final akkq c;
    private final BitmapKeyHolderRegistry d;

    final class RemoteBitmapCallback implements wxg {
        private final ngm a;
        private WeakReference b;
        private Runnable c;

        public RemoteBitmapCallback(ngm ngm, WeakReference weakReference, Runnable runnable) {
            this.a = ngm;
            this.b = weakReference;
            this.c = runnable;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001b */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:7|8|9|10|(1:12)|13|14|15) */
        private final synchronized void a(android.graphics.Bitmap r3) {
            /*
            r2 = this;
            monitor-enter(r2);
            r0 = r2.b;	 Catch:{ all -> 0x002c }
            r0 = r0.get();	 Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x000e;
        L_0x0009:
            r2.a();	 Catch:{ all -> 0x002c }
            monitor-exit(r2);
            return;
        L_0x000e:
            r0 = r2.b;	 Catch:{ RemoteException | NullPointerException -> 0x001b, RemoteException | NullPointerException -> 0x001b }
            r0 = r0.get();	 Catch:{ RemoteException | NullPointerException -> 0x001b, RemoteException | NullPointerException -> 0x001b }
            r0 = (defpackage.mzq) r0;	 Catch:{ RemoteException | NullPointerException -> 0x001b, RemoteException | NullPointerException -> 0x001b }
            r1 = r2.a;	 Catch:{ RemoteException | NullPointerException -> 0x001b, RemoteException | NullPointerException -> 0x001b }
            r0.a(r1, r3);	 Catch:{ RemoteException | NullPointerException -> 0x001b, RemoteException | NullPointerException -> 0x001b }
        L_0x001b:
            r3 = r2.c;	 Catch:{ all -> 0x002c }
            if (r3 == 0) goto L_0x0025;
        L_0x001f:
            r3.run();	 Catch:{ all -> 0x002c }
            r3 = 0;
            r2.c = r3;	 Catch:{ all -> 0x002c }
        L_0x0025:
            r3 = r2.b;	 Catch:{ all -> 0x002c }
            r3.clear();	 Catch:{ all -> 0x002c }
            monitor-exit(r2);
            return;
        L_0x002c:
            r3 = move-exception;
            monitor-exit(r2);
            throw r3;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedImageClientService$RemoteBitmapCallback.a(android.graphics.Bitmap):void");
        }

        public final synchronized void a() {
            Runnable runnable = this.c;
            if (runnable != null) {
                runnable.run();
                this.c = null;
            }
            this.b.clear();
        }
    }

    public EmbedImageClientService(mzq mzq, BitmapKeyHolderRegistry bitmapKeyHolderRegistry, akkq akkq) {
        this.b = mzq;
        this.d = bitmapKeyHolderRegistry;
        this.c = akkq;
        try {
            this.b.a(this);
        } catch (RemoteException unused) {
        }
    }

    public final synchronized void a() {
        ArrayList arrayList = new ArrayList(this.a.values());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((RemoteBitmapCallback) arrayList.get(i)).a();
        }
        this.a.clear();
        this.b = null;
    }

    public final synchronized void a(ngm ngm) {
        if (!this.a.containsKey(ngm)) {
            RemoteBitmapCallback remoteBitmapCallback = new RemoteBitmapCallback(ngm, new WeakReference(this.b), new EmbedImageClientService$$Lambda$0(this, ngm));
            this.a.put(ngm, remoteBitmapCallback);
            a(ngm, remoteBitmapCallback);
        }
    }

    public final synchronized void b(ngm ngm) {
        ((RemoteBitmapCallback) this.a.get(ngm)).a();
        this.a.remove(ngm);
    }

    private final synchronized void a(ngm ngm, wxg wxg) {
        Uri a = this.d.a(ngm);
        if (a != null) {
            this.c.b(a, wxg);
        }
    }
}
