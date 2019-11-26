package defpackage;

import java.util.Arrays;

/* renamed from: ajxx */
public final class ajxx extends ajwo {
    public arml A;
    public arml B;
    public aygk C;
    public boolean D;
    public ajzw E;
    public ajzw F;
    public ajzw[] G;
    private apxu H;
    private arml J;
    private awid K;
    private boolean L = false;
    private boolean M = false;
    private apxu N;
    private apxu O;
    private apxu[] P = new apxu[0];
    private arml Q;
    private arml R;
    private arml S;
    private apxu T;
    private arml U;
    private arml[] V;
    private arml[] W;
    private apxu X;
    private apxu Y;
    private boolean Z;
    public String a;
    private boolean aa;
    private apxu ab;
    private ajzw ac;
    private ajzw ad;
    private ajzw ae;
    private ajzw af;
    public arml b;
    public aygk c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public awir h;
    public atzt i;
    public awnx j = awnx.PRIVATE;
    public apxu k;
    public awib l;
    public awin m;
    public byte[] n = aock.c;
    public String o;
    public awkv p;
    public apxu q;
    public awif r;
    public aphj s;
    public awip t;
    public ajxt u;
    public awih v;
    public awij w;
    public awil x;
    public atzm y;
    public aphj z;

    public ajxx() {
        super(53272665);
        String str = "";
        this.a = str;
        this.o = str;
        this.V = new arml[0];
        this.W = new arml[0];
        this.Z = false;
        this.u = null;
        this.aa = false;
        this.D = false;
        this.ac = null;
        this.E = null;
        this.ad = null;
        this.ae = null;
        this.F = null;
        this.af = null;
        this.G = ajzw.a();
        this.cachedSize = -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajxx) {
            ajxx ajxx = (ajxx) obj;
            String str = this.a;
            if (str == null) {
                if (ajxx.a != null) {
                    return false;
                }
            } else if (!str.equals(ajxx.a)) {
                return false;
            }
            apxu apxu = this.H;
            if (apxu == null) {
                if (ajxx.H != null) {
                    return false;
                }
            } else if (!apxu.equals(ajxx.H)) {
                return false;
            }
            arml arml = this.b;
            if (arml == null) {
                if (ajxx.b != null) {
                    return false;
                }
            } else if (!arml.equals(ajxx.b)) {
                return false;
            }
            aygk aygk = this.c;
            if (aygk == null) {
                if (ajxx.c != null) {
                    return false;
                }
            } else if (!aygk.equals(ajxx.c)) {
                return false;
            }
            arml = this.d;
            if (arml == null) {
                if (ajxx.d != null) {
                    return false;
                }
            } else if (!arml.equals(ajxx.d)) {
                return false;
            }
            arml = this.e;
            if (arml == null) {
                if (ajxx.e != null) {
                    return false;
                }
            } else if (!arml.equals(ajxx.e)) {
                return false;
            }
            arml = this.f;
            if (arml == null) {
                if (ajxx.f != null) {
                    return false;
                }
            } else if (!arml.equals(ajxx.f)) {
                return false;
            }
            arml = this.g;
            if (arml == null) {
                if (ajxx.g != null) {
                    return false;
                }
            } else if (!arml.equals(ajxx.g)) {
                return false;
            }
            arml = this.J;
            if (arml == null) {
                if (ajxx.J != null) {
                    return false;
                }
            } else if (!arml.equals(ajxx.J)) {
                return false;
            }
            awid awid = this.K;
            if (awid == null) {
                if (ajxx.K != null) {
                    return false;
                }
            } else if (!awid.equals(ajxx.K)) {
                return false;
            }
            awir awir = this.h;
            if (awir == null) {
                if (ajxx.h != null) {
                    return false;
                }
            } else if (!awir.equals(ajxx.h)) {
                return false;
            }
            if (this.L == ajxx.L && this.M == ajxx.M) {
                atzt atzt = this.i;
                if (atzt == null) {
                    if (ajxx.i != null) {
                        return false;
                    }
                } else if (!atzt.equals(ajxx.i)) {
                    return false;
                }
                if (this.j == ajxx.j) {
                    apxu = this.k;
                    if (apxu == null) {
                        if (ajxx.k != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajxx.k)) {
                        return false;
                    }
                    awib awib = this.l;
                    if (awib == null) {
                        if (ajxx.l != null) {
                            return false;
                        }
                    } else if (!awib.equals(ajxx.l)) {
                        return false;
                    }
                    apxu = this.N;
                    if (apxu == null) {
                        if (ajxx.N != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajxx.N)) {
                        return false;
                    }
                    awin awin = this.m;
                    if (awin == null) {
                        if (ajxx.m != null) {
                            return false;
                        }
                    } else if (!awin.equals(ajxx.m)) {
                        return false;
                    }
                    apxu = this.O;
                    if (apxu == null) {
                        if (ajxx.O != null) {
                            return false;
                        }
                    } else if (!apxu.equals(ajxx.O)) {
                        return false;
                    }
                    if (Arrays.equals(this.n, ajxx.n) && aocd.a(this.P, ajxx.P)) {
                        arml = this.Q;
                        if (arml == null) {
                            if (ajxx.Q != null) {
                                return false;
                            }
                        } else if (!arml.equals(ajxx.Q)) {
                            return false;
                        }
                        arml = this.R;
                        if (arml == null) {
                            if (ajxx.R != null) {
                                return false;
                            }
                        } else if (!arml.equals(ajxx.R)) {
                            return false;
                        }
                        arml = this.S;
                        if (arml == null) {
                            if (ajxx.S != null) {
                                return false;
                            }
                        } else if (!arml.equals(ajxx.S)) {
                            return false;
                        }
                        apxu = this.T;
                        if (apxu == null) {
                            if (ajxx.T != null) {
                                return false;
                            }
                        } else if (!apxu.equals(ajxx.T)) {
                            return false;
                        }
                        arml = this.U;
                        if (arml == null) {
                            if (ajxx.U != null) {
                                return false;
                            }
                        } else if (!arml.equals(ajxx.U)) {
                            return false;
                        }
                        str = this.o;
                        if (str == null) {
                            if (ajxx.o != null) {
                                return false;
                            }
                        } else if (!str.equals(ajxx.o)) {
                            return false;
                        }
                        awkv awkv = this.p;
                        if (awkv == null) {
                            if (ajxx.p != null) {
                                return false;
                            }
                        } else if (!awkv.equals(ajxx.p)) {
                            return false;
                        }
                        if (aocd.a(this.V, ajxx.V) && aocd.a(this.W, ajxx.W)) {
                            apxu = this.X;
                            if (apxu == null) {
                                if (ajxx.X != null) {
                                    return false;
                                }
                            } else if (!apxu.equals(ajxx.X)) {
                                return false;
                            }
                            apxu = this.Y;
                            if (apxu == null) {
                                if (ajxx.Y != null) {
                                    return false;
                                }
                            } else if (!apxu.equals(ajxx.Y)) {
                                return false;
                            }
                            apxu = this.q;
                            if (apxu == null) {
                                if (ajxx.q != null) {
                                    return false;
                                }
                            } else if (!apxu.equals(ajxx.q)) {
                                return false;
                            }
                            if (this.Z == ajxx.Z) {
                                awif awif = this.r;
                                if (awif == null) {
                                    if (ajxx.r != null) {
                                        return false;
                                    }
                                } else if (!awif.equals(ajxx.r)) {
                                    return false;
                                }
                                aphj aphj = this.s;
                                if (aphj == null) {
                                    if (ajxx.s != null) {
                                        return false;
                                    }
                                } else if (!aphj.equals(ajxx.s)) {
                                    return false;
                                }
                                awip awip = this.t;
                                if (awip == null) {
                                    if (ajxx.t != null) {
                                        return false;
                                    }
                                } else if (!awip.equals(ajxx.t)) {
                                    return false;
                                }
                                ajxt ajxt = this.u;
                                if (ajxt == null) {
                                    if (ajxx.u != null) {
                                        return false;
                                    }
                                } else if (!ajxt.equals(ajxx.u)) {
                                    return false;
                                }
                                awih awih = this.v;
                                if (awih == null) {
                                    if (ajxx.v != null) {
                                        return false;
                                    }
                                } else if (!awih.equals(ajxx.v)) {
                                    return false;
                                }
                                if (this.aa == ajxx.aa) {
                                    awij awij = this.w;
                                    if (awij == null) {
                                        if (ajxx.w != null) {
                                            return false;
                                        }
                                    } else if (!awij.equals(ajxx.w)) {
                                        return false;
                                    }
                                    apxu = this.ab;
                                    if (apxu == null) {
                                        if (ajxx.ab != null) {
                                            return false;
                                        }
                                    } else if (!apxu.equals(ajxx.ab)) {
                                        return false;
                                    }
                                    awil awil = this.x;
                                    if (awil == null) {
                                        if (ajxx.x != null) {
                                            return false;
                                        }
                                    } else if (!awil.equals(ajxx.x)) {
                                        return false;
                                    }
                                    atzm atzm = this.y;
                                    if (atzm == null) {
                                        if (ajxx.y != null) {
                                            return false;
                                        }
                                    } else if (!atzm.equals(ajxx.y)) {
                                        return false;
                                    }
                                    aphj = this.z;
                                    if (aphj == null) {
                                        if (ajxx.z != null) {
                                            return false;
                                        }
                                    } else if (!aphj.equals(ajxx.z)) {
                                        return false;
                                    }
                                    arml = this.A;
                                    if (arml == null) {
                                        if (ajxx.A != null) {
                                            return false;
                                        }
                                    } else if (!arml.equals(ajxx.A)) {
                                        return false;
                                    }
                                    arml = this.B;
                                    if (arml == null) {
                                        if (ajxx.B != null) {
                                            return false;
                                        }
                                    } else if (!arml.equals(ajxx.B)) {
                                        return false;
                                    }
                                    aygk = this.C;
                                    if (aygk == null) {
                                        if (ajxx.C != null) {
                                            return false;
                                        }
                                    } else if (!aygk.equals(ajxx.C)) {
                                        return false;
                                    }
                                    if (this.D == ajxx.D) {
                                        ajzw ajzw = this.ac;
                                        if (ajzw == null) {
                                            if (ajxx.ac != null) {
                                                return false;
                                            }
                                        } else if (!ajzw.equals(ajxx.ac)) {
                                            return false;
                                        }
                                        ajzw = this.E;
                                        if (ajzw == null) {
                                            if (ajxx.E != null) {
                                                return false;
                                            }
                                        } else if (!ajzw.equals(ajxx.E)) {
                                            return false;
                                        }
                                        ajzw = this.ad;
                                        if (ajzw == null) {
                                            if (ajxx.ad != null) {
                                                return false;
                                            }
                                        } else if (!ajzw.equals(ajxx.ad)) {
                                            return false;
                                        }
                                        ajzw = this.ae;
                                        if (ajzw == null) {
                                            if (ajxx.ae != null) {
                                                return false;
                                            }
                                        } else if (!ajzw.equals(ajxx.ae)) {
                                            return false;
                                        }
                                        ajzw = this.F;
                                        if (ajzw == null) {
                                            if (ajxx.F != null) {
                                                return false;
                                            }
                                        } else if (!ajzw.equals(ajxx.F)) {
                                            return false;
                                        }
                                        ajzw = this.af;
                                        if (ajzw == null) {
                                            if (ajxx.af != null) {
                                                return false;
                                            }
                                        } else if (!ajzw.equals(ajxx.af)) {
                                            return false;
                                        }
                                        if (aocd.a(this.G, ajxx.G)) {
                                            aocb aocb = this.unknownFieldData;
                                            if (aocb != null && !aocb.b()) {
                                                return this.unknownFieldData.equals(ajxx.unknownFieldData);
                                            }
                                            aocb aocb2 = ajxx.unknownFieldData;
                                            return aocb2 == null || aocb2.b();
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (getClass().getName().hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        int hashCode2 = str != null ? str.hashCode() : 0;
        apxu apxu = this.H;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu != null ? apxu.hashCode() : 0;
        arml arml = this.b;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        aygk aygk = this.c;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aygk != null ? aygk.hashCode() : 0;
        arml = this.d;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.e;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.f;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.g;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        arml = this.J;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml != null ? arml.hashCode() : 0;
        awid awid = this.K;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awid != null ? awid.hashCode() : 0;
        awir awir = this.h;
        hashCode = (((hashCode + hashCode2) * 31) + (awir != null ? awir.hashCode() : 0)) * 31;
        int i2 = 1237;
        hashCode = (hashCode + (!this.L ? 1237 : 1231)) * 31;
        hashCode2 = !this.M ? 1237 : 1231;
        atzt atzt = this.i;
        hashCode = (((hashCode + hashCode2) * 31) + (atzt != null ? atzt.hashCode() : 0)) * 31;
        awnx awnx = this.j;
        hashCode2 = awnx != null ? awnx.hashCode() : 0;
        apxu apxu2 = this.k;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        awib awib = this.l;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awib != null ? awib.hashCode() : 0;
        apxu2 = this.N;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        awin awin = this.m;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awin != null ? awin.hashCode() : 0;
        apxu2 = this.O;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        int hashCode3 = Arrays.hashCode(this.n);
        int a = aocd.a(this.P);
        arml arml2 = this.Q;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + a) * 31;
        hashCode2 = arml2 != null ? arml2.hashCode() : 0;
        arml arml3 = this.R;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml3 != null ? arml3.hashCode() : 0;
        arml3 = this.S;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml3 != null ? arml3.hashCode() : 0;
        apxu2 = this.T;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        arml3 = this.U;
        hashCode = (((hashCode + hashCode2) * 31) + (arml3 != null ? arml3.hashCode() : 0)) * 31;
        str = this.o;
        hashCode2 = str != null ? str.hashCode() : 0;
        awkv awkv = this.p;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awkv != null ? awkv.hashCode() : 0;
        hashCode3 = aocd.a(this.V);
        a = aocd.a(this.W);
        apxu apxu3 = this.X;
        hashCode = (((((hashCode + hashCode2) * 31) + hashCode3) * 31) + a) * 31;
        hashCode2 = apxu3 != null ? apxu3.hashCode() : 0;
        apxu2 = this.Y;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        apxu2 = this.q;
        hashCode = (((hashCode + hashCode2) * 31) + (apxu2 != null ? apxu2.hashCode() : 0)) * 31;
        hashCode2 = !this.Z ? 1237 : 1231;
        awif awif = this.r;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awif != null ? awif.hashCode() : 0;
        aphj aphj = this.s;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj != null ? aphj.hashCode() : 0;
        awip awip = this.t;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awip != null ? awip.hashCode() : 0;
        ajxt ajxt = this.u;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajxt != null ? ajxt.hashCode() : 0;
        awih awih = this.v;
        hashCode = (((hashCode + hashCode2) * 31) + (awih != null ? awih.hashCode() : 0)) * 31;
        hashCode2 = !this.aa ? 1237 : 1231;
        awij awij = this.w;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awij != null ? awij.hashCode() : 0;
        apxu2 = this.ab;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = apxu2 != null ? apxu2.hashCode() : 0;
        awil awil = this.x;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = awil != null ? awil.hashCode() : 0;
        atzm atzm = this.y;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = atzm != null ? atzm.hashCode() : 0;
        aphj = this.z;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = aphj != null ? aphj.hashCode() : 0;
        arml3 = this.A;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml3 != null ? arml3.hashCode() : 0;
        arml3 = this.B;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = arml3 != null ? arml3.hashCode() : 0;
        aygk aygk2 = this.C;
        hashCode = (((hashCode + hashCode2) * 31) + (aygk2 != null ? aygk2.hashCode() : 0)) * 31;
        if (this.D) {
            i2 = 1231;
        }
        ajzw ajzw = this.ac;
        hashCode = (hashCode + i2) * 31;
        hashCode2 = ajzw != null ? ajzw.hashCode() : 0;
        ajzw ajzw2 = this.E;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        ajzw2 = this.ad;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        ajzw2 = this.ae;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        ajzw2 = this.F;
        hashCode = (hashCode + hashCode2) * 31;
        hashCode2 = ajzw2 != null ? ajzw2.hashCode() : 0;
        ajzw2 = this.af;
        hashCode = (((((hashCode + hashCode2) * 31) + (ajzw2 != null ? ajzw2.hashCode() : 0)) * 31) + aocd.a(this.G)) * 31;
        aocb aocb = this.unknownFieldData;
        if (!(aocb == null || aocb.b())) {
            i = this.unknownFieldData.hashCode();
        }
        return hashCode + i;
    }

    public final void writeTo(aoby aoby) {
        int i;
        arml[] armlArr;
        anze anze;
        String str = this.a;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            aoby.a(1, this.a);
        }
        anze anze2 = this.H;
        if (anze2 != null) {
            aoby.a(2, anze2);
        }
        anze2 = this.b;
        if (anze2 != null) {
            aoby.a(3, anze2);
        }
        anze2 = this.c;
        if (anze2 != null) {
            aoby.a(4, anze2);
        }
        anze2 = this.d;
        if (anze2 != null) {
            aoby.a(5, anze2);
        }
        anze2 = this.e;
        if (anze2 != null) {
            aoby.a(6, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            aoby.a(7, anze2);
        }
        anze2 = this.g;
        if (anze2 != null) {
            aoby.a(8, anze2);
        }
        anze2 = this.J;
        if (anze2 != null) {
            aoby.a(9, anze2);
        }
        anze2 = this.K;
        if (anze2 != null) {
            aoby.a(10, anze2);
        }
        anze2 = this.h;
        if (anze2 != null) {
            aoby.a(11, anze2);
        }
        if (this.L) {
            aoby.a(12, true);
        }
        if (this.M) {
            aoby.a(14, true);
        }
        anze2 = this.i;
        if (anze2 != null) {
            aoby.a(15, anze2);
        }
        if (this.j != awnx.PRIVATE) {
            awnx awnx = this.j;
            if (awnx != null) {
                aoby.a(16, awnx.d);
            }
        }
        anze2 = this.k;
        if (anze2 != null) {
            aoby.a(17, anze2);
        }
        anze2 = this.l;
        if (anze2 != null) {
            aoby.a(18, anze2);
        }
        anze2 = this.N;
        if (anze2 != null) {
            aoby.a(19, anze2);
        }
        anze2 = this.m;
        if (anze2 != null) {
            aoby.a(21, anze2);
        }
        anze2 = this.O;
        if (anze2 != null) {
            aoby.a(22, anze2);
        }
        if (!Arrays.equals(this.n, aock.c)) {
            aoby.a(23, this.n);
        }
        apxu[] apxuArr = this.P;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = 0;
            while (true) {
                apxu[] apxuArr2 = this.P;
                if (i >= apxuArr2.length) {
                    break;
                }
                anze anze3 = apxuArr2[i];
                if (anze3 != null) {
                    aoby.a(24, anze3);
                }
                i++;
            }
        }
        anze2 = this.Q;
        if (anze2 != null) {
            aoby.a(25, anze2);
        }
        anze2 = this.R;
        if (anze2 != null) {
            aoby.a(26, anze2);
        }
        anze2 = this.S;
        if (anze2 != null) {
            aoby.a(27, anze2);
        }
        anze2 = this.T;
        if (anze2 != null) {
            aoby.a(28, anze2);
        }
        anze2 = this.U;
        if (anze2 != null) {
            aoby.a(29, anze2);
        }
        str = this.o;
        if (!(str == null || str.equals(str2))) {
            aoby.a(30, this.o);
        }
        anze2 = this.p;
        if (anze2 != null) {
            aoby.a(31, anze2);
        }
        arml[] armlArr2 = this.V;
        if (armlArr2 != null && armlArr2.length > 0) {
            i = 0;
            while (true) {
                armlArr = this.V;
                if (i >= armlArr.length) {
                    break;
                }
                anze = armlArr[i];
                if (anze != null) {
                    aoby.a(32, anze);
                }
                i++;
            }
        }
        armlArr2 = this.W;
        if (armlArr2 != null && armlArr2.length > 0) {
            i = 0;
            while (true) {
                armlArr = this.W;
                if (i >= armlArr.length) {
                    break;
                }
                anze = armlArr[i];
                if (anze != null) {
                    aoby.a(33, anze);
                }
                i++;
            }
        }
        anze2 = this.X;
        if (anze2 != null) {
            aoby.a(40, anze2);
        }
        anze2 = this.Y;
        if (anze2 != null) {
            aoby.a(41, anze2);
        }
        anze2 = this.q;
        if (anze2 != null) {
            aoby.a(42, anze2);
        }
        if (this.Z) {
            aoby.a(43, true);
        }
        anze2 = this.r;
        if (anze2 != null) {
            aoby.a(44, anze2);
        }
        anze2 = this.s;
        if (anze2 != null) {
            aoby.a(45, anze2);
        }
        anze2 = this.t;
        if (anze2 != null) {
            aoby.a(47, anze2);
        }
        aocf aocf = this.u;
        if (aocf != null) {
            aoby.a(49, aocf);
        }
        anze2 = this.v;
        if (anze2 != null) {
            aoby.a(50, anze2);
        }
        if (this.aa) {
            aoby.a(52, true);
        }
        anze2 = this.w;
        if (anze2 != null) {
            aoby.a(53, anze2);
        }
        anze2 = this.ab;
        if (anze2 != null) {
            aoby.a(54, anze2);
        }
        anze2 = this.x;
        if (anze2 != null) {
            aoby.a(55, anze2);
        }
        anze2 = this.y;
        if (anze2 != null) {
            aoby.a(56, anze2);
        }
        anze2 = this.z;
        if (anze2 != null) {
            aoby.a(57, anze2);
        }
        anze2 = this.A;
        if (anze2 != null) {
            aoby.a(58, anze2);
        }
        anze2 = this.B;
        if (anze2 != null) {
            aoby.a(59, anze2);
        }
        anze2 = this.C;
        if (anze2 != null) {
            aoby.a(61, anze2);
        }
        if (this.D) {
            aoby.a(62, true);
        }
        aocf = this.ac;
        if (aocf != null) {
            aoby.a(63, aocf);
        }
        aocf = this.E;
        if (aocf != null) {
            aoby.a(64, aocf);
        }
        aocf = this.ad;
        if (aocf != null) {
            aoby.a(65, aocf);
        }
        aocf = this.ae;
        if (aocf != null) {
            aoby.a(66, aocf);
        }
        aocf = this.F;
        if (aocf != null) {
            aoby.a(68, aocf);
        }
        aocf = this.af;
        if (aocf != null) {
            aoby.a(69, aocf);
        }
        ajzw[] ajzwArr = this.G;
        if (ajzwArr != null && ajzwArr.length > 0) {
            while (true) {
                ajzwArr = this.G;
                if (i2 >= ajzwArr.length) {
                    break;
                }
                aocf = ajzwArr[i2];
                if (aocf != null) {
                    aoby.a(70, aocf);
                }
                i2++;
            }
        }
        super.writeTo(aoby);
    }

    /* Access modifiers changed, original: protected|final */
    public final int computeSerializedSize() {
        int i;
        arml[] armlArr;
        anze anze;
        int computeSerializedSize = super.computeSerializedSize();
        String str = this.a;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(1, this.a);
        }
        anze anze2 = this.H;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(2, anze2);
        }
        anze2 = this.b;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(3, anze2);
        }
        anze2 = this.c;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(4, anze2);
        }
        anze2 = this.d;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(5, anze2);
        }
        anze2 = this.e;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(6, anze2);
        }
        anze2 = this.f;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(7, anze2);
        }
        anze2 = this.g;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(8, anze2);
        }
        anze2 = this.J;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(9, anze2);
        }
        anze2 = this.K;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(10, anze2);
        }
        anze2 = this.h;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(11, anze2);
        }
        if (this.L) {
            computeSerializedSize += aoby.d(12);
        }
        if (this.M) {
            computeSerializedSize += aoby.d(14);
        }
        anze2 = this.i;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(15, anze2);
        }
        if (this.j != awnx.PRIVATE) {
            awnx awnx = this.j;
            if (awnx != null) {
                computeSerializedSize += aoby.c(16, awnx.d);
            }
        }
        anze2 = this.k;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(17, anze2);
        }
        anze2 = this.l;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(18, anze2);
        }
        anze2 = this.N;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(19, anze2);
        }
        anze2 = this.m;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(21, anze2);
        }
        anze2 = this.O;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(22, anze2);
        }
        if (!Arrays.equals(this.n, aock.c)) {
            computeSerializedSize += aoby.b(23, this.n);
        }
        apxu[] apxuArr = this.P;
        int i2 = 0;
        if (apxuArr != null && apxuArr.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                apxu[] apxuArr2 = this.P;
                if (computeSerializedSize >= apxuArr2.length) {
                    break;
                }
                anze anze3 = apxuArr2[computeSerializedSize];
                if (anze3 != null) {
                    i += anwm.c(24, anze3);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze2 = this.Q;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(25, anze2);
        }
        anze2 = this.R;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(26, anze2);
        }
        anze2 = this.S;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(27, anze2);
        }
        anze2 = this.T;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(28, anze2);
        }
        anze2 = this.U;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(29, anze2);
        }
        str = this.o;
        if (!(str == null || str.equals(str2))) {
            computeSerializedSize += aoby.b(30, this.o);
        }
        anze2 = this.p;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(31, anze2);
        }
        arml[] armlArr2 = this.V;
        if (armlArr2 != null && armlArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                armlArr = this.V;
                if (computeSerializedSize >= armlArr.length) {
                    break;
                }
                anze = armlArr[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(32, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        armlArr2 = this.W;
        if (armlArr2 != null && armlArr2.length > 0) {
            i = computeSerializedSize;
            computeSerializedSize = 0;
            while (true) {
                armlArr = this.W;
                if (computeSerializedSize >= armlArr.length) {
                    break;
                }
                anze = armlArr[computeSerializedSize];
                if (anze != null) {
                    i += anwm.c(33, anze);
                }
                computeSerializedSize++;
            }
            computeSerializedSize = i;
        }
        anze2 = this.X;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(40, anze2);
        }
        anze2 = this.Y;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(41, anze2);
        }
        anze2 = this.q;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(42, anze2);
        }
        if (this.Z) {
            computeSerializedSize += aoby.d(43);
        }
        anze2 = this.r;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(44, anze2);
        }
        anze2 = this.s;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(45, anze2);
        }
        anze2 = this.t;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(47, anze2);
        }
        aocf aocf = this.u;
        if (aocf != null) {
            computeSerializedSize += aoby.b(49, aocf);
        }
        anze2 = this.v;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(50, anze2);
        }
        if (this.aa) {
            computeSerializedSize += aoby.d(52);
        }
        anze2 = this.w;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(53, anze2);
        }
        anze2 = this.ab;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(54, anze2);
        }
        anze2 = this.x;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(55, anze2);
        }
        anze2 = this.y;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(56, anze2);
        }
        anze2 = this.z;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(57, anze2);
        }
        anze2 = this.A;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(58, anze2);
        }
        anze2 = this.B;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(59, anze2);
        }
        anze2 = this.C;
        if (anze2 != null) {
            computeSerializedSize += anwm.c(61, anze2);
        }
        if (this.D) {
            computeSerializedSize += aoby.d(62);
        }
        aocf = this.ac;
        if (aocf != null) {
            computeSerializedSize += aoby.b(63, aocf);
        }
        aocf = this.E;
        if (aocf != null) {
            computeSerializedSize += aoby.b(64, aocf);
        }
        aocf = this.ad;
        if (aocf != null) {
            computeSerializedSize += aoby.b(65, aocf);
        }
        aocf = this.ae;
        if (aocf != null) {
            computeSerializedSize += aoby.b(66, aocf);
        }
        aocf = this.F;
        if (aocf != null) {
            computeSerializedSize += aoby.b(68, aocf);
        }
        aocf = this.af;
        if (aocf != null) {
            computeSerializedSize += aoby.b(69, aocf);
        }
        ajzw[] ajzwArr = this.G;
        if (ajzwArr != null && ajzwArr.length > 0) {
            while (true) {
                ajzwArr = this.G;
                if (i2 >= ajzwArr.length) {
                    break;
                }
                aocf = ajzwArr[i2];
                if (aocf != null) {
                    computeSerializedSize += aoby.b(70, aocf);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    public final /* synthetic */ aocf mergeFrom(aobv aobv) {
        while (true) {
            int a = aobv.a();
            apxu apxu;
            apxu apxu2;
            apxx apxx;
            arml arml;
            arml arml2;
            armk armk;
            aygk aygk;
            aygk aygk2;
            aygj aygj;
            int length;
            arml[] armlArr;
            arml[] armlArr2;
            aphj aphj;
            aphj aphj2;
            aphm aphm;
            switch (a) {
                case 0:
                    break;
                case 10:
                    this.a = aobv.d();
                    continue;
                case 18:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.H;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.H = apxu;
                    continue;
                case 26:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.b;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.b = arml;
                    continue;
                case 34:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.c;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.c = aygk;
                    continue;
                case 42:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.d;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.d = arml;
                    continue;
                case cv.aU /*50*/:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.e;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.e = arml;
                    continue;
                case 58:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.f;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.f = arml;
                    continue;
                case 66:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.g;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.g = arml;
                    continue;
                case 74:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.J;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.J = arml;
                    continue;
                case 82:
                    awid awid = (awid) aobv.a(awid.a.getParserForType());
                    awid awid2 = this.K;
                    if (awid2 != null) {
                        awic awic = (awic) ((anxo) awid2.toBuilder());
                        awic.mergeFrom(awid);
                        awid = (awid) ((anxl) awic.build());
                    }
                    this.K = awid;
                    continue;
                case 90:
                    awir awir = (awir) aobv.a(awir.c.getParserForType());
                    awir awir2 = this.h;
                    if (awir2 != null) {
                        awiq awiq = (awiq) ((anxo) awir2.toBuilder());
                        awiq.mergeFrom(awir);
                        awir = (awir) ((anxl) awiq.build());
                    }
                    this.h = awir;
                    continue;
                case 96:
                    this.L = aobv.c();
                    continue;
                case 112:
                    this.M = aobv.c();
                    continue;
                case afy.av /*122*/:
                    atzt atzt = (atzt) aobv.a(atzt.c.getParserForType());
                    atzt atzt2 = this.i;
                    if (atzt2 != null) {
                        atzs atzs = (atzs) ((anxo) atzt2.toBuilder());
                        atzs.mergeFrom(atzt);
                        atzt = (atzt) ((anxl) atzs.build());
                    }
                    this.i = atzt;
                    continue;
                case 128:
                    int i = aobv.b;
                    int f = aobv.f();
                    if (f == 0 || f == 1 || f == 2 || f == 3) {
                        this.j = awnx.a(f);
                        break;
                    }
                    aobv.e(i);
                    storeUnknownField(aobv, a);
                    continue;
                case 138:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.k;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.k = apxu;
                    continue;
                case 146:
                    awib awib = (awib) aobv.a(awib.c.getParserForType());
                    awib awib2 = this.l;
                    if (awib2 != null) {
                        awia awia = (awia) ((anxo) awib2.toBuilder());
                        awia.mergeFrom(awib);
                        awib = (awib) ((anxl) awia.build());
                    }
                    this.l = awib;
                    continue;
                case 154:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.N;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.N = apxu;
                    continue;
                case 170:
                    awin awin = (awin) aobv.a(awin.c.getParserForType());
                    awin awin2 = this.m;
                    if (awin2 != null) {
                        awim awim = (awim) ((anxo) awin2.toBuilder());
                        awim.mergeFrom(awin);
                        awin = (awin) ((anxl) awim.build());
                    }
                    this.m = awin;
                    continue;
                case 178:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.O;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.O = apxu;
                    continue;
                case 186:
                    this.n = aobv.e();
                    continue;
                case 194:
                    a = aock.a(aobv, 194);
                    apxu[] apxuArr = this.P;
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
                    this.P = apxuArr2;
                    continue;
                case 202:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.Q;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.Q = arml;
                    continue;
                case 210:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.R;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.R = arml;
                    continue;
                case 218:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.S;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.S = arml;
                    continue;
                case 226:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.T;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.T = apxu;
                    continue;
                case 234:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.U;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.U = arml;
                    continue;
                case 242:
                    this.o = aobv.d();
                    continue;
                case 250:
                    awkv awkv = (awkv) aobv.a(awkv.d.getParserForType());
                    awkv awkv2 = this.p;
                    if (awkv2 != null) {
                        awku awku = (awku) ((anxo) awkv2.toBuilder());
                        awku.mergeFrom(awkv);
                        awkv = (awkv) ((anxl) awku.build());
                    }
                    this.p = awkv;
                    continue;
                case 258:
                    a = aock.a(aobv, 258);
                    armlArr = this.V;
                    length = armlArr != null ? armlArr.length : 0;
                    armlArr2 = new arml[(a + length)];
                    if (length != 0) {
                        System.arraycopy(armlArr, 0, armlArr2, 0, length);
                    }
                    while (length < armlArr2.length - 1) {
                        armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                        aobv.a();
                        length++;
                    }
                    armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                    this.V = armlArr2;
                    continue;
                case 266:
                    a = aock.a(aobv, 266);
                    armlArr = this.W;
                    length = armlArr != null ? armlArr.length : 0;
                    armlArr2 = new arml[(a + length)];
                    if (length != 0) {
                        System.arraycopy(armlArr, 0, armlArr2, 0, length);
                    }
                    while (length < armlArr2.length - 1) {
                        armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                        aobv.a();
                        length++;
                    }
                    armlArr2[length] = (arml) aobv.a(arml.f.getParserForType());
                    this.W = armlArr2;
                    continue;
                case 322:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.X;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.X = apxu;
                    continue;
                case 330:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.Y;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.Y = apxu;
                    continue;
                case 338:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.q;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.q = apxu;
                    continue;
                case 344:
                    this.Z = aobv.c();
                    continue;
                case 354:
                    awif awif = (awif) aobv.a(awif.c.getParserForType());
                    awif awif2 = this.r;
                    if (awif2 != null) {
                        awie awie = (awie) ((anxo) awif2.toBuilder());
                        awie.mergeFrom(awif);
                        awif = (awif) ((anxl) awie.build());
                    }
                    this.r = awif;
                    continue;
                case 362:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.s;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.s = aphj;
                    continue;
                case 378:
                    awip awip = (awip) aobv.a(awip.c.getParserForType());
                    awip awip2 = this.t;
                    if (awip2 != null) {
                        awio awio = (awio) ((anxo) awip2.toBuilder());
                        awio.mergeFrom(awip);
                        awip = (awip) ((anxl) awio.build());
                    }
                    this.t = awip;
                    continue;
                case 394:
                    if (this.u == null) {
                        this.u = new ajxt();
                    }
                    aobv.a(this.u);
                    continue;
                case 402:
                    awih awih = (awih) aobv.a(awih.c.getParserForType());
                    awih awih2 = this.v;
                    if (awih2 != null) {
                        awig awig = (awig) ((anxo) awih2.toBuilder());
                        awig.mergeFrom(awih);
                        awih = (awih) ((anxl) awig.build());
                    }
                    this.v = awih;
                    continue;
                case 416:
                    this.aa = aobv.c();
                    continue;
                case 426:
                    awij awij = (awij) aobv.a(awij.c.getParserForType());
                    awij awij2 = this.w;
                    if (awij2 != null) {
                        awii awii = (awii) ((anxo) awij2.toBuilder());
                        awii.mergeFrom(awij);
                        awij = (awij) ((anxl) awii.build());
                    }
                    this.w = awij;
                    continue;
                case 434:
                    apxu = (apxu) aobv.a(apxu.d.getParserForType());
                    apxu2 = this.ab;
                    if (apxu2 != null) {
                        apxx = (apxx) ((anxo) apxu2.toBuilder());
                        apxx.mergeFrom(apxu);
                        apxu = (apxu) ((anxl) apxx.build());
                    }
                    this.ab = apxu;
                    continue;
                case 442:
                    awil awil = (awil) aobv.a(awil.c.getParserForType());
                    awil awil2 = this.x;
                    if (awil2 != null) {
                        awik awik = (awik) ((anxo) awil2.toBuilder());
                        awik.mergeFrom(awil);
                        awil = (awil) ((anxl) awik.build());
                    }
                    this.x = awil;
                    continue;
                case 450:
                    atzm atzm = (atzm) aobv.a(atzm.f.getParserForType());
                    atzm atzm2 = this.y;
                    if (atzm2 != null) {
                        atzl atzl = (atzl) ((anxo) atzm2.toBuilder());
                        atzl.mergeFrom(atzm);
                        atzm = (atzm) ((anxl) atzl.build());
                    }
                    this.y = atzm;
                    continue;
                case 458:
                    aphj = (aphj) aobv.a(aphj.d.getParserForType());
                    aphj2 = this.z;
                    if (aphj2 != null) {
                        aphm = (aphm) ((anxo) aphj2.toBuilder());
                        aphm.mergeFrom(aphj);
                        aphj = (aphj) ((anxl) aphm.build());
                    }
                    this.z = aphj;
                    continue;
                case 466:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.A;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.A = arml;
                    continue;
                case 474:
                    arml = (arml) aobv.a(arml.f.getParserForType());
                    arml2 = this.B;
                    if (arml2 != null) {
                        armk = (armk) ((anxo) arml2.toBuilder());
                        armk.mergeFrom(arml);
                        arml = (arml) ((anxl) armk.build());
                    }
                    this.B = arml;
                    continue;
                case 490:
                    aygk = (aygk) aobv.a(aygk.f.getParserForType());
                    aygk2 = this.C;
                    if (aygk2 != null) {
                        aygj = (aygj) ((anxo) aygk2.toBuilder());
                        aygj.mergeFrom(aygk);
                        aygk = (aygk) ((anxl) aygj.build());
                    }
                    this.C = aygk;
                    continue;
                case 496:
                    this.D = aobv.c();
                    continue;
                case 506:
                    if (this.ac == null) {
                        this.ac = new ajzw();
                    }
                    aobv.a(this.ac);
                    continue;
                case 514:
                    if (this.E == null) {
                        this.E = new ajzw();
                    }
                    aobv.a(this.E);
                    continue;
                case 522:
                    if (this.ad == null) {
                        this.ad = new ajzw();
                    }
                    aobv.a(this.ad);
                    continue;
                case 530:
                    if (this.ae == null) {
                        this.ae = new ajzw();
                    }
                    aobv.a(this.ae);
                    continue;
                case 546:
                    if (this.F == null) {
                        this.F = new ajzw();
                    }
                    aobv.a(this.F);
                    continue;
                case 554:
                    if (this.af == null) {
                        this.af = new ajzw();
                    }
                    aobv.a(this.af);
                    continue;
                case 562:
                    aocf ajzw;
                    a = aock.a(aobv, 562);
                    ajzw[] ajzwArr = this.G;
                    length = ajzwArr != null ? ajzwArr.length : 0;
                    ajzw[] ajzwArr2 = new ajzw[(a + length)];
                    if (length != 0) {
                        System.arraycopy(ajzwArr, 0, ajzwArr2, 0, length);
                    }
                    while (length < ajzwArr2.length - 1) {
                        ajzw = new ajzw();
                        ajzwArr2[length] = ajzw;
                        aobv.a(ajzw);
                        aobv.a();
                        length++;
                    }
                    ajzw = new ajzw();
                    ajzwArr2[length] = ajzw;
                    aobv.a(ajzw);
                    this.G = ajzwArr2;
                    continue;
                default:
                    if (!super.storeUnknownField(aobv, a)) {
                        break;
                    }
                    continue;
            }
        }
        return this;
    }
}
