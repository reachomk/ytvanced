package defpackage;

/* renamed from: bcug */
final class bcug extends bcum {
    private final /* synthetic */ bcvk a;
    private final /* synthetic */ bcvk b;

    bcug(bcvk bcvk, bcvk bcvk2) {
        this.a = bcvk;
        this.b = bcvk2;
    }

    public final void a(Throwable th) {
        try {
            this.a.a(th);
        } finally {
            b();
        }
    }

    public final void a(Object obj) {
        try {
            this.b.a(obj);
        } finally {
            b();
        }
    }
}
