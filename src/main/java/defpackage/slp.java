package defpackage;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* renamed from: slp */
final class slp extends cwh {
    @cue(a = 6)
    public List k;
    @cue(a = 13)
    public baoo l;
    @cue(a = 13)
    public bbmz m;
    @cue(a = 13)
    public swk n;
    @cue(a = 13)
    public swp o;
    @cue(a = 13)
    public swz p;

    public slp() {
        super("CollectionSectionFlat");
    }

    public final boolean b(cwh cwh) {
        if (this == cwh) {
            return true;
        }
        if (cwh == null || getClass() != cwh.getClass()) {
            return false;
        }
        slp slp = (slp) cwh;
        List list = this.k;
        if (list != null) {
            if (slp.k == null || list.size() != slp.k.size()) {
                return false;
            }
            Iterator it = this.k.iterator();
            Iterator it2 = slp.k.iterator();
            while (it.hasNext() && it2.hasNext()) {
                if (!((cma) it.next()).a((cma) it2.next())) {
                    return false;
                }
            }
        } else if (slp.k != null) {
            return false;
        }
        baoo baoo = this.l;
        if (!baoo == null ? baoo.equals(slp.l) : slp.l == null) {
            return false;
        }
        bbmz bbmz = this.m;
        if (!bbmz == null ? bbmz.equals(slp.m) : slp.m == null) {
            return false;
        }
        swk swk = this.n;
        if (!swk == null ? swk.equals(slp.n) : slp.n == null) {
            return false;
        }
        swp swp = this.o;
        if (!swp == null ? swp.equals(slp.o) : slp.o == null) {
            return false;
        }
        swz swz = this.p;
        swz swz2 = slp.p;
        return swz == null ? swz2 == null : swz.equals(swz2);
    }

    /* Access modifiers changed, original: protected|final */
    public final cwb a(cwj cwj) {
        swz swz = this.p;
        swp swp = this.o;
        bbmz bbmz = this.m;
        baoo baoo = this.l;
        List<cma> list = this.k;
        cwe a = cwb.a();
        if (baoo.a() > 0) {
            baov baov = new baov();
            anrc baon = new baon();
            int i = 0;
            while (i < baoo.a()) {
                anrc anrc;
                int a2 = baoo.a(4);
                if (a2 != 0) {
                    a2 = baoo.b(baoo.e(a2) + (i << 2));
                    ByteBuffer byteBuffer = baoo.b;
                    baon.a = a2;
                    baon.b = byteBuffer;
                    a2 -= baon.b.getInt(a2);
                    baon.c = a2;
                    baon.d = baon.b.getShort(a2);
                    anrc = baon;
                } else {
                    anrc = null;
                }
                int i2 = 0;
                while (true) {
                    int a3 = anrc.a(4);
                    if (i2 >= (a3 != 0 ? anrc.d(a3) : 0)) {
                        break;
                    }
                    baov baov2;
                    a3 = anrc.a(4);
                    if (a3 != 0) {
                        baov.a(anrc.b(anrc.e(a3) + (i2 << 2)), anrc.b);
                        baov2 = baov;
                    } else {
                        baov2 = null;
                    }
                    int i3 = i2;
                    anrc anrc2 = anrc;
                    cma a4 = swz.a(cwj, null, baov2, swp, bbmz);
                    if (a4 != null) {
                        String num;
                        cxb b = cxc.b(cwj);
                        if (TextUtils.isEmpty(baov2.b())) {
                            num = Integer.toString(System.identityHashCode(baov2));
                        } else {
                            num = baov2.b();
                        }
                        b = b.a(num);
                        b.a(a4);
                        a.a(b);
                    }
                    i2 = i3 + 1;
                    baov = baov2;
                    anrc = anrc2;
                }
                i++;
                baon = anrc;
            }
        } else if (list != null) {
            for (cma cma : list) {
                cxb b2 = cxc.b(cwj);
                b2.a(cma);
                a.a(b2);
            }
        }
        return a.a();
    }
}
