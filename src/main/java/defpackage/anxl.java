package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anxl */
public abstract class anxl extends anvf {
    public static Map defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public aoau unknownFields = aoau.a;

    public abstract Object dynamicMethod(anxu anxu, Object obj, Object obj2);

    public final anzq getParserForType() {
        return (anzq) dynamicMethod(anxu.GET_PARSER);
    }

    public final anxl getDefaultInstanceForType() {
        return (anxl) dynamicMethod(anxu.GET_DEFAULT_INSTANCE);
    }

    public final anxo newBuilderForType() {
        return (anxo) dynamicMethod(anxu.NEW_BUILDER);
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("# ");
        stringBuilder.append(obj);
        anzi.a(this, stringBuilder, 0);
        return stringBuilder.toString();
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        i = anzs.a.a((Object) this).a(this);
        this.memoizedHashCode = i;
        return i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((anxl) getDefaultInstanceForType()).getClass().isInstance(obj)) {
            return anzs.a.a((Object) this).a((Object) this, (anxl) obj);
        }
        return false;
    }

    /* Access modifiers changed, original: protected */
    public void makeImmutable() {
        anzs.a.a((Object) this).c(this);
    }

    public final anxo createBuilder() {
        return (anxo) dynamicMethod(anxu.NEW_BUILDER);
    }

    public final anxo createBuilder(anxl anxl) {
        return createBuilder().mergeFrom(anxl);
    }

    public final boolean isInitialized() {
        return anxl.isInitialized(this, Boolean.TRUE.booleanValue());
    }

    public final anxo toBuilder() {
        anxo anxo = (anxo) dynamicMethod(anxu.NEW_BUILDER);
        anxo.mergeFrom(this);
        return anxo;
    }

    /* Access modifiers changed, original: protected */
    public Object dynamicMethod(anxu anxu, Object obj) {
        return dynamicMethod(anxu, obj, null);
    }

    /* Access modifiers changed, original: protected */
    public Object dynamicMethod(anxu anxu) {
        return dynamicMethod(anxu, null, null);
    }

    /* Access modifiers changed, original: 0000 */
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    /* Access modifiers changed, original: 0000 */
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public void writeTo(anwm anwm) {
        anzz a = anzs.a.a((Object) this);
        aobl aobl = anwm.f;
        if (aobl == null) {
            aobl = new anwu(anwm);
        }
        a.a((Object) this, aobl);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        i = anzs.a.a((Object) this).b(this);
        this.memoizedSerializedSize = i;
        return i;
    }

    /* Access modifiers changed, original: 0000 */
    public Object buildMessageInfo() {
        return dynamicMethod(anxu.BUILD_MESSAGE_INFO);
    }

    static anxl getDefaultInstance(Class cls) {
        anxl anxl = (anxl) defaultInstanceMap.get(cls);
        if (anxl == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                anxl = (anxl) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (anxl == null) {
            anxl = (anxl) ((anxl) aoax.a(cls)).getDefaultInstanceForType();
            if (anxl != null) {
                defaultInstanceMap.put(cls, anxl);
            } else {
                throw new IllegalStateException();
            }
        }
        return anxl;
    }

    public static void registerDefaultInstance(Class cls, anxl anxl) {
        defaultInstanceMap.put(cls, anxl);
    }

    public static Object newMessageInfo(anze anze, String str, Object[] objArr) {
        return new anzu(anze, str, objArr);
    }

    public static anxr newSingularGeneratedExtension(anze anze, Object obj, anze anze2, anxy anxy, int i, aobm aobm, Class cls) {
        return new anxr(anze, obj, anze2, new anxs(anxy, i, aobm));
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    private static anxr checkIsLite(anwy anwy) {
        return (anxr) anwy;
    }

    protected static final boolean isInitialized(anxl anxl, boolean z) {
        byte byteValue = ((Byte) anxl.dynamicMethod(anxu.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == (byte) 1) {
            return true;
        }
        if (byteValue == (byte) 0) {
            return false;
        }
        boolean d = anzs.a.a((Object) anxl).d(anxl);
        if (z) {
            anxl.dynamicMethod(anxu.SET_MEMOIZED_IS_INITIALIZED, !d ? null : anxl);
        }
        return d;
    }

    public static anxz emptyIntList() {
        return anxt.b;
    }

    public static anxz mutableCopy(anxz anxz) {
        int size = anxz.size();
        return anxz.b(size != 0 ? size + size : 10);
    }

    public static anye emptyLongList() {
        return anys.b;
    }

    public static anye mutableCopy(anye anye) {
        int size = anye.size();
        return anye.c(size != 0 ? size + size : 10);
    }

    public static anya emptyFloatList() {
        return anxk.b;
    }

    public static anya mutableCopy(anya anya) {
        int size = anya.size();
        return anya.b(size != 0 ? size + size : 10);
    }

    public static anyd emptyProtobufList() {
        return anzr.b;
    }

    public static anyd mutableCopy(anyd anyd) {
        int size = anyd.size();
        return anyd.a(size != 0 ? size + size : 10);
    }

    static anxl parsePartialFrom(anxl anxl, anwf anwf, anxa anxa) {
        Object obj = (anxl) anxl.dynamicMethod(anxu.NEW_MUTABLE_INSTANCE);
        try {
            anzz a = anzs.a.a(obj);
            a.a(obj, anwj.a(anwf), anxa);
            a.c(obj);
            return obj;
        } catch (IOException e) {
            if (e.getCause() instanceof anyg) {
                throw ((anyg) e.getCause());
            }
            throw new anyg(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof anyg) {
                throw ((anyg) e2.getCause());
            }
            throw e2;
        }
    }

    static anxl parsePartialFrom(anxl anxl, byte[] bArr, int i, int i2, anxa anxa) {
        Object obj = (anxl) anxl.dynamicMethod(anxu.NEW_MUTABLE_INSTANCE);
        try {
            anzz a = anzs.a.a(obj);
            a.a(obj, bArr, i, i + i2, new anvo(anxa));
            a.c(obj);
            if (obj.memoizedHashCode == 0) {
                return obj;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof anyg) {
                throw ((anyg) e.getCause());
            }
            throw new anyg(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw anyg.a();
        }
    }

    private static anxl checkMessageInitialized(anxl anxl) {
        if (anxl == null || anxl.isInitialized()) {
            return anxl;
        }
        throw anxl.newUninitializedMessageException().a();
    }

    public static anxl parseFrom(anxl anxl, anvu anvu) {
        return anxl.checkMessageInitialized(anxl.parseFrom(anxl, anvu, anxa.b()));
    }

    public static anxl parseFrom(anxl anxl, anvu anvu, anxa anxa) {
        return anxl.checkMessageInitialized(anxl.parsePartialFrom(anxl, anvu, anxa));
    }

    private static anxl parsePartialFrom(anxl anxl, anvu anvu, anxa anxa) {
        try {
            anwf g = anvu.g();
            anxl = anxl.parsePartialFrom(anxl, g, anxa);
            g.a(0);
            return anxl;
        } catch (anyg e) {
            throw e;
        } catch (anyg e2) {
            throw e2;
        }
    }

    public static anxl parseFrom(anxl anxl, byte[] bArr) {
        return anxl.checkMessageInitialized(anxl.parsePartialFrom(anxl, bArr, 0, bArr.length, anxa.b()));
    }

    public static anxl parseFrom(anxl anxl, byte[] bArr, anxa anxa) {
        return anxl.checkMessageInitialized(anxl.parsePartialFrom(anxl, bArr, 0, bArr.length, anxa));
    }

    public static anxl parseFrom(anxl anxl, InputStream inputStream) {
        return anxl.checkMessageInitialized(anxl.parsePartialFrom(anxl, anwf.a(inputStream), anxa.b()));
    }
}
