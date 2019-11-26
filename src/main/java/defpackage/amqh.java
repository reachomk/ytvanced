package defpackage;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: amqh */
public class amqh {
    public final String a;

    public static amqh a(String str) {
        return new amqh(str);
    }

    public static amqh a(char c) {
        return new amqh(String.valueOf(c));
    }

    private amqh(String str) {
        this.a = (String) amqw.a((Object) str);
    }

    public Appendable a(Appendable appendable, Iterator it) {
        amqw.a((Object) appendable);
        if (it.hasNext()) {
            appendable.append(amqh.a(it.next()));
            while (it.hasNext()) {
                appendable.append(this.a);
                appendable.append(amqh.a(it.next()));
            }
        }
        return appendable;
    }

    public final StringBuilder a(StringBuilder stringBuilder, Iterator it) {
        try {
            a((Appendable) stringBuilder, it);
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final String a(Iterable iterable) {
        return a(new StringBuilder(), iterable.iterator()).toString();
    }

    public final String a(Object obj, Object obj2, Object... objArr) {
        amqw.a((Object) objArr);
        return a(new amqj(objArr, obj, obj2));
    }

    public final amqh a() {
        return new amqk(this, this);
    }

    public amqm b(String str) {
        return new amqm(this, str);
    }

    public static CharSequence a(Object obj) {
        amqw.a(obj);
        return !(obj instanceof CharSequence) ? obj.toString() : (CharSequence) obj;
    }
}
