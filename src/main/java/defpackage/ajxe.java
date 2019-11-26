package defpackage;

/* renamed from: ajxe */
public final class ajxe extends ajwo {
    public auxf[] a;
    private arml b;

    public ajxe() {
        super(66657607);
        this.a = new auxf[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajxe) {
            ajxe ajxe = (ajxe) obj;
            arml arml = this.b;
            if (arml == null) {
                if (ajxe.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajxe.b)) {
                return false;
            }
            if (aocd.a(this.a, ajxe.a)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajxe.unknownFieldData);
                }
                aocb aocb2 = ajxe.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.b;
        int i = 0;
        hashCode = (((((hashCode + 527) * 31) + (arml != null ? arml.hashCode() : 0)) * 31) + aocd.a(this.a)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.b;
        if (anze != null) {
            aoby.a(1, anze);
        }
        auxf[] auxfArr = this.a;
        if (auxfArr != null && auxfArr.length > 0) {
            int i = 0;
            while (true) {
                auxf[] auxfArr2 = this.a;
                if (i >= auxfArr2.length) {
                    break;
                }
                anze anze2 = auxfArr2[i];
                if (anze2 != null) {
                    aoby.a(2, anze2);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        auxf[] auxfArr = this.a;
        if (auxfArr != null && auxfArr.length > 0) {
            int i = 0;
            while (true) {
                auxf[] auxfArr2 = this.a;
                if (i >= auxfArr2.length) {
                    break;
                }
                anze anze2 = auxfArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(2, anze2);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                arml arml = (arml) aobv.a(arml.f.getParserForType());
                arml arml2 = this.b;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.b = arml;
            } else if (a == 18) {
                a = aock.a(aobv, 18);
                auxf[] auxfArr = this.a;
                int length = auxfArr != null ? auxfArr.length : 0;
                auxf[] auxfArr2 = new auxf[(a + length)];
                if (length != 0) {
                    System.arraycopy(auxfArr, 0, auxfArr2, 0, length);
                }
                while (length < auxfArr2.length - 1) {
                    auxfArr2[length] = (auxf) aobv.a(auxf.y.getParserForType());
                    aobv.a();
                    length++;
                }
                auxfArr2[length] = (auxf) aobv.a(auxf.y.getParserForType());
                this.a = auxfArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
