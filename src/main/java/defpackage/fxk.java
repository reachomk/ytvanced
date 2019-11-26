package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.protos.youtube.api.innertube.AppIsInstalledCommandOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: fxk */
public final class fxk implements aaap {
    private final aaas a;
    private final Executor b;
    private final PackageManager c;

    public fxk(aaas aaas, Executor executor, Context context) {
        this.a = aaas;
        this.b = executor;
        this.c = (PackageManager) amqw.a(context.getPackageManager());
    }

    public final void a(apxu apxu, Map map) {
        anxr access$000 = anxl.checkIsLite(AppIsInstalledCommandOuterClass.appIsInstalledCommand);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(AppIsInstalledCommandOuterClass.appIsInstalledCommand);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            aowj aowj = (aowj) b;
            if (!aowj.b.isEmpty()) {
                if (aowj.c) {
                    a(aowj, map);
                } else {
                    this.b.execute(new fxj(this, aowj, map));
                }
            }
        }
    }

    public final void a(aowj aowj, Map map) {
        ApplicationInfo applicationInfo;
        aaas aaas;
        try {
            applicationInfo = this.c.getApplicationInfo(aowj.b, 0);
        } catch (NameNotFoundException unused) {
            applicationInfo = null;
        }
        apxu apxu;
        if (applicationInfo == null || (aowj.d && !applicationInfo.enabled)) {
            if ((aowj.a & 16) != 0) {
                aaas = this.a;
                apxu = aowj.f;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, map);
            }
        } else if ((aowj.a & 8) != 0) {
            aaas = this.a;
            apxu = aowj.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, map);
        }
        if ((aowj.a & 32) != 0) {
            aaas = this.a;
            apxu apxu2 = aowj.g;
            if (apxu2 == null) {
                apxu2 = apxu.d;
            }
            aaas.a(apxu2, map);
        }
    }
}
