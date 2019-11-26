package defpackage;

/* renamed from: amhk */
public final class amhk extends amgh {
    private final afpu a;
    private final atlx c;
    private final abdj d;
    private final alys e;
    private final amch f;

    public amhk(afpu afpu, atlx atlx, abdj abdj, amch amch, alys alys, ambw ambw) {
        super(28, ambw);
        this.a = afpu;
        this.c = atlx;
        this.d = abdj;
        this.e = alys;
        this.f = amch;
    }

    public final String a() {
        return "SaveMetadataTask";
    }

    public final boolean d() {
        return false;
    }

    public final amec a(amea amea) {
        amec amec = amea.J;
        return amec == null ? amec.g : amec;
    }

    public final bbnr c() {
        return amhj.a;
    }

    public final amcj b() {
        return this.f;
    }

    /* Access modifiers changed, original: final */
    public final anjv a(String str, amea amea) {
        afpt a = this.a.a(amea.c);
        if (a != null) {
            asxv asxv = (asxv) asxw.u.createBuilder();
            asxv.a(amea.G);
            asxq asxq = (asxq) asxn.c.createBuilder();
            ameo ameo = amea.f;
            if (ameo == null) {
                ameo = ameo.g;
            }
            if (ameo.b.isEmpty()) {
                throw new AssertionError("Metadata update with empty title");
            }
            ameo = amea.f;
            if (ameo == null) {
                ameo = ameo.g;
            }
            asxq.a(ameo.b);
            asxv.a(asxq);
            aswu aswu = (aswu) aswr.c.createBuilder();
            ameo = amea.f;
            if (ameo == null) {
                ameo = ameo.g;
            }
            aswu.a(ameo.c);
            asxv.a(aswu);
            asxi asxi = (asxi) asxf.c.createBuilder();
            ameo = amea.f;
            if (ameo == null) {
                ameo = ameo.g;
            }
            int a2 = ames.a(ameo.d);
            if (a2 == 0) {
                a2 = 1;
            }
            a2--;
            if (a2 == 0) {
                asxi.a(awnx.PRIVATE);
            } else if (a2 != 1) {
                asxi.a(awnx.UNLISTED);
            } else {
                asxi.a(awnx.PUBLIC);
            }
            asxv.a(asxi);
            asxo asxo = (asxo) asxl.b.createBuilder();
            ameo = amea.f;
            if (ameo == null) {
                ameo = ameo.g;
            }
            asxo.a(ameo.e);
            asxv.a(asxo);
            ameo ameo2 = amea.f;
            if (ameo2 == null) {
                ameo2 = ameo.g;
            }
            if ((ameo2.a & 8) != 0) {
                asxc asxc = (asxc) aswz.g.createBuilder();
                ameo = amea.f;
                if (ameo == null) {
                    ameo = ameo.g;
                }
                ameq ameq = ameo.f;
                if (ameq == null) {
                    ameq = ameq.f;
                }
                double d = ameq.b;
                asxc.copyOnWrite();
                aswz aswz = (aswz) asxc.instance;
                aswz.a |= 1;
                aswz.b = d;
                ameo = amea.f;
                if (ameo == null) {
                    ameo = ameo.g;
                }
                ameq = ameo.f;
                if (ameq == null) {
                    ameq = ameq.f;
                }
                d = ameq.c;
                asxc.copyOnWrite();
                aswz = (aswz) asxc.instance;
                aswz.a |= 2;
                aswz.c = d;
                ameo = amea.f;
                if (ameo == null) {
                    ameo = ameo.g;
                }
                ameq = ameo.f;
                if (ameq == null) {
                    ameq = ameq.f;
                }
                asxc.b(ameq.d);
                ameo ameo3 = amea.f;
                if (ameo3 == null) {
                    ameo3 = ameo.g;
                }
                ameq ameq2 = ameo3.f;
                if (ameq2 == null) {
                    ameq2 = ameq.f;
                }
                asxc.a(ameq2.e);
                asxv.a(asxc);
            }
            abdj abdj = this.d;
            byte[] bArr = zzp.b;
            aang aang = abdj.a;
            abdn abdn = new abdn(abdj.c, a, asxv);
            if (bArr == null) {
                bArr = zzp.b;
            }
            abdn.a(bArr);
            asxy asxy = (asxy) aang.b(abdn);
            if ((asxy.a & 4) != 0) {
                asye asye = asxy.e;
                if (asye == null) {
                    asye = asye.f;
                }
                int a3 = asyg.a(asye.b);
                if (a3 == 0 || a3 == 1) {
                    return anjf.a(a(amjq.a(), true));
                }
            }
            throw new aanq("Overall result is not a success");
        }
        throw new amgj();
    }

    /* Access modifiers changed, original: final */
    public final alzf a(Throwable th, amea amea, boolean z) {
        if (th instanceof aanq) {
            Object obj = amea.J;
            if (obj == null) {
                obj = amec.g;
            }
            return a(amjq.a(5, (amec) amqw.a(obj), this.c.r, this.e), z);
        }
        alys alys = this.e;
        String concat = "SaveMetadataTask".concat(" Throwable");
        int a = amek.a(amea.h);
        if (a == 0) {
            a = 1;
        }
        alys.a(concat, th, a);
        return super.a(th, amea, z);
    }

    /* Access modifiers changed, original: final */
    public final boolean b(amea amea) {
        int i = amea.a;
        return ((i & 1) == 0 || (536870912 & i) == 0 || (i & 8) == 0) ? false : true;
    }
}
