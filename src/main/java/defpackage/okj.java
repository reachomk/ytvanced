package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: okj */
public final class okj {
    public final int a;
    public final String b;
    public final List c;
    public final byte[] d;

    public okj(int i, String str, List list, byte[] bArr) {
        List emptyList;
        this.a = i;
        this.b = str;
        if (list == null) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = Collections.unmodifiableList(list);
        }
        this.c = emptyList;
        this.d = bArr;
    }
}
