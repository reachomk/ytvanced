package defpackage;

import android.arch.lifecycle.OnLifecycleEvent;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: q */
final class q {
    public static q a = new q();
    public final Map b = new HashMap();
    private final Map c = new HashMap();

    q() {
    }

    public static Method[] a(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* Access modifiers changed, original: final */
    public final p b(Class cls) {
        p pVar = (p) this.c.get(cls);
        return pVar == null ? a(cls, null) : pVar;
    }

    private static void a(Map map, s sVar, aa aaVar, Class cls) {
        aa aaVar2 = (aa) map.get(sVar);
        if (aaVar2 != null && aaVar != aaVar2) {
            Method method = sVar.b;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Method ");
            stringBuilder.append(method.getName());
            stringBuilder.append(" in ");
            stringBuilder.append(cls.getName());
            stringBuilder.append(" already declared with different @OnLifecycleEvent value: previous value ");
            stringBuilder.append(aaVar2);
            stringBuilder.append(", new value ");
            stringBuilder.append(aaVar);
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (aaVar2 == null) {
            map.put(sVar, aaVar);
        }
    }

    public final p a(Class cls, Method[] methodArr) {
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            p b = b(superclass);
            if (b != null) {
                hashMap.putAll(b.b);
            }
        }
        for (Class b2 : cls.getInterfaces()) {
            for (Entry entry : b(b2).b.entrySet()) {
                q.a(hashMap, (s) entry.getKey(), (aa) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = q.a(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                int i;
                Class[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else if (parameterTypes[0].isAssignableFrom(af.class)) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                }
                aa a = onLifecycleEvent.a();
                if (length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(aa.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    } else if (a == aa.ON_ANY) {
                        i = 2;
                    } else {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                }
                if (length <= 2) {
                    q.a(hashMap, new s(i, method), a, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        p pVar = new p(hashMap);
        this.c.put(cls, pVar);
        this.b.put(cls, Boolean.valueOf(z));
        return pVar;
    }
}
