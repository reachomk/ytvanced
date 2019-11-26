package defpackage;

/* renamed from: akar */
public final class akar extends aoca {
    public akab a;
    public akcd b;

    public akar() {
        this.a = null;
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akar)) {
            return false;
        }
        akar akar = (akar) obj;
        akab akab = this.a;
        if (akab == null) {
            if (akar.a != null) {
                return false;
            }
        } else if (!akab.equals(akar.a)) {
            return false;
        }
        akcd akcd = this.b;
        if (akcd == null) {
            if (akar.b != null) {
                return false;
            }
        } else if (!akcd.equals(akar.b)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akar.unknownFieldData);
        }
        aocb aocb2 = akar.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akab akab = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = akab != null ? akab.hashCode() : 0;
        akcd akcd = this.b;
        hashCode = (((hashCode + hashCode2) * 31) + (akcd != null ? akcd.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(49399797, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(91700600, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(49399797, aocf);
        }
        aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(91700600, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 395198378) {
                if (this.a == null) {
                    this.a = new akab();
                }
                aobv.a(this.a);
            } else if (a == 733604802) {
                if (this.b == null) {
                    this.b = new akcd();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
