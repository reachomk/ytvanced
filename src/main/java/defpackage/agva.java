package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: agva */
public final class agva extends aaml {
    public Collection a = new ArrayList();
    public String b = "";
    public boolean c = false;

    public agva(aamd aamd, afpt afpt) {
        super("player/refresh", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        xvd.a(this.j);
        if (TextUtils.isEmpty(this.b)) {
            amqw.b(this.a.isEmpty() ^ 1);
        } else {
            xvd.a(this.b);
        }
    }

    public final /* synthetic */ anzd c() {
        atcf atcf = (atcf) atcg.f.createBuilder();
        String str = this.b;
        atcf.copyOnWrite();
        atcg atcg = (atcg) atcf.instance;
        if (str != null) {
            atcg.a |= 2;
            atcg.d = str;
            Collection collection = this.a;
            atcf.copyOnWrite();
            atcg = (atcg) atcf.instance;
            if (!atcg.c.a()) {
                atcg.c = anxl.mutableCopy(atcg.c);
            }
            anvf.addAll(collection, atcg.c);
            boolean z = this.c;
            atcf.copyOnWrite();
            atcg = (atcg) atcf.instance;
            atcg.a |= 4;
            atcg.e = z;
            return atcf;
        }
        throw new NullPointerException();
    }
}
