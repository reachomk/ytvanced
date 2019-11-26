package defpackage;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: sln */
final class sln extends cwh {
    @cue(a = 6)
    public List k;
    @cue(a = 13)
    public bbmz l;
    @cue(a = 13)
    public swk m;
    @cue(a = 13)
    public swp n;
    @cue(a = 13)
    public sns o;
    @cue(a = 2)
    public bdgk[] p;

    public sln() {
        super("CollectionSection");
    }

    public final boolean b(cwh cwh) {
        if (this == cwh) {
            return true;
        }
        if (cwh != null && getClass() == cwh.getClass()) {
            sln sln = (sln) cwh;
            List list = this.k;
            if (list != null) {
                if (sln.k == null || list.size() != sln.k.size()) {
                    return false;
                }
                Iterator it = this.k.iterator();
                Iterator it2 = sln.k.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    if (!((cma) it.next()).a((cma) it2.next())) {
                        return false;
                    }
                }
            } else if (sln.k != null) {
                return false;
            }
            bbmz bbmz = this.l;
            if (!bbmz == null ? bbmz.equals(sln.l) : sln.l == null) {
                return false;
            }
            swk swk = this.m;
            if (!swk == null ? swk.equals(sln.m) : sln.m == null) {
                return false;
            }
            swp swp = this.n;
            if (!swp == null ? swp.equals(sln.n) : sln.n == null) {
                return false;
            }
            sns sns = this.o;
            if (!sns == null ? sns.equals(sln.o) : sln.o == null) {
                return false;
            }
            if (Arrays.equals(this.p, sln.p)) {
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final cwb a(cwj cwj) {
        swk swk = this.m;
        sns sns = this.o;
        swp swp = this.n;
        bbmz bbmz = this.l;
        bdgk[] bdgkArr = this.p;
        List<cma> list = this.k;
        cwe a = cwb.a();
        if (bdgkArr != null) {
            if (r13 > 0) {
                for (bdgk bdgk : bdgkArr) {
                    bdhc[] bdhcArr = bdgk.b;
                    int length = bdhcArr.length;
                    int i = 0;
                    while (i < length) {
                        bdhc bdhc = bdhcArr[i];
                        int i2 = i;
                        int i3 = length;
                        bdhc[] bdhcArr2 = bdhcArr;
                        cma a2 = sns.a(cwj, swk, bdhc, swp, bbmz);
                        if (a2 != null) {
                            String num;
                            cxb b = cxc.b(cwj);
                            bdhc bdhc2 = bdhc;
                            if (TextUtils.isEmpty(bdhc2.d)) {
                                num = Integer.toString(System.identityHashCode(bdhc2));
                            } else {
                                num = bdhc2.d;
                            }
                            b = b.a(num);
                            b.a(a2);
                            a.a(b);
                        }
                        i = i2 + 1;
                        length = i3;
                        bdhcArr = bdhcArr2;
                    }
                }
                return a.a();
            }
        }
        if (list != null) {
            for (cma cma : list) {
                cxb b2 = cxc.b(cwj);
                b2.a(cma);
                a.a(b2);
            }
        }
        return a.a();
    }
}
