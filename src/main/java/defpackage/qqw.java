package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: qqw */
public final class qqw extends pdg {
    public qqw(Context context, Looper looper, pyc pyc, pyf pyf) {
        super(context, looper, pyc, pyf);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.gass.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.gass.internal.IGassService";
    }

    public final qqz d() {
        return (qqz) super.v();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.gass.internal.IGassService");
        if (queryLocalInterface instanceof qqz) {
            return (qqz) queryLocalInterface;
        }
        return new qrc(iBinder);
    }
}
