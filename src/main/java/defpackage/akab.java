package defpackage;

import java.util.Arrays;

/* renamed from: akab */
public final class akab extends ajwo {
    public static final aobz a = aobz.a(akab.class, 395198378);
    public akad[] b;
    public axfd[] c;
    public byte[] d;
    public akae e;
    public axex f;
    public axev g;
    public axet h;
    public boolean i;

    public akab() {
        super(49399797);
        if (akad.a == null) {
            synchronized (aocd.b) {
                if (akad.a == null) {
                    akad.a = new akad[0];
                }
            }
        }
        this.b = akad.a;
        this.c = new axfd[0];
        this.d = aock.c;
        this.e = null;
        this.i = false;
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akab) {
            akab akab = (akab) obj;
            if (aocd.a(this.b, akab.b) && aocd.a(this.c, akab.c) && Arrays.equals(this.d, akab.d)) {
                akae akae = this.e;
                if (akae == null) {
                    if (akab.e != null) {
                        return false;
                    }
                } else if (!akae.equals(akab.e)) {
                    return false;
                }
                axex axex = this.f;
                if (axex == null) {
                    if (akab.f != null) {
                        return false;
                    }
                } else if (!axex.equals(akab.f)) {
                    return false;
                }
                axev axev = this.g;
                if (axev == null) {
                    if (akab.g != null) {
                        return false;
                    }
                } else if (!axev.equals(akab.g)) {
                    return false;
                }
                axet axet = this.h;
                if (axet == null) {
                    if (akab.h != null) {
                        return false;
                    }
                } else if (!axet.equals(akab.h)) {
                    return false;
                }
                if (this.i == akab.i) {
                    aocb aocb = this.unknownFieldData;
                    if (aocb != null && !aocb.b()) {
                        return this.unknownFieldData.equals(akab.unknownFieldData);
                    }
                    aocb aocb2 = akab.unknownFieldData;
                    return aocb2 == null || aocb2.b();
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = getClass().getName().hashCode();
        int a = aocd.a(this.b);
        int a2 = aocd.a(this.c);
        int hashCode2 = Arrays.hashCode(this.d);
        akae akae = this.e;
        hashCode = (((((((hashCode + 527) * 31) + a) * 31) + a2) * 31) + hashCode2) * 31;
        a = 0;
        a2 = akae != null ? akae.hashCode() : 0;
        axex axex = this.f;
        hashCode = (hashCode + a2) * 31;
        a2 = axex != null ? axex.hashCode() : 0;
        axev axev = this.g;
        hashCode = (hashCode + a2) * 31;
        a2 = axev != null ? axev.hashCode() : 0;
        axet axet = this.h;
        hashCode = (((((hashCode + a2) * 31) + (axet != null ? axet.hashCode() : 0)) * 31) + (!this.i ? 1237 : 1231)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            a = this.unknownFieldData.hashCode();
        }
        return hashCode + a;
    }

    public final void writeTo(aoby aoby) {
        anze anze;
        akad[] akadArr = this.b;
        int i = 0;
        if (akadArr != null && akadArr.length > 0) {
            int i2 = 0;
            while (true) {
                akad[] akadArr2 = this.b;
                if (i2 >= akadArr2.length) {
                    break;
                }
                aocf aocf = akadArr2[i2];
                if (aocf != null) {
                    aoby.a(1, aocf);
                }
                i2++;
            }
        }
        axfd[] axfdArr = this.c;
        if (axfdArr != null && axfdArr.length > 0) {
            while (true) {
                axfdArr = this.c;
                if (i >= axfdArr.length) {
                    break;
                }
                anze = axfdArr[i];
                if (anze != null) {
                    aoby.a(2, anze);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.d, aock.c)) {
            aoby.a(4, this.d);
        }
        aocf aocf2 = this.e;
        if (aocf2 != null) {
            aoby.a(5, aocf2);
        }
        anze = this.f;
        if (anze != null) {
            aoby.a(6, anze);
        }
        anze = this.g;
        if (anze != null) {
            aoby.a(7, anze);
        }
        anze = this.h;
        if (anze != null) {
            aoby.a(8, anze);
        }
        if (this.i) {
            aoby.a(9, true);
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        anze anze;
        int computeSerializedSize = super.computeSerializedSize();
        akad[] akadArr = this.b;
        int i = 0;
        if (akadArr != null && akadArr.length > 0) {
            int i2 = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                akad[] akadArr2 = this.b;
                if (computeSerializedSize >= akadArr2.length) {
                    break;
                }
                aocf aocf = akadArr2[computeSerializedSize];
                if (aocf != null) {
                    i2 += aoby.b(1, aocf);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i2;
        }
        axfd[] axfdArr = this.c;
        if (axfdArr != null && axfdArr.length > 0) {
            while (true) {
                axfdArr = this.c;
                if (i >= axfdArr.length) {
                    break;
                }
                anze = axfdArr[i];
                if (anze != null) {
                    computeSerializedSize += anwm.c(2, anze);
                }
                i++;
            }
        }
        if (!Arrays.equals(this.d, aock.c)) {
            computeSerializedSize += aoby.b(4, this.d);
        }
        aocf aocf2 = this.e;
        if (aocf2 != null) {
            computeSerializedSize += aoby.b(5, aocf2);
        }
        anze = this.f;
        if (anze != null) {
            computeSerializedSize += anwm.c(6, anze);
        }
        anze = this.g;
        if (anze != null) {
            computeSerializedSize += anwm.c(7, anze);
        }
        anze = this.h;
        if (anze != null) {
            computeSerializedSize += anwm.c(8, anze);
        }
        return this.i ? computeSerializedSize + aoby.d(9) : computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            int length;
            if (a == 0) {
                break;
            } else if (a == 10) {
                aocf akad;
                a = aock.a(aobv, 10);
                akad[] akadArr = this.b;
                length = akadArr != null ? akadArr.length : 0;
                akad[] akadArr2 = new akad[(a + length)];
                if (length != 0) {
                    System.arraycopy(akadArr, 0, akadArr2, 0, length);
                }
                while (length < akadArr2.length - 1) {
                    akad = new akad();
                    akadArr2[length] = akad;
                    aobv.a(akad);
                    aobv.a();
                    length++;
                }
                akad = new akad();
                akadArr2[length] = akad;
                aobv.a(akad);
                this.b = akadArr2;
            } else if (a == 18) {
                a = aock.a(aobv, 18);
                axfd[] axfdArr = this.c;
                length = axfdArr != null ? axfdArr.length : 0;
                axfd[] axfdArr2 = new axfd[(a + length)];
                if (length != 0) {
                    System.arraycopy(axfdArr, 0, axfdArr2, 0, length);
                }
                while (length < axfdArr2.length - 1) {
                    axfdArr2[length] = (axfd) aobv.a(axfd.g.getParserForType());
                    aobv.a();
                    length++;
                }
                axfdArr2[length] = (axfd) aobv.a(axfd.g.getParserForType());
                this.c = axfdArr2;
            } else if (a == 34) {
                this.d = aobv.e();
            } else if (a == 42) {
                if (this.e == null) {
                    this.e = new akae();
                }
                aobv.a(this.e);
            } else if (a == 50) {
                axex axex = (axex) aobv.a(axex.c.getParserForType());
                axex axex2 = this.f;
                if (axex2 != null) {
                    axew axew = (axew) ((anxo) axex2.toBuilder());
                    axew.mergeFrom(axex);
                    axex = (axex) ((anxl) axew.build());
                }
                this.f = axex;
            } else if (a == 58) {
                axev axev = (axev) aobv.a(axev.c.getParserForType());
                axev axev2 = this.g;
                if (axev2 != null) {
                    axeu axeu = (axeu) ((anxo) axev2.toBuilder());
                    axeu.mergeFrom(axev);
                    axev = (axev) ((anxl) axeu.build());
                }
                this.g = axev;
            } else if (a == 66) {
                axet axet = (axet) aobv.a(axet.c.getParserForType());
                axet axet2 = this.h;
                if (axet2 != null) {
                    axes axes = (axes) ((anxo) axet2.toBuilder());
                    axes.mergeFrom(axet);
                    axet = (axet) ((anxl) axes.build());
                }
                this.h = axet;
            } else if (a == 72) {
                this.i = aobv.c();
            } else if (!super.storeUnknownField(aobv, a)) {
                break;
            }
        }
        return this;
    }
}
