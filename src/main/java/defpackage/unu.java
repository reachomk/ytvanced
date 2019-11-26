package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: unu */
public final class unu implements Closeable {
    private final bakx a;
    private final balf b;
    private volatile boolean c;
    private final ArrayList d;

    unu() {
        this.c = false;
        this.d = new ArrayList();
        this.a = null;
        this.b = null;
        this.c = true;
    }

    public unu(bakx bakx, balf balf, List list) {
        int i = 0;
        this.c = false;
        this.d = new ArrayList();
        this.b = (balf) uhy.a((Object) balf);
        this.a = (bakx) uhy.a((Object) bakx);
        int size = list.size();
        while (i < size) {
            Object obj = (Closeable) list.get(i);
            uhy.a(obj);
            this.d.add(obj);
            i++;
        }
    }

    public final civ a() {
        civ a;
        synchronized (this.d) {
            if (this.c) {
                throw new IOException("Unable to build container with closed resources");
            }
            a = this.b.a(this.a);
        }
        return a;
    }

    public final void close() {
        synchronized (this.d) {
            if (!this.c) {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    try {
                        ((Closeable) it.next()).close();
                    } catch (IOException e) {
                        ujo.a("Exception while closing resource", e);
                    }
                }
                this.d.clear();
                this.c = true;
            }
        }
    }
}
