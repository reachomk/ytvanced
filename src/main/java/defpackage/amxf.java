package defpackage;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: amxf */
class amxf implements Serializable {
    public static final long serialVersionUID = 0;
    public final Object a;
    public final Object b;

    amxf(Object obj, Object obj2) {
        this.a = amqw.a(obj);
        if (obj2 == null) {
            obj2 = this;
        }
        this.b = obj2;
    }

    public final String toString() {
        String obj;
        synchronized (this.b) {
            obj = this.a.toString();
        }
        return obj;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }
}
