package defpackage;

/* renamed from: daf */
final class daf implements dbh {
    daf() {
    }

    public final cyl a(dbz dbz, cpe cpe, boolean z, boolean z2, cyn cyn, String str) {
        cyo a = cyl.a();
        if (dbz == null) {
            dbz = cyk.m();
        }
        a.a = dbz;
        a.b = cpe;
        a.e = z;
        a.c = cyn;
        a.d = str;
        a.f = z2;
        if (a.a != null) {
            cyl cyl = (cyl) cyl.b.a();
            if (cyl == null) {
                cyl = new cyl();
            }
            cyl.d = a.a;
            cyl.h = a.b;
            cyl.i = null;
            cyl.j = false;
            cyl.k = false;
            cyl.l = a.e;
            cyl.m = a.f;
            cyl.c = a.c;
            cyl.n = a.d;
            cyl.g = cyl.a.getAndIncrement();
            cyl.e.set(false);
            return cyl;
        }
        throw new IllegalArgumentException("A RenderInfo must be specified to create a ComponentTreeHolder");
    }
}
