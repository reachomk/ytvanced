package defpackage;

import android.content.res.Resources;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;

/* renamed from: adjy */
public final class adjy extends aczd implements adjs {
    public static final String d = xtl.b("MDX.ContinueWatchingNotification");
    private static final long g = TimeUnit.HOURS.toMillis(3);
    public final adjz e;
    public final xsc f;
    private final long h;
    private final long i;
    private final adju j;
    private final adhn k;
    private final aizy l;
    private final adlu m;
    private final bcaa n;
    private final ajam o;
    private final bdfu p = new bdfu();
    private adka q;
    private adkc r;
    private final adjw s = new adkb(this);

    public adjy(adju adju, adhn adhn, aizy aizy, adlu adlu, adjz adjz, xsc xsc, bcaa bcaa, ajam ajam, adae adae, int i, int i2) {
        super(adae);
        this.j = adju;
        this.k = adhn;
        this.l = aizy;
        this.m = adlu;
        this.e = adjz;
        this.f = xsc;
        this.n = bcaa;
        this.o = ajam;
        this.i = TimeUnit.SECONDS.toMillis((long) i2);
        this.h = TimeUnit.DAYS.toMillis((long) i);
    }

    public final String b() {
        return "continue-watching";
    }

    public final boolean e() {
        long c = this.e.c();
        boolean z = false;
        if ((((Boolean) this.n.get()).booleanValue() || c == 0 || this.f.a() - c >= this.h) && !this.e.a.getBoolean("mdx.disabled_by_user", false)) {
            bbs a = this.m.a();
            if (a != null) {
                ajmq q = this.l.q();
                if (q != null) {
                    aakj b = q.b();
                    if (b != null) {
                        long o = this.l.o();
                        long d = q.d();
                        o -= d;
                        String valueOf = String.valueOf(this.l.k());
                        String str = "videoId:";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str);
                        } else {
                            str.concat(valueOf);
                        }
                        valueOf = String.valueOf(this.l.m());
                        str = "playlistId:";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str);
                        } else {
                            str.concat(valueOf);
                        }
                        valueOf = String.valueOf(this.l.m());
                        str = "playlistIndex:";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str);
                        } else {
                            str.concat(valueOf);
                        }
                        if (o >= this.i) {
                            String str2 = a.d;
                            aczq a2 = aczq.g().b(str2).a(a.c).b(this.k.e(a)).a(adpw.n().a(this.l.k()).a(d).b(this.l.m()).a(this.l.l()).e()).a();
                            adju adju = this.j;
                            String c2 = b.c();
                            aaft g = b.g();
                            adjw adjw = this.s;
                            Resources resources = adju.a.getResources();
                            if (g != null) {
                                aafo a3 = g.a(resources.getDimensionPixelSize(R.dimen.notification_big_picture_icon_width), resources.getDimensionPixelSize(R.dimen.notification_big_picture_icon_height));
                                if (a3 != null) {
                                    adju.c.b(a3.a(), new adjx(adju, resources, c2, str2, a2, adjw));
                                    return true;
                                }
                            }
                            z = true;
                        }
                    }
                }
            }
        }
        return z;
    }

    public final void h() {
        this.j.d.a("continue-watching", 6);
        this.e.a();
    }

    public final void f() {
        xak.a();
        if (this.q == null) {
            this.q = new adka(this);
            this.p.a(this.q.a(this.o));
        }
        if (this.r == null) {
            this.r = new adkc(this);
            this.p.a(this.r.a(this.o));
        }
    }

    public final void g() {
        xak.a();
        if (this.q != null) {
            this.p.a();
            this.q = null;
        }
    }

    public final adac c() {
        return adac.e().a(this.e.b()).a();
    }

    public final void a(amul amul) {
        if (this.e.b()) {
            String string = this.e.a.getString("mdx.continue_watching_route_id", null);
            if (!amqu.a(string)) {
                amxn amxn = (amxn) amul.listIterator();
                while (amxn.hasNext()) {
                    if (adhn.a(string, ((bbs) amxn.next()).c) && this.f.a() - this.e.c() < g) {
                        return;
                    }
                }
                h();
            }
        }
    }

    public final void d() {
        h();
    }
}
