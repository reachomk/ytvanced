package defpackage;

/* renamed from: anxi */
public enum anxi {
    DOUBLE(0, anxh.SCALAR, anyi.DOUBLE),
    FLOAT(1, anxh.SCALAR, anyi.FLOAT),
    INT64(2, anxh.SCALAR, anyi.LONG),
    UINT64(3, anxh.SCALAR, anyi.LONG),
    INT32(4, anxh.SCALAR, anyi.INT),
    FIXED64(5, anxh.SCALAR, anyi.LONG),
    FIXED32(6, anxh.SCALAR, anyi.INT),
    BOOL(7, anxh.SCALAR, anyi.BOOLEAN),
    STRING(8, anxh.SCALAR, anyi.STRING),
    MESSAGE(9, anxh.SCALAR, anyi.MESSAGE),
    BYTES(10, anxh.SCALAR, anyi.BYTE_STRING),
    UINT32(11, anxh.SCALAR, anyi.INT),
    ENUM(12, anxh.SCALAR, anyi.ENUM),
    SFIXED32(13, anxh.SCALAR, anyi.INT),
    SFIXED64(14, anxh.SCALAR, anyi.LONG),
    SINT32(15, anxh.SCALAR, anyi.INT),
    SINT64(16, anxh.SCALAR, anyi.LONG),
    GROUP(17, anxh.SCALAR, anyi.MESSAGE),
    DOUBLE_LIST(18, anxh.VECTOR, anyi.DOUBLE),
    FLOAT_LIST(19, anxh.VECTOR, anyi.FLOAT),
    INT64_LIST(20, anxh.VECTOR, anyi.LONG),
    UINT64_LIST(21, anxh.VECTOR, anyi.LONG),
    INT32_LIST(22, anxh.VECTOR, anyi.INT),
    FIXED64_LIST(23, anxh.VECTOR, anyi.LONG),
    FIXED32_LIST(24, anxh.VECTOR, anyi.INT),
    BOOL_LIST(25, anxh.VECTOR, anyi.BOOLEAN),
    STRING_LIST(26, anxh.VECTOR, anyi.STRING),
    MESSAGE_LIST(27, anxh.VECTOR, anyi.MESSAGE),
    BYTES_LIST(28, anxh.VECTOR, anyi.BYTE_STRING),
    UINT32_LIST(29, anxh.VECTOR, anyi.INT),
    ENUM_LIST(30, anxh.VECTOR, anyi.ENUM),
    SFIXED32_LIST(31, anxh.VECTOR, anyi.INT),
    SFIXED64_LIST(32, anxh.VECTOR, anyi.LONG),
    SINT32_LIST(33, anxh.VECTOR, anyi.INT),
    SINT64_LIST(34, anxh.VECTOR, anyi.LONG),
    DOUBLE_LIST_PACKED(35, anxh.PACKED_VECTOR, anyi.DOUBLE),
    FLOAT_LIST_PACKED(36, anxh.PACKED_VECTOR, anyi.FLOAT),
    INT64_LIST_PACKED(37, anxh.PACKED_VECTOR, anyi.LONG),
    UINT64_LIST_PACKED(38, anxh.PACKED_VECTOR, anyi.LONG),
    INT32_LIST_PACKED(39, anxh.PACKED_VECTOR, anyi.INT),
    FIXED64_LIST_PACKED(40, anxh.PACKED_VECTOR, anyi.LONG),
    FIXED32_LIST_PACKED(41, anxh.PACKED_VECTOR, anyi.INT),
    BOOL_LIST_PACKED(42, anxh.PACKED_VECTOR, anyi.BOOLEAN),
    UINT32_LIST_PACKED(43, anxh.PACKED_VECTOR, anyi.INT),
    ENUM_LIST_PACKED(44, anxh.PACKED_VECTOR, anyi.ENUM),
    SFIXED32_LIST_PACKED(45, anxh.PACKED_VECTOR, anyi.INT),
    SFIXED64_LIST_PACKED(46, anxh.PACKED_VECTOR, anyi.LONG),
    SINT32_LIST_PACKED(47, anxh.PACKED_VECTOR, anyi.INT),
    SINT64_LIST_PACKED(48, anxh.PACKED_VECTOR, anyi.LONG),
    GROUP_LIST(49, anxh.VECTOR, anyi.MESSAGE),
    MAP(50, anxh.MAP, anyi.VOID);
    
    private static final anxi[] ab = null;
    public final int d;
    public final anxh e;

    private anxi(int i, anxh anxh, anyi anyi) {
        this.d = i;
        this.e = anxh;
        int ordinal = anxh.ordinal();
        if (ordinal == 1 || ordinal == 3) {
            Class cls = anyi.k;
        }
        if (anxh == anxh.SCALAR) {
            anyi.ordinal();
        }
    }

    static {
        anxi[] values = anxi.values();
        int length = values.length;
        ab = new anxi[length];
        int i;
        while (i < length) {
            anxi anxi = values[i];
            ab[anxi.d] = anxi;
            i++;
        }
    }
}
