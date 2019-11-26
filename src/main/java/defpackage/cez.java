package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: cez */
public final class cez implements Callback {
    private static final cfb f = new cfc();
    private volatile brl a;
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Handler d;
    private final cfb e;

    public cez(cfb cfb) {
        zj zjVar = new zj();
        zjVar = new zj();
        Bundle bundle = new Bundle();
        if (cfb == null) {
            cfb = f;
        }
        this.e = cfb;
        this.d = new Handler(Looper.getMainLooper(), this);
    }

    public final brl a(Context context) {
        if (context != null) {
            if (chv.b() && !(context instanceof Application)) {
                if (context instanceof nn) {
                    return a((nn) context);
                }
                if (context instanceof Activity) {
                    brl a;
                    context = (Activity) context;
                    if (chv.c()) {
                        a = a(context.getApplicationContext());
                    } else {
                        cez.b(context);
                        cex a2 = a(context.getFragmentManager(), cez.a((Activity) context));
                        brl brl = a2.c;
                        if (brl != null) {
                            a = brl;
                        } else {
                            a = this.e.a(bqy.a(context), a2.a, a2.b, context);
                            a2.c = a;
                            return a;
                        }
                    }
                    return a;
                } else if (context instanceof ContextWrapper) {
                    return a(((ContextWrapper) context).getBaseContext());
                }
            }
            if (this.a == null) {
                synchronized (this) {
                    if (this.a == null) {
                        this.a = this.e.a(bqy.a(context.getApplicationContext()), new ceo(), new cet(), context.getApplicationContext());
                    }
                }
            }
            return this.a;
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final brl a(nn nnVar) {
        if (chv.c()) {
            return a(nnVar.getApplicationContext());
        }
        cez.b(nnVar);
        cfg a = a(nnVar.f(), cez.a((Activity) nnVar));
        brl brl = a.c;
        if (brl != null) {
            return brl;
        }
        brl a2 = this.e.a(bqy.a((Context) nnVar), a.a, a.b, nnVar);
        a.c = a2;
        return a2;
    }

    private static void b(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    public final cex a(FragmentManager fragmentManager, boolean z) {
        String str = "com.bumptech.glide.manager";
        cex cex = (cex) fragmentManager.findFragmentByTag(str);
        if (cex == null) {
            cex = (cex) this.b.get(fragmentManager);
            if (cex == null) {
                cex = new cex();
                if (z) {
                    cex.a.a();
                }
                this.b.put(fragmentManager, cex);
                fragmentManager.beginTransaction().add(cex, str).commitAllowingStateLoss();
                this.d.obtainMessage(1, fragmentManager).sendToTarget();
            }
        }
        return cex;
    }

    public static boolean a(Activity activity) {
        return activity.isFinishing() ^ 1;
    }

    public final cfg a(nt ntVar, boolean z) {
        String str = "com.bumptech.glide.manager";
        cfg cfg = (cfg) ntVar.a(str);
        if (cfg == null) {
            cfg = (cfg) this.c.get(ntVar);
            if (cfg == null) {
                cfg = new cfg();
                if (z) {
                    cfg.a.a();
                }
                this.c.put(ntVar, cfg);
                ntVar.a().a((nf) cfg, str).b();
                this.d.obtainMessage(2, ntVar).sendToTarget();
            }
        }
        return cfg;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    public final boolean handleMessage(android.os.Message r5) {
        /*
        r4 = this;
        r0 = r5.what;
        r1 = 0;
        r2 = 1;
        if (r0 == r2) goto L_0x0018;
    L_0x0006:
        r3 = 2;
        if (r0 == r3) goto L_0x000c;
    L_0x0009:
        r5 = 0;
        r0 = r1;
        goto L_0x0026;
    L_0x000c:
        r5 = r5.obj;
        r1 = r5;
        r1 = (defpackage.nt) r1;
        r5 = r4.c;
        r5 = r5.remove(r1);
        goto L_0x0023;
    L_0x0018:
        r5 = r5.obj;
        r1 = r5;
        r1 = (android.app.FragmentManager) r1;
        r5 = r4.b;
        r5 = r5.remove(r1);
    L_0x0023:
        r0 = r1;
        r1 = r5;
        r5 = 1;
    L_0x0026:
        if (r5 == 0) goto L_0x0052;
    L_0x0028:
        if (r1 != 0) goto L_0x0052;
    L_0x002a:
        r1 = 5;
        r3 = "RMRetriever";
        r1 = android.util.Log.isLoggable(r3, r1);
        if (r1 == 0) goto L_0x0052;
    L_0x0033:
        r5 = java.lang.String.valueOf(r0);
        r0 = r5.length();
        r1 = new java.lang.StringBuilder;
        r0 = r0 + 61;
        r1.<init>(r0);
        r0 = "Failed to remove expected request manager fragment, manager: ";
        r1.append(r0);
        r1.append(r5);
        r5 = r1.toString();
        android.util.Log.w(r3, r5);
        return r2;
    L_0x0052:
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cez.handleMessage(android.os.Message):boolean");
    }
}
