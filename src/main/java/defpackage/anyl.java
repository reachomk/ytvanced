package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: anyl */
public final class anyl extends anvj implements anyo, RandomAccess {
    private final List b;

    public anyl() {
        this(10);
    }

    public anyl(int i) {
        this(new ArrayList(i));
    }

    private anyl(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final int size() {
        return this.b.size();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection collection) {
        c();
        if (collection instanceof anyo) {
            collection = ((anyo) collection).d();
        }
        boolean addAll = this.b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        c();
        this.b.clear();
        this.modCount++;
    }

    public final void a(anvu anvu) {
        c();
        this.b.add(anvu);
        this.modCount++;
    }

    public final Object b(int i) {
        return this.b.get(i);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof anvu) {
            return ((anvu) obj).e();
        }
        return anxw.b((byte[]) obj);
    }

    public final List d() {
        return Collections.unmodifiableList(this.b);
    }

    public final anyo e() {
        return this.a ? new aoaw(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        c();
        return anyl.a(this.b.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean a() {
        return this.a;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        c();
        this.b.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    public final /* synthetic */ Object get(int i) {
        Object obj;
        Object obj2 = this.b.get(i);
        if (obj2 instanceof String) {
            obj = (String) obj2;
        } else if (obj2 instanceof anvu) {
            anvu anvu = (anvu) obj2;
            obj = anvu.e();
            if (anvu.f()) {
                this.b.set(i, obj);
                return obj;
            }
        } else {
            byte[] bArr = (byte[]) obj2;
            obj = anxw.b(bArr);
            if (anxw.a(bArr)) {
                this.b.set(i, obj);
                return obj;
            }
        }
        return obj;
    }

    static {
        new anyl().b();
    }
}
