package defpackage;

/* renamed from: angh */
public final class angh extends aoca implements Cloneable {
    private ancw a;
    private anda b;
    private andk c;
    private andg d;
    private andq e;
    private ancy f;
    private ancs g;
    private ands h;
    private ando i;
    private andc j;
    private andi k;
    private andu l;
    private ande m;
    private ancu n;
    private andm o;

    public angh() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    /* renamed from: a */
    public final angh clone() {
        try {
            angh angh = (angh) super.clone();
            ancw ancw = this.a;
            if (ancw != null) {
                angh.a = ancw;
            }
            anda anda = this.b;
            if (anda != null) {
                angh.b = anda;
            }
            andk andk = this.c;
            if (andk != null) {
                angh.c = andk;
            }
            andg andg = this.d;
            if (andg != null) {
                angh.d = andg;
            }
            andq andq = this.e;
            if (andq != null) {
                angh.e = andq;
            }
            ancy ancy = this.f;
            if (ancy != null) {
                angh.f = ancy;
            }
            ancs ancs = this.g;
            if (ancs != null) {
                angh.g = ancs;
            }
            ands ands = this.h;
            if (ands != null) {
                angh.h = ands;
            }
            ando ando = this.i;
            if (ando != null) {
                angh.i = ando;
            }
            andc andc = this.j;
            if (andc != null) {
                angh.j = andc;
            }
            andi andi = this.k;
            if (andi != null) {
                angh.k = andi;
            }
            andu andu = this.l;
            if (andu != null) {
                angh.l = andu;
            }
            ande ande = this.m;
            if (ande != null) {
                angh.m = ande;
            }
            ancu ancu = this.n;
            if (ancu != null) {
                angh.n = ancu;
            }
            andm andm = this.o;
            if (andm != null) {
                angh.o = andm;
            }
            return angh;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(6, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(7, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(8, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(9, anze);
        }
        anze = this.j;
        if (anze != null) {
            aoby.a(10, anze);
        }
        anze = this.k;
        if (anze != null) {
            aoby.a(11, anze);
        }
        anze = this.l;
        if (anze != null) {
            aoby.a(12, anze);
        }
        anze = this.m;
        if (anze != null) {
            aoby.a(13, anze);
        }
        anze = this.n;
        if (anze != null) {
            aoby.a(14, anze);
        }
        anze = this.o;
        if (anze != null) {
            aoby.a(15, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        anze = this.i;
        if (anze != null) {
            computeSerializedSize += anwm.c(9, anze);
        }
        anze = this.j;
        if (anze != null) {
            computeSerializedSize += anwm.c(10, anze);
        }
        anze = this.k;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        anze = this.l;
        if (anze != null) {
            computeSerializedSize += anwm.c(12, anze);
        }
        anze = this.m;
        if (anze != null) {
            computeSerializedSize += anwm.c(13, anze);
        }
        anze = this.n;
        if (anze != null) {
            computeSerializedSize += anwm.c(14, anze);
        }
        anze = this.o;
        return anze != null ? computeSerializedSize + anwm.c(15, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 10:
                    ancw ancw = (ancw) aobv.a(ancw.a.getParserForType());
                    ancw ancw2 = this.a;
                    if (ancw2 != null) {
                        ancv ancv = (ancv) ((anxo) ancw2.toBuilder());
                        ancv.mergeFrom(ancw);
                        ancw = (ancw) ((anxl) ancv.build());
                    }
                    this.a = ancw;
                    continue;
                case 18:
                    anda anda = (anda) aobv.a(anda.a.getParserForType());
                    anda anda2 = this.b;
                    if (anda2 != null) {
                        ancz ancz = (ancz) ((anxo) anda2.toBuilder());
                        ancz.mergeFrom(anda);
                        anda = (anda) ((anxl) ancz.build());
                    }
                    this.b = anda;
                    continue;
                case 26:
                    andk andk = (andk) aobv.a(andk.a.getParserForType());
                    andk andk2 = this.c;
                    if (andk2 != null) {
                        andj andj = (andj) ((anxo) andk2.toBuilder());
                        andj.mergeFrom(andk);
                        andk = (andk) ((anxl) andj.build());
                    }
                    this.c = andk;
                    continue;
                case 34:
                    andg andg = (andg) aobv.a(andg.a.getParserForType());
                    andg andg2 = this.d;
                    if (andg2 != null) {
                        andf andf = (andf) ((anxo) andg2.toBuilder());
                        andf.mergeFrom(andg);
                        andg = (andg) ((anxl) andf.build());
                    }
                    this.d = andg;
                    continue;
                case 42:
                    andq andq = (andq) aobv.a(andq.a.getParserForType());
                    andq andq2 = this.e;
                    if (andq2 != null) {
                        andp andp = (andp) ((anxo) andq2.toBuilder());
                        andp.mergeFrom(andq);
                        andq = (andq) ((anxl) andp.build());
                    }
                    this.e = andq;
                    continue;
                case cv.aU /*50*/:
                    ancy ancy = (ancy) aobv.a(ancy.a.getParserForType());
                    ancy ancy2 = this.f;
                    if (ancy2 != null) {
                        ancx ancx = (ancx) ((anxo) ancy2.toBuilder());
                        ancx.mergeFrom(ancy);
                        ancy = (ancy) ((anxl) ancx.build());
                    }
                    this.f = ancy;
                    continue;
                case 58:
                    ancs ancs = (ancs) aobv.a(ancs.a.getParserForType());
                    ancs ancs2 = this.g;
                    if (ancs2 != null) {
                        ancr ancr = (ancr) ((anxo) ancs2.toBuilder());
                        ancr.mergeFrom(ancs);
                        ancs = (ancs) ((anxl) ancr.build());
                    }
                    this.g = ancs;
                    continue;
                case 66:
                    ands ands = (ands) aobv.a(ands.a.getParserForType());
                    ands ands2 = this.h;
                    if (ands2 != null) {
                        andr andr = (andr) ((anxo) ands2.toBuilder());
                        andr.mergeFrom(ands);
                        ands = (ands) ((anxl) andr.build());
                    }
                    this.h = ands;
                    continue;
                case 74:
                    ando ando = (ando) aobv.a(ando.a.getParserForType());
                    ando ando2 = this.i;
                    if (ando2 != null) {
                        andn andn = (andn) ((anxo) ando2.toBuilder());
                        andn.mergeFrom(ando);
                        ando = (ando) ((anxl) andn.build());
                    }
                    this.i = ando;
                    continue;
                case 82:
                    andc andc = (andc) aobv.a(andc.a.getParserForType());
                    andc andc2 = this.j;
                    if (andc2 != null) {
                        andb andb = (andb) ((anxo) andc2.toBuilder());
                        andb.mergeFrom(andc);
                        andc = (andc) ((anxl) andb.build());
                    }
                    this.j = andc;
                    continue;
                case 90:
                    andi andi = (andi) aobv.a(andi.a.getParserForType());
                    andi andi2 = this.k;
                    if (andi2 != null) {
                        andh andh = (andh) ((anxo) andi2.toBuilder());
                        andh.mergeFrom(andi);
                        andi = (andi) ((anxl) andh.build());
                    }
                    this.k = andi;
                    continue;
                case 98:
                    andu andu = (andu) aobv.a(andu.a.getParserForType());
                    andu andu2 = this.l;
                    if (andu2 != null) {
                        andt andt = (andt) ((anxo) andu2.toBuilder());
                        andt.mergeFrom(andu);
                        andu = (andu) ((anxl) andt.build());
                    }
                    this.l = andu;
                    continue;
                case 106:
                    ande ande = (ande) aobv.a(ande.a.getParserForType());
                    ande ande2 = this.m;
                    if (ande2 != null) {
                        andd andd = (andd) ((anxo) ande2.toBuilder());
                        andd.mergeFrom(ande);
                        ande = (ande) ((anxl) andd.build());
                    }
                    this.m = ande;
                    continue;
                case 114:
                    ancu ancu = (ancu) aobv.a(ancu.a.getParserForType());
                    ancu ancu2 = this.n;
                    if (ancu2 != null) {
                        anct anct = (anct) ((anxo) ancu2.toBuilder());
                        anct.mergeFrom(ancu);
                        ancu = (ancu) ((anxl) anct.build());
                    }
                    this.n = ancu;
                    continue;
                case afy.av /*122*/:
                    andm andm = (andm) aobv.a(andm.a.getParserForType());
                    andm andm2 = this.o;
                    if (andm2 != null) {
                        andl andl = (andl) ((anxo) andm2.toBuilder());
                        andl.mergeFrom(andm);
                        andm = (andm) ((anxl) andl.build());
                    }
                    this.o = andm;
                    continue;
                default:
                    if (!super.storeUnknownField(aobv, a)) {
                        break;
                    }
                    continue;
            }
        }
        return this;
    }
}
