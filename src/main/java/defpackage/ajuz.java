package defpackage;

import java.util.Arrays;

/* renamed from: ajuz */
public final class ajuz extends aoca {
    public akab a;
    public byte[] b;
    private apxu[] c;
    private String[] d;

    public ajuz() {
        this.a = null;
        this.b = aock.c;
        this.c = new apxu[0];
        this.d = aock.b;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajuz) {
            ajuz ajuz = (ajuz) obj;
            akab akab = this.a;
            if (akab == null) {
                if (ajuz.a != null) {
                    return false;
                }
            } else if (!akab.equals(ajuz.a)) {
                return false;
            }
            if (Arrays.equals(this.b, ajuz.b) && aocd.a(this.c, ajuz.c) && aocd.a(this.d, ajuz.d)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajuz.unknownFieldData);
                }
                aocb aocb2 = ajuz.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akab akab = this.a;
        int i = 0;
        hashCode = (((((((((hashCode + 527) * 31) + (akab != null ? akab.hashCode() : 0)) * 31) + Arrays.hashCode(this.b)) * 31) + aocd.a(this.c)) * 31) + aocd.a(this.d)) * 31;
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
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(5, this.b);
        }
        apxu[] apxuArr = this.c;
        int i = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            int i2 = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (i2 >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i2];
                if (anze != null) {
                    aoby.a(6, anze);
                }
                i2++;
            }
        }
        String[] strArr = this.d;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                strArr = this.d;
                if (i >= strArr.length) {
                    break;
                }
                String str = strArr[i];
                if (str != null) {
                    aoby.a(7, str);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        if (!Arrays.equals(this.b, aock.c)) {
            computeSerializedSize += aoby.b(5, this.b);
        }
        apxu[] apxuArr = this.c;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(6, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        String[] strArr = this.d;
        if (strArr == null || strArr.length <= 0) {
            return computeSerializedSize;
        }
        i = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.d;
            if (i2 >= strArr2.length) {
                return (computeSerializedSize + i) + i3;
            }
            String str = strArr2[i2];
            if (str != null) {
                i3++;
                i += aoby.b(str);
            }
            i2++;
        }
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new akab();
                }
                aobv.a(this.a);
            } else if (a == 42) {
                this.b = aobv.e();
            } else if (a == 50) {
                a = aock.a(aobv, 50);
                apxu[] apxuArr = this.c;
                length = apxuArr != null ? apxuArr.length : 0;
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
                this.c = apxuArr2;
            } else if (a == 58) {
                a = aock.a(aobv, 58);
                String[] strArr = this.d;
                length = strArr != null ? strArr.length : 0;
                String[] strArr2 = new String[(a + length)];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < strArr2.length - 1) {
                    strArr2[length] = aobv.d();
                    aobv.a();
                    length++;
                }
                strArr2[length] = aobv.d();
                this.d = strArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
