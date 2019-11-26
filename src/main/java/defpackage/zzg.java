package defpackage;

/* renamed from: zzg */
public final class zzg implements afmx {
    private static final int j = 2;
    private static final int k = 3;
    private static final int l = 3;
    private static final int m = 2;
    public final aqtu a;
    public afmw b;
    private final int c;
    private final int d;
    private aqts e;
    private aqua f;
    private aqua g;
    private aqua h;
    private aqua i;

    public zzg(aqtu aqtu) {
        this.a = (aqtu) amqw.a((Object) aqtu);
        int i = aqtu.b;
        Object obj = null;
        if (i >= 0 && aqtu.c > i) {
            obj = 1;
        }
        if (obj == null) {
            i = 60;
        }
        this.c = i;
        this.d = obj != null ? aqtu.c : 120;
    }

    public final int a() {
        return this.c;
    }

    public final int b() {
        return this.d;
    }

    public final aqts c() {
        if (this.e == null) {
            aqtv aqtv;
            aqts aqts;
            aqtu aqtu = this.a;
            int i = 1;
            if ((aqtu.a & 16) != 0) {
                anxl anxl = aqtu.d;
                if (anxl == null) {
                    anxl = aqts.e;
                }
                aqtv = (aqtv) ((anxo) anxl.toBuilder());
            } else {
                aqtv = (aqtv) aqts.e.createBuilder();
                aqtv.copyOnWrite();
                aqts = (aqts) aqtv.instance;
                aqts.a |= 1;
                aqts.b = true;
            }
            int i2 = 0;
            if (aqtv.a() < 0 || aqtv.b() <= aqtv.a()) {
                i = 0;
            }
            if (i != 0) {
                i2 = aqtv.a();
            }
            aqtv.copyOnWrite();
            aqts = (aqts) aqtv.instance;
            aqts.a |= 2;
            aqts.c = i2;
            int b = i != 0 ? aqtv.b() : 10;
            aqtv.copyOnWrite();
            aqts aqts2 = (aqts) aqtv.instance;
            aqts2.a |= 4;
            aqts2.d = b;
            this.e = (aqts) ((anxl) aqtv.build());
        }
        return this.e;
    }

    private static aqua a(aqud aqud, aqui aqui) {
        int ordinal = aqui.ordinal();
        if (ordinal == 1) {
            zzg.a(aqud, j, 60, 120);
        } else if (ordinal == 2) {
            zzg.a(aqud, k, 60, 120);
        } else if (ordinal == 3) {
            zzg.a(aqud, l, 4, 5);
        } else if (ordinal != 4) {
            zzg.a(aqud, j, 60, 120);
        } else {
            zzg.a(aqud, m, 60, 120);
        }
        return (aqua) ((anxl) aqud.build());
    }

    public final boolean d() {
        aqtu aqtu = this.a;
        if (aqtu != null) {
            aquc aquc = aqtu.f;
            if (aquc == null) {
                aquc = aquc.g;
            }
            if (aquc.b) {
                return true;
            }
        }
        return false;
    }

    public final aqua e() {
        if (this.f == null) {
            aquc aquc = this.a.f;
            if (aquc == null) {
                aquc = aquc.g;
            }
            anxl anxl = aquc.c;
            if (anxl == null) {
                anxl = aqua.e;
            }
            this.f = zzg.a((aqud) ((anxo) anxl.toBuilder()), aqui.DELAYED_EVENT_TIER_DEFAULT);
        }
        return this.f;
    }

    public final aqua f() {
        if (this.g == null) {
            aquc aquc = this.a.f;
            if (aquc == null) {
                aquc = aquc.g;
            }
            anxl anxl = aquc.e;
            if (anxl == null) {
                anxl = aqua.e;
            }
            this.g = zzg.a((aqud) ((anxo) anxl.toBuilder()), aqui.DELAYED_EVENT_TIER_FAST);
        }
        return this.g;
    }

    public final aqua g() {
        if (this.h == null) {
            aquc aquc = this.a.f;
            if (aquc == null) {
                aquc = aquc.g;
            }
            anxl anxl = aquc.d;
            if (anxl == null) {
                anxl = aqua.e;
            }
            this.h = zzg.a((aqud) ((anxo) anxl.toBuilder()), aqui.DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY);
        }
        return this.h;
    }

    public final aqua h() {
        if (this.i == null) {
            aquc aquc = this.a.f;
            if (aquc == null) {
                aquc = aquc.g;
            }
            anxl anxl = aquc.f;
            if (anxl == null) {
                anxl = aqua.e;
            }
            this.i = zzg.a((aqud) ((anxo) anxl.toBuilder()), aqui.DELAYED_EVENT_TIER_IMMEDIATE);
        }
        return this.i;
    }

    private static void a(aqud aqud, int i, int i2, int i3) {
        if (aqud.c() != 1) {
            i = aqud.c();
        }
        aqud.copyOnWrite();
        aqua aqua = (aqua) aqud.instance;
        if (i != 0) {
            aqua.a |= 4;
            int i4 = i - 1;
            if (i != 0) {
                aqua.d = i4;
                Object obj = null;
                if (aqud.a() >= 0 && aqud.b() > aqud.a()) {
                    obj = 1;
                }
                if (obj != null) {
                    i2 = aqud.a();
                }
                aqud.copyOnWrite();
                aqua aqua2 = (aqua) aqud.instance;
                aqua2.a = 1 | aqua2.a;
                aqua2.b = i2;
                if (obj != null) {
                    i3 = aqud.b();
                }
                aqud.copyOnWrite();
                aqua aqua3 = (aqua) aqud.instance;
                aqua3.a |= 2;
                aqua3.c = i3;
                return;
            }
            throw null;
        }
        throw new NullPointerException();
    }
}
