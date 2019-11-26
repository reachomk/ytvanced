package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: abpn */
final class abpn implements abor, abqn, afsw {
    private String a;
    private augl b;
    private final String c;
    private akti d;
    private final /* synthetic */ abpk e;

    public abpn(abpk abpk, String str, String str2) {
        this.e = abpk;
        this.a = str;
        this.c = str2;
    }

    public final abor d() {
        return this;
    }

    public final afsw e() {
        return this;
    }

    public abpn(abpk abpk, akti akti, augl augl, String str) {
        this.e = abpk;
        this.d = akti;
        this.b = augl;
        this.c = str;
    }

    public final abov f() {
        abpo abpo = this.e.d;
        return abpo != null ? abpo.a : null;
    }

    public final abpe g() {
        abpo abpo = this.e.d;
        return abpo != null ? abpo.c : null;
    }

    public final abpa h() {
        abpo abpo = this.e.d;
        return abpo != null ? abpo.e() : null;
    }

    public final abot i() {
        abpo abpo = this.e.d;
        return abpo != null ? abpo.d : null;
    }

    public final abow j() {
        abow abow = this.e.d;
        return abow == null ? null : abow;
    }

    public final Object a(String str) {
        if (TextUtils.equals(str, "ClientMessageIdKey")) {
            return this.c;
        }
        if (!TextUtils.equals(str, "MessageKey")) {
            return null;
        }
        augl augl = this.b;
        if (augl != null) {
            akti akti = this.d;
            if (akti != null) {
                armk armk = (armk) arml.f.createBuilder();
                int size = augl.b.size();
                if (size > 0) {
                    for (int i = 0; i < size; i++) {
                        armo armo = (armo) armp.m.createBuilder();
                        augn augn = (augn) augl.b.get(i);
                        String str2 = "";
                        if ((augn.a == 1 ? (String) augn.b : str2).isEmpty()) {
                            augn = (augn) augl.b.get(i);
                            if (!(augn.a == 2 ? (String) augn.b : str2).isEmpty()) {
                                Object obj;
                                anxr anxr = ardw.g;
                                Map map = akti.a;
                                augn augn2 = (augn) augl.b.get(i);
                                if (augn2.a == 2) {
                                    obj = (String) augn2.b;
                                }
                                armo.a(anxr, (ardw) map.get(obj));
                            }
                        } else {
                            augn = (augn) augl.b.get(i);
                            if (augn.a == 1) {
                                str2 = (String) augn.b;
                            }
                            armo.a(str2);
                        }
                        armk.a(armo);
                    }
                }
                boolean z = augl.c;
                armk.copyOnWrite();
                arml arml = (arml) armk.instance;
                arml.a |= 2;
                arml.d = z;
                return (arml) ((anxl) armk.build());
            }
        }
        return this.a;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final augl c() {
        return this.b;
    }

    public final void a(bqn bqn) {
        abpo abpo = this.e.d;
        if (abpo != null) {
            abpo.a.a(this.c, true);
        }
        this.e.a.c(bqn);
    }
}
