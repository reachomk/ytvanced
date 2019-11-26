package defpackage;

import java.util.LinkedHashMap;

@Deprecated
/* renamed from: wyr */
public class wyr implements wyi {
    public final int a;
    public final LinkedHashMap b;

    public wyr(int i) {
        this.a = i;
        this.b = new wyq(this, ((int) Math.ceil((double) (((float) i) / 0.75f))) + 1);
    }

    public final synchronized void a() {
        this.b.clear();
    }

    public synchronized Object a(Object obj) {
        amqw.a(obj);
        return this.b.get(obj);
    }

    public synchronized void a(Object obj, Object obj2) {
        amqw.a(obj);
        amqw.a(obj2);
        this.b.put(obj, obj2);
    }

    public synchronized Object b(Object obj) {
        amqw.a(obj);
        return this.b.remove(obj);
    }

    public synchronized String toString() {
        return this.b.toString();
    }
}
