package defpackage;

/* renamed from: bcvv */
public final class bcvv implements bcvs {
    private final /* synthetic */ bcvt a;

    public bcvv(bcvt bcvt) {
        this.a = bcvt;
    }

    public final Object a(Object... objArr) {
        if (objArr.length == 2) {
            return this.a.a(objArr[0], objArr[1]);
        }
        throw new IllegalArgumentException("Func2 expecting 2 arguments.");
    }
}
