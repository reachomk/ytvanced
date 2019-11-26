package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: amav */
public final class amav {
    public final xsc a;
    public final ScheduledExecutorService b;
    public final PriorityQueue c = new PriorityQueue();
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public boolean e = false;
    private final bcaa f;
    private final boolean g;
    private ScheduledFuture h;

    public amav(xsc xsc, ScheduledExecutorService scheduledExecutorService, bcaa bcaa, boolean z) {
        this.a = xsc;
        this.b = scheduledExecutorService;
        this.f = bcaa;
        this.g = z;
    }

    public final void a(String str, String str2, String str3) {
        this.b.execute(new amaz(this, new ambi(str, str2, this.a.a() + Math.max(0, 50), str3)));
    }

    public final void a() {
        this.b.execute(new amay(this));
    }

    public final void a(ambf ambf) {
        this.d.add(ambf);
    }

    public final void b(ambf ambf) {
        this.d.remove(ambf);
    }

    private final void a(ayuh ayuh) {
        String str;
        amqw.a((Object) ayuh);
        ayuf ayuf = ayuh.b;
        if (ayuf == null) {
            ayuf = ayuf.d;
        }
        String str2 = null;
        if ((ayuf.a & 1) == 0) {
            str = null;
        } else {
            ayuf = ayuh.b;
            if (ayuf == null) {
                ayuf = ayuf.d;
            }
            str = ayuf.b;
        }
        ayuf ayuf2 = ayuh.b;
        if (ayuf2 == null) {
            ayuf2 = ayuf.d;
        }
        if ((ayuf2.a & 2) != 0) {
            ayuf ayuf3 = ayuh.b;
            if (ayuf3 == null) {
                ayuf3 = ayuf.d;
            }
            str2 = ayuf3.c;
        }
        if (str == null && str2 == null) {
            throw new IllegalStateException("Cannot find frontendId or videoId in response");
        }
        Iterator it;
        for (ayul ayul : ayuh.c) {
            int i = ayul.a;
            Iterator it2;
            ambf ambf;
            if ((i & 16) != 0) {
                it2 = this.d.iterator();
                while (it2.hasNext()) {
                    ambf = (ambf) it2.next();
                    azau azau = ayul.f;
                    ambf.a();
                }
            } else if ((i & 2) != 0) {
                it2 = this.d.iterator();
                while (it2.hasNext()) {
                    ambf = (ambf) it2.next();
                    awob awob = ayul.c;
                    if (awob == null) {
                        awob = awob.e;
                    }
                    ambf.a(str, str2, awob);
                }
            } else if ((i & 4) != 0) {
                it2 = this.d.iterator();
                while (it2.hasNext()) {
                    ambf = (ambf) it2.next();
                    ayuq ayuq = ayul.d;
                    if (ayuq == null) {
                        ayuq = ayuq.j;
                    }
                    ambf.a(str, str2, ayuq);
                }
            } else if ((i & 8) != 0) {
                it2 = this.d.iterator();
                while (it2.hasNext()) {
                    ambf = (ambf) it2.next();
                    aygi aygi = ayul.e;
                    if (aygi == null) {
                        aygi = aygi.c;
                    }
                    ambf.a(str, str2, aygi);
                }
            } else if ((i & 32) != 0) {
                it2 = this.d.iterator();
                while (it2.hasNext()) {
                    ambf = (ambf) it2.next();
                    aysn aysn = ayul.g;
                    if (aysn == null) {
                        aysn = aysn.d;
                    }
                    ambf.a(str, str2, aysn);
                }
            }
        }
        Object obj = null;
        for (ayuj ayuj : ayuh.d) {
            if ((ayuj.a & 2) != 0) {
                ayhc ayhc = ayuj.b;
                if (ayhc == null) {
                    ayhc = ayhc.e;
                }
                ayhc ayhc2 = ayhc;
                this.c.add(new ambi(str, str2, this.a.a() + ((long) ayhc2.b), ayhc2.c));
                int i2 = ayhc2.b;
                obj = 1;
            }
        }
        if (obj == null) {
            it = this.d.iterator();
            while (it.hasNext()) {
                ((ambf) it.next()).b(str2);
            }
        }
    }

    public final void a(ajvt ajvt) {
        amqw.a((Object) ajvt);
        for (akbq akbq : ajvt.a) {
            ayuh ayuh = akbq.b;
            if (ayuh != null) {
                a(ayuh);
            }
        }
        for (aocf a : ajvt.b) {
            axai axai = (axai) ajzv.a(a, axai.a.getParserForType());
            if (axai != null) {
                anxr access$000 = anxl.checkIsLite(ayuh.f);
                axai.a(access$000);
                if (axai.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(ayuh.f);
                    axai.a(access$000);
                    Object b = axai.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    a((ayuh) b);
                }
            }
        }
        c();
    }

    public final void b() {
        afpt c;
        Object arrayList = new ArrayList();
        long a = this.a.a();
        while (!this.c.isEmpty() && ((ambi) this.c.peek()).c < 2000 + a) {
            arrayList.add((ambi) this.c.poll());
            if (arrayList.size() == 64) {
                break;
            }
        }
        c();
        arrayList.size();
        amqw.a(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        atls atls = (atls) atlp.e.createBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ambi ambi = (ambi) arrayList.get(i);
            ayui ayui;
            String str;
            ayuf ayuf;
            if (!TextUtils.isEmpty(ambi.d)) {
                arrayList3.add(ambi.d);
            } else if (!TextUtils.isEmpty(ambi.a)) {
                ayui = (ayui) ayuf.d.createBuilder();
                str = ambi.a;
                ayui.copyOnWrite();
                ayuf = (ayuf) ayui.instance;
                if (str != null) {
                    ayuf.a |= 1;
                    ayuf.b = str;
                    arrayList2.add((ayuf) ((anxl) ayui.build()));
                } else {
                    throw new NullPointerException();
                }
            } else if (TextUtils.isEmpty(ambi.b)) {
                continue;
            } else {
                ayui = (ayui) ayuf.d.createBuilder();
                str = ambi.b;
                ayui.copyOnWrite();
                ayuf = (ayuf) ayui.instance;
                if (str != null) {
                    ayuf.a |= 2;
                    ayuf.c = str;
                    arrayList2.add((ayuf) ((anxl) ayui.build()));
                } else {
                    throw new NullPointerException();
                }
            }
        }
        atls.copyOnWrite();
        atlp atlp = (atlp) atls.instance;
        if (!atlp.c.a()) {
            atlp.c = anxl.mutableCopy(atlp.c);
        }
        anvf.addAll(arrayList2, atlp.c);
        atls.copyOnWrite();
        atlp atlp2 = (atlp) atls.instance;
        if (!atlp2.d.a()) {
            atlp2.d = anxl.mutableCopy(atlp2.d);
        }
        anvf.addAll(arrayList3, atlp2.d);
        atlp2 = (atlp) ((anxl) atls.build());
        ambh ambh = (ambh) this.f.get();
        boolean z = this.g;
        afsw ambe = new ambe(this, arrayList);
        aanl aanl = ambh.b;
        if ((z ^ 1) != 0) {
            c = ambh.d.c();
        } else {
            c = afpt.g;
        }
        aaml amar = new amar(ambh.c, c, (atls) ((anxo) atlp2.toBuilder()));
        if (z) {
            amar.o = 3;
        }
        amar.g();
        aanl.a(amar, ambe);
    }

    public final void c() {
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.h = null;
        }
        if (!(this.e || this.c.isEmpty())) {
            long a = ((ambi) this.c.peek()).c - this.a.a();
            if (a <= 0) {
                this.b.execute(new ambc(this));
                return;
            }
            this.h = this.b.schedule(new ambb(this), a, TimeUnit.MILLISECONDS);
        }
    }
}
