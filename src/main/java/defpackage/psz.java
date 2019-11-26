package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.Collections;
import java.util.Set;

/* renamed from: psz */
public class psz {
    public final Context a;
    public final pso b;
    public final pxd c;
    public final Looper d;
    public final int e;
    public final ptd f;
    public final pty g;
    private final pun h;

    @Deprecated
    public psz(Context context, pso pso, Looper looper, pun pun) {
        ptb ptb = new ptb();
        pzr.a((Object) looper, (Object) "Looper must not be null.");
        ptb.a = looper;
        ptb.a(pun);
        this(context, pso, ptb.a());
    }

    public psz(Activity activity, pso pso, ptc ptc) {
        pzr.a((Object) activity, (Object) "Null activity is not permitted.");
        pzr.a((Object) pso, (Object) "Api must not be null.");
        pzr.a((Object) ptc, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = activity.getApplicationContext();
        this.b = pso;
        this.d = ptc.c;
        this.c = pxd.a(this.b);
        this.f = new pwd(this);
        this.g = pty.a(this.a);
        this.e = this.g.a();
        this.h = ptc.b;
        pty pty = this.g;
        Object obj = this.c;
        puf a = LifecycleCallback.a(new pud(activity));
        puv puv = (puv) a.a("ConnectionlessLifecycleHelper", puv.class);
        if (puv == null) {
            puv = new puv(a);
        }
        puv.c = pty;
        pzr.a(obj, (Object) "ApiKey cannot be null");
        puv.b.add(obj);
        pty.a(puv);
        this.g.a(this);
    }

    public psz(Context context, pso pso, ptc ptc) {
        pzr.a((Object) context, (Object) "Null context is not permitted.");
        pzr.a((Object) pso, (Object) "Api must not be null.");
        pzr.a((Object) ptc, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = context.getApplicationContext();
        this.b = pso;
        this.d = ptc.c;
        this.c = pxd.a(this.b);
        this.f = new pwd(this);
        this.g = pty.a(this.a);
        this.e = this.g.a();
        this.h = ptc.b;
        this.g.a(this);
    }

    @Deprecated
    public psz(Context context, pso pso, pun pun) {
        ptb ptb = new ptb();
        ptb.a(pun);
        this(context, pso, ptb.a());
    }

    public final pts a(int i, pts pts) {
        pts.f();
        pty pty = this.g;
        pwz pwz = new pwz(pts);
        Handler handler = pty.m;
        handler.sendMessage(handler.obtainMessage(4, new pwl(pwz, pty.i.get(), this)));
        return pts;
    }

    private final ryi a(int i, pup pup) {
        ryl ryl = new ryl();
        pty pty = this.g;
        pxb pxb = new pxb(i, pup, ryl, this.h);
        Handler handler = pty.m;
        handler.sendMessage(handler.obtainMessage(4, new pwl(pxb, pty.i.get(), this)));
        return ryl.a;
    }

    public final ryi a(pup pup) {
        return a(0, pup);
    }

    public final ryi b(pup pup) {
        return a(1, pup);
    }

    public final pys a() {
        pys pys = new pys();
        pys.a = null;
        Set emptySet = Collections.emptySet();
        if (pys.b == null) {
            pys.b = new zl();
        }
        pys.b.addAll(emptySet);
        pys.d = this.a.getClass().getName();
        pys.c = this.a.getPackageName();
        return pys;
    }
}
