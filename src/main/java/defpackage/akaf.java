package defpackage;

/* renamed from: akaf */
public final class akaf extends aoca {
    private static volatile akaf[] j;
    public axha a;
    public axgk b;
    public axgi c;
    public akai d;
    public axgy e;
    public axgc f;
    public axgg g;
    public axgb h;
    public arqh i;

    public static akaf[] a() {
        if (j == null) {
            synchronized (aocd.b) {
                if (j == null) {
                    j = new akaf[0];
                }
            }
        }
        return j;
    }

    public akaf() {
        this.d = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akaf)) {
            return false;
        }
        akaf akaf = (akaf) obj;
        axha axha = this.a;
        if (axha == null) {
            if (akaf.a != null) {
                return false;
            }
        } else if (!axha.equals(akaf.a)) {
            return false;
        }
        axgk axgk = this.b;
        if (axgk == null) {
            if (akaf.b != null) {
                return false;
            }
        } else if (!axgk.equals(akaf.b)) {
            return false;
        }
        axgi axgi = this.c;
        if (axgi == null) {
            if (akaf.c != null) {
                return false;
            }
        } else if (!axgi.equals(akaf.c)) {
            return false;
        }
        akai akai = this.d;
        if (akai == null) {
            if (akaf.d != null) {
                return false;
            }
        } else if (!akai.equals(akaf.d)) {
            return false;
        }
        axgy axgy = this.e;
        if (axgy == null) {
            if (akaf.e != null) {
                return false;
            }
        } else if (!axgy.equals(akaf.e)) {
            return false;
        }
        axgc axgc = this.f;
        if (axgc == null) {
            if (akaf.f != null) {
                return false;
            }
        } else if (!axgc.equals(akaf.f)) {
            return false;
        }
        axgg axgg = this.g;
        if (axgg == null) {
            if (akaf.g != null) {
                return false;
            }
        } else if (!axgg.equals(akaf.g)) {
            return false;
        }
        axgb axgb = this.h;
        if (axgb == null) {
            if (akaf.h != null) {
                return false;
            }
        } else if (!axgb.equals(akaf.h)) {
            return false;
        }
        arqh arqh = this.i;
        if (arqh == null) {
            if (akaf.i != null) {
                return false;
            }
        } else if (!arqh.equals(akaf.i)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akaf.unknownFieldData);
        }
        aocb aocb2 = akaf.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        axha axha = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = axha != null ? axha.hashCode() : 0;
        axgk axgk = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axgk != null ? axgk.hashCode() : 0;
        axgi axgi = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axgi != null ? axgi.hashCode() : 0;
        akai akai = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = akai != null ? akai.hashCode() : 0;
        axgy axgy = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axgy != null ? axgy.hashCode() : 0;
        axgc axgc = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axgc != null ? axgc.hashCode() : 0;
        axgg axgg = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axgg != null ? axgg.hashCode() : 0;
        axgb axgb = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = axgb != null ? axgb.hashCode() : 0;
        arqh arqh = this.i;
        hashCode = (((hashCode + hashCode2) * 31) + (arqh != null ? arqh.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(61321220, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(61331416, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(71709717, anze);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            aoby.a(75120871, aocf);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(76886494, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(133017926, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(133044997, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(147386845, anze);
        }
        anze = this.i;
        if (anze != null) {
            aoby.a(155905127, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(61321220, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(61331416, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(71709717, anze);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(75120871, aocf);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(76886494, anze);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(133017926, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(133044997, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(147386845, anze);
        }
        anze = this.i;
        return anze != null ? computeSerializedSize + anwm.c(155905127, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            switch (a) {
                case 0:
                    break;
                case 490569762:
                    axha axha = (axha) aobv.a(axha.h.getParserForType());
                    axha axha2 = this.a;
                    if (axha2 != null) {
                        axhd axhd = (axhd) ((anxo) axha2.toBuilder());
                        axhd.mergeFrom(axha);
                        axha = (axha) ((anxl) axhd.build());
                    }
                    this.a = axha;
                    continue;
                case 490651330:
                    axgk axgk = (axgk) aobv.a(axgk.p.getParserForType());
                    axgk axgk2 = this.b;
                    if (axgk2 != null) {
                        axgn axgn = (axgn) ((anxo) axgk2.toBuilder());
                        axgn.mergeFrom(axgk);
                        axgk = (axgk) ((anxl) axgn.build());
                    }
                    this.b = axgk;
                    continue;
                case 573677738:
                    axgi axgi = (axgi) aobv.a(axgi.g.getParserForType());
                    axgi axgi2 = this.c;
                    if (axgi2 != null) {
                        axgl axgl = (axgl) ((anxo) axgi2.toBuilder());
                        axgl.mergeFrom(axgi);
                        axgi = (axgi) ((anxl) axgl.build());
                    }
                    this.c = axgi;
                    continue;
                case 600966970:
                    if (this.d == null) {
                        this.d = new akai();
                    }
                    aobv.a(this.d);
                    continue;
                case 615091954:
                    axgy axgy = (axgy) aobv.a(axgy.j.getParserForType());
                    axgy axgy2 = this.e;
                    if (axgy2 != null) {
                        axhb axhb = (axhb) ((anxo) axgy2.toBuilder());
                        axhb.mergeFrom(axgy);
                        axgy = (axgy) ((anxl) axhb.build());
                    }
                    this.e = axgy;
                    continue;
                case 1064143410:
                    axgc axgc = (axgc) aobv.a(axgc.c.getParserForType());
                    axgc axgc2 = this.f;
                    if (axgc2 != null) {
                        axgf axgf = (axgf) ((anxo) axgc2.toBuilder());
                        axgf.mergeFrom(axgc);
                        axgc = (axgc) ((anxl) axgf.build());
                    }
                    this.f = axgc;
                    continue;
                case 1064359978:
                    axgg axgg = (axgg) aobv.a(axgg.f.getParserForType());
                    axgg axgg2 = this.g;
                    if (axgg2 != null) {
                        axgj axgj = (axgj) ((anxo) axgg2.toBuilder());
                        axgj.mergeFrom(axgg);
                        axgg = (axgg) ((anxl) axgj.build());
                    }
                    this.g = axgg;
                    continue;
                case 1179094762:
                    axgb axgb = (axgb) aobv.a(axgb.e.getParserForType());
                    axgb axgb2 = this.h;
                    if (axgb2 != null) {
                        axgd axgd = (axgd) ((anxo) axgb2.toBuilder());
                        axgd.mergeFrom(axgb);
                        axgb = (axgb) ((anxl) axgd.build());
                    }
                    this.h = axgb;
                    continue;
                case 1247241018:
                    arqh arqh = (arqh) aobv.a(arqh.i.getParserForType());
                    arqh arqh2 = this.i;
                    if (arqh2 != null) {
                        arqk arqk = (arqk) ((anxo) arqh2.toBuilder());
                        arqk.mergeFrom(arqh);
                        arqh = (arqh) ((anxl) arqk.build());
                    }
                    this.i = arqh;
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
