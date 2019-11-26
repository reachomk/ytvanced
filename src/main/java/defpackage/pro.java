package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: pro */
public final class pro extends qae {
    public pro(Context context, Looper looper, pyp pyp, pte pte, pth pth) {
        super(context, looper, 40, pyp, pte, pth);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.clearcut.service.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
    }

    public final int c() {
        return 11925000;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.clearcut.internal.IClearcutLoggerService");
        if (queryLocalInterface instanceof prs) {
            return (prs) queryLocalInterface;
        }
        return new prv(iBinder);
    }
}
