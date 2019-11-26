package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: rwo */
public final class rwo extends qae {
    public rwo(Context context, Looper looper, pyp pyp, pte pte, pth pth) {
        super(context, looper, 51, pyp, pte, pth);
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.phenotype.service.START";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    public final int c() {
        return 9410000;
    }

    public final psc[] t() {
        return rxn.a;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        if (queryLocalInterface instanceof rwq) {
            return (rwq) queryLocalInterface;
        }
        return new rwt(iBinder);
    }
}
