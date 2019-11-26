package defpackage;

import java.util.Arrays;

/* renamed from: ajwh */
public final class ajwh extends ajwo {
    public arwz a;
    public ajwi b;
    public arwv[] c;
    public arwr d;
    public boolean e;
    private byte[] f;

    public ajwh() {
        super(62127609);
        this.b = null;
        this.c = new arwv[0];
        this.f = aock.c;
        this.e = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajwh) {
            ajwh ajwh = (ajwh) obj;
            arwz arwz = this.a;
            if (arwz == null) {
                if (ajwh.a != null) {
                    return false;
                }
            } else if (!arwz.equals(ajwh.a)) {
                return false;
            }
            ajwi ajwi = this.b;
            if (ajwi == null) {
                if (ajwh.b != null) {
                    return false;
                }
            } else if (!ajwi.equals(ajwh.b)) {
                return false;
            }
            if (aocd.a(this.c, ajwh.c)) {
                arwr arwr = this.d;
                if (arwr == null) {
                    if (ajwh.d != null) {
                        return false;
                    }
                } else if (!arwr.equals(ajwh.d)) {
                    return false;
                }
                if (Arrays.equals(this.f, ajwh.f) && this.e == ajwh.e) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajwh.unknownFieldData);
                    }
                    aocb aocb2 = ajwh.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        arwz arwz = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = arwz != null ? arwz.hashCode() : 0;
        ajwi ajwi = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajwi != null ? ajwi.hashCode() : 0;
        int a = aocd.a(this.c);
        arwr arwr = this.d;
        hashCode = (((((((((hashCode + hashCode2) * 31) + a) * 31) + (arwr != null ? arwr.hashCode() : 0)) * 31) + Arrays.hashCode(this.f)) * 31) + (!this.e ? 1237 : 1231)) * 31;
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
        aocf aocf = this.b;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        arwv[] arwvArr = this.c;
        if (arwvArr != null && arwvArr.length > 0) {
            int i = 0;
            while (true) {
                arwv[] arwvArr2 = this.c;
                if (i >= arwvArr2.length) {
                    break;
                }
                anze anze2 = arwvArr2[i];
                if (anze2 != null) {
                    aoby.a(3, anze2);
                }
                i++;
            }
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(5, anze);
        }
        if (!Arrays.equals(this.f, aock.c)) {
            aoby.a(6, this.f);
        }
        if (this.e) {
            aoby.a(7, true);
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
        aocf aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        arwv[] arwvArr = this.c;
        if (arwvArr != null && arwvArr.length > 0) {
            int i = 0;
            while (true) {
                arwv[] arwvArr2 = this.c;
                if (i >= arwvArr2.length) {
                    break;
                }
                anze anze2 = arwvArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(3, anze2);
                }
                i++;
            }
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        if (!Arrays.equals(this.f, aock.c)) {
            computeSerializedSize += aoby.b(6, this.f);
        }
        return this.e ? computeSerializedSize + aoby.d(7) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                arwz arwz = (arwz) aobv.a(arwz.c.getParserForType());
                arwz arwz2 = this.a;
                if (arwz2 != null) {
                    arxc arxc = (arxc) ((anxo) arwz2.toBuilder());
                    arxc.mergeFrom(arwz);
                    arwz = (arwz) ((anxl) arxc.build());
                }
                this.a = arwz;
            } else if (a == 18) {
                if (this.b == null) {
                    this.b = new ajwi();
                }
                aobv.a(this.b);
            } else if (a == 26) {
                a = aock.a(aobv, 26);
                arwv[] arwvArr = this.c;
                int length = arwvArr != null ? arwvArr.length : 0;
                arwv[] arwvArr2 = new arwv[(a + length)];
                if (length != 0) {
                    System.arraycopy(arwvArr, 0, arwvArr2, 0, length);
                }
                while (length < arwvArr2.length - 1) {
                    arwvArr2[length] = (arwv) aobv.a(arwv.e.getParserForType());
                    aobv.a();
                    length++;
                }
                arwvArr2[length] = (arwv) aobv.a(arwv.e.getParserForType());
                this.c = arwvArr2;
            } else if (a == 42) {
                arwr arwr = (arwr) aobv.a(arwr.d.getParserForType());
                arwr arwr2 = this.d;
                if (arwr2 != null) {
                    arwu arwu = (arwu) ((anxo) arwr2.toBuilder());
                    arwu.mergeFrom(arwr);
                    arwr = (arwr) ((anxl) arwu.build());
                }
                this.d = arwr;
            } else if (a == 50) {
                this.f = aobv.e();
            } else if (a == 56) {
                this.e = aobv.c();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
