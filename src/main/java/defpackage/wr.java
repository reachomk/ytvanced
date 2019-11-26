package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: wr */
final class wr extends wp {
    private final vy a;

    public wr(vy vyVar) {
        this.a = vyVar;
    }

    public final void a() {
        try {
            this.a.s();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in play.", e);
        }
    }

    public final void b() {
        try {
            this.a.t();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in pause.", e);
        }
    }

    public final void c() {
        try {
            this.a.u();
        } catch (RemoteException e) {
            Log.e("MediaControllerCompat", "Dead object in stop.", e);
        }
    }
}
