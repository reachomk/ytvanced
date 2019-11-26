package defpackage;

/* renamed from: anxr */
public final class anxr extends anwy {
    public final anze a;
    public final Object b;
    public final anze c;
    public final anxs d;

    anxr(anze anze, Object obj, anze anze2, anxs anxs) {
        if (anze == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        } else if (anxs.c == aobm.MESSAGE && anze2 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        } else {
            this.a = anze;
            this.b = obj;
            this.c = anze2;
            this.d = anxs;
        }
    }

    public final int a() {
        return this.d.b;
    }

    public final anze b() {
        return this.c;
    }

    public final Object a(Object obj) {
        return this.d.f() == 8 ? this.d.a.findValueByNumber(((Integer) obj).intValue()) : obj;
    }

    public final aobm c() {
        return this.d.c;
    }
}
