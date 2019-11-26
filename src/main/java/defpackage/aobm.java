package defpackage;

/* renamed from: aobm */
public enum aobm {
    DOUBLE(4, 1),
    FLOAT(3, 5),
    INT64(2, 0),
    UINT64(2, 0),
    INT32(1, 0),
    FIXED64(2, 1),
    FIXED32(1, 5),
    BOOL(5, 0),
    STRING(6, 2),
    GROUP(9, 3),
    MESSAGE(9, 2),
    BYTES(7, 2),
    UINT32(1, 0),
    ENUM(8, 0),
    SFIXED32(1, 5),
    SFIXED64(2, 1),
    SINT32(1, 0),
    SINT64(2, 0);
    
    public final int j;
    public final int k;

    private aobm(int i, int i2) {
        this.k = i;
        this.j = i2;
    }
}
