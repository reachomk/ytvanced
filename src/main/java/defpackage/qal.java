package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: qal */
final class qal extends pyw implements Callback {
    public final HashMap a = new HashMap();
    public final Context b;
    public final Handler c;
    public final qar d;
    public final long e;
    private final long f;

    qal(Context context) {
        this.b = context.getApplicationContext();
        this.c = new Handler(context.getMainLooper(), this);
        this.d = qar.a();
        this.f = 5000;
        this.e = 300000;
    }

    public final boolean a(pyv pyv, ServiceConnection serviceConnection, String str) {
        boolean z;
        pzr.a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            qak qak = (qak) this.a.get(pyv);
            if (qak == null) {
                qak = new qak(this, pyv);
                qak.a(serviceConnection);
                qak.a();
                this.a.put(pyv, qak);
            } else {
                this.c.removeMessages(0, pyv);
                if (qak.b(serviceConnection)) {
                    String valueOf = String.valueOf(pyv);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 81);
                    stringBuilder.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    stringBuilder.append(valueOf);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                qak.a(serviceConnection);
                int i = qak.b;
                if (i == 1) {
                    serviceConnection.onServiceConnected(qak.f, qak.d);
                } else if (i == 2) {
                    qak.a();
                }
            }
            z = qak.c;
        }
        return z;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(pyv pyv, ServiceConnection serviceConnection) {
        pzr.a((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.a) {
            qak qak = (qak) this.a.get(pyv);
            String valueOf;
            StringBuilder stringBuilder;
            if (qak == null) {
                valueOf = String.valueOf(pyv);
                stringBuilder = new StringBuilder(valueOf.length() + 50);
                stringBuilder.append("Nonexistent connection status for service config: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (qak.b(serviceConnection)) {
                qak.a.remove(serviceConnection);
                if (qak.b()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, pyv), this.f);
                }
            } else {
                valueOf = String.valueOf(pyv);
                stringBuilder = new StringBuilder(valueOf.length() + 76);
                stringBuilder.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        pyv pyv;
        if (i == 0) {
            synchronized (this.a) {
                pyv = (pyv) message.obj;
                qak qak = (qak) this.a.get(pyv);
                if (qak != null) {
                    if (qak.b()) {
                        if (qak.c) {
                            qak.g.c.removeMessages(1, qak.e);
                            qak.g.b.unbindService(qak);
                            qak.c = false;
                            qak.b = 2;
                        }
                        this.a.remove(pyv);
                    }
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.a) {
                pyv = (pyv) message.obj;
                qak qak2 = (qak) this.a.get(pyv);
                if (qak2 != null && qak2.b == 3) {
                    String valueOf = String.valueOf(pyv);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 47);
                    stringBuilder.append("Timeout waiting for ServiceConnection callback ");
                    stringBuilder.append(valueOf);
                    Log.wtf("GmsClientSupervisor", stringBuilder.toString(), new Exception());
                    ComponentName componentName = qak2.f;
                    if (componentName == null) {
                        componentName = pyv.b;
                    }
                    if (componentName == null) {
                        componentName = new ComponentName(pyv.a, "unknown");
                    }
                    qak2.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
