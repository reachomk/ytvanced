package defpackage;

import java.util.Map;
import java.util.Set;

/* renamed from: acul */
public final class acul {
    public final argt a;
    public final xsc b;
    public final Set c;
    public final Set d;
    public final Map e;
    public final boolean f;
    public Map g;

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00de  */
    public acul(defpackage.zyw r7, defpackage.xsc r8) {
        /*
        r6 = this;
        r6.<init>();
        r0 = r7.a();
        r1 = 1;
        if (r0 != 0) goto L_0x000b;
    L_0x000a:
        goto L_0x002c;
    L_0x000b:
        r2 = r0.i;
        if (r2 != 0) goto L_0x0011;
    L_0x000f:
        r2 = defpackage.auya.J;
    L_0x0011:
        r2 = r2.a;
        r2 = r2 & 16384;
        if (r2 == 0) goto L_0x002c;
    L_0x0017:
        r0 = r0.i;
        if (r0 != 0) goto L_0x001d;
    L_0x001b:
        r0 = defpackage.auya.J;
    L_0x001d:
        r0 = r0.k;
        if (r0 != 0) goto L_0x0023;
    L_0x0021:
        r0 = defpackage.argt.g;
    L_0x0023:
        r0 = r0.toBuilder();
        r0 = (defpackage.anxo) r0;
        r0 = (defpackage.args) r0;
        goto L_0x0042;
    L_0x002c:
        r0 = defpackage.argt.g;
        r0 = r0.createBuilder();
        r0 = (defpackage.args) r0;
        r0.copyOnWrite();
        r2 = r0.instance;
        r2 = (defpackage.argt) r2;
        r3 = r2.a;
        r3 = r3 | r1;
        r2.a = r3;
        r2.b = r1;
    L_0x0042:
        r2 = r0.instance;
        r2 = (defpackage.argt) r2;
        r2 = r2.a;
        r2 = r2 & 16;
        r3 = 0;
        if (r2 == 0) goto L_0x004e;
    L_0x004d:
        goto L_0x007b;
    L_0x004e:
        r2 = defpackage.argv.c;
        r2 = r2.createBuilder();
        r2 = (defpackage.argu) r2;
        r2.copyOnWrite();
        r4 = r2.instance;
        r4 = (defpackage.argv) r4;
        r5 = r4.a;
        r1 = r1 | r5;
        r4.a = r1;
        r4.b = r3;
        r0.copyOnWrite();
        r1 = r0.instance;
        r1 = (defpackage.argt) r1;
        r2 = r2.build();
        r2 = (defpackage.anxl) r2;
        r2 = (defpackage.argv) r2;
        r1.e = r2;
        r2 = r1.a;
        r2 = r2 | 16;
        r1.a = r2;
    L_0x007b:
        r0 = r0.build();
        r0 = (defpackage.anxl) r0;
        r0 = (defpackage.argt) r0;
        r6.a = r0;
        r6.b = r8;
        r8 = defpackage.asmy.class;
        r8 = java.util.EnumSet.noneOf(r8);
        r6.c = r8;
        r8 = defpackage.asmy.class;
        r8 = java.util.EnumSet.noneOf(r8);
        r6.d = r8;
        r7 = r7.a();
        if (r7 != 0) goto L_0x009e;
    L_0x009d:
        goto L_0x00c7;
    L_0x009e:
        r8 = r7.i;
        if (r8 != 0) goto L_0x00a4;
    L_0x00a2:
        r8 = defpackage.auya.J;
    L_0x00a4:
        r8 = r8.j;
        if (r8 != 0) goto L_0x00aa;
    L_0x00a8:
        r8 = defpackage.aqtu.g;
    L_0x00aa:
        r8 = r8.a;
        r8 = r8 & 256;
        if (r8 == 0) goto L_0x00c7;
    L_0x00b0:
        r7 = r7.i;
        if (r7 != 0) goto L_0x00b6;
    L_0x00b4:
        r7 = defpackage.auya.J;
    L_0x00b6:
        r7 = r7.j;
        if (r7 != 0) goto L_0x00bc;
    L_0x00ba:
        r7 = defpackage.aqtu.g;
    L_0x00bc:
        r7 = r7.f;
        if (r7 != 0) goto L_0x00c2;
    L_0x00c0:
        r7 = defpackage.aquc.g;
    L_0x00c2:
        r7 = r7.b;
        r6.f = r7;
        goto L_0x00c9;
    L_0x00c7:
        r6.f = r3;
    L_0x00c9:
        r7 = new java.util.HashMap;
        r7.<init>();
        r6.e = r7;
        r7 = r6.a;
        r7 = r7.c;
        r7 = r7.iterator();
    L_0x00d8:
        r8 = r7.hasNext();
        if (r8 == 0) goto L_0x0127;
    L_0x00de:
        r8 = r7.next();
        r8 = (defpackage.argx) r8;
        if (r8 == 0) goto L_0x00d8;
    L_0x00e6:
        r0 = r8.b;
        r0 = defpackage.asmy.a(r0);
        if (r0 == 0) goto L_0x0126;
    L_0x00ee:
        r1 = r8.c;
        if (r1 == 0) goto L_0x00f3;
    L_0x00f2:
        goto L_0x00f8;
    L_0x00f3:
        r1 = r6.c;
        r1.add(r0);
    L_0x00f8:
        r1 = r8.d;
        if (r1 != 0) goto L_0x00fd;
    L_0x00fc:
        goto L_0x0102;
    L_0x00fd:
        r1 = r6.d;
        r1.add(r0);
    L_0x0102:
        r1 = r8.e;
        r1 = defpackage.aqui.a(r1);
        if (r1 != 0) goto L_0x010c;
    L_0x010a:
        r1 = defpackage.aqui.DELAYED_EVENT_TIER_UNSPECIFIED;
    L_0x010c:
        r2 = defpackage.aqui.DELAYED_EVENT_TIER_UNSPECIFIED;
        if (r1 == r2) goto L_0x00d8;
    L_0x0110:
        r1 = r6.e;
        r8 = r8.e;
        r8 = defpackage.aqui.a(r8);
        if (r8 != 0) goto L_0x011c;
    L_0x011a:
        r8 = defpackage.aqui.DELAYED_EVENT_TIER_UNSPECIFIED;
    L_0x011c:
        r8 = r8.f;
        r8 = java.lang.Integer.valueOf(r8);
        r1.put(r0, r8);
        goto L_0x00d8;
    L_0x0126:
        return;
    L_0x0127:
        r7 = new java.util.HashMap;
        r7.<init>();
        r6.g = r7;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acul.<init>(zyw, xsc):void");
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        argv argv = this.a.e;
        if (argv == null) {
            argv = argv.c;
        }
        return argv.b;
    }
}
