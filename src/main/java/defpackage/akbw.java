package defpackage;

/* renamed from: akbw */
public final class akbw extends aoca {
    private static volatile akbw[] e;
    public azhm a;
    public aziw b;
    public ajwc c;
    public azhi d;

    public static akbw[] a() {
        if (e == null) {
            synchronized (aocd.b) {
                if (e == null) {
                    e = new akbw[0];
                }
            }
        }
        return e;
    }

    public akbw() {
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akbw)) {
            return false;
        }
        akbw akbw = (akbw) obj;
        azhm azhm = this.a;
        if (azhm == null) {
            if (akbw.a != null) {
                return false;
            }
        } else if (!azhm.equals(akbw.a)) {
            return false;
        }
        aziw aziw = this.b;
        if (aziw == null) {
            if (akbw.b != null) {
                return false;
            }
        } else if (!aziw.equals(akbw.b)) {
            return false;
        }
        ajwc ajwc = this.c;
        if (ajwc == null) {
            if (akbw.c != null) {
                return false;
            }
        } else if (!ajwc.equals(akbw.c)) {
            return false;
        }
        azhi azhi = this.d;
        if (azhi == null) {
            if (akbw.d != null) {
                return false;
            }
        } else if (!azhi.equals(akbw.d)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akbw.unknownFieldData);
        }
        aocb aocb2 = akbw.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        azhm azhm = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = azhm != null ? azhm.hashCode() : 0;
        aziw aziw = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aziw != null ? aziw.hashCode() : 0;
        ajwc ajwc = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajwc != null ? ajwc.hashCode() : 0;
        azhi azhi = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + (azhi != null ? azhi.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(49627160, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(49961548, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(88962895, aocf);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(117337765, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(49627160, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(49961548, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(88962895, aocf);
        }
        anze = this.d;
        return anze != null ? computeSerializedSize + anwm.c(117337765, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 397017282) {
                azhm azhm = (azhm) aobv.a(azhm.f.getParserForType());
                azhm azhm2 = this.a;
                if (azhm2 != null) {
                    azhp azhp = (azhp) ((anxo) azhm2.toBuilder());
                    azhp.mergeFrom(azhm);
                    azhm = (azhm) ((anxl) azhp.build());
                }
                this.a = azhm;
            } else if (a == 399692386) {
                aziw aziw = (aziw) aobv.a(aziw.f.getParserForType());
                aziw aziw2 = this.b;
                if (aziw2 != null) {
                    aziz aziz = (aziz) ((anxo) aziw2.toBuilder());
                    aziz.mergeFrom(aziw);
                    aziw = (aziw) ((anxl) aziz.build());
                }
                this.b = aziw;
            } else if (a == 711703162) {
                if (this.c == null) {
                    this.c = new ajwc();
                }
                aobv.a(this.c);
            } else if (a == 938702122) {
                azhi azhi = (azhi) aobv.a(azhi.f.getParserForType());
                azhi azhi2 = this.d;
                if (azhi2 != null) {
                    azhl azhl = (azhl) ((anxo) azhi2.toBuilder());
                    azhl.mergeFrom(azhi);
                    azhi = (azhi) ((anxl) azhl.build());
                }
                this.d = azhi;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
