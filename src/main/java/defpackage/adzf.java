package defpackage;

import java.util.ArrayList;

/* renamed from: adzf */
public final class adzf implements adzc {
    public volatile int a = 0;
    public final ArrayList b = new ArrayList();
    public volatile boolean c = false;

    public final void a() {
        this.a = 2;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((adzc) arrayList.get(i)).a();
        }
    }

    public final void b() {
        int i = 0;
        this.a = 0;
        this.c = true;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        while (i < size) {
            ((adzc) arrayList.get(i)).b();
            i++;
        }
    }
}
