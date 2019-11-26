package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.io.IOException;

/* renamed from: nwa */
final class nwa extends Handler implements Runnable {
    public final nvz a;
    public volatile Thread b;
    private final nvx c;
    private final /* synthetic */ nvy d;

    public nwa(nvy nvy, Looper looper, nvz nvz, nvx nvx) {
        this.d = nvy;
        super(looper);
        this.a = nvz;
        this.c = nvx;
    }

    public final void run() {
        String str = "LoadTask";
        try {
            this.b = Thread.currentThread();
            if (!this.a.e()) {
                this.a.getClass().getSimpleName().concat(".load()");
                this.a.f();
                nxd.a();
            }
            sendEmptyMessage(0);
        } catch (IOException e) {
            obtainMessage(1, e).sendToTarget();
        } catch (InterruptedException unused) {
            nwf.b(this.a.e());
            sendEmptyMessage(0);
        } catch (Exception e2) {
            Log.e(str, "Unexpected exception loading stream", e2);
            obtainMessage(1, new nwc(e2)).sendToTarget();
        } catch (Error e3) {
            Log.e(str, "Unexpected error loading stream", e3);
            obtainMessage(2, e3).sendToTarget();
            throw e3;
        }
    }

    public final void handleMessage(Message message) {
        if (message.what != 2) {
            nvy nvy = this.d;
            nvy.b = false;
            nvy.a = null;
            if (this.a.e()) {
                this.c.g();
                return;
            }
            int i = message.what;
            if (i == 0) {
                this.c.a(this.a);
            } else if (i == 1) {
                this.c.a(this.a, (IOException) message.obj);
                return;
            }
            return;
        }
        throw ((Error) message.obj);
    }
}
