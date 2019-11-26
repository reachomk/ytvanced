package defpackage;

import java.util.Arrays;

/* renamed from: akba */
public final class akba extends ajwo {
    public akaz a = null;
    private String b;
    private arwf c;
    private boolean d = false;
    private String e;
    private byte[] f;

    public akba() {
        super(64172177);
        String str = "";
        this.b = str;
        this.e = str;
        this.f = aock.c;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akba) {
            akba akba = (akba) obj;
            String str = this.b;
            if (str == null) {
                if (akba.b != null) {
                    return false;
                }
            } else if (!str.equals(akba.b)) {
                return false;
            }
            arwf arwf = this.c;
            if (arwf == null) {
                if (akba.c != null) {
                    return false;
                }
            } else if (!arwf.equals(akba.c)) {
                return false;
            }
            if (this.d == akba.d) {
                akaz akaz = this.a;
                if (akaz == null) {
                    if (akba.a != null) {
                        return false;
                    }
                } else if (!akaz.equals(akba.a)) {
                    return false;
                }
                str = this.e;
                if (str == null) {
                    if (akba.e != null) {
                        return false;
                    }
                } else if (!str.equals(akba.e)) {
                    return false;
                }
                if (Arrays.equals(this.f, akba.f)) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(akba.unknownFieldData);
                    }
                    aocb aocb2 = akba.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        arwf arwf = this.c;
        hashCode = (((hashCode + hashCode2) * 31) + (arwf != null ? arwf.hashCode() : 0)) * 31;
        hashCode2 = !this.d ? 1237 : 1231;
        akaz akaz = this.a;
        hashCode = (((hashCode + hashCode2) * 31) + (akaz != null ? akaz.hashCode() : 0)) * 31;
        str = this.e;
        hashCode = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(1, this.b);
        }
        anze anze = this.c;
        if (anze != null) {
            aoby.a(2, anze);
        }
        if (this.d) {
            aoby.a(3, true);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            aoby.a(4, aocf);
        }
        str = this.e;
        if (!(str == null || str.equals(str2))) {
            aoby.a(5, this.e);
        }
        if (!Arrays.equals(this.f, aock.c)) {
            aoby.a(7, this.f);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.b;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(1, this.b);
        }
        anze anze = this.c;
        if (anze != null) {
            computeSerializedSize += anwm.c(2, anze);
        }
        if (this.d) {
            computeSerializedSize += aoby.d(3);
        }
        aocf aocf = this.a;
        if (aocf != null) {
            computeSerializedSize += aoby.b(4, aocf);
        }
        str = this.e;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(5, this.e);
        }
        return !Arrays.equals(this.f, aock.c) ? computeSerializedSize + aoby.b(7, this.f) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            } else if (a == 10) {
                this.b = aobv.d();
            } else if (a == 18) {
                arwf arwf = (arwf) aobv.a(arwf.c.getParserForType());
                arwf arwf2 = this.c;
                if (arwf2 != null) {
                    arwe arwe = (arwe) ((anxo) arwf2.toBuilder());
                    arwe.mergeFrom(arwf);
                    arwf = (arwf) ((anxl) arwe.build());
                }
                this.c = arwf;
            } else if (a == 24) {
                this.d = aobv.c();
            } else if (a == 34) {
                if (this.a == null) {
                    this.a = new akaz();
                }
                aobv.a(this.a);
            } else if (a == 42) {
                this.e = aobv.d();
            } else if (a == 58) {
                this.f = aobv.e();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
