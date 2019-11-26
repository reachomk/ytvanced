package defpackage;

import java.util.Iterator;

/* renamed from: acyo */
final class acyo implements xcn {
    private final String a;
    private final /* synthetic */ acyi b;

    public final /* synthetic */ void a(Object obj) {
        xbb xbb = (xbb) obj;
        xbb.a(this.a);
        Iterator it = this.b.d.iterator();
        while (it.hasNext()) {
            acxv acxv = (acxv) it.next();
            if (acxv.a(xbb)) {
                it.remove();
                if (!acxv.e) {
                    this.b.e.add(acxv);
                }
            }
        }
    }

    /* synthetic */ acyo(acyi acyi, String str) {
        this.b = acyi;
        this.a = xvd.a(str);
    }
}
