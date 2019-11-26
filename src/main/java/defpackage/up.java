package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;

/* renamed from: up */
final class up implements ud {
    public final /* synthetic */ tv a;
    private Messenger b;

    up(tv tvVar) {
        this.a = tvVar;
    }

    public final void a() {
        this.b = new Messenger(this.a.f);
    }

    public final IBinder a(Intent intent) {
        return "android.media.browse.MediaBrowserService".equals(intent.getAction()) ? this.b.getBinder() : null;
    }

    public final void a(xo xoVar) {
        this.a.f.post(new uo(this, xoVar));
    }
}
