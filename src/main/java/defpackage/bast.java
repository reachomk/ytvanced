package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: bast */
final class bast {
    public static final basv a;

    static {
        basv basv;
        AtomicReference atomicReference = new AtomicReference();
        try {
            basv = (basv) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(basv.class).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (ClassNotFoundException e) {
            atomicReference.set(e);
            basv = new bawk();
        } catch (Exception e2) {
            throw new RuntimeException("Storage override failed to initialize", e2);
        }
        a = basv;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            basr.a.logp(Level.FINE, "io.grpc.Context$LazyStorage", "<clinit>", "Storage override doesn't exist. Using default", th);
        }
    }
}
