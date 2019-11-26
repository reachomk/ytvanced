package defpackage;

/* renamed from: ren */
public enum ren {
    DOUBLE(0, 1, rfm.DOUBLE),
    FLOAT(1, 1, rfm.FLOAT),
    INT64(2, 1, rfm.LONG),
    UINT64(3, 1, rfm.LONG),
    INT32(4, 1, rfm.INT),
    FIXED64(5, 1, rfm.LONG),
    FIXED32(6, 1, rfm.INT),
    BOOL(7, 1, rfm.BOOLEAN),
    STRING(8, 1, rfm.STRING),
    MESSAGE(9, 1, rfm.MESSAGE),
    BYTES(10, 1, rfm.BYTE_STRING),
    UINT32(11, 1, rfm.INT),
    ENUM(12, 1, rfm.ENUM),
    SFIXED32(13, 1, rfm.INT),
    SFIXED64(14, 1, rfm.LONG),
    SINT32(15, 1, rfm.INT),
    SINT64(16, 1, rfm.LONG),
    GROUP(17, 1, rfm.MESSAGE),
    DOUBLE_LIST(18, 2, rfm.DOUBLE),
    FLOAT_LIST(19, 2, rfm.FLOAT),
    INT64_LIST(20, 2, rfm.LONG),
    UINT64_LIST(21, 2, rfm.LONG),
    INT32_LIST(22, 2, rfm.INT),
    FIXED64_LIST(23, 2, rfm.LONG),
    FIXED32_LIST(24, 2, rfm.INT),
    BOOL_LIST(25, 2, rfm.BOOLEAN),
    STRING_LIST(26, 2, rfm.STRING),
    MESSAGE_LIST(27, 2, rfm.MESSAGE),
    BYTES_LIST(28, 2, rfm.BYTE_STRING),
    UINT32_LIST(29, 2, rfm.INT),
    ENUM_LIST(30, 2, rfm.ENUM),
    SFIXED32_LIST(31, 2, rfm.INT),
    SFIXED64_LIST(32, 2, rfm.LONG),
    SINT32_LIST(33, 2, rfm.INT),
    SINT64_LIST(34, 2, rfm.LONG),
    DOUBLE_LIST_PACKED(35, 3, rfm.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, rfm.FLOAT),
    INT64_LIST_PACKED(37, 3, rfm.LONG),
    UINT64_LIST_PACKED(38, 3, rfm.LONG),
    INT32_LIST_PACKED(39, 3, rfm.INT),
    FIXED64_LIST_PACKED(40, 3, rfm.LONG),
    FIXED32_LIST_PACKED(41, 3, rfm.INT),
    BOOL_LIST_PACKED(42, 3, rfm.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, rfm.INT),
    ENUM_LIST_PACKED(44, 3, rfm.ENUM),
    SFIXED32_LIST_PACKED(45, 3, rfm.INT),
    SFIXED64_LIST_PACKED(46, 3, rfm.LONG),
    SINT32_LIST_PACKED(47, 3, rfm.INT),
    SINT64_LIST_PACKED(48, 3, rfm.LONG),
    GROUP_LIST(49, 2, rfm.MESSAGE),
    MAP(50, 4, rfm.VOID);
    
    private static final ren[] aa = null;
    public final int k;

    static {
        ren[] values = ren.values();
        int length = values.length;
        aa = new ren[length];
        int i;
        while (i < length) {
            ren ren = values[i];
            aa[ren.k] = ren;
            i++;
        }
    }

    private ren(int i, int i2, rfm rfm) {
        this.k = i;
        int i3 = req.a[i2 - 1];
        if (i3 == 1 || i3 == 2) {
            Class cls = rfm.k;
        }
        if (i2 == 1) {
            rfm.ordinal();
        }
    }
}
