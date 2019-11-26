package defpackage;

/* renamed from: ajuf */
public final class ajuf extends aoca {
    public ajtp a;
    public apxu[] b;
    public apxu[] c;

    public ajuf() {
        this.a = null;
        this.b = new apxu[0];
        this.c = new apxu[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajuf) {
            ajuf ajuf = (ajuf) obj;
            ajtp ajtp = this.a;
            if (ajtp == null) {
                if (ajuf.a != null) {
                    return false;
                }
            } else if (!ajtp.equals(ajuf.a)) {
                return false;
            }
            if (aocd.a(this.b, ajuf.b) && aocd.a(this.c, ajuf.c)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajuf.unknownFieldData);
                }
                aocb aocb2 = ajuf.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajtp ajtp = this.a;
        int i = 0;
        hashCode = (((((((hashCode + 527) * 31) + (ajtp != null ? ajtp.hashCode() : 0)) * 31) + aocd.a(this.b)) * 31) + aocd.a(this.c)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        apxu[] apxuArr = this.b;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = 0;
            while (true) {
                apxu[] apxuArr2 = this.b;
                if (i2 >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i2];
                if (anze != null) {
                    aoby.a(4, anze);
                }
                i2++;
            }
        }
        apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.c;
                if (i >= apxuArr.length) {
                    break;
                }
                anze anze2 = apxuArr[i];
                if (anze2 != null) {
                    aoby.a(5, anze2);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        apxu[] apxuArr = this.b;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.b;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[computeSerializedSize];
                if (anze != null) {
                    i2 += anwm.c(4, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.c;
                if (i >= apxuArr.length) {
                    break;
                }
                anze anze2 = apxuArr[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(5, anze2);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            apxu[] apxuArr;
            int length;
            apxu[] apxuArr2;
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new ajtp();
                }
                aobv.a(this.a);
            } else if (a == 34) {
                a = aock.a(aobv, 34);
                apxuArr = this.b;
                length = apxuArr != null ? apxuArr.length : 0;
                apxuArr2 = new apxu[(a + length)];
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
            } else if (a == 42) {
                a = aock.a(aobv, 42);
                apxuArr = this.c;
                length = apxuArr != null ? apxuArr.length : 0;
                apxuArr2 = new apxu[(a + length)];
                if (length != 0) {
                    System.arraycopy(apxuArr, 0, apxuArr2, 0, length);
                }
                while (length < apxuArr2.length - 1) {
                    apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                    aobv.a();
                    length++;
                }
                apxuArr2[length] = (apxu) aobv.a(apxu.d.getParserForType());
                this.c = apxuArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
