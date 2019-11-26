package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: alqh */
public final class alqh implements alrw {
    public final bapu a;
    public final Set b = new HashSet();
    private final Executor c;
    private final Executor d;
    private final bcaa e;
    private int f = 2;
    private alrc g;
    private final AtomicBoolean h = new AtomicBoolean();

    public alqh(Executor executor, Executor executor2, bapu bapu, bcaa bcaa) {
        this.c = executor;
        this.d = executor2;
        this.a = bapu;
        this.e = bcaa;
    }

    public final void a(alrz alrz) {
        this.b.add((alrz) amqw.a((Object) alrz));
    }

    public final void a() {
        if (this.h.compareAndSet(false, true)) {
            ((alqt) this.a.get()).addObserver(new alqj(this));
            alsh alsh = (alsh) this.e.get();
            alsh.a.a(alsk.class, "sc_ms");
            alsh.a.a(alsn.class, "sc_mr");
            alsh.a.a(alsl.class, "sc_me");
            alsh.a.a(alsj.class, "sc_ams");
            alsh.a.a(alsi.class, "sc_amr");
            alsh.a.a(alsg.class, "sc_ame");
            alsh.a.a(alsp.class, "sc_ps");
            alsh.a.a(alsm.class, "sc_pe");
        }
        this.d.execute(new alqg(this));
    }

    public final void b() {
        this.d.execute(new alqi(this));
    }

    public final void c() {
        this.d.execute(new alql(this));
    }

    public final boolean d() {
        if (this.h.get()) {
            for (alrc alrc : ((alqt) this.a.get()).d()) {
                if (!alrc.a()) {
                    if (alrc.b()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final synchronized List e() {
        if (this.h.get()) {
            Collection<alrc> d = ((alqt) this.a.get()).d();
            List<alqv> e = ((alqt) this.a.get()).e();
            if (d.isEmpty()) {
                if (e.isEmpty()) {
                    return Collections.emptyList();
                }
            }
            ArrayList arrayList = new ArrayList(d.size() + e.size());
            for (alrc alrc : d) {
                axqs axqs = (axqs) axqt.g.createBuilder();
                anvu a = anvu.a(alrc.h.a);
                axqs.copyOnWrite();
                axqt axqt = (axqt) axqs.instance;
                if (a != null) {
                    axqt.a = 1 | axqt.a;
                    axqt.b = a;
                    String str = alrc.h.c;
                    axqs.copyOnWrite();
                    axqt axqt2 = (axqt) axqs.instance;
                    if (str != null) {
                        axqt2.a |= 16;
                        axqt2.f = str;
                        axqs.a(alrc.h.b);
                        axqs.a(alrc.m);
                        axqs axqs2 = (axqs) ((anxo) ((axqt) ((anxl) axqs.build())).toBuilder());
                        alrc alrc2 = this.g;
                        if (alrc2 != null) {
                            if (amqq.a(alrc2.h.c, alrc.h.c)) {
                                axqs2.a();
                            }
                        }
                        arrayList.add((axqt) ((anxl) axqs2.build()));
                    } else {
                        throw new NullPointerException();
                    }
                }
                throw new NullPointerException();
            }
            for (alqv alqv : e) {
                axqs axqs3 = (axqs) axqt.g.createBuilder();
                axqs3.a(alqv.a);
                int i = alqv.d;
                int i2 = 2;
                if (i == 1) {
                    i2 = 6;
                } else if (i == 2) {
                    i2 = 5;
                } else if (i == 3) {
                    i2 = 4;
                }
                axqs3.a(i2);
                arrayList.add((axqt) ((anxl) axqs3.build()));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public final Uri a(String str, Uri uri) {
        alrc f = f();
        if (f == null) {
            return uri;
        }
        return alrc.a(uri.buildUpon().scheme(f.f.getScheme()).encodedAuthority(f.f.getEncodedAuthority()).appendQueryParameter("orig_host", new Builder().scheme(uri.getScheme()).encodedAuthority(uri.getEncodedAuthority()).build().toString()).appendQueryParameter("scid", str).build(), f.b.n);
    }

    public final synchronized alrc f() {
        Object obj;
        Object obj2;
        int i = this.f;
        Collection<alrc> d = ((alqt) this.a.get()).d();
        alrc alrc = this.g;
        int i2 = 0;
        if (!(alrc != null && alrc.a() && this.g.c())) {
            alrc = alru.a((Collection) d);
            if (alrc == null || !alrc.a()) {
                this.g = null;
            } else {
                if (this.g != alrc) {
                    String.format(Locale.US, "Pinning %s", new Object[]{alrc});
                }
                this.g = alrc;
            }
        }
        alrc = this.g;
        if (alrc == null || !alrc.c()) {
            for (alrc alrc2 : d) {
                if (alrc2.c() && alrc2.b()) {
                    this.f = 1;
                    obj = 1;
                    obj2 = 1;
                    i2 = 1;
                    break;
                }
            }
            this.f = 2;
            obj = 2;
            obj2 = 2;
            i2 = 2;
        } else {
            this.f = 0;
            obj = null;
            obj2 = null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (obj2 == null) {
                        h();
                    }
                }
            } else if (obj == null) {
                h();
            } else if (obj == 2) {
                i();
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                i();
            }
        } else if (!this.b.isEmpty()) {
            this.c.execute(new alqm(this));
        }
        return this.g;
    }

    private final void h() {
        if (!this.b.isEmpty()) {
            this.c.execute(new alqk(this));
        }
    }

    private final void i() {
        if (!this.b.isEmpty()) {
            this.c.execute(new alqn(this));
        }
    }

    public final Future a(String str, String str2) {
        return a(str, str2, false);
    }

    public final Future a(String str) {
        return a(str, null, true);
    }

    private final Future a(String str, String str2, boolean z) {
        afsx a = afsx.a();
        alrc f = f();
        if (f == null) {
            a.a(null);
            return new alqp(a, alri.a);
        }
        alri alri;
        if (f.a()) {
            alre alre = new alre(f, f.f.buildUpon().appendPath("videos").appendPath(str).appendPath("metadata").build(), a, str, str2, z);
            if (z) {
                f.l.d(new alsj());
            } else {
                xci xci = f.l;
                alte alte = f.h;
                xci.d(new alsk());
            }
            f.e.b(alre);
            alri = alre;
        } else {
            f.c.execute(new alrf(a));
            alri = alri.a;
        }
        return new alqp(a, alri);
    }

    public final alte g() {
        alrc f = f();
        return f != null ? f.h : null;
    }
}
