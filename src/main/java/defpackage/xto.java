package defpackage;

import android.os.Looper;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: xto */
public abstract class xto implements amro, bcaa {
    private static final Object a = new Object();
    private static final Map b = new HashMap();
    private final xvl c;
    private String d;
    private final String e;
    private volatile Object f;

    public xto(String str) {
        this(null, xvd.a(str), xvj.a);
    }

    public abstract Object a();

    @Deprecated
    public xto() {
        this(null, null, xvj.a);
    }

    public xto(Executor executor, String str) {
        this((Executor) amqw.a((Object) executor), xvd.a(str), xvj.a);
    }

    private xto(Executor executor, String str, xvl xvl) {
        this.f = a;
        this.e = str;
        this.c = (xvl) amqw.a((Object) xvl);
        if (executor != null) {
            a(executor);
        }
    }

    public final void a(Executor executor) {
        executor.execute(new xtn(this));
    }

    public final Object get() {
        Object obj = this.f;
        if (obj == a) {
            synchronized (this) {
                obj = this.f;
                if (obj == a) {
                    this.c.a(xto.a("Lazy.create", this));
                    try {
                        obj = a();
                        this.f = obj;
                    } finally {
                        this.c.a();
                    }
                }
            }
        }
        this.c.a(xto.a("Lazy.get", this));
        this.c.a();
        return obj;
    }

    private static String a(xto xto) {
        xto.c.a("Lazy:getGenericTypeName");
        try {
            String str = xto.e;
            if (str == null) {
                Type genericSuperclass = xto.getClass().getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    str = xto.a((ParameterizedType) genericSuperclass);
                    return str;
                } else if (genericSuperclass instanceof Class) {
                    str = ((Class) genericSuperclass).getSimpleName();
                    xto.c.a();
                    return str;
                } else {
                    str = xto.a(genericSuperclass.toString());
                    xto.c.a();
                    return str;
                }
            }
            xto.c.a();
            return str;
        } finally {
            xto.c.a();
        }
    }

    private static String a(ParameterizedType parameterizedType) {
        Object obj = parameterizedType.getActualTypeArguments()[0];
        if (obj instanceof Class) {
            return ((Class) obj).getSimpleName();
        }
        if (obj instanceof ParameterizedType) {
            parameterizedType = (ParameterizedType) obj;
            String a = xto.a(parameterizedType.getRawType().toString());
            String a2 = xto.a(parameterizedType);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 2) + String.valueOf(a2).length());
            stringBuilder.append(a);
            stringBuilder.append("<");
            stringBuilder.append(a2);
            stringBuilder.append(">");
            return stringBuilder.toString();
        } else if (obj instanceof GenericArrayType) {
            return String.valueOf(((GenericArrayType) obj).getGenericComponentType().toString()).concat("[]");
        } else {
            return xto.a(obj.toString());
        }
    }

    private static String a(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }

    private static String b(xto xto) {
        String str = xto.d;
        if (str != null) {
            return str;
        }
        synchronized (xto) {
            str = xto.d;
            if (str != null) {
                return str;
            }
            str = xto.a(xto);
            synchronized (b) {
                Integer num = (Integer) b.get(str);
                int intValue = num != null ? num.intValue() + 1 : 1;
                b.put(str, Integer.valueOf(intValue));
                if (intValue > 1) {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
                    stringBuilder.append(str);
                    stringBuilder.append(intValue);
                    str = stringBuilder.toString();
                }
                xto.d = str;
            }
            return xto.d;
        }
    }

    private static String a(String str, xto xto) {
        String b = xto.b(xto);
        Thread currentThread = Thread.currentThread();
        if (currentThread == Looper.getMainLooper().getThread()) {
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 1) + String.valueOf(b).length());
            stringBuilder.append(str);
            stringBuilder.append(":");
            stringBuilder.append(b);
            return stringBuilder.toString();
        }
        long id = currentThread.getId();
        StringBuilder stringBuilder2 = new StringBuilder((String.valueOf(str).length() + 23) + String.valueOf(b).length());
        stringBuilder2.append(str);
        stringBuilder2.append("[");
        stringBuilder2.append(id);
        stringBuilder2.append("]:");
        stringBuilder2.append(b);
        return stringBuilder2.toString();
    }
}
