package defpackage;

/* renamed from: abmk */
public final class abmk {
    public static CharSequence a(auvj auvj) {
        int i = auvj.a;
        arml arml = null;
        if ((i & 1) != 0) {
            auvl auvl = auvj.b;
            if (auvl == null) {
                auvl = auvl.f;
            }
            if ((auvl.a & 1) != 0) {
                auvl auvl2 = auvj.b;
                if (auvl2 == null) {
                    auvl2 = auvl.f;
                }
                arml = auvl2.b;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            return ajqy.a(arml);
        } else if ((i & 2) != 0) {
            auvp auvp = auvj.c;
            if (auvp == null) {
                auvp = auvp.h;
            }
            if ((auvp.a & 1) != 0) {
                auvp auvp2 = auvj.c;
                if (auvp2 == null) {
                    auvp2 = auvp.h;
                }
                arml = auvp2.b;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            return ajqy.a(arml);
        } else if ((i & 8) != 0) {
            auvd auvd = auvj.e;
            if (auvd == null) {
                auvd = auvd.g;
            }
            if ((auvd.a & 1) != 0) {
                auvd auvd2 = auvj.e;
                if (auvd2 == null) {
                    auvd2 = auvd.g;
                }
                arml = auvd2.b;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            return ajqy.a(arml);
        } else if ((i & 16) != 0) {
            auvf auvf = auvj.f;
            if (auvf == null) {
                auvf = auvf.g;
            }
            if ((auvf.a & 1) != 0) {
                auvf auvf2 = auvj.f;
                if (auvf2 == null) {
                    auvf2 = auvf.g;
                }
                arml = auvf2.b;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            return ajqy.a(arml);
        } else if ((i & 4) == 0) {
            return null;
        } else {
            auwb auwb = auvj.d;
            if (auwb == null) {
                auwb = auwb.l;
            }
            auwb auwb2;
            if (auwb.j) {
                auwb = auvj.d;
                if (auwb == null) {
                    auwb = auwb.l;
                }
                if ((auwb.a & 16) != 0) {
                    auwb2 = auvj.d;
                    if (auwb2 == null) {
                        auwb2 = auwb.l;
                    }
                    arml = auwb2.f;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                return ajqy.a(arml);
            }
            auwb = auvj.d;
            if (auwb == null) {
                auwb = auwb.l;
            }
            if ((auwb.a & 1) != 0) {
                auwb2 = auvj.d;
                if (auwb2 == null) {
                    auwb2 = auwb.l;
                }
                arml = auwb2.b;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            return ajqy.a(arml);
        }
    }

    public static arwf b(auvj auvj) {
        int i = auvj.a;
        arwf arwf;
        if ((i & 1) != 0) {
            auvl auvl = auvj.b;
            if (auvl == null) {
                auvl = auvl.f;
            }
            arwf = auvl.c;
            if (arwf == null) {
                arwf = arwf.c;
            }
            return arwf;
        } else if ((i & 2) != 0) {
            auvp auvp = auvj.c;
            if (auvp == null) {
                auvp = auvp.h;
            }
            arwf = auvp.d;
            if (arwf == null) {
                arwf = arwf.c;
            }
            return arwf;
        } else if ((i & 8) != 0) {
            auvd auvd = auvj.e;
            if (auvd == null) {
                auvd = auvd.g;
            }
            arwf = auvd.c;
            if (arwf == null) {
                arwf = arwf.c;
            }
            return arwf;
        } else if ((i & 16) != 0) {
            auvf auvf = auvj.f;
            if (auvf == null) {
                auvf = auvf.g;
            }
            arwf = auvf.c;
            if (arwf == null) {
                arwf = arwf.c;
            }
            return arwf;
        } else if ((i & 4) == 0) {
            return null;
        } else {
            auwb auwb = auvj.d;
            if (auwb == null) {
                auwb = auwb.l;
            }
            auwb auwb2;
            if (auwb.j) {
                auwb2 = auvj.d;
                if (auwb2 == null) {
                    auwb2 = auwb.l;
                }
                arwf = auwb2.h;
                if (arwf == null) {
                    arwf = arwf.c;
                }
                return arwf;
            }
            auwb2 = auvj.d;
            if (auwb2 == null) {
                auwb2 = auwb.l;
            }
            arwf = auwb2.d;
            if (arwf == null) {
                arwf = arwf.c;
            }
            return arwf;
        }
    }

    public static apxu c(auvj auvj) {
        int i = auvj.a;
        apxu apxu;
        if ((i & 1) != 0) {
            auvl auvl = auvj.b;
            if (auvl == null) {
                auvl = auvl.f;
            }
            if ((auvl.a & 4) == 0) {
                return null;
            }
            auvl auvl2 = auvj.b;
            if (auvl2 == null) {
                auvl2 = auvl.f;
            }
            apxu = auvl2.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
            return apxu;
        }
        if ((i & 8) != 0) {
            auvd auvd = auvj.e;
            if (auvd == null) {
                auvd = auvd.g;
            }
            if ((auvd.a & 4) != 0) {
                auvd auvd2 = auvj.e;
                if (auvd2 == null) {
                    auvd2 = auvd.g;
                }
                apxu = auvd2.d;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                return apxu;
            }
        }
        return null;
    }

    public static apxu d(auvj auvj) {
        int i = auvj.a;
        apxu apxu;
        if ((i & 2) != 0) {
            auvp auvp = auvj.c;
            if (auvp == null) {
                auvp = auvp.h;
            }
            if ((auvp.a & 8) == 0) {
                return null;
            }
            auvp auvp2 = auvj.c;
            if (auvp2 == null) {
                auvp2 = auvp.h;
            }
            apxu = auvp2.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            return apxu;
        } else if ((i & 16) != 0) {
            auvf auvf = auvj.f;
            if (auvf == null) {
                auvf = auvf.g;
            }
            if ((auvf.a & 4) == 0) {
                return null;
            }
            auvf auvf2 = auvj.f;
            if (auvf2 == null) {
                auvf2 = auvf.g;
            }
            apxu = auvf2.d;
            if (apxu == null) {
                apxu = apxu.d;
            }
            return apxu;
        } else {
            if ((i & 4) != 0) {
                auwb auwb = auvj.d;
                if (auwb == null) {
                    auwb = auwb.l;
                }
                auwb auwb2;
                if (auwb.j) {
                    auwb = auvj.d;
                    if (auwb == null) {
                        auwb = auwb.l;
                    }
                    if ((auwb.a & 128) != 0) {
                        auwb2 = auvj.d;
                        if (auwb2 == null) {
                            auwb2 = auwb.l;
                        }
                        apxu = auwb2.i;
                        if (apxu == null) {
                            apxu = apxu.d;
                        }
                        return apxu;
                    }
                }
                auwb = auvj.d;
                if (auwb == null) {
                    auwb = auwb.l;
                }
                if ((auwb.a & 8) == 0) {
                    return null;
                }
                auwb2 = auvj.d;
                if (auwb2 == null) {
                    auwb2 = auwb.l;
                }
                apxu = auwb2.e;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                return apxu;
            }
            return null;
        }
    }

    public static void a(auvm auvm, apxu apxu) {
        if (auvm.a()) {
            auvs auvs = (auvs) ((anxo) auvm.b().toBuilder());
            auvs.a(apxu);
            auvm.a(auvs);
        } else if (auvm.e()) {
            auvi auvi = (auvi) ((anxo) auvm.f().toBuilder());
            auvi.copyOnWrite();
            auvf auvf = (auvf) auvi.instance;
            if (apxu != null) {
                auvf.d = apxu;
                auvf.a |= 4;
                auvm.a(auvi);
                return;
            }
            throw new NullPointerException();
        } else if (auvm.c()) {
            auwe auwe = (auwe) auwb.l.createBuilder();
            auwb auwb;
            if (auvm.d().j) {
                auwe.copyOnWrite();
                auwb = (auwb) auwe.instance;
                if (apxu != null) {
                    auwb.i = apxu;
                    auwb.a |= 128;
                } else {
                    throw new NullPointerException();
                }
            }
            auwe.copyOnWrite();
            auwb = (auwb) auwe.instance;
            if (apxu != null) {
                auwb.e = apxu;
                auwb.a |= 8;
            } else {
                throw new NullPointerException();
            }
            auvm.a(auwe);
        }
    }
}
