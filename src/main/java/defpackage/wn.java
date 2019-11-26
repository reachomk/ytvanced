package defpackage;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;

/* renamed from: wn */
final class wn implements wj {
    private final vy a;
    private wp b;

    public wn(xo xoVar) {
        vy waVar;
        IBinder iBinder = (IBinder) xoVar.a;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            waVar = (queryLocalInterface == null || !(queryLocalInterface instanceof vy)) ? new wa(iBinder) : (vy) queryLocalInterface;
        } else {
            waVar = null;
        }
        this.a = waVar;
    }

    public final void a(wc wcVar, Handler handler) {
        try {
            this.a.asBinder().linkToDeath(wcVar, 0);
            this.a.a(wcVar.b);
            wcVar.a(13, null, null);
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
            wcVar.a(8, null, null);
        }
    }

    public final void a(wc wcVar) {
        try {
            this.a.b(wcVar.b);
            this.a.asBinder().unlinkToDeath(wcVar, 0);
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e);
        }
    }

    public final boolean a(KeyEvent keyEvent) {
        try {
            this.a.a(keyEvent);
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e);
        }
        return false;
    }

    public final wp a() {
        if (this.b == null) {
            this.b = new wr(this.a);
        }
        return this.b;
    }

    public final xs b() {
        try {
            return this.a.h();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getPlaybackState.", e);
            return null;
        }
    }

    public final vj c() {
        try {
            return this.a.g();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getMetadata.", e);
            return null;
        }
    }

    public final PendingIntent d() {
        try {
            return this.a.d();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", e);
            return null;
        }
    }
}
