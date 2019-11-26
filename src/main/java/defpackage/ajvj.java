package defpackage;

import java.util.Arrays;

/* renamed from: ajvj */
public final class ajvj extends aoca {
    public ajzw a;
    public ajzw b;
    public ajzw c;
    public int d;
    public int e;
    private byte[] f;
    private ajtk g;

    public ajvj() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.f = aock.c;
        this.g = null;
        this.d = 0;
        this.e = 0;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvj) {
            ajvj ajvj = (ajvj) obj;
            ajzw ajzw = this.a;
            if (ajzw == null) {
                if (ajvj.a != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajvj.a)) {
                return false;
            }
            ajzw = this.b;
            if (ajzw == null) {
                if (ajvj.b != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajvj.b)) {
                return false;
            }
            ajzw = this.c;
            if (ajzw == null) {
                if (ajvj.c != null) {
                    return false;
                }
            } else if (!ajzw.equals(ajvj.c)) {
                return false;
            }
            if (Arrays.equals(this.f, ajvj.f)) {
                ajtk ajtk = this.g;
                if (ajtk == null) {
                    if (ajvj.g != null) {
                        return false;
                    }
                } else if (!ajtk.equals(ajvj.g)) {
                    return false;
                }
                if (this.d == ajvj.d && this.e == ajvj.e) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajvj.unknownFieldData);
                    }
                    aocb aocb2 = ajvj.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajzw ajzw = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw ajzw2 = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        ajzw2 = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.f);
        ajtk ajtk = this.g;
        hashCode = (((((((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (ajtk != null ? ajtk.hashCode() : 0)) * 31) + this.d) * 31) + this.e) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(5, aocf);
        }
        if (!Arrays.equals(this.f, aock.c)) {
            aoby.a(6, this.f);
        }
        aocf = this.g;
        if (aocf != null) {
            aoby.a(8, aocf);
        }
        int i = this.d;
        if (i != 0) {
            aoby.b(9, i);
        }
        i = this.e;
        if (i != 0) {
            aoby.b(10, i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(3, aocf);
        }
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(5, aocf);
        }
        if (!Arrays.equals(this.f, aock.c)) {
            computeSerializedSize += aoby.b(6, this.f);
        }
        aocf = this.g;
        if (aocf != null) {
            computeSerializedSize += aoby.b(8, aocf);
        }
        int i = this.d;
        if (i != 0) {
            computeSerializedSize += aoby.d(9, i);
        }
        i = this.e;
        return i != 0 ? computeSerializedSize + aoby.d(10, i) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 26) {
                if (this.a == null) {
                    this.a = new ajzw();
                }
                aobv.a(this.a);
            } else if (a == 34) {
                if (this.b == null) {
                    this.b = new ajzw();
                }
                aobv.a(this.b);
            } else if (a == 42) {
                if (this.c == null) {
                    this.c = new ajzw();
                }
                aobv.a(this.c);
            } else if (a == 50) {
                this.f = aobv.e();
            } else if (a == 66) {
                if (this.g == null) {
                    this.g = new ajtk();
                }
                aobv.a(this.g);
            } else if (a == 72) {
                this.d = aobv.f();
            } else if (a == 80) {
                this.e = aobv.f();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
