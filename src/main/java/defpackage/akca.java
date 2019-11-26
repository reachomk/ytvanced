package defpackage;

import java.util.Arrays;

/* renamed from: akca */
public final class akca extends ajwo {
    public akbw[] a;
    private arml[] b;
    private byte[] c;

    public akca() {
        super(117548244);
        this.a = akbw.a();
        this.b = new arml[0];
        this.c = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akca) {
            akca akca = (akca) obj;
            if (aocd.a(this.a, akca.a) && aocd.a(this.b, akca.b) && Arrays.equals(this.c, akca.c)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akca.unknownFieldData);
                }
                aocb aocb2 = akca.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((getClass().getName().hashCode() + 527) * 31) + aocd.a(this.a)) * 31) + aocd.a(this.b)) * 31) + Arrays.hashCode(this.c)) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        akbw[] akbwArr = this.a;
        int i = 0;
        if (akbwArr != null && akbwArr.length > 0) {
            int i2 = 0;
            while (true) {
                akbw[] akbwArr2 = this.a;
                if (i2 >= akbwArr2.length) {
                    break;
                }
                aocf aocf = akbwArr2[i2];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i2++;
            }
        }
        arml[] armlArr = this.b;
        if (armlArr != null && armlArr.length > 0) {
            while (true) {
                armlArr = this.b;
                if (i >= armlArr.length) {
                    break;
                }
                anze anze = armlArr[i];
                if (anze != null) {
                    aoby.a(2, anze);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(4, this.c);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        akbw[] akbwArr = this.a;
        int i = 0;
        if (akbwArr != null && akbwArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                akbw[] akbwArr2 = this.a;
                if (computeSerializedSize >= akbwArr2.length) {
                    break;
                }
                aocf aocf = akbwArr2[computeSerializedSize];
                if (aocf != null) {
                    i2 += aoby.b(1, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        arml[] armlArr = this.b;
        if (armlArr != null && armlArr.length > 0) {
            while (true) {
                armlArr = this.b;
                if (i >= armlArr.length) {
                    break;
                }
                anze anze = armlArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(2, anze);
                }
                i++;
            }
        }
        return !Arrays.equals(this.c, aock.c) ? computeSerializedSize + aoby.b(4, this.c) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            if (a == 0) {
                break;
            } else if (a == 10) {
                aocf akbw;
                a = aock.a(aobv, 10);
                akbw[] akbwArr = this.a;
                length = akbwArr != null ? akbwArr.length : 0;
                akbw[] akbwArr2 = new akbw[(a + length)];
                if (length != 0) {
                    System.arraycopy(akbwArr, 0, akbwArr2, 0, length);
                }
                while (length < akbwArr2.length - 1) {
                    akbw = new akbw();
                    akbwArr2[length] = akbw;
                    aobv.a(akbw);
                    aobv.a();
                    length++;
                }
                akbw = new akbw();
                akbwArr2[length] = akbw;
                aobv.a(akbw);
                this.a = akbwArr2;
            } else if (a == 18) {
                a = aock.a(aobv, 18);
                arml[] armlArr = this.b;
                length = armlArr != null ? armlArr.length : 0;
                arml[] armlArr2 = new arml[(a + length)];
                if (length != 0) {
                    System.arraycopy(armlArr, 0, armlArr2, 0, length);
                }
                while (length < armlArr2.length - 1) {
                    armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                    aobv.a();
                    length++;
                }
                armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                this.b = armlArr2;
            } else if (a == 34) {
                this.c = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
