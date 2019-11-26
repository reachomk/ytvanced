package defpackage;

import android.text.TextUtils;

/* renamed from: alkz */
public final class alkz implements akmw {
    public final String a;
    public final aqif b;
    public final aqij c;
    public final aqil d;
    public final aqmj e;
    public final boolean f;
    private final boolean g;

    public alkz(String str, aqif aqif, aqij aqij, aqil aqil, aqmj aqmj, boolean z, boolean z2) {
        this.b = aqif;
        this.c = aqij;
        this.d = aqil;
        this.e = aqmj;
        if (TextUtils.isEmpty(str)) {
            this.a = b();
        } else {
            this.a = str;
        }
        this.g = z;
        this.f = z2;
    }

    public final akmw a(akmw akmw) {
        akmw = (alkz) akmw;
        if (akmw.f() < f()) {
            return this;
        }
        if (akmw.f() <= f()) {
            alky a = a();
            a.a = akmw.g;
            a.b = akmw.f;
            akmw = a.a();
        }
        return akmw;
    }

    public final alky a() {
        return new alky(this);
    }

    public final String b() {
        if (!TextUtils.isEmpty(this.a)) {
            return this.a;
        }
        aqif aqif = this.b;
        if (aqif == null) {
            aqij aqij = this.c;
            if (aqij != null) {
                return aqij.h;
            }
            aqil aqil = this.d;
            if (aqil == null) {
                aqmj aqmj = this.e;
                if (aqmj == null || (aqmj.a & 512) == 0) {
                    return null;
                }
                return aqmj.i;
            } else if ((aqil.a & 4096) != 0) {
                return aqil.k;
            } else {
                return null;
            }
        } else if ((aqif.a & 512) != 0) {
            return aqif.i;
        } else {
            return null;
        }
    }

    public final CharSequence c() {
        aqif aqif = this.b;
        arml arml = null;
        if (aqif == null) {
            aqij aqij = this.c;
            if (aqij != null) {
                if ((aqij.a & 1) != 0) {
                    arml = aqij.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                return ajqy.a(arml);
            }
            aqil aqil = this.d;
            if (aqil == null) {
                aqmj aqmj = this.e;
                if (aqmj == null) {
                    return null;
                }
                if ((aqmj.a & 1) != 0) {
                    arml = aqmj.b;
                    if (arml == null) {
                        arml = arml.f;
                    }
                }
                return ajqy.a(arml);
            }
            if ((aqil.a & 1) != 0) {
                arml = aqil.b;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            return ajqy.a(arml);
        }
        if ((aqif.a & 1) != 0) {
            arml = aqif.b;
            if (arml == null) {
                arml = arml.f;
            }
        }
        return ajqy.a(arml);
    }

    public final aphg d() {
        if ((this.g ^ this.f) == 0) {
            aphj aphj;
            aphg aphg;
            aqil aqil = this.d;
            if (aqil != null) {
                aphj = aqil.d;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                if ((aphj.a & 1) != 0) {
                    aphj = this.d.d;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    return aphg;
                }
            }
            aqmj aqmj = this.e;
            if (aqmj != null) {
                aphj = aqmj.e;
                if (aphj == null) {
                    aphj = aphj.d;
                }
                if ((aphj.a & 1) != 0) {
                    aphj = this.e.e;
                    if (aphj == null) {
                        aphj = aphj.d;
                    }
                    aphg = aphj.b;
                    if (aphg == null) {
                        aphg = aphg.s;
                    }
                    return aphg;
                }
            }
        }
        return null;
    }

    public final CharSequence e() {
        aqil aqil = this.d;
        arml arml = null;
        if (aqil == null) {
            aqmj aqmj = this.e;
            if (aqmj == null) {
                return null;
            }
            if ((aqmj.a & 16) != 0) {
                arml = aqmj.f;
                if (arml == null) {
                    arml = arml.f;
                }
            }
            return ajqy.a(arml);
        }
        if ((aqil.a & 16) != 0) {
            arml = aqil.e;
            if (arml == null) {
                arml = arml.f;
            }
        }
        return ajqy.a(arml);
    }

    private final long f() {
        aqif aqif = this.b;
        if (aqif != null) {
            return aqif.e;
        }
        aqij aqij = this.c;
        if (aqij != null) {
            return aqij.f;
        }
        aqil aqil = this.d;
        if (aqil == null) {
            return 0;
        }
        return aqil.f;
    }
}
