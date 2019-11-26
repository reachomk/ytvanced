package defpackage;

import java.util.ArrayList;

/* renamed from: dl */
public final class dl {
    public int a;
    public int b;
    public int c;
    public int d;
    public ArrayList e = new ArrayList();

    public dl(dh dhVar) {
        this.a = dhVar.w;
        this.b = dhVar.x;
        this.c = dhVar.d();
        this.d = dhVar.g();
        ArrayList arrayList = dhVar.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new dk((df) arrayList.get(i)));
        }
    }
}
