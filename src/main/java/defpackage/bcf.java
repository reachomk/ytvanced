package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bcf */
final class bcf extends ban implements ServiceConnection {
    public final ComponentName i;
    public final bcm j;
    public final ArrayList k = new ArrayList();
    public boolean l;
    public bci m;
    public boolean n;
    private boolean o;

    public bcf(Context context, ComponentName componentName) {
        super(context, new bav(componentName));
        this.i = componentName;
        this.j = new bcm();
    }

    public final bay a(String str) {
        if (str != null) {
            return b(str, null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final bay a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return b(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public final bap b(String str) {
        if (str != null) {
            bax bax = this.g;
            bap bap = null;
            if (bax != null) {
                List list = bax.a;
                int size = list.size();
                int i = 0;
                while (i < size) {
                    if (((bam) list.get(i)).a().equals(str)) {
                        bap = new bco(this, str);
                        this.k.add(bap);
                        if (this.n) {
                            bap.a(this.m);
                        }
                        b();
                    } else {
                        i++;
                    }
                }
            }
            return bap;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public final void b(bao bao) {
        if (this.n) {
            this.m.a(bao);
        }
        b();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.o) {
            f();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        bci bci = new bci(this, messenger);
                        int i = bci.c;
                        bci.c = i + 1;
                        bci.f = i;
                        if (bci.a(1, i, 3, null, null)) {
                            try {
                                bci.a.getBinder().linkToDeath(bci, 0);
                                this.m = bci;
                                return;
                            } catch (RemoteException unused) {
                                bci.binderDied();
                                return;
                            }
                        }
                    }
                } catch (NullPointerException unused2) {
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this);
            stringBuilder.append(": Service returned invalid messenger binder");
            Log.e("MediaRouteProviderProxy", stringBuilder.toString());
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        f();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Service connection ");
        stringBuilder.append(this.i.flattenToShortString());
        return stringBuilder.toString();
    }

    public final void a() {
        if (!this.l) {
            this.l = true;
            b();
        }
    }

    public final void b() {
        if (c()) {
            d();
        } else {
            e();
        }
    }

    public final boolean c() {
        if (this.l && (this.e != null || !this.k.isEmpty())) {
            return true;
        }
        return false;
    }

    public final void d() {
        if (!this.o) {
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.i);
            try {
                this.o = this.a.bindService(intent, this, 1);
            } catch (SecurityException unused) {
            }
        }
    }

    public final void e() {
        if (this.o) {
            this.o = false;
            f();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException e) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this);
                stringBuilder.append(": unbindService failed");
                Log.e("MediaRouteProviderProxy", stringBuilder.toString(), e);
            }
        }
    }

    private final bay b(String str, String str2) {
        bax bax = this.g;
        if (bax != null) {
            List list = bax.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((bam) list.get(i)).a().equals(str)) {
                    bcq bcq = new bcq(this, str, str2);
                    this.k.add(bcq);
                    if (this.n) {
                        bcq.a(this.m);
                    }
                    b();
                    return bcq;
                }
            }
        }
        return null;
    }

    /* Access modifiers changed, original: final */
    public final void a(bci bci, bax bax) {
        if (this.m == bci) {
            a(bax);
        }
    }

    public final void f() {
        if (this.m != null) {
            a(null);
            this.n = false;
            int size = this.k.size();
            for (int i = 0; i < size; i++) {
                ((bcj) this.k.get(i)).e();
            }
            bci bci = this.m;
            bci.a(2, 0, 0, null, null);
            bci.b.a.clear();
            bci.a.getBinder().unlinkToDeath(bci, 0);
            bci.h.j.post(new bch(bci));
            this.m = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(bcj bcj) {
        this.k.remove(bcj);
        bcj.e();
        b();
    }
}
