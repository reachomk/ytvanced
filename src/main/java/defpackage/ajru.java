package defpackage;

/* renamed from: ajru */
public final class ajru extends aoca {
    public akab a;
    public akaq b;
    public akbi c;

    public ajru() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ajru)) {
            return false;
        }
        ajru ajru = (ajru) obj;
        akab akab = this.a;
        if (akab == null) {
            if (ajru.a != null) {
                return false;
            }
        } else if (!akab.equals(ajru.a)) {
            return false;
        }
        akaq akaq = this.b;
        if (akaq == null) {
            if (ajru.b != null) {
                return false;
            }
        } else if (!akaq.equals(ajru.b)) {
            return false;
        }
        akbi akbi = this.c;
        if (akbi == null) {
            if (ajru.c != null) {
                return false;
            }
        } else if (!akbi.equals(ajru.c)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(ajru.unknownFieldData);
        }
        aocb aocb2 = ajru.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akab akab = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = akab != null ? akab.hashCode() : 0;
        akaq akaq = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = akaq != null ? akaq.hashCode() : 0;
        akbi akbi = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (akbi != null ? akbi.hashCode() : 0)) * 31;
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
            aoby.a(58173949, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(118637602, aocf);
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
        if (aocf != null) {
            computeSerializedSize += aoby.b(58173949, aocf);
        }
        aocf = this.c;
        return aocf != null ? computeSerializedSize + aoby.b(118637602, aocf) : computeSerializedSize;
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
            } else if (a == 465391594) {
                if (this.b == null) {
                    this.b = new akaq();
                }
                aobv.a(this.b);
            } else if (a == 949100818) {
                if (this.c == null) {
                    this.c = new akbi();
                }
                aobv.a(this.c);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
