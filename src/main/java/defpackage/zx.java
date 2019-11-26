package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

/* renamed from: zx */
final class zx implements Iterator, Entry {
    private int a;
    private int b;
    private boolean c = false;
    private final /* synthetic */ zt d;

    zx(zt ztVar) {
        this.d = ztVar;
        this.a = ztVar.a() - 1;
        this.b = -1;
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final void remove() {
        if (this.c) {
            this.d.a(this.b);
            this.b--;
            this.a--;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object getKey() {
        if (this.c) {
            return this.d.a(this.b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.c) {
            return this.d.a(this.b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.a(this.b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final boolean equals(Object obj) {
        if (this.c) {
            if (obj instanceof Entry) {
                Entry entry = (Entry) obj;
                if (zm.a(entry.getKey(), this.d.a(this.b, 0)) && zm.a(entry.getValue(), this.d.a(this.b, 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final int hashCode() {
        if (this.c) {
            int i = 0;
            Object a = this.d.a(this.b, 0);
            Object a2 = this.d.a(this.b, 1);
            int hashCode = a != null ? a.hashCode() : 0;
            if (a2 != null) {
                i = a2.hashCode();
            }
            return hashCode ^ i;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getKey());
        stringBuilder.append("=");
        stringBuilder.append(getValue());
        return stringBuilder.toString();
    }

    public final /* synthetic */ Object next() {
        if (hasNext()) {
            this.b++;
            this.c = true;
            return this;
        }
        throw new NoSuchElementException();
    }
}
