package defpackage;

import java.util.regex.Pattern;

/* renamed from: aelg */
public final class aelg {
    public zzl a;
    public volatile aelb b;

    public final void a(aeuy aeuy, String str) {
        boolean z;
        awtm a = afhx.a(this.a);
        boolean z2 = false;
        if (a.f || (!a.g.isEmpty() && Pattern.compile(a.g).matcher(str).find())) {
            z = true;
        } else {
            z = false;
        }
        awtm a2 = afhx.a(this.a);
        if (a2.h || (!a2.i.isEmpty() && Pattern.compile(a2.i).matcher(str).find())) {
            z2 = true;
        }
        if (z || z2) {
            this.b = new aelb(aeuy, z, z2);
            aeuy.a("cat", aetw.a);
            return;
        }
        this.b = null;
    }

    public final void a() {
        this.b = null;
    }
}
