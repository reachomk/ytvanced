package defpackage;

import java.util.Arrays;

/* renamed from: akci */
public final class akci extends aoca {
    public atpq a;
    public byte[] b;
    public atqm c;
    private apxu[] d;
    public arnm frameworkUpdates;

    public akci() {
        this.b = aock.c;
        this.d = new apxu[0];
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akci) {
            akci akci = (akci) obj;
            atpq atpq = this.a;
            if (atpq == null) {
                if (akci.a != null) {
                    return false;
                }
            } else if (!atpq.equals(akci.a)) {
                return false;
            }
            if (Arrays.equals(this.b, akci.b)) {
                atqm atqm = this.c;
                if (atqm == null) {
                    if (akci.c != null) {
                        return false;
                    }
                } else if (!atqm.equals(akci.c)) {
                    return false;
                }
                if (aocd.a(this.d, akci.d)) {
                    arnm arnm = this.frameworkUpdates;
                    if (arnm == null) {
                        if (akci.frameworkUpdates != null) {
                            return false;
                        }
                    } else if (!arnm.equals(akci.frameworkUpdates)) {
                        return false;
                    }
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(akci.unknownFieldData);
                    }
                    aocb aocb2 = akci.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        atpq atpq = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = atpq != null ? atpq.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.b);
        atqm atqm = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + hashCode3) * 31;
        hashCode2 = atqm != null ? atqm.hashCode() : 0;
        hashCode3 = aocd.a(this.d);
        arnm arnm = this.frameworkUpdates;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + (arnm != null ? arnm.hashCode() : 0)) * 31;
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
        if (!Arrays.equals(this.b, aock.c)) {
            aoby.a(4, this.b);
        }
        anze = this.c;
        if (anze != null) {
            aoby.a(5, anze);
        }
        apxu[] apxuArr = this.d;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.d;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    aoby.a(6, anze2);
                }
                i++;
            }
        }
        anze = this.frameworkUpdates;
        if (anze != null) {
            aoby.a(777, anze);
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
        if (!Arrays.equals(this.b, aock.c)) {
            computeSerializedSize += aoby.b(4, this.b);
        }
        anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        apxu[] apxuArr = this.d;
        if (apxuArr != null && apxuArr.length > 0) {
            int i = 0;
            while (true) {
                apxu[] apxuArr2 = this.d;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze2 = apxuArr2[i];
                if (anze2 != null) {
                    computeSerializedSize += anwm.c(6, anze2);
                }
                i++;
            }
        }
        anze = this.frameworkUpdates;
        return anze != null ? computeSerializedSize + anwm.c(777, anze) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 26) {
                atpq atpq = (atpq) aobv.a(atpq.e.getParserForType());
                atpq atpq2 = this.a;
                if (atpq2 != null) {
                    atpp atpp = (atpp) ((anxo) atpq2.toBuilder());
                    atpp.mergeFrom(atpq);
                    atpq = (atpq) ((anxl) atpp.build());
                }
                this.a = atpq;
            } else if (a == 34) {
                this.b = aobv.e();
            } else if (a == 42) {
                atqm atqm = (atqm) aobv.a(atqm.c.getParserForType());
                atqm atqm2 = this.c;
                if (atqm2 != null) {
                    atql atql = (atql) ((anxo) atqm2.toBuilder());
                    atql.mergeFrom(atqm);
                    atqm = (atqm) ((anxl) atql.build());
                }
                this.c = atqm;
            } else if (a == 50) {
                a = aock.a(aobv, 50);
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
