package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: poy */
public final class poy extends qae {
    public poy(Context context, Looper looper, pyp pyp, pte pte, pth pth) {
        super(context, looper, 161, pyp, pte, pth);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.cast.internal.ICastService";
    }

    public final int c() {
        return 12451000;
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastService");
        if (queryLocalInterface instanceof ppr) {
            return (ppr) queryLocalInterface;
        }
        return new pol(iBinder);
    }
}
