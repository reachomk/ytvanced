package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: xcq */
public final class xcq {
    public final Class a;
    public final xcn b;
    public final int c;
    private final WeakReference d;
    private final int e;

    xcq(Object obj, Class cls, Object obj2, xcn xcn) {
        amqw.a(obj);
        amqw.a(obj2);
        this.d = new WeakReference(obj);
        this.a = (Class) amqw.a((Object) cls);
        this.b = (xcn) amqw.a((Object) xcn);
        this.e = Arrays.hashCode(new Object[]{obj, this.a, obj2, this.b});
        this.c = obj2.hashCode();
    }

    /* Access modifiers changed, original: final */
    public final Object a() {
        return this.d.get();
    }

    public final int hashCode() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xcq) {
            xcq xcq = (xcq) obj;
            if (this.d.get() == xcq.d.get() && this.a.equals(xcq.a) && this.c == xcq.c) {
                xcn xcn = this.b;
                xcn xcn2 = xcq.b;
                if (xcn != xcn2 && xcn.equals(xcn2)) {
                    obj = this.d.get();
                    if ((this.b instanceof xcu) && obj != null) {
                        String simpleName = obj.getClass().getSimpleName();
                        String name = ((xcu) this.b).a.getName();
                        StringBuilder stringBuilder = new StringBuilder((simpleName.length() + 76) + String.valueOf(name).length());
                        stringBuilder.append("Potential duplicate subscribers at ");
                        stringBuilder.append(simpleName);
                        stringBuilder.append("#");
                        stringBuilder.append(name);
                        stringBuilder.append(", did you forget to unregister properly?");
                        Log.w("EventBus", stringBuilder.toString());
                    }
                    return false;
                }
            }
            return this.d.get() == xcq.d.get() && this.a.equals(xcq.a) && this.c == xcq.c && this.b == xcq.b;
        }
    }
}
