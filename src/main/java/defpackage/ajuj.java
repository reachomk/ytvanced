package defpackage;

import java.util.Arrays;

/* renamed from: ajuj */
public final class ajuj extends ajwo {
    public ajuk[] a;
    public long b;
    public aule[] c;
    public boolean d;
    public byte[] e;

    public ajuj() {
        super(106301526);
        if (ajuk.a == null) {
            synchronized (aocd.b) {
                if (ajuk.a == null) {
                    ajuk.a = new ajuk[0];
                }
            }
        }
        this.a = ajuk.a;
        this.b = 0;
        this.c = new aule[0];
        this.d = false;
        this.e = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajuj) {
            ajuj ajuj = (ajuj) obj;
            if (aocd.a(this.a, ajuj.a) && this.b == ajuj.b && aocd.a(this.c, ajuj.c) && this.d == ajuj.d && Arrays.equals(this.e, ajuj.e)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajuj.unknownFieldData);
                }
                aocb aocb2 = ajuj.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        long j = this.b;
        hashCode = (((((((((((hashCode + 527) * 31) + a) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + aocd.a(this.c)) * 31) + (!this.d ? 1237 : 1231)) * 31) + Arrays.hashCode(this.e)) * 31;
        aocb aocb = this.unknownFieldData;
        int i = 0;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        ajuk[] ajukArr = this.a;
        int i = 0;
        if (ajukArr != null && ajukArr.length > 0) {
            int i2 = 0;
            while (true) {
                ajuk[] ajukArr2 = this.a;
                if (i2 >= ajukArr2.length) {
                    break;
                }
                aocf aocf = ajukArr2[i2];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i2++;
            }
        }
        long j = this.b;
        if (j != 0) {
            aoby.b(2, j);
        }
        aule[] auleArr = this.c;
        if (auleArr != null && auleArr.length > 0) {
            while (true) {
                auleArr = this.c;
                if (i >= auleArr.length) {
                    break;
                }
                anze anze = auleArr[i];
                if (anze != null) {
                    aoby.a(3, anze);
                }
                i++;
            }
        }
        if (this.d) {
            aoby.a(4, true);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            aoby.a(6, this.e);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        ajuk[] ajukArr = this.a;
        int i = 0;
        if (ajukArr != null && ajukArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajuk[] ajukArr2 = this.a;
                if (computeSerializedSize >= ajukArr2.length) {
                    break;
                }
                aocf aocf = ajukArr2[computeSerializedSize];
                if (aocf != null) {
                    i2 += aoby.b(1, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        long j = this.b;
        if (j != 0) {
            computeSerializedSize += aoby.d(2, j);
        }
        aule[] auleArr = this.c;
        if (auleArr != null && auleArr.length > 0) {
            while (true) {
                auleArr = this.c;
                if (i >= auleArr.length) {
                    break;
                }
                anze anze = auleArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(3, anze);
                }
                i++;
            }
        }
        if (this.d) {
            computeSerializedSize += aoby.d(4);
        }
        return !Arrays.equals(this.e, aock.c) ? computeSerializedSize + aoby.b(6, this.e) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            if (a == 0) {
                break;
            } else if (a == 10) {
                aocf ajuk;
                a = aock.a(aobv, 10);
                ajuk[] ajukArr = this.a;
                length = ajukArr != null ? ajukArr.length : 0;
                ajuk[] ajukArr2 = new ajuk[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajukArr, 0, ajukArr2, 0, length);
                }
                while (length < ajukArr2.length - 1) {
                    ajuk = new ajuk();
                    ajukArr2[length] = ajuk;
                    aobv.a(ajuk);
                    aobv.a();
                    length++;
                }
                ajuk = new ajuk();
                ajukArr2[length] = ajuk;
                aobv.a(ajuk);
                this.a = ajukArr2;
            } else if (a == 16) {
                this.b = aobv.g();
            } else if (a == 26) {
                a = aock.a(aobv, 26);
                aule[] auleArr = this.c;
                length = auleArr != null ? auleArr.length : 0;
                aule[] auleArr2 = new aule[(a + length)];
                if (length != 0) {
                    System.arraycopy(auleArr, 0, auleArr2, 0, length);
                }
                while (length < auleArr2.length - 1) {
                    auleArr2[length] = (aule) aobv.a(aule.d.getParserForType());
                    aobv.a();
                    length++;
                }
                auleArr2[length] = (aule) aobv.a(aule.d.getParserForType());
                this.c = auleArr2;
            } else if (a == 32) {
                this.d = aobv.c();
            } else if (a == 50) {
                this.e = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
