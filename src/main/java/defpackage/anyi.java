package defpackage;

/* renamed from: anyi */
public enum anyi {
    VOID(Void.class),
    INT(Integer.class),
    LONG(Long.class),
    FLOAT(Float.class),
    DOUBLE(Double.class),
    BOOLEAN(Boolean.class),
    STRING(String.class),
    BYTE_STRING(anvu.class),
    ENUM(Integer.class),
    MESSAGE(Object.class);
    
    public final Class k;

    private anyi(Class cls) {
        this.k = cls;
    }
}
