package defpackage;

import java.util.Arrays;

/* renamed from: ajxh */
public final class ajxh extends ajwo {
    public avdp a;
    public ajxk[] b;
    public byte[] c;
    public avdn d;
    public avdv e;
    private int f;

    public ajxh() {
        super(120770929);
        if (ajxk.a == null) {
            synchronized (aocd.b) {
                if (ajxk.a == null) {
                    ajxk.a = new ajxk[0];
                }
            }
        }
        this.b = ajxk.a;
        this.c = aock.c;
        this.f = 1;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajxh) {
            ajxh ajxh = (ajxh) obj;
            avdp avdp = this.a;
            if (avdp == null) {
                if (ajxh.a != null) {
                    return false;
                }
            } else if (!avdp.equals(ajxh.a)) {
                return false;
            }
            if (aocd.a(this.b, ajxh.b) && Arrays.equals(this.c, ajxh.c)) {
                avdn avdn = this.d;
                if (avdn == null) {
                    if (ajxh.d != null) {
                        return false;
                    }
                } else if (!avdn.equals(ajxh.d)) {
                    return false;
                }
                avdv avdv = this.e;
                if (avdv == null) {
                    if (ajxh.e != null) {
                        return false;
                    }
                } else if (!avdv.equals(ajxh.e)) {
                    return false;
                }
                if (this.f == ajxh.f) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(ajxh.unknownFieldData);
                    }
                    aocb aocb2 = ajxh.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        avdp avdp = this.a;
        hashCode = (hashCode + 527) * 31;
        int i = 0;
        int hashCode2 = avdp != null ? avdp.hashCode() : 0;
        int a = aocd.a(this.b);
        int hashCode3 = Arrays.hashCode(this.c);
        avdn avdn = this.d;
        hashCode = (((((hashCode + hashCode2) * 31) + a) * 31) + hashCode3) * 31;
        hashCode2 = avdn != null ? avdn.hashCode() : 0;
        avdv avdv = this.e;
        hashCode = (((hashCode + hashCode2) * 31) + (avdv != null ? avdv.hashCode() : 0)) * 31;
        hashCode2 = this.f;
        if (hashCode2 == 0) {
            hashCode2 = 0;
        }
        hashCode = (hashCode + hashCode2) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        anze anze = this.a;
        if (anze != null) {
            aoby.a(1, anze);
        }
        ajxk[] ajxkArr = this.b;
        if (ajxkArr != null && ajxkArr.length > 0) {
            i = 0;
            while (true) {
                ajxk[] ajxkArr2 = this.b;
                if (i >= ajxkArr2.length) {
                    break;
                }
                aocf aocf = ajxkArr2[i];
                if (aocf != null) {
                    aoby.a(2, aocf);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.c, aock.c)) {
            aoby.a(4, this.c);
        }
        anze = this.d;
        if (anze != null) {
            aoby.a(5, anze);
        }
        anze = this.e;
        if (anze != null) {
            aoby.a(6, anze);
        }
        i = this.f;
        if (!(i == 1 || i == 0)) {
            aoby.a(7, i - 1);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        int computeSerializedSize = super.computeSerializedSize();
        anze anze = this.a;
        if (anze != null) {
            computeSerializedSize += anwm.c(1, anze);
        }
        ajxk[] ajxkArr = this.b;
        if (ajxkArr != null && ajxkArr.length > 0) {
            i = 0;
            while (true) {
                ajxk[] ajxkArr2 = this.b;
                if (i >= ajxkArr2.length) {
                    break;
                }
                aocf aocf = ajxkArr2[i];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(2, aocf);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.c, aock.c)) {
            computeSerializedSize += aoby.b(4, this.c);
        }
        anze = this.d;
        if (anze != null) {
            computeSerializedSize += anwm.c(5, anze);
        }
        anze = this.e;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        i = this.f;
        return (i == 1 || i == 0) ? computeSerializedSize : computeSerializedSize + aoby.c(7, i - 1);
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            if (a == 0) {
                break;
            }
            int i = 10;
            int length;
            if (a == 10) {
                avdp avdp = (avdp) aobv.a(avdp.c.getParserForType());
                avdp avdp2 = this.a;
                if (avdp2 != null) {
                    avds avds = (avds) ((anxo) avdp2.toBuilder());
                    avds.mergeFrom(avdp);
                    avdp = (avdp) ((anxl) avds.build());
                }
                this.a = avdp;
            } else if (a == 18) {
                aocf ajxk;
                a = aock.a(aobv, 18);
                ajxk[] ajxkArr = this.b;
                length = ajxkArr != null ? ajxkArr.length : 0;
                ajxk[] ajxkArr2 = new ajxk[(a + length)];
                if (length != 0) {
                    System.arraycopy(ajxkArr, 0, ajxkArr2, 0, length);
                }
                while (length < ajxkArr2.length - 1) {
                    ajxk = new ajxk();
                    ajxkArr2[length] = ajxk;
                    aobv.a(ajxk);
                    aobv.a();
                    length++;
                }
                ajxk = new ajxk();
                ajxkArr2[length] = ajxk;
                aobv.a(ajxk);
                this.b = ajxkArr2;
            } else if (a == 34) {
                this.c = aobv.e();
            } else if (a == 42) {
                avdn avdn = (avdn) aobv.a(avdn.c.getParserForType());
                avdn avdn2 = this.d;
                if (avdn2 != null) {
                    avdq avdq = (avdq) ((anxo) avdn2.toBuilder());
                    avdq.mergeFrom(avdn);
                    avdn = (avdn) ((anxl) avdq.build());
                }
                this.d = avdn;
            } else if (a != 50) {
                if (a == 56) {
                    length = aobv.b;
                    int f = aobv.f();
                    switch (f) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            switch (f) {
                                case 0:
                                    i = 1;
                                    break;
                                case 1:
                                    i = 2;
                                    break;
                                case 2:
                                    i = 3;
                                    break;
                                case 3:
                                    i = 4;
                                    break;
                                case 4:
                                    i = 5;
                                    break;
                                case 5:
                                    i = 6;
                                    break;
                                case 6:
                                    i = 7;
                                    break;
                                case 7:
                                    i = 8;
                                    break;
                                case 8:
                                    i = 9;
                                    break;
                                case 9:
                                    break;
                                case 10:
                                    i = 11;
                                    break;
                                default:
                                    i = 0;
                                    break;
                            }
                            this.f = i;
                            break;
                        default:
                            aobv.e(length);
                            storeUnknownField(aobv, a);
                            break;
                    }
                } else if (!super.storeUnknownField(aobv, a)) {
                    break;
                }
            } else {
                avdv avdv = (avdv) aobv.a(avdv.c.getParserForType());
                avdv avdv2 = this.e;
                if (avdv2 != null) {
                    avdy avdy = (avdy) ((anxo) avdv2.toBuilder());
                    avdy.mergeFrom(avdv);
                    avdv = (avdv) ((anxl) avdy.build());
                }
                this.e = avdv;
            }
        }
        return this;
    }
}
