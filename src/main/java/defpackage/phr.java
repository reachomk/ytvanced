package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: phr */
public final class phr extends qae {
    public phr(Context context, Looper looper, pyp pyp, pte pte, pth pth) {
        super(context, looper, 19, pyp, pte, pth);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.icing.LIGHTWEIGHT_INDEX_SERVICE";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch";
    }

    public final int c() {
        return 12600000;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch");
        if (queryLocalInterface instanceof pho) {
            return (pho) queryLocalInterface;
        }
        return new phn(iBinder);
    }
}
