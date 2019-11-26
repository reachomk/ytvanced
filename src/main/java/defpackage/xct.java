package defpackage;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: xct */
final class xct implements xcm {
    private final Map a = new HashMap(256);
    private final ReadWriteLock b = new ReentrantReadWriteLock();

    xct() {
    }

    public final xcq[] a(Object obj, Class cls, Object obj2) {
        Set readLock = this.b.readLock();
        readLock.lock();
        try {
            int i;
            int i2 = 0;
            if (this.a.containsKey(cls)) {
                readLock = xsb.b(this.a, cls);
            } else {
                this.b.readLock().unlock();
                readLock = cls.getDeclaredMethods();
                this.b.writeLock().lock();
                try {
                    if (this.a.containsKey(cls)) {
                        readLock = xsb.b(this.a, cls);
                    } else {
                        for (Method method : readLock) {
                            if (method.isAnnotationPresent(xcv.class)) {
                                Class[] parameterTypes = method.getParameterTypes();
                                amqw.a(parameterTypes.length == 1, (Object) "Event handler methods can only take a single event argument.");
                                xsb.a(this.a, (Object) cls, new xcw(parameterTypes[0], method));
                            }
                        }
                        readLock = xsb.b(this.a, cls);
                        this.b.writeLock().unlock();
                    }
                } finally {
                    cls = this.b.writeLock();
                    cls.unlock();
                }
            }
            if (readLock.isEmpty()) {
                throw new IllegalArgumentException(String.format("Class %s does not contain any methods annotated with @Subscribe", new Object[]{cls.getName()}));
            }
            xcq[] xcqArr = new xcq[readLock.size()];
            for (xcw xcw : readLock) {
                i = i2 + 1;
                xcqArr[i2] = new xcq(obj, xcw.a, obj2, new xcu(obj, xcw.b));
                i2 = i;
            }
            return xcqArr;
        } finally {
            cls = this.b.readLock();
            cls.unlock();
        }
    }
}
