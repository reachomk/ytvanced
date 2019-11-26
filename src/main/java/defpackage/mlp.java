package defpackage;

import android.content.Context;
import android.os.Handler;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.security.AccessControlException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mlp */
public final class mlp {
    public static final AtomicReference a = new AtomicReference();
    private static final Map k = new HashMap();
    public final mni b;
    public final String c;
    public final Context d;
    public final boolean e;
    public mlm f;
    public bcaa g;
    public abjm h;
    public String i;
    public int j;
    private final mro l;
    private xdp m;
    private mnd n;
    private mlh o;

    public static void a(boolean z, mlx mlx, Handler handler, Context context, String str, String str2, String str3, String str4, boolean z2) {
        mlw mlw = new mlw(z, context, str, str2, str3, str4, z2, mlx);
        Handler handler2 = handler;
        handler.post(mlw);
    }

    static mlp a(boolean z, Context context, String str, String str2, String str3, String str4, boolean z2) {
        try {
            mni mni = new mni(str2, str3, str);
            mlp mlp;
            if (z) {
                mlp = new mlp(context, str4, mni, z2);
                mlp.e();
                return mlp;
            }
            mlp = (mlp) k.get(mni);
            if (mlp == null) {
                mlp = (mlp) a.get();
                if (mlp == null || !mlp.b.equals(mni)) {
                    mlp = new mlp(context, str4, mni, z2);
                    mlp.e();
                } else {
                    a.set(null);
                }
                k.put(mni, mlp);
            }
            return mlp;
        } catch (IllegalArgumentException e) {
            xtl.c(e.getMessage());
            throw e;
        }
    }

    private mlp(Context context, String str, mni mni, boolean z) {
        this.d = context;
        this.c = str;
        this.b = mni;
        this.e = z;
        this.l = new mro(context, str, mni);
    }

    /* Access modifiers changed, original: protected|final */
    public final zzf a() {
        return this.n.b();
    }

    private final aaly c() {
        return this.n.c();
    }

    private final void d() {
        this.m = xdo.a(this.d);
        mng mng = (mng) ((mng) ((mng) ((mng) ((mng) mox.d().a(this.d)).b("android_embedded_player")).a((amro) new mls(this))).a(this.m)).a(Boolean.valueOf(false));
        int a = this.b.a();
        StringBuilder stringBuilder = new StringBuilder(21);
        stringBuilder.append(a);
        stringBuilder.append("_partition");
        this.n = (mnd) ((mng) ((mng) mng.a(stringBuilder.toString())).a((xax) new xaz(new mlr(this)))).a();
        this.n.J().execute(new xth(this.n.H()));
        c().a(this.n.J(), zyt.a);
        xtb I = this.n.I();
        if (!xtb.a) {
            I.b.execute(new xte(I));
        }
    }

    private final void a(mll mll) {
        boolean z;
        try {
            arcm arcm = ((arvt) bddw.a(c().a.f()).a()).w;
            if (arcm == null) {
                arcm = arcm.e;
            }
            z = arcm.c;
        } catch (Exception unused) {
            z = false;
        }
        mll = mll.a(ahhq.n().a(new mlu(this)).c(z).a());
        mrn mrn = new mrn(this.e, this.b);
        afmu w = a().w();
        w.a = mrn;
        w.b = afmn.ANDROID_EMBEDDED_PLAYER;
        w.d = new mly(this);
        w.e = new mlv(this);
        mll = mll.a(w.a()).a(acts.a);
        zxo zxo = new zxo();
        zxo.c = ashr.ANDROID_EMBEDDED_PLAYER;
        zxo.d = new mqw();
        mll = mll.a(zxo.a()).a(this.l).a(vdj.a(ammm.a(this.d)).b(true).c(true).d(true).a(true).a());
        if (this.o == null) {
            this.o = new mlh(this.b, this.c);
        }
        mll = mll.a(this.o).a(this.n).a(this.m).a(this.n.a());
        Context context = this.d;
        mni mni = this.b;
        mll.a(new mmu(new mmr(context, mni.c, mni.a))).a(new mlo());
    }

    private final void e() {
        xak.a();
        mll p;
        if (this.e) {
            d();
            p = mpb.p();
            a(p);
            p.a(new uqn());
            mrk b = p.b();
            b.getClass();
            this.g = new mlt(b);
            this.f = b;
        } else {
            d();
            p = mnh.p();
            a(p);
            this.f = p.a();
        }
        afpc.a(this.f.b());
        this.f.oC().a(this.f.c());
        this.f.k().b();
        this.f.l().b();
        this.f.j().b();
        this.f.o().a();
        this.h = this.f.g();
    }

    public final void a(String str, afqd afqd) {
        if (this.e) {
            bcaa bcaa = this.g;
            if (bcaa != null) {
                ((uys) bcaa.get()).a(str, afqd);
                return;
            }
        }
        throw new AccessControlException("Permission denied: unauthorized usage of SignIn API");
    }

    public final void a(boolean z) {
        amqw.b(this.j > 0);
        int i = this.j - 1;
        this.j = i;
        if (i <= 0) {
            k.remove(this.b);
            if (z) {
                a.set(this);
            }
        }
    }

    public final akkq b() {
        return this.f.h();
    }

    static {
        xtl.a("YouTubeAndroidPlayerAPI");
    }

    public static int a(Exception exception) {
        if (exception instanceof xuo) {
            return 12;
        }
        return ((exception instanceof UnknownHostException) || (exception instanceof SocketException) || (exception instanceof xhp)) ? 10 : 2;
    }
}
