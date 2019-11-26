package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: agou */
public final class agou implements agpc {
    private final agnw a;
    private final agmh b;
    private agow c;

    public agou(agnw agnw, agmh agmh) {
        this.a = agnw;
        this.b = agmh;
        amqw.b(agmh.c());
        agow agow = new agow(agnw.b(), new agno(agmh.a()));
        this.c = agow;
        boolean z = false;
        a(false);
        agno agno = agow.c;
        if ("ftyp".equals(agos.b(((agnl) agno.c.get(0)).b.b))) {
            amxn amxn = (amxn) agno.c.listIterator();
            long j = -1;
            boolean z2 = true;
            while (amxn.hasNext()) {
                agnl agnl = (agnl) amxn.next();
                azpz azpz = agnl.b;
                long j2 = azpz.d;
                if (j2 <= j) {
                    break;
                }
                if (agos.a("free", azpz.b)) {
                    j = j2;
                    z2 = false;
                } else if (z2 == agos.b(agnl.b.b).equals("mdat")) {
                    break;
                } else {
                    j = j2;
                }
            }
            z = true;
        }
        amqw.b(z, (Object) "Progress state was invalid.");
        agmh.a(agow.c.a());
    }

    public final void a(azlk azlk) {
        agow d = d();
        if ((azlk.a & 1) != 0) {
            agnl agnl;
            agno agno = d.c;
            String str = azlk.b;
            int i = azlk.c;
            amxn amxn = (amxn) agno.c.listIterator();
            while (amxn.hasNext()) {
                agnl = (agnl) amxn.next();
                amqp amqp = agnl.a;
                if (amqp.a() && ((azlk) amqp.b()).b.equals(str) && ((azlk) amqp.b()).c == i) {
                    break;
                }
            }
            agnl = null;
            if (agnl != null) {
                a(agnl.b);
                a(0);
                String valueOf = String.valueOf(agnl.b.b);
                String str2 = "opened entry ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                    return;
                } else {
                    str2.concat(valueOf);
                    return;
                }
            }
            throw new agml("video stream progress not found?!");
        }
        throw new agml("No video id specified!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007c  */
    private final defpackage.agpa a(defpackage.azpz r10) {
        /*
        r9 = this;
        r0 = r9.d();
        r1 = r0.d;
        if (r1 != 0) goto L_0x0009;
    L_0x0008:
        goto L_0x001c;
    L_0x0009:
        r1 = r9.g();
        r2 = r10.b;
        r3 = r1.b();
        r3 = r3.b;
        r2 = defpackage.agos.a(r2, r3);
        if (r2 == 0) goto L_0x001c;
    L_0x001b:
        return r1;
    L_0x001c:
        r1 = r0.d;
        r2 = 0;
        r3 = 1;
        if (r1 != 0) goto L_0x0024;
    L_0x0022:
        r1 = 1;
        goto L_0x0025;
    L_0x0024:
        r1 = 0;
    L_0x0025:
        r4 = "Another entry is already open!";
        defpackage.amqw.b(r1, r4);
        r1 = r0.c;
        r4 = r10.b;
        r5 = r10.c;
        r5 = defpackage.azqn.a(r5);
        if (r5 == 0) goto L_0x0037;
    L_0x0036:
        goto L_0x0038;
    L_0x0037:
        r5 = 1;
    L_0x0038:
        r1 = r1.c;
        r1 = r1.listIterator();
        r1 = (defpackage.amxn) r1;
    L_0x0040:
        r6 = r1.hasNext();
        if (r6 == 0) goto L_0x0074;
    L_0x0046:
        r6 = r1.next();
        r6 = (defpackage.agnl) r6;
        r7 = r6.b;
        r8 = r7.a;
        r8 = r8 & r3;
        if (r8 == 0) goto L_0x0040;
    L_0x0053:
        r7 = r7.b;
        r7 = defpackage.agos.a(r4, r7);
        if (r7 == 0) goto L_0x0040;
    L_0x005b:
        r1 = r6.b;
        r1 = r1.c;
        r1 = defpackage.azqn.a(r1);
        if (r1 == 0) goto L_0x0066;
    L_0x0065:
        goto L_0x0067;
    L_0x0066:
        r1 = 1;
    L_0x0067:
        if (r5 != r1) goto L_0x006a;
    L_0x0069:
        r2 = 1;
    L_0x006a:
        r1 = "UUID did not match, but path did";
        defpackage.amqw.b(r2, r1);
        r1 = defpackage.amqp.b(r6);
        goto L_0x0076;
    L_0x0074:
        r1 = defpackage.ampo.a;
    L_0x0076:
        r2 = r1.a();
        if (r2 != 0) goto L_0x009a;
    L_0x007c:
        r0 = new agml;
        r10 = r10.b;
        r10 = java.lang.String.valueOf(r10);
        r1 = "No entry found with path ";
        r2 = r10.length();
        if (r2 != 0) goto L_0x0092;
    L_0x008c:
        r10 = new java.lang.String;
        r10.<init>(r1);
        goto L_0x0096;
    L_0x0092:
        r10 = r1.concat(r10);
    L_0x0096:
        r0.<init>(r10);
        throw r0;
    L_0x009a:
        r10 = new agor;
        r1 = r1.b();
        r1 = (defpackage.agnl) r1;
        r10.<init>(r1);
        r0.d = r10;
        r10 = r0.d;
        return r10;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agou.a(azpz):agpa");
    }

    public final void a() {
        agow agow = this.c;
        if (agow != null) {
            agow.d = null;
            this.b.a(agow.c.a());
        }
    }

    public final void close() {
        agow agow = this.c;
        if (agow != null) {
            if (!e()) {
                this.b.a(agow.c.a());
            }
            this.c = null;
            agow.b.close();
        }
    }

    public final void b() {
        String str;
        int i;
        d();
        agow d = d();
        amxn amxn = (amxn) d.c.c.listIterator();
        while (true) {
            str = "free";
            i = 0;
            if (!amxn.hasNext()) {
                break;
            }
            azpz azpz = ((agnl) amxn.next()).b;
            if (str.equals(agos.b(azpz.b))) {
                break;
            }
            str = azpz.b;
            int a = azqn.a(azpz.c);
            if (a == 0) {
                a = 1;
            }
            a(str, a);
            f();
            int a2 = azqn.a(azpz.c);
            if (a2 == 0) {
                a2 = 1;
            }
            a2--;
            if (a2 == 2) {
                a(((azqb) d.c.e.b()).toByteArray());
            } else if (a2 != 3) {
                agow d2 = d();
                agpa g = g();
                a(0);
                amqp amqp = g.a().f;
                if (amqp.a()) {
                    byte[] d3 = ((anvu) amqp.b()).d();
                    FileChannel fileChannel = d2.b;
                    int length = d3.length;
                    fileChannel.write(ByteBuffer.wrap(d3, 0, length));
                    g.a(length);
                } else {
                    throw new agml("No boxContent found?!");
                }
            } else {
                a(d.c.d.toByteArray());
            }
            a();
        }
        a(str, 1);
        f();
        d();
        agpa g2 = g();
        byte[] bArr = new byte[4096];
        a(0);
        int i2 = 0;
        while (true) {
            long j = (long) i2;
            if (j >= g2.c() - ((long) g2.i())) {
                break;
            }
            i2 += a(bArr, 0, (int) Math.min(4096, g2.c() - j));
        }
        a();
        while (i < d.c.a.c.size()) {
            StringBuilder stringBuilder = new StringBuilder(17);
            stringBuilder.append("mdat[");
            stringBuilder.append(i);
            stringBuilder.append("]");
            a(stringBuilder.toString(), 1);
            f();
            a();
            i++;
        }
        if (e()) {
            this.a.d();
            this.b.b();
        }
    }

    public final void a(long j) {
        agow d = d();
        agpa g = g();
        d.b.position(g.e() + j);
        g.c(j);
    }

    public final int a(byte[] bArr, int i, int i2) {
        agow d = d();
        agpa g = g();
        if (g.c() < 0 || ((long) i2) > g.c() - g.f()) {
            long c = g.c();
            long f = g.f();
            StringBuilder stringBuilder = new StringBuilder(123);
            stringBuilder.append("requested write would exceed the size of the entry allocation. ");
            stringBuilder.append(i2);
            String str = "___";
            stringBuilder.append(str);
            stringBuilder.append(c);
            stringBuilder.append(str);
            stringBuilder.append(f);
            stringBuilder.append(str);
            throw new agml(stringBuilder.toString());
        }
        d.b.write(ByteBuffer.wrap(bArr, i, i2));
        g.a(i2);
        int i3 = d.a + i2;
        d.a = i3;
        if (i3 >= 524288) {
            this.b.a(d.c.a());
            d.a = 0;
        }
        return i2;
    }

    private final boolean e() {
        amxn amxn = (amxn) d().c.c.listIterator();
        while (amxn.hasNext()) {
            agnl agnl = (agnl) amxn.next();
            String str = agnl.b.b;
            String valueOf;
            String str2;
            if (!agnl.c) {
                valueOf = String.valueOf(str);
                str2 = "entry incomplete: no file header written for ";
                xtl.e(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                return false;
            } else if (!agnl.d) {
                valueOf = String.valueOf(str);
                str2 = "entry incomplete: data incomplete for ";
                xtl.e(valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf));
                return false;
            }
        }
        return true;
    }

    public final boolean c() {
        amxn amxn = (amxn) d().c.c.listIterator();
        while (amxn.hasNext()) {
            agnl agnl = (agnl) amxn.next();
            if (agnl.a.a() && !agnl.d) {
                return false;
            }
        }
        return true;
    }

    public final void a(azqd azqd) {
        anxl anxl;
        agow d = d();
        agpa a = a("uuid[2]", 3);
        amqp amqp = d.c.e;
        if (amqp.a()) {
            anxl = (azqb) amqp.b();
        } else {
            anxl = azqb.b;
            d.c.a(anxl);
        }
        if ((azqd.a & 1) != 0) {
            azqa azqa = (azqa) ((anxo) anxl.toBuilder());
            if (azqa.a() == 0) {
                azqa.b();
            }
            for (int i = 0; i < azqa.a(); i++) {
                if ((azqa.a(i).a & 1) != 0) {
                    anxl anxl2 = azqa.a(i).b;
                    if (anxl2 == null) {
                        anxl2 = azlk.f;
                    }
                    Object obj = azqd.b;
                    if (obj == null) {
                        obj = azlk.f;
                    }
                    if (anxl2.equals(obj)) {
                        azqa.copyOnWrite();
                        azqb azqb = (azqb) azqa.instance;
                        azqb.a();
                        azqb.a.set(i, azqd);
                        a.a((long) ((azqb) ((anxl) azqa.build())).toByteArray().length);
                        a();
                        a(true);
                        d.c.a((azqb) ((anxl) azqa.build()));
                        return;
                    }
                }
            }
            ArrayList arrayList = new ArrayList(azqa.a() + 1);
            for (int i2 = 0; i2 < azqa.a(); i2++) {
                arrayList.add(azqa.a(i2));
            }
            arrayList.add(azqd);
            azqa.b();
            azqa.copyOnWrite();
            azqb azqb2 = (azqb) azqa.instance;
            azqb2.a();
            anvf.addAll(arrayList, azqb2.a);
            a.a((long) ((azqb) ((anxl) azqa.build())).toByteArray().length);
            d.c.a((azqb) ((anxl) azqa.build()));
            a();
            a(true);
            return;
        }
        throw new agml("No stream key specified?!");
    }

    public final void a(boolean z) {
        agno agno = d().c;
        if (agno.b > 0) {
            String str;
            amxn amxn = (amxn) agno.c.listIterator();
            long j = 0;
            while (true) {
                str = "free";
                if (!amxn.hasNext()) {
                    break;
                }
                azpz azpz = ((agnl) amxn.next()).b;
                if (agos.b(azpz.b).equals(str)) {
                    break;
                }
                j += agou.a(a(azpz), j, z);
                a();
            }
            agpa a = a(str, 1);
            long i = (agno.b - ((long) a.i())) - j;
            if (i >= 0) {
                a.a(i);
                j += agou.a(a, j, z);
                a();
                amqw.b(j == agno.b, String.format(Locale.US, "Free box buffer ended at offset %d. Expected it to end at offset %d.", new Object[]{Long.valueOf(j), Long.valueOf(agno.b)}));
                for (int i2 = 0; i2 < agno.a.c.size(); i2++) {
                    StringBuilder stringBuilder = new StringBuilder(17);
                    stringBuilder.append("mdat[");
                    stringBuilder.append(i2);
                    stringBuilder.append("]");
                    j += agou.a(a(stringBuilder.toString(), 1), j, false);
                    a();
                }
                return;
            }
            throw new agml("Not enough buffer space for metadata!");
        }
        throw new agml("No metadata buffer set?!");
    }

    private static long a(agpa agpa, long j, boolean z) {
        if (agpa.d() < 0 || agpa.d() == j || z) {
            agpa.b(j);
            if (agpa.c() >= 0) {
                return ((long) agpa.i()) + agpa.c();
            }
            throw new agml("Box length unknown?!");
        }
        long d = agpa.d();
        StringBuilder stringBuilder = new StringBuilder(85);
        stringBuilder.append("Found inconsistent offset! Expected ");
        stringBuilder.append(j);
        stringBuilder.append(" but got ");
        stringBuilder.append(d);
        throw new agml(stringBuilder.toString());
    }

    private final void f() {
        agow d = d();
        agpa g = g();
        d.b.position(g.d());
        byte[] h = g.h();
        d.b.write(ByteBuffer.wrap(h, 0, h.length));
        g.g();
    }

    private final void a(byte[] bArr) {
        agow d = d();
        agpa g = g();
        a(0);
        FileChannel fileChannel = d.b;
        int length = bArr.length;
        fileChannel.write(ByteBuffer.wrap(bArr, 0, length));
        g.a(length);
    }

    public final agow d() {
        return (agow) amqw.a(this.c, (Object) "Writer not open!");
    }

    private final agpa g() {
        return (agpa) amqw.a(d().d, (Object) "No open entry!");
    }

    public final agpa a(String str, int i) {
        azpy azpy = (azpy) azpz.g.createBuilder();
        azpy.a(str);
        azpy.a(i);
        a((azpz) ((anxl) azpy.build()));
        return g();
    }
}
