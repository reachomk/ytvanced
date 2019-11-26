package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;
import java.util.List;

/* renamed from: uc */
class uc implements ud {
    public final List a = new ArrayList();
    public MediaBrowserService b;
    public Messenger c;
    public final /* synthetic */ tv d;

    uc(tv tvVar) {
        this.d = tvVar;
    }

    public void a() {
        this.b = new uh(this, this.d);
        this.b.onCreate();
    }

    public final IBinder a(Intent intent) {
        return this.b.onBind(intent);
    }

    public final void a(xo xoVar) {
        this.d.f.a(new uf(this, xoVar));
    }
}
