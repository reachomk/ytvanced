package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;

/* renamed from: bci */
final class bci implements DeathRecipient {
    public final Messenger a;
    public final bcl b;
    public int c = 1;
    public int d = 1;
    public int e;
    public int f;
    public final SparseArray g = new SparseArray();
    public final /* synthetic */ bcf h;
    private final Messenger i;

    public bci(bcf bcf, Messenger messenger) {
        this.h = bcf;
        this.a = messenger;
        this.b = new bcl(this);
        this.i = new Messenger(this.b);
    }

    public final void binderDied() {
        this.h.j.post(new bck(this));
    }

    public final void a(int i) {
        int i2 = this.c;
        this.c = i2 + 1;
        a(4, i2, i, null, null);
    }

    public final void b(int i) {
        int i2 = this.c;
        this.c = i2 + 1;
        a(5, i2, i, null, null);
    }

    public final void a(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("unselectReason", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        a(6, i3, i, null, bundle);
    }

    public final void b(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        a(7, i3, i, null, bundle);
    }

    public final void c(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("volume", i2);
        int i3 = this.c;
        this.c = i3 + 1;
        a(8, i3, i, null, bundle);
    }

    public final void a(bao bao) {
        int i = this.c;
        this.c = i + 1;
        a(10, i, 0, bao != null ? bao.a : null, null);
    }

    public final boolean a(int i, int i2, int i3, Object obj, Bundle bundle) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        obtain.setData(bundle);
        obtain.replyTo = this.i;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i != 2) {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
            }
            return false;
        }
    }
}
