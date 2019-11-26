package defpackage;

import java.util.Arrays;

/* renamed from: ajzo */
public final class ajzo extends ajwo {
    public arml a;
    public arml b;
    public ajzn[] c;
    public byte[] d;
    public ajzw e;
    private aodx f;

    public ajzo() {
        super(138457959);
        if (ajzn.a == null) {
            synchronized (aocd.b) {
                if (ajzn.a == null) {
                    ajzn.a = new ajzn[0];
                }
            }
        }
        this.c = ajzn.a;
        this.d = aock.c;
        this.e = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajzo) {
            ajzo ajzo = (ajzo) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajzo.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajzo.a)) {
                return false;
            }
            arml = this.b;
            if (arml == null) {
                if (ajzo.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajzo.b)) {
                return false;
            }
            if (aocd.a(this.c, ajzo.c) && Arrays.equals(this.d, ajzo.d)) {
                aodx aodx = this.f;
                if (aodx == null) {
                    if (ajzo.f != null) {
                        return false;
                    }
                } else if (!aodx.equals(ajzo.f)) {
                    return false;
                }
                ajzw ajzw = this.e;
                if (ajzw == null) {
                    if (ajzo.e != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajzo.e)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajzo.unknownFieldData);
                }
                aocb aocb2 = ajzo.unknownFieldData;
                return aocb2 == null || aocb2.b();
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
        arml arml2 = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        int a = aocd.a(this.c);
        int hashCode3 = Arrays.hashCode(this.d);
        aodx aodx = this.f;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + hashCode3) * 31;
        hashCode2 = aodx != null ? aodx.hashCode() : 0;
        ajzw ajzw = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (ajzw != null ? ajzw.hashCode() : 0)) * 31;
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
        ajzn[] ajznArr = this.c;
        if (ajznArr != null && ajznArr.length > 0) {
            int i = 0;
            while (true) {
                ajzn[] ajznArr2 = this.c;
                if (i >= ajznArr2.length) {
                    break;
                }
                aocf aocf = ajznArr2[i];
                if (aocf != null) {
                    aoby.a(3, aocf);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(5, this.d);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(6, anze);
        }
        aocf aocf2 = this.e;
        if (aocf2 != null) {
            aoby.a(7, aocf2);
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
        ajzn[] ajznArr = this.c;
        if (ajznArr != null && ajznArr.length > 0) {
            int i = 0;
            while (true) {
                ajzn[] ajznArr2 = this.c;
                if (i >= ajznArr2.length) {
                    break;
                }
                aocf aocf = ajznArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(3, aocf);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(5, this.d);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        aocf aocf2 = this.e;
        return aocf2 != null ? computeSerializedSize + aoby.b(7, aocf2) : computeSerializedSize;
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
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.a;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.a = arml;
            } else if (a == 18) {
                arml = (arml) aobv.a(arml.f.getParserForType());
                arml2 = this.b;
                if (arml2 != null) {
                    armk = (armk) ((anxo) arml2.toBuilder());
                    armk.mergeFrom(arml);
                    arml = (arml) ((anxl) armk.build());
                }
                this.b = arml;
            } else if (a == 26) {
                aocf ajzn;
                a = aock.a(aobv, 26);
                ajzn[] ajznArr = this.c;
                int length = ajznArr != null ? ajznArr.length : 0;
                ajzn[] ajznArr2 = new ajzn[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajznArr, 0, ajznArr2, 0, length);
                }
                while (length < ajznArr2.length - 1) {
                    ajzn = new ajzn();
                    ajznArr2[length] = ajzn;
                    aobv.a(ajzn);
                    aobv.a();
                    length++;
                }
                ajzn = new ajzn();
                ajznArr2[length] = ajzn;
                aobv.a(ajzn);
                this.c = ajznArr2;
            } else if (a == 42) {
                this.d = aobv.e();
            } else if (a == 50) {
                aodx aodx = (aodx) aobv.a(aodx.c.getParserForType());
                aodx aodx2 = this.f;
                if (aodx2 != null) {
                    aodz aodz = (aodz) ((anxo) aodx2.toBuilder());
                    aodz.mergeFrom(aodx);
                    aodx = (aodx) ((anxl) aodz.build());
                }
                this.f = aodx;
            } else if (a == 58) {
                if (this.e == null) {
                    this.e = new ajzw();
                }
                aobv.a(this.e);
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
