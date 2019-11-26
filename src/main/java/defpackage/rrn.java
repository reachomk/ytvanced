package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: rrn */
public class rrn extends qae {
    private final String a;
    public final rrl b = new rrm(this);

    public rrn(Context context, Looper looper, pte pte, pth pth, String str, pyp pyp) {
        super(context, looper, 23, pyp, pte, pth);
        this.a = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final int c() {
        return 11925000;
    }

    /* Access modifiers changed, original: protected|final */
    public final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.a);
        return bundle;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof rqw) {
            return (rqw) queryLocalInterface;
        }
        return new rqz(iBinder);
    }
}
