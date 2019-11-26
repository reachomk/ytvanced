package defpackage;

import java.util.Arrays;

/* renamed from: akat */
public final class akat extends ajwo {
    public aygk a;
    public arml b;
    public apxu c;
    public akaw d;
    public auuq e;
    private apdh[] f;
    private ajzw g;
    private ajzw h;
    private byte[] i;

    public akat() {
        super(119170535);
        this.d = null;
        this.f = new apdh[0];
        this.g = null;
        this.h = null;
        this.i = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akat) {
            akat akat = (akat) obj;
            aygk aygk = this.a;
            if (aygk == null) {
                if (akat.a != null) {
                    return false;
                }
            } else if (!aygk.equals(akat.a)) {
                return false;
            }
            arml arml = this.b;
            if (arml == null) {
                if (akat.b != null) {
                    return false;
                }
            } else if (!arml.equals(akat.b)) {
                return false;
            }
            apxu apxu = this.c;
            if (apxu == null) {
                if (akat.c != null) {
                    return false;
                }
            } else if (!apxu.equals(akat.c)) {
                return false;
            }
            akaw akaw = this.d;
            if (akaw == null) {
                if (akat.d != null) {
                    return false;
                }
            } else if (!akaw.equals(akat.d)) {
                return false;
            }
            if (aocd.a(this.f, akat.f)) {
                auuq auuq = this.e;
                if (auuq == null) {
                    if (akat.e != null) {
                        return false;
                    }
                } else if (!auuq.equals(akat.e)) {
                    return false;
                }
                ajzw ajzw = this.g;
                if (ajzw == null) {
                    if (akat.g != null) {
                        return false;
                    }
                } else if (!ajzw.equals(akat.g)) {
                    return false;
                }
                ajzw = this.h;
                if (ajzw == null) {
                    if (akat.h != null) {
                        return false;
                    }
                } else if (!ajzw.equals(akat.h)) {
                    return false;
                }
                if (Arrays.equals(this.i, akat.i)) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(akat.unknownFieldData);
                    }
                    aocb aocb2 = akat.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aygk aygk = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aygk != null ? aygk.hashCode() : 0;
        arml arml = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        akaw akaw = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = akaw != null ? akaw.hashCode() : 0;
        int a = aocd.a(this.f);
        auuq auuq = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = auuq != null ? auuq.hashCode() : 0;
        ajzw ajzw = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw = this.h;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31) + Arrays.hashCode(this.i)) * 31;
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
        anze = this.b;
        if (anze != null) {
            aoby.a(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(3, anze);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        apdh[] apdhArr = this.f;
        if (apdhArr != null && apdhArr.length > 0) {
            int i = 0;
            while (true) {
                apdh[] apdhArr2 = this.f;
                if (i >= apdhArr2.length) {
                    break;
                }
                anze anze2 = apdhArr2[i];
                if (anze2 != null) {
                    aoby.a(5, anze2);
                }
                i++;
            }
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(6, anze);
        }
        aocf = this.g;
        if (aocf != null) {
            aoby.a(7, aocf);
        }
        aocf = this.h;
        if (aocf != null) {
            aoby.a(8, aocf);
        }
        if (!Arrays.equals(this.i, aock.c)) {
            aoby.a(14, this.i);
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
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        aocf aocf = this.d;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        apdh[] apdhArr = this.f;
        if (apdhArr != null && apdhArr.length > 0) {
            int i = 0;
            while (true) {
                apdh[] apdhArr2 = this.f;
                if (i >= apdhArr2.length) {
                    break;
                }
                anze anze2 = apdhArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(5, anze2);
                }
                i++;
            }
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        aocf = this.g;
        if (aocf != null) {
            computeSerializedSize += aoby.b(7, aocf);
        }
        aocf = this.h;
        if (aocf != null) {
            computeSerializedSize += aoby.b(8, aocf);
        }
        return !Arrays.equals(this.i, aock.c) ? computeSerializedSize + aoby.b(14, this.i) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                aygk aygk = (aygk) aobv.a(aygk.f.getParserForType());
                aygk aygk2 = this.a;
                if (aygk2 != null) {
                    aygj aygj = (aygj) ((anxo) aygk2.toBuilder());
                    aygj.mergeFrom(aygk);
                    aygk = (aygk) ((anxl) aygj.build());
                }
                this.a = aygk;
            } else if (a == 18) {
                arml arml = (arml) aobv.a(arml.f.getParserForType());
                arml arml2 = this.b;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.b = arml;
            } else if (a == 26) {
                apxu apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu apxu2 = this.c;
                if (apxu2 != null) {
                    apxx apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.c = apxu;
            } else if (a == 34) {
                if (this.d == null) {
                    this.d = new akaw();
                }
                aobv.a(this.d);
            } else if (a == 42) {
                a = aock.a(aobv, 42);
                apdh[] apdhArr = this.f;
                int length = apdhArr != null ? apdhArr.length : 0;
                apdh[] apdhArr2 = new apdh[(a + length)];
                if (length != 0) {
                    System.arraycopy(apdhArr, 0, apdhArr2, 0, length);
                }
                while (length < apdhArr2.length - 1) {
                    apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                    aobv.a();
                    length++;
                }
                apdhArr2[length] = (apdh) aobv.a(apdh.r.getParserForType());
                this.f = apdhArr2;
            } else if (a == 50) {
                auuq auuq = (auuq) aobv.a(auuq.c.getParserForType());
                auuq auuq2 = this.e;
                if (auuq2 != null) {
                    auup auup = (auup) ((anxo) auuq2.toBuilder());
                    auup.mergeFrom(auuq);
                    auuq = (auuq) ((anxl) auup.build());
                }
                this.e = auuq;
            } else if (a == 58) {
                if (this.g == null) {
                    this.g = new ajzw();
                }
                aobv.a(this.g);
            } else if (a == 66) {
                if (this.h == null) {
                    this.h = new ajzw();
                }
                aobv.a(this.h);
            } else if (a == 114) {
                this.i = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
