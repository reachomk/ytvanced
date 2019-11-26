package defpackage;

/* renamed from: bdhu */
public final class bdhu extends aoca {
    public static final aobz a = aobz.a(bdhu.class, 1270371042);
    public bdgf b;
    public int c;
    public bdgf d;
    public bdgf e;
    private boolean f;

    public bdhu() {
        this.b = null;
        this.c = 0;
        this.d = null;
        this.e = null;
        this.f = false;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdhu) {
            bdhu bdhu = (bdhu) obj;
            bdgf bdgf = this.b;
            if (bdgf == null) {
                if (bdhu.b != null) {
                    return false;
                }
            } else if (!bdgf.equals(bdhu.b)) {
                return false;
            }
            if (this.c == bdhu.c) {
                bdgf = this.d;
                if (bdgf == null) {
                    if (bdhu.d != null) {
                        return false;
                    }
                } else if (!bdgf.equals(bdhu.d)) {
                    return false;
                }
                bdgf = this.e;
                if (bdgf == null) {
                    if (bdhu.e != null) {
                        return false;
                    }
                } else if (!bdgf.equals(bdhu.e)) {
                    return false;
                }
                if (this.f == bdhu.f) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(bdhu.unknownFieldData);
                    }
                    aocb aocb2 = bdhu.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        bdgf bdgf = this.b;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = bdgf != null ? bdgf.hashCode() : 0;
        int i2 = this.c;
        bdgf bdgf2 = this.d;
        hashCode = (((hashCode + hashCode2) * 31) + i2) * 31;
        hashCode2 = bdgf2 != null ? bdgf2.hashCode() : 0;
        bdgf bdgf3 = this.e;
        hashCode = (((((hashCode + hashCode2) * 31) + (bdgf3 != null ? bdgf3.hashCode() : 0)) * 31) + (!this.f ? 1237 : 1231)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(1, aocf);
        }
        int i = this.c;
        if (i != 0) {
            aoby.b(2, i);
        }
        aocf = this.d;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        aocf = this.e;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        if (this.f) {
            aoby.a(5, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(1, aocf);
        }
        int i = this.c;
        if (i != 0) {
            computeSerializedSize += aoby.d(2, i);
        }
        aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        aocf = this.e;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        return this.f ? computeSerializedSize + aoby.d(5) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.b == null) {
                    this.b = new bdgf();
                }
                aobv.a(this.b);
            } else if (a == 16) {
                this.c = aobv.f();
            } else if (a == 26) {
                if (this.d == null) {
                    this.d = new bdgf();
                }
                aobv.a(this.d);
            } else if (a == 34) {
                if (this.e == null) {
                    this.e = new bdgf();
                }
                aobv.a(this.e);
            } else if (a == 40) {
                this.f = aobv.c();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
