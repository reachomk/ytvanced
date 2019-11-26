package defpackage;

import java.util.Arrays;

/* renamed from: akby */
public final class akby extends ajwo {
    public akbw[] a;
    public arml[] b;
    public byte[] c;
    public arml[] d;
    public int e;

    public akby() {
        super(147633782);
        this.a = akbw.a();
        this.b = new arml[0];
        this.c = aock.c;
        this.d = new arml[0];
        this.e = 0;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akby) {
            akby akby = (akby) obj;
            if (aocd.a(this.a, akby.a) && aocd.a(this.b, akby.b) && Arrays.equals(this.c, akby.c) && aocd.a(this.d, akby.d) && this.e == akby.e) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akby.unknownFieldData);
                }
                aocb aocb2 = akby.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((getClass().getName().hashCode() + 527) * 31) + aocd.a(this.a)) * 31) + aocd.a(this.b)) * 31) + Arrays.hashCode(this.c)) * 31) + aocd.a(this.d)) * 31) + this.e) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        akbw[] akbwArr = this.a;
        int i2 = 0;
        if (akbwArr != null && akbwArr.length > 0) {
            i = 0;
            while (true) {
                akbw[] akbwArr2 = this.a;
                if (i >= akbwArr2.length) {
                    break;
                }
                aocf aocf = akbwArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        arml[] armlArr = this.b;
        if (armlArr != null && armlArr.length > 0) {
            i = 0;
            while (true) {
                arml[] armlArr2 = this.b;
                if (i >= armlArr2.length) {
                    break;
                }
                anze anze = armlArr2[i];
                if (anze != null) {
                    aoby.a(2, anze);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(4, this.c);
        }
        armlArr = this.d;
        if (armlArr != null && armlArr.length > 0) {
            while (true) {
                armlArr = this.d;
                if (i2 >= armlArr.length) {
                    break;
                }
                anze anze2 = armlArr[i2];
                if (anze2 != null) {
                    aoby.a(5, anze2);
                }
                i2++;
            }
        }
        i = this.e;
        if (i != 0) {
            aoby.a(6, i);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        akbw[] akbwArr = this.a;
        int i2 = 0;
        if (akbwArr != null && akbwArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                akbw[] akbwArr2 = this.a;
                if (computeSerializedSize >= akbwArr2.length) {
                    break;
                }
                aocf aocf = akbwArr2[computeSerializedSize];
                if (aocf != null) {
                    i += aoby.b(1, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        arml[] armlArr = this.b;
        if (armlArr != null && armlArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                arml[] armlArr2 = this.b;
                if (computeSerializedSize >= armlArr2.length) {
                    break;
                }
                anze anze = armlArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(2, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(4, this.c);
        }
        armlArr = this.d;
        if (armlArr != null && armlArr.length > 0) {
            while (true) {
                armlArr = this.d;
                if (i2 >= armlArr.length) {
                    break;
                }
                anze anze2 = armlArr[i2];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(5, anze2);
                }
                i2++;
            }
        }
        i = this.e;
        return i != 0 ? computeSerializedSize + aoby.c(6, i) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            arml[] armlArr;
            arml[] armlArr2;
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
                armlArr = this.b;
                length = armlArr != null ? armlArr.length : 0;
                armlArr2 = new arml[(a + length)];
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
            } else if (a == 42) {
                a = aock.a(aobv, 42);
                armlArr = this.d;
                length = armlArr != null ? armlArr.length : 0;
                armlArr2 = new arml[(a + length)];
                if (length != 0) {
                    System.arraycopy(armlArr, 0, armlArr2, 0, length);
                }
                while (length < armlArr2.length - 1) {
                    armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                    aobv.a();
                    length++;
                }
                armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                this.d = armlArr2;
            } else if (a == 48) {
                this.e = aobv.f();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
