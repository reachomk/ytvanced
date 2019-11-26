package defpackage;

import java.util.Arrays;

/* renamed from: ajwr */
public final class ajwr extends ajwo {
    public ajwu[] a;
    public arml b;
    private arml c;
    private byte[] d;

    public ajwr() {
        super(51779670);
        if (ajwu.a == null) {
            synchronized (aocd.b) {
                if (ajwu.a == null) {
                    ajwu.a = new ajwu[0];
                }
            }
        }
        this.a = ajwu.a;
        this.d = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwr) {
            ajwr ajwr = (ajwr) obj;
            if (aocd.a(this.a, ajwr.a)) {
                arml arml = this.c;
                if (arml == null) {
                    if (ajwr.c != null) {
                        return false;
                    }
                } else if (!arml.equals(ajwr.c)) {
                    return false;
                }
                arml = this.b;
                if (arml == null) {
                    if (ajwr.b != null) {
                        return false;
                    }
                } else if (!arml.equals(ajwr.b)) {
                    return false;
                }
                if (Arrays.equals(this.d, ajwr.d)) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajwr.unknownFieldData);
                    }
                    aocb aocb2 = ajwr.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        arml arml = this.c;
        hashCode = (((hashCode + 527) * 31) + a) * 31;
        a = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        arml arml2 = this.b;
        hashCode = (((((hashCode + hashCode2) * 31) + (arml2 != null ? arml2.hashCode() : 0)) * 31) + Arrays.hashCode(this.d)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        ajwu[] ajwuArr = this.a;
        if (ajwuArr != null && ajwuArr.length > 0) {
            int i = 0;
            while (true) {
                ajwu[] ajwuArr2 = this.a;
                if (i >= ajwuArr2.length) {
                    break;
                }
                aocf aocf = ajwuArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(5, anze);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(6, this.d);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        ajwu[] ajwuArr = this.a;
        if (ajwuArr != null && ajwuArr.length > 0) {
            int i = 0;
            while (true) {
                ajwu[] ajwuArr2 = this.a;
                if (i >= ajwuArr2.length) {
                    break;
                }
                aocf aocf = ajwuArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        return !Arrays.equals(this.d, aock.c) ? computeSerializedSize + aoby.b(6, this.d) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            arml arml;
            arml arml2;
            armk armk;
            if (a == 0) {
                break;
            } else if (a == 10) {
                aocf ajwu;
                a = aock.a(aobv, 10);
                ajwu[] ajwuArr = this.a;
                int length = ajwuArr != null ? ajwuArr.length : 0;
                ajwu[] ajwuArr2 = new ajwu[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajwuArr, 0, ajwuArr2, 0, length);
                }
                while (length < ajwuArr2.length - 1) {
                    ajwu = new ajwu();
                    ajwuArr2[length] = ajwu;
                    aobv.a(ajwu);
                    aobv.a();
                    length++;
                }
                ajwu = new ajwu();
                ajwuArr2[length] = ajwu;
                aobv.a(ajwu);
                this.a = ajwuArr2;
            } else if (a == 18) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.c;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.c = arml;
            } else if (a == 42) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.b;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.b = arml;
            } else if (a == 50) {
                this.d = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
