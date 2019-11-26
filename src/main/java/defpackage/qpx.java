package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: qpx */
public final class qpx extends qae {
    qpx(Context context, Looper looper, pte pte, pth pth) {
        super(context, looper, 25, pyp.a(context), pte, pth);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.droidguard.service.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.droidguard.internal.IDroidGuardService";
    }

    public final int c() {
        return 12800000;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.droidguard.internal.IDroidGuardService");
        if (queryLocalInterface instanceof qqk) {
            return (qqk) queryLocalInterface;
        }
        return new qqj(iBinder);
    }
}
