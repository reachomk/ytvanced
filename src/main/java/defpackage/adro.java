package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: adro */
public final class adro extends adqy implements xcp {
    private static final IntentFilter ac;
    public static final String e = xtl.b("MDX.Cloud");
    public static final Uri g = Uri.parse("https://");
    public static final long h = TimeUnit.MINUTES.toMillis(15);
    public Set A = new HashSet();
    public final Handler B;
    public volatile Handler C;
    public adpw D = adpw.k;
    public aagr E;
    public int F;
    public int G;
    public long H;
    public long I;
    public wxf J;
    public String K = adpw.k.e();
    public String L = adpw.k.a();
    public adih M = adih.UNSUPPORTED;
    public boolean N = false;
    public boolean O = false;
    public final boolean P;
    public long Q;
    public long R;
    public long S;
    public long T;
    public long U;
    public final String V;
    public boolean W;
    public String X = "";
    public int Y = 30;
    public List Z = new ArrayList();
    public aahn aa;
    public adry ab;
    private final adtw ad;
    private final xoi ae;
    private final adly af;
    private final aebl ag;
    private final afpu ah;
    private boolean ai;
    private volatile HandlerThread aj;
    private final adru ak = new adru(this);
    private int al = -1;
    private adpy am = adpy.UNSTARTED;
    private long an;
    public final bcaa f;
    public final Context i;
    public final Handler j;
    public final xci k;
    public final xua l;
    public final xsc m;
    public final adxz n;
    public final waf o;
    public final xhv p;
    public final ajjl q;
    public final List r = new CopyOnWriteArrayList();
    public final acxt s;
    public final aajx t;
    public final adzb u;
    public final int v;
    public final boolean w;
    public final adio x;
    public final adsu y;
    public adpw z = adpw.k;

    public adro(Context context, adtw adtw, xci xci, xua xua, xsc xsc, xoi xoi, xhv xhv, ajjl ajjl, Handler handler, adly adly, adio adio, adsu adsu, adxz adxz, waf waf, bcaa bcaa, acxt acxt, aajx aajx, boolean z, adzb adzb, int i, aebl aebl, afpu afpu, int i2, boolean z2, String str) {
        super(i2);
        this.ad = adtw;
        this.m = xsc;
        this.l = xua;
        this.k = xci;
        this.ae = xoi;
        this.p = xhv;
        this.q = ajjl;
        this.j = handler;
        this.af = adly;
        this.x = adio;
        this.y = adsu;
        this.n = adxz;
        this.o = waf;
        this.i = context;
        this.f = bcaa;
        this.s = acxt;
        this.t = aajx;
        this.P = z;
        this.u = adzb;
        this.v = i;
        this.ag = aebl;
        this.ah = afpu;
        this.w = z2;
        this.V = str;
        HandlerThread handlerThread = new HandlerThread(getClass().getName(), 10);
        handlerThread.start();
        this.B = new adrw(this, handlerThread.getLooper());
        if (this.v == 1) {
            aebl aebl2 = this.ag;
            if (!aebl2.d) {
                xhv xhv2 = (xhv) aebl2.c.get();
                String a = aebl2.a();
                if (!(xhv2.c() && xhv2.e() && a != null && aebl.a(a))) {
                    return;
                }
            }
            Q();
            if (this.C != null) {
                this.C.post(new adrn(this));
            }
        }
    }

    private final synchronized void Q() {
        if (this.aj == null) {
            this.aj = new HandlerThread(getClass().getName(), 10);
            this.aj.start();
            this.C = new Handler(this.aj.getLooper());
        }
    }

    public final synchronized void L() {
        if (this.aj != null) {
            this.aj.quit();
            this.aj = null;
            this.C = null;
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c(adpw adpw) {
        boolean z = true;
        amqw.b(this.z == adpw.k);
        if (this.al != -1) {
            z = false;
        }
        amqw.b(z);
        this.z = adro.d(adpw);
        c(0);
        this.s.a("c_c");
        Handler handler = this.B;
        handler.sendMessage(Message.obtain(handler, 3));
    }

    /* Access modifiers changed, original: protected|final */
    public final void J() {
        Throwable th = new Throwable();
        if (!M()) {
            int i = this.d;
            Handler handler = this.B;
            boolean z = true;
            if (!(i == 2 || i == 7)) {
                z = false;
            }
            Message obtain = Message.obtain(handler, 4, new adrt(z));
            this.B.removeMessages(3);
            this.B.sendMessage(obtain);
        }
    }

    public final boolean G() {
        return this.A.size() == 0;
    }

    public final void b(adpw adpw) {
        amqw.a(adpw.l());
        adpw d = adro.d(adpw);
        if (b()) {
            this.z = adpw;
            return;
        }
        adpw = this.D;
        if (adpw.a(d.a()) && adpw.b(d.e()) && !d.i()) {
            if (this.am != adpy.PLAYING) {
                j();
            }
            return;
        }
        a(adiv.SET_PLAYLIST, adro.e(d));
    }

    public final void j() {
        if (O()) {
            a(adiv.PLAY, adja.b);
        }
    }

    public final void k() {
        if (O()) {
            a(adiv.PAUSE, adja.b);
        }
    }

    public final void m() {
        if (O()) {
            a(adiv.PREVIOUS, adja.b);
        }
    }

    public final void n() {
        if (O()) {
            a(adiv.NEXT, adja.b);
        }
    }

    public final int v() {
        return this.Y;
    }

    public final void a(int i, int i2) {
        if (O()) {
            adja adja = new adja();
            adja.a("delta", String.valueOf(i2));
            adja.a("volume", String.valueOf(i));
            a(adiv.SET_VOLUME, adja);
        }
    }

    public final void a(int i) {
        if (O()) {
            adja adja = new adja();
            adja.a("volume", String.valueOf(i));
            a(adiv.SET_VOLUME, adja);
        }
    }

    public final void a(long j) {
        if (O()) {
            this.an += j - o();
            adja adja = new adja();
            adja.a("newTime", String.valueOf(j / 1000));
            a(adiv.SEEK_TO, adja);
        }
    }

    public final void b(String str) {
        R();
        adja adja = new adja();
        adja.a("videoId", str);
        adja.a("videoSources", "XX");
        a(adiv.ADD_VIDEO, adja);
    }

    public final void a(List list) {
        R();
        adja adja = new adja();
        adja.a("videoIds", TextUtils.join(",", list));
        adja.a("videoSources", "XX");
        a(adiv.ADD_VIDEOS, adja);
    }

    public final void c(String str) {
        R();
        adja adja = new adja();
        adja.a("listId", str);
        a(adiv.ADD_VIDEOS, adja);
    }

    public final void d(String str) {
        R();
        adja adja = new adja();
        adja.a("videoId", str);
        a(adiv.INSERT_VIDEO, adja);
    }

    public final void b(List list) {
        R();
        adja adja = new adja();
        adja.a("videoIds", TextUtils.join(",", list));
        a(adiv.INSERT_VIDEOS, adja);
    }

    public final void e(String str) {
        R();
        adja adja = new adja();
        adja.a("listId", str);
        a(adiv.INSERT_VIDEOS, adja);
    }

    public final void f(String str) {
        R();
        adja adja = new adja();
        adja.a("videoId", str);
        a(adiv.REMOVE_VIDEO, adja);
    }

    public final void D() {
        R();
        if (O() && !TextUtils.isEmpty(s())) {
            l();
        }
        a(adiv.CLEAR_PLAYLIST, adja.b);
    }

    private final void R() {
        if (!this.w) {
            throw new UnsupportedOperationException();
        }
    }

    public final void l() {
        a(adiv.STOP, adja.b);
    }

    public final void i() {
        a(adiv.ON_USER_ACTIVITY, adja.b);
    }

    public final adpy u() {
        return this.am;
    }

    /* Access modifiers changed, original: final */
    public final void a(adpy adpy) {
        if (this.am != adpy) {
            this.am = adpy;
            String str = e;
            String valueOf = String.valueOf(this.am);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 26);
            stringBuilder.append("MDx player state moved to ");
            stringBuilder.append(valueOf);
            xtl.c(str, stringBuilder.toString());
            if (!adpy.a()) {
                this.E = null;
                this.J = null;
            }
            this.k.d(new adpx(this.am));
        }
    }

    public final adis h() {
        return this.x;
    }

    public final String s() {
        return this.D.a();
    }

    public final String t() {
        return this.D.e();
    }

    /* Access modifiers changed, original: final */
    public final void a(adpw adpw, boolean z) {
        int a = amqq.a(adpw.a(), this.D.a()) ^ 1;
        if (!z) {
            this.k.d(new adpt(adpw, 2));
        } else if (a != 0) {
            this.D = adpw;
            this.k.d(new adpt(adpw, 1));
        }
    }

    public final String E() {
        return this.K;
    }

    public final boolean H() {
        return TextUtils.isEmpty(this.L) ^ 1;
    }

    public final String F() {
        return this.L;
    }

    public final long o() {
        if (this.am.b()) {
            return ((this.R + this.an) + this.m.b()) - this.Q;
        }
        return this.R + this.an;
    }

    public final long p() {
        return this.S + (this.W ? this.m.b() - this.Q : 0);
    }

    public final long q() {
        long j = this.T;
        return j > 0 ? (j + this.m.b()) - this.Q : j;
    }

    public final long r() {
        long j = this.U;
        return j != -1 ? ((j + this.an) + this.m.b()) - this.Q : j;
    }

    public final aagr A() {
        return this.E;
    }

    public final wxf B() {
        return this.J;
    }

    @Deprecated
    public final void C() {
        a(adiv.SKIP_AD, adja.b);
    }

    public final void a(String str) {
        if (this.D.m()) {
            adja adja = new adja();
            adja.a("audioTrackId", str);
            adja.a("videoId", this.D.a());
            a(adiv.SET_AUDIO_TRACK, adja);
            return;
        }
        xtl.a(e, "Cannot send audio track, no confirmed video.");
    }

    public final void a(ajis ajis) {
        adry adry = this.ab;
        if (adry != null) {
            this.j.removeCallbacks(adry);
        }
        this.ab = new adry(this, ajis);
        this.j.postDelayed(this.ab, 300);
    }

    public final String g() {
        adik d = this.x.d();
        return d != null ? d.a : null;
    }

    public final boolean b() {
        int i = this.al;
        return i == -1 || i == 0;
    }

    public final boolean M() {
        return this.al == 2;
    }

    public final int d() {
        int i = this.al;
        if (i == -1 || i == 0) {
            return 0;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    String str = e;
                    StringBuilder stringBuilder = new StringBuilder(34);
                    stringBuilder.append("invalid sessionStatus: ");
                    stringBuilder.append(i);
                    Log.wtf(str, stringBuilder.toString());
                }
            }
            return 2;
        }
        return 1;
    }

    public final boolean N() {
        return this.al == 3;
    }

    public final boolean O() {
        return (b() || M() || N()) ? false : true;
    }

    /* Access modifiers changed, original: final */
    public final void c(int i) {
        int i2 = this.al;
        boolean z = true;
        if (i < i2 && i2 != 3) {
            z = false;
        }
        StringBuilder stringBuilder = new StringBuilder(65);
        stringBuilder.append("Retrograde MDX session status change (");
        stringBuilder.append(i2);
        stringBuilder.append(" => ");
        stringBuilder.append(i);
        stringBuilder.append(")");
        amqw.b(z, stringBuilder.toString());
        if (this.al != i) {
            this.al = i;
            String str = e;
            int i3 = this.al;
            String valueOf = String.valueOf(this.x);
            StringBuilder stringBuilder2 = new StringBuilder(valueOf.length() + 49);
            stringBuilder2.append("MDX cloud session status moved to ");
            stringBuilder2.append(i3);
            stringBuilder2.append(" on ");
            stringBuilder2.append(valueOf);
            xtl.c(str, stringBuilder2.toString());
            if (i != 3) {
                this.ad.a(this);
            }
        }
    }

    public final boolean f() {
        adio adio = this.x;
        return adio != null && adio.bt_();
    }

    public final boolean a(String str, String str2) {
        Object str22;
        if (TextUtils.isEmpty(str22)) {
            str22 = this.K;
        }
        return ((!TextUtils.isEmpty(s()) && s().equals(str) && t().equals(str22)) || (TextUtils.isEmpty(s()) && H() && this.L.equals(str))) ? false : true;
    }

    public final void w() {
        a(adiv.DISMISS_AUTONAV, adja.b);
    }

    public final void a(adih adih) {
        adiv adiv = adiv.SET_AUTONAV_MODE;
        adja adja = new adja();
        adja.a("autoplayMode", adih.name());
        a(adiv, adja);
        this.M = adih;
        for (adqg a : this.r) {
            a.a(this.M);
        }
    }

    public final adih x() {
        return this.M;
    }

    public final void a(boolean z) {
        this.N = z;
        S();
    }

    public final boolean y() {
        return this.N;
    }

    public final void b(boolean z) {
        this.O = z;
        S();
    }

    public final boolean z() {
        return this.O;
    }

    public final void a(adqg adqg) {
        this.r.add(adqg);
    }

    public final void b(adqg adqg) {
        this.r.remove(adqg);
    }

    public final void a(adiv adiv, adja adja) {
        String str = e;
        String valueOf = String.valueOf(adiv);
        String adja2 = adja.toString();
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 10) + String.valueOf(adja2).length());
        stringBuilder.append("Sending ");
        stringBuilder.append(valueOf);
        stringBuilder.append(": ");
        stringBuilder.append(adja2);
        xtl.c(str, stringBuilder.toString());
        this.n.a(adiv, adja);
    }

    public final void g(String str) {
        adja adja = new adja();
        adja.a("debugCommand", str);
        a(adiv.SEND_DEBUG_COMMAND, adja);
    }

    private static adpw d(adpw adpw) {
        if (!adpw.l()) {
            return adpw.k;
        }
        long c = adpw.c();
        if (c != -1 && c < 5000) {
            c = 0;
        }
        return adpw.k().a(c).e();
    }

    public final void a(int i, String str, String str2) {
        adja adja = new adja();
        String str3 = "status";
        if (i != 0) {
            String str4 = "text";
            if (i == 1) {
                amqw.a((Object) str);
                amqw.a((Object) str2);
                adja.a(str3, "UPDATED");
                adja.a(str4, str);
                adja.a("unstable speech", str2);
            } else if (i != 2) {
                adja.a(str3, "CANCELED");
            } else {
                amqw.a((Object) str);
                adja.a(str3, "COMPLETED");
                adja.a(str4, str);
            }
        } else {
            adja.a(str3, "INITIATED");
        }
        a(adiv.VOICE_COMMAND, adja);
    }

    public final boolean a(adqd adqd) {
        if (!O()) {
            return false;
        }
        adja adja = new adja();
        adja.a("key", adqd.g);
        a(adiv.DPAD_COMMAND, adja);
        return true;
    }

    public final adio a(adio adio) {
        if (adio.e == null) {
            adim adim = (adim) this.af.a(Arrays.asList(new adjb[]{r0})).get(adio.br_());
            if (adim == null) {
                String str = e;
                String valueOf = String.valueOf(adio.br_());
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 45);
                stringBuilder.append("Unable to retrieve lounge token for screenId ");
                stringBuilder.append(valueOf);
                xtl.a(str, stringBuilder.toString());
                return null;
            }
            adin g = adio.g();
            g.a = adim;
            adio = g.b();
        }
        return adio;
    }

    private final void S() {
        adja adja = new adja();
        adja.a("loopEnabled", String.valueOf(this.N));
        adja.a("shuffleEnabled", String.valueOf(this.O));
        a(adiv.SET_PLAYLIST_MODE, adja);
    }

    public final void a(Context context, boolean z) {
        if (this.n.e() != 0) {
            this.n.a(z);
        }
        if (this.ai) {
            context.unregisterReceiver(this.ak);
            this.ai = false;
        }
        this.k.b(this);
        this.n.a(null);
    }

    public final void a(adio adio, adpw adpw) {
        if (!this.ai) {
            this.i.registerReceiver(this.ak, ac);
            this.ai = true;
        }
        adyd adyd = new adyd();
        adyd.c = adio.e;
        adyd.e = adio.a();
        if (adpw.l()) {
            adyd.a = adiv.SET_PLAYLIST;
            adyd.b = adro.e(adpw);
        }
        adyd.d = true;
        adya a = adyd.a();
        StringBuilder stringBuilder = new StringBuilder(String.format("Connecting to %s with ", new Object[]{adio.br_()}));
        if (a.a()) {
            String str;
            Object[] objArr = new Object[2];
            objArr[0] = a.a;
            if (a.b()) {
                str = a.b;
            } else {
                str = "{}";
            }
            objArr[1] = str;
            stringBuilder.append(String.format("%s : %s", objArr));
        } else {
            stringBuilder.append("no message.");
        }
        xtl.c(e, stringBuilder.toString());
        this.k.a((Object) this);
        this.n.a(new adrs(this));
        this.n.a(a);
        this.n.a();
    }

    private static adja e(adpw adpw) {
        adja adja = new adja();
        adja.a("videoId", adpw.a());
        adja.a("listId", adpw.e());
        adja.a("currentIndex", Integer.toString(adpw.b(adpw.f())));
        List b = adpw.b();
        if (!(b == null || b.isEmpty())) {
            adja.a("videoIds", TextUtils.join(",", b));
        }
        if (adpw.c() != -1) {
            adja.a("currentTime", Long.toString(adpw.c() / 1000));
        }
        String g = adpw.g();
        if (g != null) {
            adja.a("params", g);
        }
        g = adpw.h();
        if (g != null) {
            adja.a("playerParams", g);
        }
        if (adpw.i()) {
            adja.a("forceReloadPlayback", String.valueOf(adpw.i()));
        }
        byte[] j = adpw.j();
        if (j != null) {
            adja.a("clickTrackingParams", Base64.encodeToString(j, 10));
        }
        adja.a("audioOnly", "false");
        return adja;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{aebb.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.n.e() == 2 && !this.ah.g()) {
            this.B.post(new adrp(this));
            return null;
        }
        return clsArr;
    }

    static {
        IntentFilter intentFilter = new IntentFilter();
        ac = intentFilter;
        intentFilter.addAction(adij.LOUNGE_SERVER_CONNECTION_ERROR.toString());
        ac.addAction(adij.CLOUD_SERVICE_NO_NETWORK.toString());
    }

    public final int P() {
        adsu adsu = this.y;
        if (adsu == null) {
            return 4;
        }
        return adsu.P();
    }

    public final void a(adpr adpr, int i) {
        this.ae.a(this.i.getString(adpr.h, new Object[]{this.x.bq_()}));
        b(5);
    }
}
