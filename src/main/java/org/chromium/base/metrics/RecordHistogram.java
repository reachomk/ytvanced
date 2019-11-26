package org.chromium.base.metrics;

import defpackage.aocf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class RecordHistogram {
    public static Map a = Collections.synchronizedMap(new HashMap());

    public static int a(long j) {
        return j <= 2147483647L ? j >= -2147483648L ? (int) j : aocf.UNSET_ENUM_VALUE : Integer.MAX_VALUE;
    }

    private static native int nativeGetHistogramTotalCountForTesting(String str);

    private static native int nativeGetHistogramValueCountForTesting(String str, int i);

    private static native long nativeRecordBooleanHistogram(String str, long j, boolean z);

    private static native long nativeRecordCustomCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    public static native long nativeRecordCustomTimesHistogramMilliseconds(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordEnumeratedHistogram(String str, long j, int i, int i2);

    private static native long nativeRecordLinearCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordSparseHistogram(String str, long j, int i);

    public static long a(String str) {
        Long l = (Long) a.get(str);
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public static void a(String str, boolean z) {
        long a = a(str);
        long nativeRecordBooleanHistogram = nativeRecordBooleanHistogram(str, a, z);
        if (nativeRecordBooleanHistogram != a) {
            a.put(str, Long.valueOf(nativeRecordBooleanHistogram));
        }
    }
}
