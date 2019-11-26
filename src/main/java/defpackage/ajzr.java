package defpackage;

/* renamed from: ajzr */
public final class ajzr extends aoca {
    public String a;
    public ajzu b;
    public int c;

    public ajzr() {
        this.a = "";
        this.c = 1;
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzr) {
            ajzr ajzr = (ajzr) obj;
            String str = this.a;
            if (str == null) {
                if (ajzr.a != null) {
                    return false;
                }
            } else if (!str.equals(ajzr.a)) {
                return false;
            }
            if (this.c == ajzr.c) {
                ajzu ajzu = this.b;
                if (ajzu == null) {
                    if (ajzr.b != null) {
                        return false;
                    }
                } else if (!ajzu.equals(ajzr.b)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajzr.unknownFieldData);
                }
                aocb aocb2 = ajzr.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        int i2 = this.c;
        if (i2 == 0) {
            i2 = 0;
        }
        ajzu ajzu = this.b;
        hashCode = (((hashCode + i2) * 31) + (ajzu != null ? ajzu.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        String str = this.a;
        if (!(str == null || str.equals(""))) {
            aoby.a(3, this.a);
        }
        int i = this.c;
        if (!(i == 1 || i == 0)) {
            aoby.a(4, i - 1);
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(5, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.a;
        if (!(str == null || str.equals(""))) {
            computeSerializedSize += aoby.b(3, this.a);
        }
        int i = this.c;
        if (!(i == 1 || i == 0)) {
            computeSerializedSize += aoby.c(4, i - 1);
        }
        aocf aocf = this.b;
        return aocf != null ? computeSerializedSize + aoby.b(5, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 26) {
                this.a = aobv.d();
            } else if (a == 32) {
                int i = aobv.b;
                int f = aobv.f();
                int i2 = 3;
                if (f == 0 || f == 1 || f == 2 || f == 3) {
                    if (f == 0) {
                        i2 = 1;
                    } else if (f == 1) {
                        i2 = 2;
                    } else if (f != 2) {
                        i2 = f != 3 ? 0 : 4;
                    }
                    this.c = i2;
                } else {
                    aobv.e(i);
                    storeUnknownField(aobv, a);
                }
            } else if (a == 42) {
                if (this.b == null) {
                    this.b = new ajzu();
                }
                aobv.a(this.b);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
