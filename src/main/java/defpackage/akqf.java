package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: akqf */
public final class akqf extends arn {
    public final Handler a;
    public final akqs b;
    public final akqs c;
    public final akqs d;
    public final akqs e;
    public final akqs f;
    private final List g;
    private final akqd m;

    public akqf() {
        this(new akqd());
    }

    public akqf(akqd akqd) {
        this.a = new Handler(Looper.getMainLooper(), new akqe(this));
        this.b = new akqs(1);
        this.c = new akqs(2);
        this.d = new akqs(3);
        this.e = new akqs(4);
        this.f = new akqs(5);
        this.g = Arrays.asList(new akqs[]{this.b, this.c, this.d, this.e, this.f});
        this.m = (akqd) amqw.a((Object) akqd);
    }

    public final boolean b(aqj aqj) {
        akpz akpz = (akpz) akqd.a(this.m.a, aqj);
        if (akpz != null) {
            akot i = akqf.i(aqj);
            if (i != null) {
                akpp akpp = new akpp();
                akpp.a = i;
                akpp.b = Long.valueOf(this.i);
                akpp.c = new akqh();
                akpp.d = new akqk(this, akpz, aqj);
                String str = "";
                if (akpp.a == null) {
                    str = str.concat(" presenter");
                }
                if (akpp.b == null) {
                    str = String.valueOf(str).concat(" duration");
                }
                if (akpp.c == null) {
                    str = String.valueOf(str).concat(" onStart");
                }
                if (akpp.d == null) {
                    str = String.valueOf(str).concat(" onEnd");
                }
                if (str.isEmpty()) {
                    if (akpz.a(new akpm(akpp.a, akpp.b.longValue(), akpp.c, akpp.d))) {
                        c(aqj);
                        this.b.a.add(akpz);
                        this.b.c.put(aqj, new akqv(akpz, new aqj[]{aqj}));
                        return true;
                    }
                }
                String str2 = "Missing required properties:";
                throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
            }
        }
        f(aqj);
        return false;
    }

    public final boolean a(aqj aqj) {
        akra akra = (akra) akqd.a(this.m.b, aqj);
        if (akra != null) {
            akot i = akqf.i(aqj);
            if (i != null && akra.a(akrd.e().a(i).a(this.j).a(new akqn()).b(new akqm(this, akra, aqj)).a())) {
                c(aqj);
                this.c.a.add(akra);
                this.c.c.put(aqj, new akqv(akra, new aqj[]{aqj}));
                return true;
            }
        }
        f(aqj);
        return false;
    }

    public final boolean a(aqj aqj, int i, int i2, int i3, int i4) {
        akqx akqx;
        akqv akqv = (akqv) this.d.c.get(aqj);
        if (akqv != null) {
            akqx = (akqx) akqv.a;
            akpr akpr = new akpr();
            akpr.a = Long.valueOf(this.k);
            akpr.b = Integer.valueOf(i);
            akpr.c = Integer.valueOf(i2);
            akpr.d = Integer.valueOf(i3);
            akpr.e = Integer.valueOf(i4);
            String str = "";
            if (akpr.a == null) {
                str = str.concat(" duration");
            }
            if (akpr.b == null) {
                str = String.valueOf(str).concat(" fromX");
            }
            if (akpr.c == null) {
                str = String.valueOf(str).concat(" fromY");
            }
            if (akpr.d == null) {
                str = String.valueOf(str).concat(" toX");
            }
            if (akpr.e == null) {
                str = String.valueOf(str).concat(" toY");
            }
            if (!str.isEmpty()) {
                String str2 = "Missing required properties:";
                throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
            } else if (akqx.a(new akpo(akpr.a.longValue(), akpr.b.intValue(), akpr.c.intValue(), akpr.d.intValue(), akpr.e.intValue()))) {
                f(aqj);
                if (!this.d.a.contains(akqx)) {
                    this.d.a.add(akqx);
                }
                this.d.b.remove(akqx);
                return true;
            }
        }
        akqx = (akqx) akqd.a(this.m.c, aqj);
        if (akqx != null) {
            akot i5 = akqf.i(aqj);
            if (i5 != null && akqx.a(akqy.i().a(i5).a(this.k).a(new akqp()).b(new akqo(this, akqx, aqj)).a(i).b(i2).c(i3).d(i4).a())) {
                c(aqj);
                this.d.a.add(akqx);
                this.d.c.put(aqj, new akqv(akqx, new aqj[]{aqj}));
                return true;
            }
        }
        f(aqj);
        return false;
    }

    public final boolean a(aqj aqj, aqj aqj2, int i, int i2, int i3, int i4) {
        aqj aqj3 = aqj;
        aqj aqj4 = aqj2;
        if (aqj3 != aqj4) {
            akrf akrf;
            akqd akqd = this.m;
            Class a = akqd.a(aqj);
            Class a2 = akqd.a(aqj2);
            if (a == null || a2 == null) {
                akrf = null;
            } else {
                akrf = (akrf) akqd.d.a(new zz(a, a2));
            }
            if (akrf != null) {
                akot i5 = akqf.i(aqj);
                akot i6 = akqf.i(aqj2);
                if (!(i5 == null || i6 == null)) {
                    akqs akqs;
                    if (aqj3.a.getWidth() > aqj4.a.getWidth() || aqj3.a.getHeight() > aqj4.a.getHeight()) {
                        akqs = this.f;
                    } else {
                        akqs = this.e;
                    }
                    akqs akqs2 = akqs;
                    akqu akqu = new akqu(this, aqj, aqj2, akrf, akqs2);
                    akpx akpx = new akpx();
                    akpx.a = i5;
                    akpx.b = i6;
                    akpx.c = Long.valueOf(this.l);
                    akpx.d = new akqr();
                    akpx.e = new akqq(akqu, aqj3);
                    akpx.f = new akqt();
                    akpx.g = new akqg(akqu, aqj4);
                    akpx.h = Integer.valueOf(i);
                    akpx.i = Integer.valueOf(i2);
                    akpx.j = Integer.valueOf(i3);
                    akpx.k = Integer.valueOf(i4);
                    String str = "";
                    if (akpx.a == null) {
                        str = str.concat(" oldPresenter");
                    }
                    if (akpx.b == null) {
                        str = String.valueOf(str).concat(" newPresenter");
                    }
                    if (akpx.c == null) {
                        str = String.valueOf(str).concat(" duration");
                    }
                    if (akpx.d == null) {
                        str = String.valueOf(str).concat(" oldOnStart");
                    }
                    if (akpx.e == null) {
                        str = String.valueOf(str).concat(" oldOnEnd");
                    }
                    if (akpx.f == null) {
                        str = String.valueOf(str).concat(" newOnStart");
                    }
                    if (akpx.g == null) {
                        str = String.valueOf(str).concat(" newOnEnd");
                    }
                    if (akpx.h == null) {
                        str = String.valueOf(str).concat(" fromX");
                    }
                    if (akpx.i == null) {
                        str = String.valueOf(str).concat(" fromY");
                    }
                    if (akpx.j == null) {
                        str = String.valueOf(str).concat(" toX");
                    }
                    if (akpx.k == null) {
                        str = String.valueOf(str).concat(" toY");
                    }
                    if (str.isEmpty()) {
                        if (akrf.a(new akpu(akpx.a, akpx.b, akpx.c.longValue(), akpx.d, akpx.e, akpx.f, akpx.g, akpx.h.intValue(), akpx.i.intValue(), akpx.j.intValue(), akpx.k.intValue()))) {
                            c(aqj);
                            c(aqj4);
                            akqs2.a.add(akrf);
                            akqv akqv = new akqv(akrf, new aqj[]{aqj3, aqj4});
                            akqs2.c.put(aqj3, akqv);
                            akqs2.c.put(aqj4, akqv);
                            return true;
                        }
                    }
                    String str2 = "Missing required properties:";
                    throw new IllegalStateException(str.length() == 0 ? new String(str2) : str2.concat(str));
                }
            }
            f(aqj);
            f(aqj4);
            return false;
        }
        f(aqj);
        return false;
    }

    public final void a() {
        b(this.c);
        b(this.e);
        if (!a(this.c) && !a(this.e)) {
            b(this.d);
            if (!a(this.d)) {
                b(this.b);
                b(this.f);
            }
        }
    }

    private final void b(akqs akqs) {
        ArrayList arrayList = new ArrayList(akqs.a);
        akqs.b.addAll(akqs.a);
        akqs.a.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            akqa akqa = (akqa) arrayList.get(i);
            if (akqa instanceof akpw) {
                long e = ((akpw) akqa).e();
                if (e > 0) {
                    Handler handler = this.a;
                    handler.sendMessageDelayed(handler.obtainMessage(akqs.d, akqa), e);
                }
            }
            akqa.b();
        }
    }

    public final boolean a(akqs akqs) {
        return this.a.hasMessages(akqs.d);
    }

    public final void c(aqj aqj) {
        for (akqs akqs : this.g) {
            akqv akqv = (akqv) akqs.c.get(aqj);
            if (akqv != null) {
                akqs.a.remove(akqv.a);
                akqs.b.remove(akqv.a);
                for (Object remove : akqv.b) {
                    akqs.c.remove(remove);
                }
                this.a.removeMessages(akqs.d, akqv.a);
                if (!akqv.c) {
                    akqv.c = true;
                    akqv.a.c();
                }
            }
        }
    }

    public final void d() {
        for (akqs akqs : this.g) {
            ArrayDeque<akqa> arrayDeque = new ArrayDeque();
            arrayDeque.addAll(akqs.a);
            arrayDeque.addAll(akqs.b);
            akqs.a.clear();
            akqs.b.clear();
            akqs.c.clear();
            for (akqa c : arrayDeque) {
                c.c();
            }
            this.a.removeMessages(akqs.d);
        }
    }

    public final void g(aqj aqj) {
        for (akqs akqs : this.g) {
            akqv akqv = (akqv) akqs.c.get(aqj);
            if (akqv != null && this.a.hasMessages(akqs.d, akqv.a)) {
                this.a.removeMessages(akqs.d, akqv.a);
                if (!a(akqs)) {
                    this.a.post(new akqj(this));
                }
            }
        }
    }

    public final boolean b() {
        return amux.b(this.g, akqi.a);
    }

    public final void c() {
        if (!b()) {
            e();
        }
    }

    private static akot i(aqj aqj) {
        if (aqj instanceof akoy) {
            return ((akoy) aqj).p;
        }
        return akoz.a(aqj.a);
    }
}
