package defpackage;

import java.util.Arrays;

/* renamed from: ajxi */
public final class ajxi extends ajwo {
    public byte[] a = aock.c;
    public ajxf[] b;
    private arml c;

    public ajxi() {
        super(123267149);
        if (ajxf.a == null) {
            synchronized (aocd.b) {
                if (ajxf.a == null) {
                    ajxf.a = new ajxf[0];
                }
            }
        }
        this.b = ajxf.a;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajxi) {
            ajxi ajxi = (ajxi) obj;
            arml arml = this.c;
            if (arml == null) {
                if (ajxi.c != null) {
                    return false;
                }
            } else if (!arml.equals(ajxi.c)) {
                return false;
            }
            if (Arrays.equals(this.a, ajxi.a) && aocd.a(this.b, ajxi.b)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajxi.unknownFieldData);
                }
                aocb aocb2 = ajxi.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.c;
        int i = 0;
        hashCode = (((((((hashCode + 527) * 31) + (arml != null ? arml.hashCode() : 0)) * 31) + Arrays.hashCode(this.a)) * 31) + aocd.a(this.b)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.c;
        if (anze != null) {
            aoby.a(1, anze);
        }
        if (!Arrays.equals(this.a, aock.c)) {
            aoby.a(3, this.a);
        }
        ajxf[] ajxfArr = this.b;
        if (ajxfArr != null && ajxfArr.length > 0) {
            int i = 0;
            while (true) {
                ajxf[] ajxfArr2 = this.b;
                if (i >= ajxfArr2.length) {
                    break;
                }
                aocf aocf = ajxfArr2[i];
                if (aocf != null) {
                    aoby.a(4, aocf);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        if (!Arrays.equals(this.a, aock.c)) {
            computeSerializedSize += aoby.b(3, this.a);
        }
        ajxf[] ajxfArr = this.b;
        if (ajxfArr != null && ajxfArr.length > 0) {
            int i = 0;
            while (true) {
                ajxf[] ajxfArr2 = this.b;
                if (i >= ajxfArr2.length) {
                    break;
                }
                aocf aocf = ajxfArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(4, aocf);
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
            } else if (a == 10) {
                arml arml = (arml) aobv.a(arml.f.getParserForType());
                arml arml2 = this.c;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.c = arml;
            } else if (a == 26) {
                this.a = aobv.e();
            } else if (a == 34) {
                aocf ajxf;
                a = aock.a(aobv, 34);
                ajxf[] ajxfArr = this.b;
                int length = ajxfArr != null ? ajxfArr.length : 0;
                ajxf[] ajxfArr2 = new ajxf[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajxfArr, 0, ajxfArr2, 0, length);
                }
                while (length < ajxfArr2.length - 1) {
                    ajxf = new ajxf();
                    ajxfArr2[length] = ajxf;
                    aobv.a(ajxf);
                    aobv.a();
                    length++;
                }
                ajxf = new ajxf();
                ajxfArr2[length] = ajxf;
                aobv.a(ajxf);
                this.b = ajxfArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
