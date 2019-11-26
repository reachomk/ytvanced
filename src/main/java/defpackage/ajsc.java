package defpackage;

/* renamed from: ajsc */
public final class ajsc extends ajwo {
    public arml a;
    public ajrz b;
    public aphj[] c;

    public ajsc() {
        super(79964994);
        this.b = null;
        this.c = new aphj[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajsc) {
            ajsc ajsc = (ajsc) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajsc.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajsc.a)) {
                return false;
            }
            ajrz ajrz = this.b;
            if (ajrz == null) {
                if (ajsc.b != null) {
                    return false;
                }
            } else if (!ajrz.equals(ajsc.b)) {
                return false;
            }
            if (aocd.a(this.c, ajsc.c)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajsc.unknownFieldData);
                }
                aocb aocb2 = ajsc.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        ajrz ajrz = this.b;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajrz != null ? ajrz.hashCode() : 0)) * 31) + aocd.a(this.c)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        aphj[] aphjArr = this.c;
        if (aphjArr != null && aphjArr.length > 0) {
            int i = 0;
            while (true) {
                aphj[] aphjArr2 = this.c;
                if (i >= aphjArr2.length) {
                    break;
                }
                anze anze2 = aphjArr2[i];
                if (anze2 != null) {
                    aoby.a(3, anze2);
                }
                i++;
            }
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
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        aphj[] aphjArr = this.c;
        if (aphjArr != null && aphjArr.length > 0) {
            int i = 0;
            while (true) {
                aphj[] aphjArr2 = this.c;
                if (i >= aphjArr2.length) {
                    break;
                }
                anze anze2 = aphjArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(3, anze2);
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
                arml arml2 = this.a;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.a = arml;
            } else if (a == 18) {
                if (this.b == null) {
                    this.b = new ajrz();
                }
                aobv.a(this.b);
            } else if (a == 26) {
                a = aock.a(aobv, 26);
                aphj[] aphjArr = this.c;
                int length = aphjArr != null ? aphjArr.length : 0;
                aphj[] aphjArr2 = new aphj[(a + length)];
                if (length != 0) {
                    System.arraycopy(aphjArr, 0, aphjArr2, 0, length);
                }
                while (length < aphjArr2.length - 1) {
                    aphjArr2[length] = (aphj) aobv.a(aphj.d.getParserForType());
                    aobv.a();
                    length++;
                }
                aphjArr2[length] = (aphj) aobv.a(aphj.d.getParserForType());
                this.c = aphjArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
