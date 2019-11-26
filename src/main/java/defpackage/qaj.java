package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: qaj */
public final class qaj implements Callback {
    public final qai a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public volatile boolean e = false;
    public final AtomicInteger f = new AtomicInteger(0);
    public boolean g = false;
    public final Handler h;
    public final Object i = new Object();

    public qaj(Looper looper, qai qai) {
        this.a = qai;
        this.h = new Handler(looper, this);
    }

    public final void a() {
        this.e = false;
        this.f.incrementAndGet();
    }

    public final void b() {
        this.e = true;
    }

    public final void a(pth pth) {
        pzr.a((Object) pth);
        synchronized (this.i) {
            if (this.d.contains(pth)) {
                String valueOf = String.valueOf(pth);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 67);
                stringBuilder.append("registerConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.d.add(pth);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            pte pte = (pte) message.obj;
            synchronized (this.i) {
                if (this.e && this.a.i() && this.b.contains(pte)) {
                    pte.a(this.a.f());
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("Don't know how to handle message: ");
        stringBuilder.append(i);
        Log.wtf("GmsClientEvents", stringBuilder.toString(), new Exception());
        return false;
    }
}
