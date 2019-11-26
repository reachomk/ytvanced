package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: adnh */
public final class adnh extends aiju implements adqi, xcp {
    public static final String a = xtl.b("MDX.PlaybackQueue");
    public final adqf b;
    public final adoe c;
    public final adnn d = new adnn();
    public final bcaa e;
    public final Executor f;
    public final Executor g;
    public adqe h;
    public final adqg i = new adnq(this);
    public boolean j = false;
    public String k;
    public String l;
    private final airt o;
    private final xua p;
    private boolean q;

    public adnh(adqf adqf, adoe adoe, bcaa bcaa, aiku aiku, airt airt, xua xua, Executor executor, Executor executor2) {
        super(new aijv(), aiku);
        this.b = adqf;
        this.c = adoe;
        this.e = bcaa;
        this.o = airt;
        this.p = xua;
        this.f = executor;
        this.g = executor2;
    }

    private static boolean c(int i) {
        return i == 0;
    }

    public final void a(adqe adqe) {
    }

    public final boolean a() {
        return false;
    }

    public final void a(int i, int i2, Collection collection) {
        String.valueOf(collection).length();
        adqe c = this.b.c();
        aikc aikc = this.m;
        if (!adnh.c(i)) {
            aikc.a(i, 0, collection);
        } else if (f()) {
            List arrayList = new ArrayList(collection.size());
            for (aikr c2 : collection) {
                arrayList.add(c2.c());
            }
            if (e() + 1 == 0) {
                String.valueOf(arrayList).length();
                c.b(arrayList);
            } else if (a(0) == 0) {
                String.valueOf(arrayList).length();
                c.a(arrayList);
            } else {
                throw new IllegalArgumentException("Invalid position. The position must be either after the current playbackPosition or the end of the queue");
            }
            aikc.a(i, 0, collection);
        } else {
            xtl.b(a, "addToList | MDx session is not ready. Discarding change.");
        }
    }

    public final void a(int i, int i2, int i3) {
        adqe c = this.b.c();
        aikc aikc = this.m;
        if (!adnh.c(i)) {
            aikc.a(i, i2, i3);
        } else if (!f()) {
            xtl.b(a, "removeFromList | MDx session is not ready. Discarding change.");
        } else if (i3 == 1) {
            String c2 = a(i, i2).c();
            String valueOf = String.valueOf(c2);
            String str = "removeFromList | Remove the given videoId: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            c.f(c2);
            aikc.a(i, i2, 1);
        } else {
            throw new IllegalArgumentException("The MDx playback queue only supports removing a single video.");
        }
    }

    public final void c() {
        if (f()) {
            this.b.c().D();
            this.m.c();
            return;
        }
        xtl.b(a, "moveItemInList | MDx session is not ready. Discarding change.");
    }

    public final boolean c(aiqq aiqq) {
        int e = e();
        if (e != -1) {
            return a(aiqq, 0, e);
        }
        return false;
    }

    public final int a(int i, aikr aikr) {
        int a = a(i);
        if (a != 0) {
            aiqq e = aikr.e();
            for (int i2 = 0; i2 < a; i2++) {
                if (a(e, i, i2)) {
                    return i2;
                }
            }
        }
        return -1;
    }

    private final boolean a(aiqq aiqq, int i, int i2) {
        return amqq.a(aiqq.b(), a(i, i2).e().b());
    }

    public final void o_(boolean z) {
        this.q = z;
    }

    public final boolean b() {
        return this.q;
    }

    public final aizl a(aiqq aiqq) {
        Object c = aiqq != null ? aiqq.c() : null;
        if (this.o.c() && !amqq.a(c, this.o.h())) {
            return null;
        }
        aizl aizl = new aizl(aizn.JUMP, aiqq);
        if (c(aizl) == null) {
            aizl = new aizl(aizn.INSERT, aiqq);
        }
        return aizl;
    }

    public final aiqq a(aizl aizl) {
        if (aizl.e == aizn.AUTOPLAY) {
            return null;
        }
        return super.a(aizl);
    }

    public final void a(aizl aizl, aiqq aiqq) {
        if (aizl.e != aizn.AUTOPLAY) {
            super.a(aizl, aiqq);
        }
    }

    public final void a(aike aike) {
        if (this.d.a.isEmpty()) {
            this.m.a(this.d);
        }
        this.d.a.add(aike);
    }

    public final void b(aike aike) {
        this.d.a.remove(aike);
        if (this.d.a.isEmpty()) {
            this.m.b(this.d);
        }
    }

    public final void a(aikd aikd) {
        if (this.d.b.isEmpty()) {
            this.m.a(this.d);
        }
        this.d.b.add(aikd);
    }

    public final void b(aikd aikd) {
        this.d.b.remove(aikd);
        if (this.d.b.isEmpty()) {
            this.m.b(this.d);
        }
    }

    public final void a(aikg aikg) {
        if (this.d.c.isEmpty()) {
            this.m.a(this.d);
        }
        this.d.c.add(aikg);
    }

    public final void b(aikg aikg) {
        this.d.c.remove(aikg);
        if (this.d.c.isEmpty()) {
            this.m.b(this.d);
        }
    }

    public final void a(String str) {
        aikc aikc = this.m;
        int e = e();
        int i = 0;
        while (i < aikc.a(0)) {
            aikr a = aikc.a(0, i);
            if (!str.equals(a.c())) {
                i++;
            } else if (i != e) {
                ((aizy) this.e.get()).a(a.e());
                return;
            } else {
                return;
            }
        }
    }

    public final List d() {
        aikc aikc = this.m;
        int a = aikc.a(0);
        ArrayList arrayList = new ArrayList(a);
        for (int i = 0; i < a; i++) {
            arrayList.add(new adns(aikc.a(0, i), i));
        }
        return arrayList;
    }

    public final void b(adqe adqe) {
        this.h = adqe;
        this.h.a(this.i);
    }

    public final void c(adqe adqe) {
        adqe = this.h;
        if (adqe != null) {
            adqe.b(this.i);
            this.h = null;
        }
    }

    private final boolean f() {
        adqe adqe = this.h;
        return adqe != null && adqe.d() == 1;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{adoc.class, adob.class};
        } else if (i == 0) {
            String a = ((adoc) obj).a.a();
            if (this.j) {
                this.k = a;
                return null;
            }
            a(a);
            return null;
        } else if (i == 1) {
            adpw adpw = ((adob) obj).a;
            String e = adpw.e();
            if (TextUtils.isEmpty(e)) {
                xtl.b(a, "Trying to sync down empty playlistId. Discarding request.");
                return null;
            }
            this.j = true;
            this.l = this.p.a();
            this.c.b(e, new adnm(this, this.l, e, adpw));
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final int b(aizl aizl) {
        if (aizl.e == aizn.AUTOPLAY) {
            return 1;
        }
        return super.b(aizl);
    }
}
