package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: ahfx */
public final class ahfx extends BroadcastReceiver {
    public boolean a;
    public final /* synthetic */ ahfv b;

    ahfx(ahfv ahfv) {
        this.b = ahfv;
    }

    public final void a() {
        if (!this.a) {
            this.b.a.registerReceiver(this, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.a = true;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        ahfv ahfv = this.b;
        if (ahfv.h.a && ahfv.g != null && !ahfv.b.k) {
            ahfv.e.e_(new ahja());
            this.b.g.b();
            ahga ahga = this.b.d;
            ahga.a = false;
            ahga.b = false;
        }
    }
}
