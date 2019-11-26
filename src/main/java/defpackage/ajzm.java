package defpackage;

/* renamed from: ajzm */
public final class ajzm extends ajwo {
    public awvh[] a;
    private ajzw b;
    private ajzw c;

    public ajzm() {
        super(138661147);
        this.a = new awvh[0];
        this.b = null;
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzm) {
            ajzm ajzm = (ajzm) obj;
            if (aocd.a(this.a, ajzm.a)) {
                ajzw ajzw = this.b;
                if (ajzw == null) {
                    if (ajzm.b != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajzm.b)) {
                    return false;
                }
                ajzw = this.c;
                if (ajzw == null) {
                    if (ajzm.c != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajzm.c)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajzm.unknownFieldData);
                }
                aocb aocb2 = ajzm.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        ajzw ajzw = this.b;
        hashCode = (((hashCode + 527) * 31) + a) * 31;
        a = 0;
        int hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw ajzw2 = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw2 != null ? ajzw2.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        awvh[] awvhArr = this.a;
        if (awvhArr != null && awvhArr.length > 0) {
            int i = 0;
            while (true) {
                awvh[] awvhArr2 = this.a;
                if (i >= awvhArr2.length) {
                    break;
                }
                anze anze = awvhArr2[i];
                if (anze != null) {
                    aoby.a(1, anze);
                }
                i++;
            }
        }
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(3, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        awvh[] awvhArr = this.a;
        if (awvhArr != null && awvhArr.length > 0) {
            int i = 0;
            while (true) {
                awvh[] awvhArr2 = this.a;
                if (i >= awvhArr2.length) {
                    break;
                }
                anze anze = awvhArr2[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(1, anze);
                }
                i++;
            }
        }
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        aocf = this.c;
        return aocf != null ? computeSerializedSize + aoby.b(3, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                a = aock.a(aobv, 10);
                awvh[] awvhArr = this.a;
                int length = awvhArr != null ? awvhArr.length : 0;
                awvh[] awvhArr2 = new awvh[(a + length)];
                if (length != 0) {
                    System.arraycopy(awvhArr, 0, awvhArr2, 0, length);
                }
                while (length < awvhArr2.length - 1) {
                    awvhArr2[length] = (awvh) aobv.a(awvh.c.getParserForType());
                    aobv.a();
                    length++;
                }
                awvhArr2[length] = (awvh) aobv.a(awvh.c.getParserForType());
                this.a = awvhArr2;
            } else if (a == 18) {
                if (this.b == null) {
                    this.b = new ajzw();
                }
                aobv.a(this.b);
            } else if (a == 26) {
                if (this.c == null) {
                    this.c = new ajzw();
                }
                aobv.a(this.c);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
