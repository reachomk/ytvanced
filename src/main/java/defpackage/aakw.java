package defpackage;

import java.util.HashMap;

/* renamed from: aakw */
public final class aakw implements aams {
    private final xci a;

    public aakw(xci xci) {
        this.a = (xci) amqw.a((Object) xci);
    }

    public final void a(asic asic) {
        if (!asic.d.isEmpty()) {
            atwo[] atwoArr = null;
            for (asie asie : asic.d) {
                int a = asig.a(asie.b);
                if (a != 0 && a == 2) {
                    HashMap hashMap = new HashMap();
                    for (atwo atwo : asie.c) {
                        hashMap.put(atwo.d, atwo.b == 2 ? (String) atwo.c : "");
                    }
                    this.a.d(new aakq(hashMap));
                } else {
                    a = asig.a(asie.b);
                    if (a != 0 && a == 3) {
                        this.a.d(new aaks((atwo[]) asie.c.toArray(new atwo[0])));
                    } else {
                        a = asig.a(asie.b);
                        if (a != 0 && a == 7) {
                            atwoArr = (atwo[]) asie.c.toArray(new atwo[0]);
                        } else {
                            a = asig.a(asie.b);
                            if (a != 0 && a == 8) {
                                xci xci = this.a;
                                asie.c.toArray(new atwo[0]);
                                xci.d(new aakz());
                            }
                        }
                    }
                }
            }
            this.a.d(new aakt(atwoArr));
        }
    }
}
