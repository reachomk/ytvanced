package defpackage;

import java.util.Arrays;

/* renamed from: ajva */
public final class ajva extends aoca {
    public ajtq a;
    private byte[] b;
    private apxu[] c;

    public ajva() {
        this.a = null;
        this.b = aock.c;
        this.c = new apxu[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajva) {
            ajva ajva = (ajva) obj;
            ajtq ajtq = this.a;
            if (ajtq == null) {
                if (ajva.a != null) {
                    return false;
                }
            } else if (!ajtq.equals(ajva.a)) {
                return false;
            }
            if (Arrays.equals(this.b, ajva.b) && aocd.a(this.c, ajva.c)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajva.unknownFieldData);
                }
                aocb aocb2 = ajva.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajtq ajtq = this.a;
        int i = 0;
        hashCode = (((((((hashCode + 527) * 31) + (ajtq != null ? ajtq.hashCode() : 0)) * 31) + Arrays.hashCode(this.b)) * 31) + aocd.a(this.c)) * 31;
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
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    aoby.a(6, anze);
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
        if (!Arrays.equals(this.b, aock.c)) {
            computeSerializedSize += aoby.b(5, this.b);
        }
        apxu[] apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(6, anze);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new ajtq();
                }
                aobv.a(this.a);
            } else if (a == 42) {
                this.b = aobv.e();
            } else if (a == 50) {
                a = aock.a(aobv, 50);
                apxu[] apxuArr = this.c;
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
                this.c = apxuArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
