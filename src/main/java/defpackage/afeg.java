package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: afeg */
final /* synthetic */ class afeg implements Runnable {
    private final afdy a;
    private final aajj b;
    private final afif c;
    private final aajs d;

    afeg(afdy afdy, aajj aajj, afif afif, aajs aajs) {
        this.a = afdy;
        this.b = aajj;
        this.c = afif;
        this.d = aajs;
    }

    public final void run() {
        afdy afdy = this.a;
        aajj aajj = this.b;
        afif afif = this.c;
        aajs aajs = this.d;
        afdy.a(aajj, afif, "cachepurge");
        String str = afdy.g.c;
        if (!TextUtils.isEmpty(str)) {
            oww oww = (oww) afdy.a.a.get();
            if (oww != null) {
                ArrayList arrayList = new ArrayList();
                for (String str2 : oww.c()) {
                    if (str.equals(aeey.a(str2))) {
                        arrayList.add(str2);
                    }
                }
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    oxi.a(oww, (String) arrayList.get(i));
                }
            }
        }
        afdy.h().a(aajs, new affa(afif.b), afdy.h, aajj, afdy.j, afdy.f, afdy.k, afdy.l, true, afdy.v);
    }
}
