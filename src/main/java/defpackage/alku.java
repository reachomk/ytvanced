package defpackage;

import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: alku */
public final class alku implements abkh {
    public final List a = new ArrayList();
    private final zzf b;

    public alku(zzf zzf, Executor executor, PackageManager packageManager) {
        this.b = (zzf) amqw.a((Object) zzf);
        amqw.a((Object) executor);
        amqw.a((Object) packageManager);
        executor.execute(new alkx(this, packageManager));
    }

    public final void a(abkg abkg) {
        aovk i = this.b.i();
        if (i != null) {
            synchronized (this) {
                for (String a : this.a) {
                    Integer a2 = alpq.a(a, i);
                    if (a2 != null) {
                        abkg.b(a2.intValue());
                    }
                }
            }
        }
    }
}
