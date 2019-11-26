package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.media.MediaRouter.Callback;
import android.media.MediaRouter.RouteInfo;
import android.media.MediaRouter.UserRouteInfo;
import android.util.Log;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: bdc */
class bdc extends bda implements bbu, bca {
    private static final ArrayList o;
    private static final ArrayList p;
    public final Object i;
    public final Object j;
    public int k;
    public boolean l;
    public boolean m;
    public final ArrayList n = new ArrayList();
    private final bdi q;
    private final Object r;
    private final Object s;
    private final ArrayList t = new ArrayList();
    private bby u;
    private bbw v;

    public bdc(Context context, bdi bdi) {
        super(context);
        this.q = bdi;
        this.i = bbr.a(context);
        this.j = f();
        this.r = bbr.a((bca) this);
        this.s = bbr.a(this.i, context.getResources().getString(R.string.mr_user_route_category_name));
        h();
    }

    public final void a() {
    }

    public final void b() {
    }

    public final void c() {
    }

    public final bay a(String str) {
        int c = c(str);
        return c >= 0 ? new bdb(((bde) this.n.get(c)).a) : null;
    }

    public final void b(bao bao) {
        boolean b;
        int i = 0;
        if (bao != null) {
            List a = bao.a().a();
            int size = a.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) a.get(i);
                i2 = !str.equals("android.media.intent.category.LIVE_AUDIO") ? !str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 8388608 : i2 | 2 : i2 | 1;
                i++;
            }
            b = bao.b();
            i = i2;
        } else {
            b = false;
        }
        if (this.k != i || this.l != b) {
            this.k = i;
            this.l = b;
            h();
        }
    }

    public final void b(Object obj) {
        if (f(obj)) {
            d();
        }
    }

    private final void h() {
        e();
        MediaRouter mediaRouter = (MediaRouter) this.i;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        routeCount = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            routeCount |= f(arrayList.get(i2));
        }
        if (routeCount != 0) {
            d();
        }
    }

    private final boolean f(Object obj) {
        if (bdc.i(obj) != null || g(obj) >= 0) {
            return false;
        }
        String format;
        if (g() != obj) {
            format = String.format(Locale.US, "ROUTE_%08x", new Object[]{Integer.valueOf(j(obj).hashCode())});
        } else {
            format = "DEFAULT_ROUTE";
        }
        if (c(format) >= 0) {
            String format2;
            int i = 2;
            while (true) {
                format2 = String.format(Locale.US, "%s_%d", new Object[]{format, Integer.valueOf(i)});
                if (c(format2) < 0) {
                    break;
                }
                i++;
            }
            format = format2;
        }
        bde bde = new bde(obj, format);
        a(bde);
        this.n.add(bde);
        return true;
    }

    public final void c(Object obj) {
        if (bdc.i(obj) == null) {
            int g = g(obj);
            if (g >= 0) {
                this.n.remove(g);
                d();
            }
        }
    }

    public final void d(Object obj) {
        if (bdc.i(obj) == null) {
            int g = g(obj);
            if (g >= 0) {
                a((bde) this.n.get(g));
                d();
            }
        }
    }

    public final void e(Object obj) {
        if (bdc.i(obj) == null) {
            int g = g(obj);
            if (g >= 0) {
                bde bde = (bde) this.n.get(g);
                int a = bbv.a(obj);
                if (a != bde.c.n()) {
                    bal bal = new bal(bde.c);
                    bal.d(a);
                    bde.c = bal.a();
                    d();
                }
            }
        }
    }

    public final void a(Object obj) {
        if (obj == bbr.a(this.i)) {
            bdd i = bdc.i(obj);
            if (i != null) {
                i.a.e();
                return;
            }
            int g = g(obj);
            if (g >= 0) {
                this.q.a(((bde) this.n.get(g)).b);
            }
        }
    }

    public final void a(Object obj, int i) {
        bdd i2 = bdc.i(obj);
        if (i2 != null) {
            i2.a.a(i);
        }
    }

    public final void b(Object obj, int i) {
        bdd i2 = bdc.i(obj);
        if (i2 != null) {
            i2.a.b(i);
        }
    }

    public final void a(bbs bbs) {
        if (bbs.h() != this) {
            Object b = bbr.b(this.i, this.s);
            bdd bdd = new bdd(bbs, b);
            bbv.a(b, bdd);
            bbx.a(b, this.r);
            a(bdd);
            this.t.add(bdd);
            ((MediaRouter) this.i).addUserRoute((UserRouteInfo) b);
            return;
        }
        int g = g(bbr.a(this.i));
        if (g >= 0 && ((bde) this.n.get(g)).b.equals(bbs.b)) {
            bbs.e();
        }
    }

    public final void b(bbs bbs) {
        if (bbs.h() != this) {
            int e = e(bbs);
            if (e >= 0) {
                bdd bdd = (bdd) this.t.remove(e);
                bbv.a(bdd.b, null);
                bbx.a(bdd.b, null);
                ((MediaRouter) this.i).removeUserRoute((UserRouteInfo) bdd.b);
            }
        }
    }

    public final void c(bbs bbs) {
        if (bbs.h() != this) {
            int e = e(bbs);
            if (e >= 0) {
                a((bdd) this.t.get(e));
            }
        }
    }

    public final void d(bbs bbs) {
        if (!bbs.a()) {
            return;
        }
        int e;
        if (bbs.h() != this) {
            e = e(bbs);
            if (e >= 0) {
                h(((bdd) this.t.get(e)).b);
                return;
            }
            return;
        }
        e = c(bbs.b);
        if (e >= 0) {
            h(((bde) this.n.get(e)).a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void d() {
        bba bba = new bba();
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            bba.a(((bde) this.n.get(i)).c);
        }
        a(bba.a());
    }

    /* Access modifiers changed, original: protected|final */
    public final int g(Object obj) {
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            if (((bde) this.n.get(i)).a == obj) {
                return i;
            }
        }
        return -1;
    }

    private final int c(String str) {
        int size = this.n.size();
        for (int i = 0; i < size; i++) {
            if (((bde) this.n.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private final int e(bbs bbs) {
        int size = this.t.size();
        for (int i = 0; i < size; i++) {
            if (((bdd) this.t.get(i)).a == bbs) {
                return i;
            }
        }
        return -1;
    }

    private static bdd i(Object obj) {
        obj = ((RouteInfo) obj).getTag();
        return obj instanceof bdd ? (bdd) obj : null;
    }

    private final void a(bde bde) {
        bal bal = new bal(bde.b, j(bde.a));
        a(bde, bal);
        bde.c = bal.a();
    }

    private final String j(Object obj) {
        CharSequence name = ((RouteInfo) obj).getName(this.a);
        if (name == null) {
            return "";
        }
        return name.toString();
    }

    /* Access modifiers changed, original: protected */
    public void a(bde bde, bal bal) {
        int supportedTypes = ((RouteInfo) bde.a).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            bal.a(o);
        }
        if ((supportedTypes & 2) != 0) {
            bal.a(p);
        }
        bal.b(((RouteInfo) bde.a).getPlaybackType());
        bal.a.putInt("playbackStream", ((RouteInfo) bde.a).getPlaybackStream());
        bal.d(bbv.a(bde.a));
        bal.e(((RouteInfo) bde.a).getVolumeMax());
        bal.f(((RouteInfo) bde.a).getVolumeHandling());
    }

    /* Access modifiers changed, original: protected */
    public void a(bdd bdd) {
        ((UserRouteInfo) bdd.b).setName(bdd.a.d);
        bbx.a(bdd.b, bdd.a.k);
        bbx.b(bdd.b, bdd.a.l);
        bbx.c(bdd.b, bdd.a.o);
        bbx.d(bdd.b, bdd.a.p);
        bbx.e(bdd.b, bdd.a.n);
    }

    /* Access modifiers changed, original: protected */
    public void e() {
        if (this.m) {
            this.m = false;
            bbr.a(this.i, this.j);
        }
        int i = this.k;
        if (i != 0) {
            this.m = true;
            ((MediaRouter) this.i).addCallback(i, (Callback) this.j);
        }
    }

    /* Access modifiers changed, original: protected */
    public Object f() {
        return new bbt(this);
    }

    /* Access modifiers changed, original: protected */
    public void h(Object obj) {
        if (this.u == null) {
            this.u = new bby();
        }
        MediaRouter mediaRouter = (MediaRouter) this.i;
        RouteInfo routeInfo = (RouteInfo) obj;
        if ((routeInfo.getSupportedTypes() & 8388608) == 0) {
            Log.w("MediaRouterJellybean", "Cannot programmatically select non-user route because the platform is missing the selectRouteInt() method.  Media routing may not work.");
        }
        mediaRouter.selectRoute(8388611, routeInfo);
    }

    /* Access modifiers changed, original: protected */
    public Object g() {
        if (this.v == null) {
            this.v = new bbw();
        }
        return ((MediaRouter) this.i).getRouteAt(0);
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        o = arrayList;
        arrayList.add(intentFilter);
        intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_VIDEO");
        arrayList = new ArrayList();
        p = arrayList;
        arrayList.add(intentFilter);
    }
}
