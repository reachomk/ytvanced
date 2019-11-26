package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: anmw */
public final class anmw extends qae {
    public static final pso a = new pso("AppIndexing.API", c, b);
    private static final psv b = new psv();
    private static final psq c = new anmz();

    public anmw(Context context, Looper looper, pyp pyp, pte pte, pth pth) {
        super(context, looper, 113, pyp, pte, pth);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.icing.APP_INDEXING_SERVICE";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.firebase.appindexing.internal.IAppIndexingService";
    }

    public final int c() {
        return 12600000;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.appindexing.internal.IAppIndexingService");
        if (queryLocalInterface instanceof anmk) {
            return (anmk) queryLocalInterface;
        }
        return new anmn(iBinder);
    }
}
