package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: oja */
public final class oja implements oki {
    private final int a;
    private final List b;

    public oja() {
        this((byte) 0);
    }

    private final boolean a(int i) {
        return false;
    }

    public oja(byte b) {
        List singletonList = Collections.singletonList(nzw.a(null, "application/cea-608", 0, null, null));
        this.a = 0;
        this.b = singletonList;
    }

    public final SparseArray a() {
        return new SparseArray();
    }

    public final okh a(int i, okj okj) {
        if (i == 2) {
            return new ojr(new oje(new okn(b(okj))));
        }
        if (i == 3 || i == 4) {
            return new ojr(new ojp(okj.b));
        }
        if (i != 15) {
            if (i != 17) {
                if (i == 21) {
                    return new ojr(new ojn());
                }
                if (i != 27) {
                    if (i == 36) {
                        return new ojr(new ojl(a(okj)));
                    }
                    if (i == 89) {
                        return new ojr(new ojc(okj.c));
                    }
                    if (i != 138) {
                        if (i == 172) {
                            return new ojr(new oiz(okj.b));
                        }
                        if (i != 129) {
                            if (i != 130) {
                                if (i != 134) {
                                    if (i != 135) {
                                        return null;
                                    }
                                } else if (a(16)) {
                                    return null;
                                } else {
                                    return new ojw(new ojy());
                                }
                            } else if (!a(64)) {
                                return null;
                            }
                        }
                        return new ojr(new oix(okj.b));
                    }
                    return new ojr(new ojd(okj.b));
                } else if (a(4)) {
                    return null;
                } else {
                    return new ojr(new ojg(a(okj), a(1), a(8)));
                }
            } else if (a(2)) {
                return null;
            } else {
                return new ojr(new ojm(okj.b));
            }
        } else if (a(2)) {
            return null;
        } else {
            return new ojr(new ojb(false, okj.b));
        }
    }

    private final ojz a(okj okj) {
        return new ojz(b(okj));
    }

    private final List b(okj okj) {
        if (a(32)) {
            return this.b;
        }
        oza oza = new oza(okj.d);
        List list = this.b;
        while (oza.b() > 0) {
            int d = oza.b + oza.d();
            if (oza.d() == 134) {
                list = new ArrayList();
                int d2 = oza.d() & 31;
                for (int i = 0; i < d2; i++) {
                    int i2;
                    String str;
                    List singletonList;
                    String e = oza.e(3);
                    int d3 = oza.d();
                    Object obj = (d3 & 128) == 0 ? null : 1;
                    if (obj != null) {
                        i2 = d3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i2 = 1;
                    }
                    byte d4 = (byte) oza.d();
                    oza.d(1);
                    if (obj != null) {
                        byte b = (d4 & 64) != 0 ? (byte) 1 : (byte) 0;
                        singletonList = Collections.singletonList(new byte[]{b});
                    } else {
                        singletonList = null;
                    }
                    list.add(nzw.a(null, str, 0, e, i2, null, Long.MAX_VALUE, singletonList));
                }
            }
            oza.c(d);
        }
        return list;
    }
}
