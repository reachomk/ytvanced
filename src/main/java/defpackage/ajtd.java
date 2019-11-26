package defpackage;

import java.util.Arrays;

/* renamed from: ajtd */
public final class ajtd extends ajwo {
    public arml a;
    public ajxn[] b;
    public byte[] c;
    public aphj d;
    public apxu[] e;
    public aylc f;

    public ajtd() {
        super(95060329);
        if (ajxn.a == null) {
            synchronized (aocd.b) {
                if (ajxn.a == null) {
                    ajxn.a = new ajxn[0];
                }
            }
        }
        this.b = ajxn.a;
        this.c = aock.c;
        this.e = new apxu[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajtd) {
            ajtd ajtd = (ajtd) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajtd.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajtd.a)) {
                return false;
            }
            if (aocd.a(this.b, ajtd.b) && Arrays.equals(this.c, ajtd.c)) {
                aphj aphj = this.d;
                if (aphj == null) {
                    if (ajtd.d != null) {
                        return false;
                    }
                } else if (!aphj.equals(ajtd.d)) {
                    return false;
                }
                if (aocd.a(this.e, ajtd.e)) {
                    aylc aylc = this.f;
                    if (aylc == null) {
                        if (ajtd.f != null) {
                            return false;
                        }
                    } else if (!aylc.equals(ajtd.f)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajtd.unknownFieldData);
                    }
                    aocb aocb2 = ajtd.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arml arml = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        int a = aocd.a(this.b);
        int hashCode3 = Arrays.hashCode(this.c);
        aphj aphj = this.d;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + hashCode3) * 31;
        hashCode2 = aphj != null ? aphj.hashCode() : 0;
        a = aocd.a(this.e);
        aylc aylc = this.f;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + (aylc != null ? aylc.hashCode() : 0)) * 31;
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
        ajxn[] ajxnArr = this.b;
        int i = 0;
        if (ajxnArr != null && ajxnArr.length > 0) {
            int i2 = 0;
            while (true) {
                ajxn[] ajxnArr2 = this.b;
                if (i2 >= ajxnArr2.length) {
                    break;
                }
                aocf aocf = ajxnArr2[i2];
                if (aocf != null) {
                    aoby.a(2, aocf);
                }
                i2++;
            }
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(4, this.c);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(5, anze);
        }
        apxu[] apxuArr = this.e;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.e;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    aoby.a(6, anze);
                }
                i++;
            }
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(7, anze);
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
        ajxn[] ajxnArr = this.b;
        int i = 0;
        if (ajxnArr != null && ajxnArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajxn[] ajxnArr2 = this.b;
                if (computeSerializedSize >= ajxnArr2.length) {
                    break;
                }
                aocf aocf = ajxnArr2[computeSerializedSize];
                if (aocf != null) {
                    i2 += aoby.b(2, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(4, this.c);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        apxu[] apxuArr = this.e;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.e;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(6, anze);
                }
                i++;
            }
        }
        anze = this.f;
        return anze != null ? computeSerializedSize + anwm.c(7, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
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
                aocf ajxn;
                a = aock.a(aobv, 18);
                ajxn[] ajxnArr = this.b;
                length = ajxnArr != null ? ajxnArr.length : 0;
                ajxn[] ajxnArr2 = new ajxn[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajxnArr, 0, ajxnArr2, 0, length);
                }
                while (length < ajxnArr2.length - 1) {
                    ajxn = new ajxn();
                    ajxnArr2[length] = ajxn;
                    aobv.a(ajxn);
                    aobv.a();
                    length++;
                }
                ajxn = new ajxn();
                ajxnArr2[length] = ajxn;
                aobv.a(ajxn);
                this.b = ajxnArr2;
            } else if (a == 34) {
                this.c = aobv.e();
            } else if (a == 42) {
                aphj aphj = (aphj) aobv.a(aphj.d.getParserForType());
                aphj aphj2 = this.d;
                if (aphj2 != null) {
                    aphm aphm = (aphm) ((anxo) aphj2.toBuilder());
                    aphm.mergeFrom(aphj);
                    aphj = (aphj) ((anxl) aphm.build());
                }
                this.d = aphj;
            } else if (a == 50) {
                a = aock.a(aobv, 50);
                apxu[] apxuArr = this.e;
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
                this.e = apxuArr2;
            } else if (a == 58) {
                aylc aylc = (aylc) aobv.a(aylc.c.getParserForType());
                aylc aylc2 = this.f;
                if (aylc2 != null) {
                    aylf aylf = (aylf) ((anxo) aylc2.toBuilder());
                    aylf.mergeFrom(aylc);
                    aylc = (aylc) ((anxl) aylf.build());
                }
                this.f = aylc;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
