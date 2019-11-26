package defpackage;

/* renamed from: amnz */
final class amnz implements anim {
    private final /* synthetic */ amnv a;
    private final /* synthetic */ anim b;

    amnz(amnv amnv, anim anim) {
        this.a = amnv;
        this.b = anim;
    }

    public final anjv a(Object obj) {
        amnv a = amoc.a(this.a);
        try {
            anjv a2 = this.b.a(obj);
            return a2;
        } finally {
            amoc.a(a);
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 14);
        stringBuilder.append("propagating=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
