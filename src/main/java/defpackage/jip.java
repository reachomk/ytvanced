package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: jip */
public class jip extends akwe implements jme, xcp {
    private final jje a;
    private final xsc b;
    private final har c;
    private jiw d;
    private long e = 0;
    private long f = 0;
    private String g = null;

    public jip(akvz akvz, xci xci, xoi xoi, akdk akdk, xsc xsc, har har, amqp amqp, aana aana, acvx acvx, akyd akyd) {
        akyd akyd2 = akyd;
        super(aana, akvz, xci, xoi, acvx, akyd.a(akyd), amqp);
        this.b = (xsc) amqw.a((Object) xsc);
        this.c = har;
        if (akyd2 instanceof jix) {
            jix jix = (jix) akyd2;
            this.a = new jje(jix.a);
            this.e = jix.b;
            this.f = jix.c;
            this.g = jix.d;
        } else {
            this.a = new jje();
        }
        a(new jis());
        a(new jiv());
        a(new jiu());
        akdk akdk2 = akdk;
        a((akxt) akdk);
        if ((this.f != 0 && this.b.b() - this.e >= TimeUnit.SECONDS.toMillis(this.f)) || this.c.a(this.g, this.e)) {
            s();
        }
    }

    public final void a(zyg zyg) {
        if (a() instanceof akpk) {
            akpk akpk = (akpk) a();
            int indexOf = akpk.indexOf(zyg.d);
            if (indexOf >= 0) {
                c(zyg.d);
                boolean z = false;
                if (akpk.size() == 1 && (akpk.get(0) instanceof kes)) {
                    akpk.remove(0);
                    z = true;
                }
                this.d = new jfu(zyg.d, indexOf, z);
            }
            return;
        }
        super.a(zyg);
    }

    public final void a(zyp zyp) {
        super.a(zyp);
        if (a() instanceof akpk) {
            akpk akpk = (akpk) a();
            if (akpk.size() == 1 && (akpk.get(0) instanceof atvp)) {
                akpk.remove(0);
            }
        }
    }

    public final void a(gzx gzx) {
        amqp c = amqp.c(gzx.d);
        amqp a = amqp.c(gzx.a()).a(amqp.c(gzx.b())).a(amqp.c(gzx.a.e));
        if (c.a() && a.a()) {
            this.a.a(a.b(), c.b());
            a(c.b(), a.b());
        }
    }

    public final void a(aaxc aaxc) {
        amqp c = amqp.c(aaxc.b);
        amqp a = c.a() ? this.a.a(c.b()) : ampo.a;
        if (c.a() && a.a()) {
            b(c.b(), a.b());
            return;
        }
        Object obj = aaxc.c;
        jiw jiw = this.d;
        if (!(jiw == null || obj == null || !obj.equals(jiw.a()))) {
            a(aaxc.c, this.d.b());
            if (this.d.c()) {
                b(new kes());
            }
            this.d = null;
        }
    }

    public void a(aafj aafj) {
        super.a(aafj);
        this.e = this.b.b();
        ajwt ajwt = aafj.a;
        this.g = ajwt != null ? ajwt.f : null;
        this.c.a(this.g);
        if (ajwt != null) {
            int i = ajwt.h;
            long j = (long) i;
            if (j != 0 && i > 0) {
                this.f = j;
                return;
            }
        }
        this.f = 0;
    }

    public final void a(ajws ajws) {
        super.a(ajws);
        atvj atvj = ajws.a.g;
        if (atvj == null) {
            atvj = atvj.c;
        }
        if ((atvj.a & 1) != 0) {
            atvj atvj2 = ajws.a.g;
            if (atvj2 == null) {
                atvj2 = atvj.c;
            }
            Object obj = atvj2.b;
            if (obj == null) {
                obj = axcs.h;
            }
            b(obj);
        }
    }

    /* JADX WARNING: Missing block: B:37:0x005b, code skipped:
            if ((r0.a & 1) == 0) goto L_0x005d;
     */
    public final void b(defpackage.aafj r7) {
        /*
        r6 = this;
        super.b(r7);
        r0 = r7.a;
        r1 = r0.g;
        if (r1 != 0) goto L_0x0083;
    L_0x0009:
        r0 = r0.b;
        if (r0 == 0) goto L_0x0083;
    L_0x000d:
        r1 = r0.length;
        if (r1 <= 0) goto L_0x0083;
    L_0x0010:
        r2 = 0;
        r3 = r0[r2];
        if (r3 != 0) goto L_0x0017;
    L_0x0015:
        goto L_0x0083;
    L_0x0017:
        r4 = r3.R;
        if (r4 != 0) goto L_0x006c;
    L_0x001b:
        r4 = 2;
        r5 = 1;
        if (r1 == r4) goto L_0x0020;
    L_0x001f:
        goto L_0x002a;
    L_0x0020:
        r4 = r3.au;
        if (r4 == 0) goto L_0x002a;
    L_0x0024:
        r4 = r0[r5];
        r4 = r4.ar;
        if (r4 != 0) goto L_0x006c;
    L_0x002a:
        r4 = r3.aN;
        if (r4 != 0) goto L_0x006c;
    L_0x002e:
        r4 = r3.aM;
        if (r4 != 0) goto L_0x006c;
    L_0x0032:
        r3 = r3.aO;
        if (r3 != 0) goto L_0x006c;
    L_0x0036:
        r3 = 0;
    L_0x0037:
        if (r3 >= r1) goto L_0x0042;
    L_0x0039:
        r4 = r0[r3];
        r4 = r4.aW;
        if (r4 != 0) goto L_0x006c;
    L_0x003f:
        r3 = r3 + 1;
        goto L_0x0037;
    L_0x0042:
        r1 = r0.length;
        if (r1 <= 0) goto L_0x005d;
    L_0x0045:
        r1 = r0[r2];
        r1 = r1.aX;
        if (r1 != 0) goto L_0x006c;
    L_0x004b:
        r0 = r0[r2];
        r0 = r0.ay;
        if (r0 != 0) goto L_0x0052;
    L_0x0051:
        goto L_0x005d;
    L_0x0052:
        r0 = r0.d;
        if (r0 != 0) goto L_0x0058;
    L_0x0056:
        r0 = defpackage.arbw.f;
    L_0x0058:
        r0 = r0.a;
        r0 = r0 & r5;
        if (r0 != 0) goto L_0x006c;
    L_0x005d:
        r0 = r7.a;
        r0 = r0.i;
        if (r0 == 0) goto L_0x0083;
    L_0x0063:
        r1 = r0.a;
        r1 = r1 & r5;
        if (r1 == 0) goto L_0x0083;
    L_0x0068:
        r0 = r0.b;
        if (r0 == 0) goto L_0x0083;
    L_0x006c:
        r7 = r7.a;
        r7 = r7.i;
        if (r7 != 0) goto L_0x007b;
    L_0x0072:
        r7 = new kes;
        r7.<init>();
        r6.b(r7);
        goto L_0x0083;
    L_0x007b:
        r0 = new kes;
        r0.<init>(r7);
        r6.b(r0);
    L_0x0083:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jip.b(aafj):void");
    }

    public final void a(Object obj, Object obj2) {
        this.a.a(obj2, obj);
        b(obj, obj2);
    }

    public final akyd E_() {
        return new jix(super.E_(), this.a.E_(), this.e, this.f, this.g);
    }

    public Class[] a(Class cls, Object obj, int i) {
        if (cls != jip.class) {
            return super.a(cls, obj, i);
        }
        Class[] clsArr = null;
        switch (i) {
            case -1:
                clsArr = new Class[]{gzx.class, zyg.class, zyp.class, aaxd.class, aaxc.class, akwd.class};
                break;
            case 0:
                a((gzx) obj);
                break;
            case 1:
                a((zyg) obj);
                break;
            case 2:
                a((zyp) obj);
                break;
            case 3:
                a((aaxd) obj);
                break;
            case 4:
                a((aaxc) obj);
                break;
            case 5:
                a((akwd) obj);
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
