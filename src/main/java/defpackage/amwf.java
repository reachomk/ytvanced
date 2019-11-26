package defpackage;

import java.lang.reflect.Array;

/* renamed from: amwf */
final class amwf {
    static Object[] a(Object[] objArr, int i) {
        return (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
    }
}
