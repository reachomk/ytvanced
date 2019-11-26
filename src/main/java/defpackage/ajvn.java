package defpackage;

import java.util.Arrays;

/* renamed from: ajvn */
public final class ajvn extends aoca {
    public akah[] a;
    public ajxo[] b;
    public akah c;
    public byte[] d;
    private apxu[] e = new apxu[0];
    private arml f;

    public ajvn() {
        if (akah.a == null) {
            synchronized (aocd.b) {
                if (akah.a == null) {
                    akah.a = new akah[0];
                }
            }
        }
        this.a = akah.a;
        if (ajxo.a == null) {
            synchronized (aocd.b) {
                if (ajxo.a == null) {
                    ajxo.a = new ajxo[0];
                }
            }
        }
        this.b = ajxo.a;
        this.c = null;
        this.d = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajvn) {
            ajvn ajvn = (ajvn) obj;
            if (aocd.a(this.e, ajvn.e) && aocd.a(this.a, ajvn.a) && aocd.a(this.b, ajvn.b)) {
                akah akah = this.c;
                if (akah == null) {
                    if (ajvn.c != null) {
                        return false;
                    }
                } else if (!akah.equals(ajvn.c)) {
                    return false;
                }
                if (Arrays.equals(this.d, ajvn.d)) {
                    arml arml = this.f;
                    if (arml == null) {
                        if (ajvn.f != null) {
                            return false;
                        }
                    } else if (!arml.equals(ajvn.f)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajvn.unknownFieldData);
                    }
                    aocb aocb2 = ajvn.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.e);
        int a2 = aocd.a(this.a);
        int a3 = aocd.a(this.b);
        akah akah = this.c;
        hashCode = (((((((hashCode + 527) * 31) + a) * 31) + a2) * 31) + a3) * 31;
        a = 0;
        a2 = akah != null ? akah.hashCode() : 0;
        a3 = Arrays.hashCode(this.d);
        arml arml = this.f;
        hashCode = (((((hashCode + a2) * 31) + a3) * 31) + (arml != null ? arml.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        int i;
        aocf aocf;
        apxu[] apxuArr = this.e;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.e;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    aoby.a(5, anze);
                }
                i++;
            }
        }
        akah[] akahArr = this.a;
        if (akahArr != null && akahArr.length > 0) {
            i = 0;
            while (true) {
                akah[] akahArr2 = this.a;
                if (i >= akahArr2.length) {
                    break;
                }
                aocf aocf2 = akahArr2[i];
                if (aocf2 != null) {
                    aoby.a(6, aocf2);
                }
                i++;
            }
        }
        ajxo[] ajxoArr = this.b;
        if (ajxoArr != null && ajxoArr.length > 0) {
            while (true) {
                ajxoArr = this.b;
                if (i2 >= ajxoArr.length) {
                    break;
                }
                aocf = ajxoArr[i2];
                if (aocf != null) {
                    aoby.a(7, aocf);
                }
                i2++;
            }
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(8, aocf);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(10, this.d);
        }
        anze anze2 = this.f;
        if (anze2 != null) {
            aoby.a(11, anze2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        aocf aocf;
        int computeSerializedSize = super.computeSerializedSize();
        apxu[] apxuArr = this.e;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.e;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(5, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        akah[] akahArr = this.a;
        if (akahArr != null && akahArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                akah[] akahArr2 = this.a;
                if (computeSerializedSize >= akahArr2.length) {
                    break;
                }
                aocf aocf2 = akahArr2[computeSerializedSize];
                if (aocf2 != null) {
                    i += aoby.b(6, aocf2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        ajxo[] ajxoArr = this.b;
        if (ajxoArr != null && ajxoArr.length > 0) {
            while (true) {
                ajxoArr = this.b;
                if (i2 >= ajxoArr.length) {
                    break;
                }
                aocf = ajxoArr[i2];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(7, aocf);
                }
                i2++;
            }
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(8, aocf);
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(10, this.d);
        }
        anze anze2 = this.f;
        return anze2 != null ? computeSerializedSize + anwm.c(11, anze2) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            aocf akah;
            if (a == 0) {
                break;
            } else if (a == 42) {
                a = aock.a(aobv, 42);
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
            } else if (a == 50) {
                a = aock.a(aobv, 50);
                akah[] akahArr = this.a;
                length = akahArr != null ? akahArr.length : 0;
                akah[] akahArr2 = new akah[(a + length)];
                if (length != 0) {
                    System.arraycopy(akahArr, 0, akahArr2, 0, length);
                }
                while (length < akahArr2.length - 1) {
                    akah = new akah();
                    akahArr2[length] = akah;
                    aobv.a(akah);
                    aobv.a();
                    length++;
                }
                akah = new akah();
                akahArr2[length] = akah;
                aobv.a(akah);
                this.a = akahArr2;
            } else if (a == 58) {
                a = aock.a(aobv, 58);
                ajxo[] ajxoArr = this.b;
                length = ajxoArr != null ? ajxoArr.length : 0;
                ajxo[] ajxoArr2 = new ajxo[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajxoArr, 0, ajxoArr2, 0, length);
                }
                while (length < ajxoArr2.length - 1) {
                    akah = new ajxo();
                    ajxoArr2[length] = akah;
                    aobv.a(akah);
                    aobv.a();
                    length++;
                }
                akah = new ajxo();
                ajxoArr2[length] = akah;
                aobv.a(akah);
                this.b = ajxoArr2;
            } else if (a == 66) {
                if (this.c == null) {
                    this.c = new akah();
                }
                aobv.a(this.c);
            } else if (a == 82) {
                this.d = aobv.e();
            } else if (a == 90) {
                arml arml = (arml) aobv.a(arml.f.getParserForType());
                arml arml2 = this.f;
                if (arml2 != null) {
                    armk armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.f = arml;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
