package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IApiPlayerFactoryService;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.List;

/* renamed from: mvb */
public final class mvb {
    public static WeakReference a;
    private static WeakReference g;
    private static WeakReference h;
    public final ndt b;
    public ndi c;
    public ndi d;
    public ndi e;
    public final bdfg f = bdfg.b(ngf.d);
    private final HashSet i;
    private boolean j;
    private final mvi k;
    private final mve l;
    private final mvh m;
    private final mvf n;
    private bcuo o = bdfz.a;

    public static synchronized mvb a(Context context, msh msh) {
        mvb mvb;
        synchronized (mvb.class) {
            mvb = new mvb(context, msh, new mvi());
            h = new WeakReference(mvb);
        }
        return mvb;
    }

    public static synchronized bcuh a(bcuh bcuh, msh msh, IApiPlayerFactoryService iApiPlayerFactoryService) {
        synchronized (mvb.class) {
            bcuh bcuh2 = null;
            Object obj = h != null ? (mvb) h.get() : null;
            if (obj == null) {
                if (g != null) {
                    bcuh2 = (bcuh) g.get();
                }
                if (bcuh2 == null) {
                    bcuh = mvb.b(bcuh, msh, iApiPlayerFactoryService);
                    g = new WeakReference(bcuh);
                    return bcuh;
                }
                return bcuh2;
            }
            bdcl bdcl = new bdcl(obj);
            return bdcl;
        }
    }

    private static synchronized bcuh b(bcuh bcuh, msh msh, IApiPlayerFactoryService iApiPlayerFactoryService) {
        synchronized (mvb.class) {
            bcvq mva = new mva(msh);
            bcuh = bcuh.a(bcut.a()).a(mva).a(bdfe.a()).a(new mvd(iApiPlayerFactoryService)).a();
        }
        return bcuh;
    }

    private mvb(Context context, msh msh, mvi mvi) {
        this.k = mvi;
        this.l = new mve(this);
        this.m = new mvh(this);
        this.n = new mvf(this);
        this.i = new HashSet();
        this.b = new ndt(context, msh, this.m, mvi, this.l, this.f, this.n);
    }

    public final synchronized void a(ndi ndi) {
        if (this.d != null) {
            xtl.c("Attempting to register more than one fullscreen embed.");
            c(this.d);
        }
        this.d = ndi;
        b(ndi);
        d(this.c);
    }

    public final synchronized void b(ndi ndi) {
        this.i.add(ndi);
    }

    /* JADX WARNING: Missing block: B:29:0x009d, code skipped:
            return;
     */
    public final synchronized void c(defpackage.ndi r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        if (r5 == 0) goto L_0x00a1;
    L_0x0003:
        r0 = r4.c;	 Catch:{ all -> 0x009e }
        if (r0 != r5) goto L_0x000f;
    L_0x0007:
        r0 = "Deregistering currently playing fragment.";
        defpackage.xtl.c(r0);	 Catch:{ all -> 0x009e }
        r4.d(r5);	 Catch:{ all -> 0x009e }
    L_0x000f:
        r0 = r4.d;	 Catch:{ all -> 0x009e }
        r1 = 0;
        r2 = 0;
        if (r0 != r5) goto L_0x001e;
    L_0x0015:
        r4.d = r2;	 Catch:{ all -> 0x009e }
        r4.e = r2;	 Catch:{ all -> 0x009e }
        r0 = r4.b;	 Catch:{ all -> 0x009e }
        r0.a(r1);	 Catch:{ all -> 0x009e }
    L_0x001e:
        r0 = r4.e;	 Catch:{ all -> 0x009e }
        if (r0 != r5) goto L_0x0024;
    L_0x0022:
        r4.e = r2;	 Catch:{ all -> 0x009e }
    L_0x0024:
        r0 = r4.i;	 Catch:{ all -> 0x009e }
        r0.remove(r5);	 Catch:{ all -> 0x009e }
        r5 = r4.i;	 Catch:{ all -> 0x009e }
        r5 = r5.size();	 Catch:{ all -> 0x009e }
        if (r5 != 0) goto L_0x009c;
    L_0x0031:
        r5 = r4.b;	 Catch:{ all -> 0x009e }
        r0 = r5.d();	 Catch:{ all -> 0x009e }
        if (r0 == 0) goto L_0x0098;
    L_0x0039:
        r0 = r5.D;	 Catch:{ all -> 0x009e }
        r3 = r0.c;	 Catch:{ all -> 0x009e }
        r3.e();	 Catch:{ all -> 0x009e }
        r0.g = r1;	 Catch:{ all -> 0x009e }
        r0 = r5.E;	 Catch:{ all -> 0x009e }
        r0.b();	 Catch:{ all -> 0x009e }
        r0 = 1;
        r3 = r5.a;	 Catch:{ RemoteException -> 0x0081 }
        r3.b(r0);	 Catch:{ RemoteException -> 0x0081 }
        r3 = r5.e;	 Catch:{ RemoteException -> 0x0081 }
        if (r3 == 0) goto L_0x0054;
    L_0x0051:
        r3.d();	 Catch:{ RemoteException -> 0x0081 }
    L_0x0054:
        r3 = r5.f;	 Catch:{ RemoteException -> 0x0081 }
        r3 = r5.z;	 Catch:{ RemoteException -> 0x0081 }
        r3 = r3.d;	 Catch:{ RemoteException -> 0x0081 }
        r3.b();	 Catch:{ RemoteException -> 0x0081 }
        r3 = r5.d;	 Catch:{ RemoteException -> 0x0081 }
        r3.a();	 Catch:{ RemoteException -> 0x0081 }
        r3 = r5.h;	 Catch:{ RemoteException -> 0x0081 }
        r3.a();	 Catch:{ RemoteException -> 0x0081 }
        r3 = r5.k;	 Catch:{ RemoteException -> 0x0081 }
        r3.a();	 Catch:{ RemoteException -> 0x0081 }
        r3 = r5.s;	 Catch:{ RemoteException -> 0x0081 }
        r3.a();	 Catch:{ RemoteException -> 0x0081 }
        r3 = r5.j;	 Catch:{ RemoteException -> 0x0081 }
        r3.a();	 Catch:{ RemoteException -> 0x0081 }
        r3 = r5.l;	 Catch:{ RemoteException -> 0x0081 }
        r3.d();	 Catch:{ RemoteException -> 0x0081 }
        r3 = r5.i;	 Catch:{ RemoteException -> 0x0081 }
        r3.d();	 Catch:{ RemoteException -> 0x0081 }
        goto L_0x008f;
    L_0x0081:
        r3 = move-exception;
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x009e }
        r3 = r3.getMessage();	 Catch:{ all -> 0x009e }
        r0[r1] = r3;	 Catch:{ all -> 0x009e }
        r1 = "Service was disconnected: %s";
        defpackage.ammj.a(r1, r0);	 Catch:{ all -> 0x009e }
    L_0x008f:
        r5.b = r2;	 Catch:{ all -> 0x009e }
        r0 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.DisconnectedApiPlayerService;	 Catch:{ all -> 0x009e }
        r0.<init>();	 Catch:{ all -> 0x009e }
        r5.a = r0;	 Catch:{ all -> 0x009e }
    L_0x0098:
        g = r2;	 Catch:{ all -> 0x009e }
        h = r2;	 Catch:{ all -> 0x009e }
    L_0x009c:
        monitor-exit(r4);
        return;
    L_0x009e:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
    L_0x00a1:
        monitor-exit(r4);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvb.c(ndi):void");
    }

    public final synchronized void a(ndi ndi, nhm nhm, ngt ngt, boolean z) {
        if (nhm == null) {
            xtl.c("No description for playback provided.");
        } else if (c(ndi, false)) {
            String str = nhm.b;
            int i;
            int i2;
            if (str != null) {
                ndt ndt = this.b;
                boolean z2 = nhm.e == 2 && !z;
                i = nhm.g;
                i2 = ndi.l;
                if (ndt.d()) {
                    try {
                        ndt.u = false;
                        ndt.z.c();
                        if (!z2) {
                            nfy nfy = ndt.z;
                            nfy.a.setVisibility(0);
                            nfy.b.setVisibility(0);
                            nfy.setVisibility(0);
                        }
                        ndt.x.h();
                        mtw mtw = ndt.D;
                        if (mtw.f != ngt) {
                            mtw.f = ngt;
                            xot xot = mtw.c;
                            int i3 = (!mtw.f.b || mtw.d == null || mtw.e.hasFeature(9)) ? 0 : 1;
                            xot.c(i3 ^ 1);
                        }
                        if (z2) {
                            ndt.B.a(5);
                        }
                        ndt.a.a(str, z2, i, z, i2);
                        return;
                    } catch (RemoteException e) {
                        ammj.a("Service was disconnected: %s", e.getMessage());
                        return;
                    }
                }
                ammj.a("Service was disconnected", new Object[0]);
                return;
            }
            str = nhm.c;
            ndt ndt2;
            int i4;
            if (str != null) {
                ndt2 = this.b;
                i4 = nhm.f;
                i = nhm.g;
                i2 = ndi.l;
                if (ndt2.d()) {
                    try {
                        ndt2.u = false;
                        ndt2.a.a(str, i4, i, z, i2);
                        return;
                    } catch (RemoteException e2) {
                        ammj.a("Service was disconnected: %s", e2.getMessage());
                        return;
                    }
                }
                ammj.a("Service was disconnected", new Object[0]);
                return;
            }
            List list = nhm.d;
            if (list != null) {
                ndt2 = this.b;
                i4 = nhm.f;
                i = nhm.g;
                i2 = ndi.l;
                if (ndt2.d()) {
                    try {
                        ndt2.u = false;
                        ndt2.a.a(list, i4, i, z, i2);
                        return;
                    } catch (RemoteException e22) {
                        ammj.a("Service was disconnected: %s", e22.getMessage());
                        return;
                    }
                }
                ammj.a("Service was disconnected", new Object[0]);
                return;
            }
            xtl.c("No playback information provided; cannot start playback.");
        }
    }

    /* JADX WARNING: Missing block: B:26:0x0060, code skipped:
            return;
     */
    public final synchronized void a(defpackage.ndi r6, android.os.Bundle r7) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = 1;
        r1 = r5.c(r6, r0);	 Catch:{ all -> 0x0063 }
        if (r1 == 0) goto L_0x0061;
    L_0x0008:
        r1 = r5.b;	 Catch:{ all -> 0x0063 }
        r2 = r1.d();	 Catch:{ all -> 0x0063 }
        if (r2 == 0) goto L_0x0050;
    L_0x0010:
        r2 = r1.D;	 Catch:{ all -> 0x0063 }
        r3 = "fullscreenHelperState";
        r3 = r7.getBundle(r3);	 Catch:{ all -> 0x0063 }
        r4 = "isFullscreen";
        r3 = r3.getBoolean(r4);	 Catch:{ all -> 0x0063 }
        if (r3 == 0) goto L_0x0025;
    L_0x0020:
        r2 = r2.b;	 Catch:{ all -> 0x0063 }
        r2.a();	 Catch:{ all -> 0x0063 }
    L_0x0025:
        r2 = r1.E;	 Catch:{ all -> 0x0063 }
        r2 = r2.e();	 Catch:{ all -> 0x0063 }
        r3 = 0;
        if (r2 != 0) goto L_0x0036;
    L_0x002e:
        r7 = "Aborting Fragment restoration because player is not visible";
        r0 = new java.lang.Object[r3];	 Catch:{ all -> 0x0063 }
        defpackage.ammj.a(r7, r0);	 Catch:{ all -> 0x0063 }
        goto L_0x0050;
    L_0x0036:
        r2 = "apiPlayerState";
        r7 = r7.getByteArray(r2);	 Catch:{ all -> 0x0063 }
        r1 = r1.a;	 Catch:{ RemoteException -> 0x0042 }
        r1.b(r7);	 Catch:{ RemoteException -> 0x0042 }
        goto L_0x0050;
    L_0x0042:
        r7 = move-exception;
        r0 = new java.lang.Object[r0];	 Catch:{ all -> 0x0063 }
        r7 = r7.getMessage();	 Catch:{ all -> 0x0063 }
        r0[r3] = r7;	 Catch:{ all -> 0x0063 }
        r7 = "Service was disconnected: %s";
        defpackage.ammj.a(r7, r0);	 Catch:{ all -> 0x0063 }
    L_0x0050:
        r7 = r5.d;	 Catch:{ all -> 0x0063 }
        if (r7 == 0) goto L_0x005f;
    L_0x0054:
        if (r7 != r6) goto L_0x005f;
    L_0x0056:
        r6 = r5.b;	 Catch:{ all -> 0x0063 }
        r7 = r6.H;	 Catch:{ all -> 0x0063 }
        if (r7 == 0) goto L_0x005f;
    L_0x005c:
        r6.f();	 Catch:{ all -> 0x0063 }
    L_0x005f:
        monitor-exit(r5);
        return;
    L_0x0061:
        monitor-exit(r5);
        return;
    L_0x0063:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvb.a(ndi, android.os.Bundle):void");
    }

    private final boolean c(ndi ndi, boolean z) {
        ndi ndi2 = this.d;
        if (!ndi2 == null ? ndi2 == ndi : !z || this.c == null) {
            return false;
        }
        if (!ndi.equals(this.c)) {
            c();
            View view = this.b.w;
            myq myq = ndi.a;
            View view2 = myq.d;
            boolean z2 = view2 == null || view2 == view;
            amqw.a(z2, (Object) "Another player view is already attached.");
            myq.d = view;
            ViewGroup viewGroup = myq.c;
            if (viewGroup != null) {
                viewGroup.removeView(myq.h.aL_());
                myq.c.addView(view);
            }
            try {
                this.b.a.q();
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
            }
            this.c = ndi;
            this.o = ndi.j.a(new bcxz(new mvc(this))).a(this.f);
            this.k.a(this.c);
            f(ndi);
            a = new WeakReference(ndi.c);
        }
        return true;
    }

    public final synchronized void d(ndi ndi) {
        if (ndi == null) {
            return;
        }
        if (ndi == this.c) {
            c();
        } else if (j(ndi)) {
            b(ndi, false);
        } else {
            xtl.c("Attempting to relinquish an ungranted playback.");
        }
    }

    private final void c() {
        if (this.c != null) {
            this.k.a(null);
            this.o.b();
            ndt ndt = this.b;
            if (ndt.d()) {
                try {
                    ndt.u = false;
                    ndt.a.g();
                } catch (RemoteException e) {
                    ammj.a("Service was disconnected: %s", e.getMessage());
                }
            } else {
                ammj.a("Service was disconnected", new Object[0]);
            }
            myq myq = this.c.a;
            View view = myq.d;
            if (view != null) {
                ViewGroup viewGroup = myq.c;
                if (viewGroup != null) {
                    viewGroup.removeView(view);
                    myq.c.addView(myq.h.aL_());
                    myq.d = null;
                }
            }
            this.c = null;
        }
    }

    /* JADX WARNING: Missing block: B:16:0x0045, code skipped:
            return r0;
     */
    public final synchronized android.os.Bundle e(defpackage.ndi r6) {
        /*
        r5 = this;
        monitor-enter(r5);
        r0 = r5.c;	 Catch:{ all -> 0x0048 }
        r1 = 0;
        if (r6 != r0) goto L_0x0046;
    L_0x0006:
        r6 = r5.b;	 Catch:{ all -> 0x0048 }
        r0 = r6.d();	 Catch:{ all -> 0x0048 }
        if (r0 == 0) goto L_0x0043;
    L_0x000e:
        r0 = new android.os.Bundle;	 Catch:{ all -> 0x0048 }
        r0.<init>();	 Catch:{ all -> 0x0048 }
        r2 = r6.D;	 Catch:{ all -> 0x0048 }
        r3 = new android.os.Bundle;	 Catch:{ all -> 0x0048 }
        r3.<init>();	 Catch:{ all -> 0x0048 }
        r4 = "isFullscreen";
        r2 = r2.h;	 Catch:{ all -> 0x0048 }
        r3.putBoolean(r4, r2);	 Catch:{ all -> 0x0048 }
        r2 = "fullscreenHelperState";
        r0.putBundle(r2, r3);	 Catch:{ all -> 0x0048 }
        r6 = r6.a;	 Catch:{ RemoteException -> 0x002d }
        r1 = r6.o();	 Catch:{ RemoteException -> 0x002d }
        goto L_0x003d;
    L_0x002d:
        r6 = move-exception;
        r2 = 1;
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x0048 }
        r3 = 0;
        r6 = r6.getMessage();	 Catch:{ all -> 0x0048 }
        r2[r3] = r6;	 Catch:{ all -> 0x0048 }
        r6 = "Service was disconnected: %s";
        defpackage.ammj.a(r6, r2);	 Catch:{ all -> 0x0048 }
    L_0x003d:
        r6 = "apiPlayerState";
        r0.putByteArray(r6, r1);	 Catch:{ all -> 0x0048 }
        goto L_0x0044;
    L_0x0043:
        r0 = r1;
    L_0x0044:
        monitor-exit(r5);
        return r0;
    L_0x0046:
        monitor-exit(r5);
        return r1;
    L_0x0048:
        r6 = move-exception;
        monitor-exit(r5);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvb.e(ndi):android.os.Bundle");
    }

    /* JADX WARNING: Missing block: B:17:0x0034, code skipped:
            return false;
     */
    public final synchronized boolean a(defpackage.ndi r4, boolean r5) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.c;	 Catch:{ all -> 0x0035 }
        r1 = 0;
        if (r4 != r0) goto L_0x0033;
    L_0x0006:
        r4 = r3.j;	 Catch:{ all -> 0x0035 }
        if (r4 == 0) goto L_0x0033;
    L_0x000a:
        r3.j = r1;	 Catch:{ all -> 0x0035 }
        r4 = r3.b;	 Catch:{ all -> 0x0035 }
        r0 = r4.d();	 Catch:{ all -> 0x0035 }
        r2 = 1;
        if (r0 != 0) goto L_0x001d;
    L_0x0015:
        r4 = "Service was disconnected";
        r5 = new java.lang.Object[r1];	 Catch:{ all -> 0x0035 }
        defpackage.ammj.a(r4, r5);	 Catch:{ all -> 0x0035 }
        goto L_0x0031;
    L_0x001d:
        r4 = r4.a;	 Catch:{ RemoteException -> 0x0023 }
        r4.f(r5);	 Catch:{ RemoteException -> 0x0023 }
        goto L_0x0031;
    L_0x0023:
        r4 = move-exception;
        r5 = new java.lang.Object[r2];	 Catch:{ all -> 0x0035 }
        r4 = r4.getMessage();	 Catch:{ all -> 0x0035 }
        r5[r1] = r4;	 Catch:{ all -> 0x0035 }
        r4 = "Service was disconnected: %s";
        defpackage.ammj.a(r4, r5);	 Catch:{ all -> 0x0035 }
    L_0x0031:
        monitor-exit(r3);
        return r2;
    L_0x0033:
        monitor-exit(r3);
        return r1;
    L_0x0035:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvb.a(ndi, boolean):boolean");
    }

    /* JADX WARNING: Missing block: B:17:0x0034, code skipped:
            return false;
     */
    public final synchronized boolean f(defpackage.ndi r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.c;	 Catch:{ all -> 0x0035 }
        r1 = 0;
        if (r4 != r0) goto L_0x0033;
    L_0x0006:
        r4 = r3.j;	 Catch:{ all -> 0x0035 }
        if (r4 != 0) goto L_0x0033;
    L_0x000a:
        r4 = 1;
        r3.j = r4;	 Catch:{ all -> 0x0035 }
        r0 = r3.b;	 Catch:{ all -> 0x0035 }
        r2 = r0.d();	 Catch:{ all -> 0x0035 }
        if (r2 != 0) goto L_0x001d;
    L_0x0015:
        r0 = "Service was disconnected";
        r1 = new java.lang.Object[r1];	 Catch:{ all -> 0x0035 }
        defpackage.ammj.a(r0, r1);	 Catch:{ all -> 0x0035 }
        goto L_0x0031;
    L_0x001d:
        r0 = r0.a;	 Catch:{ RemoteException -> 0x0023 }
        r0.l();	 Catch:{ RemoteException -> 0x0023 }
        goto L_0x0031;
    L_0x0023:
        r0 = move-exception;
        r2 = new java.lang.Object[r4];	 Catch:{ all -> 0x0035 }
        r0 = r0.getMessage();	 Catch:{ all -> 0x0035 }
        r2[r1] = r0;	 Catch:{ all -> 0x0035 }
        r0 = "Service was disconnected: %s";
        defpackage.ammj.a(r0, r2);	 Catch:{ all -> 0x0035 }
    L_0x0031:
        monitor-exit(r3);
        return r4;
    L_0x0033:
        monitor-exit(r3);
        return r1;
    L_0x0035:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mvb.f(ndi):boolean");
    }

    public final synchronized boolean g(ndi ndi) {
        boolean i;
        i = i(ndi);
        if (i) {
            ndt ndt = this.b;
            if (ndt.d()) {
                try {
                    ndt.a.c();
                } catch (RemoteException e) {
                    ammj.a("Service was disconnected: %s", e.getMessage());
                }
            } else {
                ammj.a("Service was disconnected", new Object[0]);
            }
        }
        return i;
    }

    public final synchronized boolean h(ndi ndi) {
        boolean i;
        i = i(ndi);
        if (i) {
            this.b.e();
        }
        return i;
    }

    public final synchronized boolean b(ndi ndi, boolean z) {
        boolean i;
        i = i(ndi);
        if (i) {
            this.b.a(z);
        }
        return i;
    }

    private final boolean i(ndi ndi) {
        if (!this.j) {
            return false;
        }
        if (ndi == this.c) {
            return true;
        }
        return j(ndi);
    }

    private final boolean j(ndi ndi) {
        return this.d != null && this.e == ndi;
    }

    public final synchronized void a(String str) {
        ndt ndt = this.b;
        if (ndt.d()) {
            try {
                ndt.a.a(str);
                return;
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
                return;
            }
        }
        ammj.a("Service was disconnected", new Object[0]);
    }

    public final synchronized void a() {
        ndt ndt = this.b;
        if (ndt.d()) {
            try {
                ndt.a.b();
                return;
            } catch (RemoteException e) {
                ammj.a("Service was disconnected: %s", e.getMessage());
                return;
            }
        }
        ammj.a("Service was disconnected", new Object[0]);
    }

    public final void b() {
        try {
            this.b.a.m();
        } catch (RemoteException e) {
            ammj.a("Service was disconnected: %s", e.getMessage());
        }
    }
}
