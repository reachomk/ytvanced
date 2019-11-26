package defpackage;

import java.util.Arrays;

/* renamed from: ajuq */
public final class ajuq extends ajwo {
    public arml a;
    public ajup[] b;
    private byte[] c;

    public ajuq() {
        super(50302113);
        if (ajup.a == null) {
            synchronized (aocd.b) {
                if (ajup.a == null) {
                    ajup.a = new ajup[0];
                }
            }
        }
        this.b = ajup.a;
        this.c = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajuq) {
            ajuq ajuq = (ajuq) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajuq.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajuq.a)) {
                return false;
            }
            if (aocd.a(this.b, ajuq.b) && Arrays.equals(this.c, ajuq.c)) {
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajuq.unknownFieldData);
                }
                aocb aocb2 = ajuq.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.a;
        int i = 0;
        hashCode = (((((((hashCode + 527) * 31) + (arml != null ? arml.hashCode() : 0)) * 31) + aocd.a(this.b)) * 31) + Arrays.hashCode(this.c)) * 31;
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
        ajup[] ajupArr = this.b;
        if (ajupArr != null && ajupArr.length > 0) {
            int i = 0;
            while (true) {
                ajup[] ajupArr2 = this.b;
                if (i >= ajupArr2.length) {
                    break;
                }
                aocf aocf = ajupArr2[i];
                if (aocf != null) {
                    aoby.a(2, aocf);
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
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        ajup[] ajupArr = this.b;
        if (ajupArr != null && ajupArr.length > 0) {
            int i = 0;
            while (true) {
                ajup[] ajupArr2 = this.b;
                if (i >= ajupArr2.length) {
                    break;
                }
                aocf aocf = ajupArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(2, aocf);
                }
                i++;
            }
        }
        return !Arrays.equals(this.c, aock.c) ? computeSerializedSize + aoby.b(4, this.c) : computeSerializedSize;
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
                aocf ajup;
                a = aock.a(aobv, 18);
                ajup[] ajupArr = this.b;
                int length = ajupArr != null ? ajupArr.length : 0;
                ajup[] ajupArr2 = new ajup[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajupArr, 0, ajupArr2, 0, length);
                }
                while (length < ajupArr2.length - 1) {
                    ajup = new ajup();
                    ajupArr2[length] = ajup;
                    aobv.a(ajup);
                    aobv.a();
                    length++;
                }
                ajup = new ajup();
                ajupArr2[length] = ajup;
                aobv.a(ajup);
                this.b = ajupArr2;
            } else if (a == 34) {
                this.c = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
