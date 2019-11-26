package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: rfp */
public final class rfp extends rcw implements RandomAccess, rfs {
    private final List b;

    public rfp() {
        this(10);
    }

    public rfp(int i) {
        this(new ArrayList(i));
    }

    private rfp(ArrayList arrayList) {
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
        if (collection instanceof rfs) {
            collection = ((rfs) collection).d();
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

    public final void a(rdg rdg) {
        c();
        this.b.add(rdg);
        this.modCount++;
    }

    public final Object b(int i) {
        return this.b.get(i);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof rdg) {
            return ((rdg) obj).c();
        }
        return rfc.b((byte[]) obj);
    }

    public final List d() {
        return Collections.unmodifiableList(this.b);
    }

    public final rfs e() {
        return this.a ? new rhu(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        c();
        return rfp.a(this.b.set(i, str));
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
        Object obj = this.b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        String c;
        if (obj instanceof rdg) {
            rdg rdg = (rdg) obj;
            c = rdg.c();
            if (rdg.d()) {
                this.b.set(i, c);
            }
            return c;
        }
        byte[] bArr = (byte[]) obj;
        c = rfc.b(bArr);
        if (rfc.a(bArr)) {
            this.b.set(i, c);
        }
        return c;
    }

    static {
        new rfp().b();
    }
}
