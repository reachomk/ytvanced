package defpackage;

import java.util.Map.Entry;

/* renamed from: amsm */
abstract class amsm implements Entry {
    amsm() {
    }

    public abstract Object getKey();

    public abstract Object getValue();

    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Entry) {
            Entry entry = (Entry) obj;
            if (amqq.a(getKey(), entry.getKey()) && amqq.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object key = getKey();
        Object value = getValue();
        int i = 0;
        int hashCode = key != null ? key.hashCode() : 0;
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 1) + valueOf2.length());
        stringBuilder.append(valueOf);
        stringBuilder.append("=");
        stringBuilder.append(valueOf2);
        return stringBuilder.toString();
    }
}
