package defpackage;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Bundle;

/* renamed from: pcz */
final class pcz extends rkh {
    public final /* synthetic */ pda a;

    public final void a(Bundle bundle) {
        synchronized (this.a.e) {
            Context context = this.a;
            if (context.f) {
                return;
            }
            int callingUid = Binder.getCallingUid();
            if (callingUid != context.c) {
                if (qbj.a(context, callingUid, "com.google.android.gms")) {
                    try {
                        if (psk.a(context).a(context.getPackageManager().getPackageInfo("com.google.android.gms", 64))) {
                            context.c = callingUid;
                        }
                    } catch (NameNotFoundException unused) {
                    }
                }
                throw new SecurityException("Caller is not GooglePlayServices.");
            }
            this.a.d.execute(new pdb(this, bundle));
        }
    }

    /* synthetic */ pcz(pda pda) {
        this.a = pda;
    }
}
