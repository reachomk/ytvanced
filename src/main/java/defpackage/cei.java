package defpackage;

import java.nio.ByteBuffer;

/* renamed from: cei */
public final class cei implements ceh {
    public final bvw a(bvw bvw, bsq bsq) {
        byte[] array;
        ByteBuffer b = ((cdr) bvw.b()).b();
        chj chj = null;
        if (!b.isReadOnly() && b.hasArray()) {
            chj = new chj(b.array(), b.arrayOffset(), b.limit());
        }
        if (chj != null && chj.a == 0 && chj.b == chj.c.length) {
            array = b.array();
        } else {
            b = b.asReadOnlyBuffer();
            byte[] bArr = new byte[b.limit()];
            b.position(0);
            b.get(bArr);
            array = bArr;
        }
        return new cdg(array);
    }
}
