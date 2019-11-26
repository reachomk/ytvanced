package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import java.util.HashSet;
import java.util.Set;

/* renamed from: qak */
final class qak implements ServiceConnection {
    public final Set a = new HashSet();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final pyv e;
    public ComponentName f;
    public final /* synthetic */ qal g;

    public qak(qal qal, pyv pyv) {
        this.g = qal;
        this.e = pyv;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = iBinder;
            this.f = componentName;
            for (ServiceConnection onServiceConnected : this.a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.g.a) {
            this.g.c.removeMessages(1, this.e);
            this.d = null;
            this.f = componentName;
            for (ServiceConnection onServiceDisconnected : this.a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.b = 2;
        }
    }

    public final void a() {
        this.b = 3;
        qal qal = this.g;
        qar qar = qal.d;
        boolean a = qar.a(qal.b, this.e.a(), this, this.e.c);
        this.c = a;
        if (a) {
            Message obtainMessage = this.g.c.obtainMessage(1, this.e);
            qal qal2 = this.g;
            qal2.c.sendMessageDelayed(obtainMessage, qal2.e);
            return;
        }
        this.b = 2;
        try {
            qal = this.g;
            qar = qal.d;
            qal.b.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void a(ServiceConnection serviceConnection) {
        qal qal = this.g;
        qar qar = qal.d;
        Context context = qal.b;
        this.e.a();
        this.a.add(serviceConnection);
    }

    public final boolean b(ServiceConnection serviceConnection) {
        return this.a.contains(serviceConnection);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }
}
