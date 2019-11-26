package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: qiv */
public final class qiv extends qae {
    public qiv(Context context, Looper looper, pte pte, pth pth) {
        super(context, looper, 121, pyp.a(context), pte, pth);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.instantapps.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.instantapps.internal.IInstantAppsService";
    }

    public final int c() {
        return 12200000;
    }

    public final psc[] t() {
        return new psc[]{qje.a};
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsService");
        if (queryLocalInterface instanceof qjc) {
            return (qjc) queryLocalInterface;
        }
        return new qjb(iBinder);
    }
}
