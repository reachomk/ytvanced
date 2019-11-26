package defpackage;

import java.util.ArrayDeque;

/* renamed from: aezm */
final class aezm extends ogn {
    private final ArrayDeque A = new ArrayDeque();
    private final aezp z;

    public aezm(aezp aezp) {
        super(1);
        this.z = aezp;
    }

    public final void a(long j, long j2) {
        this.A.clear();
        super.a(j, j2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, long j, long j2) {
        if (i == 26568) {
            this.A.addFirst(new aezo());
        }
        super.a(i, j, j2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b(int i) {
        if (i == 26568) {
            aezo aezo = (aezo) this.A.removeFirst();
            String str = aezo.a;
            if (str != null) {
                String str2 = aezo.b;
                if (str2 != null) {
                    this.z.a(str, str2);
                }
            }
        }
        super.b(i);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, String str) {
        if (i == 17827) {
            ((aezo) this.A.peekFirst()).a = str;
        } else if (i == 17543) {
            ((aezo) this.A.peekFirst()).b = str;
        }
        super.a(i, str);
    }

    public final int a(int i) {
        if (i == 17543 || i == 17827) {
            return 3;
        }
        return (i == 26568 || i == 29555 || i == 307544935) ? 1 : super.a(i);
    }
}
