package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: jps */
public final class jps {
    public final aaas a;
    public auvn b;
    public List c;

    public jps(aaas aaas) {
        this.a = (aaas) amqw.a((Object) aaas);
    }

    public final void a(auvn auvn) {
        this.b = auvn;
        this.c = null;
    }

    public final List a() {
        if (this.c == null) {
            this.c = new ArrayList();
            for (int i = 0; i < this.b.b.size(); i++) {
                auvj auvj = (auvj) this.b.b.get(i);
                auvl auvl = null;
                if (auvj != null) {
                    int i2 = auvj.a;
                    if ((i2 & 1) != 0) {
                        auvl = auvj.b;
                        if (auvl == null) {
                            auvl = auvl.f;
                        }
                    } else if ((i2 & 2) != 0) {
                        auvl = auvj.c;
                        if (auvl == null) {
                            auvl = auvp.h;
                        }
                    } else if ((i2 & 4) != 0) {
                        auvl = auvj.d;
                        if (auvl == null) {
                            auvl = auwb.l;
                        }
                    } else if ((i2 & 8) != 0) {
                        auvl = auvj.e;
                        if (auvl == null) {
                            auvl = auvd.g;
                        }
                    } else if ((i2 & 16) != 0) {
                        auvl = auvj.f;
                        if (auvl == null) {
                            auvl = auvf.g;
                        }
                    }
                }
                if (auvl instanceof auvl) {
                    this.c.add(new jpr(this, i, auvl));
                } else if (auvl instanceof auvp) {
                    this.c.add(new jpr(this, i, (auvp) auvl));
                }
            }
        }
        return this.c;
    }
}
