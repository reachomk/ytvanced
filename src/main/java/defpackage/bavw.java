package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* renamed from: bavw */
public final class bavw {
    public static List a(Class cls, Iterable iterable, ClassLoader classLoader, bavy bavy) {
        if (bavw.a(classLoader)) {
            ArrayList arrayList = new ArrayList();
            for (Class cls2 : iterable) {
                Class cls22;
                try {
                    cls22 = cls22.asSubclass(cls).getConstructor(new Class[0]).newInstance(new Object[0]);
                    arrayList.add(cls22);
                } catch (Throwable th) {
                    ServiceConfigurationError serviceConfigurationError = new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", new Object[]{cls22.getName(), th}), th);
                }
            }
            iterable = arrayList;
        } else {
            iterable = ServiceLoader.load(cls, classLoader);
            if (!iterable.iterator().hasNext()) {
                iterable = ServiceLoader.load(cls);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : r5) {
            if (bavy.b(next)) {
                arrayList2.add(next);
            }
        }
        Collections.sort(arrayList2, Collections.reverseOrder(new bavv(bavy)));
        return Collections.unmodifiableList(arrayList2);
    }

    public static boolean a(ClassLoader classLoader) {
        try {
            Class.forName("android.app.Application", false, classLoader);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
