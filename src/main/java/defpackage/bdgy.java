package defpackage;

/* renamed from: bdgy */
public final class bdgy extends aoca {
    public bdhb a;
    public bdhb b;
    public bdhb c;
    public bdhb d;
    public bdhb e;
    public bdhb f;
    public bdhb g;
    public bdhb h;
    public bdhb i;

    public bdgy() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bdgy)) {
            return false;
        }
        bdgy bdgy = (bdgy) obj;
        bdhb bdhb = this.a;
        if (bdhb == null) {
            if (bdgy.a != null) {
                return false;
            }
        } else if (!bdhb.equals(bdgy.a)) {
            return false;
        }
        bdhb = this.b;
        if (bdhb == null) {
            if (bdgy.b != null) {
                return false;
            }
        } else if (!bdhb.equals(bdgy.b)) {
            return false;
        }
        bdhb = this.c;
        if (bdhb == null) {
            if (bdgy.c != null) {
                return false;
            }
        } else if (!bdhb.equals(bdgy.c)) {
            return false;
        }
        bdhb = this.d;
        if (bdhb == null) {
            if (bdgy.d != null) {
                return false;
            }
        } else if (!bdhb.equals(bdgy.d)) {
            return false;
        }
        bdhb = this.e;
        if (bdhb == null) {
            if (bdgy.e != null) {
                return false;
            }
        } else if (!bdhb.equals(bdgy.e)) {
            return false;
        }
        bdhb = this.f;
        if (bdhb == null) {
            if (bdgy.f != null) {
                return false;
            }
        } else if (!bdhb.equals(bdgy.f)) {
            return false;
        }
        bdhb = this.g;
        if (bdhb == null) {
            if (bdgy.g != null) {
                return false;
            }
        } else if (!bdhb.equals(bdgy.g)) {
            return false;
        }
        bdhb = this.h;
        if (bdhb == null) {
            if (bdgy.h != null) {
                return false;
            }
        } else if (!bdhb.equals(bdgy.h)) {
            return false;
        }
        bdhb = this.i;
        if (bdhb == null) {
            if (bdgy.i != null) {
                return false;
            }
        } else if (!bdhb.equals(bdgy.i)) {
            return false;
        }
        aocb aocb = this.unknownFieldData;
        if (aocb != null && !aocb.b()) {
            return this.unknownFieldData.equals(bdgy.unknownFieldData);
        }
        aocb aocb2 = bdgy.unknownFieldData;
        return aocb2 == null || aocb2.b();
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        bdhb bdhb = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = bdhb != null ? bdhb.hashCode() : 0;
        bdhb bdhb2 = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb2 != null ? bdhb2.hashCode() : 0;
        bdhb2 = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb2 != null ? bdhb2.hashCode() : 0;
        bdhb2 = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb2 != null ? bdhb2.hashCode() : 0;
        bdhb2 = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb2 != null ? bdhb2.hashCode() : 0;
        bdhb2 = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb2 != null ? bdhb2.hashCode() : 0;
        bdhb2 = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb2 != null ? bdhb2.hashCode() : 0;
        bdhb2 = this.h;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = bdhb2 != null ? bdhb2.hashCode() : 0;
        bdhb2 = this.i;
        hashCode = (((hashCode + hashCode2) * 31) + (bdhb2 != null ? bdhb2.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(1, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        aocf = this.d;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        aocf = this.e;
        if (aocf != null) {
            aoby.a(5, aocf);
        }
        aocf = this.f;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        aocf = this.g;
        if (aocf != null) {
            aoby.a(7, aocf);
        }
        aocf = this.h;
        if (aocf != null) {
            aoby.a(8, aocf);
        }
        aocf = this.i;
        if (aocf != null) {
            aoby.a(9, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(1, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        aocf = this.e;
        if (aocf != null) {
            computeSerializedSize += aoby.b(5, aocf);
        }
        aocf = this.f;
        if (aocf != null) {
            computeSerializedSize += aoby.b(6, aocf);
        }
        aocf = this.g;
        if (aocf != null) {
            computeSerializedSize += aoby.b(7, aocf);
        }
        aocf = this.h;
        if (aocf != null) {
            computeSerializedSize += aoby.b(8, aocf);
        }
        aocf = this.i;
        return aocf != null ? computeSerializedSize + aoby.b(9, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                if (this.a == null) {
                    this.a = new bdhb();
                }
                aobv.a(this.a);
            } else if (a == 18) {
                if (this.b == null) {
                    this.b = new bdhb();
                }
                aobv.a(this.b);
            } else if (a == 26) {
                if (this.c == null) {
                    this.c = new bdhb();
                }
                aobv.a(this.c);
            } else if (a == 34) {
                if (this.d == null) {
                    this.d = new bdhb();
                }
                aobv.a(this.d);
            } else if (a == 42) {
                if (this.e == null) {
                    this.e = new bdhb();
                }
                aobv.a(this.e);
            } else if (a == 50) {
                if (this.f == null) {
                    this.f = new bdhb();
                }
                aobv.a(this.f);
            } else if (a == 58) {
                if (this.g == null) {
                    this.g = new bdhb();
                }
                aobv.a(this.g);
            } else if (a == 66) {
                if (this.h == null) {
                    this.h = new bdhb();
                }
                aobv.a(this.h);
            } else if (a == 74) {
                if (this.i == null) {
                    this.i = new bdhb();
                }
                aobv.a(this.i);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
