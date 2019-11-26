package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: akqc */
public final class akqc {
    private final ReadWriteLock a = new ReentrantReadWriteLock();
    private final Map b = new HashMap();
    private bcaa c;

    private akqc() {
    }

    public final void a(Map map) {
        this.a.readLock().lock();
        try {
            for (Object containsKey : map.keySet()) {
                amqw.b(this.b.containsKey(containsKey) ^ 1);
            }
            this.a.writeLock().lock();
            this.b.putAll(map);
            this.a.writeLock().unlock();
        } finally {
            this.a.readLock().unlock();
        }
    }

    public final void a(bcaa bcaa) {
        this.a.writeLock().lock();
        this.c = bcaa;
        this.a.writeLock().unlock();
    }

    public final akqa a(Object obj) {
        this.a.readLock().lock();
        bcaa bcaa = (bcaa) this.b.get(obj);
        if (bcaa == null) {
            bcaa = this.c;
        }
        this.a.readLock().unlock();
        return bcaa != null ? (akqa) bcaa.get() : null;
    }

    /* synthetic */ akqc(byte b) {
    }
}
