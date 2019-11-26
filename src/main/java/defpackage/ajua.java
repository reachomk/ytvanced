package defpackage;

/* renamed from: ajua */
public final class ajua extends aoca {
    public ajtz a;
    public ajri b;
    private apxu[] c;
    public arnm frameworkUpdates;

    public ajua() {
        this.a = null;
        this.c = new apxu[0];
        this.b = null;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajua) {
            ajua ajua = (ajua) obj;
            ajtz ajtz = this.a;
            if (ajtz == null) {
                if (ajua.a != null) {
                    return false;
                }
            } else if (!ajtz.equals(ajua.a)) {
                return false;
            }
            if (aocd.a(this.c, ajua.c)) {
                ajri ajri = this.b;
                if (ajri == null) {
                    if (ajua.b != null) {
                        return false;
                    }
                } else if (!ajri.equals(ajua.b)) {
                    return false;
                }
                arnm arnm = this.frameworkUpdates;
                if (arnm == null) {
                    if (ajua.frameworkUpdates != null) {
                        return false;
                    }
                } else if (!arnm.equals(ajua.frameworkUpdates)) {
                    return false;
                }
                aocb aocb = this.unknownFieldData;
                if (aocb != null && !aocb.b()) {
                    return this.unknownFieldData.equals(ajua.unknownFieldData);
                }
                aocb aocb2 = ajua.unknownFieldData;
                return aocb2 == null || aocb2.b();
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        ajtz ajtz = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = ajtz != null ? ajtz.hashCode() : 0;
        int a = aocd.a(this.c);
        ajri ajri = this.b;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = ajri != null ? ajri.hashCode() : 0;
        arnm arnm = this.frameworkUpdates;
        hashCode = (((hashCode + hashCode2) * 31) + (arnm != null ? arnm.hashCode() : 0)) * 31;
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
        apxu[] apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
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
        aocf = this.b;
        if (aocf != null) {
            aoby.a(5, aocf);
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
        apxu[] apxuArr = this.c;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.c;
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
        aocf = this.b;
        if (aocf != null) {
            computeSerializedSize += aoby.b(5, aocf);
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
                    this.a = new ajtz();
                }
                aobv.a(this.a);
            } else if (a == 34) {
                a = aock.a(aobv, 34);
                apxu[] apxuArr = this.c;
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
                this.c = apxuArr2;
            } else if (a == 42) {
                if (this.b == null) {
                    this.b = new ajri();
                }
                aobv.a(this.b);
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
