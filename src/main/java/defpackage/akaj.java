package defpackage;

/* renamed from: akaj */
public final class akaj extends aoca {
    public static volatile akaj[] a;
    public aymk b;
    public ajte c;
    public aylm d;
    public ayko e;
    public aymi f;

    public akaj() {
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akaj)) {
            return false;
        }
        akaj akaj = (akaj) obj;
        aymk aymk = this.b;
        if (aymk == null) {
            if (akaj.b != null) {
                return false;
            }
        } else if (!aymk.equals(akaj.b)) {
            return false;
        }
        ajte ajte = this.c;
        if (ajte == null) {
            if (akaj.c != null) {
                return false;
            }
        } else if (!ajte.equals(akaj.c)) {
            return false;
        }
        aylm aylm = this.d;
        if (aylm == null) {
            if (akaj.d != null) {
                return false;
            }
        } else if (!aylm.equals(akaj.d)) {
            return false;
        }
        ayko ayko = this.e;
        if (ayko == null) {
            if (akaj.e != null) {
                return false;
            }
        } else if (!ayko.equals(akaj.e)) {
            return false;
        }
        aymi aymi = this.f;
        if (aymi == null) {
            if (akaj.f != null) {
                return false;
            }
        } else if (!aymi.equals(akaj.f)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akaj.unknownFieldData);
        }
        aocb aocb2 = akaj.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aymk aymk = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aymk != null ? aymk.hashCode() : 0;
        ajte ajte = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajte != null ? ajte.hashCode() : 0;
        aylm aylm = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aylm != null ? aylm.hashCode() : 0;
        ayko ayko = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ayko != null ? ayko.hashCode() : 0;
        aymi aymi = this.f;
        hashCode = (((hashCode + hashCode2) * 31) + (aymi != null ? aymi.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(87195780, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(87264807, aocf);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(133992053, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(171307649, anze);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(213513701, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(87195780, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(87264807, aocf);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(133992053, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(171307649, anze);
        }
        anze = this.f;
        return anze != null ? computeSerializedSize + anwm.c(213513701, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 697566242) {
                aymk aymk = (aymk) aobv.a(aymk.h.getParserForType());
                aymk aymk2 = this.b;
                if (aymk2 != null) {
                    aymm aymm = (aymm) ((anxo) aymk2.toBuilder());
                    aymm.mergeFrom(aymk);
                    aymk = (aymk) ((anxl) aymm.build());
                }
                this.b = aymk;
            } else if (a == 698118458) {
                if (this.c == null) {
                    this.c = new ajte();
                }
                aobv.a(this.c);
            } else if (a == 1071936426) {
                aylm aylm = (aylm) aobv.a(aylm.d.getParserForType());
                aylm aylm2 = this.d;
                if (aylm2 != null) {
                    aylp aylp = (aylp) ((anxo) aylm2.toBuilder());
                    aylp.mergeFrom(aylm);
                    aylm = (aylm) ((anxl) aylp.build());
                }
                this.d = aylm;
            } else if (a == 1370461194) {
                ayko ayko = (ayko) aobv.a(ayko.e.getParserForType());
                ayko ayko2 = this.e;
                if (ayko2 != null) {
                    aykr aykr = (aykr) ((anxo) ayko2.toBuilder());
                    aykr.mergeFrom(ayko);
                    ayko = (ayko) ((anxl) aykr.build());
                }
                this.e = ayko;
            } else if (a == 1708109610) {
                aymi aymi = (aymi) aobv.a(aymi.b.getParserForType());
                aymi aymi2 = this.f;
                if (aymi2 != null) {
                    ayml ayml = (ayml) ((anxo) aymi2.toBuilder());
                    ayml.mergeFrom(aymi);
                    aymi = (aymi) ((anxl) ayml.build());
                }
                this.f = aymi;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
