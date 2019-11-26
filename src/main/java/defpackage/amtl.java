package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* renamed from: amtl */
public final class amtl extends amtu implements Serializable {
    public static final long serialVersionUID = 0;
    private final Queue a = new ArrayDeque(128);
    private final int b = 128;

    public amtl() {
        amqw.a(true, "maxSize (%s) must >= 0", 128);
    }

    /* Access modifiers changed, original: protected|final */
    public final Queue a() {
        return this.a;
    }

    public final boolean offer(Object obj) {
        return add(obj);
    }

    public final boolean add(Object obj) {
        amqw.a(obj);
        if (this.b != 0) {
            if (size() == this.b) {
                this.a.remove();
            }
            this.a.add(obj);
        }
        return true;
    }

    public final boolean addAll(Collection collection) {
        int size = collection.size();
        if (size < this.b) {
            return amve.a((Collection) this, collection.iterator());
        }
        boolean addAll;
        clear();
        size -= this.b;
        amqw.a((Object) collection);
        amqw.a(size >= 0, (Object) "number to skip cannot be negative");
        Object amvc = new amvc(collection, size);
        if (amvc instanceof Collection) {
            addAll = addAll((Collection) amvc);
        } else {
            addAll = amve.a((Collection) this, ((Iterable) amqw.a(amvc)).iterator());
        }
        return addAll;
    }

    public final boolean contains(Object obj) {
        return this.a.contains(amqw.a(obj));
    }

    public final boolean remove(Object obj) {
        return this.a.remove(amqw.a(obj));
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ Collection b() {
        return this.a;
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ Object d() {
        return this.a;
    }
}
