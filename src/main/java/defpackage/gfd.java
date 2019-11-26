package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.protos.youtube.api.innertube.ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: gfd */
public final class gfd extends Handler {
    private static final long f = TimeUnit.SECONDS.toMillis(2);
    public final abgv a;
    public final afpu b;
    public final gfc c;
    public final AtomicBoolean d = new AtomicBoolean();
    public apxu e;
    private boolean g;
    private boolean h;
    private boolean i;
    private zin j;
    private boolean k;

    public gfd(abgv abgv, afpu afpu, gfc gfc) {
        this.a = abgv;
        this.b = afpu;
        this.c = gfc;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.g = false;
            this.h = false;
            this.d.set(false);
            this.c.a(null, null);
        } else if (i == 1) {
            a((apxu) message.obj);
            if (this.i) {
                sendEmptyMessage(5);
            }
        } else if (i == 2) {
            this.h = true;
            if (this.i) {
                sendEmptyMessage(5);
            }
        } else if (i == 3) {
            this.i = false;
        } else if (i == 4) {
            this.i = true;
            this.j = (zin) message.obj;
            sendEmptyMessage(5);
        } else if (i == 5 && this.i) {
            if (this.g) {
                this.c.a(this.j, this.e, this.k);
            } else if (message.arg1 == 1 || this.h) {
                if (message.arg1 == 1) {
                    afpc.a(2, afpf.upload, "Reels: Opened edit screen due to timeout");
                }
                apxx apxx = (apxx) apxu.d.createBuilder();
                apxx.a(ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.reelEditVideoEndpoint, ReelEditVideoEndpointOuterClass$ReelEditVideoEndpoint.c);
                this.c.a(this.j, (apxu) ((anxl) apxx.build()), this.k);
                this.d.set(true);
            } else {
                this.c.aa();
                sendMessageDelayed(obtainMessage(5, 1, 0), f);
            }
        }
    }

    public final void a(zin zin, boolean z) {
        this.k = z;
        sendMessage(obtainMessage(4, zin));
    }

    public final void a(apxu apxu) {
        if (apxu != null) {
            this.e = apxu;
            this.g = true;
        }
    }
}
