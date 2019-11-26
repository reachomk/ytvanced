package defpackage;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: egv */
public final class egv implements t, xcp {
    public final vur a;
    public final Executor b;
    private final bcaa c;
    private final egr d;
    private final afqv e;
    private final xci f;
    private final ajam g;
    private final zyw h;
    private bcuo i;

    public egv(bcaa bcaa, egr egr, vur vur, afqv afqv, Executor executor, xci xci, ajam ajam, zyw zyw) {
        this.c = bcaa;
        this.d = egr;
        this.a = vur;
        this.e = afqv;
        this.b = executor;
        this.f = xci;
        this.g = ajam;
        this.h = zyw;
    }

    public final void B_() {
    }

    public final void C_() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public final void aw_() {
        if (foh.w(this.h)) {
            this.i = this.g.Q().a.f().a(emg.a(this.h, 1)).a(new egy(this), egx.a);
        } else {
            this.f.a((Object) this);
        }
    }

    public final void a(af afVar) {
        if (foh.w(this.h)) {
            this.i.b();
            this.i = null;
            return;
        }
        this.f.b(this);
    }

    public final Uri a(String str, Map map) {
        Uri d = xvt.d(str);
        if (d == null) {
            return null;
        }
        Object[] objArr = (aftl[]) xsb.a(map, (Object) "MacrosConverters.CustomConvertersKey", aftl[].class);
        Object str2;
        try {
            str2 = ((afti) this.c.get()).a(d, objArr != null ? (aftl[]) xsb.a(objArr, this.d) : new aftl[]{this.d});
            return str2;
        } catch (xwd unused) {
            str2 = String.valueOf(str2);
            String str3 = "Failed macro substitution for URI: ";
            xtl.d(str2.length() == 0 ? new String(str3) : str3.concat(str2));
            return d;
        }
    }

    public final void a(Uri uri, aule aule) {
        if (uri != null && aule != null) {
            afqy a = afqv.a("appendpointlogging");
            a.a(uri);
            a.e = false;
            a.a(new acyp((aula[]) aule.c.toArray(new aula[0])));
            this.e.a(a, aftp.b);
        }
    }

    public final void a(ahkn ahkn) {
        this.d.a = ahkn.e;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkn.class};
        } else if (i == 0) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
