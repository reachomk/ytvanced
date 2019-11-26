package defpackage;

/* renamed from: amnl */
final class amnl extends anhl {
    private amni a;
    private final int f;

    /* Access modifiers changed, original: protected|final */
    public final boolean a(anjv anjv) {
        return super.a(anjv);
    }

    /* Access modifiers changed, original: protected|final */
    public final String ax_() {
        amni amni = this.a;
        String str = null;
        if (amni != null) {
            anij anij = amni.a.a;
            if (anij != null) {
                String valueOf = String.valueOf(anij);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 11);
                stringBuilder.append("callable=[");
                stringBuilder.append(valueOf);
                valueOf = "]";
                stringBuilder.append(valueOf);
                str = stringBuilder.toString();
                amno amno = (amno) this.a.c.get();
                if (amno != null) {
                    str = String.valueOf(str);
                    String valueOf2 = String.valueOf(amno);
                    StringBuilder stringBuilder2 = new StringBuilder((str.length() + 10) + valueOf2.length());
                    stringBuilder2.append(str);
                    stringBuilder2.append(", trial=[");
                    stringBuilder2.append(valueOf2);
                    stringBuilder2.append(valueOf);
                    return stringBuilder2.toString();
                }
            }
        }
        return str;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amni amni = this.a;
        this.a = null;
        if (amni != null) {
            Object obj;
            long j;
            int a;
            int i;
            do {
                j = amni.b.get();
                i = (int) j;
                a = amni.a(j);
                if (i != aocf.UNSET_ENUM_VALUE) {
                    obj = i != -2147483647 ? null : 1;
                    if (obj != null) {
                        a++;
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder(33);
                    stringBuilder.append("Refcount is: ");
                    stringBuilder.append(j);
                    throw new AssertionError(stringBuilder.toString());
                }
            } while (!amni.b.compareAndSet(j, amni.a(a, i - 1)));
            if (obj != null) {
                amno amno;
                do {
                    amno = (amno) amni.c.get();
                    if (amno == null || amno.a > this.f) {
                        break;
                    }
                    amno.cancel(true);
                } while (!amni.c.compareAndSet(amno, null));
            }
        }
    }

    /* synthetic */ amnl(amni amni, int i) {
        this.a = amni;
        this.f = i;
    }
}
