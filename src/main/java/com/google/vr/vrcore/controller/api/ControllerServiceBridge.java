package com.google.vr.vrcore.controller.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.vr.vrcore.base.api.VrCoreUtils;
import defpackage.anxl;
import defpackage.anze;
import defpackage.bahp;
import defpackage.baig;
import defpackage.baii;
import defpackage.baim;
import defpackage.baio;
import defpackage.bais;
import defpackage.baiv;
import defpackage.baiw;
import defpackage.baix;
import defpackage.baiy;
import defpackage.baja;
import defpackage.bajb;
import defpackage.bajd;
import defpackage.baji;
import defpackage.bajl;
import defpackage.bajn;
import defpackage.bajo;
import defpackage.bajp;
import defpackage.bajq;
import defpackage.bajr;
import defpackage.bajs;
import java.util.concurrent.atomic.AtomicInteger;

public class ControllerServiceBridge implements ServiceConnection {
    private static final AtomicInteger g = new AtomicInteger(-1);
    public final Context a;
    public final Handler b;
    public final SparseArray c = new SparseArray();
    public baji d;
    public bajd e;
    public boolean f;
    private final int h;
    private final String i;
    private final baja j;

    public interface Callbacks {
        void onControllerEventPacket(baig baig);

        void onControllerEventPacket2(baii baii);

        void onControllerRecentered(baio baio);

        void onControllerStateChanged(int i, int i2);

        void onServiceConnected(int i);

        void onServiceDisconnected();

        void onServiceFailed();

        void onServiceInitFailed(int i);

        void onServiceUnavailable();
    }

    public ControllerServiceBridge(Context context, Callbacks callbacks, int i) {
        baim baim = new baim(i);
        this.a = context.getApplicationContext();
        int i2 = 0;
        this.e = new bajd(callbacks, baim, 0);
        SparseArray sparseArray = this.c;
        bajd bajd = this.e;
        sparseArray.put(bajd.c, bajd);
        this.b = new Handler(Looper.getMainLooper());
        this.j = new baja(this);
        try {
            i2 = VrCoreUtils.getVrCoreClientApiVersion(context);
        } catch (bahp unused) {
        }
        this.h = i2;
        int incrementAndGet = g.incrementAndGet();
        StringBuilder stringBuilder = new StringBuilder(30);
        stringBuilder.append("VrCtl.ServiceBridge");
        stringBuilder.append(incrementAndGet);
        this.i = stringBuilder.toString();
    }

    public void requestBind() {
        this.b.post(new baiw(this));
    }

    public void requestUnbind() {
        this.b.post(new baiv(this));
    }

    public final void a() {
        c();
        String str = "VrCtl.ServiceBridge";
        if (this.f) {
            c();
            baji baji = this.d;
            if (baji != null) {
                try {
                    baji.a(this.i);
                } catch (RemoteException e) {
                    Log.w(str, "RemoteException while unregistering listeners.", e);
                }
            }
            if (this.h >= 21) {
                try {
                    baji = this.d;
                    if (!(baji == null || baji.b(this.j))) {
                        Log.w(str, "Failed to unregister remote service listener.");
                    }
                } catch (RemoteException e2) {
                    String valueOf = String.valueOf(e2);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 55);
                    stringBuilder.append("Exception while unregistering remote service listener: ");
                    stringBuilder.append(valueOf);
                    Log.w(str, stringBuilder.toString());
                }
            }
            this.a.unbindService(this);
            this.d = null;
            this.f = false;
            return;
        }
        Log.w(str, "Service is already unbound.");
    }

    public boolean createAndConnectController(int i, Callbacks callbacks, int i2) {
        baim baim = new baim(i2);
        c();
        if (this.d == null) {
            return false;
        }
        bajd bajd = new bajd(callbacks, baim, i);
        if (a(bajd.c, bajd)) {
            if (bajd.c == 0) {
                this.e = bajd;
            }
            this.c.put(i, bajd);
            return true;
        }
        if (i == 0) {
            Log.e("VrCtl.ServiceBridge", "Failed to connect controller 0.");
        }
        this.c.remove(i);
        return false;
    }

    public void vibrateController(int i, int i2, int i3, int i4) {
        bajn bajn = (bajn) bajo.d.createBuilder();
        bajr bajr = (bajr) bajs.e.createBuilder();
        bajr.copyOnWrite();
        bajs bajs = (bajs) bajr.instance;
        bajs.a |= 1;
        bajs.b = i2;
        bajr.copyOnWrite();
        bajs bajs2 = (bajs) bajr.instance;
        bajs2.a |= 2;
        bajs2.c = i3;
        bajr.copyOnWrite();
        bajs2 = (bajs) bajr.instance;
        bajs2.a |= 4;
        bajs2.d = i4;
        bajs2 = (bajs) ((anxl) bajr.build());
        bajn.copyOnWrite();
        bajo bajo = (bajo) bajn.instance;
        if (bajs2 != null) {
            bajo.b = bajs2;
            bajo.a |= 1;
            anze anze = (bajo) ((anxl) bajn.build());
            bais bais = new bais();
            bais.a(anze);
            this.b.post(new baiy(this, i, bais));
            return;
        }
        throw new NullPointerException();
    }

    public void controllerHapticsEffect(int i, int i2, int i3) {
        bajn bajn = (bajn) bajo.d.createBuilder();
        bajp bajp = (bajp) bajq.d.createBuilder();
        bajp.copyOnWrite();
        bajq bajq = (bajq) bajp.instance;
        bajq.a |= 1;
        bajq.b = i2;
        bajp.copyOnWrite();
        bajq bajq2 = (bajq) bajp.instance;
        bajq2.a |= 2;
        bajq2.c = i3;
        bajq2 = (bajq) ((anxl) bajp.build());
        bajn.copyOnWrite();
        bajo bajo = (bajo) bajn.instance;
        if (bajq2 != null) {
            bajo.c = bajq2;
            bajo.a |= 2;
            anze anze = (bajo) ((anxl) bajn.build());
            bais bais = new bais();
            bais.a(anze);
            this.b.post(new baix(this, i, bais));
            return;
        }
        throw new NullPointerException();
    }

    public final void a(int i, bais bais) {
        c();
        baji baji = this.d;
        String str = "VrCtl.ServiceBridge";
        if (baji != null) {
            try {
                baji.a(i, bais);
                return;
            } catch (RemoteException e) {
                Log.w(str, "RemoteException while vibrating the controller.", e);
                return;
            }
        }
        Log.w(str, "Vibration cancelled: service not connected");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str = "VrCtl.ServiceBridge";
        c();
        if (this.f) {
            baji bajl;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.controller.api.IControllerService");
                bajl = queryLocalInterface instanceof baji ? (baji) queryLocalInterface : new bajl(iBinder);
            } else {
                bajl = null;
            }
            this.d = bajl;
            try {
                int a = this.d.a();
                if (a == 0) {
                    if (this.h >= 21) {
                        try {
                            if (!this.d.a(this.j)) {
                                Log.e(str, "Failed to register remote service listener.");
                                this.e.a.onServiceInitFailed(0);
                                a();
                                return;
                            }
                        } catch (RemoteException e) {
                            String valueOf = String.valueOf(e);
                            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 53);
                            stringBuilder.append("Exception while registering remote service listener: ");
                            stringBuilder.append(valueOf);
                            Log.w(str, stringBuilder.toString());
                        }
                    }
                    b();
                    return;
                }
                Object obj;
                if (a == 0) {
                    obj = "SUCCESS";
                } else if (a == 1) {
                    obj = "FAILED_UNSUPPORTED";
                } else if (a == 2) {
                    obj = "FAILED_NOT_AUTHORIZED";
                } else if (a != 3) {
                    StringBuilder stringBuilder2 = new StringBuilder(45);
                    stringBuilder2.append("[UNKNOWN CONTROLLER INIT RESULT: ");
                    stringBuilder2.append(a);
                    stringBuilder2.append("]");
                    obj = stringBuilder2.toString();
                } else {
                    obj = "FAILED_CLIENT_OBSOLETE";
                }
                String valueOf2 = String.valueOf(obj);
                String str2 = "initialize() returned error: ";
                if (valueOf2.length() == 0) {
                    valueOf2 = new String(str2);
                } else {
                    valueOf2 = str2.concat(valueOf2);
                }
                Log.e(str, valueOf2);
                this.e.a.onServiceInitFailed(a);
                a();
            } catch (RemoteException e2) {
                Log.e(str, "Failed to call initialize() on controller service (RemoteException).", e2);
                this.e.a.onServiceFailed();
                a();
            }
        }
    }

    public final void b() {
        this.e.a.onServiceConnected(1);
        bajd bajd = this.e;
        if (a(bajd.c, bajd)) {
            SparseArray sparseArray = this.c;
            bajd bajd2 = this.e;
            sparseArray.put(bajd2.c, bajd2);
            return;
        }
        Log.w("VrCtl.ServiceBridge", "Failed to register service listener.");
        this.e.a.onServiceFailed();
        a();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        c();
        this.d = null;
        this.e.a.onServiceDisconnected();
    }

    public static void c() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("This should be running on the main thread.");
        }
    }

    private final boolean a(int i, bajd bajd) {
        try {
            if (this.d.a(i, this.i, new bajb(bajd))) {
                return true;
            }
        } catch (RemoteException e) {
            Log.w("VrCtl.ServiceBridge", "RemoteException while registering listener.", e);
        }
        return false;
    }
}
