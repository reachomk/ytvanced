package defpackage;

import java.util.List;

/* renamed from: zlh */
final /* synthetic */ class zlh implements zmp {
    private final zld a;

    zlh(zld zld) {
        this.a = zld;
    }

    public final void a(Object obj) {
        zld zld = this.a;
        List list = (List) obj;
        if (zld.d == null) {
            zld.d = list;
            zld.m();
            zld.c.add(zld.b.a(new zlo(zld)));
        }
    }
}
