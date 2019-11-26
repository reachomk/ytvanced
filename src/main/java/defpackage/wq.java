package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import java.util.ArrayList;

/* renamed from: wq */
public final class wq {
    public static int d;
    public final ww a;
    public final wd b;
    public final ArrayList c = new ArrayList();

    public wq(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        } else {
            if (pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            if (VERSION.SDK_INT >= 28) {
                this.a = new xf(context, str);
                a(new wt());
                this.a.b(pendingIntent);
            } else if (VERSION.SDK_INT >= 21) {
                this.a = new xd(context, str);
                a(new ws());
                this.a.b(pendingIntent);
            } else {
                this.a = new xb(context, str, componentName, pendingIntent);
            }
            this.b = new wd(context, this);
            if (d == 0) {
                d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        }
    }

    public final void a(wv wvVar) {
        if (wvVar != null) {
            this.a.a(wvVar, new Handler());
        } else {
            this.a.a(null, null);
        }
    }

    public final void a(PendingIntent pendingIntent) {
        this.a.a(pendingIntent);
    }

    public final void a() {
        this.a.a();
    }

    public final void a(boolean z) {
        this.a.a(z);
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((xl) arrayList.get(i)).a();
        }
    }

    public final boolean b() {
        return this.a.b();
    }

    public final void c() {
        this.a.c();
    }

    public final xo d() {
        return this.a.d();
    }

    public final void a(xs xsVar) {
        this.a.a(xsVar);
    }

    public final void a(vj vjVar) {
        this.a.a(vjVar);
    }

    public final void e() {
        this.a.f();
    }

    public final Object f() {
        return this.a.g();
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(wq.class.getClassLoader());
        }
    }

    static xs a(xs xsVar, vj vjVar) {
        if (xsVar == null) {
            return xsVar;
        }
        long j = -1;
        if (xsVar.b == -1) {
            return xsVar;
        }
        int i = xsVar.a;
        if (i != 3 && i != 4 && i != 5) {
            return xsVar;
        }
        long j2 = xsVar.h;
        if (j2 <= 0) {
            return xsVar;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        j2 = ((long) (xsVar.d * ((float) (elapsedRealtime - j2)))) + xsVar.b;
        if (vjVar != null) {
            String str = "android.media.metadata.DURATION";
            if (vjVar.b.containsKey(str)) {
                j = vjVar.a(str);
            }
        }
        long j3 = (j < 0 || j2 <= j) ? j2 >= 0 ? j2 : 0 : j;
        xu xuVar = new xu(xsVar);
        xuVar.a(xsVar.a, j3, xsVar.d, elapsedRealtime);
        return xuVar.a();
    }
}
