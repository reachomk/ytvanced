package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: amso */
public final class amso extends amsn {
    public static final long serialVersionUID = 0;
    private transient int e = 3;

    public static amso e() {
        return new amso();
    }

    private amso() {
        super(new amsw((byte) 0));
        amss.a(3, "expectedValuesPerKey");
    }

    private final List f() {
        return new ArrayList(this.e);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(c().size());
        for (Entry entry : c().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            for (Object writeObject : (Collection) entry.getValue()) {
                objectOutputStream.writeObject(writeObject);
            }
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.e = 3;
        int readInt = objectInputStream.readInt();
        amsw amsw = new amsw();
        this.a = amsw;
        this.b = 0;
        for (Collection collection : amsw.values()) {
            amqw.a(collection.isEmpty() ^ 1);
            this.b += collection.size();
        }
        for (int i = 0; i < readInt; i++) {
            List c = c(objectInputStream.readObject());
            int readInt2 = objectInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                c.add(objectInputStream.readObject());
            }
        }
    }

    public final /* synthetic */ boolean equals(Object obj) {
        return amwc.a(this, obj);
    }

    public final /* synthetic */ Map c() {
        Map map = this.d;
        if (map != null) {
            return map;
        }
        amsc amsc = new amsc(this, this.a);
        this.d = amsc;
        return amsc;
    }

    public final /* synthetic */ boolean a(Object obj, Object obj2) {
        Collection collection = (Collection) this.a.get(obj);
        boolean z = true;
        if (collection == null) {
            List f = f();
            if (f.add(obj2)) {
                this.b++;
                this.a.put(obj, f);
            } else {
                throw new AssertionError("New Collection violated the Collection spec");
            }
        } else if (collection.add(obj2)) {
            this.b++;
            return true;
        } else {
            z = false;
        }
        return z;
    }

    public final /* synthetic */ List d(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return Collections.emptyList();
        }
        List f = f();
        f.addAll(collection);
        this.b -= collection.size();
        collection.clear();
        return Collections.unmodifiableList(f);
    }

    public final /* synthetic */ List c(Object obj) {
        Collection collection = (Collection) this.a.get(obj);
        if (collection == null) {
            collection = f();
        }
        return (List) a(obj, collection);
    }

    public final /* synthetic */ void b() {
        for (Collection clear : this.a.values()) {
            clear.clear();
        }
        this.a.clear();
        this.b = 0;
    }

    public final /* synthetic */ boolean a(Object obj) {
        return this.a.containsKey(obj);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ Collection a() {
        return f();
    }

    public final /* synthetic */ String toString() {
        return c().toString();
    }

    public final /* synthetic */ int hashCode() {
        return c().hashCode();
    }

    public final /* synthetic */ Set d() {
        Set set = this.c;
        if (set != null) {
            return set;
        }
        amsd amsd = new amsd(this, this.a);
        this.c = amsd;
        return amsd;
    }

    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        Collection collection = (Collection) c().get(obj);
        if (collection == null || !collection.remove(obj2)) {
            return false;
        }
        return true;
    }
}
