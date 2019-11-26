package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: ctu */
public final class ctu extends cts {
    public boolean a = false;
    private final List b;
    private final ctp c;
    private final HashSet d = new HashSet();
    private final cug e;
    private final int f = 0;
    private int g = 0;
    private int h = 0;
    private boolean i = false;
    private cty j;

    public ctu(List list) {
        this.b = list;
        if (this.b.isEmpty()) {
            throw new IllegalArgumentException("Empty binding parallel");
        }
        this.c = new ctt(this);
        this.e = null;
    }

    public final void a(ctq ctq) {
        if (this.d.contains(ctq)) {
            throw new RuntimeException("Binding unexpectedly completed twice");
        }
        this.d.add(ctq);
        this.h++;
        ctq.b(this.c);
        if (this.h >= this.b.size()) {
            this.a = false;
            f();
        }
    }

    public final void a(cty cty) {
        if (this.i) {
            throw new RuntimeException("Starting binding multiple times");
        }
        this.i = true;
        this.j = cty;
        if (c()) {
            e();
            this.a = true;
            for (ctq a : this.b) {
                a.a(this.c);
            }
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((ctq) this.b.get(i)).a(this.j);
            }
            this.g = this.b.size();
            return;
        }
        d();
    }

    public final void a() {
        if (this.a) {
            int i = 0;
            this.a = false;
            this.j = null;
            int size = this.b.size();
            while (i < size) {
                ctq ctq = (ctq) this.b.get(i);
                if (ctq.b()) {
                    ctq.a();
                }
                i++;
            }
        }
    }

    public final boolean b() {
        return this.a;
    }

    public final void a(ArrayList arrayList) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((ctq) this.b.get(i)).a(arrayList);
        }
    }
}
