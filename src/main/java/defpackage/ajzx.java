package defpackage;

/* renamed from: ajzx */
public final class ajzx extends aoca {
    public akaa a;
    private apxu[] b;

    public ajzx() {
        this.b = new apxu[0];
        this.a = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzx) {
            ajzx ajzx = (ajzx) obj;
            if (aocd.a(this.b, ajzx.b)) {
                akaa akaa = this.a;
                if (akaa == null) {
                    if (ajzx.a != null) {
                        return false;
                    }
                } else if (!akaa.equals(ajzx.a)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajzx.unknownFieldData);
                }
                aocb aocb2 = ajzx.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.b);
        akaa akaa = this.a;
        hashCode = (((hashCode + 527) * 31) + a) * 31;
        a = 0;
        hashCode = (hashCode + (akaa != null ? akaa.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        apxu[] apxuArr = this.b;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.b;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    aoby.a(3, anze);
                }
                i++;
            }
        }
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(111078464, aocf);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        apxu[] apxuArr = this.b;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.b;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(3, anze);
                }
                i++;
            }
        }
        aocf aocf = this.a;
        return aocf != null ? computeSerializedSize + aoby.b(111078464, aocf) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 26) {
                a = aock.a(aobv, 26);
                apxu[] apxuArr = this.b;
                int length = apxuArr != null ? apxuArr.length : 0;
                apxu[] apxuArr2 = new apxu[(a + length)];
                if (length != 0) {
                    System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                }
                while (length < apxuArr2.length - 1) {
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    aobv.a();
                    length++;
                }
                apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                this.b = apxuArr2;
            } else if (a == 888627714) {
                if (this.a == null) {
                    this.a = new akaa();
                }
                aobv.a(this.a);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
