package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: ded */
final class ded implements den {
    private final Messenger a;
    private final String b;

    ded(Messenger messenger, String str) {
        this.a = messenger;
        this.b = str;
    }

    public final void a(int i) {
        try {
            Messenger messenger = this.a;
            Message obtain = Message.obtain();
            obtain.what = 3;
            obtain.arg1 = i;
            Bundle bundle = new Bundle();
            bundle.putString("tag", this.b);
            obtain.setData(bundle);
            messenger.send(obtain);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
