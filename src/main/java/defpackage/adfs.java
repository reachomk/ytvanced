package defpackage;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: adfs */
public final class adfs {
    public static final int[] c = new int[]{1, 2, 3, 4, 5, 6, 7};
    public final adqc a;
    public final boolean b;
    private final adgq d;
    private final tbq e;
    private final String f;

    adfs(adqc adqc, tbq tbq, boolean z, baz baz, String str) {
        this(adqc, tbq, z, new adet(baz), str);
    }

    adfs(adqc adqc, tbq tbq, boolean z, adgq adgq, String str) {
        this.e = (tbq) amqw.a((Object) tbq);
        this.a = (adqc) amqw.a((Object) adqc);
        this.b = z;
        this.d = (adgq) amqw.a((Object) adgq);
        this.f = str;
    }

    /* Access modifiers changed, original: final */
    public final void a(List list) {
        HashSet hashSet = new HashSet();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bbs bbs = (bbs) list.get(i);
            if (b(bbs)) {
                hashSet.add(adfs.c(bbs));
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bbs bbs2 = (bbs) it.next();
            if (!amqu.a(this.f) && !Arrays.asList(this.f.split(",")).contains(bbs2.d)) {
                it.remove();
            } else if (this.d.a_(bbs2)) {
                if (adhn.c(bbs2)) {
                    adiq adiq = (adiq) this.a.a(bbs2.r);
                    if (!(adiq == null || adiq.d() == null)) {
                        String a = adfs.a(adiq);
                        if (a.length() >= 16 && hashSet.contains(a)) {
                            it.remove();
                        }
                    }
                }
                if (a(bbs2) && !this.b) {
                    it.remove();
                }
            } else {
                it.remove();
            }
        }
    }

    public final boolean a(bbs bbs) {
        return adgy.a(this.e, bbs);
    }

    public final boolean b(bbs bbs) {
        return this.e.a(bbs.r) != null;
    }

    public static String c(bbs bbs) {
        String replace = bbs.c.replace("-", "");
        return replace.substring(replace.lastIndexOf(":") + 1);
    }

    public static String a(adiq adiq) {
        String str = "";
        return adiq.d().a.replace("-", str).replace("uuid:", str);
    }
}
