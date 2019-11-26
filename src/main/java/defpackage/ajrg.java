package defpackage;

import java.util.Arrays;

/* renamed from: ajrg */
public final class ajrg extends aoca {
    public ajrf[] a;
    public apxu b;
    public byte[] c;
    private arml d;
    private ajtk e;
    private apxu f;
    private apxu[] g;
    private ajzw h;

    public ajrg() {
        if (ajrf.a == null) {
            synchronized (aocd.b) {
                if (ajrf.a == null) {
                    ajrf.a = new ajrf[0];
                }
            }
        }
        this.a = ajrf.a;
        this.e = null;
        this.c = aock.c;
        this.g = new apxu[0];
        this.h = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajrg) {
            ajrg ajrg = (ajrg) obj;
            if (aocd.a(this.a, ajrg.a)) {
                arml arml = this.d;
                if (arml == null) {
                    if (ajrg.d != null) {
                        return false;
                    }
                } else if (!arml.equals(ajrg.d)) {
                    return false;
                }
                apxu apxu = this.b;
                if (apxu == null) {
                    if (ajrg.b != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajrg.b)) {
                    return false;
                }
                ajtk ajtk = this.e;
                if (ajtk == null) {
                    if (ajrg.e != null) {
                        return false;
                    }
                } else if (!ajtk.equals(ajrg.e)) {
                    return false;
                }
                apxu = this.f;
                if (apxu == null) {
                    if (ajrg.f != null) {
                        return false;
                    }
                } else if (!apxu.equals(ajrg.f)) {
                    return false;
                }
                if (Arrays.equals(this.c, ajrg.c) && aocd.a(this.g, ajrg.g)) {
                    ajzw ajzw = this.h;
                    if (ajzw == null) {
                        if (ajrg.h != null) {
                            return false;
                        }
                    } else if (!ajzw.equals(ajrg.h)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajrg.unknownFieldData);
                    }
                    aocb aocb2 = ajrg.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.a);
        arml arml = this.d;
        hashCode = (((hashCode + 527) * 31) + a) * 31;
        a = 0;
        int hashCode2 = arml != null ? arml.hashCode() : 0;
        apxu apxu = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        ajtk ajtk = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajtk != null ? ajtk.hashCode() : 0;
        apxu = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.c);
        int a2 = aocd.a(this.g);
        ajzw ajzw = this.h;
        hashCode = (((((((hashCode + hashCode2) * 31) + hashCode3) * 31) + a2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        ajrf[] ajrfArr = this.a;
        int i = 0;
        if (ajrfArr != null && ajrfArr.length > 0) {
            int i2 = 0;
            while (true) {
                ajrf[] ajrfArr2 = this.a;
                if (i2 >= ajrfArr2.length) {
                    break;
                }
                aocf aocf = ajrfArr2[i2];
                if (aocf != null) {
                    aoby.a(3, aocf);
                }
                i2++;
            }
        }
        anze anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        anze = this.b;
        if (anze != null) {
            aoby.a(8, anze);
        }
        aocf aocf2 = this.e;
        if (aocf2 != null) {
            aoby.a(10, aocf2);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(11, anze);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(12, this.c);
        }
        apxu[] apxuArr = this.g;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.g;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    aoby.a(15, anze);
                }
                i++;
            }
        }
        aocf2 = this.h;
        if (aocf2 != null) {
            aoby.a(16, aocf2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        ajrf[] ajrfArr = this.a;
        int i = 0;
        if (ajrfArr != null && ajrfArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                ajrf[] ajrfArr2 = this.a;
                if (computeSerializedSize >= ajrfArr2.length) {
                    break;
                }
                aocf aocf = ajrfArr2[computeSerializedSize];
                if (aocf != null) {
                    i2 += aoby.b(3, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        anze anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        anze = this.b;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        aocf aocf2 = this.e;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(10, aocf2);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(11, anze);
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(12, this.c);
        }
        apxu[] apxuArr = this.g;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.g;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(15, anze);
                }
                i++;
            }
        }
        aocf2 = this.h;
        return aocf2 != null ? computeSerializedSize + aoby.b(16, aocf2) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            if (a == 0) {
                break;
            } else if (a == 26) {
                aocf ajrf;
                a = aock.a(aobv, 26);
                ajrf[] ajrfArr = this.a;
                length = ajrfArr != null ? ajrfArr.length : 0;
                ajrf[] ajrfArr2 = new ajrf[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajrfArr, 0, ajrfArr2, 0, length);
                }
                while (length < ajrfArr2.length - 1) {
                    ajrf = new ajrf();
                    ajrfArr2[length] = ajrf;
                    aobv.a(ajrf);
                    aobv.a();
                    length++;
                }
                ajrf = new ajrf();
                ajrfArr2[length] = ajrf;
                aobv.a(ajrf);
                this.a = ajrfArr2;
            } else if (a == 34) {
                arml arml = (arml) aobv.a(arml.f.getParserForType());
                arml arml2 = this.d;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.d = arml;
            } else if (a == 66) {
                apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu2 = this.b;
                if (apxu2 != null) {
                    apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.b = apxu;
            } else if (a == 82) {
                if (this.e == null) {
                    this.e = new ajtk();
                }
                aobv.a(this.e);
            } else if (a == 90) {
                apxu = (apxu) aobv.a(apxu.d.getParserForType());
                apxu2 = this.f;
                if (apxu2 != null) {
                    apxx = (apxx) ((anxo) apxu2.toBuilder());
                    apxx.mergeFrom(apxu);
                    apxu = (apxu) ((anxl) apxx.build());
                }
                this.f = apxu;
            } else if (a == 98) {
                this.c = aobv.e();
            } else if (a == afy.av) {
                a = aock.a(aobv, (int) afy.av);
                apxu[] apxuArr = this.g;
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
                this.g = apxuArr2;
            } else if (a == 130) {
                if (this.h == null) {
                    this.h = new ajzw();
                }
                aobv.a(this.h);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
