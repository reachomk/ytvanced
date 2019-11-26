package defpackage;

import java.util.Arrays;

/* renamed from: ajuw */
public final class ajuw extends aoca {
    public aspl a;
    public aspj[] b;
    public aspn c;
    public asph d;
    public byte[] e;
    private apxu[] f;

    public ajuw() {
        this.b = new aspj[0];
        this.e = aock.c;
        this.f = new apxu[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajuw) {
            ajuw ajuw = (ajuw) obj;
            aspl aspl = this.a;
            if (aspl == null) {
                if (ajuw.a != null) {
                    return false;
                }
            } else if (!aspl.equals(ajuw.a)) {
                return false;
            }
            if (aocd.a(this.b, ajuw.b)) {
                aspn aspn = this.c;
                if (aspn == null) {
                    if (ajuw.c != null) {
                        return false;
                    }
                } else if (!aspn.equals(ajuw.c)) {
                    return false;
                }
                asph asph = this.d;
                if (asph == null) {
                    if (ajuw.d != null) {
                        return false;
                    }
                } else if (!asph.equals(ajuw.d)) {
                    return false;
                }
                if (Arrays.equals(this.e, ajuw.e) && aocd.a(this.f, ajuw.f)) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajuw.unknownFieldData);
                    }
                    aocb aocb2 = ajuw.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        aspl aspl = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = aspl != null ? aspl.hashCode() : 0;
        int a = aocd.a(this.b);
        aspn aspn = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + a) * 31;
        hashCode2 = aspn != null ? aspn.hashCode() : 0;
        asph asph = this.d;
        hashCode = (((((((hashCode + hashCode2) * 31) + (asph != null ? asph.hashCode() : 0)) * 31) + Arrays.hashCode(this.e)) * 31) + aocd.a(this.f)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        anze anze = this.a;
        if (anze != null) {
            aoby.a(3, anze);
        }
        aspj[] aspjArr = this.b;
        int i = 0;
        if (aspjArr != null && aspjArr.length > 0) {
            int i2 = 0;
            while (true) {
                aspj[] aspjArr2 = this.b;
                if (i2 >= aspjArr2.length) {
                    break;
                }
                anze anze2 = aspjArr2[i2];
                if (anze2 != null) {
                    aoby.a(4, anze2);
                }
                i2++;
            }
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(6, anze);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            aoby.a(8, this.e);
        }
        apxu[] apxuArr = this.f;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.f;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    aoby.a(9, anze);
                }
                i++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(3, anze);
        }
        aspj[] aspjArr = this.b;
        int i = 0;
        if (aspjArr != null && aspjArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                aspj[] aspjArr2 = this.b;
                if (computeSerializedSize >= aspjArr2.length) {
                    break;
                }
                anze anze2 = aspjArr2[computeSerializedSize];
                if (anze2 != null) {
                    i2 += anwm.c(4, anze2);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        if (!Arrays.equals(this.e, aock.c)) {
            computeSerializedSize += aoby.b(8, this.e);
        }
        apxu[] apxuArr = this.f;
        if (apxuArr != null && apxuArr.length > 0) {
            while (true) {
                apxuArr = this.f;
                if (i >= apxuArr.length) {
                    break;
                }
                anze = apxuArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(9, anze);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            if (a == 0) {
                break;
            } else if (a == 26) {
                aspl aspl = (aspl) aobv.a(aspl.c.getParserForType());
                aspl aspl2 = this.a;
                if (aspl2 != null) {
                    aspo aspo = (aspo) ((anxo) aspl2.toBuilder());
                    aspo.mergeFrom(aspl);
                    aspl = (aspl) ((anxl) aspo.build());
                }
                this.a = aspl;
            } else if (a == 34) {
                a = aock.a(aobv, 34);
                aspj[] aspjArr = this.b;
                length = aspjArr != null ? aspjArr.length : 0;
                aspj[] aspjArr2 = new aspj[(a + length)];
                if (length != 0) {
                    System.arraycopy(aspjArr, 0, aspjArr2, 0, length);
                }
                while (length < aspjArr2.length - 1) {
                    aspjArr2[length] = (aspj) aobv.a(aspj.c.getParserForType());
                    aobv.a();
                    length++;
                }
                aspjArr2[length] = (aspj) aobv.a(aspj.c.getParserForType());
                this.b = aspjArr2;
            } else if (a == 42) {
                aspn aspn = (aspn) aobv.a(aspn.c.getParserForType());
                aspn aspn2 = this.c;
                if (aspn2 != null) {
                    aspq aspq = (aspq) ((anxo) aspn2.toBuilder());
                    aspq.mergeFrom(aspn);
                    aspn = (aspn) ((anxl) aspq.build());
                }
                this.c = aspn;
            } else if (a == 50) {
                asph asph = (asph) aobv.a(asph.c.getParserForType());
                asph asph2 = this.d;
                if (asph2 != null) {
                    aspk aspk = (aspk) ((anxo) asph2.toBuilder());
                    aspk.mergeFrom(asph);
                    asph = (asph) ((anxl) aspk.build());
                }
                this.d = asph;
            } else if (a == 66) {
                this.e = aobv.e();
            } else if (a == 74) {
                a = aock.a(aobv, 74);
                apxu[] apxuArr = this.f;
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
                this.f = apxuArr2;
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
