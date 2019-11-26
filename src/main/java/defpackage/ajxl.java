package defpackage;

import java.util.Arrays;

/* renamed from: ajxl */
public final class ajxl extends ajwo {
    public arml a;
    public akaf[] b;
    public boolean c;
    public byte[] d;

    public ajxl() {
        super(93763033);
        this.b = akaf.a();
        this.c = false;
        this.d = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajxl) {
            ajxl ajxl = (ajxl) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajxl.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajxl.a)) {
                return false;
            }
            if (aocd.a(this.b, ajxl.b) && this.c == ajxl.c && Arrays.equals(this.d, ajxl.d)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajxl.unknownFieldData);
                }
                aocb aocb2 = ajxl.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.a;
        int i = 0;
        hashCode = (((((((((hashCode + 527) * 31) + (arml != null ? arml.hashCode() : 0)) * 31) + aocd.a(this.b)) * 31) + (!this.c ? 1237 : 1231)) * 31) + Arrays.hashCode(this.d)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        akaf[] akafArr = this.b;
        if (akafArr != null && akafArr.length > 0) {
            int i = 0;
            while (true) {
                akaf[] akafArr2 = this.b;
                if (i >= akafArr2.length) {
                    break;
                }
                aocf aocf = akafArr2[i];
                if (aocf != null) {
                    aoby.a(2, aocf);
                }
                i++;
            }
        }
        if (this.c) {
            aoby.a(4, true);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(6, this.d);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        akaf[] akafArr = this.b;
        if (akafArr != null && akafArr.length > 0) {
            int i = 0;
            while (true) {
                akaf[] akafArr2 = this.b;
                if (i >= akafArr2.length) {
                    break;
                }
                aocf aocf = akafArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(2, aocf);
                }
                i++;
            }
        }
        if (this.c) {
            computeSerializedSize += aoby.d(4);
        }
        return !Arrays.equals(this.d, aock.c) ? computeSerializedSize + aoby.b(6, this.d) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                arml arml = (arml) aobv.a(arml.f.getParserForType());
                arml arml2 = this.a;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.a = arml;
            } else if (a == 18) {
                aocf akaf;
                a = aock.a(aobv, 18);
                akaf[] akafArr = this.b;
                int length = akafArr != null ? akafArr.length : 0;
                akaf[] akafArr2 = new akaf[(a + length)];
                if (length != 0) {
                    System.arraycopy(akafArr, 0, akafArr2, 0, length);
                }
                while (length < akafArr2.length - 1) {
                    akaf = new akaf();
                    akafArr2[length] = akaf;
                    aobv.a(akaf);
                    aobv.a();
                    length++;
                }
                akaf = new akaf();
                akafArr2[length] = akaf;
                aobv.a(akaf);
                this.b = akafArr2;
            } else if (a == 32) {
                this.c = aobv.c();
            } else if (a == 50) {
                this.d = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
