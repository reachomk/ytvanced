package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Map.Entry;

/* renamed from: xuh */
final class xuh extends WeakReference implements Entry {
    public final int a;
    public final boolean b;
    public Object c;
    public xuh d;

    public xuh(Object obj, Object obj2, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        int i = 0;
        boolean z = obj == null;
        this.b = z;
        if (!z) {
            i = xuc.b(obj);
        }
        this.a = i;
        this.c = obj2;
    }

    public final Object getKey() {
        return super.get();
    }

    public final Object getValue() {
        return this.c;
    }

    public final Object setValue(Object obj) {
        Object obj2 = this.c;
        this.c = obj;
        return obj2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            Object obj2 = super.get();
            if (obj2 != null ? !obj2.equals(entry.getKey()) : entry.getKey() != null) {
                obj2 = this.c;
                if (obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        Object obj = this.c;
        return i + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(super.get());
        String valueOf2 = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 1) + valueOf2.length());
        stringBuilder.append(valueOf);
        stringBuilder.append("=");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }
}
