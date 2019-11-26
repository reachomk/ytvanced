package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ajdr */
public final class ajdr extends ajps {
    private final ajdp a;
    private final Map b = new HashMap();

    public ajdr(ajdp ajdp) {
        this.a = (ajdp) amqw.a((Object) ajdp);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x004c  */
    public final void a(java.lang.String r11) {
        /*
        r10 = this;
        r0 = r10.b;
        r0 = r0.containsKey(r11);
        if (r0 != 0) goto L_0x0069;
    L_0x0008:
        r0 = r10.a;
        r1 = r0.e;
        r1 = r1.c();
        r2 = 0;
        if (r1 == 0) goto L_0x0062;
    L_0x0013:
        r1 = r0.f;
        if (r1 == 0) goto L_0x0044;
    L_0x0017:
        r1 = r1.b();
        if (r1 == 0) goto L_0x0044;
    L_0x001d:
        r1 = r0.f;
        r1 = r1.b();
        r1 = r1.k;
        if (r1 != 0) goto L_0x0029;
    L_0x0027:
        r1 = defpackage.auuo.k;
    L_0x0029:
        r1 = r1.a;
        r1 = r1 & 64;
        if (r1 != 0) goto L_0x0030;
    L_0x002f:
        goto L_0x0044;
    L_0x0030:
        r1 = r0.f;
        r1 = r1.b();
        r1 = r1.k;
        if (r1 != 0) goto L_0x003c;
    L_0x003a:
        r1 = defpackage.auuo.k;
    L_0x003c:
        r1 = r1.e;
        if (r1 == 0) goto L_0x0041;
    L_0x0040:
        goto L_0x0046;
    L_0x0041:
        r1 = defpackage.awtm.x;
        goto L_0x0046;
    L_0x0044:
        r1 = r0.h;
    L_0x0046:
        r8 = r1;
        r1 = r8.v;
        if (r1 != 0) goto L_0x004c;
    L_0x004b:
        goto L_0x0062;
    L_0x004c:
        r1 = new ajdh;
        r4 = r0.a;
        r5 = r0.b;
        r6 = r0.d;
        r7 = r0.c;
        r9 = r0.g;
        r3 = r1;
        r3.<init>(r4, r5, r6, r7, r8, r9);
        r0 = r1.c;
        r0.a(r1);
        r2 = r1;
    L_0x0062:
        if (r2 == 0) goto L_0x0069;
    L_0x0064:
        r0 = r10.b;
        r0.put(r11, r2);
    L_0x0069:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajdr.a(java.lang.String):void");
    }

    public final void c(String str) {
        ajdh ajdh = str != null ? (ajdh) this.b.get(str) : null;
        if (ajdh != null) {
            ajdh.c.b(ajdh);
            ajdh.b(true);
            if (ajdh.j && ajdh.n != 7) {
                ajdh.a(true);
            }
            this.b.remove(str);
        }
    }

    public final void d(String str) {
        b(str);
    }

    public final void b(String str) {
        ajdh ajdh = str != null ? (ajdh) this.b.get(str) : null;
        if (ajdh != null) {
            ajdh.k = false;
            ajdh.b(3);
        }
    }

    public final void a(ahkr ahkr) {
        String str = ahkr.b;
        ajdh ajdh = str != null ? (ajdh) this.b.get(str) : null;
        if (ajdh != null) {
            int i = ahkr.a;
            if (i == 2) {
                if (ajdh.k) {
                    ajdh.b.execute(new ajdm(ajdh, ajdh.a.b() - ajdh.e));
                }
                ajdh.k = false;
                if (!ajdh.q && ajdh.j) {
                    ajdh.q = true;
                    ajdh.b();
                }
                ajdh.b(2);
            } else if (i == 3) {
                ajdh.k = false;
                ajdh.b(3);
            } else if (i == 5) {
                ajdh.b(5);
            } else if (i != 6) {
                if (i == 7) {
                    ajdh.k = false;
                    ajdh.b(7);
                    ajdh.q = false;
                    ajdh.b(true);
                    if (ajdh.j) {
                        ajdh.a(true);
                    }
                } else if (i == 9) {
                    ajdh.b(9);
                } else if (i == 10 && ajdh.n != 3) {
                    ajdh.b(9);
                }
            } else if (ajdh.n != 3) {
                ajdh.b(5);
            }
        }
    }

    public final void a(ahkm ahkm) {
        String str = ahkm.h;
        ajdh ajdh = str != null ? (ajdh) this.b.get(str) : null;
        if (ajdh != null) {
            synchronized (ajdh.o) {
                ajdh.p = ahkm;
            }
        }
    }

    public final void a(ahkn ahkn) {
        airi airi = ahkn.a;
        aakj aakj = ahkn.b;
        if (aakj != null && aakj.k()) {
            if (airi == airi.VIDEO_PLAYING || airi == airi.VIDEO_REQUESTED) {
                String str = ahkn.e;
                ajdh ajdh = str != null ? (ajdh) this.b.get(str) : null;
                if (ajdh != null) {
                    ajdh.k = false;
                    ajdh.l = true;
                }
            }
        }
    }
}
