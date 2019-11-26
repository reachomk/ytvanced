package defpackage;

/* renamed from: ajxg */
public final class ajxg extends aoca {
    public static volatile ajxg[] a;
    public aogi b;
    private aywz c;
    private ated d;

    public ajxg() {
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajxg)) {
            return false;
        }
        ajxg ajxg = (ajxg) obj;
        aywz aywz = this.c;
        if (aywz == null) {
            if (ajxg.c != null) {
                return false;
            }
        } else if (!aywz.equals(ajxg.c)) {
            return false;
        }
        ated ated = this.d;
        if (ated == null) {
            if (ajxg.d != null) {
                return false;
            }
        } else if (!ated.equals(ajxg.d)) {
            return false;
        }
        aogi aogi = this.b;
        if (aogi == null) {
            if (ajxg.b != null) {
                return false;
            }
        } else if (!aogi.equals(ajxg.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajxg.unknownFieldData);
        }
        aocb aocb2 = ajxg.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aywz aywz = this.c;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aywz != null ? aywz.hashCode() : 0;
        ated ated = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ated != null ? ated.hashCode() : 0;
        aogi aogi = this.b;
        hashCode = (((hashCode + hashCode2) * 31) + (aogi != null ? aogi.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.c;
        if (anze != null) {
            aoby.a(31798815, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(63112829, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(84813246, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(31798815, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(63112829, anze);
        }
        anze = this.b;
        return anze != null ? computeSerializedSize + anwm.c(84813246, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 254390522) {
                aywz aywz = (aywz) aobv.a(aywz.a.getParserForType());
                aywz aywz2 = this.c;
                if (aywz2 != null) {
                    aywy aywy = (aywy) ((anxo) aywz2.toBuilder());
                    aywy.mergeFrom(aywz);
                    aywz = (aywz) ((anxl) aywy.build());
                }
                this.c = aywz;
            } else if (a == 504902634) {
                ated ated = (ated) aobv.a(ated.d.getParserForType());
                ated ated2 = this.d;
                if (ated2 != null) {
                    ateg ateg = (ateg) ((anxo) ated2.toBuilder());
                    ateg.mergeFrom(ated);
                    ated = (ated) ((anxl) ateg.build());
                }
                this.d = ated;
            } else if (a == 678505970) {
                aogi aogi = (aogi) aobv.a(aogi.h.getParserForType());
                aogi aogi2 = this.b;
                if (aogi2 != null) {
                    aogj aogj = (aogj) ((anxo) aogi2.toBuilder());
                    aogj.mergeFrom(aogi);
                    aogi = (aogi) ((anxl) aogj.build());
                }
                this.b = aogi;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
