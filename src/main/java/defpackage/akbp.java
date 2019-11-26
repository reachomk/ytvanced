package defpackage;

import java.util.Arrays;

/* renamed from: akbp */
public final class akbp extends ajwo {
    public akbs[] a;
    public int b;
    public arml c;
    public apxu d;
    private arml e;
    private byte[] f;

    public akbp() {
        super(57988071);
        if (akbs.a == null) {
            synchronized (aocd.b) {
                if (akbs.a == null) {
                    akbs.a = new akbs[0];
                }
            }
        }
        this.a = akbs.a;
        this.b = 0;
        this.f = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbp) {
            akbp akbp = (akbp) obj;
            if (aocd.a(this.a, akbp.a) && this.b == akbp.b) {
                arml arml = this.e;
                if (arml == null) {
                    if (akbp.e != null) {
                        return false;
                    }
                } else if (!arml.equals(akbp.e)) {
                    return false;
                }
                arml = this.c;
                if (arml == null) {
                    if (akbp.c != null) {
                        return false;
                    }
                } else if (!arml.equals(akbp.c)) {
                    return false;
                }
                if (Arrays.equals(this.f, akbp.f)) {
                    apxu apxu = this.d;
                    if (apxu == null) {
                        if (akbp.d != null) {
                            return false;
                        }
                    } else if (!apxu.equals(akbp.d)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(akbp.unknownFieldData);
                    }
                    aocb aocb2 = akbp.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        int i = this.b;
        arml arml = this.e;
        hashCode = (((((hashCode + 527) * 31) + a) * 31) + i) * 31;
        a = 0;
        i = arml != null ? arml.hashCode() : 0;
        arml = this.c;
        hashCode = (hashCode + i) * 31;
        i = arml != null ? arml.hashCode() : 0;
        int hashCode2 = Arrays.hashCode(this.f);
        apxu apxu = this.d;
        hashCode = (((((hashCode + i) * 31) + hashCode2) * 31) + (apxu != null ? apxu.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        akbs[] akbsArr = this.a;
        if (akbsArr != null && akbsArr.length > 0) {
            i = 0;
            while (true) {
                akbs[] akbsArr2 = this.a;
                if (i >= akbsArr2.length) {
                    break;
                }
                aocf aocf = akbsArr2[i];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i++;
            }
        }
        i = this.b;
        if (i != 0) {
            aoby.a(2, i);
        }
        anze anze = this.e;
        if (anze != null) {
            aoby.a(3, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(4, anze);
        }
        if (!Arrays.equals(this.f, aock.c)) {
            aoby.a(7, this.f);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(8, anze);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        akbs[] akbsArr = this.a;
        if (akbsArr != null && akbsArr.length > 0) {
            i = 0;
            while (true) {
                akbs[] akbsArr2 = this.a;
                if (i >= akbsArr2.length) {
                    break;
                }
                aocf aocf = akbsArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(1, aocf);
                }
                i++;
            }
        }
        i = this.b;
        if (i != 0) {
            computeSerializedSize += aoby.c(2, i);
        }
        anze anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        if (!Arrays.equals(this.f, aock.c)) {
            computeSerializedSize += aoby.b(7, this.f);
        }
        anze = this.d;
        return anze != null ? computeSerializedSize + anwm.c(8, anze) : computeSerializedSize;
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
                aocf akbs;
                a = aock.a(aobv, 10);
                akbs[] akbsArr = this.a;
                int length = akbsArr != null ? akbsArr.length : 0;
                akbs[] akbsArr2 = new akbs[(a + length)];
                if (length != 0) {
                    System.arraycopy(akbsArr, 0, akbsArr2, 0, length);
                }
                while (length < akbsArr2.length - 1) {
                    akbs = new akbs();
                    akbsArr2[length] = akbs;
                    aobv.a(akbs);
                    aobv.a();
                    length++;
                }
                akbs = new akbs();
                akbsArr2[length] = akbs;
                aobv.a(akbs);
                this.a = akbsArr2;
            } else if (a == 16) {
                this.b = aobv.f();
            } else if (a == 26) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.e;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.e = arml;
            } else if (a == 34) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.c;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.c = arml;
            } else if (a == 58) {
                this.f = aobv.e();
            } else if (a == 66) {
                apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu apxu2 = this.d;
                if (apxu2 != null) {
                    apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.d = apxu;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
