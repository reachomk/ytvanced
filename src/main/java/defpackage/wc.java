package defpackage;

import android.media.session.MediaController.Callback;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder.DeathRecipient;
import android.os.Message;

/* renamed from: wc */
public class wc implements DeathRecipient {
    public final Callback a;
    public vx b;
    private we c;

    public wc() {
        if (VERSION.SDK_INT >= 21) {
            this.a = new wf(this);
            return;
        }
        this.a = null;
        this.b = new wh(this);
    }

    public void a() {
    }

    public void a(vj vjVar) {
    }

    public void a(xs xsVar) {
    }

    public final void binderDied() {
        a(8, null, null);
    }

    /* Access modifiers changed, original: final */
    public final void a(Handler handler) {
        if (handler != null) {
            this.c = new we(this, handler.getLooper());
            this.c.a = true;
            return;
        }
        we weVar = this.c;
        if (weVar != null) {
            weVar.a = false;
            weVar.removeCallbacksAndMessages(null);
            this.c = null;
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(int i, Object obj, Bundle bundle) {
        we weVar = this.c;
        if (weVar != null) {
            Message obtainMessage = weVar.obtainMessage(i, obj);
            obtainMessage.setData(bundle);
            obtainMessage.sendToTarget();
        }
    }
}
