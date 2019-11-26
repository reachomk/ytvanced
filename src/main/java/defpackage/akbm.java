package defpackage;

/* renamed from: akbm */
public final class akbm extends aoca {
    public akbl a;
    public boolean b;
    public ajri c;
    private apxu[] d;
    public arnm frameworkUpdates;

    public akbm() {
        this.a = null;
        this.d = new apxu[0];
        this.b = false;
        this.c = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbm) {
            akbm akbm = (akbm) obj;
            akbl akbl = this.a;
            if (akbl == null) {
                if (akbm.a != null) {
                    return false;
                }
            } else if (!akbl.equals(akbm.a)) {
                return false;
            }
            if (aocd.a(this.d, akbm.d) && this.b == akbm.b) {
                ajri ajri = this.c;
                if (ajri == null) {
                    if (akbm.c != null) {
                        return false;
                    }
                } else if (!ajri.equals(akbm.c)) {
                    return false;
                }
                arnm arnm = this.frameworkUpdates;
                if (arnm == null) {
                    if (akbm.frameworkUpdates != null) {
                        return false;
                    }
                } else if (!arnm.equals(akbm.frameworkUpdates)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(akbm.unknownFieldData);
                }
                aocb aocb2 = akbm.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        akbl akbl = this.a;
        int i = 0;
        hashCode = (((((hashCode + 527) * 31) + (akbl != null ? akbl.hashCode() : 0)) * 31) + aocd.a(this.d)) * 31;
        int i2 = !this.b ? 1237 : 1231;
        ajri ajri = this.c;
        hashCode = (hashCode + i2) * 31;
        i2 = ajri != null ? ajri.hashCode() : 0;
        arnm arnm = this.frameworkUpdates;
        hashCode = (((hashCode + i2) * 31) + (arnm != null ? arnm.hashCode() : 0)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(2, aocf);
        }
        apxu[] apxuArr = this.d;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.d;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    aoby.a(4, anze);
                }
                i++;
            }
        }
        if (this.b) {
            aoby.a(5, true);
        }
        aocf = this.c;
        if (aocf != null) {
            aoby.a(6, aocf);
        }
        anze anze2 = this.frameworkUpdates;
        if (anze2 != null) {
            aoby.a(777, anze2);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(2, aocf);
        }
        apxu[] apxuArr = this.d;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.d;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze = apxuArr2[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(4, anze);
                }
                i++;
            }
        }
        if (this.b) {
            computeSerializedSize += aoby.d(5);
        }
        aocf = this.c;
        if (aocf != null) {
            computeSerializedSize += aoby.b(6, aocf);
        }
        anze anze2 = this.frameworkUpdates;
        return anze2 != null ? computeSerializedSize + anwm.c(777, anze2) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 18) {
                if (this.a == null) {
                    this.a = new akbl();
                }
                aobv.a(this.a);
            } else if (a == 34) {
                a = aock.a(aobv, 34);
                apxu[] apxuArr = this.d;
                int length = apxuArr != null ? apxuArr.length : 0;
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
                this.d = apxuArr2;
            } else if (a == 40) {
                this.b = aobv.c();
            } else if (a == 50) {
                if (this.c == null) {
                    this.c = new ajri();
                }
                aobv.a(this.c);
            } else if (a == 6218) {
                arnm arnm = (arnm) aobv.a(arnm.a.getParserForType());
                arnm arnm2 = this.frameworkUpdates;
                if (arnm2 != null) {
                    arnl arnl = (arnl) ((anxo) arnm2.toBuilder());
                    arnl.mergeFrom(arnm);
                    arnm = (arnm) ((anxl) arnl.build());
                }
                this.frameworkUpdates = arnm;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
