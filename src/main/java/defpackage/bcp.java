package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: bcp */
final class bcp {
    public final Context a;
    public final Handler b;
    public boolean c;
    public final BroadcastReceiver d = new bcs(this);
    public final Runnable e = new bcr(this);
    private final bcu f;
    private final PackageManager g;
    private final ArrayList h = new ArrayList();

    public bcp(Context context, bcu bcu) {
        this.a = context;
        this.f = bcu;
        this.b = new Handler();
        this.g = context.getPackageManager();
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        if (this.c) {
            bcf bcf;
            Iterator it = this.g.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i = 0;
            while (true) {
                int i2 = -1;
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = ((ResolveInfo) it.next()).serviceInfo;
                if (serviceInfo != null) {
                    int i3;
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = this.h.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        bcf bcf2 = (bcf) this.h.get(i4);
                        if (bcf2.i.getPackageName().equals(str) && bcf2.i.getClassName().equals(str2)) {
                            i2 = i4;
                            break;
                        }
                    }
                    if (i2 < 0) {
                        bcf bcf3 = new bcf(this.a, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        bcf3.a();
                        i3 = i + 1;
                        this.h.add(i, bcf3);
                        this.f.a(bcf3);
                    } else if (i2 >= i) {
                        bcf = (bcf) this.h.get(i2);
                        bcf.a();
                        if (bcf.m == null && bcf.c()) {
                            bcf.e();
                            bcf.d();
                        }
                        i3 = i + 1;
                        Collections.swap(this.h, i2, i);
                    }
                    i = i3;
                }
            }
            if (i < this.h.size()) {
                for (int size2 = this.h.size() - 1; size2 >= i; size2--) {
                    bcf = (bcf) this.h.get(size2);
                    this.f.b(bcf);
                    this.h.remove(bcf);
                    if (bcf.l) {
                        bcf.l = false;
                        bcf.b();
                    }
                }
            }
        }
    }
}
