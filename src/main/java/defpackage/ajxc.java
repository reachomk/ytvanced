package defpackage;

/* renamed from: ajxc */
public final class ajxc extends ajwo {
    public arml a;
    public augf[] b;
    public augj[] c;
    public arwf d;
    public ajzw e;

    public ajxc() {
        super(132498670);
        this.b = new augf[0];
        this.c = new augj[0];
        this.e = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajxc) {
            ajxc ajxc = (ajxc) obj;
            arml arml = this.a;
            if (arml == null) {
                if (ajxc.a != null) {
                    return false;
                }
            } else if (!arml.equals(ajxc.a)) {
                return false;
            }
            if (aocd.a(this.b, ajxc.b) && aocd.a(this.c, ajxc.c)) {
                arwf arwf = this.d;
                if (arwf == null) {
                    if (ajxc.d != null) {
                        return false;
                    }
                } else if (!arwf.equals(ajxc.d)) {
                    return false;
                }
                ajzw ajzw = this.e;
                if (ajzw == null) {
                    if (ajxc.e != null) {
                        return false;
                    }
                } else if (!ajzw.equals(ajxc.e)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajxc.unknownFieldData);
                }
                aocb aocb2 = ajxc.unknownFieldData;
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
        int a = aocd.a(this.b);
        int a2 = aocd.a(this.c);
        arwf arwf = this.d;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + a2) * 31;
        hashCode2 = arwf != null ? arwf.hashCode() : 0;
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
        augf[] augfArr = this.b;
        int i = 0;
        if (augfArr != null && augfArr.length > 0) {
            int i2 = 0;
            while (true) {
                augf[] augfArr2 = this.b;
                if (i2 >= augfArr2.length) {
                    break;
                }
                anze anze2 = augfArr2[i2];
                if (anze2 != null) {
                    aoby.a(2, anze2);
                }
                i2++;
            }
        }
        augj[] augjArr = this.c;
        if (augjArr != null && augjArr.length > 0) {
            while (true) {
                augjArr = this.c;
                if (i >= augjArr.length) {
                    break;
                }
                anze = augjArr[i];
                if (anze != null) {
                    aoby.a(3, anze);
                }
                i++;
            }
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(4, anze);
        }
        aocf aocf = this.e;
        if (aocf != null) {
            aoby.a(5, aocf);
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
        augf[] augfArr = this.b;
        int i = 0;
        if (augfArr != null && augfArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                augf[] augfArr2 = this.b;
                if (computeSerializedSize >= augfArr2.length) {
                    break;
                }
                anze anze2 = augfArr2[computeSerializedSize];
                if (anze2 != null) {
                    i2 += anwm.c(2, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        augj[] augjArr = this.c;
        if (augjArr != null && augjArr.length > 0) {
            while (true) {
                augjArr = this.c;
                if (i >= augjArr.length) {
                    break;
                }
                anze = augjArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(3, anze);
                }
                i++;
            }
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(4, anze);
        }
        aocf aocf = this.e;
        return aocf != null ? computeSerializedSize + aoby.b(5, aocf) : computeSerializedSize;
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
                a = aock.a(aobv, 18);
                augf[] augfArr = this.b;
                length = augfArr != null ? augfArr.length : 0;
                augf[] augfArr2 = new augf[(a + length)];
                if (length != 0) {
                    System.arraycopy(augfArr, 0, augfArr2, 0, length);
                }
                while (length < augfArr2.length - 1) {
                    augfArr2[length] = (augf) aobv.a(augf.c.getParserForType());
                    aobv.a();
                    length++;
                }
                augfArr2[length] = (augf) aobv.a(augf.c.getParserForType());
                this.b = augfArr2;
            } else if (a == 26) {
                a = aock.a(aobv, 26);
                augj[] augjArr = this.c;
                length = augjArr != null ? augjArr.length : 0;
                augj[] augjArr2 = new augj[(a + length)];
                if (length != 0) {
                    System.arraycopy(augjArr, 0, augjArr2, 0, length);
                }
                while (length < augjArr2.length - 1) {
                    augjArr2[length] = (augj) aobv.a(augj.c.getParserForType());
                    aobv.a();
                    length++;
                }
                augjArr2[length] = (augj) aobv.a(augj.c.getParserForType());
                this.c = augjArr2;
            } else if (a == 34) {
                arwf arwf = (arwf) aobv.a(arwf.c.getParserForType());
                arwf arwf2 = this.d;
                if (arwf2 != null) {
                    arwe arwe = (arwe) ((anxo) arwf2.toBuilder());
                    arwe.mergeFrom(arwf);
                    arwf = (arwf) ((anxl) arwe.build());
                }
                this.d = arwf;
            } else if (a == 42) {
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
