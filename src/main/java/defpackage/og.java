package defpackage;

import java.util.ArrayList;

/* renamed from: og */
final class og implements oh {
    private final int a;
    private final int b;
    private final /* synthetic */ nv c;

    og(nv nvVar, int i, int i2) {
        this.c = nvVar;
        this.a = i;
        this.b = i2;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        nf nfVar = this.c.m;
        if (nfVar != null && this.a < 0) {
            nv nvVar = nfVar.x;
            if (nvVar != null && nvVar.d()) {
                return false;
            }
        }
        return this.c.a(arrayList, arrayList2, this.a, this.b);
    }
}
