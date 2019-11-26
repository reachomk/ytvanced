package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: bbef */
final class bbef extends WeakReference {
    private static final boolean b = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException c;
    public volatile boolean a;
    private final ReferenceQueue d;
    private final ConcurrentMap e;
    private final String f;
    private final Reference g;

    bbef(bbeg bbeg, bauk bauk, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        Object runtimeException;
        super(bbeg, referenceQueue);
        if (b) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = c;
        }
        this.g = new SoftReference(runtimeException);
        this.f = bauk.toString();
        this.d = referenceQueue;
        this.e = concurrentMap;
        this.e.put(this, this);
        bbef.a(referenceQueue);
    }

    public final void clear() {
        a();
        bbef.a(this.d);
    }

    private final void a() {
        super.clear();
        this.e.remove(this);
        this.g.clear();
    }

    private static int a(ReferenceQueue referenceQueue) {
        int i = 0;
        while (true) {
            bbef bbef = (bbef) referenceQueue.poll();
            if (bbef == null) {
                return i;
            }
            RuntimeException runtimeException = (RuntimeException) bbef.g.get();
            bbef.a();
            if (!bbef.a) {
                i++;
                Level level = Level.SEVERE;
                if (bbeg.b.isLoggable(level)) {
                    String property = System.getProperty("line.separator");
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(property).length() + 148);
                    stringBuilder.append("*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*");
                    stringBuilder.append(property);
                    stringBuilder.append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                    LogRecord logRecord = new LogRecord(level, stringBuilder.toString());
                    logRecord.setLoggerName(bbeg.b.getName());
                    logRecord.setParameters(new Object[]{bbef.f});
                    logRecord.setThrown(runtimeException);
                    bbeg.b.log(logRecord);
                }
            }
        }
    }

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        c = runtimeException;
    }
}
