package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.view.Display;
import android.view.WindowManager;
import com.google.protos.youtube.api.innertube.StickerCatalogRendererOuterClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: gid */
public final class gid extends apa implements gib {
    public static final Object c = new Object();
    public final Handler d;
    public final List e = new ArrayList();
    public final gjd f;
    public final gjm g;
    public gha h;
    public gig i;
    public int j = 4;
    public boolean k;
    private final Context l;
    private final int m;
    private final HandlerThread n;
    private final Set o = Collections.synchronizedSet(new HashSet());
    private final ghm p;
    private final giv q;
    private final ggm r;
    private final giw s;
    private final gjq t;
    private final gjg u;
    private final acwa v;
    private final gia w;

    public gid(Context context, ghm ghm, giv giv, ggm ggm, giw giw, gjq gjq, gjg gjg, acwa acwa, gjd gjd, gia gia, gjm gjm) {
        this.l = context;
        this.p = ghm;
        this.q = giv;
        this.r = ggm;
        this.s = giw;
        this.t = gjq;
        this.u = gjg;
        this.v = acwa;
        this.w = gia;
        this.f = gjd;
        this.g = gjm;
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.m = point.x;
        this.d = new Handler(this.l.getMainLooper());
        this.n = new HandlerThread(gid.class.getSimpleName());
        this.n.start();
        Handler handler = new Handler(this.n.getLooper());
        gjm gjm2 = this.g;
        gjm2.c.execute(new gjp(gjm2));
    }

    public final int a(int i) {
        axak axak = (axak) this.e.get(i);
        anxr access$000 = anxl.checkIsLite(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
        axak.a(access$000);
        if (!axak.h.a(access$000.d)) {
            return aocf.UNSET_ENUM_VALUE;
        }
        axak axak2 = (axak) this.e.get(i);
        anxr access$0002 = anxl.checkIsLite(StickerCatalogRendererOuterClass.dynamicStickerRenderer);
        axak2.a(access$0002);
        Object b = axak2.h.b(access$0002.d);
        if (b == null) {
            b = access$0002.b;
        } else {
            b = access$0002.a(b);
        }
        i = aqzp.a(((axui) b).b);
        if (i == 0) {
            i = 1;
        }
        return i - 1;
    }

    public final int a() {
        return this.e.size();
    }

    public final boolean m() {
        return this.k;
    }

    public final void a(Runnable runnable) {
        this.d.postAtTime(runnable, c, SystemClock.uptimeMillis());
    }

    public final acvx b() {
        return this.v.t();
    }

    public final Set c() {
        return this.o;
    }

    public final gig d() {
        return this.i;
    }

    public final ghm f() {
        return this.p;
    }

    public final giv g() {
        return this.q;
    }

    public final ggm h() {
        return this.r;
    }

    public final giw i() {
        return this.s;
    }

    public final gjq j() {
        return this.t;
    }

    public final gjg k() {
        return this.u;
    }

    public final gia l() {
        return this.w;
    }

    public final void a(axak axak) {
        a(gjh.a(axak));
        int indexOf = this.e.indexOf(axak);
        this.e.remove(axak);
        e(indexOf);
    }

    public final void a(Uri uri) {
        this.o.remove(uri);
        if (this.o.isEmpty()) {
            gig gig = this.i;
            if (gig != null) {
                gig.g(false);
            }
        }
    }

    public final gha e() {
        return this.h;
    }
}
