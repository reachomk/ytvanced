package defpackage;

/* renamed from: rfm */
public enum rfm {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(rdg.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);
    
    public final Class k;

    private rfm(Class cls) {
        this.k = cls;
    }
}
