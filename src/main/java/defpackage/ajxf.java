package defpackage;

/* renamed from: ajxf */
public final class ajxf extends aoca {
    public static volatile ajxf[] a;
    public aphg b;
    public akbb c;

    public ajxf() {
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajxf)) {
            return false;
        }
        ajxf ajxf = (ajxf) obj;
        aphg aphg = this.b;
        if (aphg == null) {
            if (ajxf.b != null) {
                return false;
            }
        } else if (!aphg.equals(ajxf.b)) {
            return false;
        }
        akbb akbb = this.c;
        if (akbb == null) {
            if (ajxf.c != null) {
                return false;
            }
        } else if (!akbb.equals(ajxf.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajxf.unknownFieldData);
        }
        aocb aocb2 = ajxf.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aphg aphg = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aphg != null ? aphg.hashCode() : 0;
        akbb akbb = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (akbb != null ? akbb.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(65153809, anze);
        }
        aocf aocf = this.c;
        if (aocf != null) {
            aoby.a(120823052, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(65153809, anze);
        }
        aocf aocf = this.c;
        return aocf != null ? computeSerializedSize + aoby.b(120823052, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 521230474) {
                aphg aphg = (aphg) aobv.a(aphg.s.getParserForType());
                aphg aphg2 = this.b;
                if (aphg2 != null) {
                    aphf aphf = (aphf) ((anxo) aphg2.toBuilder());
                    aphf.mergeFrom(aphg);
                    aphg = (aphg) ((anxl) aphf.build());
                }
                this.b = aphg;
            } else if (a == 966584418) {
                if (this.c == null) {
                    this.c = new akbb();
                }
                aobv.a(this.c);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
