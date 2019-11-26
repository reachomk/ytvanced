package defpackage;

/* renamed from: akcc */
public final class akcc extends aoca {
    public static volatile akcc[] a;
    public akbz b;
    public akca c;
    public akby d;

    public akcc() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof akcc)) {
            return false;
        }
        akcc akcc = (akcc) obj;
        akbz akbz = this.b;
        if (akbz == null) {
            if (akcc.b != null) {
                return false;
            }
        } else if (!akbz.equals(akcc.b)) {
            return false;
        }
        akca akca = this.c;
        if (akca == null) {
            if (akcc.c != null) {
                return false;
            }
        } else if (!akca.equals(akcc.c)) {
            return false;
        }
        akby akby = this.d;
        if (akby == null) {
            if (akcc.d != null) {
                return false;
            }
        } else if (!akby.equals(akcc.d)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(akcc.unknownFieldData);
        }
        aocb aocb2 = akcc.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akbz akbz = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = akbz != null ? akbz.hashCode() : 0;
        akca akca = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = akca != null ? akca.hashCode() : 0;
        akby akby = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + (akby != null ? akby.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(117457335, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(117548244, aocf);
        }
        aocf = this.d;
        if (aocf != null) {
            aoby.a(147633782, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(117457335, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(117548244, aocf);
        }
        aocf = this.d;
        return aocf != null ? computeSerializedSize + aoby.b(147633782, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 939658682) {
                if (this.b == null) {
                    this.b = new akbz();
                }
                aobv.a(this.b);
            } else if (a == 940385954) {
                if (this.c == null) {
                    this.c = new akca();
                }
                aobv.a(this.c);
            } else if (a == 1181070258) {
                if (this.d == null) {
                    this.d = new akby();
                }
                aobv.a(this.d);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
