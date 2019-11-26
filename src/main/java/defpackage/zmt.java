package defpackage;

import android.view.TextureView;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: zmt */
public final class zmt implements zmm, zoc {
    public zmj a;
    public znm b;
    public final Set c = Collections.newSetFromMap(new HashMap());
    public final Set d = Collections.newSetFromMap(new HashMap());
    public final Set e = Collections.newSetFromMap(new HashMap());
    public final Set f = Collections.newSetFromMap(new HashMap());
    public final Set g = Collections.newSetFromMap(new HashMap());
    public xsd h;
    public final Map i = new HashMap();
    public zjp j;
    public List k;
    public String l;
    public ayza m;
    public boolean n;
    private znv o;
    private final Map p = new EnumMap(ayza.class);

    public final void a(znv znv) {
        amqw.b(this.o == null);
        synchronized (this.e) {
            this.o = (znv) amqw.a((Object) znv);
            for (zml zmk : this.e) {
                new zmk(znv, zmk).execute(new Void[0]);
            }
            znv.f = this;
            znx znx = new znx(znv);
        }
        zmw zmw = new zmw(this);
        synchronized (znv.d) {
            znv.e = zmw;
            znv.c();
        }
        zny zny = new zny(znv);
    }

    public final zmn a() {
        if (zjt.a(this.l)) {
            return new zmn("NORMAL");
        }
        Map map = amwm.a;
        if (this.m == ayza.EFFECT_SUBPACKAGE_ID_PRESET) {
            float f = !this.l.equals("AUTO") ? 0.5f : 0.8f;
            HashMap hashMap = new HashMap();
            hashMap.put("intensity", Float.valueOf(f));
            map = hashMap;
        }
        return new zmn(this.l, this.m, map);
    }

    public final zng a(ayza ayza) {
        return b(ayza);
    }

    public final znf b(ayza ayza) {
        znf znf;
        synchronized (this.p) {
            znf = (znf) this.p.get(ayza);
            if (znf == null) {
                znf = new znf(this);
                this.p.put(ayza, znf);
            }
        }
        return znf;
    }

    public final void a(String str, int i) {
        if (i == 1) {
            zjp zjp = this.j;
            if (!zjs.a(zjp.c(str))) {
                zjp.b.edit().putInt(zjp.a(str), 1).apply();
                zjt d = zjp.d(str);
                if (d != null) {
                    d.c = new zjs(1);
                }
            }
        } else if (i == 2) {
            this.j.b(str);
        } else {
            throw new AssertionError(i);
        }
    }

    public final zmo a(zmq zmq) {
        synchronized (this.c) {
            zmj zmj = this.a;
            if (zmj != null) {
                zmq.a(zmj);
            } else {
                znd.a(this.c, zmq);
            }
        }
        return new zmv(this, zmq);
    }

    public final zmo a(zmp zmp) {
        synchronized (this.f) {
            List list = this.k;
            if (list != null) {
                zmp.a(list);
            }
            znd.a(this.f, zmp);
        }
        return new zmy(this, zmp);
    }

    public final zmo a(zmr zmr) {
        synchronized (this.g) {
            zjt a = zjt.a(this.k, this.l);
            if (a != null) {
                zmr.a(a);
            }
            znd.a(this.g, zmr);
        }
        return new zmx(this, zmr);
    }

    public final zmo a(zms zms) {
        synchronized (this.d) {
            znm znm = this.b;
            if (znm != null) {
                zms.a(znm);
            } else {
                znd.a(this.d, zms);
            }
        }
        return new zna(this, zms);
    }

    public final zmo a(zml zml) {
        synchronized (this.e) {
            znd.a(this.e, zml);
            znv znv = this.o;
            if (znv != null) {
                new zmk(znv, zml).execute(new Void[0]);
            }
        }
        return new zmz(this, zml);
    }

    public final zmo a(zmu zmu) {
        this.h = (xsd) amqw.a((Object) zmu);
        synchronized (this.p) {
            for (znf znf : this.p.values()) {
                synchronized (znf.c) {
                    for (Entry entry : znf.d.entrySet()) {
                        if (!znf.c.containsKey(entry.getKey())) {
                            znf.c.put((String) entry.getKey(), (TextureView) entry.getValue());
                        }
                        znf.d.remove(entry.getKey());
                    }
                    for (Entry entry2 : znf.c.entrySet()) {
                        znf.c((String) entry2.getKey());
                    }
                }
            }
        }
        return new znc(this);
    }

    public final void a(String str, boolean z) {
        synchronized (this.e) {
            for (xsd a : this.e) {
                a.a(str);
            }
            if (z) {
                b();
            }
        }
    }

    public final void b() {
        List list = this.k;
        if (list != null) {
            znd.b(this.f, list);
            for (znf c : this.p.values()) {
                c.c();
            }
        }
    }

    public final void c() {
        zjt a = zjt.a(this.k, this.l);
        if (a != null) {
            znd.b(this.g, a);
        }
    }
}
