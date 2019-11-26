package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: qge */
public final class qge extends qae {
    public qge(Context context, Looper looper, pyp pyp, pte pte, pth pth) {
        super(context, looper, 63, pyp, pte, pth);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.googlehelp.service.GoogleHelpService.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.googlehelp.internal.common.IGoogleHelpService";
    }

    public final int c() {
        return 11925000;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.googlehelp.internal.common.IGoogleHelpService");
        if (queryLocalInterface instanceof qgj) {
            return (qgj) queryLocalInterface;
        }
        return new qgi(iBinder);
    }
}
