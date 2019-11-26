package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: tua */
final class tua implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public final List a = new CopyOnWriteArrayList();
    public final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger c = new AtomicInteger();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private Boolean h;
    private volatile String i;
    private volatile Activity j;

    private tua() {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        activity.getApplicationContext();
        this.c.incrementAndGet();
        this.j = null;
        for (ttp ttp : this.a) {
            if (ttp instanceof tto) {
                ((tto) ttp).b();
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        activity.getApplicationContext();
        this.d.incrementAndGet();
        this.j = null;
        a(activity);
        for (ttp ttp : this.a) {
            if (ttp instanceof ttv) {
                ((ttv) ttp).a(activity);
            }
        }
    }

    public final void onActivityResumed(Activity activity) {
        activity.getApplicationContext();
        this.b.incrementAndGet();
        this.j = null;
        this.i = activity.getClass().getSimpleName();
        for (ttp ttp : this.a) {
            if (ttp instanceof ttt) {
                ((ttt) ttp).b(activity);
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        activity.getApplicationContext();
        this.e.incrementAndGet();
        this.i = null;
        for (ttp ttp : this.a) {
            if (ttp instanceof ttq) {
                ((ttq) ttp).a(activity);
            }
        }
    }

    public final void onActivityStopped(Activity activity) {
        activity.getApplicationContext();
        this.f.incrementAndGet();
        this.j = activity;
        for (ttp ttp : this.a) {
            if (ttp instanceof ttu) {
                ((ttu) ttp).a();
            }
        }
        a(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        activity.getApplicationContext();
        for (ttp ttp : this.a) {
            if (ttp instanceof tts) {
                ((tts) ttp).a();
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        activity.getApplicationContext();
        this.g.incrementAndGet();
        this.j = null;
        for (ttp ttp : this.a) {
            if (ttp instanceof ttr) {
                ((ttr) ttp).a(activity);
            }
        }
    }

    public final void onTrimMemory(int i) {
        for (ttp ttp : this.a) {
            if (ttp instanceof ttz) {
                ((ttz) ttp).a();
            }
        }
        if (i >= 20 && this.j != null) {
            a(Boolean.valueOf(false), this.j);
        }
        this.j = null;
    }

    private final void a(Activity activity) {
        a(Boolean.valueOf(ucv.b(activity.getApplicationContext())), activity);
    }

    private final void a(Boolean bool, Activity activity) {
        String str = "AppLifecycleTracker";
        if (bool.equals(this.h)) {
            tyv.c(str, "App foreground state unchanged: inForeground ? %b", bool);
            return;
        }
        this.h = bool;
        if (bool.booleanValue()) {
            tyv.c(str, "App transition to foreground", new Object[0]);
            for (ttp ttp : this.a) {
                if (ttp instanceof ttw) {
                    ((ttw) ttp).a(activity);
                }
            }
        } else {
            tyv.c(str, "App transition to background", new Object[0]);
            for (ttp ttp2 : this.a) {
                if (ttp2 instanceof ttx) {
                    ((ttx) ttp2).b(activity);
                }
            }
        }
    }

    /* synthetic */ tua(byte b) {
    }
}
