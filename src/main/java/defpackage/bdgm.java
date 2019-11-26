package defpackage;

/* renamed from: bdgm */
public final class bdgm extends aoca {
    public static final aobz a = aobz.a(bdgm.class, 1350219210);
    public bdhv b;
    public bdgs c;
    public bdgt d;
    public bdgp e;
    private String f;

    public bdgm() {
        this.f = "";
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bdgm)) {
            return false;
        }
        bdgm bdgm = (bdgm) obj;
        String str = this.f;
        if (str == null) {
            if (bdgm.f != null) {
                return false;
            }
        } else if (!str.equals(bdgm.f)) {
            return false;
        }
        bdhv bdhv = this.b;
        if (bdhv == null) {
            if (bdgm.b != null) {
                return false;
            }
        } else if (!bdhv.equals(bdgm.b)) {
            return false;
        }
        bdgs bdgs = this.c;
        if (bdgs == null) {
            if (bdgm.c != null) {
                return false;
            }
        } else if (!bdgs.equals(bdgm.c)) {
            return false;
        }
        bdgt bdgt = this.d;
        if (bdgt == null) {
            if (bdgm.d != null) {
                return false;
            }
        } else if (!bdgt.equals(bdgm.d)) {
            return false;
        }
        bdgp bdgp = this.e;
        if (bdgp == null) {
            if (bdgm.e != null) {
                return false;
            }
        } else if (!bdgp.equals(bdgm.e)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(bdgm.unknownFieldData);
        }
        aocb aocb2 = bdgm.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.f;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        bdhv bdhv = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhv != null ? bdhv.hashCode() : 0;
        bdgs bdgs = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdgs != null ? bdgs.hashCode() : 0;
        bdgt bdgt = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdgt != null ? bdgt.hashCode() : 0;
        bdgp bdgp = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (bdgp != null ? bdgp.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        String str = this.f;
        if (!(str == null || str.equals(""))) {
            aoby.a(1, this.f);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        aocf = this.d;
        if (aocf != null) {
            aoby.a(5, aocf);
        }
        aocf = this.e;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.f;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(1, this.f);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(5, aocf);
        }
        aocf = this.e;
        return aocf != null ? computeSerializedSize + aoby.b(6, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.f = aobv.d();
            } else if (a == 26) {
                if (this.b == null) {
                    this.b = new bdhv();
                }
                aobv.a(this.b);
            } else if (a == 34) {
                if (this.c == null) {
                    this.c = new bdgs();
                }
                aobv.a(this.c);
            } else if (a == 42) {
                if (this.d == null) {
                    this.d = new bdgt();
                }
                aobv.a(this.d);
            } else if (a == 50) {
                if (this.e == null) {
                    this.e = new bdgp();
                }
                aobv.a(this.e);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
